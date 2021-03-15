package com.zzjm.ba02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Value简单类型的属性赋值
 * 属性value的属性是string类型，表示简单类型的属性值
 * 位置：1.在属性第一的上面，无需set方法，推荐使用
 *      2.在set方法上面
 */
@Component
public class Student {
    @Value("张三")
    private String name;
    @Value("20")
    private int age;

    public Student() {
        System.out.println("==执行无参构造==");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
