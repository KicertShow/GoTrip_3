package com.ispan.group3.service;

import java.util.List;


import com.ispan.group3.repository.Hotel;
import com.ispan.group3.repository.HotelRepositoryInterFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service
@Transactional
public class HotelServiceimpl implements HotelService {
	@Autowired
	HotelRepositoryInterFace hotelRepository;
	@Override
	public Object save(Hotel hol) {
		return hotelRepository.save(hol);
	}

	@Override
	public void update(Hotel hol) {
	}

	@Override
	public List<Hotel> findAll() {
		return hotelRepository.findAll();
	}

	@Override
	public void delete(Integer id) {
		hotelRepository.deleteById(id);
	}

	@Override
	public Hotel findById(Integer id) {
		return hotelRepository.findById(id).get();
	}
}
