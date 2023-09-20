package common.demo.lambda;

public class Client {

    public static void main(String[] args) {
        print(() -> System.out.println("调用了: LambdaInterface.f()"));
    }

    private static void print(LambdaInterface lambdaInterface) {
        // 打印入参地址
        System.out.println(lambdaInterface);
        lambdaInterface.f();
    }

}