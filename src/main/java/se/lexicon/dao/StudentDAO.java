package se.lexicon.dao;

import se.lexicon.exception.DataNotFoundException;
import se.lexicon.model.Student;

import java.util.List;

public interface StudentDAO {

    Student save(Student student);

    Student find(int id) throws DataNotFoundException;

    List<Student> findAll();

    void delete(int id) throws DataNotFoundException;
}
