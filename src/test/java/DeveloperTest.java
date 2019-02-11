

import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Bob White", "JD145654", 40000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Bob White", developer.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("JD145654", developer.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(40000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetSalaryRise(){
        developer.raiseSalary(600.00);
        assertEquals(40600.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        developer.payBonus();
        assertEquals(400.00, developer.payBonus(), 0.01);
    }
}
