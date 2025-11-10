package com.example.invoice.service;

import com.example.invoice.dto.InvoiceDTO;
import com.example.invoice.model.Invoice;
import com.example.invoice.repository.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {

    private final InvoiceRepository repository;

    public InvoiceService(InvoiceRepository repository) {
        this.repository = repository;
    }

    public Invoice createInvoice(InvoiceDTO dto) {
        Invoice invoice = new Invoice();
        invoice.setAmount(dto.getAmount());
        invoice.setDueDate(dto.getDueDate());
        return repository.save(invoice);
    }

    public List<Invoice> getAllInvoices() {
        return repository.findAll();
    }

    public Invoice getInvoiceById(String id) {
        return repository.findById(id).orElse(null);
    }

    public void updateInvoice(Invoice invoice) {
        repository.update(invoice);
    }
}