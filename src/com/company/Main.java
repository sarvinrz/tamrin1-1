package com.company;

import com.Totalsalary;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter salary: ");
        String str =scanner.nextLine();
        double salary=Double.parseDouble(str);
        System.out.println("salary is : "+salary);

        System.out.println("enter installment: ");

        String str1 =scanner.nextLine();
        double installment=Double.parseDouble(str1);
        System.out.println("installment is : "+installment);

        Totalsalary totalsalary= new Totalsalary(salary,installment);
        System.out.println("total salary is :"+ totalsalary
                .salaryEvaluation());
    }
}
