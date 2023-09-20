package design.demo.bridge;

import design.demo.bridge.operating.Linux;
import design.demo.bridge.operating.OperatingSystem;
import design.demo.bridge.operating.Windows;
import design.demo.bridge.video.AviFile;
import design.demo.bridge.video.DvdFile;

public class Client {

    public static void main(String[] args) {
        OperatingSystem system = new Windows(new AviFile());
        system.play("《西部世界》");

        system = new Linux(new DvdFile());
        system.play("《绝命毒师》");
    }

}
