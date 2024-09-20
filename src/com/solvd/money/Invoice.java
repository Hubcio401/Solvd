package com.solvd.money;

import Exceptions.NegativeInvoiceNumber;
import com.solvd.resource.Client;

import java.time.LocalDate;

public class Invoice {

    private int invoiceNumber;
    LocalDate invoiceDate;

    public Invoice(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        invoiceDate = LocalDate.now();
    }

    public Invoice() {
        invoiceDate = LocalDate.now();
    }

    public void createInvoice(int invoiceNumber, Client client){

        try {
            if (invoiceNumber < 0) {
                throw new NegativeInvoiceNumber("Invoice number can't be negative");
            } else {
                this.invoiceNumber = invoiceNumber;
                System.out.println("Invoice Date: " + invoiceDate + " invoice number: " + invoiceNumber + " client Name and Surname:  " + client.getName() + " " + client.getSurname()
                        + " price: " + client.getPrice());
            }
        }
        catch (NegativeInvoiceNumber ex){
            System.out.println(ex.getMessage());
        }

    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
}
