import Staff.techStaff.DataBaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {

    DataBaseAdmin dataBaseAdmin;

    @Before
    public void before(){
        dataBaseAdmin = new DataBaseAdmin("Sally White", "JD145654", 35000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Sally White", dataBaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("JD145654", dataBaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(35000.00, dataBaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetSalaryRise(){
        dataBaseAdmin.raiseSalary(400.00);
        assertEquals(35400.00, dataBaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
        dataBaseAdmin.payBonus();
        assertEquals(350.00, dataBaseAdmin.payBonus(), 0.01);
    }
}
