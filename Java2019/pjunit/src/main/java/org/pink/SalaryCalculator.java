package org.pink;

public class SalaryCalculator {
    private double basicSalary;

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public SalaryCalculator() {
        if(basicSalary < 0){
            throw new IllegalArgumentException("Negative salary");
        }
        this.basicSalary = basicSalary;
    }

    public double getGrossSalary(){
        double resert = this.basicSalary + getSocialInsurance() + getAllowance();
        if(resert > 12000){
            resert -= 50;
        }
        return resert;
    }

    private double getAllowance() {
        return this.basicSalary/10;
    }

    private double getSocialInsurance() {
        return this.basicSalary * 0.25;
    }


}
