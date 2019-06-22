package org.pink;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicTranslateTest {

    private TranslateService tranalateService;
    @BeforeEach
    public void setup(){
        tranalateService = new TranslateService();
    }

    @TestFactory
    public Stream<DynamicTest> tranlateee(){
        List<String> in = new ArrayList<>(Arrays.asList("hello","yes","thankyou"));
        List<String> out = new ArrayList <>(
                Arrays.asList("qq","ww","ee")
        );

        return in.stream().map(word ->
                DynamicTest.dynamicTest("Test translate" + word,
                        () ->{
                            int idx = in.indexOf(word);
                            assertEquals(out.get(idx),tranalateService.translate(word));
                        }
                ));
    }
}
