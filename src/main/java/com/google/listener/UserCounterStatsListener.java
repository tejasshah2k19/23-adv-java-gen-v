package com.google.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class UserCounterStatsListener implements HttpSessionListener {
	public static int userCounter;

	public void sessionCreated(HttpSessionEvent arg0) {
		userCounter++;
		System.out.println("total users(+) " + userCounter);
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		userCounter--;
		System.out.println("total users(-) " + userCounter);

	}
}
