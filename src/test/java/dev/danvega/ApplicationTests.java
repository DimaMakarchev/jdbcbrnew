//package dev.danvega;
//
//import dev.danvega.dao.CourseJdbcDAO;
//import dev.danvega.model.Course;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@DataJdbcTest
//class ApplicationTests {
//
//    private JdbcTemplate jdbcTemplate;
//    private CourseJdbcDAO dao;
//
//    @Autowired
//    public ApplicationTests(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//        dao = new CourseJdbcDAO(jdbcTemplate);
//    }
//
//    @Test
//    void contextLoads() {
//        List<Course> list = dao.list();
//        assertEquals(5, list.size());
//
//    }
//}
