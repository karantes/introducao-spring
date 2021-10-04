package br.com.dio.config;

import javax.inject.Named;

@Named
public class CdiTeste {
	
	public void executaTeste() {
		System.out.println("Executando metodo via CDI");
	}

}
