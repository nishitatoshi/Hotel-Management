package com.techment.entity;

import java.sql.Blob;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class RoomDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int room_id;
//	int hotel_id;
	String room_no;
	String room_type;
	double rate_per_day;
	boolean isAvailable;
	Blob photo;
	
//	@ManyToOne(targetEntity = BookingDetails.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "room_id", referencedColumnName = "room_id")
//	private List<BookingDetails> bookingList;
	//nwnenu2eveu
	//wifbeu
	
}
