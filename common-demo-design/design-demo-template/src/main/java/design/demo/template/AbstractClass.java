package design.demo.template;

public abstract class AbstractClass {

    /**
     * 模板方法定义
     * 定位为final，避免子类重写
     */
    public final void cookProcess() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    public void pourOil() {
        System.out.println("倒油");
    }

    public void heatOil() {
        System.out.println("热油");
    }

    /**
     * 倒入蔬菜
     */
    public abstract void pourVegetable();

    /**
     * 倒入调味品
     */
    public abstract void pourSauce();

    public void fry() {
        System.out.println("翻炒");
    }

}
