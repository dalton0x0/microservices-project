package com.trotti.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trotti.demo.models.Notification;


@RestController
public class NotificationController {
	@PostMapping ("notifications")
	public Notification sendNotification (@RequestBody Notification notification) {
		
		System.out.println("notification recu " + notification.getMessage());
		notification.setStatus("sent");
		
		return notification;
		
		
	}
}
