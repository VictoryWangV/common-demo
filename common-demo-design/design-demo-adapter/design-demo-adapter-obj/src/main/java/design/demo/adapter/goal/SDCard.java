package design.demo.adapter.goal;

/**
 * 目标接口
 */
public interface SDCard {

    /**
     * 从SD卡中读取数据
     * @return
     */
    String readSD();

    /**
     * 向SD卡中写入数据
     */
    void writeSD(String msg);

}
