package studentregistrationsystem;

/**
 * @created 03/10/2017
 * @author Marta Olszewska 13101828
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Module {

    public String moduleName;
    public String moduleID;
    private final HashMap<Integer, Student> students = new HashMap();

    public Module(final String name, final String id) {
        this.moduleName = name;
        this.moduleID = id;
    }

    public String getModuleName() {
        return moduleName;
    }
    
    public String getModuleID() {
        return moduleID;
    }

    public void addStudent(final Student student) {
        this.students.put(student.getStudentID(), student);
        student.addModule(this);
    }

    public ArrayList<Student> getStudents() {
        return new ArrayList (students.values());
    }

    @Override
    public String toString() {
        return this.moduleID + " - " + this.moduleName;
    }
}
