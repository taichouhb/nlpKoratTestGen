/*
 * This file was automatically generated by EvoSuite
 * Tue May 01 03:35:27 GMT 2018
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.EmptyStackException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Tower_ESTest extends Tower_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 110;
      Tower tower0 = new Tower(110);
      assertEquals("110", tower0.toString());
      assertEquals(110, tower0.index());
      assertNotNull(tower0);
      
      int int1 = 0;
      Tower tower1 = new Tower(110);
      assertEquals("110", tower1.toString());
      assertEquals(110, tower1.index());
      assertNotNull(tower1);
      assertFalse(tower1.equals((Object)tower0));
      
      tower0.moveDisks(0, tower1, tower1);
      assertEquals("110", tower0.toString());
      assertEquals(110, tower0.index());
      assertEquals("110", tower1.toString());
      assertEquals(110, tower1.index());
      assertNotSame(tower0, tower1);
      assertNotSame(tower1, tower0);
      assertFalse(tower0.equals((Object)tower1));
      assertFalse(tower1.equals((Object)tower0));
      
      Tower tower2 = null;
      tower0.add(0);
      assertEquals("110", tower0.toString());
      assertEquals(110, tower0.index());
      assertNotSame(tower0, tower1);
      assertFalse(tower0.equals((Object)tower1));
      
      // Undeclared exception!
      try { 
        tower0.moveTopTo((Tower) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Tower", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = 0;
      Tower tower0 = new Tower(0);
      assertEquals("0", tower0.toString());
      assertEquals(0, tower0.index());
      assertNotNull(tower0);
      
      tower0.add(0);
      assertEquals("0", tower0.toString());
      assertEquals(0, tower0.index());
      
      int int1 = tower0.index();
      assertEquals("0", tower0.toString());
      assertEquals(0, tower0.index());
      assertEquals(0, int1);
      assertTrue(int1 == int0);
      
      tower0.add((-2059));
      assertEquals("0", tower0.toString());
      assertEquals(0, tower0.index());
      
      Tower tower1 = new Tower(0);
      assertEquals("0", tower1.toString());
      assertEquals(0, tower1.index());
      assertNotNull(tower1);
      assertFalse(tower1.equals((Object)tower0));
      
      tower1.moveDisks(0, tower0, tower0);
      assertEquals("0", tower0.toString());
      assertEquals(0, tower0.index());
      assertEquals("0", tower1.toString());
      assertEquals(0, tower1.index());
      assertNotSame(tower0, tower1);
      assertNotSame(tower1, tower0);
      assertFalse(tower0.equals((Object)tower1));
      assertFalse(tower1.equals((Object)tower0));
      
      tower0.moveDisks(0, tower1, tower1);
      assertEquals("0", tower0.toString());
      assertEquals(0, tower0.index());
      assertEquals("0", tower1.toString());
      assertEquals(0, tower1.index());
      assertNotSame(tower0, tower1);
      assertNotSame(tower1, tower0);
      assertFalse(tower0.equals((Object)tower1));
      assertFalse(tower1.equals((Object)tower0));
      
      int int2 = tower0.index();
      assertEquals("0", tower0.toString());
      assertEquals(0, tower0.index());
      assertEquals(0, int2);
      assertNotSame(tower0, tower1);
      assertFalse(tower0.equals((Object)tower1));
      assertTrue(int2 == int0);
      assertTrue(int2 == int1);
      
      Tower tower2 = new Tower((-809));
      assertEquals("-809", tower2.toString());
      assertEquals((-809), tower2.index());
      assertNotNull(tower2);
      assertFalse(tower2.equals((Object)tower1));
      assertFalse(tower2.equals((Object)tower0));
      
      // Undeclared exception!
      try { 
        tower2.moveTopTo(tower1);
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Tower tower0 = new Tower((-1418));
      assertEquals((-1418), tower0.index());
      assertEquals("-1418", tower0.toString());
      assertNotNull(tower0);
      
      int int0 = tower0.index();
      assertEquals((-1418), tower0.index());
      assertEquals("-1418", tower0.toString());
      assertEquals((-1418), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Tower tower0 = new Tower(4399);
      assertEquals(4399, tower0.index());
      assertEquals("4399", tower0.toString());
      assertNotNull(tower0);
      
      int int0 = tower0.index();
      assertEquals(4399, tower0.index());
      assertEquals("4399", tower0.toString());
      assertEquals(4399, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Tower tower0 = new Tower(2020);
      assertEquals("2020", tower0.toString());
      assertEquals(2020, tower0.index());
      assertNotNull(tower0);
      
      tower0.add(2020);
      assertEquals("2020", tower0.toString());
      assertEquals(2020, tower0.index());
      
      int int0 = 1;
      Tower tower1 = new Tower(0);
      assertEquals("0", tower1.toString());
      assertEquals(0, tower1.index());
      assertNotNull(tower1);
      assertFalse(tower1.equals((Object)tower0));
      
      tower0.moveDisks(0, tower1, tower1);
      assertEquals("2020", tower0.toString());
      assertEquals(2020, tower0.index());
      assertEquals("0", tower1.toString());
      assertEquals(0, tower1.index());
      assertNotSame(tower0, tower1);
      assertNotSame(tower1, tower0);
      assertFalse(tower0.equals((Object)tower1));
      assertFalse(tower1.equals((Object)tower0));
      
      tower0.add(0);
      assertEquals("2020", tower0.toString());
      assertEquals(2020, tower0.index());
      assertNotSame(tower0, tower1);
      assertFalse(tower0.equals((Object)tower1));
      
      tower0.moveDisks((-1), tower1, tower1);
      assertEquals("2020", tower0.toString());
      assertEquals(2020, tower0.index());
      assertEquals("0", tower1.toString());
      assertEquals(0, tower1.index());
      assertNotSame(tower0, tower1);
      assertNotSame(tower1, tower0);
      assertFalse(tower0.equals((Object)tower1));
      assertFalse(tower1.equals((Object)tower0));
      
      Tower tower2 = new Tower(1);
      assertEquals(1, tower2.index());
      assertEquals("1", tower2.toString());
      assertNotNull(tower2);
      assertFalse(tower2.equals((Object)tower0));
      assertFalse(tower2.equals((Object)tower1));
      
      tower2.add(0);
      assertEquals(1, tower2.index());
      assertEquals("1", tower2.toString());
      assertNotSame(tower2, tower0);
      assertNotSame(tower2, tower1);
      assertFalse(tower2.equals((Object)tower0));
      assertFalse(tower2.equals((Object)tower1));
      
      tower0.moveTopTo(tower2);
      assertEquals("2020", tower0.toString());
      assertEquals(2020, tower0.index());
      assertEquals(1, tower2.index());
      assertEquals("1", tower2.toString());
      assertNotSame(tower0, tower2);
      assertNotSame(tower0, tower1);
      assertNotSame(tower2, tower0);
      assertNotSame(tower2, tower1);
      assertFalse(tower0.equals((Object)tower2));
      assertFalse(tower0.equals((Object)tower1));
      assertFalse(tower2.equals((Object)tower0));
      assertFalse(tower2.equals((Object)tower1));
      
      tower2.moveTopTo(tower1);
      assertEquals("0", tower1.toString());
      assertEquals(0, tower1.index());
      assertEquals(1, tower2.index());
      assertEquals("1", tower2.toString());
      assertNotSame(tower1, tower0);
      assertNotSame(tower1, tower2);
      assertNotSame(tower2, tower0);
      assertNotSame(tower2, tower1);
      assertFalse(tower1.equals((Object)tower0));
      assertFalse(tower1.equals((Object)tower2));
      assertFalse(tower2.equals((Object)tower0));
      assertFalse(tower2.equals((Object)tower1));
      
      // Undeclared exception!
      try { 
        tower0.moveDisks(2020, tower2, tower2);
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Tower tower0 = new Tower(277);
      assertEquals("277", tower0.toString());
      assertEquals(277, tower0.index());
      assertNotNull(tower0);
      
      int int0 = 0;
      Tower tower1 = new Tower(0);
      assertEquals("0", tower1.toString());
      assertEquals(0, tower1.index());
      assertNotNull(tower1);
      assertFalse(tower1.equals((Object)tower0));
      
      // Undeclared exception!
      try { 
        tower1.moveDisks(277, tower0, tower0);
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int int0 = 0;
      Tower tower0 = new Tower(0);
      assertEquals("0", tower0.toString());
      assertEquals(0, tower0.index());
      assertNotNull(tower0);
      
      int int1 = 781;
      Tower tower1 = new Tower(0);
      assertEquals("0", tower1.toString());
      assertEquals(0, tower1.index());
      assertNotNull(tower1);
      assertFalse(tower1.equals((Object)tower0));
      
      // Undeclared exception!
      try { 
        tower0.moveTopTo(tower1);
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Tower tower0 = new Tower(165);
      tower0.add(165);
      Tower tower1 = new Tower((-3427));
      tower0.moveTopTo(tower1);
      tower1.moveDisks(0, tower0, tower0);
      tower1.moveTopTo(tower0);
      tower1.add(2651);
      tower1.add((-3427));
      tower0.moveTopTo(tower1);
      tower0.toString();
      // Undeclared exception!
      try { 
        tower1.moveDisks(1907, tower0, tower0);
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      int int0 = 1;
      Tower tower0 = new Tower(1);
      tower0.add(1);
      tower0.add(1);
      tower0.add(1);
      Tower tower1 = new Tower(1);
      // Undeclared exception!
      try { 
        tower1.moveTopTo(tower0);
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Stack", e);
      }
  }
}
