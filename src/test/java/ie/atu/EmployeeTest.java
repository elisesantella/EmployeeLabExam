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
        Employee newEmployee = new Employee("elise");
        assertEquals("elise", newEmployee.getName());
    }

    @Test
    void testEmployeeNameMinFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee ("el");});
        assertEquals("Name is invalid! Must be between 5 -22 characters", exMessage.getMessage());
    }

    @Test
    void testEmployeeNameMaxFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee ("elisereneelouisesantella");});
        assertEquals("Name is invalid! Must be between 5 -22 characters", exMessage.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}