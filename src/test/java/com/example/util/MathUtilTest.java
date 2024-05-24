package com.example.util;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilTest {

    @BeforeAll
    static void setUpBeforeClass() {
        System.out.println("setUpBeforeClass()の呼出し。全テスト実行前に１度だけ実行される");
    }

    @AfterAll
    static void tearDownAfterClass()  {
        System.out.println("tearDownAfterClass()の呼出し。全テスト実行後に１度だけ実行される");
    }

    @BeforeEach
    void setUp() {
        System.out.println("setUp()の呼出し。各テスト実行前に毎回実行される");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown()の呼出し。各テスト実行後に毎回実行される");
    }

    @Test
    void testPower1() {
        double actualAnswer = MathUtil.power(0, -2);
        assertEquals(Double.POSITIVE_INFINITY, actualAnswer, "TC1:期待値と実際の結果が異なります");
    }

    @Test
    void testPower3() {
        double actualAnswer = MathUtil.power(0, 0);
        assertEquals(1.0, actualAnswer, "TC3:期待値と実際の結果が異なります");
    }

}