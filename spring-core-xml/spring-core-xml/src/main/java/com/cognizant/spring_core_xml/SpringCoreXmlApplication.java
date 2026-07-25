package com.cognizant.spring_core_xml;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreXmlApplication {

	public static void main(final String[] args) throws Exception {

		final ApplicationContext context = new ClassPathXmlApplicationContext(
				"date-format.xml");

		final SimpleDateFormat format = context.getBean(
				"dateFormat",
				SimpleDateFormat.class);

		final Date date = format.parse("31/12/2018");

		System.out.println("Parsed Date: " + date);
	}
}