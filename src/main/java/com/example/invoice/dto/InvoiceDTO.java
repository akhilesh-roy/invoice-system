package com.example.invoice.dto;

import java.time.LocalDate;

public class InvoiceDTO {
    private double amount;
    private LocalDate dueDate;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}