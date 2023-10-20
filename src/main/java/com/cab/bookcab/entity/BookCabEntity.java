package com.cab.bookcab.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bookings")
public class BookCabEntity {
	@Id
	int id;
	String name;
	long phone;
	String pickup;
	String destination;
	double fare;
	String paymentmode;
	/**
	 * 
	 */
	public BookCabEntity() {
		super();
	}
	/**
	 * @param id
	 * @param name
	 * @param phone
	 * @param pickup
	 * @param destination
	 * @param fare
	 * @param paymentmode
	 */
	public BookCabEntity(int id, String name, long phone, String pickup, String destination, double fare,
			String paymentmode) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.pickup = pickup;
		this.destination = destination;
		this.fare = fare;
		this.paymentmode = paymentmode;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phone
	 */
	public long getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}
	/**
	 * @return the pickup
	 */
	public String getPickup() {
		return pickup;
	}
	/**
	 * @param pickup the pickup to set
	 */
	public void setPickup(String pickup) {
		this.pickup = pickup;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/**
	 * @return the fare
	 */
	public double getFare() {
		return fare;
	}
	/**
	 * @param fare the fare to set
	 */
	public void setFare(double fare) {
		this.fare = fare;
	}
	/**
	 * @return the paymentmode
	 */
	public String getPaymentmode() {
		return paymentmode;
	}
	/**
	 * @param paymentmode the paymentmode to set
	 */
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	@Override
	public String toString() {
		return "BookCabEntity [id=" + id + ", name=" + name + ", phone=" + phone + ", pickup=" + pickup
				+ ", destination=" + destination + ", fare=" + fare + ", paymentmode=" + paymentmode + "]";
	}
	
	
}
