package com.fina.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fina.model.*;


public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		//Get bean 
		Penyanyi penyanyi = context.getBean("demi", Penyanyi.class);
		
		
		System.out.println("Selamat datang di radio One Heart!");
		System.out.println("Mari kita lihat lagu pilihan pendengar hari ini.");
		System.out.println("Judul Lagu : "+ penyanyi.getLagunya().judulLagu());
		System.out.println("Genre : "+ penyanyi.getLagunya().genre());
		System.out.println("Tahun Rilis : "+ penyanyi.getLagunya().tahun());
		System.out.println("Pencipta Lagu : "+ penyanyi.getLagunya().pencipta());
		System.out.println("Singer : ");
		System.out.println(penyanyi);
		
		
		context.close();
	
	}

}
