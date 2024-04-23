package com.sst.productservicesst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RandomTestCase {
    @Test
    void testIsOnePlusOneIsTwo() {

        int i = 1 + 1;



        assertEquals(2, i, "i value isn't 4, that's why test case failed.");

    }

    @Test
    void testIsTwoMultiplyByTwoIsFour() {
        int i = 2 * 2;

        assert i == 4;
    }
}
