package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailerService {

	@Autowired
	JavaMailSender javaMailSender;

	public void sendWelcomeMail(String email) {

		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(email);
		msg.setSubject("Welcome to alibaba");
		msg.setText("Welcome to abc.com , we are happy to serve you");
		msg.setFrom("care@alibaba.com");

		javaMailSender.send(msg);
	}
}
