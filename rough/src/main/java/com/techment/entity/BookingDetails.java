package com.techment.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class BookingDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int booking_id;
//	int hotel_id;
//	int room_id;
//	int user_id;
	Date booked_from;
	Date booked_to;
	int no_of_adults;
	int no_of_children;
	double amount;
	
	@OneToMany(targetEntity = RoomDetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "booking_id", referencedColumnName = "booking_id")
	private List<RoomDetails> roomList;
	
}
