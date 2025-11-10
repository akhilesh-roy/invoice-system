package com.example.invoice.repository;

import com.example.invoice.model.Invoice;

import java.util.List;
import java.util.Optional;

public interface InvoiceRepository {
    Invoice save(Invoice invoice);
    Optional<Invoice> findById(String id);
    List<Invoice> findAll();
    void update(Invoice invoice);
}