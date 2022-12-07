package com.xworkz.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.springconfiguration.SpringConfig;

public class springWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	public springWebInitializer() {
		System.out.println("crated default constructor of springwebinitializer.......");
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
