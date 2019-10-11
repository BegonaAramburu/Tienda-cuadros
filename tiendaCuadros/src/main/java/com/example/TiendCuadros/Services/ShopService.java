package com.example.TiendCuadros.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TiendCuadros.Domains.Shop;
import com.example.TiendCuadros.Repositories.ShopRepository;

@Service
public class ShopService {
	
	@Autowired
	private ShopRepository shopRepository;

	public void addShop(Shop shop) {
		shopRepository.save(shop);
	}

	public Optional<Shop> getShop(String id) {
		return shopRepository.findById(id);
	}
	
	
	




}
