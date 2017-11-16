package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestDao extends JpaRepository<User,Integer> {
}
