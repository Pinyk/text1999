package org.pink;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitPlatform.class)
public class TranalateServiceTest {
    private TranslateService tranalateServiceTest;

    @BeforeEach
    public void setup(){
        tranalateServiceTest = new TranslateService();
    }

    @Test
    public void testtranalateHello(){
        assertEquals("Bonjour",tranalateServiceTest.translate("hello"));
    }
}
