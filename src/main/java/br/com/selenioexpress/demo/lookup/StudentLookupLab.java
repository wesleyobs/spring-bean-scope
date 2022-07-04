package br.com.selenioexpress.demo.lookup;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class StudentLookupLab {
    private String name;

    public StudentLookupLab() {
        //test different random names
        this.name = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

}
