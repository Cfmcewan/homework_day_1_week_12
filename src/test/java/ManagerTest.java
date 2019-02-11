import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob White", "JD145654", 30000.00, "HR");
    }

    @Test
    public void canGetDeptName(){
        assertEquals("HR", manager.getDeptName());
    }


    @Test
    public void canGetName() {
        assertEquals("Bob White", manager.getName());
    }

    @Test
    public void canChangeNameTrue(){
        manager.setName("Sam");
        assertEquals("Sam", manager.getName());
    }

    @Test
    public void canChangeNameFalse(){
        manager.setName(null);
        assertEquals("Bob White", manager.getName());
    }

    @Test
    public void canGetniNumber(){
        assertEquals("JD145654", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetSalaryRise(){
        manager.raiseSalary(500.00);
        assertEquals(30500.00, manager.getSalary(), 0.01);
    }

    @Test
    public void cannotGetSalaryRise(){
        manager.raiseSalary(-500.00);
        assertEquals(30000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        manager.payBonus();
        assertEquals(300.00, manager.payBonus(), 0.01);
    }
}
