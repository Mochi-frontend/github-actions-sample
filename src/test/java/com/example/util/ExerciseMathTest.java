package com.example.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseMathTest {
    @Test
    void testFactorial1() {
        try {
            ExerciseMath.factorial(-1);
            fail("TC1:例外が発生しなければなりません");
        } catch (IllegalArgumentException e) {
            assertEquals("渡された値が正しくありません", e.getMessage(), "TC1:メッセージが一致しません");
        }
    }

    @Test
    void testFactorial2() {
        try {
            ExerciseMath.factorial(0);
            fail("TC2:例外が発生しなければなりません");
        } catch (IllegalArgumentException e) {
            assertEquals("渡された値が正しくありません", e.getMessage(), "TC2:メッセージが一致しません");
        }
    }

    @Test
    void testFactorial3() {
        int actualAnswer = ExerciseMath.factorial(1);
        assertEquals(1, actualAnswer, "TC3:値が一致しません");
    }

    @Test
    void testFactorial4() {
        int actualAnswer = ExerciseMath.factorial(2);
        assertEquals(2, actualAnswer, "TC4:値が一致しません");
    }

}