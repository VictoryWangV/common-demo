package design.demo.adapter.adaptee;

/**
 * 适配者类
 */
public class TFCardImpl implements TFCard {

    private String msg;

    @Override
    public String readTF() {
        return "从TF卡中读取数据: " + msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("向TF卡中写入数据: " + msg);
        this.msg = msg;
    }
}
