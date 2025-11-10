package com.example.invoice.model;

import java.time.LocalDate;
import java.util.UUID;

public class Invoice {
    private String id;
    private double amount;
    private double paidAmount;
    private LocalDate dueDate;
    private String status;

    public Invoice() {
        this.id = UUID.randomUUID().toString();
        this.paidAmount = 0;
        this.status = "pending";
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}