package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashBackHackTest {

    @org.testng.annotations.Test
    public void testRemain () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);

        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainWithCashback () {
        CashbackHackService service = new CashbackHackService();
        int amount = 400;
        int actual = service.remain(amount);

        int expected = 600;
        assertEquals(actual, expected);
    }

}