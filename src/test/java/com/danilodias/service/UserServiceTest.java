package com.danilodias.service;

import com.danilodias.model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserServiceTest {

   @DisplayName("User object created")
    @Test
    void testCreateUser_whenUserDetailsProvided_returnUserObject(){
        //Arrange
        UserService userService = new UserServiceImpl();
        String firstName = "Thabata";
        String lastName = "Dias";
        String email = "test@test.com";
        String password = "12345";
        String repeatPassword = "12345";


        //Act
        User user = userService.createUser(firstName, lastName, email, password, repeatPassword);

        //Assert
        assertNotNull(user, "The creatUser() should not have returned null");
        assertEquals(firstName, user.getFirstName(), "User's first name is incorrect ");
        assertEquals(lastName, user.getLastName(), "User's last name is incorrect");
        assertEquals(email, user.getEmail(), "User's email is incorrect" );
    }
}
