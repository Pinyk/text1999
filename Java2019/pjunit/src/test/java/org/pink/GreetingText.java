package org.pink;


import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitPlatform.class)
public class GreetingText {

    @Test
    public void testSayHello(){
        Greeting greeting = new Greeting();
        assertEquals(greeting.sayHello(),"what's up");
    }
}
