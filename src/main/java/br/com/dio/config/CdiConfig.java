package br.com.dio.config;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiConfig {

	@Inject
	private CdiTeste cdiTeste;
	
	@PostConstruct
	public void init() {
		cdiTeste.executaTeste();
	}
	
}
