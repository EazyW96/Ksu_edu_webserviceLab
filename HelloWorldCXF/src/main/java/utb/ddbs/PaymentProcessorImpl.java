package utb.ddbs;

import java.util.Date; // Required to use the "new Date()" function
import utb.ddbs.dataobjects.PaymentProcessingRequest; // Tells Java where the Request is
import utb.ddbs.dataobjects.PaymentProcessingResponse; // Tells Java where the Response is

/**
 * SLIDE 41: The Implementation Class This is the "Brain" of your service where
 * the work actually happens.
 */
public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public PaymentProcessingResponse processPayment(PaymentProcessingRequest paymentRequest) {

		// 1. Create the response object (the container for our answer)
		PaymentProcessingResponse response = new PaymentProcessingResponse();

		// 2. Business Logic
		// In a real app, you'd check the card here. For the lab, we just say 'true'.
		response.setResult(true);

		// 3. Set a friendly message including the current time
		response.setMessage("Payment was successfully completed at " + new Date());

		// 4. Send the container back to the user
		return response;
	}
}