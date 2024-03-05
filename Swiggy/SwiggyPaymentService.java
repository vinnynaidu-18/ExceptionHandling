package Swiggy;

import Swiggy.model.PaymentRequest;
import Swiggy.model.PaymentResponse;

public interface SwiggyPaymentService {
    PaymentResponse payment(PaymentRequest request);


}
