package com.servlet;

import javax.servlet.ServletContainerInitializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App2 {
	public static void main(String[] args) {
		SpringApplication.run(App2.class, args);
	}
	@Bean
	public ServletRegistrationBean getRegistrationBean(){
		ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
		bean.addInitParameter("secondServlet", "second");
		return bean;
	}
}
