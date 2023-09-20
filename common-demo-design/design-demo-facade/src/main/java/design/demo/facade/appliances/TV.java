package design.demo.facade.appliances;

public class TV implements Appliance {

    @Override
    public void on() {
        System.out.println("开启电视机...");
    }

    @Override
    public void off() {
        System.out.println("关闭电视机...");
    }
}
