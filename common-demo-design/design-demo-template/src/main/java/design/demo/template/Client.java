package design.demo.template;

public class Client {

    public static void main(String[] args) {
        {
            AbstractClass clazz = new ConcreteClass_BaoCai();
            clazz.cookProcess();
        }
        System.out.println("---------------");
        {
            AbstractClass clazz = new ConcreteClass_CaiXin();
            clazz.cookProcess();
        }
    }

}
