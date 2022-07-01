package br.com.selenioexpress.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonDemoTest {

    @Test
    public void testSingletonBean() {
        final SingletonDemo bean1 = FactoryBean.getBean(SingletonDemo.class);
        final SingletonDemo bean2 = FactoryBean.getBean(SingletonDemo.class);
        assertEquals(bean1, bean2);
    }


}
