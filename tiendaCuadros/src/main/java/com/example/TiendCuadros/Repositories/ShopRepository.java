package com.example.TiendCuadros.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.TiendCuadros.Domains.Shop;

public interface ShopRepository extends CrudRepository<Shop, String> {

}
