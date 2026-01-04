package com.wareops.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="returnlog")
public class ReturnLog {
    @Id
    private int returnId;
    private int orderId;
    private int productId;
    private int quantity;
    private LocalDateTime returnDate;
    private String reason;

    public ReturnLog() {}
    public ReturnLog(int returnId, int orderId, int productId, int quantity, LocalDateTime returnDate, String reason) {
        this.returnId = returnId;
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.returnDate = returnDate;
        this.reason = reason;
    }

    public int getReturnId() { return returnId; }
    public void setReturnId(int returnId) { this.returnId = returnId; }

    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public LocalDateTime getReturnDate() { return returnDate; }
    public void setReturnDate(LocalDateTime returnDate) { this.returnDate = returnDate; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }
}
