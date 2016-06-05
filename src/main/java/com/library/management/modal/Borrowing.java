package com.library.management.modal;

public class Borrowing {
	private int userId;
	private Cart cart;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart( Cart cart) {
		this.cart = cart;
	}

}
