package Swiggy.model;

import java.util.Date;

public class PaymentResponse {
    private String corelationId;
    private String status;
    private Date response;

    public PaymentResponse(String corelationId, String status, Date response) {
        this.corelationId = corelationId;
        this.status = status;
        this.response = response;
    }

    public String getCorelationId() {
        return corelationId;
    }

    public String getStatus() {
        return status;
    }

    public Date getResponse() {
        return response;
    }
}
