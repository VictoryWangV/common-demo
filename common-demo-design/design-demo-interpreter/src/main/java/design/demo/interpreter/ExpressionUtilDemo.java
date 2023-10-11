package design.demo.interpreter;

import cn.hutool.core.lang.Dict;
import cn.hutool.extra.expression.ExpressionUtil;

/**
 * hutool工具包中{@link ExpressionUtil}工具类的示例<br/>
 * <a href="https://doc.hutool.cn/pages/ExpressionUtil/#%E4%BB%8B%E7%BB%8D">参考官网文档</a>
 */
public class ExpressionUtilDemo {

    public static void main(String[] args) {
        final Dict dict = Dict.create()
                .set("a", 1)
                .set("b", 2)
                .set("c", 3);

        // -143.8
        final Object eval = ExpressionUtil.eval("a-(b-c)", dict);
        System.out.println(eval);
        System.out.println(ExpressionUtil.eval("a-b-c", dict));
    }

}
