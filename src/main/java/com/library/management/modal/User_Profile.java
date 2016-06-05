package com.library.management.modal;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import com.library.management.enums.ROLE;

public class User_Profile {
	private int userId;
	private String Name;
	private String password;
	private String address_First_Line;
	private String address_Second_Line;
	private ROLE role;
	private List<Borrowing> borrowings;
	private Date enrolledDate;
	private Membership membership;
	private List<String> userWishList;
	private List<Task> toDoList;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress_First_Line() {
		return address_First_Line;
	}

	public void setAddress_First_Line(String address_First_Line) {
		this.address_First_Line = address_First_Line;
	}

	public String getAddress_Second_Line() {
		return address_Second_Line;
	}

	public void setAddress_Second_Line(String address_Second_Line) {
		this.address_Second_Line = address_Second_Line;
	}

	public ROLE getRole() {
		return role;
	}

	public void setRole(ROLE role) {
		this.role = role;
	}

	public List<Borrowing> getBorrowings() {
		return borrowings;
	}

	public void setBorrowings(List<Borrowing> borrowings) {
		this.borrowings = borrowings;
	}

	public Date getEnrolledDate() {
		return enrolledDate;
	}

	public void setEnrolledDate(Date enrolledDate) {
		this.enrolledDate = enrolledDate;
	}

	public Membership getMembership() {
		return membership;
	}

	public void setMembership(Membership membership) {
		this.membership = membership;
	}

	public List<String> getUserWishList() {
		return userWishList;
	}

	public void setUserWishList(List<String> userWishList) {
		this.userWishList = userWishList;
	}

	public List<Task> getToDoList() {
		return toDoList;
	}

	public void setToDoList(List<Task> toDoList) {
		this.toDoList = toDoList;
	}

	public BigInteger getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(BigInteger fineAmount) {
		this.fineAmount = fineAmount;
	}

	private BigInteger fineAmount;

	public User_Profile() {
		// TODO Auto-generated constructor stub
	}

}
