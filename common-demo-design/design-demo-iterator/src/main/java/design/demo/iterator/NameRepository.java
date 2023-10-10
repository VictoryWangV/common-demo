package design.demo.iterator;

public class NameRepository implements Container<String> {

    public String[] names = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator<String> getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {

        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }

}
