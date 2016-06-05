package com.library.management.dao;

import java.util.List;

import com.library.management.modal.Borrowing;
import com.library.management.modal.User_Profile;

public interface IUserDao {
    List<User_Profile> getUsers();
    List<User_Profile> getStatusWiseUsers(String status);
    List<String> getUserWishList(int userId);
    List<Borrowing> getUserBorrowings(int userId);
    List<User_Profile> getUsersByZip(String zipCode);
    List<User_Profile> getUsersByCity(String city);
    List<User_Profile> getUsersByState(String state);
    List<User_Profile> getUsersByCountry(String country);
}
