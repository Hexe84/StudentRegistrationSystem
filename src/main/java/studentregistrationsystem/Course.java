package studentregistrationsystem;

/**
 * @created 03/10/2017
 * @author Marta Olszewska 13101828
 */

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormat;
import java.util.ArrayList;
import java.util.HashMap;


public class Course {

    private final DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-mm-yyyy");
    private final String courseName;
    private final HashMap<Module, String> modules = new HashMap();
    private final HashMap<Student, Integer> students = new HashMap();
    private final LocalDate startDate;
    private final LocalDate endDate;

    public Course(final String courseName, final String startDate, final String endDate) {
        this.courseName = courseName;
        this.startDate = this.formatter.parseLocalDate(startDate);
        this.endDate = formatter.parseLocalDate(endDate);
    }
    
    public String getCourseName() {
        return this.courseName;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }

    public void addModule(final Module module) {
        this.modules.put(module, module.getModuleID());
        for (final Student student : module.getStudents()) {
            students.put(student, student.getStudentID());
            student.setCourse(this);
        }
    }

    public ArrayList<Module> getModules() {
        return new ArrayList (modules.values());
    }

    public ArrayList<Student> getStudents() {
        return new ArrayList (students.values());
    }

    @Override
    public String toString() {
        return this.courseName + "\nCourse Dates:\t" + this.startDate.toString() + " - " + this.endDate.toString();
    }
}
