package design.demo.decorator;

import design.demo.decorator.component.FastFood;
import design.demo.decorator.component.FriedNoodles;

public class Client {

    public static void main(String[] args) {
        // 单纯点一份炒面
        FastFood fastFood = new FriedNoodles();
        System.out.println(fastFood.getName() + "   " + fastFood.cost() + "元");

        System.out.println("---------------------");
        // 在炒面的基础上，加一个鸡蛋
        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getName() + "   " + fastFood.cost() + "元");

        System.out.println("---------------------");
        // 再加一个培根
        fastFood = new Bacon(fastFood);
        System.out.println(fastFood.getName() + "   " + fastFood.cost() + "元");
    }

}
