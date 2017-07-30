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

    @Test
    public void FloatingPointType() {
        float singlePrecision32bit;
        double doublePrecision64bit;
        System.out.println("* `float` range: " +
                Float.MIN_VALUE + " to " +
                Float.MAX_VALUE);
        System.out.println("* `double` range: " +
                Double.MIN_VALUE + " to " +
                Double.MAX_VALUE);
        singlePrecision32bit = 10.0F; // suffix F to get a float`
        assertEquals(10F, singlePrecision32bit, 0);
        doublePrecision64bit = 20.0; // default to double
        assertEquals(20D, doublePrecision64bit, 0);
        char b = 'c';
        System.out.println("---" + b);

    }

    @Test
    public void CharacterType() {
        char aChar = '\u0026';
        assertEquals(aChar, '&');
    }

    @Test
    public void traditionalOperatorsExplored() {
        assertEquals(4, 2 + 2);
        assertEquals(5L, 10L - 5L);
        assertEquals(25.0F, 12.5F * 2F, 0);
        assertEquals(30.2D, 120.8D / 4D, 0);
        assertEquals("abcd", "ab" + "cd");
        assertEquals(1, 9 % 2);
    }


    @Test
    public void assignmentOperatorsExplored() {
        String ab = "ab";
        assertEquals("ab", ab);
        int num = 10;
        assertEquals(10, num);
        num += 2;
        assertEquals("+= increments by", 12, num);
        num -= 4;
        assertEquals("-= decrements by", 8, num);
        num *= 2;
        assertEquals("*= multiplies by", 16, num);
        num /= 4;
        assertEquals("*= multiplies by", 4, num);
        num %= 3;
        assertEquals("%= modulus of", 1, num);
    }

    @Test
    public void incrementDecrementOperatorsExplored() {
        int num = 10;
        assertEquals(11, ++num);
        assertEquals(10, --num);
        assertEquals(10, num++);
        assertEquals(11, num);
        assertEquals(11, num--);
        assertEquals(10, num);
    }

    @Test
    public void booleanOperatorsExplored() {
        assertTrue(4 == 4);
        assertTrue(4 != 5);
        assertTrue(3 < 4);
        assertTrue(5 > 4);
        assertTrue(6 >= 6);
        assertTrue(7 >= 6);
        assertTrue(8 <= 8);
        assertTrue(8 <= 9);
        assertFalse(!true);
        boolean truthy = true;
        assertFalse(!truthy);
    }

    @Test
    public void conditionalOperatorsExplored() {
        assertTrue(true && true);
        assertTrue(true || false);
        assertTrue(false || true);
        assertFalse(false || false);
        assertFalse(false && true);
    }

    @Test
    public void ternaryOperatorsExplored() {
        int x;
        x = 4 > 3 ? 2 : 1;
        assertEquals(2, x);
        assertTrue(5 >= 4 ? true : false);
        int i = 1;
        int j = 6;
        int y = i > j ? 7 : 9;
        System.out.println(y);
    }

    @Test
    public void bitwiseOperatorsExplored() {
        assertEquals(0b0001,
                0b1001 & 0b0101);
        assertEquals(0b1101,
                0b1001 | 0b1001);
        assertEquals(0b1100,
                0b1001 ^ 0b0101);
        int x = 0b0001;
        assertEquals("11111111111111111111111111111110",
                Integer.toBinaryString(~x));
    }

    @Test
    public void bitwiseOperator() {
        System.out.println(4 ^ 5);
        System.out.println(~4);
    }

    @Test
    public void bitwiseAssignmentOperatorsExplored() {
        byte x = 0b0001;
        x &= 0b1011;
        System.out.println(x);
        assertEquals(0b0001, x);
        x |= 0b1001;
        assertEquals(0b1001, x);
        x ^= 0b1110;
        assertEquals(0b0111, x);
    }

    @Test
    public void shiftoperator() {

        int x = Integer.MIN_VALUE;
        System.out.println((x / 2) + 1);
        System.out.println(x >>> 2);

    }

    @Test
    public void someStringMethods() {
        String aString = "abcdef";
        assertEquals(6, aString.length());
        assertTrue(aString.compareToIgnoreCase("ABCDEF") == 0);
        assertTrue(aString.contains("bcde"));
        assertTrue(aString.startsWith("abc"));
// string indexing starts at 0
        assertEquals('c', aString.charAt(2));
        assertEquals("ef", aString.substring(4));
    }

    @Test
    public void moreTernary() {
        String url = "http://eviltester.com";

        url = url.startsWith("http") ? url : addHttp(url);
    }

    private String addHttp(String url) {
        return "http://" + url;
    }

    @Test
    public void catTest() {
        int number_of_cats = 1;
        assertEquals("1==cat", "cat", (number_of_cats == 1) ? "cat" : "cats");
    }

    @Test
    public void ifstatementTest() {
        int i = 5;
        if (i >= 1) {
            ++i;
            System.out.println(++i);
        }
        assertEquals(7, i);
    }

    @Test
    public void ifAddHttp() {
        String url = "www.seleniumsimplified.com";
        if (!url.startsWith("http")) {
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    @Test
    public void truthyIf() {
        boolean truthy = true;

        if (truthy)
            assertTrue(truthy);

        if (truthy) {
            assertTrue(truthy);
            assertFalse(!truthy);
        }
    }
    @Test
    public void switchExample(){
        assertEquals("M", likelyGenderIs("sir"));
        assertEquals("M", likelyGenderIs("mr"));
        assertEquals("M", likelyGenderIs("master"));
        assertEquals("F", likelyGenderIs("miss"));
        assertEquals("F", likelyGenderIs("mrs"));
        assertEquals("F", likelyGenderIs("ms"));
        assertEquals("F", likelyGenderIs("lady"));
        assertEquals("F", likelyGenderIs("madam"));
    }
    public String likelyGenderIs(String title){
        String likelyGender;
        switch(title.toLowerCase()){
            case "sir":
                likelyGender = "M";
                break;
            case "mr":
                likelyGender = "M";
                break;
            case "master":
                likelyGender = "M";
                break;
            default:
                likelyGender = "F";
                break;
        }
        return likelyGender;
    }
    @Test
    public void countrySwitch(){

        assertEquals("United Kingdom", countryOf("UK"));
        assertEquals("United States", countryOf("US"));
        assertEquals("United States", countryOf("USA"));
        assertEquals("United States", countryOf("UsA"));
        assertEquals("France", countryOf("FR"));
        assertEquals("Sweden", countryOf("sE"));
        assertEquals("Rest Of World", countryOf("ES"));
        assertEquals("Rest Of World", countryOf("CH"));
    }

    private String countryOf(String shortCode) {

        String country;

        switch(shortCode.toUpperCase()){
            case "UK":
                country= "United Kingdom";
                break;
            case "US":
            case "USA":
                country = "United States";
                break;
            case "FR":
                country = "France";
                break;
            case "SE":
                country = "Sweden";
                break;
            default:
                country = "Rest Of World";
                break;
        }

        return country;
    }
}

