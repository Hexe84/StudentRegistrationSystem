package studentregistrationsystem;

/**
 * @created 03/10/2017
 * @author Marta Olszewska 13101828
 */


import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormat;
import java.util.ArrayList;

public class Student {

    private final DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-mm-yyyy");
    private final ArrayList<Module> modules = new ArrayList();
    private Course course;

    private final String studentName;
    private final int studentID;
    private final LocalDate dob;
    private final String username;

    public Student(final String name, final String dob, final int id) {
        this.studentName = name;
        this.dob = formatter.parseLocalDate(dob);
        this.studentID = id;
        this.username = setUsername();
    }

    public String getStudentName() {
        return this.studentName;
    }

    public LocalDate getDOB() {
        return this.dob;
    }
    
    public String getAge() {
        return Integer.toString(new LocalDate().now().getYear() - dob.getYear());
    }
    
    public int getStudentID() {
        return this.studentID;
    }
    
    public String setUsername() {
        return this.studentName.replace(" ", "") + getAge();
    }
        
    public String getUsername() {
        return this.username;
    }
    
    public void setCourse(final Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return this.course;
    }

    public void addModule(final Module module) {
        modules.add(module);
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    @Override
    public String toString() {
        return this.studentName + " - " + this.studentID;
    }
}