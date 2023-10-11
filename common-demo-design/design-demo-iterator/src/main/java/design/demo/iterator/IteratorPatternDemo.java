package design.demo.iterator;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        Iterable<String> iterable = new NameRepository();

        for (String name : iterable) {
            System.out.println("Name : " + name);
        }
    }

}
