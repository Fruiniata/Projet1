package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AppTest {

    @Test
    public void testAddition() {
        App app = new App();
        int result = app.addition(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        App app = new App();
        int result = app.addition(-1, -1);
        assertEquals(-2, result);
    }

    @Test
    public void testAdditionWithZero() {
        App app = new App();
        int result = app.addition(0, 5);
        assertEquals(5, result);
    }
}
