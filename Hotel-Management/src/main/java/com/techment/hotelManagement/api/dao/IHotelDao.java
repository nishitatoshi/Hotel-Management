package com.techment.hotelManagement.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.hotelManagement.api.entity.Hotel;

public interface IHotelDao extends JpaRepository<Hotel, Integer> {

}
