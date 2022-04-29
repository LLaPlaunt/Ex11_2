import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

class MyDateTest2 {

	

	@Test
	void testGetYear() {
		GregorianCalendar cal = new GregorianCalendar();
		
		int year = cal.get(Calendar.YEAR);
		
		assertTrue(year == cal.get(Calendar.YEAR));
		
	}

	@Test
	void testGetMonth() {
		GregorianCalendar cal = new GregorianCalendar();
		
		int month = cal.get(Calendar.MONTH);
		
		assertTrue(month == cal.get(Calendar.MONTH));
		
	}

	@Test
	void testGetDay() {
		GregorianCalendar cal = new GregorianCalendar();
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		assertTrue(day == cal.get(Calendar.DAY_OF_MONTH));
		
	}

}
