package br.com.selenioexpress.demo.lookup;

import br.com.selenioexpress.demo.FactoryBean;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SchoolLookupLabTest {

    @Test
    public void testStudentInstanceOfSchoolByLookup() {
        final SchoolLookupLab schoolLookup1 = FactoryBean.getBean(SchoolLookupLab.class);
        final SchoolLookupLab schoolLookup2 = FactoryBean.getBean(SchoolLookupLab.class);

        assertEquals(schoolLookup1, schoolLookup2);

        assertNotEquals(schoolLookup1.getStudent(), schoolLookup2.getStudent());

    }
}
