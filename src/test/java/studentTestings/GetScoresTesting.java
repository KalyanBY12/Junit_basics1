package studentTestings;

import org.example.Student.StudentDAO;
import org.example.Student.StudentService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GetScoresTesting
{
    @Test
    public void testFindTotal()
    {
        StudentService service = new StudentService(new StudentDaoStub());
        int total = service.findTotalScore();

        assertEquals(11,total);
    }

}

class StudentDaoStub extends StudentDAO
{
    @Override
    public int[] getScore()
    {
        return new int[]{40,50,20};
    }
}
