package org.pink;


import org.junit.jupiter.api.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@RunWith(JUnitPlatform.class)
public class SalaryCalculatorTest {
    private SalaryCalculator salaryCalculator;

    @BeforeEach
    public void init(){
        salaryCalculator = new SalaryCalculator();
    }

    @Test
    public void testValidBasicSalary(){
        double basicSalary = 10000;
        salaryCalculator.setBasicSalary(basicSalary);

        assertEquals(salaryCalculator.getBasicSalary(),basicSalary);
        assertEquals(salaryCalculator.getGrossSalary(),13450);

        basicSalary = 8000;
        salaryCalculator.setBasicSalary(basicSalary);
        assertEquals(salaryCalculator.getGrossSalary(),10800);
    }

    @DisplayName("Invalid Basic Salary")
    @Test
    public void testInvalidBasicSalary(){
        double basicSalary = -200;
        assertThrows(
                IllegalArgumentException.class,
                () -> salaryCalculator.setBasicSalary(basicSalary)
        );
    }

    @AfterEach
    public void tearDown(){
        salaryCalculator = null;
    }
}
