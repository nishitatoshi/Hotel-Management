package com.techment.hotelManagement.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.hotelManagement.api.entity.Hotel;
import com.techment.hotelManagement.api.service.IHotelService;

@RestController
@RequestMapping(value="hotelController")
public class HotelController {

	
	@Autowired
	IHotelService hotelService;
	

	@PostMapping(value="/addHotel")
	public ResponseEntity<String> addHotelDetails(@PathVariable Hotel hotel){
		hotelService.addHotel(hotel);
		return new ResponseEntity<String>("Hotels are added", HttpStatus.OK);
	}
	
	@PutMapping(value = "/updateHotel")
	public ResponseEntity<String> updateHotelDetails(@RequestBody Hotel hotel)
	{
		//String hotelDetail = hotelService.updateHotel(hotel);
	    hotelService.addHotel(hotel);
	
		
		return new ResponseEntity<String>("Hotel Details Updated...",HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(value = "/removeHotel")
	public ResponseEntity<String> removeHotels(@PathVariable Hotel hotel)
	{
		hotelService.removeHotel(hotel);
		return new ResponseEntity<String>("Hotel Deleted",HttpStatus.ACCEPTED);
	}
	
	@GetMapping(value = "/showAllHotels")
	public ResponseEntity<List<Hotel>> viewAllHotel(){
		return new ResponseEntity<List<Hotel>>(hotelService.showAllHotels(), HttpStatus.ACCEPTED);
		
	}
	
	

	@GetMapping(value = "/showHotelById/{id}")
	public Hotel showHotel(@PathVariable int id)
	{
		return hotelService.showHotelById(id);
	}
}
