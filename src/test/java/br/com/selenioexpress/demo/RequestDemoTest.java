package br.com.selenioexpress.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class RequestDemoTest {
    /**The exception IllegalStateException is throwed because is not possible to create a request scope bean for a non web application.*/
    @Test
    public void testRequestBeanInjection() {
        assertThrows(IllegalStateException.class, () -> FactoryBean.getBean(RequestDemo.class));
    }
}
