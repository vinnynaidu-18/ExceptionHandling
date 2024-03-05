package Swiggy.model;

import Swiggy.SwiggyPaymentService;

import java.util.UUID;


    public class CreditCardService implements SwiggyPaymentService {

        @Override
        public PaymentResponse payment(PaymentRequest request) {
            PaymentRequest paymentIntitationRequest=new PaymentRequest("SWIGGY"+ UUID.randomUUID().toString(),
                    request.getAmt() ,request.getTxnDate(),"222",false);
            SBIBankService sbiBankService =new SBIBankService();
            return sbiBankService.transfer(paymentIntitationRequest);
        }
    }




