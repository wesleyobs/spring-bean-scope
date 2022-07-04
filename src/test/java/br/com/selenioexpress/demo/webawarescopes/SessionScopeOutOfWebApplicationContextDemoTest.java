package br.com.selenioexpress.demo.webawarescopes;

import br.com.selenioexpress.demo.FactoryBean;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SessionScopeOutOfWebApplicationContextDemoTest {

    /**
     * The exception IllegalStateException is thrown because is not possible to create a session scope bean for a non web application.
     */
    @Test
    public void testSessionBeanScopeInjection() {
        assertThrows(IllegalStateException.class, () -> FactoryBean.getBean(SessionScopeOutOfWebApplicationContextDemo.class));
    }

}