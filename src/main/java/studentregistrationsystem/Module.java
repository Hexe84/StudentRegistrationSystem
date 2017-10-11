package studentregistrationsystem;

/**
 * @created 03/10/2017
 * @author Marta Olszewska 13101828
 */

import java.util.ArrayList;
//import java.util.HashMap;

public class Module {

    public String moduleName;
    public String moduleID;
    private final ArrayList students = new ArrayList();

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
        this.students.add(student);
        student.addModule(this);
    }

    public ArrayList<Student> getStudents() {
        return students;
        //return this.students;
    }

    @Override
    public String toString() {
        return this.moduleID + " - " + this.moduleName;
    }
}
