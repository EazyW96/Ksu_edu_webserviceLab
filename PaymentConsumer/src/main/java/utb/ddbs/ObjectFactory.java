
package utb.ddbs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the utb.ddbs package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MakePaymentResponse_QNAME = new QName("http://ddbs.utb/", "makePaymentResponse");
    private final static QName _MakePayment_QNAME = new QName("http://ddbs.utb/", "makePayment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: utb.ddbs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MakePayment }
     * 
     */
    public MakePayment createMakePayment() {
        return new MakePayment();
    }

    /**
     * Create an instance of {@link MakePaymentResponse }
     * 
     */
    public MakePaymentResponse createMakePaymentResponse() {
        return new MakePaymentResponse();
    }

    /**
     * Create an instance of {@link PaymentProcessingResponse }
     * 
     */
    public PaymentProcessingResponse createPaymentProcessingResponse() {
        return new PaymentProcessingResponse();
    }

    /**
     * Create an instance of {@link PaymentProcessingRequest }
     * 
     */
    public PaymentProcessingRequest createPaymentProcessingRequest() {
        return new PaymentProcessingRequest();
    }

    /**
     * Create an instance of {@link CreditCardInfo }
     * 
     */
    public CreditCardInfo createCreditCardInfo() {
        return new CreditCardInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakePaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ddbs.utb/", name = "makePaymentResponse")
    public JAXBElement<MakePaymentResponse> createMakePaymentResponse(MakePaymentResponse value) {
        return new JAXBElement<MakePaymentResponse>(_MakePaymentResponse_QNAME, MakePaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakePayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ddbs.utb/", name = "makePayment")
    public JAXBElement<MakePayment> createMakePayment(MakePayment value) {
        return new JAXBElement<MakePayment>(_MakePayment_QNAME, MakePayment.class, null, value);
    }

}
