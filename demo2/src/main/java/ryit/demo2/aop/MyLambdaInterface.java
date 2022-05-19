package ryit.demo2.aop;

import jdk.nashorn.internal.objects.annotations.Function;

import java.util.HashMap;

@FunctionalInterface
public interface MyLambdaInterface {
    String getStudent(String num);
}
