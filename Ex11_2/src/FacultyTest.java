import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FacultyTest {
	
	public static String LECTURER = "Lecturer";
    public static String ASSISTANT_PROFESSOR = "Assistant Professor";
    public static String ASSOCIATE_PROFESSOR = "Associate Professor";
    public static String PROFESSOR = "Professor";

    protected String officeHours = "42.23";
    protected String rank = "Lecturer";

	@Test
	void testGetOfficeHours() {
		assertEquals(officeHours, "42.23");
	}

	@Test
	void testGetRank() {
		assertEquals(rank, "Lecturer");
	}

}
