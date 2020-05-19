package com.maxis.payment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	@RequestMapping("/payment")
	public String getPaymentInformation() {
		return "All Payment Information from Maxis Systems Ltd.";
	}
}
