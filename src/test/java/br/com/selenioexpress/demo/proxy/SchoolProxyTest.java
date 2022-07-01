package br.com.selenioexpress.demo.proxy;

import br.com.selenioexpress.demo.FactoryBean;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SchoolProxyTest {

    @Test
    public void testStudentInstanceOfSchool() {
        final School school1 = FactoryBean.getBean(School.class);
        final School school2 = FactoryBean.getBean(School.class);

        assertEquals(school1, school2);

        final Student student1 = school1.getStudent();
        final Student student2 = school2.getStudent();

        assertNotEquals(student1.getName(), student2.getName());
    }

}
