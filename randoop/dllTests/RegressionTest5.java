import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test01");
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
        int int11 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass13 = strComparableDoublyLinkedList0.getClass();
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02");
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
        java.lang.Class<?> wildcardClass13 = strComparableDoublyLinkedList0.getClass();
        boolean boolean14 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03");
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
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + strComparable17 + "' != '" + "" + "'", strComparable17.equals(""));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test04");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        int int8 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test05");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15.equals("hi!"));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test06");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test07");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test08");
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
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Class<?> wildcardClass15 = strComparable14.getClass();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test09");
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
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15.equals("hi!"));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test10");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertTrue("'" + strComparable5 + "' != '" + "" + "'", strComparable5.equals(""));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test11");
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
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "" + "'", strComparable16.equals(""));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test12");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDoublyLinkedList0.removeLast();
        int int13 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16.equals("hi!"));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test13");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        boolean boolean5 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass9 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test14");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "" + "'", strComparable10.equals(""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test15");
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
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test16");
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
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeFirst();
        int int17 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "" + "'", strComparable16.equals(""));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test17");
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
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass16 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test18");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableDoublyLinkedList0.addLast(strComparable12);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test19");
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
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12.equals("hi!"));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test20");
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
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + strComparable16 + "' != '" + "hi!" + "'", strComparable16.equals("hi!"));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test21");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable5);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test22");
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
        boolean boolean16 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + strComparable11 + "' != '" + "" + "'", strComparable11.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test23");
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
        java.lang.Class<?> wildcardClass20 = strComparableDoublyLinkedList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test24");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        int int6 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        int int9 = strComparableDoublyLinkedList0.size();
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test25");
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
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test26");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDoublyLinkedList0.removeLast();
        int int7 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        int int11 = strComparableDoublyLinkedList0.size();
        int int12 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + strComparable6 + "' != '" + "hi!" + "'", strComparable6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "" + "'", strComparable13.equals(""));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test27");
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
        strComparableDoublyLinkedList0.iterateForward();
        boolean boolean17 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Class<?> wildcardClass18 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass19 = strComparableDoublyLinkedList0.getClass();
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        strComparableDoublyLinkedList0.addLast(strComparable20);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + strComparable12 + "' != '" + "" + "'", strComparable12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test28");
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
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass15 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "" + "'", strComparable13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test29");
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
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test30");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass10 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test31");
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
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test32");
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
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test33");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass4 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test34");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDoublyLinkedList0.removeFirst();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "" + "'", strComparable10.equals(""));
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test35");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable3);
        java.lang.Class<?> wildcardClass5 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        int int7 = strComparableDoublyLinkedList0.size();
        boolean boolean8 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strComparable9);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test36");
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
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateBackward();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "" + "'", strComparable7.equals(""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test37");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + strComparable14 + "' != '" + "" + "'", strComparable14.equals(""));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test38");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test39");
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
        boolean boolean19 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.iterateBackward();
        int int23 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable24 = strComparableDoublyLinkedList0.removeFirst();
        int int25 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + strComparable20 + "' != '" + "hi!" + "'", strComparable20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + strComparable24 + "' != '" + "hi!" + "'", strComparable24.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test40");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        int int12 = strComparableDoublyLinkedList0.size();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test41");
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
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + strComparable15 + "' != '" + "" + "'", strComparable15.equals(""));
        org.junit.Assert.assertTrue("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17.equals("hi!"));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test42");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableDoublyLinkedList0.getClass();
        java.lang.Class<?> wildcardClass8 = strComparableDoublyLinkedList0.getClass();
        boolean boolean9 = strComparableDoublyLinkedList0.isEmpty();
        boolean boolean10 = strComparableDoublyLinkedList0.isEmpty();
        int int11 = strComparableDoublyLinkedList0.size();
        boolean boolean12 = strComparableDoublyLinkedList0.isEmpty();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test43");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableDoublyLinkedList0.size();
        java.lang.Class<?> wildcardClass2 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test44");
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
        strComparableDoublyLinkedList0.iterateBackward();
        boolean boolean21 = strComparableDoublyLinkedList0.isEmpty();
        strComparableDoublyLinkedList0.iterateForward();
        java.lang.Comparable<java.lang.String> strComparable23 = strComparableDoublyLinkedList0.removeLast();
        org.junit.Assert.assertTrue("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + strComparable23 + "' != '" + "" + "'", strComparable23.equals(""));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test45");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeLast();
        java.lang.Class<?> wildcardClass11 = strComparableDoublyLinkedList0.getClass();
        strComparableDoublyLinkedList0.iterateBackward();
        strComparableDoublyLinkedList0.iterateForward();
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDoublyLinkedList0.removeLast();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "" + "'", strComparable10.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test46");
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
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Class<?> wildcardClass17 = strComparableDoublyLinkedList0.getClass();
        int int18 = strComparableDoublyLinkedList0.size();
        boolean boolean19 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + strComparable13 + "' != '" + "" + "'", strComparable13.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + strComparable20 + "' != '" + "" + "'", strComparable20.equals(""));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test47");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDoublyLinkedList0.addLast(strComparable3);
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addFirst((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDoublyLinkedList0.removeLast();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableDoublyLinkedList0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableDoublyLinkedList0.addFirst(strComparable12);
        strComparableDoublyLinkedList0.iterateBackward();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDoublyLinkedList0.removeFirst();
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + strComparable8 + "' != '" + "" + "'", strComparable8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strComparable15);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test48");
        DoublyLinkedList<java.lang.Comparable<java.lang.String>> strComparableDoublyLinkedList0 = new DoublyLinkedList<java.lang.Comparable<java.lang.String>>();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass3 = strComparableDoublyLinkedList0.getClass();
        int int4 = strComparableDoublyLinkedList0.size();
        int int5 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "");
        strComparableDoublyLinkedList0.iterateForward();
        int int9 = strComparableDoublyLinkedList0.size();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDoublyLinkedList0.removeFirst();
        int int11 = strComparableDoublyLinkedList0.size();
        strComparableDoublyLinkedList0.addLast((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + strComparable10 + "' != '" + "" + "'", strComparable10.equals(""));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }
}

