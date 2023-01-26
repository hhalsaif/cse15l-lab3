import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  
  @Test 
  public void testReverseInPlace2(){
    int[] input2 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input2);
    int[] answer2 = {3, 2, 1};
    assertArrayEquals(input2, answer2);
  }
  
  @Test
  public void testReversed2(){
    int[] input2 = {1, 2, 3};
    int[] answer2 = {3, 2, 1};
    assertArrayEquals(ArrayExamples.reversed(input2), answer2);
  }
    
  @Test
  public void testAverageWithoutLowest(){
    double[] avgArray = {100, 100, 100, 100};
    assertEquals(ArrayExamples.averageWithoutLowest(avgArray), 0);
  }
}
