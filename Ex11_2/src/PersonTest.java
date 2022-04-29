import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class PersonTest {

    protected String name = "Lucas LaPlaunt";
    protected String address = "467 Waymarket Dr";
    protected String phoneNumber = "734-658-7054";
    protected String email = "llaplaun@emcih.edu";
    
    @Test
    void testgetName() {
    	
    	assertEquals(name, "Lucas LaPlaunt");
    	
    }
    
    @Test
    void testgetAddress() {

    	assertEquals(address, "467 Waymarket Dr");
    	
    }

    @Test
    void testgetPhoneNumber() {

    	assertEquals(phoneNumber, "734-658-7054");
    	
    }

    @Test
    void testgetEmail() {

    	assertEquals(email, "llaplaun@emcih.edu");
    	
    }
}