package br.com.selenioexpress.demo.proxy;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class School {
    private String name;
    @Autowired
    private Student student;


    public String getName() {
        return name;
    }

    public Student getStudent() {
        return student;
    }


}
