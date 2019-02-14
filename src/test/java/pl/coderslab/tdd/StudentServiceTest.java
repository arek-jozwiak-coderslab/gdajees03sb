package pl.coderslab.tdd;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.coderslab.StudentRepository;
import pl.coderslab.StudentService;
import pl.coderslab.StudentServiceImpl;
import pl.coderslab.model.Student;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StudentServiceTest {

    private static final Logger log =
            LoggerFactory.getLogger(StudentServiceTest.class);

    private StudentService service;
    private StudentRepository repository;
    @Before
    public void setUp() {
        repository = mock(StudentRepository.class);
        service = new StudentServiceImpl(repository);
    }

    @Test
    public void when_searching_john_then_return_object() {
        // given
        Student john = new Student("John");
        when(repository.findOneByFirstName("John")).thenReturn(john);
        // when
        Student student = service.findByFirstName("John");
        // then
        assertEquals("John", student.getFirstName());
    }

    @Test
    public void when_save_student_then_it_is_returned_correctly() {
        // given
        Student student = new Student("John");
        when(repository.save(student)).thenReturn(student);
        // when
        Student result = service.addStudent(student);
        // then
        assertNotNull(result);
        assertEquals(student.getFirstName(), result.getFirstName());
    }
}