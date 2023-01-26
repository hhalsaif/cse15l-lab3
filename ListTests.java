import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
	@Test 
    public void testFilter(){
        List<String> message = new ArrayList<String>();
        message.add("Hello world!");
        assertArrayEquals(ListExamples.filter(message,), message);
    }

}
