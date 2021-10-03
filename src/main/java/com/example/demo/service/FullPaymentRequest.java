package com.example.demo.service;




public class FullPaymentRequest {
	private String pv ;
	private String fv ;
	private String rate ;
	private String term ;
	public String getPv() {
		return pv;
	}
	public void setPv(String pv) {
		this.pv = pv;
	}
	public String getFv() {
		return fv;
	}
	public void setFv(String fv) {
		this.fv = fv;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	
	
}
