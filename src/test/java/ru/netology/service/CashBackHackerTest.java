package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashBackHackerTest {

    @org.junit.Test
    public void testRemain () {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);

        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainWithCashback () {
        CashbackHackService service = new CashbackHackService();
        int amount = 400;
        int actual = service.remain(amount);

        int expected = 600;
        assertEquals(expected, actual);
    }

}