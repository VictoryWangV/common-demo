package common.demo.spi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * 使用{@link ServiceLoader}去构建{@link Log}对象
 */
public class LogProvider {

    public static Log getLogger() {
        Class<Log> aClass = Log.class;
        ServiceLoader<Log> loader = ServiceLoader.load(aClass);
        List<Log> list = new ArrayList<>();
        for (Log value : loader) {
            list.add(value);
        }

        if (list.isEmpty()) {
            System.err.printf("%s没有对应的实现类%n", aClass.getName());
            // 返回空实现
            return new NOPLog();
        } else if (list.size() > 1) {
            System.err.printf("%s存在多个对应的实现类: %n", aClass.getName());
            for (Log log : list) {
                System.err.printf("└- %s%n", log.getClass().getName());
            }
        }
        return list.get(0);
    }

}
