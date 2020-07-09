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
public class studentcontroller {
	


@RequestMapping("/profile")
public ModelAndView profile(HttpServletRequest req , HttpServletResponse res) throws IOException{
return new ModelAndView("profile");
}
@RequestMapping("/about")
public ModelAndView about(HttpServletRequest req , HttpServletResponse res) throws IOException{
return new ModelAndView("about");
}

@RequestMapping("/kids")
public ModelAndView kids(HttpServletRequest req , HttpServletResponse res) throws IOException{
return new ModelAndView("kids");
}
@RequestMapping("/primary")
public ModelAndView primary(HttpServletRequest req , HttpServletResponse res) throws IOException{
return new ModelAndView("primary");
}
@RequestMapping("/secondary")
public ModelAndView secondary(HttpServletRequest req , HttpServletResponse res) throws IOException{
return new ModelAndView("secondary");
}
@RequestMapping("/highersecondary")
public ModelAndView highersecondary(HttpServletRequest req , HttpServletResponse res) throws IOException{
return new ModelAndView("highersecondary");
}
@RequestMapping("/NEET")
public ModelAndView NEET(HttpServletRequest req , HttpServletResponse res) throws IOException{
return new ModelAndView("NEET");
}
@RequestMapping("/JEE")
public ModelAndView JEE(HttpServletRequest req , HttpServletResponse res) throws IOException{
return new ModelAndView("JEE");
}
@RequestMapping("/competitiveexams")
public ModelAndView competitiveexams(HttpServletRequest req , HttpServletResponse res) throws IOException{
return new ModelAndView("competitiveexams");
}
@RequestMapping("/GRE_IELTS_TOFEL")
public ModelAndView GRE_IELTS_TOFEL(HttpServletRequest req , HttpServletResponse res) throws IOException{
return new ModelAndView("GRE_IELTS_TOFEL");
}


@RequestMapping("/buy")
public ModelAndView buy(HttpServletRequest req , HttpServletResponse res) throws IOException{
return new ModelAndView("buy");
}


}