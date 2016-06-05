package com.library.management.modal;

import java.util.Date;

import com.library.management.enums.CARDTYPE;
import com.library.management.interfaces.IPaymentMode;

public class CardPayment implements IPaymentMode {
	private String cardNumber;
	private String nameOnCard;
	private Date expiryDate;
	private String cvv;
	private Date validFrom;
	private CARDTYPE cardtype;

	public CardPayment(String cardNumber, String nameOnCard, Date expiryDate,
			String cvv, Date validFrom, CARDTYPE cardtype) {

		this.cardNumber = cardNumber;
		this.cardtype = cardtype;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
		this.validFrom = validFrom;
		this.nameOnCard = nameOnCard;

	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public CARDTYPE getCardtype() {
		return cardtype;
	}

	public void setCardtype(CARDTYPE cardtype) {
		this.cardtype = cardtype;
	}

	public boolean pay(Long amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
