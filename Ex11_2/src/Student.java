public class Student extends Person {

    public static final String FIRSTYEAR = "FIRSTYEAR";
    public static final String SECONDYEAR = "SECONDYEAR";
    public static final String THIRDYEAR = "THIRDYEAR";
    public static final String FOURTHYEAR = "FOURTHYEAR";

    protected String status;

    public Student(String name) {
        super(name);
    }

    public Student(String name, String status) {
        super(name);
        this.status = status;
        
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Class: " + this.getClass().getName();
    }
}