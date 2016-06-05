package com.library.management.modal;

import java.math.BigInteger;
import java.util.Date;

import com.library.management.enums.PLANTYPE;

public class Membership {
	private int membershipId;

	public int getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(int membershipId) {
		this.membershipId = membershipId;
	}

	public PLANTYPE getPlanType() {
		return planType;
	}

	public void setPlanType(PLANTYPE planType) {
		this.planType = planType;
	}

	public Date getMembershipStartDate() {
		return membershipStartDate;
	}

	public void setMembershipStartDate(Date membershipStartDate) {
		this.membershipStartDate = membershipStartDate;
	}

	public Date getMemberShipDueDate() {
		return memberShipDueDate;
	}

	public void setMemberShipDueDate(Date memberShipDueDate) {
		this.memberShipDueDate = memberShipDueDate;
	}

	public BigInteger getMembershipCost() {
		return membershipCost;
	}

	public void setMembershipCost(BigInteger membershipCost) {
		this.membershipCost = membershipCost;
	}

	private PLANTYPE planType;
	private Date membershipStartDate;
	private Date memberShipDueDate;
	private BigInteger membershipCost;

}
