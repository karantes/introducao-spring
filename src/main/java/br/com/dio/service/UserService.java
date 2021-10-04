package br.com.dio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dio.entity.User;
import br.com.dio.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;
	
	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		// executa outra regra
		/**
		 * sfbalsdfh
		 */
		this.userRepository = userRepository;
	}

	public List<String> buscaDadosBanco() {
		List<String> nomes = new ArrayList<>();
		System.out.println("Chamou o metodo de busca");
		
		return nomes;
	}

	public void deletaDados() {
//		List<Integer> ids = buscaIdsParaDelete();
		System.out.println("Chamou o delete");
		userRepository.deleteById(1L);
	}

	public User buscaUsuarioPorId(long id) {
		User user = new User();
		user.setNome("Kaique");
		
		userRepository.save(user);
		
		return userRepository.findById(id).get();
	}

}
