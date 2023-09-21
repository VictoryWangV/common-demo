package design.demo.combination;

public class Client {

    public static void main(String[] args) {
        MenuComponent top = new Menu("系统管理", 0);

        MenuComponent menu1 = new Menu("菜单管理", 1);
        MenuComponent menu2 = new Menu("权限管理", 1);
        MenuComponent menu3 = new Menu("角色管理", 1);
        top.add(menu1);
        top.add(menu2);
        top.add(menu3);

        menu1.add(new MenuItem("页面访问", 2));
        menu1.add(new MenuItem("展开菜单", 2));
        menu1.add(new MenuItem("编辑菜单", 2));
        menu1.add(new MenuItem("删除菜单", 2));
        menu1.add(new MenuItem("新增菜单", 2));

        menu2.add(new MenuItem("页面访问", 2));
        menu2.add(new MenuItem("提交保存", 2));

        menu3.add(new MenuItem("页面访问", 2));
        menu3.add(new MenuItem("新增角色", 2));
        menu3.add(new MenuItem("修改角色", 2));

        top.print();
    }

}
