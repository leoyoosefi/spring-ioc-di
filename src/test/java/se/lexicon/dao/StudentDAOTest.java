package se.lexicon.dao;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.Assert;
import se.lexicon.config.AppConfig;
import se.lexicon.exception.DataNotFoundException;
import se.lexicon.model.Student;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
public class StudentDAOTest {

    @Autowired
    private StudentDAO testObject;

    @BeforeEach
    public void setup(){
        testObject.save(new Student("Leo Yoosefi"));
    }

    @Test
    @DisplayName("Given student had been successfully created and are equal")
    void save(){
        Student expectedData = new Student(2,"Leo Yoosefi");
        Student actualData = testObject.save(new Student("Leo Yoosefi"));
        assertEquals(expectedData, actualData);
    }

    @Test
    void findById(){
        Student expectedDate = new Student(1,"Leo Yoosefi");
        try {
            Student actualData = testObject.find(1);
            assertEquals(expectedDate, actualData);
        } catch (DataNotFoundException e) {
            e.printStackTrace();
        }

    }
}
