package com.example.demo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DemoApplicationTests {
     	
   String message = "Hello World";	

   @Test
   public void testPrintMessage() {
      assertEquals("Hello World", message);
   }

}
