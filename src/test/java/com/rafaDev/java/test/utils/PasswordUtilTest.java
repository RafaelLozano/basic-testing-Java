package com.rafaDev.java.test.utils;

import org.junit.Test;

import static com.rafaDev.java.test.utils.PasswordUtil.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {
    @Test
    public void testWeakPassword() {
        assertEquals(securityLevels.WEAK,checkPassword("1234567"));
    }

    @Test
    public void testOnlyChar() {
        assertEquals(securityLevels.WEAK,checkPassword("asdfghjklqwertyuiop"));
    }

    @Test
    public void testCharAndNumber() {
        assertEquals(securityLevels.MEDIUM, checkPassword("hola123432"));
    }

}