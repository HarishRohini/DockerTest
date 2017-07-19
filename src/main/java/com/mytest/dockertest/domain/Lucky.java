/**
 * 
 */
package com.mytest.dockertest.domain;

/**
 * @author harishrohini
 *
 */
public class Lucky {
	
	private Integer luckyNumber;
	private String luckStatus;
	
	public Lucky(Integer luckyNumber, String luckStatus) {
		this.luckStatus = luckStatus;
		this.luckyNumber = luckyNumber;
	}
	
	public Integer getLuckyNumber() {
		return luckyNumber;
	}
	
	public void setLuckyNumber(Integer luckyNumber) {
		this.luckyNumber = luckyNumber;
	}
	
	public String getLuckStatus() {
		return luckStatus;
	}
	
	public void setLuckStatus(String luckStatus) {
		this.luckStatus = luckStatus;
	}
	
	

}
