package utb.ddbs.dataobjects;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CreditCardInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class CreditCardInfo {

	@XmlElement(name = "cardNumber", required = true)
	private String cardNumber;

	@XmlElement(name = "expiryDate", required = true)
	private Date expiryDate;

	@XmlElement(name = "firstName", required = true)
	private String firstName;

	@XmlElement(name = "lastName", required = true)
	private String lastName;

	@XmlElement(name = "secCode", required = true)
	private String secCode;

	@XmlElement(name = "address", required = true)
	private String address;

	// Getters
	public String getCardNumber() {
		return cardNumber;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSecCode() {
		return secCode;
	}

	public String getAddress() {
		return address;
	}

	// Setters
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSecCode(String secCode) {
		this.secCode = secCode;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}