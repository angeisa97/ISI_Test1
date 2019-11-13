import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class oddOrPosTest
{

   // this test passes
   @Test public void all()
   {
      int arr[] = {2,4,7,5};
      assertEquals("all", 4, oddOrPos.oddOrPos(arr));
   }

   //este falla
    @Test public void negativebutodd()
    {
     int arr[] = {-4, -2, -7};
     assertEquals("negativebudodd", 1, oddOrPos.oddOrPos(arr));
    }

    @Test public void positiveandodd()
    {
     int arr[] = {0, -2, 5};
     assertEquals("positiveandodd", 1, oddOrPos.oddOrPos(arr));
    }

    @Test(expected = NullPointerException.class)
    public void nullList()
    {
         int arr[] = null;
         oddOrPos.oddOrPos(arr);
    }

}
