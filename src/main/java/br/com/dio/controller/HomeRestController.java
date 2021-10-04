package br.com.dio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dio.entity.User;
import br.com.dio.service.UserService;

@RestController
public class HomeRestController {

	@Autowired
	private UserService service;

	@RequestMapping("/rest")
	public User testeRest() {

		return service.buscaUsuarioPorId(1L);
	}

}
