package com.example.TiendCuadros.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.TiendCuadros.Domains.Shop;
import com.example.TiendCuadros.Services.ShopService;

@RestController
public class ShopController {
	
	@Autowired
	private ShopService shopService;
	
	
	@RequestMapping(method=RequestMethod.POST, value="/shops")
	public void postShop(@RequestBody Shop shop) {
		shopService.addShop(shop);
	}

	@RequestMapping("/shops/{id}")
	public Optional<Shop> getShop(@PathVariable String id){
		return shopService.getShop(id);
	}
	
	
	
	
}
