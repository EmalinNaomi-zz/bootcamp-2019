package com.manchesterdigital;

public class CarDealershipRewards {
    public static void main(String[] args) {
        boolean taxYearEnded = true;
        int baseSalary = 2000;
        int numberOfSales = 1000;
        double commisionRate = 3.0;
        int bonus = 1000;

        if (taxYearEnded) {
            double totalSalary = baseSalary + (numberOfSales * commisionRate);

            if (numberOfSales > 500) {
                totalSalary += bonus;

                System.out.println("Total salary is (after bonus)");
            }
        }

                numberOfSales = 300;
                baseSalary = 250000;
                commisionRate = 2.0;
                if (taxYearEnded) {
                    double totalSalary = baseSalary + (numberOfSales * commisionRate);

                    System.out.println("Total salary is: " + totalSalary);

                }
            }

        }



