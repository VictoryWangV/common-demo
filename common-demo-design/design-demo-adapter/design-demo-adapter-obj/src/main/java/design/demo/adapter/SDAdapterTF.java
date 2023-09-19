package design.demo.adapter;

import design.demo.adapter.Adaptee.TFCard;
import design.demo.adapter.goal.SDCard;

/**
 * 适配器类<br/>
 * 该类实现了{@link SDCard}接口，以便于能被{@link Computer}对象识别
 */
public class SDAdapterTF implements SDCard {

    /**
     * 适配者类接口<br/>
     * 适配器类内部聚合了{@link TFCard}对象
     */
    private final TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("使用适配器读取TF卡中数据");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("使用适配向TF卡中写入数据");
        tfCard.writeTF(msg);
    }
}
