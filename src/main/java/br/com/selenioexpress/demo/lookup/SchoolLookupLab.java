package br.com.selenioexpress.demo.lookup;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public abstract class SchoolLookupLab {
    private String name;
    @Autowired
    private StudentLookupLab studentLookupLab;


    public String getName() {
        return name;
    }

    /**
     * Spring will check that getStudent method is annotated as @lookup and is going to override this particular method on the runtime.
     * By the help of CGLIB(Spring core generation library), it will create a stub class of SchoolLookupLab on the runtime, and it is going to override this particular method (annotated with @Lookup),
     * and it is going to return the new instance of StudentLookupLab whenever its method be invoked.
     * <p>
     * Behind scene spring will do something like will be demonstrating bellow.
     *
     * @Lookup public StudentLookupLab getStudent() {
     * return (StudentLookupLab) this.applicationContext.getBean(StudentLookupLab.class);
     * }
     */
    @Lookup
    public abstract StudentLookupLab getStudent();


}
