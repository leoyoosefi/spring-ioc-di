package se.lexicon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.lexicon.dao.StudentDAO;
import se.lexicon.model.Student;
import se.lexicon.util.UserInputService;

@Component
public class StudentManagemenConsoletImp implements StudentManagement {

    UserInputService userInputService;
    StudentDAO studentDAO;

    @Autowired
    public StudentManagemenConsoletImp(UserInputService userInputService, StudentDAO studentDAO) {
        this.userInputService = userInputService;
        this.studentDAO = studentDAO;
    }

    @Override
    public Student create() {
        System.out.println("enter name");
        String name = userInputService.getString();
        Student student = new Student(name);
        Student savedData = studentDAO.save(student);
        return savedData;
    }

    @Override
    public Student save(Student student) {
        if (student == null) throw new IllegalArgumentException("student is null");
        studentDAO.save(student);
        return null;
    }

    @Override
    public String find(int id) {
        return null;
    }

    @Override
    public Student remove(int id) {
        return null;
    }

    @Override
    public Student edit(Student student) {
        return null;
    }
}
