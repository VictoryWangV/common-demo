package design.demo.adapter.goal;

/**
 * 具体的SD卡
 */
public class SDCardImpl implements SDCard {

    private String msg;

    @Override
    public String readSD() {
        return "从SD卡中读取数据: " + msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("向SD卡中写入数据: " + msg);
        this.msg = msg;
    }
}
