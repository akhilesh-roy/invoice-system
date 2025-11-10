package com.example.invoice.repository;

import com.example.invoice.model.Invoice;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class InMemoryInvoiceRepository implements InvoiceRepository {

    private final Map<String, Invoice> store = new HashMap<>();

    @Override
    public Invoice save(Invoice invoice) {
        store.put(invoice.getId(), invoice);
        return invoice;
    }

    @Override
    public Optional<Invoice> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Invoice> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public void update(Invoice invoice) {
        store.put(invoice.getId(), invoice);
    }
}