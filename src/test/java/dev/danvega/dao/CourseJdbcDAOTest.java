package dev.danvega.dao;

import dev.danvega.model.Course;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJdbcTest
class CourseJdbcDAOTest {

    @MockBean
    private JdbcTemplate jdbcTemplate;
    @MockBean
    private CourseJdbcDAO dao;
//
//    @Autowired
//    public CourseJdbcDAOTest(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//        dao = new CourseJdbcDAO(jdbcTemplate);
//    }

    @Test
    void list() {
        List<Course> list = dao.list();
        assertEquals(5, list.size());
    }
}
