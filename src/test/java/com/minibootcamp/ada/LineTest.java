package com.minibootcamp.ada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void testCalculateLengthGivenTwoIdenticalPointsExpectReturnZero() {
        assertEquals(0.0, Line.calculateLength(0, 0, 0, 0));
    }

    @Test
    void testCalculateLengthGivenHorizontalLineExpectReturnItsLength() {
        assertEquals(2.0, Line.calculateLength(5, 0, 7, 0));
    }
}
