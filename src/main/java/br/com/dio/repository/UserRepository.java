package br.com.dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dio.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//	public void deleteDados() {
//		System.out.println("Apagando dados");
//	}

}
