package com.wareops.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="purchasereceipt")
public class PurchaseReceipt {
    @Id
    private int receiptId;
    private int supplierId;
    private LocalDateTime purchaseDate;
    private double totalAmount;

    public PurchaseReceipt() {}
    public PurchaseReceipt(int receiptId, int supplierId, LocalDateTime purchaseDate, double totalAmount) {
        this.receiptId = receiptId;
        this.supplierId = supplierId;
        this.purchaseDate = purchaseDate;
        this.totalAmount = totalAmount;
    }

    public int getReceiptId() { return receiptId; }
    public void setReceiptId(int receiptId) { this.receiptId = receiptId; }

    public int getSupplierId() { return supplierId; }
    public void setSupplierId(int supplierId) { this.supplierId = supplierId; }

    public LocalDateTime getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(LocalDateTime purchaseDate) { this.purchaseDate = purchaseDate; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
}
