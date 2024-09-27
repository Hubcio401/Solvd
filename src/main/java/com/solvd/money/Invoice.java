package com.solvd.money;

import com.solvd.Exceptions.NegativeInvoiceNumberException;
import com.solvd.resource.Client;

import java.io.Serializable;
import java.time.LocalDate;

public class Invoice implements Serializable {

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
                throw new NegativeInvoiceNumberException("Invoice number can't be negative");
            } else {
                this.invoiceNumber = invoiceNumber;
                System.out.println("Invoice Date: " + invoiceDate + " invoice number: " + invoiceNumber + " client Name and Surname:  " + client.getName() + " " + client.getSurname()
                        + " price: " + client.getPrice());
            }
        }
        catch (NegativeInvoiceNumberException ex){
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
