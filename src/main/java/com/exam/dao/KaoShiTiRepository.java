package com.exam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.entity.KaoShiTi;
public interface KaoShiTiRepository extends JpaRepository<KaoShiTi, Long> {

	//按Id查询考试题
	KaoShiTi findById(int id);
	
	//添加考试题
	//KaoShiTi find(KaoShiTi kaoshiti);
	
	
	
}
