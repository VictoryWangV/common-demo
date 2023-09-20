package design.demo.facade.appliances;

public class Light implements Appliance {

    @Override
    public void on() {
        System.out.println("开启电灯...");
    }

    @Override
    public void off() {
        System.out.println("关闭电灯...");
    }
}
