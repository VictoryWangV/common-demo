package design.dmeo.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private final Map<String, Circle> cache = new HashMap<>();

    private ShapeFactory() {
    }

    public static ShapeFactory getInstance() {
        return Holder.INSTANCE;
    }

    public Circle getCircle(String color) {
        Circle circle = cache.get(color);
        if (circle == null) {
            circle = new Circle(color);
            cache.put(color, circle);
        }
        return circle;
    }

    private static final class Holder {
        private static final ShapeFactory INSTANCE = new ShapeFactory();
    }

}
