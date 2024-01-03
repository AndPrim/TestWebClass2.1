package ru.nenology.web;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class DebetCardTest {


    @Test
    public void openShouidTest() throws InterruptedException {
        System.setProperty("selenide.headless", "true");
        open("http://0.0.0.0:9999");
        Thread.sleep(10000);
    }
}
