package com;

public class Totalsalary {
    public double salary;
    public double installment;

    public Totalsalary(double salary, double installment){
        this.salary =salary;
        this.installment= installment;
    }
    public double salaryEvaluation(){
        double finalsalary= salary-installment;
        return finalsalary;
    }
}
