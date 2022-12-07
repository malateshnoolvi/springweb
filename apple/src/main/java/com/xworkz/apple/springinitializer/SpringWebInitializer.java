package com.xworkz.apple.springinitializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.apple.springconfig.SpringConfig;

public class SpringWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	public SpringWebInitializer() {
		System.out.println("created default constructor of SpringWebInitializer");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("created getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("created getServletConfigClasses");
		return new Class[] { SpringConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("created getServletMappings");
		return null;
	}

}
