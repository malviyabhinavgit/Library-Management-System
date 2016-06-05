package com.library.management.dao;

import java.util.List;

import com.library.management.modal.Cart;

public interface IBorrowingDao {
   List<Cart> getCartByUserId(int userId);
   List<Cart> getAllCart();
}
