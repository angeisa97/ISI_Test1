import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class findLastTest
{
     //que este en la primera, que este en la ultima, que haya dos
   // this test passes
   @Test public void numberislast()
   {
      int arr[] = {2, 7, 5};
      int y = 5;
      assertEquals("numberislast", 2, findLast.findLast(arr,y));
   }

   //fallaria sin corregir el error
    @Test public void notinArray()
    {
     int arr[] = {0, 7, 2};
     int y = 8;
     assertEquals("Not in array", -1, findLast.findLast(arr,y));
    }

    @Test(expected = NullPointerException.class)
    public void nullList()
    {
         int arr[] = null;
         int y = 6;
         findLast.findLast(arr,y);
    }

    //falla si no esta arreglado
    @Test public void numberisFirst()
    {
     int arr[] = {0, 7, 2};
     int y = 0;
     assertEquals("Number in first element", 0, findLast.findLast(arr,y));
    }

}
