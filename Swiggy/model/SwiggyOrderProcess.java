package Swiggy.model;

import Swiggy.SwiggyPaymentService;

import java.util.Date;
import java.util.UUID;

public abstract class SwiggyOrderProcess {
    SwiggyPaymentService swiggyPaymentService;
  public   SwiggyOrderProcess (SwiggyPaymentService swiggyPaymentService){
      this.swiggyPaymentService=swiggyPaymentService;

  }
    public Order getFinalOrder(Order order) {
        double tax = 0;
        if (order.getPrice() > 1000) {
            tax = order.getPrice() * 20 / 100;
        }
        double finalAmt = order.getPrice() * tax * 20;
        Order finalOrder = new Order(finalAmt, tax, 20);
        finalOrder.setOrderItemsList(order.getOrderItemsList());
        return finalOrder;
    }
    public Order createOrder(Order order){
        Order finalorders =getFinalOrder(order);
        PaymentRequest paymentIntitationRequest=new PaymentRequest("SWIGGY"+ UUID.randomUUID().toString(),
                finalorders.getPrice() ,new Date(),"222",false);
        PaymentResponse response=swiggyPaymentService.payment(paymentIntitationRequest);
        if (response !=null){
            finalorders.setStatus("success");
            System.out.println(response.getCorelationId());
        }
        delivery(finalorders);
        return  finalorders;
    }
   public abstract boolean delivery (Order order);

}
