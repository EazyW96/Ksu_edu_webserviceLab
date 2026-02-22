package utb.ddbs.PaymentConsumer;

// FIX 1: This import allows App to see the PaymentProcessorService interface
import utb.ddbs.*; 

public class App {
    public static void main(String[] args) {
        // FIX 2: Use the concrete Class (ending in _Service) to avoid "Cannot instantiate"
        PaymentProcessorService_Service service = new PaymentProcessorService_Service();
        
        // FIX 3: Use the Interface name from the file you just shared
        // The method in the _Service class will be getPaymentProcessorServicePort()
        PaymentProcessorService port = service.getPaymentProcessorServicePort(); 

        // Slide 52 logic
        PaymentProcessingRequest paymentRequest = new PaymentProcessingRequest();
        paymentRequest.setAmount(600.0);

        CreditCardInfo card = new CreditCardInfo();
        card.setCardNumber("111-222-333-3");
        paymentRequest.setCreditCardInfo(card);

        // Call the method defined in the interface you shared
        PaymentProcessingResponse response = port.makePayment(paymentRequest);

        System.out.println("Response result: " + response.isResult());
        System.out.println("Response Msg: " + response.getMessage());
    }
}