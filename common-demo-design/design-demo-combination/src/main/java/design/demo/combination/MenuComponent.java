package design.demo.combination;

public abstract class MenuComponent {

    /**
     * 菜单名称
     */
    protected final String name;
    /**
     * 菜单级别
     */
    protected final int level;

    public MenuComponent(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void add(MenuComponent child) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent child) {
        throw new UnsupportedOperationException();
    }

    /**
     * 打印当前菜单以及子菜单的名称
     */
    public abstract void print();

}
