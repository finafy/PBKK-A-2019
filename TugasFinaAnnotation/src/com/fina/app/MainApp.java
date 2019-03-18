package com.fina.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fina.model.*;

public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.xml");
		
		//Get bean 
		Penyanyi penyanyiw = context.getBean("demi", Penyanyi.class);
		penyanyiw.setNamaPenyanyi("Demi Lovato");
		penyanyiw.setAsal("Amerika");
		penyanyiw.setAgensi("SM Entertainment");
		System.out.println("Singer : ");
		System.out.println(penyanyiw);
		
		System.out.println("Selamat datang di radio One Heart!");
		System.out.println("Mari kita lihat lagu pilihan pendengar hari ini.");
		System.out.println("Judul Lagu : "+ penyanyiw.getLagunya().judulLagu());
		System.out.println("Genre : "+ penyanyiw.getLagunya().genre());
		System.out.println("Tahun Rilis : "+ penyanyiw.getLagunya().tahun());
		System.out.println("Pencipta Lagu : "+ penyanyiw.getLagunya().pencipta());
		
		
		context.close();
	
	}

}
