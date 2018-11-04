/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.S2S.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.app.S2S.beans.LoginDetails;







/**
 *
 * @author pradeep 
 */
public class AuthenticationInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest hsr, HttpServletResponse hsr1, Object o) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet.");
        //System.out.println("Inside PreHandle..!!!"+hsr.getContextPath()+hsr.getRequestURL());
        //hsr.getRequestURL()
        if ( !hsr.getRequestURL().toString().contains("Contact_US") && !hsr.getRequestURL().toString().contains("getContactUsInfo") && !hsr.getRequestURL().toString().contains("About_Us") && !hsr.getRequestURL().toString().contains("Upload_document") && !hsr.getRequestURL().toString().contains("login") && !hsr.getRequestURL().toString().contains("dashbord") && !hsr.getRequestURL().toString().contains("Add-Main-Category") && !hsr.getRequestURL().toString().contains("Add-Sub-Category")&& !hsr.getRequestURL().toString().contains("matchResult") && !hsr.getRequestURL().toString().contains("registration") && !hsr.getRequestURL().toString().contains("downloadAdmitCard")  && !hsr.getRequestURL().toString().contains("saveRegistration")  && !hsr.getRequestURL().toString().contains("download") && !hsr.getRequestURL().toString().contains("check")  && !hsr.getRequestURL().toString().contains("retMatch") && !hsr.getRequestURL().toString().contains("link") && !hsr.getRequestURL().toString().contains("thankYou")   && !hsr.getRequestURL().toString().contains("home")  && !hsr.getRequestURL().toString().contains("openLink") && !hsr.getRequestURL().toString().contains("wwus") && !hsr.getRequestURL().toString().contains("otpCheck")  && !hsr.getRequestURL().toString().contains("createotp")  && !hsr.getRequestURL().toString().contains("recovery")&& !hsr.getRequestURL().toString().contains("registration")  && !hsr.getRequestURL().toString().contains("login") 
                && !hsr.getRequestURL().toString().contains("js") && !hsr.getRequestURL().toString().contains("css")&& !hsr.getRequestURL().toString().contains("img") && !hsr.getRequestURL().toString().contains("admitCards")  && !hsr.getRequestURL().toString().contains("images") && !hsr.getRequestURL().toString().contains("fonts") ) {
            if (hsr.getSession().getAttribute("Obj") == null) {
            	LoginDetails l=(LoginDetails) hsr.getSession().getAttribute("Obj");
                System.out.println("user not found in session... Should Logout"+l);
                hsr.getSession().invalidate();
                hsr1.sendRedirect("./error");
                return false;
            } else {
                System.out.println("user found in session... All OK");
                return true;
            }
        } else if (hsr.getRequestURL().toString().contains("login")) {
            hsr.getSession().setMaxInactiveInterval(50 * 60);
            System.out.println("here in login..!! max inactive set to 5 mins" + hsr.getSession().getMaxInactiveInterval());
            return true;
        } else {
            return true;
        }
    }

    public void postHandle(HttpServletRequest hsr, HttpServletResponse hsr1, Object o, ModelAndView mav) throws Exception {

        // System.out.println("Inside PostHandle..!!!");

        hsr1.setHeader("Cache-Control", "no-cache, no-store, private, must-revalidate, max-age=0");
        hsr1.setHeader("Pragma", "no-cache");
        hsr1.setHeader("Expires", "-1");
    }

    public void afterCompletion(HttpServletRequest hsr, HttpServletResponse hsr1, Object o, Exception excptn) throws Exception {
    }
}
