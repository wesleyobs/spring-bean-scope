package br.com.selenioexpress.demo.webawarescopes;

import br.com.selenioexpress.demo.FactoryBean;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class RequestScopeOutOfWebApplicationContextDemoTest {
    /**The exception IllegalStateException is thrown because is not possible to create a request scope bean for a non web application.*/
    @Test
    public void testRequestBeanScopeInjection() {
        assertThrows(IllegalStateException.class, () -> FactoryBean.getBean(RequestScopeOutOfWebApplicationContextDemo.class));
    }
}
