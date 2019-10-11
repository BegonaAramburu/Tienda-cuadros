package com.example.TiendCuadros.Domains;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Shop {
	
	@Id
	private String id;
	private String shopName;
	private int capacity;
	
	public Shop() {}
	
	public Shop(String id, String shopName, int capacity) {
		super();
		this.id = id;
		this.shopName = shopName;
		this.capacity = capacity;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
