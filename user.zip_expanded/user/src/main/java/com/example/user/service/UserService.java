package com.example.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.repository.UserRepository;
import com.example.user.domain.User;

@Service
public class UserService {

	@Autowired
    private UserRepository repo;
	
	public List<User> listAll() {
        return repo.findAll();
    }
     
    public void save(User std) {
        repo.save(std);
    }
     
    public User get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
}
