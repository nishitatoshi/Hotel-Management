package com.techment.hotelManagement.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.hotelManagement.api.dao.IHotelDao;
import com.techment.hotelManagement.api.entity.Hotel;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	IHotelDao hotelDao;
	
	
	@Override
	public String addHotel(Hotel hotel) {
		hotelDao.save(hotel);
		return "Hotel Details are added..";
	}


	@Override
	public String updateHotel(Hotel hotel) {
		hotelDao.save(hotel);
		return "Hotel details updated";
		
	}


	@Override
	public String removeHotel(Hotel hotel) {
		hotelDao.delete(hotel);
		return "Hotel removed";
	}


	@Override
	public List<Hotel> showAllHotels() {
		return hotelDao.findAll();
	}


	@Override
	public Hotel showHotelById(int id) {
		return hotelDao.findById(id).get();
	}

}
