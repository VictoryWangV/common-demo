package design.demo.adapter.Adaptee;

/**
 * 适配者类的接口
 */
public interface TFCard {

    /**
     * 从TF卡中读取数据
     * @return
     */
    String readTF();

    /**
     * 向TF卡中写数据
     * @param msg
     */
    void writeTF(String msg);

}
