package ru.renicheronte.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        UserBean userBean = applicationContext.getBean("userBean", UserBean.class);
        System.out.println(userBean.getName());

        applicationContext.close();
    }
}
