package design.dmeo.flyweight;

import lombok.Setter;

public class Circle implements Shape {

    /**
     * 颜色
     */
    private final String color;

    /**
     * X轴坐标
     */
    @Setter
    private int x;
    /**
     * Y轴坐标
     */
    @Setter
    private int y;
    /**
     * 半径
     */
    @Setter
    private int radius;


    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }
}
