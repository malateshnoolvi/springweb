package com.xworkz.patient.springconfig;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

public class SpringWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

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
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		java.io.File uploadDirectory = new java.io.File(System.getProperty("java.io.tmpdir"));
		MultipartConfigElement element = new MultipartConfigElement(uploadDirectory.getAbsolutePath(), 999999999l,
				9999999999l, 10);

		registration.setMultipartConfig(element);
	}

}
