package com.exam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 考试题实体类
 * 
 * @author 郭亚坤
 *
 */

@Entity
public class KaoShiTi {

	/**
	 * 考试题id
	 */
	@Id
	private int id;
	/**
	 * 考试题目
	 */
	@Column(name = "ktTiMu")
	private String ktTiMu;
	/**
	 * 考试题类型，例如 选择题、判断题。
	 */
	@Column(name = "ktType")
	private String ktType;
	/**
	 * 考试题答案
	 */
	@Column(name = "a")
	private String a;

	/**
	 * 考试题答案
	 */
	@Column(name = "b")
	private String b;

	/**
	 * 考试题答案
	 */
	@Column(name = "c")
	private String c;

	/**
	 * 考试题答案
	 */
	@Column(name = "d")
	private String d;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKtTiMu() {
		return ktTiMu;
	}

	public void setKtTiMu(String ktTiMu) {
		this.ktTiMu = ktTiMu;
	}

	public String getKtType() {
		return ktType;
	}

	public void setKtType(String ktType) {
		this.ktType = ktType;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "KaoShiTi [id=" + id + ", ktTiMu=" + ktTiMu + ", ktType=" + ktType + ", a=" + a + ", b=" + b + ", c=" + c
				+ ", d=" + d + "]";
	}

}
