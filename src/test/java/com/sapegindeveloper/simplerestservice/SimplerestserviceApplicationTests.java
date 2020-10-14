package com.sapegindeveloper.simplerestservice;

import com.sapegindeveloper.simplerestservice.controller.SimpleController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SimplerestserviceApplicationTests {

    @Test
    void contextLoads() {
        SimpleController restController = new SimpleController();
        String result = restController.getStringOk();
        assertEquals(result, "Ok!!!");
    }

}
