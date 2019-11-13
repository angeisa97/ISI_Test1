import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class lastZeroTest
{

   @Test public void zeroisfirst()
   {
      int arr[] = {0, 7, 5};
      assertEquals("zero is first", 0, lastZero.lastZero(arr));
   }


    @Test public void zeroislast()
    {
     int arr[] = {7, 2,0};
     assertEquals("Zero is last", 2, lastZero.lastZero(arr));
    }

    //falla si no esta corregido
    @Test public void two_zeros()
    {
     int arr[] = {7,0,0};
     assertEquals("Zero is last", 2, lastZero.lastZero(arr));
    }

    @Test(expected = NullPointerException.class)
    public void nullList ()
    {
       int arr[] = null;
       lastZero.lastZero(arr);
    }
}
