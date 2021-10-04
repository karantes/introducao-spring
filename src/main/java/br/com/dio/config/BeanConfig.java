package br.com.dio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

@Configuration
public class BeanConfig {

//	@Bean
//	public UserRepository userpoRepository() {
//		System.out.println("Iniciando");
//		
//		return new UserRepository();
//	}

	@Bean
	@Scope(value = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
	public BeanTeste beanTeste() {
		return new BeanTeste();
	}

}
