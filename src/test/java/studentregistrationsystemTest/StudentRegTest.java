/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistrationsystemTest;

import org.junit.Test;
import static org.junit.Assert.*;
import studentregistrationsystem.Student;


/**
 *
 * @author Marta Olszewska 13101828
 *
 */
public class StudentRegTest {
    
    @Test
    public void studentIdTest() throws Exception {
        
        String studentName = "John Maven";
        String dob = "01-10-1984";
        int id = 841013;
        Student john = new Student(studentName, dob, id);
        final String expected = "JohnMaven33";
        assertEquals(expected, john.setUsername());
        
    }
    
}
