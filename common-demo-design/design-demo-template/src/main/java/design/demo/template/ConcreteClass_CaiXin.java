package design.demo.template;

public class ConcreteClass_CaiXin extends AbstractClass {

    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的调料是蒜蓉");
    }
}
