package com.payment.paymentProject.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    public static final Logger log = LogManager.getLogger(PaymentController.class);

    @GetMapping("/root")
    public String home(){
        log.info("This is a payment page home URL");
        return "This is payment application";
    }

}
