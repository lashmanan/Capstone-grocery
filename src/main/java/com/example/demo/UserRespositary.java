package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespositary extends JpaRepository<User, Long> {

}
