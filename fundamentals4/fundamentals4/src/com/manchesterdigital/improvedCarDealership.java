package com.manchesterdigital;

public class improvedCarDealership {
    public static void main(String[] args) {
        boolean taxYearEnded = true;
        int baseSalary = 2000;
        int numberOfSales = 1000;
        double commisionRate = 3.0;
        int bonus = 1000;

        calcSalary(taxYearEnded, numberOfSales, baseSalary, commisionRate);

        numberOfSales = 300;
        baseSalary = 250000;
        commisionRate = 2.0;
    }

    private static void calcSalary(boolean taxYearEnd, int numberofSales,
                                   int baseSalary, double commissionRate){

        if (taxYearEnd){
            int bonus = 1000;
            double totalSalary = baseSalary;

            if (numberofSales > 500){
                totalSalary = baseSalary + (numberofSales * commissionRate);
                        totalSalary += bonus;
            }
            System.out.println("Total salary is: " + totalSalary);
        }


    }
}
