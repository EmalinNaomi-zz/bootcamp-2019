
package com.manchesterdigital;


public class BakingExample {

    public static void main(String[] args) {
        switchOvenOn(6);

    }
    protected void decorate(){
        System.out.println("Decorating cake ..");
    }
    protected static int switchOvenOn(int setting) {
        System.out.println("Setting Oven On To Level " + setting);

        int minutesToCook = 0;

    switch (setting){
        case 1:
            System.out.println("Set Level To 1");
            minutesToCook += 20;
            break;
        case 2:
            System.out.println("Set Level To 2");
            minutesToCook += 30;
        case 3:
            System.out.println("Set Level To 3");
            minutesToCook += 40;
            break;
        case 4:
            System.out.println("Set Level To 4");
            minutesToCook += 50;
            break;
        case 5:
            System.out.println("Set Level To 5");
            minutesToCook += 60;

            break;
        default:
    }
    return minutesToCook;

    }


    private static void produceMixture(){
        System.out.println("Mixing....");
    }
}
