package com.techment.hotelManagement.api.service;

import java.util.List;

import com.techment.hotelManagement.api.entity.Hotel;

public interface IHotelService {
	
	String addHotel(Hotel hotel);
	String updateHotel(Hotel hotel);
	String removeHotel(Hotel hotel);
	List<Hotel> showAllHotels();
	Hotel showHotelById(int id);

}
