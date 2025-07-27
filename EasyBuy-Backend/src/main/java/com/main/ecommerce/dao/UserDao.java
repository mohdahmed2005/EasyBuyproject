package com.main.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.ecommerce.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
