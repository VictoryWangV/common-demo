package design.demo.combination;

public class MenuItem extends MenuComponent {

    public MenuItem(String name, int level) {
        super(name, level);
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
    }
}
