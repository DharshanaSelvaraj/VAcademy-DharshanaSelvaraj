package com.lgn.controller;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import sql.*;
import javax.servlet.http.*;

//import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
@RequestMapping("/")
public ModelAndView enter() {
return new ModelAndView("Welcome");
}
@RequestMapping("/Login_or_Register")
public ModelAndView Login_or_Register(HttpServletRequest req , HttpServletResponse res) throws IOException{
return new ModelAndView("Login_or_Register");
}
@RequestMapping("/login")
public ModelAndView login(HttpServletRequest req , HttpServletResponse res) throws IOException{
return new ModelAndView("login");
}
   @RequestMapping("/Register")
   public ModelAndView Register() {
   return new ModelAndView("Register");
   }
  
   @RequestMapping("/check")
   public ModelAndView check(HttpServletRequest req, HttpServletResponse res) {
   try{
      String username =req.getParameter("username");  
      String password = req.getParameter("password");
      Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
      Connection conn=DriverManager.getConnection(  
       "jdbc:mysql://localhost:3306/login","root","Mughan11@");
     
      PreparedStatement pst = conn.prepareStatement("Select username,password from login.login_det");
      ResultSet rs = pst.executeQuery();
      while(rs.next()){
       if (rs.getString("username").equals(username)){
    	   return new ModelAndView("alertOfExisting");       }
       }
      pst = conn.prepareStatement("INSERT INTO login.login_det (username,password)VALUES (?,?)");
      pst.setString(1, username);
      pst.setString(2, password);
      int n=pst.executeUpdate();      
      
   }
      catch (Exception e) {
System.out.print(e);

}
   return new ModelAndView("Login_or_Register");
   }
@RequestMapping(value="/validate")
public ModelAndView test(HttpServletRequest req , HttpServletResponse res) throws IOException{
try{
      String username = req.getParameter("username");  
      String password = req.getParameter("password");
      Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
      Connection conn=DriverManager.getConnection(  
       "jdbc:mysql://localhost:3306/login","root","Mughan11@");      
      PreparedStatement pst = conn.prepareStatement("Select username,password from login.login_det where username=? and password=?");
      pst.setString(1, username);
      pst.setString(2, password);
      ResultSet rs = pst.executeQuery();    
     
      if(rs.next()) {
       return new ModelAndView("Home");
      }
     
      else {
          return new ModelAndView("IncorrectAlert");
         
      }
 }
 catch(Exception e){      
 System.out.print(e);;
 return new ModelAndView("IncorrectAlert");
 }      

}


}
