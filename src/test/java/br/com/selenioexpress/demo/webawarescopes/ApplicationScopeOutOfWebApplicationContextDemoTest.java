package br.com.selenioexpress.demo.webawarescopes;

import br.com.selenioexpress.demo.FactoryBean;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationScopeOutOfWebApplicationContextDemoTest {

    /**
     * The exception IllegalStateException is thrown because is not possible to create a application scope bean for a non web application.
     */
    @Test
    public void testApplicationBeanScopeInjection() {
        assertThrows(IllegalStateException.class, () -> FactoryBean.getBean(ApplicationScopeOutOfWebApplicationContextDemo.class));
    }
}