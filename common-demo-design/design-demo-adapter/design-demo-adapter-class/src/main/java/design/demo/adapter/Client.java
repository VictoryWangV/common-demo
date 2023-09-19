package design.demo.adapter;

import design.demo.adapter.goal.SDCardImpl;

public class Client {

    public static void main(String[] args) {
        {
            Computer computer = new Computer(new SDCardImpl());
            // 向SD卡中读写数据
            computer.write("SD数据内容");
            System.out.println(computer.read());
        }

        System.out.println("=========================");

        {
            Computer computer = new Computer(new SDAdapterTF());
            computer.write("TF数据内容");
            System.out.println(computer.read());
        }

    }

}
