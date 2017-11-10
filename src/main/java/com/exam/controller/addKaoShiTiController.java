package com.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.dao.KaoShiTiRepository;
import com.exam.entity.KaoShiTi;

@Controller
public class addKaoShiTiController {
	@Autowired
	private KaoShiTiRepository kaoshitiRepository;

	@RequestMapping("/addKaoShiTi")
	public String addKaoShiTi(KaoShiTi kaoshiti) {
		kaoshitiRepository.save(kaoshiti);
		return "addKaoShiTi";

	}
}
