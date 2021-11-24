package com.isra.users;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.isra.users.entities.Role;
import com.isra.users.entities.User;
import com.isra.users.service.UserService;

@SpringBootApplication
public class UsersMicroserviceApplication {
	
    @Autowired
	UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(UsersMicroserviceApplication.class, args);
	}

	//@PostConstruct
	//void init_users() {
		
	//ajouter les rôles
	//userService.addRole(new Role(null,"ADMIN"));
//	userService.addRole(new Role(null,"USER"));
	
	//ajouter les users
	//userService.saveUser(new User(null,"admin","123",true,null));
//	userService.saveUser(new User(null,"nadhem","123",true,null));
	//userService.saveUser(new User(null,"isra","123456",true,null));
	
	
	//ajouter les rôles aux users
//	userService.addRoleToUser("admin", "ADMIN");
	//userService.addRoleToUser("admin", "USER");
//	userService.addRoleToUser("nadhem", "USER");
//	userService.addRoleToUser("isra", "USER");
	//}
	
	@Bean
	BCryptPasswordEncoder getBCE() {
	return new BCryptPasswordEncoder();
	}

	
}
