package design.demo.iterator;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        Container<String> container = new NameRepository();

        for(Iterator<String> iter = container.getIterator(); iter.hasNext();){
            String name = iter.next();
            System.out.println("Name : " + name);
        }
    }

}
