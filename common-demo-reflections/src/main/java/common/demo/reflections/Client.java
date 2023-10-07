package common.demo.reflections;

import lombok.extern.slf4j.Slf4j;
import org.reflections.Reflections;
import org.reflections.scanners.Scanners;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Slf4j
public class Client {

    public static void main(String[] args) {
        Reflections reflections = new Reflections("java.util", Scanners.SubTypes, Scanners.MethodsReturn);
        // 获取List接口的所有子类
        Set<Class<? extends List>> subTypesOfList = reflections.getSubTypesOf(List.class);
        for (Class<? extends List> aClass : subTypesOfList) {
            log.info(aClass.getName());
        }
        log.info("---------------");
        // 获取所有返回值为java.util.logging.Logger的函数
        Set<Method> methodsAnnotatedWithDeprecated = reflections.getMethodsReturn(Logger.class);
        for (Method method : methodsAnnotatedWithDeprecated) {
            String className = method.getDeclaringClass().getName();
            String methodName = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            String parameters = Arrays.stream(parameterTypes).map(Class::getName).collect(Collectors.joining(", "));
            log.info("{}#{}({})", className, methodName, parameters);
        }
    }

}
