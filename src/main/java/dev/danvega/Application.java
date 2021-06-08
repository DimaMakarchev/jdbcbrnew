package dev.danvega;

import dev.danvega.dao.CourseJdbcDAO;
import dev.danvega.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.logging.Logger;

@SpringBootApplication
public class Application implements CommandLineRunner {
    Logger logger = Logger.getLogger(Application.class.getName());
    @Autowired
    private CourseJdbcDAO courseJdbcDAO;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        List<Course> list = courseJdbcDAO.list();
        list.stream().forEach(System.out::println);
    }
}
