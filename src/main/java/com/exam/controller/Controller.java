package com.exam.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.dao.KaoShiTiRepository;
import com.exam.entity.KaoShiTi;

@RestController
public class Controller {

	@Autowired
	private KaoShiTiRepository kaoshitiRepository;
	
	@RequestMapping("/kaoshi")
	public KaoShiTi kaoshiti() {
		int max=20;
        int min=10;
        Random random = new Random();

        int s = random.nextInt(max)%(max-min+1) + min;
		System.out.println(s);
		return kaoshitiRepository.findById(s);
	}
	
}
