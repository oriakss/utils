package ru.clevertec.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.clevertec.utils.StringUtils.isPositiveNumber;

class StringUtilsTest {

    @Test
    void trueIfNumberIsPositive() {
        assertTrue(isPositiveNumber("123"));
    }

    @Test
    void falseIfNumberIsNotPositive() {
        assertFalse(isPositiveNumber("-123"));
    }

    @Test
    void falseIfNumberIsIncorrect() {
        assertFalse(isPositiveNumber("12..0"));
    }

    @Test
    void falseIfInputIsNull() {
        assertFalse(isPositiveNumber(null));
    }
}