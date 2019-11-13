import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class countPositiveTest
{
   // this test passes
   @Test public void threepositives()
   {
      int arr[] = {2, 7, 5};
      assertEquals("3 positivos", 3, countPositive.countPositive(arr));
   }

    // this test fails!
    @Test public void zeroFirstElement()
    {
     int arr[] = {0, 7, 2};
     assertEquals("Zero in first element", 2, countPositive.countPositive(arr));
    }

    @Test public void two_negatives()
    {
     int arr[] = {-5, -2, 2};
     assertEquals("two_negatives", 1, countPositive.countPositive(arr));
    }


    @Test(expected = NullPointerException.class)
    public void nullList()
    {
         int arr[] = null;
         countPositive.countPositive(arr);
    }

}
