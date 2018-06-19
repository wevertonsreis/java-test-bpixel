package br.com.javatestbpixel.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.javatestbpixel.entity.User;
import br.com.javatestbpixel.repository.UserRepository;

@RestController("/api/user")
public class UserResource {

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
}
