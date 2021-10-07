package com.techment.hotelManagement.api.entity;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * This is the Payment POJO class
 * Contains data-members
 */


@Entity
@Table(name = "Payments")
public class Payments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int payment_id;
	int booking_id;
	int transaction_id;
	
	
	/**
	 * Default Constructor
	 * */
	
	public Payments() {
		super();
	}

	/*
	 * Parameterized Constructor
	 * 
	 * **/

	public Payments(int payment_id, int booking_id, int transaction_id) {
		super();
		this.payment_id = payment_id;
		this.booking_id = booking_id;
		this.transaction_id = transaction_id;
	}

	/***
	 * 
	 *Getter and setters 
	 */
	

	public int getPayment_id() {
		return payment_id;
	}


	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}


	public int getBooking_id() {
		return booking_id;
	}


	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}


	public int getTransaction_id() {
		return transaction_id;
	}


	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	
	/**
	 * toString methods
	 */

	@Override
	public String toString() {
		return "Payments [payment_id=" + payment_id + ", booking_id=" + booking_id + ", transaction_id="
				+ transaction_id + "]";
	}
	
	
	@OneToOne(mappedBy = "transaction_id")
	private Transactions transactions;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="booking_id")
	private BookingDetails bookingDetails;
	
}
