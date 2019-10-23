package com.company;

import component.Beverage;
import component.DarkRoast;
import component.Espresso;
import component.HouseBlend;
import decorator.Mocha;
import decorator.Soy;
import decorator.Water;
import decorator.Whip;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new Espresso();
        beverage3 = new Water(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());



    }
}
