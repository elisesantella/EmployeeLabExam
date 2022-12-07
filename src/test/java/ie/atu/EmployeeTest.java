package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testEmployeeNameSuccess(){
        Employee newEmployee = new Employee("elise", "123456", "08301529260", "Man", "Full-Time", 23);
        assertEquals("elise", newEmployee.getName());
    }

    @Test
    void testEmployeeNameMinFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee ("el", "123456", "08301529260", "Man", "Full-Time", 23);});
        assertEquals("Name is invalid! Must be between 5 -22 characters", exMessage.getMessage());
    }

    @Test
    void testEmployeeNameMaxFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee ("elisereneelouisesantella", "123456", "08301529260", "Man", "Full-Time", 23);});
        assertEquals("Name is invalid! Must be between 5 -22 characters", exMessage.getMessage());
    }

    @Test
    void testEmployeePPSSuccess(){
        Employee newEmployee = new Employee("elise", "123456", "08301529260", "Man", "Full-Time", 23);
        assertEquals("123456", newEmployee.getPPS());
    }

    @Test
    void testEmployeePPSFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee ("elise", "123", "08301529260", "Man", "Full-Time", 23);});
        assertEquals("PPS ID invalid! Must be 6 characters long", exMessage.getMessage());
    }

    @Test
    void testEmployeePhoneSuccess(){
        Employee newEmployee = new Employee("elise", "123456", "08301529260", "Man", "Full-Time", 23);
        assertEquals("08301529260", newEmployee.getPhone());
    }

    @Test
    void testEmployeePhoneFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee ("elise", "123456", "083015", "Man", "Full-Time", 23);});
        assertEquals("Phone number invalid! Must be 11 characters long", exMessage.getMessage());
    }

    @Test
    void testEmployeeGenderManSuccess(){
        Employee newEmployee = new Employee("elise", "123456", "08301529260", "Man", "Full-Time", 23);
        assertEquals("Man", newEmployee.getGender());
    }

    @Test
    void testEmployeeGenderWomanSuccess(){
        Employee newEmployee = new Employee("elise", "123456", "08301529260", "Woman", "Full-Time", 23);
        assertEquals("Woman", newEmployee.getGender());
    }

    @Test
    void testEmployeeGenderNonBinarySuccess(){
        Employee newEmployee = new Employee("elise", "123456", "08301529260", "Non-Binary", "Full-Time", 23);
        assertEquals("Non-Binary", newEmployee.getGender());
    }

    @Test
    void testEmployeeGenderFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee ("elise", "123456", "08301529260", "Goose", "Full-Time", 23);});
        assertEquals("Gender is invalid! Options are Man, Woman or Non-Binary", exMessage.getMessage());
    }

    @Test
    void testEmployeeTypeFullTimeSuccess(){
        Employee newEmployee = new Employee("elise", "123456", "08301529260", "Man", "Full-Time", 23);
        assertEquals("Full-Time", newEmployee.getType());
    }

    @Test
    void testEmployeeTypePartTimeSuccess(){
        Employee newEmployee = new Employee("elise", "123456", "08301529260", "Man", "Part-Time", 23);
        assertEquals("Part-Time", newEmployee.getType());
    }

    @Test
    void testEmployeeTypeFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee ("elise", "123456", "08301529260", "Man", "Temp", 23);});
        assertEquals("Employment Type is invalid! Options Full-Time or Part-Time", exMessage.getMessage());
    }

    @Test
    void testEmployeeAgeSuccess(){
        Employee newEmployee = new Employee("elise", "123456", "08301529260", "Man", "Full-Time", 23);
        assertEquals("23", newEmployee.getAge());
    }

    @Test
    void testEmployeeAgeFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee ("elise", "123456", "08301529260", "Man", "Full-Time", 15);});
        assertEquals("Age invalid! Must be over 18", exMessage.getMessage());
    }



    @AfterEach
    void tearDown() {
    }
}