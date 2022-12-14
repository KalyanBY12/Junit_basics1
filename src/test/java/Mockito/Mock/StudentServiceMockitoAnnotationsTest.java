package Mockito.Mock;

import org.example.Student.StudentDAO;
import org.example.Student.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class StudentServiceMockitoAnnotationsTest
{
    @Mock
    StudentDAO daoMock;

    @InjectMocks
    StudentService service;

    @Test
    public void testTotalScores()
    {
        when(daoMock.getScore()).thenReturn(new int[]{10,30,40});
        int total = service.findTotalScore();
        assertEquals(80, total);
    }
}
