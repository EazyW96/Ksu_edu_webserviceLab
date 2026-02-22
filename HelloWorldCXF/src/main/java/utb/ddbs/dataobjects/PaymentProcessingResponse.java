package utb.ddbs.dataobjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PaymentProcessingResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentProcessingResponse {

	private boolean result;
	private String message;

	// Getters
	public boolean isResult() {
		return result;
	}

	public String getMessage() {
		return message;
	}

	// Setters
	public void setResult(boolean result) {
		this.result = result;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}