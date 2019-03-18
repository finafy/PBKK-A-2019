package com.fina.app;
import com.fina.model.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:file.properties")
public class AppConfig {

	
	@Bean
	public Lagu laguSC() {
		return new StoneCold();
	}
	
	@Bean
	public Penyanyi demi(Lagu lagunya) {
		Penyanyi demi = new Penyanyi(laguSC());
		return demi;
	}
	
}
