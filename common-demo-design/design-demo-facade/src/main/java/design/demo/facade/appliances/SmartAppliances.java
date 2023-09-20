package design.demo.facade.appliances;

import java.util.ArrayList;
import java.util.List;

/**
 * 智能家电
 */
public class SmartAppliances {

    private final List<Appliance> appliances = new ArrayList<>();

    public SmartAppliances() {
        appliances.add(new TV());
        appliances.add(new Light());
        appliances.add(new AirCondition());
    }

    public void say(String msg) {
        if (msg.contains("打开")) {
            on();
        } else if (msg.contains("关闭")) {
            off();
        } else {
            System.out.println("无法识别");
        }
    }

    private void on() {
        for (Appliance appliance : appliances) {
            appliance.on();
        }
    }

    private void off() {
        for (Appliance appliance : appliances) {
            appliance.off();
        }
    }

}
