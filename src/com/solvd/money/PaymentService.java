package com.solvd.money;

import com.solvd.interfaces.Payable;

public class PaymentService {

    public void processPayment(Payable payable){
        payable.paySalary();
    }

}
