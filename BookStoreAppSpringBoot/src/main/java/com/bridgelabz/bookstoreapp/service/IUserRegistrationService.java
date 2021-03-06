package com.bridgelabz.bookstoreapp.service;

import com.bridgelabz.bookstoreapp.dto.ForgotPasswordDto;
import com.bridgelabz.bookstoreapp.dto.LoginDto;
import com.bridgelabz.bookstoreapp.dto.ResetPassword;
import com.bridgelabz.bookstoreapp.dto.UserRegistrationDto;
import com.bridgelabz.bookstoreapp.model.UserRegistrationData;

import java.util.List;
import java.util.Optional;

public interface IUserRegistrationService {
    List<UserRegistrationData> getUserDeatils();

    UserRegistrationData userRegistration(UserRegistrationDto userDTO);

    UserRegistrationData getUserById(int userId);

    UserRegistrationData updateUserRegistrationData(int userId, UserRegistrationDto userDTO);

    void deleteUser(int userId);

    List<UserRegistrationData> getAllUsersData(String token);


    String verifyUser(String token);


    Optional<UserRegistrationData> UserLogin(LoginDto logindto);

    String forgotPassword(ForgotPasswordDto forgotpass);

    UserRegistrationData resetPassword(ResetPassword resetPassword, String token);

    String deleteAll();
}
