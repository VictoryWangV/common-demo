package design.demo.facade.appliances;

public class AirCondition implements Appliance {

    @Override
    public void on() {
        System.out.println("开启空调...");
    }

    @Override
    public void off() {
        System.out.println("关闭空调...");
    }
}
