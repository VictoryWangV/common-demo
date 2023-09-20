package design.demo.facade;

import design.demo.facade.appliances.SmartAppliances;

public class Client {

    public static void main(String[] args) {
        SmartAppliances appliance = new SmartAppliances();
        appliance.say("打开");
        System.out.println("-----------------");
        appliance.say("关闭");
    }

}
