package com.wareops.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="dispatch")
public class Dispatch {
    @Id
    private int dispatchId;
    private int orderId;
    private LocalDateTime dispatchDate;
    private String status;

    public Dispatch() {}
    public Dispatch(int dispatchId, int orderId, LocalDateTime dispatchDate, String status) {
        this.dispatchId = dispatchId;
        this.orderId = orderId;
        this.dispatchDate = dispatchDate;
        this.status = status;
    }

    public int getDispatchId() { return dispatchId; }
    public void setDispatchId(int dispatchId) { this.dispatchId = dispatchId; }

    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public LocalDateTime getDispatchDate() { return dispatchDate; }
    public void setDispatchDate(LocalDateTime dispatchDate) { this.dispatchDate = dispatchDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
