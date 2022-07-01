package br.com.selenioexpress.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PrototypeDemoTest {

    @Test
    public void testPrototypeBean() {
        final PrototypeDemo bean1 = FactoryBean.getBean(PrototypeDemo.class);
        final PrototypeDemo bean2 = FactoryBean.getBean(PrototypeDemo.class);

        assertNotEquals(bean1, bean2);
    }
}
