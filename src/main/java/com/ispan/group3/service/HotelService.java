package com.ispan.group3.service;

import com.ispan.group3.repository.Hotel;

import java.util.List;


public interface HotelService {
	public Object save(Hotel hol);
	public void update(Hotel hol);
	public List<Hotel> findAll();
	public void delete(Integer id);
	public Hotel findById(Integer id);








}
