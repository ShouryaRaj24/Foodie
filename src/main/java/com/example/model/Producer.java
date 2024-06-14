package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producer {

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long sid;

	    @Column(name = "restaurant_name", length = 50)
	    private String restaurantName;

	    @Column(name = "restaurant_email", length = 50)
	    private String restaurantEmail;

	    @Column(length = 50)
	    private String food;

	    private Integer quantity;

	    @Column(length = 50)
	    private String contact;

	    @Column(length = 50)
	    private String address;

	    @Column(name = "shelf_life")
	    private Integer shelfLife;

		public Long getSid() {
			return sid;
		}

		public void setSid(Long sid) {
			this.sid = sid;
		}

		public String getRestaurantName() {
			return restaurantName;
		}

		public void setRestaurantName(String restaurantName) {
			this.restaurantName = restaurantName;
		}

		public String getRestaurantEmail() {
			return restaurantEmail;
		}

		public void setRestaurantEmail(String restaurantEmail) {
			this.restaurantEmail = restaurantEmail;
		}

		public String getFood() {
			return food;
		}

		public void setFood(String food) {
			this.food = food;
		}

		public Integer getQuantity() {
			return quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public String getContact() {
			return contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Integer getShelfLife() {
			return shelfLife;
		}

		public void setShelfLife(Integer shelfLife) {
			this.shelfLife = shelfLife;
		}

		@Override
		public String toString() {
			return "Producer [sid=" + sid + ", restaurantName=" + restaurantName + ", restaurantEmail="
					+ restaurantEmail + ", food=" + food + ", quantity=" + quantity + ", contact=" + contact
					+ ", address=" + address + ", shelfLife=" + shelfLife + "]";
		}

	    
}
