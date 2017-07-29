package com.javafortesters.chap006domainentities.examples;

import com.jft.domainentities.User;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserTest {
    @Test
    public void canConstructANewUser() {
        User user = new User();
    }

    @Test
    public void userHasDefaultUsernameAndPassword() {
        User user = new User();
        Assert.assertEquals("default username expected",
                "username",
                user.getUsername());
        assertEquals("default password expected",
                "password",
                user.getPassword());
    }

    @Test
    public void canConstructWithUsernameAndPassword() {
        User user = new User("admin", "pA55w0rD");
        assertEquals("given username expected",
                "admin",
                user.getUsername());
        assertEquals("given password expected",
                "pA55w0rD",
                user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed() {
        User user = new User();
        user.setPassword("Pazzwor6");
        assertEquals("setter passwird expected", "Pazzwor6", user.getPassword());
    }

    @Test
    public void variableNaming() {
        String $aString = "bob";
        float £owed = 10F;
        int aMount = 4;
        long Amount = 5;
        String A0123456789bCd$f = "ugh";
        assertEquals(4, aMount);
        assertEquals(5, Amount);
        assertEquals(10.0F, £owed, 0);
        assertEquals("bob", $aString);
        assertEquals("ugh", A0123456789bCd$f);
    }

    @Test
    public void BooleanType() {
        boolean truthy = true;
        boolean falsey = false;
        assertTrue(truthy);

        assertFalse(falsey);
        truthy = Boolean.TRUE;
        falsey = Boolean.FALSE;
        assertTrue(truthy);
        assertFalse(falsey);
    }

    @Test
    public void IntegerTypes() {
        byte aByteHas1Byte;
        short aShortHas2Bytes;
        int anIntHas4Bytes;
        long aLongHas8Bytes;
        System.out.println(
                "* `byte` range: " +
                        Byte.MIN_VALUE + " to " +
                        Byte.MAX_VALUE);
        System.out.println("* `short` range: " +
                Short.MIN_VALUE + " to " +
                Short.MAX_VALUE);
        System.out.println("* `int` range: " +
                Integer.MIN_VALUE + " to " +
                Integer.MAX_VALUE);
        System.out.println("* `long` range: " +
                Long.MIN_VALUE + " to " +
                Long.MAX_VALUE);
        aLongHas8Bytes = 0L; //add suffix L for long
        assertEquals(0, aLongHas8Bytes);
        aByteHas1Byte = 0xA; //add prefix 0x for Hex
        assertEquals(10, aByteHas1Byte);
        anIntHas4Bytes = 010; //add 'zero' prefix for Octal
        assertEquals(8, anIntHas4Bytes);
        aByteHas1Byte = 0b0010; // Java 1.7 added 0b 'zero b' for binary
        assertEquals(aByteHas1Byte, 2);
// Java 1.7 allows underscores for readability
        aLongHas8Bytes = 9_000_000_000L; // 9 000 million
        assertEquals(9000000000L, aLongHas8Bytes);
    }
}
