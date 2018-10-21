package com.app.S2S.service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class SendMail {
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendMail(String sub, String msg, String email) throws javax.mail.MessagingException {
		String charset = "ISO-8859-2";
		MimeMessage message = mailSender.createMimeMessage();
		message.setContent(msg, "text/html; charset=\"" + charset + "\"");

		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));

		message.setSubject(sub);
		mailSender.send(message);
		System.err.println("success");
	}

}
