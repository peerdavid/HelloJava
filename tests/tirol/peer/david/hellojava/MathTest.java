package tirol.peer.david.hellojava;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by david on 03.10.15.
 *
 * Testing Math.java
 */
public class MathTest {

   private Math _testee;

   @Before
   public void setUp(){
      _testee = new Math();
   }

   @Test
   public void add_Add3And4_ShouldReturn7(){
      int a = 3;
      int b = 4;

      int expected = 7;
      int actual = _testee.add(a, b);

      Assert.assertEquals(expected, actual);
   }
}