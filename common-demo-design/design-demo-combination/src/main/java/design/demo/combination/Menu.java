package design.demo.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单
 */
public class Menu extends MenuComponent {

    private final List<MenuComponent> children = new ArrayList<>();

    public Menu(String name, int level) {
        super(name, level);
    }

    @Override
    public void add(MenuComponent child) {
        children.add(child);
    }

    @Override
    public void remove(MenuComponent child) {
        children.remove(child);
    }

    @Override
    public void print() {
        if (level > 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print(" ");
            }
            System.out.print("└┴");
        }
        System.out.println(name);

        for (MenuComponent child : children) {
            child.print();
        }
    }
}
