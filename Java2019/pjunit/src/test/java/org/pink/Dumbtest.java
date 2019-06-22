package org.pink;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

@RunWith(JUnitPlatform.class)
public class Dumbtest {
    private static Dumb dumb;

    @BeforeAll
    static void init(){
        dumb = new Dumb();
    }

    @Test
    void testSum(){
        assertTrue(dumb.sum(1,2,3) == 6,"sum should return 5");
    }

    @Test
    public void groupAssertions(){
        int [] numbers = dumb.getNumbers(0,1,3,5,8);
        assertAll("numbers",
                () -> assertEquals(numbers[0],0),
                () -> assertEquals(numbers[2],3),
                () -> assertEquals(numbers[4],8)
                );
    }

    @Test
    public void trueAssumption(){
        assumeTrue(12 > 0);
        assertEquals(dumb.sum(5,2),7);
    }

    @Test
    public void assumptionThat(){
        String sys = "MAC";
        assumingThat(
                sys.equals("WIN"),
                () ->assertEquals(dumb.sum(2+2),0)
        );

        assumingThat(
                sys.equals("MAC"),
                () -> System.out.println("success")
        );

    }
}
