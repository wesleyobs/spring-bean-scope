package br.com.selenioexpress.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class FactoryBean {
    private static final ApplicationContext context;

    static {
        context = new ClassPathXmlApplicationContext("file:src/main/resources/beans.xml");
    }

    public static <T> T getBean(final Class<T> clazz) {
        return context.getBean(clazz);
    }
}
