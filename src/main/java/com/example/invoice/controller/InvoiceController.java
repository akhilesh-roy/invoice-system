package com.example.invoice.controller;

import com.example.invoice.model.Invoice;
import com.example.invoice.dto.InvoiceDTO;
import com.example.invoice.service.InvoiceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> createInvoice(@RequestBody InvoiceDTO dto) {
        Invoice invoice = invoiceService.createInvoice(dto);
        return ResponseEntity.status(201).body(Map.of("id", invoice.getId()));
    }

    @GetMapping
    public ResponseEntity<List<Invoice>> getAllInvoices() {
        return ResponseEntity.ok(invoiceService.getAllInvoices());
    }
}