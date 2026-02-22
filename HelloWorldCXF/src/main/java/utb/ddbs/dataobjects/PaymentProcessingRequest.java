package utb.ddbs.dataobjects;

// These imports are required for the @ symbols below
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * SLIDE 40: Annotating the Message Class (JAXB)
 * This tells the JAXB framework exactly how to build the XML tags.
 */
@XmlType(name = "PaymentProcessingRequest") 
@XmlAccessorType(XmlAccessType.FIELD) // Tells JAXB to look at the fields (variables) directly
public class PaymentProcessingRequest {

    // @XmlElement creates a nested tag <creditCardInfo>
    @XmlElement(name = "creditCardInfo", required = true)
    private CreditCardInfo creditCardInfo;

    // @XmlAttribute puts the amount inside the tag like: <PaymentRequest amount="100.0">
    @XmlAttribute(name = "amount", required = true)
    private Double amount;

    // Getters and Setters
    public CreditCardInfo getCreditCardInfo() {
        return creditCardInfo;
    }

    public void setCreditCardInfo(CreditCardInfo creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}