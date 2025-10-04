package com.emmanuelanene.OasisCapital.services;

import com.emmanuelanene.OasisCapital.dtos.LoginRequest;
import com.emmanuelanene.OasisCapital.dtos.RegistrationRequest;
import com.emmanuelanene.OasisCapital.dtos.Response;
import com.emmanuelanene.OasisCapital.dtos.UserDTO;
import com.emmanuelanene.OasisCapital.entities.User;

public interface UserService {

    Response registerUser(RegistrationRequest registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    Response getOwnAccountDetails();
    User getCurrentLoggedInUser();
    Response updateOwnAccount(UserDTO userDTO);
    Response deleteOwnAccount();
    Response getMyBookingHistory();
}
