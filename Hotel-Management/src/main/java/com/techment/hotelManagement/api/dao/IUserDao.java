package com.techment.hotelManagement.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.hotelManagement.api.entity.User;

public interface IUserDao extends JpaRepository<User, Integer> {

}
