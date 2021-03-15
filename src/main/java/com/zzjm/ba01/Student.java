package com.zzjm.ba01;


import org.springframework.stereotype.Component;

/**
 * @Component:创建对象的等同于<bean></bean>的功能
 *         属性value：等同于bean中的id的值
 *         value的值是唯一的，在整个spring容器中就一个，位置在类上面
 *         @Component(value = "mystudent")等同于<bean id="mystudent" class="com.zzjm.ba01.Student"></bean>
 * @Component的三种赋值方式：
 * 1.value赋值方式
 * @Component(value = "mystudent")
 * 2.省略value方式
 * @Component（“mystudent”）
 * 3.不指定对象名称，有spring提供默认名称，对象名称为类名的首字母小写
 *@Component
 *
 *
 *
 * spring中和@Component功能一样，创建对象的注解有：
 * @respository(应用在持久层类的上面)：放在dao的实现类上面，表示创建dao对象，dao对象是可以访问数据库的
 * @service（应用在业务层上面）：放在service的实现类上面，创建service对象，service对象是业务处理，可以有事务等功能；
 * @controller(应用在控制器上面放在控制器类上面（处理器）创建控制器类对象，控制器对象可以处理用户提交的参数，显示请求的处理结果)
 * 以上三种注解的使用语法和@Component一样，都能创建对象，但这三种注解还有额外的功能
 * @respository，@respository，@controller是给项目对象分层的
*/

@Component(value = "mystudent")
public class Student {
    private String Name;
    private int age;

    public Student() {
        System.out.println("==执行无参构造==");
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
