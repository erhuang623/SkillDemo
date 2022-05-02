import static org.junit.Assert.*;
import org.junit.*;


public class SkillDemoTest {
    @Test
    public void testConcat()
    {
        assertEquals("Hello", SkillDemo.concat("He", "llo"));
    }
}
