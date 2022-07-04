package br.com.selenioexpress.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Spring singleton bean works fine inside a particular context running inside a java application, ie,
 * we can have more than one Spring Singleton Bean instance running inside a java application
 * if we load different contexts inside a Java Application, unlike what happens in a Singleton beans pattern
 * based on GOF book, that a bean can have only a single instance for all Java application lifecycle
 */
public class SpringSingletonVsGOFSingletonBeanTest {

    @Test
    public void testIfSingletonBeanRunningInsideDistinctsSpringContextsHasDifferentInstances() {
        final SingletonDemo singletonDemoBean1 = FactoryBean.getBean(SingletonDemo.class, BeansEnum.BEANS_1_DEFAULT);
        final SingletonDemo singletonDemoBean2 = FactoryBean.getBean(SingletonDemo.class, BeansEnum.BEANS_2);

        assertNotEquals(singletonDemoBean1, singletonDemoBean2);
    }

    @Test
    public void testIfSingletonBeanRunningInTheSameContextHasTheSameReference() {
        final SingletonDemo singletonDemoBean1 = FactoryBean.getBean(SingletonDemo.class, BeansEnum.BEANS_2);
        final SingletonDemo singletonDemoBean2 = FactoryBean.getBean(SingletonDemo.class, BeansEnum.BEANS_2);

        assertEquals(singletonDemoBean1, singletonDemoBean2);
    }
}
