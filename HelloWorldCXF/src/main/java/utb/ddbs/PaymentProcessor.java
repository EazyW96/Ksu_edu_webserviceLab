package utb.ddbs;

// These imports allow Java to understand the @ symbols below
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import utb.ddbs.dataobjects.PaymentProcessingRequest;
import utb.ddbs.dataobjects.PaymentProcessingResponse;

/**
 * SLIDE 39: Annotating the Web Interface
 * We are adding "Tags" so Apache CXF knows how to build the WSDL.
 */
@WebService(name = "PaymentProcessorService") 
public interface PaymentProcessor {

    /**
     * @WebMethod: Renames the operation in the WSDL to "makePayment".
     * @WebResult: Names the output tag in the XML "PaymentResponse".
     * @WebParam: Names the input tag in the XML "PaymentRequest".
     */
    @WebMethod(operationName = "makePayment")
    public @WebResult(name = "PaymentResponse") PaymentProcessingResponse processPayment(
            @WebParam(name = "PaymentRequest") PaymentProcessingRequest paymentRequest
    );
}