package com.wareops.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="purchaseitem")
public class PurchaseItem {
    @Id
    private int itemId;
    private int receiptId;
    private int productId;
    private int quantity;
    private double price;

    public PurchaseItem() {}
    public PurchaseItem(int itemId, int receiptId, int productId, int quantity, double price) {
        this.itemId = itemId;
        this.receiptId = receiptId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public int getItemId() { return itemId; }
    public void setItemId(int itemId) { this.itemId = itemId; }

    public int getReceiptId() { return receiptId; }
    public void setReceiptId(int receiptId) { this.receiptId = receiptId; }

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
