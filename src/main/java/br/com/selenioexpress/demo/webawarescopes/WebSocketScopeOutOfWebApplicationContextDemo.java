package br.com.selenioexpress.demo.webawarescopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("websocket")
public class WebSocketScopeOutOfWebApplicationContextDemo {
}
