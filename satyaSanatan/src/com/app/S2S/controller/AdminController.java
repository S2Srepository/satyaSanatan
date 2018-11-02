package com.app.S2S.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.S2S.beans.ContactUs;
import com.app.S2S.service.UserDataValue;
import com.app.S2S.beans.LoginDetails;

@Controller
public class AdminController {
	@Autowired
	UserDataValue udv;
	@Autowired
	private HttpSession session;
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String ragistration(HttpServletRequest request) {
		System.out.println("h......");
		return "home";
	}
	@RequestMapping(value = "dashbord", method = RequestMethod.GET)
	public String dashbord(HttpServletRequest request) {
		System.out.println("-----------------------S2S----------------------------------");
		return "AdminDashboard";
	}
	@RequestMapping(value = "Add-Main-Category", method = RequestMethod.GET)
	public String addMainCategory(HttpServletRequest request) {
		System.out.println("-----------------------S2S----------------------------------");
		return "AddCategory";
	}
	@RequestMapping(value = "Add-Sub-Category", method = RequestMethod.GET)
	public String addsubCategory(HttpServletRequest request) {
		System.out.println("-----------------------S2S----------------------------------");
		return "subCategory";
	}
	
	@RequestMapping(value = "Contact_US", method = RequestMethod.GET)
	public String contactUs(HttpServletRequest request) {
		System.out.println("-----------------------S2S----------------------------------");
		return "ContactUs";
	}
	
	@RequestMapping(value = "getContactUsInfo", method = RequestMethod.GET)
	public String getContact(@ModelAttribute("contact") ContactUs contact,HttpServletRequest request) {
		System.out.println(contact.getName());
		udv.saveContact(contact);
		String msg= "thankyou";
		request.setAttribute("msge",msg);
		return "ContactUs";
	}
	@RequestMapping(value = "About_Us", method = RequestMethod.GET)
	public String about(HttpServletRequest request) {
		System.out.println("-----------------------S2S----------------------------------");
		return "about";
	}
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(HttpServletRequest request) {
		System.out.println("-----------------------S2S----------------------------------");
		return "login";
	}
	@RequestMapping(value = "Upload_document", method = RequestMethod.GET)
	public String uploadDoc(HttpServletRequest request) {
		System.out.println("-----------------------S2S----------------------------------");
		return "uploadDoc";
	}
	@RequestMapping(value = "loginPerson", method = RequestMethod.GET)
	public String loginPerson(HttpServletRequest request,@ModelAttribute("login") LoginDetails login) {
		System.out.println("-----------------------S2S----------------------------------");
		List<LoginDetails>auth=udv.loginId(login);
		return "dashboard";
	}
}
