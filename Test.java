package com.example.EventBooking;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Test 
{
	@Autowired
	private JdbcTemplate jt;
	
	
	@GetMapping("/s1")
	public String showLogin()
	{
		return "login";
	}
	
	@GetMapping("/s2")
	public String showRegistration()
	{
		return "registration";
	}
	
	@GetMapping("/s3")
	public String showBook()
	{
		return "EventType";
	}
	
	@GetMapping("/s4")
	public String showBook1()
	{
		return "EventReq";
	}
	
	
	@GetMapping("/s6")
	public String showContact()
	{
		return "contact";
	}
	
	@GetMapping("/s7")
	public String showFeedback()
	{
		return "feedback";
	}
	/* Middleware to Backend */
	
	@RequestMapping("/reg")
	public String doRegistration(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		String a=req.getParameter("t1");
		String b=req.getParameter("t2");
		String c=req.getParameter("t3");
		String d=req.getParameter("t4");
		String e=req.getParameter("t5");
		String f=req.getParameter("t6");
		
		String sql="insert into registration1 values(?,?,?,?,?,?)";
		jt.update(sql,a,b,c,d,e,f);
		System.out.println("row inserted");
		return "success1";
		
	}
	
	
	@RequestMapping("/feed")
	public String doFeedback(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		String a=req.getParameter("t7");
		String b=req.getParameter("t8");
		String c=req.getParameter("t9");
		
		String sql="insert into feedback values(?,?,?)";
		jt.update(sql,a,b,c);
		System.out.println("row inserted");
		return "success2";
	}
	
	@RequestMapping("/bk")
	public String doBook(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		String a=req.getParameter("t10");
		
		String sql="insert into eventType values(?)";
		jt.update(sql,a);
		System.out.println("row inserted");
		return "success";
	}
	
	@RequestMapping("/bk1")
	public String doBook1(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		String a=req.getParameter("t11");
		String b=req.getParameter("t12");
		String c=req.getParameter("t13");
		String d=req.getParameter("t14");
		String e=req.getParameter("t15");
		String f=req.getParameter("t16");
		String g=req.getParameter("t17");
		String h=req.getParameter("t18");

		
		String sql="insert into EventReq values(?,?,?,?,?,?,?,?)";
		jt.update(sql,a,b,c,d,e,f,g,h);
		System.out.println("row inserted");
		return "success";
	}
}
	/*
	@RequestMapping("/bk2")
	public String doBook2(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		String a=req.getParameter("t19");
		String b=req.getParameter("t20");
		String c=req.getParameter("t21");
		String d=req.getParameter("t22");
		String e=req.getParameter("t23");
		String f=req.getParameter("t24");
		String g=req.getParameter("t25");

		
		String sql="insert into ambulance values(?,?,?,?,?,?,?)";
		jt.update(sql,a,b,c,d,e,f,g);
		System.out.println("row inserted");
		return "success";
	}
	
	
}*/
