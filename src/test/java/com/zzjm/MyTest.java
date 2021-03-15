package com.zzjm;

//import com.zzjm.ba01.Student;
import com.zzjm.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void componentTest(){
        String config="applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        Student student= (Student) applicationContext.getBean("mystudent");
        System.out.println(student);
    }
    @Test
    public void Test01(){
        String config="applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        Student student= (Student) applicationContext.getBean("student");
        System.out.println(student);
    }
}
