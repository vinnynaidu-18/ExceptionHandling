package Swiggy.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<OrderItems> orderItemsList=new ArrayList<>();
    private double price;
    private double serviceCharges;
    private int tipAmt;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Order(double price, double serviceCharges, int tipAmt) {
        this.price = price;
        this.serviceCharges = serviceCharges;
        this.tipAmt = tipAmt;
    }

    public void addItems(OrderItems item){
       orderItemsList.add(item);
       price=price+item.getPrice();
    }
    public void removeItems(OrderItems item){
        orderItemsList.remove(item);
        price=price- item.getPrice();
    }

    public List<OrderItems> getOrderItemsList() {
        return orderItemsList;
    }

    public double getPrice() {
        return price;
    }

    public double getServiceCharges() {
        return serviceCharges;
    }

    public int getTipAmt() {
        return tipAmt;
    }

    public void setOrderItemsList(List<OrderItems> orderItemsList) {
        this.orderItemsList = orderItemsList;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setServiceCharges(int serviceCharges) {
        this.serviceCharges = serviceCharges;
    }

    public void setTipAmt(int tipAmt) {
        this.tipAmt = tipAmt;
    }
}
