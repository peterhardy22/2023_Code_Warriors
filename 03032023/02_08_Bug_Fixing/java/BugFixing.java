// https://www.codewars.com/kata/55c28f7304e3eaebef0000da
// Level 8 kyu

// Directions:
// Unfinished Loop - Bug Fixing #1
// Oh no, Timmy's created an infinite loop! Help Timmy find and fix the bug in his unfinished for loop!

// Function
import java.util.*;

class Kata {
  public static List CreateList(int number)
  {
    List list = new ArrayList<>();
    
    for(int count = 1; count <= number; count++)
    {
      list.add(count);
    }
    
    return list;
  }
}

// Test cases
// import org.junit.Test;
// import static org.junit.Assert.assertEquals;
// import org.junit.runners.JUnit4;
// import java.util.*;

// public class SolutionTest {
    
//     Kata k = new Kata();

//     @Test
//     public void SampleTests() {
//          assertEquals(Arrays.asList(1), k.CreateList(1));
//          assertEquals(Arrays.asList(1,2), k.CreateList(2));
//          assertEquals(Arrays.asList(1,2,3), k.CreateList(3));
//          assertEquals(Arrays.asList(1,2,3,4), k.CreateList(4));
//          assertEquals(Arrays.asList(1,2,3,4,5), k.CreateList(5));
//     }
// }