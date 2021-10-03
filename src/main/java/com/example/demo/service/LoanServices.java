package com.example.demo.service;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "*", maxAge = 3600)//cross origin configuration
//@RestController
//public class LoanServices {	
//	@PostMapping("fullPayment")
//	public String fullPayment(@RequestParam String pv,
//			@RequestParam String fv,@RequestParam String rate,@RequestParam String term) {
//		Float f_pv=new Float(pv);
//		Float f_fv=new Float(fv);
//		Float f_rate=new Float(rate);
//		
//		 f_rate = f_rate/12;
//
//		Float f_term=new Float(term);
//		Double result=(f_pv-f_fv/Math.pow((1+f_rate),f_term))
//				*(f_rate/(1-Math.pow(1+f_rate,-1*f_term)));
//		return String.valueOf(result);	
//	}
	
	@CrossOrigin(origins = "*", maxAge = 3600)//cross origin configuration
	@RestController
	public class LoanServices {	
	
		@PostMapping("fullPayment")
		public Map<String,Double> fullPayment(@RequestBody FullPaymentRequest fullPaymentRequest) {
			Float f_pv=new Float(fullPaymentRequest.getPv());
			Float f_fv=new Float(fullPaymentRequest.getFv());
			Float f_rate=new Float(fullPaymentRequest.getRate());
			
			 f_rate = f_rate/12;

			Float f_term=new Float(fullPaymentRequest.getTerm());
			Double result=(f_pv-f_fv/Math.pow((1+f_rate),f_term))
					*(f_rate/(1-Math.pow(1+f_rate,-1*f_term)));
			
			HashMap data=new HashMap<String,String>();
			data.put("data", result);
			return data;	
		}
	

	@CrossOrigin(origins = "*", maxAge = 3600)
	@GetMapping("test")
	public Map<String,String> test() {
		HashMap result=new HashMap<String,String>();
		result.put("result", "12.444");
		return result;
	}
	
	@GetMapping("testPayment")
	public String testPayment(@RequestParam String pv,
			@RequestParam String fv) {
		Float f_pv=new Float(pv);
		Float f_fv=new Float(fv);
		Float result=f_pv+f_fv;
		return String.valueOf(result);
		
		
	}
	
	
	

}
