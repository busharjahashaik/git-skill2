package com.wareops.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="stockledger")
public class StockLedger {
    @Id
    private int ledgerId;
    private int productId;
    private int warehouseId;
    private int quantity;
    private LocalDateTime transactionDate;
    private String transactionType; // IN/OUT

    public StockLedger() {}
    public StockLedger(int ledgerId, int productId, int warehouseId, int quantity, LocalDateTime transactionDate, String transactionType) {
        this.ledgerId = ledgerId;
        this.productId = productId;
        this.warehouseId = warehouseId;
        this.quantity = quantity;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
    }

    public int getLedgerId() { return ledgerId; }
    public void setLedgerId(int ledgerId) { this.ledgerId = ledgerId; }

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public int getWarehouseId() { return warehouseId; }
    public void setWarehouseId(int warehouseId) { this.warehouseId = warehouseId; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public LocalDateTime getTransactionDate() { return transactionDate; }
    public void setTransactionDate(LocalDateTime transactionDate) { this.transactionDate = transactionDate; }

    public String getTransactionType() { return transactionType; }
    public void setTransactionType(String transactionType) { this.transactionType = transactionType; }
}
