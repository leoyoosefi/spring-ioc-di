package se.lexicon;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.config.AppConfig;
import se.lexicon.dao.StudentDAO;

public class App
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentDAO studentDAO = context.getBean(StudentDAO.class);
    }
}
