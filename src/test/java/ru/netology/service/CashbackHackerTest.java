package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class CashbackHackerTest {
    CashbackHacker service = new CashbackHacker();

    @Test
    public void shouldCalculateIfAmountCorrect() {
        int amount = 5700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateIfAmountZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateIfAmount1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateIfAmountIncorrect() {
        int amount = -50000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}