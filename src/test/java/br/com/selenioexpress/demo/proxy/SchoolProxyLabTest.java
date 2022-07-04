package br.com.selenioexpress.demo.proxy;

import br.com.selenioexpress.demo.FactoryBean;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class SchoolProxyLabTest {

    @Test
    public void testStudentInstanceOfSchoolProxy() {
        final SchoolProxyLab schoolProxyLab1 = FactoryBean.getBean(SchoolProxyLab.class);
        final SchoolProxyLab schoolProxyLab2 = FactoryBean.getBean(SchoolProxyLab.class);

        assertEquals(schoolProxyLab1, schoolProxyLab2);

        final StudentProxyLab studentProxyLab1 = schoolProxyLab1.getStudent();
        final StudentProxyLab studentProxyLab2 = schoolProxyLab2.getStudent();

        assertNotEquals(studentProxyLab1.getName(), studentProxyLab2.getName());
    }

}
