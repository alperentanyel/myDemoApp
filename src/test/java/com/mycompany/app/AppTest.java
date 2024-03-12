package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
  //@Test
  public void testPasswordMakerArrayList() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(65, 66, 67));
      char[]arr={'A','B','C'};
      String result = App.passwordMaker(array);
      boolean case1=false;
      for(int i=0; i<3; i++){
        int val=(int)result.charAt(i);
        if(result.charAt(i)==arr[i] || val == array.get(i))
        {
          case1=true;
          break;
        }
      }
      assertNotNull(result);
      assertFalse(result.isEmpty());
      assertFalse(case1);

  }

  //@Test
  public void testPasswordMakerString() {
      String input = "ABC";
      String result = App.passwordMaker(input);
      assertNotNull(result);
      assertFalse(result.isEmpty());
  }

  //@Test
  public void testPasswordMakerStringCharArrayInt() {
      String input = "Password";
      char[] array = {'a', 'e', 'o'};
      int bit_shuffle = 2;
      String result = App.passwordMaker(input, array, bit_shuffle);
      assertNotNull(result);
      assertFalse(result.isEmpty());
  }

  //@Test
  public void testPasswordMakerIntegerArray() {
      Integer[] array = {65, 66, 67};
      String result = App.passwordMaker(array);
      assertNotNull(result);
      assertFalse(result.isEmpty());
  }
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public void testFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().search(array, 4));
    }

    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array, 5));
    }

    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      assertFalse(new App().search(array, 1));
    }

    public void testNull() {
      assertFalse(new App().search(null, 1));
    }

    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
