package design.demo.adapter;

import design.demo.adapter.goal.SDCard;

/**
 * 仅可以识别{@link SDCard}对象的计算机对象
 */
public class Computer {

    private final SDCard sdCard;

    public Computer(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public String read() {
        return sdCard.readSD();
    }

    public void write(String msg) {
        sdCard.writeSD(msg);
    }

}
