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
      String [] list={"656667","6566C","65BC","ABC","65B67","A6667","A66C","AB67"};

      for(int i=0; i<8; i++){
        if(result.equals(list[i]))
        case1=true;
      }
      assertTrue(case1);
      
      

  }

  //@Test
  public void testPasswordMakerString() {
      String input = "ABC";
      String result = App.passwordMaker(input);
      boolean case1=false;
      String [] list={"656667","6566C","65BC","ABC","65B67","A6667","A66C","AB67"};

      for(int i=0; i<8; i++){
        if(result.equals(list[i]))
        case1=true;
      }
      assertTrue(case1);
      
      
  }
  public void testPasswordMakerStringNULL() {
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
      System.out.println(result);
      assertNotNull(result);
      assertFalse(result.isEmpty());
  }

  //@Test
  public void testPasswordMakerIntegerArray() {
      Integer[] array = {65, 66, 67};
      String result = App.passwordMaker(array);
      boolean case1=false;
      String [] list={"656667","6566C","65BC","ABC","65B67","A6667","A66C","AB67"};

      for(int i=0; i<8; i++){
        if(result.equals(list[i]))
        case1=true;
      }
      assertTrue(case1);
      
      
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
