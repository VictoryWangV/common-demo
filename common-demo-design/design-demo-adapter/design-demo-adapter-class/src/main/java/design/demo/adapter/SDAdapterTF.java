package design.demo.adapter;

import design.demo.adapter.adaptee.TFCardImpl;
import design.demo.adapter.goal.SDCard;

/**
 * 适配器类<br/>
 * SD卡适配TF
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        System.out.println("使用适配器读取TF卡中数据");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("使用适配向TF卡中写入数据");
        writeTF(msg);
    }
}
