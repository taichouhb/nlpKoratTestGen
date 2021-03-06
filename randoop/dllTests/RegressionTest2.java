import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test001");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test002");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        int int10 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass4 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        int int13 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test004");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test005");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        int int6 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test006");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableDoublyLinkedList0.size();
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test007");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        int int9 = strComparableDoublyLinkedList0.size();
        int int10 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test009");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable17);
        boolean boolean19 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test010");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNull(strComparable5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(strComparable13);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Class<?> wildcardClass16 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17.equals("hi!"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test014");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        int int8 = strComparableDoublyLinkedList0.size();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test015");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeFirst();
        boolean boolean17 = strComparableDoublyLinkedList0.isEmpty();
        int int18 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "" + "'", strComparable10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "" + "'", strComparable16.equals(""));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        int int15 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        int int11 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int18 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test018");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "" + "'", strComparable16.equals(""));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test019");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNull(strComparable9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        int int16 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean20 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test022");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        int int13 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass18 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean20 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test026");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        java.lang.Class<?> wildcardClass5 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test027");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        boolean boolean7 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        int int10 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable12);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + strComparable19 + "' != '" + "hi!" + "'", strComparable19.equals("hi!"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        int int11 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Class<?> wildcardClass19 = strComparable18.getClass();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + strComparable18 + "' != '" + "" + "'", strComparable18.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test031");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        int int16 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass17 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass18 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15.equals("hi!"));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass18 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass19 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test034");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        int int12 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "" + "'", strComparable13.equals(""));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11.equals("hi!"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test036");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test037");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test038");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass19 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + strComparable20 + "' != '" + "" + "'", strComparable20.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable21 + "' != '" + "" + "'", strComparable21.equals(""));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test039");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "" + "'", strComparable13.equals(""));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test040");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass20 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + strComparable18 + "' != '" + "" + "'", strComparable18.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        boolean boolean7 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        int int10 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + strComparable18 + "' != '" + "hi!" + "'", strComparable18.equals("hi!"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test043");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableDoublyLinkedList0.size();
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        int int13 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test044");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test045");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeLast();
        int int12 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableDoublyLinkedList0.addLast(strComparable14);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test048");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test049");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "" + "'", strComparable10.equals(""));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        int int13 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Class<?> wildcardClass16 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        int int18 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNull(strComparable19);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test052");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableDoublyLinkedList0.addLast(strComparable9);
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass16 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableDoublyLinkedList0.addLast(strComparable11);
        int int13 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Class<?> wildcardClass17 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "" + "'", strComparable16.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        int int11 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        int int13 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test056");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass13 = strComparableDoublyLinkedList0.getClass();
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        int int15 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeFirst();
        int int17 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        strComparableDoublyLinkedList0.addLast(strComparable20);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "" + "'", strComparable16.equals(""));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test059");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass18 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + strComparable19 + "' != '" + "" + "'", strComparable19.equals(""));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        int int10 = strComparableDoublyLinkedList0.size();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test062");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        boolean boolean16 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17.equals("hi!"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test065");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test066");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test067");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable18 + "' != '" + "hi!" + "'", strComparable18.equals("hi!"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test070");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass2 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass4 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        int int10 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass13 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable7);
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test074");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass13 = strComparableDoublyLinkedList0.getClass();
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test075");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int21 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass22 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass9 = strComparableDoublyLinkedList0.getClass();
        int int10 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test080");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        boolean boolean7 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass9 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean16 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test082");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        int int11 = strComparableDoublyLinkedList0.size();
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test083");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        int int13 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test084");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableDoublyLinkedList0.addLast(strComparable14);
        java.lang.Class<?> wildcardClass16 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        int int10 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable9);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass13 = strComparableDoublyLinkedList0.getClass();
        int int14 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass16 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test089");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        org.junit.Assert.assertNull(strComparable10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test091");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeLast();
        int int19 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(strComparable18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass9 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        int int13 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test093");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        int int10 = strComparableDoublyLinkedList0.size();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        int int11 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + strComparable18 + "' != '" + "" + "'", strComparable18.equals(""));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test097");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test098");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int18 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test099");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int18 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "" + "'", strComparable13.equals(""));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Class<?> wildcardClass16 = strComparableDoublyLinkedList0.getClass();
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test102");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableDoublyLinkedList0.size();
        boolean boolean18 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test103");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + strComparable19 + "' != '" + "" + "'", strComparable19.equals(""));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        int int21 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + strComparable18 + "' != '" + "" + "'", strComparable18.equals(""));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test107");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass9 = strComparableDoublyLinkedList0.getClass();
        int int10 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        int int13 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        int int11 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass13 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test109");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test110");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test111");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable7);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test112");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test113");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15.equals("hi!"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test114");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        int int16 = strComparableDoublyLinkedList0.size();
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test115");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        int int8 = strComparableDoublyLinkedList0.size();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test116");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass13 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test117");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        int int14 = strComparableDoublyLinkedList0.size();
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test118");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        int int15 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test119");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test120");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        int int11 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test121");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Class<?> wildcardClass13 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test122");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test123");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test124");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        int int9 = strComparableDoublyLinkedList0.size();
        int int10 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test125");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test126");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test127");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16.equals("hi!"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test128");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test129");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test130");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test131");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        int int16 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableDoublyLinkedList0.size();
        int int20 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test132");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean17 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test133");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        int int16 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        int int21 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + strComparable22 + "' != '" + "hi!" + "'", strComparable22.equals("hi!"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test134");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        int int6 = strComparableDoublyLinkedList0.size();
        boolean boolean7 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test135");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test136");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test137");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        int int16 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test138");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        boolean boolean7 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        int int10 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNull(strComparable11);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test139");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test140");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        java.lang.Class<?> wildcardClass5 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test141");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test142");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test143");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16.equals("hi!"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test144");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test145");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        int int9 = strComparableDoublyLinkedList0.size();
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass13 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test146");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean16 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass17 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass21 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test147");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
        int int14 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "" + "'", strComparable13.equals(""));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test148");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test149");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test150");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableDoublyLinkedList0.addLast(strComparable11);
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test151");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "" + "'", strComparable13.equals(""));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test152");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass16 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test153");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean16 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass17 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDoublyLinkedList0.removeFirst();
        boolean boolean21 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + strComparable20 + "' != '" + "" + "'", strComparable20.equals(""));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test154");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test155");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17.equals("hi!"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test156");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable12);
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strComparable15);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test157");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        int int16 = strComparableDoublyLinkedList0.size();
        boolean boolean17 = strComparableDoublyLinkedList0.isEmpty();
        int int18 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test158");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass22 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test159");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "" + "'", strComparable16.equals(""));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test160");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test161");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Class<?> wildcardClass17 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "" + "'", strComparable16.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test162");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        int int10 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11.equals("hi!"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test163");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11.equals("hi!"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test164");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "" + "'", strComparable13.equals(""));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test165");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test166");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Class<?> wildcardClass16 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass20 = strComparableDoublyLinkedList0.getClass();
        int int21 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test167");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test168");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int20 = strComparableDoublyLinkedList0.size();
        boolean boolean21 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        int int23 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test169");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test170");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "" + "'", strComparable10.equals(""));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test171");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        int int16 = strComparableDoublyLinkedList0.size();
        int int17 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + strComparable18 + "' != '" + "hi!" + "'", strComparable18.equals("hi!"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test172");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test173");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        int int16 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean20 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass23 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test174");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        int int13 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test175");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test176");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test177");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test178");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableDoublyLinkedList0.size();
        int int12 = strComparableDoublyLinkedList0.size();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        int int15 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test179");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableDoublyLinkedList0.addLast(strComparable11);
        int int13 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean18 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass19 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass22 = strComparableDoublyLinkedList0.getClass();
        int int23 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test180");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "" + "'", strComparable16.equals(""));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test181");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        int int9 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "" + "'", strComparable13.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable19 + "' != '" + "" + "'", strComparable19.equals(""));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test182");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test183");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        int int16 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test184");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test185");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass9 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test186");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
        int int14 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "" + "'", strComparable13.equals(""));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test187");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        int int13 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableDoublyLinkedList0.removeLast();
        int int23 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertTrue("'" + strComparable22 + "' != '" + "hi!" + "'", strComparable22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test188");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test189");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass19 = strComparableDoublyLinkedList0.getClass();
        boolean boolean20 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean23 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass24 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test190");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int20 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable23 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable24 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + strComparable23 + "' != '" + "" + "'", strComparable23.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable24 + "' != '" + "" + "'", strComparable24.equals(""));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test191");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test192");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test193");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "" + "'", strComparable13.equals(""));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test194");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
        org.junit.Assert.assertNull(strComparable15);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test195");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableDoublyLinkedList0.addLast(strComparable11);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test196");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Class<?> wildcardClass9 = strComparableDoublyLinkedList0.getClass();
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test197");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass9 = strComparableDoublyLinkedList0.getClass();
        int int10 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        int int14 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test198");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable17);
        boolean boolean19 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(strComparable21);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test199");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test200");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertNull(strComparable11);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test201");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test202");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test203");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        boolean boolean7 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass9 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test204");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test205");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        int int18 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test206");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        int int9 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test207");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableDoublyLinkedList0.addLast(strComparable12);
        int int14 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test208");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        int int13 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test209");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable11);
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test210");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test211");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15.equals("hi!"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test212");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test213");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateBackward();
        int int16 = strComparableDoublyLinkedList0.size();
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test214");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableDoublyLinkedList0.addLast(strComparable9);
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test215");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test216");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable23 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable23 + "' != '" + "" + "'", strComparable23.equals(""));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test217");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass9 = strComparableDoublyLinkedList0.getClass();
        int int10 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test218");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass13 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test219");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test220");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableDoublyLinkedList0.addLast(strComparable11);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "" + "'", strComparable16.equals(""));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test221");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable9);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test222");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test223");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test224");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable12);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean21 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test225");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test226");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test227");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(strComparable5);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test228");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableDoublyLinkedList0.size();
        int int14 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test229");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "" + "'", strComparable10.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test230");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        int int16 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + strComparable19 + "' != '" + "hi!" + "'", strComparable19.equals("hi!"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test231");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test232");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        int int11 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + strComparable18 + "' != '" + "" + "'", strComparable18.equals(""));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test233");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test234");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        int int6 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test235");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test236");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableDoublyLinkedList0.addLast(strComparable9);
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test237");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test238");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strComparable8);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test239");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test240");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test241");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass13 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test242");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test243");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableDoublyLinkedList0.addLast(strComparable14);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass18 = strComparableDoublyLinkedList0.getClass();
        int int19 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test244");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test245");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "" + "'", strComparable10.equals(""));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test246");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass13 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test247");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableDoublyLinkedList0.isEmpty();
        int int17 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + strComparable18 + "' != '" + "" + "'", strComparable18.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable19 + "' != '" + "" + "'", strComparable19.equals(""));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test248");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test249");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Class<?> wildcardClass11 = strComparable10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "" + "'", strComparable10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test250");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass13 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test251");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass19 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass25 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable28 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + strComparable28 + "' != '" + "hi!" + "'", strComparable28.equals("hi!"));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test252");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test253");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        int int9 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test254");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        int int16 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test255");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable9);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test256");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        int int9 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "" + "'", strComparable13.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "" + "'", strComparable16.equals(""));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test257");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        int int8 = strComparableDoublyLinkedList0.size();
        int int9 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        int int15 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test258");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test259");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableDoublyLinkedList0.addLast(strComparable11);
        int int13 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean18 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + strComparable19 + "' != '" + "" + "'", strComparable19.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable20 + "' != '" + "" + "'", strComparable20.equals(""));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test260");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        int int5 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Class<?> wildcardClass7 = strComparable6.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test261");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test262");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable19 + "' != '" + "hi!" + "'", strComparable19.equals("hi!"));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test263");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test264");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test265");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        boolean boolean16 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "" + "'", strComparable10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test266");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test267");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        try {
            java.lang.Class<?> wildcardClass11 = strComparable10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertNull(strComparable10);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test268");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15.equals("hi!"));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test269");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        int int16 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test270");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeFirst();
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test271");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable9);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass13 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test272");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        int int13 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test273");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        boolean boolean16 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test274");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateBackward();
        int int7 = strComparableDoublyLinkedList0.size();
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test275");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test276");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass19 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + strComparable20 + "' != '" + "" + "'", strComparable20.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable21 + "' != '" + "" + "'", strComparable21.equals(""));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test277");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.iterateBackward();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test278");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableDoublyLinkedList0.addLast(strComparable9);
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test279");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "" + "'", strComparable13.equals(""));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test280");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        int int13 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Class<?> wildcardClass19 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + strComparable18 + "' != '" + "" + "'", strComparable18.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test281");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        int int13 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test282");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test283");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        int int16 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test284");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test285");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test286");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        int int8 = strComparableDoublyLinkedList0.size();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test287");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableDoublyLinkedList0.addLast(strComparable12);
        org.junit.Assert.assertNull(strComparable5);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test288");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        int int13 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test289");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test290");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableDoublyLinkedList0.addLast(strComparable11);
        int int13 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean18 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass19 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test291");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeFirst();
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test292");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "" + "'", strComparable10.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11.equals("hi!"));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test293");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test294");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test295");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableDoublyLinkedList0.size();
        int int16 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + strComparable17 + "' != '" + "" + "'", strComparable17.equals(""));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test296");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeLast();
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "" + "'", strComparable16.equals(""));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test297");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableDoublyLinkedList0.size();
        int int10 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test298");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + strComparable18 + "' != '" + "hi!" + "'", strComparable18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable19 + "' != '" + "" + "'", strComparable19.equals(""));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test299");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableDoublyLinkedList0.size();
        int int14 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "" + "'", strComparable16.equals(""));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test300");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test301");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        int int10 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test302");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        int int15 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test303");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        boolean boolean7 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test304");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable10);
        int int12 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test305");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test306");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        int int9 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable18);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "" + "'", strComparable13.equals(""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + strComparable17 + "' != '" + "" + "'", strComparable17.equals(""));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test307");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        int int15 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable17 + "' != '" + "" + "'", strComparable17.equals(""));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test308");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable9);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test309");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass9 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test310");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        int int13 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test311");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15.equals("hi!"));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test312");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11.equals("hi!"));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test313");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableDoublyLinkedList0.addLast(strComparable9);
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test314");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable18 + "' != '" + "hi!" + "'", strComparable18.equals("hi!"));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test315");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test316");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test317");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test318");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        int int11 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeFirst();
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17.equals("hi!"));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test319");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test320");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test321");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertNull(strComparable15);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test322");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test323");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16.equals("hi!"));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test324");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int21 = strComparableDoublyLinkedList0.size();
        int int22 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + strComparable18 + "' != '" + "" + "'", strComparable18.equals(""));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test325");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15.equals("hi!"));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test326");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean16 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test327");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        int int11 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test328");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass16 = strComparableDoublyLinkedList0.getClass();
        int int17 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test329");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass4 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "" + "'", strComparable13.equals(""));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test330");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass19 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + strComparable20 + "' != '" + "" + "'", strComparable20.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable21 + "' != '" + "" + "'", strComparable21.equals(""));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test331");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test332");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        int int12 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test333");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test334");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeFirst();
        int int17 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "" + "'", strComparable16.equals(""));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test335");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        int int8 = strComparableDoublyLinkedList0.size();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test336");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test337");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test338");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test339");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test340");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        boolean boolean7 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass9 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test341");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        int int10 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11.equals("hi!"));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test342");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Class<?> wildcardClass16 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean18 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strComparable19);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test343");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test344");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test345");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean17 = strComparableDoublyLinkedList0.isEmpty();
        int int18 = strComparableDoublyLinkedList0.size();
        boolean boolean19 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test346");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test347");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test348");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        int int14 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test349");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableDoublyLinkedList0.addLast(strComparable12);
        int int14 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean16 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test350");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test351");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        int int16 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17.equals("hi!"));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test352");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test353");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable18 + "' != '" + "" + "'", strComparable18.equals(""));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test354");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable9);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test355");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test356");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        int int15 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Class<?> wildcardClass19 = strComparable18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + strComparable18 + "' != '" + "hi!" + "'", strComparable18.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test357");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        int int6 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test358");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        boolean boolean7 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        int int10 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test359");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test360");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        int int13 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeFirst();
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + strComparable17 + "' != '" + "" + "'", strComparable17.equals(""));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test361");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        java.lang.Class<?> wildcardClass5 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test362");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        int int13 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test363");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test364");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean19 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + strComparable18 + "' != '" + "hi!" + "'", strComparable18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test365");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable12);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        int int15 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test366");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableDoublyLinkedList0.addLast(strComparable9);
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strComparable16);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test367");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean16 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass17 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test368");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableDoublyLinkedList0.addLast(strComparable9);
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test369");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        int int9 = strComparableDoublyLinkedList0.size();
        int int10 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test370");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Class<?> wildcardClass18 = strComparable17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + strComparable17 + "' != '" + "" + "'", strComparable17.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test371");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test372");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        int int6 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test373");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test374");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test375");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass19 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test376");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable10);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test377");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test378");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        int int12 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test379");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass16 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeLast();
        int int18 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test380");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableDoublyLinkedList0.size();
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test381");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        int int13 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test382");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test383");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test384");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test385");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean7 = strComparableDoublyLinkedList0.isEmpty();
        int int8 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass9 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test386");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test387");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test388");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test389");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test390");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        int int16 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test391");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeFirst();
        int int19 = strComparableDoublyLinkedList0.size();
        int int20 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass23 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + strComparable18 + "' != '" + "" + "'", strComparable18.equals(""));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test392");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        java.lang.Class<?> wildcardClass5 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test393");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test394");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test395");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test396");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test397");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass9 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test398");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test399");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean16 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass17 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean20 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test400");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test401");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test402");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass16 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test403");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test404");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeFirst();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test405");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        int int8 = strComparableDoublyLinkedList0.size();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test406");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        int int14 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "" + "'", strComparable13.equals(""));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test407");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        int int12 = strComparableDoublyLinkedList0.size();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test408");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test409");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test410");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.iterateBackward();
        int int2 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test411");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass9 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test412");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test413");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        int int12 = strComparableDoublyLinkedList0.size();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        int int14 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "" + "'", strComparable16.equals(""));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test414");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Class<?> wildcardClass16 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + strComparable20 + "' != '" + "" + "'", strComparable20.equals(""));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test415");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        int int5 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDoublyLinkedList0.removeFirst();
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNull(strComparable6);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test416");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test417");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable17 + "' != '" + "" + "'", strComparable17.equals(""));
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test418");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test419");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable17);
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean20 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test420");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test421");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test422");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        int int15 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test423");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        boolean boolean16 = strComparableDoublyLinkedList0.isEmpty();
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test424");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strComparable16);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test425");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableDoublyLinkedList0.addLast(strComparable9);
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass20 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableDoublyLinkedList0.removeLast();
        int int22 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + strComparable21 + "' != '" + "" + "'", strComparable21.equals(""));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test426");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        int int12 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test427");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test428");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass19 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDoublyLinkedList0.removeFirst();
        boolean boolean21 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable24 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + strComparable20 + "' != '" + "" + "'", strComparable20.equals(""));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + strComparable24 + "' != '" + "" + "'", strComparable24.equals(""));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test429");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableDoublyLinkedList0.size();
        int int12 = strComparableDoublyLinkedList0.size();
        int int13 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15.equals("hi!"));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test430");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        int int8 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass9 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test431");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test432");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        int int13 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable23 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + strComparable22 + "' != '" + "hi!" + "'", strComparable22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable23 + "' != '" + "" + "'", strComparable23.equals(""));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test433");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean17 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass20 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test434");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertNull(strComparable13);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test435");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test436");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        int int11 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test437");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        int int5 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDoublyLinkedList0.removeFirst();
        int int7 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test438");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test439");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test440");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        strComparableDoublyLinkedList0.addLast(strComparable18);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test441");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        int int14 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test442");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        int int8 = strComparableDoublyLinkedList0.size();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test443");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable9);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        boolean boolean16 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test444");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        int int9 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        int int16 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test445");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableDoublyLinkedList0.size();
        int int11 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test446");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable17 + "' != '" + "" + "'", strComparable17.equals(""));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test447");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strComparable16);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test448");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable12);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableDoublyLinkedList0.size();
        boolean boolean17 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test449");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableDoublyLinkedList0.size();
        int int14 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test450");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        int int16 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test451");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        int int12 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass13 = strComparableDoublyLinkedList0.getClass();
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test452");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test453");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test454");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable17);
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16.equals("hi!"));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test455");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean23 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + strComparable19 + "' != '" + "hi!" + "'", strComparable19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable20 + "' != '" + "" + "'", strComparable20.equals(""));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test456");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        boolean boolean7 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test457");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test458");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass13 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test459");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test460");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        int int8 = strComparableDoublyLinkedList0.size();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test461");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        int int9 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        int int11 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test462");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test463");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test464");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "" + "'", strComparable10.equals(""));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test465");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        int int16 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test466");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test467");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        int int13 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "" + "'", strComparable16.equals(""));
        org.junit.Assert.assertNull(strComparable17);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test468");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test469");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableDoublyLinkedList0.addLast(strComparable16);
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass21 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertNull(strComparable19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test470");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test471");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test472");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9.equals("hi!"));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test473");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNull(strComparable8);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test474");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test475");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        int int13 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test476");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Class<?> wildcardClass15 = strComparable14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test477");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable12);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test478");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test479");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        int int11 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass12 = strComparableDoublyLinkedList0.getClass();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test480");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test481");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test482");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test483");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test484");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        int int12 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(strComparable13);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test485");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test486");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "" + "'", strComparable16.equals(""));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test487");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        int int8 = strComparableDoublyLinkedList0.size();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test488");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test489");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + strComparable9 + "' != '" + "" + "'", strComparable9.equals(""));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test490");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean16 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass21 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + strComparable22 + "' != '" + "hi!" + "'", strComparable22.equals("hi!"));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test491");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean21 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + strComparable18 + "' != '" + "" + "'", strComparable18.equals(""));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test492");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        int int9 = strComparableDoublyLinkedList0.size();
        int int10 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        int int12 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test493");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass14 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test494");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test495");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        int int13 = strComparableDoublyLinkedList0.size();
        int int14 = strComparableDoublyLinkedList0.size();
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test496");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableDoublyLinkedList0.size();
        int int8 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test497");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test498");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNull(strComparable5);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test499");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16.equals("hi!"));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test500");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}

