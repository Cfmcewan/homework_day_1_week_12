import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Bob White", "JD145654", 70000.00, "HR", 900000.00);
    }

    @Test
    public void canGetBudget(){
        assertEquals(900000.00, director.getBudget(), 0.01);
    }


    @Test
    public void canGetDeptName(){
        assertEquals("HR", director.getDeptName());
    }


    @Test
    public void canGetName() {
        assertEquals("Bob White", director.getName());
    }

    @Test
    public void canGetniNumber(){
        assertEquals("JD145654", director.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(70000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetSalaryRise(){
        director.raiseSalary(5000.00);
        assertEquals(75000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        director.payBonus();
        assertEquals(1400.00, director.payBonus(), 0.01);
    }

}
