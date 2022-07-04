package br.com.selenioexpress.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

public final class FactoryBean {
    private static final Map<BeansEnum, ApplicationContext> contextMap;

    static {
        contextMap = new HashMap<>();
        contextMap.put(BeansEnum.BEANS_1_DEFAULT, new ClassPathXmlApplicationContext("file:src/main/resources/beans1.xml"));
        contextMap.put(BeansEnum.BEANS_2, new ClassPathXmlApplicationContext("file:src/main/resources/beans2.xml"));
    }

    /**
     * Get Bean from default spring context file beans1.xml
     */
    public static <T> T getBean(final Class<T> clazz) {
        return getBean(clazz, BeansEnum.BEANS_1_DEFAULT);
    }

    /**
     * Get Bean from specific context
     */
    public static <T> T getBean(final Class<T> clazz, final BeansEnum beansEnum) {
        final ApplicationContext context = contextMap.get(beansEnum);
        return context.getBean(clazz);
    }
}
