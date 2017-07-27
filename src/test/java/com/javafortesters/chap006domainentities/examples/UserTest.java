package com.javafortesters.chap006domainentities.examples;

import com.jft.domainentities.User;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UserTest {
    @Test
    public void canConstructANewUser(){
        User user=new User();
    }
    @Test
    public void userHasDefaultUsernameAndPassword(){
        User user = new User();
        Assert.assertEquals("default username expected",
                "username",
                user.getUsername());
        assertEquals("default password expected",
                "password",
                user.getPassword());
    }
    @Test
    public void canConstructWithUsernameAndPassword(){
        User user = new User("admin", "pA55w0rD");
        assertEquals("given username expected",
                "admin",
                user.getUsername());
        assertEquals("given password expected",
                "pA55w0rD",
                user.getPassword());
    }
}
