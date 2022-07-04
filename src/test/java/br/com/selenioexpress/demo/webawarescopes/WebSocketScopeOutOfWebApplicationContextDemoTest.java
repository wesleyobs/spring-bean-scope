package br.com.selenioexpress.demo.webawarescopes;

import br.com.selenioexpress.demo.FactoryBean;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebSocketScopeOutOfWebApplicationContextDemoTest {
    /**
     * The exception IllegalStateException is thrown because is not possible to create a web socket s cope bean for a non web application.
     */
    @Test
    public void testWebSocketBeanScopeInjection() {
        assertThrows(IllegalStateException.class, () -> FactoryBean.getBean(WebSocketScopeOutOfWebApplicationContextDemo.class));
    }
}