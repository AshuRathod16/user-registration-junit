package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    // positive test case  for firstName return true
    @Test
    public void validateFirstNameTestReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateFirstName("Ashwini");
            Assert.assertTrue(actualOutput);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // positive test case for lastName return true
    @Test
    public void validateLastNameTestReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateLastname("Rathod");
            Assert.assertTrue(actualOutput);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // positive test case for email return true
    @Test
    public void validateEmailTestReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateEmail("rashwini510@gamil.com");
            Assert.assertTrue(actualOutput);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // positive test case for mobile number return true
    @Test
    public void validateMobileNumberReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validateMobileNumber("+91 9689410960");
            Assert.assertTrue(actualOutput);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // positive test case for password return true
    @Test
    public void validatePasswordReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean actualOutput = userRegistration.validatePassword("AshwiniRathod@16");
            Assert.assertTrue(actualOutput);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
