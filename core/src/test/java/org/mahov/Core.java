package org.mahov;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Core extends TestCase {

    public static int sum(int[] numbers) {
        // todo
        return 0;
    }
    @ParameterizedTest
    @MethodSource("provideTestCasesForSum")
    public void testSum(int[] numbers, int expectedSum) {
        assertEquals(expectedSum, sum(numbers));
    }

    private static Stream<Arguments> provideTestCasesForSum() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 6),
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{-1, -2, -3}, -6),
                Arguments.of(new int[]{-1, 2, -3, 4}, 2)
        );
    }

    public boolean isEven(int number) {
        //todo
        return false;
    }

    @Test
    public void testIsEven() {
        assertTrue(isEven(4));
        assertFalse(isEven(5));
        assertTrue(isEven(0));
    }

    //Факториал числа
    public int factorial(int n) {
        //todo
        return 0;
    }

    @Test
    public void testFactorial() {
        assertEquals(120, factorial(5));
        assertEquals(1, factorial(0));
        assertEquals(6, factorial(3));
    }

    //Минимум из трех чисел
    public int minOfThree(int a, int b, int c) {
        return 0;
    }

    @Test
    public void testMinOfThree() {
        assertEquals(1, minOfThree(1, 2, 3));
        assertEquals(-1, minOfThree(-1, -2, -3));
        assertEquals(0, minOfThree(2, 0, 1));
    }

    //Сумма чисел от 1 до N
    public int sumToN(int n) {
        return 0;
    }

    @Test
    public void testSumToN() {
        assertEquals(15, sumToN(5));
        assertEquals(0, sumToN(0));
        assertEquals(1, sumToN(1));
    }

    // Угадай число
    public String guessNumber(int guessed, int actual) {
        return null;
    }

    @Test
    public void testGuessNumber() {
        assertEquals("Too high", guessNumber(10, 5));
        assertEquals("Too low", guessNumber(1, 5));
        assertEquals("Correct", guessNumber(5, 5));
    }

    //Таблица умножения
    public int[] multiplicationTable(int number) {
        //todo
        return new int[1];
    }

    @Test
    public void testMultiplicationTable() {
        assertArrayEquals(new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}, multiplicationTable(2));
        assertArrayEquals(new int[]{5, 10, 15, 20, 25, 30, 35, 40, 45, 50}, multiplicationTable(5));
    }

    //Фибоначчи
    public int[] fibonacci(int n) {
        int[] fib = new int[n];
        return fib;
    }

    @Test
    public void testFibonacci() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 3, 5, 8}, fibonacci(7));
        assertArrayEquals(new int[]{0}, fibonacci(1));
        assertArrayEquals(new int[]{}, fibonacci(0));
    }

    public int[] primesUpTo(int n) {
    return new int[0];
    }

    @Test
    public void testPrimesUpTo() {
        assertArrayEquals(new int[]{2, 3, 5, 7}, primesUpTo(10));
        assertArrayEquals(new int[]{}, primesUpTo(1));
        assertArrayEquals(new int[]{2}, primesUpTo(2));
    }

}