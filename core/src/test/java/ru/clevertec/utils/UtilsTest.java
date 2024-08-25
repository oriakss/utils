package ru.clevertec.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UtilsTest {

    @Test
    void trueIfNumbersArePositive() {
        assertTrue(Utils.isAllPositiveNumbers("123", "456", "789"));
    }
}