import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

    protected double salary = 69000.0;
    protected String office = "IBM";
    protected MyDate dateHired;
    
	@Test
	void testGetSalary() {

		assertTrue(salary == 69000.0);
		
	}

	@Test
	void testGetOffice() {

		assertEquals(office, "IBM");
		
	}

	@Test
	void testGetDateHired() {

		Calendar calendar = GregorianCalendar.getInstance(), currenttime= GregorianCalendar.getInstance();
		
		assertFalse(currenttime == calendar);
	}

}
