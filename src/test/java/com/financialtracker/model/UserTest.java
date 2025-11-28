package com.financialtracker.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void testUserCreation() {
        User user = new User("john_doe", "john@example.com", "hashedpassword123");

        assertEquals("john_doe", user.getUsername());
        assertEquals("john@example.com", user.getEmail());
        assertEquals("hashedpassword123", user.getPasswordHash());
    }

    @Test
    public void testUserWithId() {
        User user = new User(1, "jane_smith", "jane@example.com", "hashedpass456");

        assertEquals(1, user.getId());
        assertEquals("jane_smith", user.getUsername());
        assertEquals("jane@example.com", user.getEmail());
    }

    @Test
    public void testUserSetters() {
        User user = new User("user123", "user@test.com", "pass");
        user.setEmail("newemail@test.com");
        user.setPasswordHash("newpass");

        assertEquals("newemail@test.com", user.getEmail());
        assertEquals("newpass", user.getPasswordHash());
    }
}