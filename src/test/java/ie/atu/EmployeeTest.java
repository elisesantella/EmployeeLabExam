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
        Employee newEmployee = new Employee("elise", "123456", "08301529260");
        assertEquals("elise", newEmployee.getName());
    }

    @Test
    void testEmployeeNameMinFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee ("el", "123456", "08301529260");});
        assertEquals("Name is invalid! Must be between 5 -22 characters", exMessage.getMessage());
    }

    @Test
    void testEmployeeNameMaxFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee ("elisereneelouisesantella", "123456", "08301529260");});
        assertEquals("Name is invalid! Must be between 5 -22 characters", exMessage.getMessage());
    }

    @Test
    void testEmployeePPSSuccess(){
        Employee newEmployee = new Employee("elise", "123456", "08301529260");
        assertEquals("123456", newEmployee.getPPS());
    }

    @Test
    void testEmployeePPSFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee ("elise", "123", "08301529260");});
        assertEquals("PPS ID invalid! Must be 6 characters long", exMessage.getMessage());
    }

    @Test
    void testEmployeePhoneSuccess(){
        Employee newEmployee = new Employee("elise", "123456", "08301529260");
        assertEquals("08301529260", newEmployee.getPhone());
    }

    @Test
    void testEmployeePhoneFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee ("elise", "123456", "083015");});
        assertEquals("Phone number invalid! Must be 11 characters long", exMessage.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}