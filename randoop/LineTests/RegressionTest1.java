import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test001");
        Line line2 = new Line((double) 0.0f, (double) (short) 0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
        Line line2 = new Line((double) (-1), (double) 0);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        double double10 = line9.slope;
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        line13.slope = 0.0d;
        boolean boolean16 = line9.Intersect(line13);
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        boolean boolean21 = line13.Intersect(line19);
        boolean boolean22 = line5.Intersect(line13);
        Line line25 = new Line((double) 10L, (double) ' ');
        line25.slope = 1L;
        double double28 = line25.slope;
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        double double39 = line31.yintercept;
        double double40 = line31.slope;
        boolean boolean41 = line25.Intersect(line31);
        boolean boolean42 = line5.Intersect(line31);
        Line line45 = new Line((double) ' ', (double) 1);
        boolean boolean46 = line5.Intersect(line45);
        boolean boolean47 = line2.Intersect(line45);
        Line line50 = new Line((double) ' ', 100.0d);
        Line line53 = new Line((double) (byte) 0, (double) 'a');
        double double54 = line53.slope;
        Line line57 = new Line((double) (byte) 0, (double) 'a');
        double double58 = line57.slope;
        Line line61 = new Line((double) (byte) 0, (double) 'a');
        line61.slope = 0.0d;
        boolean boolean64 = line57.Intersect(line61);
        Line line67 = new Line((double) (byte) 0, (double) 'a');
        double double68 = line67.slope;
        boolean boolean69 = line61.Intersect(line67);
        boolean boolean70 = line53.Intersect(line61);
        line53.slope = 10.0d;
        boolean boolean73 = line50.Intersect(line53);
        double double74 = line50.yintercept;
        boolean boolean75 = line45.Intersect(line50);
        line45.yintercept = (short) 100;
        line45.slope = 100L;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 100.0d + "'", double74 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        double double15 = line6.slope;
        java.lang.String str16 = line6.toString();
        java.lang.Class<?> wildcardClass17 = line6.getClass();
        line6.yintercept = (byte) 1;
        Line line22 = new Line((double) 100L, 97.0d);
        double double23 = line22.yintercept;
        double double24 = line22.yintercept;
        java.lang.Class<?> wildcardClass25 = line22.getClass();
        boolean boolean26 = line6.Intersect(line22);
        double double27 = line22.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 97.0d + "'", double23 == 97.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        Line line2 = new Line((-1.0d), (double) (short) 0);
        java.lang.String str3 = line2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: -1.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str3.equals("slope: -1.0, yintercept: 0.0, epsilon:1.0E-6"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        double double23 = line22.slope;
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        line26.slope = 0.0d;
        boolean boolean29 = line22.Intersect(line26);
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        boolean boolean34 = line26.Intersect(line32);
        line32.yintercept = 0.0d;
        Line line39 = new Line((double) (byte) 0, (double) 'a');
        double double40 = line39.slope;
        Line line43 = new Line((double) (byte) 0, (double) 'a');
        line43.slope = 0.0d;
        boolean boolean46 = line39.Intersect(line43);
        boolean boolean47 = line32.Intersect(line43);
        java.lang.Class<?> wildcardClass48 = line43.getClass();
        Line line51 = new Line((double) (byte) 0, (double) 'a');
        double double52 = line51.slope;
        Line line55 = new Line((double) (byte) 0, (double) 'a');
        line55.slope = 0.0d;
        boolean boolean58 = line51.Intersect(line55);
        double double59 = line55.yintercept;
        Line line62 = new Line(0.0d, (double) (-1L));
        boolean boolean63 = line55.Intersect(line62);
        java.lang.Class<?> wildcardClass64 = line55.getClass();
        boolean boolean65 = line43.Intersect(line55);
        boolean boolean66 = line10.Intersect(line55);
        double double67 = line10.slope;
        double double68 = line10.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 97.0d + "'", double59 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        java.lang.Class<?> wildcardClass14 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        double double14 = line13.slope;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        line17.slope = 0.0d;
        boolean boolean20 = line13.Intersect(line17);
        double double21 = line17.yintercept;
        boolean boolean22 = line2.Intersect(line17);
        line17.slope = '#';
        double double25 = line17.yintercept;
        double double26 = line17.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 35.0d + "'", double26 == 35.0d);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        double double15 = line6.slope;
        Line line18 = new Line((double) 1.0f, (double) (short) 1);
        boolean boolean19 = line6.Intersect(line18);
        double double20 = line18.slope;
        java.lang.String str21 = line18.toString();
        line18.slope = 1.0f;
        java.lang.Class<?> wildcardClass24 = line18.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 1.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str21.equals("slope: 1.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        line28.yintercept = (byte) 1;
        line28.slope = 100;
        java.lang.Class<?> wildcardClass44 = line28.getClass();
        double double45 = line28.yintercept;
        line28.yintercept = (byte) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        double double20 = line2.slope;
        Line line21 = null;
        try {
            boolean boolean22 = line2.Intersect(line21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
        Line line2 = new Line((double) (short) 1, (double) 0.0f);
        java.lang.String str3 = line2.toString();
        line2.slope = 10L;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 1.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str3.equals("slope: 1.0, yintercept: 0.0, epsilon:1.0E-6"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        Line line2 = new Line(100.0d, 0.0d);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        double double15 = line6.slope;
        Line line18 = new Line((double) 1.0f, (double) (short) 1);
        boolean boolean19 = line6.Intersect(line18);
        double double20 = line18.slope;
        java.lang.String str21 = line18.toString();
        line18.slope = 10.0d;
        line18.slope = 100.0d;
        Line line28 = new Line((double) (byte) 1, (double) 1L);
        double double29 = line28.slope;
        boolean boolean30 = line18.Intersect(line28);
        line28.slope = (short) 10;
        Line line35 = new Line((double) 0, 10.0d);
        line35.yintercept = 10;
        boolean boolean38 = line28.Intersect(line35);
        double double39 = line35.yintercept;
        line35.slope = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 1.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str21.equals("slope: 1.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
        Line line2 = new Line((double) 1.0f, (double) 100);
        double double3 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        double double14 = line13.slope;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        line17.slope = 0.0d;
        boolean boolean20 = line13.Intersect(line17);
        double double21 = line13.yintercept;
        boolean boolean22 = line2.Intersect(line13);
        line2.slope = 0;
        double double25 = line2.yintercept;
        java.lang.String str26 = line2.toString();
        double double27 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str26.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 97.0d + "'", double27 == 97.0d);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        line10.slope = 0L;
        line10.yintercept = (-1L);
        java.lang.String str24 = line10.toString();
        line10.slope = (byte) -1;
        Line line29 = new Line((double) 10L, (double) ' ');
        line29.slope = 1L;
        double double32 = line29.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        double double36 = line35.slope;
        Line line39 = new Line((double) (byte) 0, (double) 'a');
        line39.slope = 0.0d;
        boolean boolean42 = line35.Intersect(line39);
        double double43 = line35.yintercept;
        double double44 = line35.slope;
        boolean boolean45 = line29.Intersect(line35);
        boolean boolean46 = line10.Intersect(line29);
        java.lang.Class<?> wildcardClass47 = line29.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str24.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 97.0d + "'", double43 == 97.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        java.lang.String str5 = line2.toString();
        line2.yintercept = ' ';
        java.lang.Class<?> wildcardClass8 = line2.getClass();
        double double9 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str5.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        Line line2 = new Line((double) 'a', (double) 100.0f);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        Line line2 = new Line((double) (short) 1, (double) 100.0f);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
        Line line2 = new Line((double) 10L, (double) 10.0f);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        double double6 = line2.slope;
        double double7 = line2.yintercept;
        line2.slope = (byte) 1;
        java.lang.String str10 = line2.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "slope: 1.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str10.equals("slope: 1.0, yintercept: 32.0, epsilon:1.0E-6"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
        Line line2 = new Line(0.0d, 97.0d);
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
        Line line2 = new Line((double) 'a', (double) (byte) -1);
        Line line5 = new Line(10.0d, (double) 0L);
        Line line8 = new Line((double) 'a', (double) (byte) 10);
        line8.yintercept = (-1.0f);
        boolean boolean11 = line5.Intersect(line8);
        java.lang.Class<?> wildcardClass12 = line8.getClass();
        java.lang.Class<?> wildcardClass13 = line8.getClass();
        boolean boolean14 = line2.Intersect(line8);
        line2.slope = ' ';
        line2.slope = 1;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        Line line18 = new Line((double) (byte) 0, (double) 'a');
        double double19 = line18.slope;
        boolean boolean20 = line12.Intersect(line18);
        java.lang.String str21 = line12.toString();
        double double22 = line12.slope;
        boolean boolean23 = line2.Intersect(line12);
        double double24 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 32.0d + "'", double24 == 32.0d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
        Line line2 = new Line(97.0d, (double) (short) 1);
        java.lang.String str3 = line2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 97.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str3.equals("slope: 97.0, yintercept: 1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        double double14 = line13.slope;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        line17.slope = 0.0d;
        boolean boolean20 = line13.Intersect(line17);
        double double21 = line17.yintercept;
        boolean boolean22 = line2.Intersect(line17);
        line17.slope = '#';
        line17.yintercept = (byte) 1;
        Line line27 = null;
        try {
            boolean boolean28 = line17.Intersect(line27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        line2.slope = 0.0d;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean8 = line2.Intersect(line7);
        line7.yintercept = '4';
        Line line13 = new Line((double) 10L, (double) ' ');
        line13.slope = 1L;
        double double16 = line13.slope;
        double double17 = line13.slope;
        Line line20 = new Line((double) ' ', (double) '4');
        boolean boolean21 = line13.Intersect(line20);
        line20.slope = 97.0d;
        boolean boolean24 = line7.Intersect(line20);
        line7.yintercept = (short) 1;
        double double27 = line7.yintercept;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
        Line line2 = new Line((double) 100L, 97.0d);
        line2.slope = 32.0d;
        line2.slope = '4';
        Line line9 = new Line((double) 100L, 97.0d);
        line9.slope = 32.0d;
        line9.yintercept = 100.0d;
        double double14 = line9.yintercept;
        java.lang.String str15 = line9.toString();
        boolean boolean16 = line2.Intersect(line9);
        double double17 = line2.yintercept;
        double double18 = line2.slope;
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str15.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        line28.yintercept = 'a';
        double double42 = line28.slope;
        java.lang.Class<?> wildcardClass43 = line28.getClass();
        java.lang.String str44 = line28.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str44.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
        Line line2 = new Line((double) 1L, (double) (-1L));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        double double16 = line8.yintercept;
        double double17 = line8.slope;
        boolean boolean18 = line2.Intersect(line8);
        line8.slope = (byte) 10;
        java.lang.String str21 = line8.toString();
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        double double25 = line24.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        line28.slope = 0.0d;
        boolean boolean31 = line24.Intersect(line28);
        double double32 = line28.yintercept;
        Line line35 = new Line(0.0d, (double) (-1L));
        boolean boolean36 = line28.Intersect(line35);
        Line line39 = new Line((double) 100L, (double) 100);
        java.lang.String str40 = line39.toString();
        boolean boolean41 = line28.Intersect(line39);
        line28.slope = (byte) 1;
        boolean boolean44 = line8.Intersect(line28);
        line8.yintercept = 52.0d;
        line8.yintercept = (byte) 10;
        line8.yintercept = 52.0d;
        double double51 = line8.yintercept;
        double double52 = line8.yintercept;
        double double53 = line8.slope;
        line8.slope = 10;
        double double56 = line8.slope;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str40.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 52.0d + "'", double51 == 52.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 52.0d + "'", double52 == 52.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        line2.slope = 100.0f;
        java.lang.Class<?> wildcardClass13 = line2.getClass();
        line2.yintercept = 'a';
        line2.yintercept = 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
        Line line2 = new Line((double) ' ', 100.0d);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        double double10 = line9.slope;
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        line13.slope = 0.0d;
        boolean boolean16 = line9.Intersect(line13);
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        boolean boolean21 = line13.Intersect(line19);
        boolean boolean22 = line5.Intersect(line13);
        line5.slope = 10.0d;
        boolean boolean25 = line2.Intersect(line5);
        line5.yintercept = (byte) -1;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        Line line2 = new Line((double) (-1.0f), (double) (short) 10);
        double double3 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
        Line line2 = new Line(1.0d, 100.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 0.0d;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        boolean boolean27 = line12.Intersect(line23);
        java.lang.Class<?> wildcardClass28 = line23.getClass();
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        double double39 = line35.yintercept;
        Line line42 = new Line(0.0d, (double) (-1L));
        boolean boolean43 = line35.Intersect(line42);
        java.lang.Class<?> wildcardClass44 = line35.getClass();
        boolean boolean45 = line23.Intersect(line35);
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        double double49 = line48.slope;
        Line line52 = new Line((double) (byte) 0, (double) 'a');
        line52.slope = 0.0d;
        boolean boolean55 = line48.Intersect(line52);
        double double56 = line52.yintercept;
        Line line59 = new Line(0.0d, (double) (-1L));
        boolean boolean60 = line52.Intersect(line59);
        double double61 = line52.slope;
        java.lang.String str62 = line52.toString();
        boolean boolean63 = line23.Intersect(line52);
        java.lang.String str64 = line52.toString();
        line52.yintercept = (-1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 97.0d + "'", double56 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str62.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str64.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        Line line2 = new Line(97.0d, (double) (short) 1);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        line9.slope = 0.0d;
        boolean boolean12 = line5.Intersect(line9);
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        double double16 = line15.slope;
        boolean boolean17 = line9.Intersect(line15);
        double double18 = line9.slope;
        line9.slope = 100.0f;
        boolean boolean21 = line2.Intersect(line9);
        Line line24 = new Line((double) 10L, (double) ' ');
        Line line27 = new Line((double) 10L, (double) ' ');
        line27.slope = 1L;
        double double30 = line27.slope;
        double double31 = line27.slope;
        double double32 = line27.yintercept;
        boolean boolean33 = line24.Intersect(line27);
        line24.slope = 0;
        boolean boolean36 = line9.Intersect(line24);
        line24.yintercept = (-1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 32.0d + "'", double32 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
        Line line2 = new Line((double) 100, 10.0d);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        line2.slope = 0.0d;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean8 = line2.Intersect(line7);
        Line line11 = new Line((double) ' ', (double) 1);
        line11.yintercept = 100.0f;
        java.lang.Class<?> wildcardClass14 = line11.getClass();
        line11.slope = 0.0d;
        double double17 = line11.yintercept;
        java.lang.String str18 = line11.toString();
        Line line21 = new Line((double) (byte) 0, (double) 'a');
        double double22 = line21.slope;
        Line line25 = new Line((double) (byte) 0, (double) 'a');
        double double26 = line25.slope;
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        line29.slope = 0.0d;
        boolean boolean32 = line25.Intersect(line29);
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        double double36 = line35.slope;
        boolean boolean37 = line29.Intersect(line35);
        boolean boolean38 = line21.Intersect(line29);
        Line line41 = new Line((double) 10L, (double) ' ');
        line41.slope = 1L;
        double double44 = line41.slope;
        Line line47 = new Line((double) (byte) 0, (double) 'a');
        double double48 = line47.slope;
        Line line51 = new Line((double) (byte) 0, (double) 'a');
        line51.slope = 0.0d;
        boolean boolean54 = line47.Intersect(line51);
        double double55 = line47.yintercept;
        double double56 = line47.slope;
        boolean boolean57 = line41.Intersect(line47);
        boolean boolean58 = line21.Intersect(line47);
        line47.yintercept = 'a';
        boolean boolean61 = line11.Intersect(line47);
        boolean boolean62 = line2.Intersect(line11);
        Line line65 = new Line((double) (byte) 0, (double) 'a');
        double double66 = line65.slope;
        Line line69 = new Line((double) (byte) 0, (double) 'a');
        double double70 = line69.slope;
        Line line73 = new Line((double) (byte) 0, (double) 'a');
        line73.slope = 0.0d;
        boolean boolean76 = line69.Intersect(line73);
        Line line79 = new Line((double) (byte) 0, (double) 'a');
        double double80 = line79.slope;
        boolean boolean81 = line73.Intersect(line79);
        boolean boolean82 = line65.Intersect(line73);
        Line line85 = new Line((double) (byte) 10, 97.0d);
        double double86 = line85.yintercept;
        boolean boolean87 = line65.Intersect(line85);
        line65.yintercept = 10L;
        boolean boolean90 = line11.Intersect(line65);
        double double91 = line65.yintercept;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 0.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str18.equals("slope: 0.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 97.0d + "'", double55 == 97.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 97.0d + "'", double86 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 10.0d + "'", double91 == 10.0d);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 0.0d;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        boolean boolean27 = line12.Intersect(line23);
        java.lang.Class<?> wildcardClass28 = line23.getClass();
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        double double39 = line35.yintercept;
        Line line42 = new Line(0.0d, (double) (-1L));
        boolean boolean43 = line35.Intersect(line42);
        java.lang.Class<?> wildcardClass44 = line35.getClass();
        boolean boolean45 = line23.Intersect(line35);
        double double46 = line23.yintercept;
        java.lang.Class<?> wildcardClass47 = line23.getClass();
        double double48 = line23.slope;
        java.lang.String str49 = line23.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 97.0d + "'", double46 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str49.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        Line line2 = new Line((-1.0d), 10.0d);
        double double3 = line2.slope;
        java.lang.String str4 = line2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "slope: -1.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str4.equals("slope: -1.0, yintercept: 10.0, epsilon:1.0E-6"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        double double15 = line6.slope;
        java.lang.String str16 = line6.toString();
        java.lang.Class<?> wildcardClass17 = line6.getClass();
        java.lang.String str18 = line6.toString();
        Line line21 = new Line((double) 10L, (double) ' ');
        java.lang.Class<?> wildcardClass22 = line21.getClass();
        double double23 = line21.slope;
        Line line26 = new Line((double) 'a', (double) (byte) 10);
        line26.slope = (short) 100;
        line26.slope = 97.0d;
        boolean boolean31 = line21.Intersect(line26);
        java.lang.Class<?> wildcardClass32 = line26.getClass();
        double double33 = line26.slope;
        java.lang.String str34 = line26.toString();
        boolean boolean35 = line6.Intersect(line26);
        double double36 = line26.yintercept;
        line26.yintercept = (byte) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str18.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 97.0d + "'", double33 == 97.0d);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str34.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
        Line line2 = new Line((double) (short) 10, (double) 10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        Line line2 = new Line((double) 0.0f, (double) (short) 1);
        line2.yintercept = 32.0d;
        double double5 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        line28.yintercept = 'a';
        java.lang.String str42 = line28.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str42.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
        Line line2 = new Line((double) 100L, 97.0d);
        line2.slope = 32.0d;
        line2.yintercept = 100.0d;
        double double7 = line2.yintercept;
        java.lang.String str8 = line2.toString();
        java.lang.Class<?> wildcardClass9 = line2.getClass();
        Line line12 = new Line((double) 'a', (double) (byte) 10);
        double double13 = line12.slope;
        line12.yintercept = 10.0f;
        double double16 = line12.slope;
        Line line19 = new Line((double) ' ', (double) 1);
        line19.yintercept = 100.0f;
        boolean boolean22 = line12.Intersect(line19);
        boolean boolean23 = line2.Intersect(line12);
        line2.yintercept = (byte) -1;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str8.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        double double16 = line6.slope;
        java.lang.String str17 = line6.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str17.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        Line line2 = new Line((double) 100.0f, (double) (short) 10);
        double double3 = line2.slope;
        line2.yintercept = 32.0d;
        java.lang.String str6 = line2.toString();
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        double double10 = line9.slope;
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        line13.slope = 0.0d;
        boolean boolean16 = line9.Intersect(line13);
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        boolean boolean21 = line13.Intersect(line19);
        line19.yintercept = 0.0d;
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        double double27 = line26.slope;
        Line line30 = new Line((double) (byte) 0, (double) 'a');
        line30.slope = 0.0d;
        boolean boolean33 = line26.Intersect(line30);
        boolean boolean34 = line19.Intersect(line30);
        java.lang.Class<?> wildcardClass35 = line30.getClass();
        Line line38 = new Line((double) (byte) 0, (double) 'a');
        double double39 = line38.slope;
        Line line42 = new Line((double) (byte) 0, (double) 'a');
        line42.slope = 0.0d;
        boolean boolean45 = line38.Intersect(line42);
        double double46 = line42.yintercept;
        Line line49 = new Line(0.0d, (double) (-1L));
        boolean boolean50 = line42.Intersect(line49);
        java.lang.Class<?> wildcardClass51 = line42.getClass();
        boolean boolean52 = line30.Intersect(line42);
        Line line55 = new Line((double) (byte) 0, (double) 'a');
        double double56 = line55.slope;
        Line line59 = new Line((double) (byte) 0, (double) 'a');
        line59.slope = 0.0d;
        boolean boolean62 = line55.Intersect(line59);
        double double63 = line59.yintercept;
        Line line66 = new Line(0.0d, (double) (-1L));
        boolean boolean67 = line59.Intersect(line66);
        double double68 = line59.slope;
        java.lang.String str69 = line59.toString();
        boolean boolean70 = line30.Intersect(line59);
        java.lang.String str71 = line59.toString();
        java.lang.String str72 = line59.toString();
        java.lang.Class<?> wildcardClass73 = line59.getClass();
        boolean boolean74 = line2.Intersect(line59);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "slope: 100.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str6.equals("slope: 100.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 97.0d + "'", double46 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 97.0d + "'", double63 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str69.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str71.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str72.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
        Line line2 = new Line((double) 0.0f, (double) (short) 1);
        double double3 = line2.yintercept;
        double double4 = line2.yintercept;
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        java.lang.Class<?> wildcardClass16 = line8.getClass();
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        double double27 = line19.yintercept;
        boolean boolean28 = line8.Intersect(line19);
        double double29 = line8.slope;
        line8.yintercept = 1;
        boolean boolean32 = line2.Intersect(line8);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 97.0d + "'", double27 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
        Line line2 = new Line((double) (byte) 10, (double) (short) -1);
        double double3 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        Line line2 = new Line((double) 100L, 97.0d);
        line2.slope = 32.0d;
        line2.yintercept = 100.0d;
        double double7 = line2.yintercept;
        java.lang.String str8 = line2.toString();
        java.lang.Class<?> wildcardClass9 = line2.getClass();
        Line line12 = new Line((double) 'a', (double) (byte) 10);
        double double13 = line12.slope;
        line12.yintercept = 10.0f;
        double double16 = line12.slope;
        Line line19 = new Line((double) ' ', (double) 1);
        line19.yintercept = 100.0f;
        boolean boolean22 = line12.Intersect(line19);
        boolean boolean23 = line2.Intersect(line12);
        Line line26 = new Line((double) (byte) 10, (-1.0d));
        java.lang.String str27 = line26.toString();
        boolean boolean28 = line12.Intersect(line26);
        line26.yintercept = 0.0d;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str8.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "slope: 10.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str27.equals("slope: 10.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        Line line2 = new Line((double) (byte) 1, 0.0d);
        java.lang.String str3 = line2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 1.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str3.equals("slope: 1.0, yintercept: 0.0, epsilon:1.0E-6"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
        Line line2 = new Line((double) 100L, (double) 100);
        java.lang.String str3 = line2.toString();
        double double4 = line2.slope;
        line2.yintercept = 0.0d;
        java.lang.String str7 = line2.toString();
        Line line10 = new Line((double) 'a', (double) (byte) 10);
        line10.slope = (short) 100;
        line10.slope = 97.0d;
        line10.yintercept = (-1L);
        java.lang.String str17 = line10.toString();
        double double18 = line10.yintercept;
        java.lang.String str19 = line10.toString();
        double double20 = line10.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        double double24 = line23.slope;
        Line line27 = new Line((double) (byte) 0, (double) 'a');
        double double28 = line27.slope;
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        line31.slope = 0.0d;
        boolean boolean34 = line27.Intersect(line31);
        Line line37 = new Line((double) (byte) 0, (double) 'a');
        double double38 = line37.slope;
        boolean boolean39 = line31.Intersect(line37);
        boolean boolean40 = line23.Intersect(line31);
        Line line43 = new Line((double) 10L, (double) ' ');
        line43.slope = 1L;
        double double46 = line43.slope;
        Line line49 = new Line((double) (byte) 0, (double) 'a');
        double double50 = line49.slope;
        Line line53 = new Line((double) (byte) 0, (double) 'a');
        line53.slope = 0.0d;
        boolean boolean56 = line49.Intersect(line53);
        double double57 = line49.yintercept;
        double double58 = line49.slope;
        boolean boolean59 = line43.Intersect(line49);
        boolean boolean60 = line23.Intersect(line49);
        Line line63 = new Line((double) ' ', (double) 1);
        boolean boolean64 = line23.Intersect(line63);
        double double65 = line63.yintercept;
        boolean boolean66 = line10.Intersect(line63);
        boolean boolean67 = line2.Intersect(line10);
        line2.slope = 10;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str3.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "slope: 100.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str7.equals("slope: 100.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str17.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str19.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 97.0d + "'", double57 == 97.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 1.0d + "'", double65 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        double double16 = line8.yintercept;
        double double17 = line8.slope;
        boolean boolean18 = line2.Intersect(line8);
        line8.slope = (byte) 10;
        java.lang.String str21 = line8.toString();
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        double double25 = line24.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        line28.slope = 0.0d;
        boolean boolean31 = line24.Intersect(line28);
        double double32 = line28.yintercept;
        Line line35 = new Line(0.0d, (double) (-1L));
        boolean boolean36 = line28.Intersect(line35);
        Line line39 = new Line((double) 100L, (double) 100);
        java.lang.String str40 = line39.toString();
        boolean boolean41 = line28.Intersect(line39);
        line28.slope = (byte) 1;
        boolean boolean44 = line8.Intersect(line28);
        line28.slope = 10.0f;
        Line line49 = new Line((double) 'a', (double) (byte) 10);
        double double50 = line49.slope;
        Line line53 = new Line((double) (byte) 0, (double) 'a');
        double double54 = line53.slope;
        Line line57 = new Line((double) (byte) 0, (double) 'a');
        double double58 = line57.slope;
        Line line61 = new Line((double) (byte) 0, (double) 'a');
        line61.slope = 0.0d;
        boolean boolean64 = line57.Intersect(line61);
        Line line67 = new Line((double) (byte) 0, (double) 'a');
        double double68 = line67.slope;
        boolean boolean69 = line61.Intersect(line67);
        java.lang.String str70 = line61.toString();
        double double71 = line61.slope;
        boolean boolean72 = line53.Intersect(line61);
        java.lang.Class<?> wildcardClass73 = line53.getClass();
        boolean boolean74 = line49.Intersect(line53);
        boolean boolean75 = line28.Intersect(line49);
        Line line78 = new Line((double) ' ', (double) 1);
        java.lang.String str79 = line78.toString();
        double double80 = line78.yintercept;
        line78.slope = (byte) 10;
        boolean boolean83 = line49.Intersect(line78);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str40.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 97.0d + "'", double50 == 97.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str70.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "slope: 32.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str79.equals("slope: 32.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 1.0d + "'", double80 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
        Line line2 = new Line((double) 100, 0.0d);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        double double10 = line9.slope;
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        line13.slope = 0.0d;
        boolean boolean16 = line9.Intersect(line13);
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        boolean boolean21 = line13.Intersect(line19);
        boolean boolean22 = line5.Intersect(line13);
        double double23 = line5.slope;
        double double24 = line5.slope;
        boolean boolean25 = line2.Intersect(line5);
        line2.slope = 'a';
        java.lang.Class<?> wildcardClass28 = line2.getClass();
        line2.slope = 1;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        java.lang.Class<?> wildcardClass15 = line13.getClass();
        double double16 = line13.slope;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        boolean boolean31 = line23.Intersect(line29);
        java.lang.Class<?> wildcardClass32 = line23.getClass();
        java.lang.String str33 = line23.toString();
        Line line36 = new Line((double) (byte) 0, (double) 'a');
        double double37 = line36.slope;
        Line line40 = new Line((double) (byte) 0, (double) 'a');
        line40.slope = 0.0d;
        boolean boolean43 = line36.Intersect(line40);
        Line line46 = new Line((double) (byte) 0, (double) 'a');
        double double47 = line46.slope;
        boolean boolean48 = line40.Intersect(line46);
        java.lang.Class<?> wildcardClass49 = line40.getClass();
        java.lang.String str50 = line40.toString();
        boolean boolean51 = line23.Intersect(line40);
        java.lang.Class<?> wildcardClass52 = line23.getClass();
        double double53 = line23.slope;
        boolean boolean54 = line13.Intersect(line23);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str50.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
        Line line2 = new Line((double) (-1), (double) 0L);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        Line line2 = new Line((double) '#', (double) (byte) -1);
        line2.slope = (byte) -1;
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        Line line2 = new Line((double) (-1L), (double) 1);
        line2.yintercept = 100.0f;
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        Line line2 = new Line((double) 100L, (double) 1L);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        Line line2 = new Line((double) 1.0f, (double) 0.0f);
        double double3 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        Line line2 = new Line((double) 1.0f, (double) 1.0f);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        Line line2 = new Line((double) 'a', 1.0d);
        Line line5 = new Line((double) 'a', (double) (byte) 10);
        line5.slope = (short) 100;
        line5.slope = 97.0d;
        line5.yintercept = (-1L);
        java.lang.String str12 = line5.toString();
        double double13 = line5.yintercept;
        java.lang.Class<?> wildcardClass14 = line5.getClass();
        boolean boolean15 = line2.Intersect(line5);
        double double16 = line2.slope;
        Line line19 = new Line((double) 100L, 97.0d);
        line19.slope = 32.0d;
        line19.yintercept = 100.0d;
        double double24 = line19.yintercept;
        double double25 = line19.yintercept;
        line19.slope = (byte) 10;
        boolean boolean28 = line2.Intersect(line19);
        line2.slope = (-1.0d);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str12.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        Line line2 = new Line((double) ' ', 100.0d);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        double double10 = line9.slope;
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        line13.slope = 0.0d;
        boolean boolean16 = line9.Intersect(line13);
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        boolean boolean21 = line13.Intersect(line19);
        boolean boolean22 = line5.Intersect(line13);
        line5.slope = 10.0d;
        boolean boolean25 = line2.Intersect(line5);
        line2.slope = 1;
        line2.slope = ' ';
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        double double40 = line28.yintercept;
        line28.yintercept = 0L;
        double double43 = line28.slope;
        double double44 = line28.yintercept;
        line28.slope = 0.0d;
        double double47 = line28.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 97.0d + "'", double40 == 97.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        Line line2 = new Line((double) 10L, (double) ' ');
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        double double4 = line2.slope;
        Line line7 = new Line((double) 'a', (double) (byte) 10);
        line7.slope = (short) 100;
        line7.slope = 97.0d;
        boolean boolean12 = line2.Intersect(line7);
        Line line15 = new Line((double) (byte) 1, 1.0d);
        line15.slope = 10.0f;
        boolean boolean18 = line7.Intersect(line15);
        java.lang.String str19 = line7.toString();
        double double20 = line7.slope;
        Line line23 = new Line((double) 10L, (double) ' ');
        java.lang.Class<?> wildcardClass24 = line23.getClass();
        double double25 = line23.slope;
        Line line28 = new Line((double) 'a', (double) (byte) 10);
        line28.slope = (short) 100;
        line28.slope = 97.0d;
        boolean boolean33 = line23.Intersect(line28);
        Line line36 = new Line((double) (byte) 1, 1.0d);
        line36.slope = 10.0f;
        boolean boolean39 = line28.Intersect(line36);
        boolean boolean40 = line7.Intersect(line36);
        java.lang.String str41 = line36.toString();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str19.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "slope: 10.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str41.equals("slope: 10.0, yintercept: 1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        Line line2 = new Line((double) 1.0f, (double) (short) 1);
        double double3 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        Line line2 = new Line(97.0d, (double) (short) -1);
        java.lang.String str3 = line2.toString();
        java.lang.String str4 = line2.toString();
        line2.yintercept = (-1);
        line2.yintercept = 0.0d;
        double double9 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str3.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str4.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        double double16 = line8.yintercept;
        double double17 = line8.slope;
        boolean boolean18 = line2.Intersect(line8);
        line8.slope = (byte) 10;
        java.lang.String str21 = line8.toString();
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        double double25 = line24.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        line28.slope = 0.0d;
        boolean boolean31 = line24.Intersect(line28);
        double double32 = line28.yintercept;
        Line line35 = new Line(0.0d, (double) (-1L));
        boolean boolean36 = line28.Intersect(line35);
        Line line39 = new Line((double) 100L, (double) 100);
        java.lang.String str40 = line39.toString();
        boolean boolean41 = line28.Intersect(line39);
        line28.slope = (byte) 1;
        boolean boolean44 = line8.Intersect(line28);
        line8.yintercept = 52.0d;
        line8.yintercept = (byte) 10;
        line8.yintercept = 52.0d;
        java.lang.Class<?> wildcardClass51 = line8.getClass();
        java.lang.String str52 = line8.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str40.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "slope: 10.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str52.equals("slope: 10.0, yintercept: 52.0, epsilon:1.0E-6"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        double double16 = line8.yintercept;
        double double17 = line8.slope;
        boolean boolean18 = line2.Intersect(line8);
        line8.slope = (byte) 10;
        java.lang.String str21 = line8.toString();
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        double double25 = line24.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        line28.slope = 0.0d;
        boolean boolean31 = line24.Intersect(line28);
        double double32 = line28.yintercept;
        Line line35 = new Line(0.0d, (double) (-1L));
        boolean boolean36 = line28.Intersect(line35);
        Line line39 = new Line((double) 100L, (double) 100);
        java.lang.String str40 = line39.toString();
        boolean boolean41 = line28.Intersect(line39);
        line28.slope = (byte) 1;
        boolean boolean44 = line8.Intersect(line28);
        line28.slope = 10.0f;
        Line line49 = new Line((double) 'a', (double) (byte) 10);
        double double50 = line49.slope;
        Line line53 = new Line((double) (byte) 0, (double) 'a');
        double double54 = line53.slope;
        Line line57 = new Line((double) (byte) 0, (double) 'a');
        double double58 = line57.slope;
        Line line61 = new Line((double) (byte) 0, (double) 'a');
        line61.slope = 0.0d;
        boolean boolean64 = line57.Intersect(line61);
        Line line67 = new Line((double) (byte) 0, (double) 'a');
        double double68 = line67.slope;
        boolean boolean69 = line61.Intersect(line67);
        java.lang.String str70 = line61.toString();
        double double71 = line61.slope;
        boolean boolean72 = line53.Intersect(line61);
        java.lang.Class<?> wildcardClass73 = line53.getClass();
        boolean boolean74 = line49.Intersect(line53);
        boolean boolean75 = line28.Intersect(line49);
        double double76 = line49.slope;
        java.lang.String str77 = line49.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str40.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 97.0d + "'", double50 == 97.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str70.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 97.0d + "'", double76 == 97.0d);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str77.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        double double40 = line28.yintercept;
        line28.yintercept = 0L;
        java.lang.String str43 = line28.toString();
        double double44 = line28.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 97.0d + "'", double40 == 97.0d);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "slope: 0.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str43.equals("slope: 0.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
        Line line2 = new Line((double) 10L, (double) (byte) 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        double double6 = line2.slope;
        Line line9 = new Line((double) ' ', (double) '4');
        boolean boolean10 = line2.Intersect(line9);
        line2.yintercept = 10;
        java.lang.Class<?> wildcardClass13 = line2.getClass();
        double double14 = line2.slope;
        java.lang.String str15 = line2.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "slope: 1.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str15.equals("slope: 1.0, yintercept: 10.0, epsilon:1.0E-6"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        double double14 = line13.slope;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        line17.slope = 0.0d;
        boolean boolean20 = line13.Intersect(line17);
        double double21 = line13.yintercept;
        boolean boolean22 = line2.Intersect(line13);
        line2.slope = 0;
        double double25 = line2.yintercept;
        java.lang.String str26 = line2.toString();
        java.lang.String str27 = line2.toString();
        Line line30 = new Line((double) (byte) 0, (double) 'a');
        double double31 = line30.slope;
        Line line34 = new Line((double) (byte) 0, (double) 'a');
        line34.slope = 0.0d;
        boolean boolean37 = line30.Intersect(line34);
        Line line40 = new Line((double) (byte) 0, (double) 'a');
        double double41 = line40.slope;
        boolean boolean42 = line34.Intersect(line40);
        line40.yintercept = 10;
        line40.yintercept = (byte) 0;
        Line line49 = new Line((double) 100L, 97.0d);
        line49.slope = 32.0d;
        line49.slope = '4';
        boolean boolean54 = line40.Intersect(line49);
        line40.slope = '#';
        Line line59 = new Line((double) 10L, (double) ' ');
        line59.slope = 1L;
        double double62 = line59.slope;
        double double63 = line59.slope;
        Line line66 = new Line((double) ' ', (double) '4');
        boolean boolean67 = line59.Intersect(line66);
        java.lang.String str68 = line66.toString();
        java.lang.String str69 = line66.toString();
        line66.slope = 97.0d;
        boolean boolean72 = line40.Intersect(line66);
        double double73 = line66.slope;
        boolean boolean74 = line2.Intersect(line66);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str26.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str27.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0d + "'", double62 == 1.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 1.0d + "'", double63 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "slope: 32.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str68.equals("slope: 32.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "slope: 32.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str69.equals("slope: 32.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 97.0d + "'", double73 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        java.lang.String str16 = line6.toString();
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        boolean boolean31 = line23.Intersect(line29);
        java.lang.Class<?> wildcardClass32 = line23.getClass();
        java.lang.String str33 = line23.toString();
        boolean boolean34 = line6.Intersect(line23);
        line23.slope = 97.0d;
        java.lang.Class<?> wildcardClass37 = line23.getClass();
        line23.slope = (short) 100;
        java.lang.String str40 = line23.toString();
        line23.yintercept = 1.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: 100.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str40.equals("slope: 100.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.slope = 1.0d;
        java.lang.String str17 = line12.toString();
        java.lang.String str18 = line12.toString();
        line12.yintercept = 100L;
        java.lang.String str21 = line12.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "slope: 1.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str17.equals("slope: 1.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 1.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str18.equals("slope: 1.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 1.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str21.equals("slope: 1.0, yintercept: 100.0, epsilon:1.0E-6"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
        Line line2 = new Line((double) 100L, (double) (short) -1);
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        line2.yintercept = 32.0d;
        line2.slope = (-1L);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        Line line2 = new Line((double) ' ', (double) '4');
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        double double4 = line2.yintercept;
        Line line7 = new Line((double) 'a', (double) (byte) 10);
        line7.slope = 100.0f;
        double double10 = line7.slope;
        Line line13 = new Line(10.0d, (double) 0L);
        Line line16 = new Line((double) 'a', (double) (byte) 10);
        line16.yintercept = (-1.0f);
        boolean boolean19 = line13.Intersect(line16);
        boolean boolean20 = line7.Intersect(line13);
        java.lang.String str21 = line13.toString();
        line13.yintercept = 0L;
        java.lang.String str24 = line13.toString();
        boolean boolean25 = line2.Intersect(line13);
        line13.yintercept = 10L;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 10.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str21.equals("slope: 10.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "slope: 10.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str24.equals("slope: 10.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
        Line line2 = new Line((double) (short) 0, (double) (byte) 10);
        double double3 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        Line line2 = new Line((double) 100, 52.0d);
        double double3 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        line28.yintercept = (byte) 1;
        line28.slope = 100;
        double double44 = line28.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 0.0d;
        line12.slope = 100.0f;
        line12.yintercept = 100;
        Line line23 = new Line((double) 'a', (double) (byte) -1);
        Line line26 = new Line(10.0d, (double) 0L);
        Line line29 = new Line((double) 'a', (double) (byte) 10);
        line29.yintercept = (-1.0f);
        boolean boolean32 = line26.Intersect(line29);
        java.lang.Class<?> wildcardClass33 = line29.getClass();
        java.lang.Class<?> wildcardClass34 = line29.getClass();
        boolean boolean35 = line23.Intersect(line29);
        boolean boolean36 = line12.Intersect(line29);
        java.lang.Class<?> wildcardClass37 = line29.getClass();
        double double38 = line29.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 97.0d + "'", double38 == 97.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
        Line line2 = new Line((double) 100L, 97.0d);
        line2.slope = 32.0d;
        line2.yintercept = 100.0d;
        double double7 = line2.yintercept;
        java.lang.String str8 = line2.toString();
        java.lang.Class<?> wildcardClass9 = line2.getClass();
        Line line12 = new Line((double) 'a', (double) (byte) 10);
        double double13 = line12.slope;
        line12.yintercept = 10.0f;
        double double16 = line12.slope;
        Line line19 = new Line((double) ' ', (double) 1);
        line19.yintercept = 100.0f;
        boolean boolean22 = line12.Intersect(line19);
        boolean boolean23 = line2.Intersect(line12);
        double double24 = line2.yintercept;
        line2.slope = 'a';
        java.lang.String str27 = line2.toString();
        double double28 = line2.slope;
        line2.slope = 0.0f;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str8.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "slope: 97.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str27.equals("slope: 97.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 97.0d + "'", double28 == 97.0d);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        double double14 = line13.slope;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        line17.slope = 0.0d;
        boolean boolean20 = line13.Intersect(line17);
        double double21 = line13.yintercept;
        boolean boolean22 = line2.Intersect(line13);
        Line line25 = new Line((double) (byte) 0, (double) 'a');
        double double26 = line25.slope;
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        line29.slope = 0.0d;
        boolean boolean32 = line25.Intersect(line29);
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        double double36 = line35.slope;
        boolean boolean37 = line29.Intersect(line35);
        line29.slope = (-1L);
        java.lang.String str40 = line29.toString();
        boolean boolean41 = line2.Intersect(line29);
        java.lang.String str42 = line29.toString();
        double double43 = line29.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: -1.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str40.equals("slope: -1.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "slope: -1.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str42.equals("slope: -1.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = (short) 100;
        line2.slope = 97.0d;
        line2.yintercept = (-1L);
        java.lang.String str9 = line2.toString();
        double double10 = line2.yintercept;
        line2.yintercept = (byte) 100;
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        double double16 = line15.slope;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        line19.slope = 0.0d;
        boolean boolean22 = line15.Intersect(line19);
        Line line25 = new Line((double) (byte) 0, (double) 'a');
        double double26 = line25.slope;
        boolean boolean27 = line19.Intersect(line25);
        line25.yintercept = 0.0d;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        Line line36 = new Line((double) (byte) 0, (double) 'a');
        line36.slope = 0.0d;
        boolean boolean39 = line32.Intersect(line36);
        boolean boolean40 = line25.Intersect(line36);
        java.lang.Class<?> wildcardClass41 = line36.getClass();
        Line line44 = new Line((double) (byte) 0, (double) 'a');
        double double45 = line44.slope;
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        line48.slope = 0.0d;
        boolean boolean51 = line44.Intersect(line48);
        double double52 = line48.yintercept;
        Line line55 = new Line(0.0d, (double) (-1L));
        boolean boolean56 = line48.Intersect(line55);
        java.lang.Class<?> wildcardClass57 = line48.getClass();
        boolean boolean58 = line36.Intersect(line48);
        Line line61 = new Line((double) (byte) 0, (double) 'a');
        double double62 = line61.slope;
        Line line65 = new Line((double) (byte) 0, (double) 'a');
        line65.slope = 0.0d;
        boolean boolean68 = line61.Intersect(line65);
        double double69 = line65.yintercept;
        Line line72 = new Line(0.0d, (double) (-1L));
        boolean boolean73 = line65.Intersect(line72);
        double double74 = line65.slope;
        java.lang.String str75 = line65.toString();
        boolean boolean76 = line36.Intersect(line65);
        line36.slope = ' ';
        boolean boolean79 = line2.Intersect(line36);
        java.lang.String str80 = line2.toString();
        double double81 = line2.slope;
        line2.slope = (-1.0d);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 97.0d + "'", double52 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 97.0d + "'", double69 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str75.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "slope: 97.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str80.equals("slope: 97.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 97.0d + "'", double81 == 97.0d);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        Line line2 = new Line((double) 0.0f, (double) (short) 1);
        double double3 = line2.yintercept;
        double double4 = line2.yintercept;
        Line line7 = new Line((double) 0.0f, (double) (byte) 100);
        java.lang.String str8 = line7.toString();
        boolean boolean9 = line2.Intersect(line7);
        double double10 = line2.slope;
        line2.slope = 32.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 0.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str8.equals("slope: 0.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        double double23 = line22.slope;
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        line26.slope = 0.0d;
        boolean boolean29 = line22.Intersect(line26);
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        boolean boolean34 = line26.Intersect(line32);
        line32.yintercept = 0.0d;
        Line line39 = new Line((double) (byte) 0, (double) 'a');
        double double40 = line39.slope;
        Line line43 = new Line((double) (byte) 0, (double) 'a');
        line43.slope = 0.0d;
        boolean boolean46 = line39.Intersect(line43);
        boolean boolean47 = line32.Intersect(line43);
        boolean boolean48 = line10.Intersect(line43);
        line43.slope = (byte) 100;
        java.lang.String str51 = line43.toString();
        line43.yintercept = ' ';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "slope: 100.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str51.equals("slope: 100.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
        Line line2 = new Line((double) 1L, 0.0d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
        Line line2 = new Line((double) (byte) -1, (double) 10.0f);
        java.lang.String str3 = line2.toString();
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        java.lang.String str5 = line2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: -1.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str3.equals("slope: -1.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: -1.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str5.equals("slope: -1.0, yintercept: 10.0, epsilon:1.0E-6"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
        Line line2 = new Line((double) (byte) 0, (double) (byte) 100);
        Line line5 = new Line((double) 100L, 97.0d);
        line5.slope = 32.0d;
        line5.slope = '4';
        Line line12 = new Line((double) 100L, 97.0d);
        line12.slope = 32.0d;
        line12.yintercept = 100.0d;
        double double17 = line12.yintercept;
        java.lang.String str18 = line12.toString();
        boolean boolean19 = line5.Intersect(line12);
        java.lang.Class<?> wildcardClass20 = line5.getClass();
        boolean boolean21 = line2.Intersect(line5);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str18.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
        Line line2 = new Line((double) 0L, (double) 10);
        line2.yintercept = 0.0f;
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.yintercept = (-1.0f);
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        double double8 = line7.slope;
        Line line11 = new Line((double) (byte) 0, (double) 'a');
        double double12 = line11.slope;
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        line15.slope = 0.0d;
        boolean boolean18 = line11.Intersect(line15);
        Line line21 = new Line((double) (byte) 0, (double) 'a');
        double double22 = line21.slope;
        boolean boolean23 = line15.Intersect(line21);
        boolean boolean24 = line7.Intersect(line15);
        Line line27 = new Line((double) (byte) 10, 97.0d);
        double double28 = line27.yintercept;
        boolean boolean29 = line7.Intersect(line27);
        line7.yintercept = 0.0f;
        boolean boolean32 = line2.Intersect(line7);
        double double33 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 97.0d + "'", double28 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        double double4 = line2.slope;
        java.lang.String str5 = line2.toString();
        java.lang.String str6 = line2.toString();
        double double7 = line2.slope;
        line2.yintercept = 10;
        line2.slope = (byte) 10;
        java.lang.String str12 = line2.toString();
        line2.yintercept = 10.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str5.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str6.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "slope: 10.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str12.equals("slope: 10.0, yintercept: 10.0, epsilon:1.0E-6"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        java.lang.String str5 = line2.toString();
        double double6 = line2.yintercept;
        java.lang.String str7 = line2.toString();
        double double8 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str5.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str7.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        line2.slope = 0.0d;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean8 = line2.Intersect(line7);
        double double9 = line2.yintercept;
        line2.slope = '4';
        double double12 = line2.slope;
        double double13 = line2.slope;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        Line line2 = new Line((double) 1.0f, 0.0d);
        line2.slope = (-1.0f);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
        Line line2 = new Line((double) 10.0f, (double) 1.0f);
        double double3 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        Line line2 = new Line(52.0d, (double) (byte) 0);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        double double10 = line9.slope;
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        line13.slope = 0.0d;
        boolean boolean16 = line9.Intersect(line13);
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        boolean boolean21 = line13.Intersect(line19);
        boolean boolean22 = line5.Intersect(line13);
        line13.slope = 0L;
        line13.yintercept = (-1L);
        double double27 = line13.yintercept;
        line13.slope = (short) 100;
        boolean boolean30 = line2.Intersect(line13);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        Line line17 = new Line((double) 100L, (double) 100);
        java.lang.String str18 = line17.toString();
        boolean boolean19 = line6.Intersect(line17);
        line17.yintercept = (byte) 0;
        java.lang.Class<?> wildcardClass22 = line17.getClass();
        double double23 = line17.yintercept;
        double double24 = line17.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str18.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 0.0d;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        boolean boolean27 = line12.Intersect(line23);
        java.lang.Class<?> wildcardClass28 = line23.getClass();
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        double double39 = line35.yintercept;
        Line line42 = new Line(0.0d, (double) (-1L));
        boolean boolean43 = line35.Intersect(line42);
        java.lang.Class<?> wildcardClass44 = line35.getClass();
        boolean boolean45 = line23.Intersect(line35);
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        double double49 = line48.slope;
        Line line52 = new Line((double) (byte) 0, (double) 'a');
        line52.slope = 0.0d;
        boolean boolean55 = line48.Intersect(line52);
        double double56 = line52.yintercept;
        Line line59 = new Line(0.0d, (double) (-1L));
        boolean boolean60 = line52.Intersect(line59);
        double double61 = line52.slope;
        java.lang.String str62 = line52.toString();
        boolean boolean63 = line23.Intersect(line52);
        java.lang.String str64 = line52.toString();
        java.lang.String str65 = line52.toString();
        line52.slope = '4';
        java.lang.Class<?> wildcardClass68 = line52.getClass();
        line52.slope = (byte) 10;
        line52.yintercept = (-1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 97.0d + "'", double56 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str62.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str64.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str65.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        line6.yintercept = (-1);
        java.lang.String str13 = line6.toString();
        double double14 = line6.yintercept;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        double double18 = line17.slope;
        Line line21 = new Line((double) (byte) 0, (double) 'a');
        double double22 = line21.slope;
        Line line25 = new Line((double) (byte) 0, (double) 'a');
        line25.slope = 0.0d;
        boolean boolean28 = line21.Intersect(line25);
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        boolean boolean33 = line25.Intersect(line31);
        boolean boolean34 = line17.Intersect(line25);
        Line line37 = new Line((double) 10L, (double) ' ');
        line37.slope = 1L;
        double double40 = line37.slope;
        Line line43 = new Line((double) (byte) 0, (double) 'a');
        double double44 = line43.slope;
        Line line47 = new Line((double) (byte) 0, (double) 'a');
        line47.slope = 0.0d;
        boolean boolean50 = line43.Intersect(line47);
        double double51 = line43.yintercept;
        double double52 = line43.slope;
        boolean boolean53 = line37.Intersect(line43);
        boolean boolean54 = line17.Intersect(line43);
        Line line57 = new Line((double) ' ', (double) 1);
        boolean boolean58 = line17.Intersect(line57);
        java.lang.String str59 = line17.toString();
        line17.slope = 52.0d;
        Line line64 = new Line((double) (byte) 0, (double) 'a');
        line64.slope = 0.0d;
        Line line69 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean70 = line64.Intersect(line69);
        line69.yintercept = '4';
        boolean boolean73 = line17.Intersect(line69);
        boolean boolean74 = line6.Intersect(line69);
        java.lang.String str75 = line69.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str13.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 97.0d + "'", double51 == 97.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str59.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "slope: 0.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str75.equals("slope: 0.0, yintercept: 52.0, epsilon:1.0E-6"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        Line line2 = new Line((double) 0.0f, (double) (byte) 100);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        double double10 = line9.slope;
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        line13.slope = 0.0d;
        boolean boolean16 = line9.Intersect(line13);
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        boolean boolean21 = line13.Intersect(line19);
        boolean boolean22 = line5.Intersect(line13);
        Line line25 = new Line((double) 10L, (double) ' ');
        line25.slope = 1L;
        double double28 = line25.slope;
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        double double39 = line31.yintercept;
        double double40 = line31.slope;
        boolean boolean41 = line25.Intersect(line31);
        line31.slope = (byte) 10;
        java.lang.String str44 = line31.toString();
        Line line47 = new Line((double) (byte) 0, (double) 'a');
        double double48 = line47.slope;
        Line line51 = new Line((double) (byte) 0, (double) 'a');
        line51.slope = 0.0d;
        boolean boolean54 = line47.Intersect(line51);
        double double55 = line51.yintercept;
        Line line58 = new Line(0.0d, (double) (-1L));
        boolean boolean59 = line51.Intersect(line58);
        Line line62 = new Line((double) 100L, (double) 100);
        java.lang.String str63 = line62.toString();
        boolean boolean64 = line51.Intersect(line62);
        line51.slope = (byte) 1;
        boolean boolean67 = line31.Intersect(line51);
        boolean boolean68 = line13.Intersect(line31);
        double double69 = line31.slope;
        boolean boolean70 = line2.Intersect(line31);
        double double71 = line31.yintercept;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str44.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 97.0d + "'", double55 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str63.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 97.0d + "'", double71 == 97.0d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 0.0d;
        line12.slope = 100.0f;
        double double19 = line12.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
        Line line2 = new Line((double) (-1.0f), (double) (short) 0);
        java.lang.String str3 = line2.toString();
        double double4 = line2.slope;
        Line line7 = new Line((double) 10L, (double) ' ');
        line7.slope = 1L;
        double double10 = line7.slope;
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        double double14 = line13.slope;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        line17.slope = 0.0d;
        boolean boolean20 = line13.Intersect(line17);
        double double21 = line13.yintercept;
        double double22 = line13.slope;
        boolean boolean23 = line7.Intersect(line13);
        java.lang.String str24 = line13.toString();
        double double25 = line13.yintercept;
        java.lang.String str26 = line13.toString();
        boolean boolean27 = line2.Intersect(line13);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: -1.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str3.equals("slope: -1.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str24.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str26.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
        Line line2 = new Line((double) 0.0f, (double) (short) 1);
        double double3 = line2.yintercept;
        double double4 = line2.yintercept;
        line2.slope = (short) 0;
        double double7 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = (short) 100;
        line2.slope = 97.0d;
        java.lang.String str7 = line2.toString();
        java.lang.String str8 = line2.toString();
        Line line11 = new Line((double) 10L, (double) ' ');
        line11.slope = 1L;
        double double14 = line11.yintercept;
        boolean boolean15 = line2.Intersect(line11);
        Line line18 = new Line((double) (byte) 0, (double) 'a');
        double double19 = line18.slope;
        java.lang.Class<?> wildcardClass20 = line18.getClass();
        java.lang.String str21 = line18.toString();
        boolean boolean22 = line2.Intersect(line18);
        Line line25 = new Line((double) 10L, (double) ' ');
        line25.slope = 1L;
        double double28 = line25.slope;
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        double double39 = line31.yintercept;
        double double40 = line31.slope;
        boolean boolean41 = line25.Intersect(line31);
        java.lang.String str42 = line25.toString();
        java.lang.String str43 = line25.toString();
        boolean boolean44 = line2.Intersect(line25);
        Line line47 = new Line((double) (byte) 0, (double) 'a');
        double double48 = line47.slope;
        Line line51 = new Line((double) (byte) 0, (double) 'a');
        double double52 = line51.slope;
        Line line55 = new Line((double) (byte) 0, (double) 'a');
        line55.slope = 0.0d;
        boolean boolean58 = line51.Intersect(line55);
        Line line61 = new Line((double) (byte) 0, (double) 'a');
        double double62 = line61.slope;
        boolean boolean63 = line55.Intersect(line61);
        boolean boolean64 = line47.Intersect(line55);
        Line line67 = new Line((double) 10L, (double) ' ');
        line67.slope = 1L;
        double double70 = line67.slope;
        Line line73 = new Line((double) (byte) 0, (double) 'a');
        double double74 = line73.slope;
        Line line77 = new Line((double) (byte) 0, (double) 'a');
        line77.slope = 0.0d;
        boolean boolean80 = line73.Intersect(line77);
        double double81 = line73.yintercept;
        double double82 = line73.slope;
        boolean boolean83 = line67.Intersect(line73);
        boolean boolean84 = line47.Intersect(line73);
        double double85 = line73.yintercept;
        boolean boolean86 = line25.Intersect(line73);
        line73.yintercept = (-1L);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str7.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str8.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "slope: 1.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str42.equals("slope: 1.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "slope: 1.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str43.equals("slope: 1.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 97.0d + "'", double81 == 97.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 97.0d + "'", double85 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        double double4 = line2.slope;
        java.lang.String str5 = line2.toString();
        java.lang.String str6 = line2.toString();
        double double7 = line2.slope;
        line2.yintercept = 10;
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        double double11 = line2.slope;
        line2.slope = 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str5.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str6.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        double double16 = line6.slope;
        double double17 = line6.slope;
        line6.slope = (byte) -1;
        line6.yintercept = 1L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
        Line line2 = new Line((double) 0.0f, (double) (byte) 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.String str15 = line6.toString();
        line6.slope = (byte) 100;
        java.lang.Class<?> wildcardClass18 = line6.getClass();
        java.lang.Class<?> wildcardClass19 = line6.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str15.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        Line line2 = new Line((double) (byte) 10, (double) 0L);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
        Line line2 = new Line((double) 1L, (double) ' ');
        double double3 = line2.yintercept;
        double double4 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        line28.yintercept = (byte) 1;
        line28.slope = 100;
        line28.yintercept = (short) 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        double double3 = line2.slope;
        line2.yintercept = 10.0f;
        double double6 = line2.yintercept;
        java.lang.Class<?> wildcardClass7 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        java.lang.String str11 = line6.toString();
        Line line14 = new Line(10.0d, (double) 10);
        boolean boolean15 = line6.Intersect(line14);
        Line line18 = new Line((double) (byte) 0, (double) 'a');
        double double19 = line18.slope;
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        line22.slope = 0.0d;
        boolean boolean25 = line18.Intersect(line22);
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        boolean boolean30 = line22.Intersect(line28);
        line28.yintercept = 0.0d;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        double double36 = line35.slope;
        Line line39 = new Line((double) (byte) 0, (double) 'a');
        line39.slope = 0.0d;
        boolean boolean42 = line35.Intersect(line39);
        boolean boolean43 = line28.Intersect(line39);
        java.lang.Class<?> wildcardClass44 = line39.getClass();
        double double45 = line39.slope;
        boolean boolean46 = line6.Intersect(line39);
        java.lang.String str47 = line6.toString();
        double double48 = line6.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str11.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str47.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 97.0d + "'", double48 == 97.0d);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
        Line line2 = new Line((double) (short) -1, 0.0d);
        double double3 = line2.slope;
        line2.yintercept = '#';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        Line line42 = new Line((double) ' ', (double) 1);
        boolean boolean43 = line2.Intersect(line42);
        java.lang.Class<?> wildcardClass44 = line42.getClass();
        line42.yintercept = (byte) 10;
        double double47 = line42.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 32.0d + "'", double47 == 32.0d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        Line line2 = new Line((double) 100.0f, (double) (short) 100);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        Line line2 = new Line((double) 10L, (double) ' ');
        Line line5 = new Line((double) 10L, (double) ' ');
        line5.slope = 1L;
        double double8 = line5.slope;
        double double9 = line5.slope;
        double double10 = line5.yintercept;
        boolean boolean11 = line2.Intersect(line5);
        Line line14 = new Line((double) (byte) 0, (double) 'a');
        double double15 = line14.slope;
        Line line18 = new Line((double) (byte) 0, (double) 'a');
        line18.slope = 0.0d;
        boolean boolean21 = line14.Intersect(line18);
        java.lang.Class<?> wildcardClass22 = line14.getClass();
        Line line25 = new Line((double) (byte) 0, (double) 'a');
        double double26 = line25.slope;
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        line29.slope = 0.0d;
        boolean boolean32 = line25.Intersect(line29);
        double double33 = line29.yintercept;
        boolean boolean34 = line14.Intersect(line29);
        Line line37 = new Line((double) ' ', (double) '4');
        java.lang.Class<?> wildcardClass38 = line37.getClass();
        double double39 = line37.yintercept;
        Line line42 = new Line((double) (byte) 0, (double) 'a');
        double double43 = line42.slope;
        double double44 = line42.slope;
        java.lang.String str45 = line42.toString();
        java.lang.String str46 = line42.toString();
        double double47 = line42.slope;
        line42.yintercept = 10;
        boolean boolean50 = line37.Intersect(line42);
        boolean boolean51 = line29.Intersect(line42);
        boolean boolean52 = line2.Intersect(line42);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 97.0d + "'", double33 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 52.0d + "'", double39 == 52.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str45.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str46.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
        Line line2 = new Line((double) 'a', 0.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        double double23 = line22.slope;
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        line26.slope = 0.0d;
        boolean boolean29 = line22.Intersect(line26);
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        boolean boolean34 = line26.Intersect(line32);
        line32.yintercept = 0.0d;
        Line line39 = new Line((double) (byte) 0, (double) 'a');
        double double40 = line39.slope;
        Line line43 = new Line((double) (byte) 0, (double) 'a');
        line43.slope = 0.0d;
        boolean boolean46 = line39.Intersect(line43);
        boolean boolean47 = line32.Intersect(line43);
        java.lang.Class<?> wildcardClass48 = line43.getClass();
        Line line51 = new Line((double) (byte) 0, (double) 'a');
        double double52 = line51.slope;
        Line line55 = new Line((double) (byte) 0, (double) 'a');
        line55.slope = 0.0d;
        boolean boolean58 = line51.Intersect(line55);
        double double59 = line55.yintercept;
        Line line62 = new Line(0.0d, (double) (-1L));
        boolean boolean63 = line55.Intersect(line62);
        java.lang.Class<?> wildcardClass64 = line55.getClass();
        boolean boolean65 = line43.Intersect(line55);
        boolean boolean66 = line10.Intersect(line55);
        Line line69 = new Line((double) (byte) 0, (double) 'a');
        double double70 = line69.slope;
        Line line73 = new Line((double) (byte) 0, (double) 'a');
        line73.slope = 0.0d;
        boolean boolean76 = line69.Intersect(line73);
        boolean boolean77 = line55.Intersect(line69);
        double double78 = line69.yintercept;
        line69.yintercept = (-1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 97.0d + "'", double59 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 97.0d + "'", double78 == 97.0d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
        Line line2 = new Line((double) '#', (double) 0L);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        double double14 = line2.slope;
        double double15 = line2.slope;
        line2.yintercept = (-1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 10;
        line12.yintercept = (byte) 0;
        Line line21 = new Line((double) 100L, 97.0d);
        line21.slope = 32.0d;
        line21.slope = '4';
        boolean boolean26 = line12.Intersect(line21);
        line12.slope = '#';
        Line line31 = new Line((double) 10L, (double) ' ');
        line31.slope = 1L;
        double double34 = line31.slope;
        double double35 = line31.slope;
        Line line38 = new Line((double) ' ', (double) '4');
        boolean boolean39 = line31.Intersect(line38);
        java.lang.String str40 = line38.toString();
        java.lang.String str41 = line38.toString();
        line38.slope = 97.0d;
        boolean boolean44 = line12.Intersect(line38);
        line38.slope = (byte) 100;
        java.lang.Class<?> wildcardClass47 = line38.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: 32.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str40.equals("slope: 32.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "slope: 32.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str41.equals("slope: 32.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
        Line line2 = new Line((double) 'a', (double) (-1));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        Line line2 = new Line((double) 10L, (double) ' ');
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        double double4 = line2.slope;
        Line line7 = new Line((double) 'a', (double) (byte) 10);
        line7.slope = (short) 100;
        line7.slope = 97.0d;
        boolean boolean12 = line2.Intersect(line7);
        double double13 = line2.yintercept;
        line2.slope = 0.0f;
        double double16 = line2.yintercept;
        java.lang.Class<?> wildcardClass17 = line2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
        Line line2 = new Line((double) (short) 10, (double) 'a');
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = (short) 100;
        line2.slope = 97.0d;
        line2.yintercept = (-1L);
        java.lang.String str9 = line2.toString();
        double double10 = line2.yintercept;
        line2.slope = 0;
        java.lang.String str13 = line2.toString();
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        java.lang.Class<?> wildcardClass18 = line16.getClass();
        double double19 = line16.yintercept;
        boolean boolean20 = line2.Intersect(line16);
        line16.yintercept = 0.0d;
        java.lang.String str23 = line16.toString();
        line16.slope = 97.0d;
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str13.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "slope: 0.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str23.equals("slope: 0.0, yintercept: 0.0, epsilon:1.0E-6"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test129");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) (byte) 10, 97.0d);
        double double23 = line22.yintercept;
        boolean boolean24 = line2.Intersect(line22);
        Line line27 = new Line((double) (byte) 0, (double) 'a');
        double double28 = line27.slope;
        boolean boolean29 = line22.Intersect(line27);
        java.lang.String str30 = line22.toString();
        java.lang.String str31 = line22.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 97.0d + "'", double23 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str30.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str31.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
        Line line2 = new Line((double) ' ', (double) '4');
        line2.yintercept = '4';
        line2.slope = 52.0d;
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test131");
        Line line2 = new Line(35.0d, (double) 1);
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        line28.yintercept = 'a';
        line28.slope = '#';
        double double44 = line28.yintercept;
        line28.yintercept = ' ';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 97.0d + "'", double44 == 97.0d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test133");
        Line line2 = new Line((double) 'a', (double) 'a');
        line2.yintercept = (byte) 0;
        java.lang.String str5 = line2.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 97.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str5.equals("slope: 97.0, yintercept: 0.0, epsilon:1.0E-6"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        double double5 = line2.yintercept;
        java.lang.String str6 = line2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str6.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
        Line line2 = new Line(10.0d, (double) 10);
        line2.yintercept = 0.0d;
        java.lang.String str5 = line2.toString();
        java.lang.Class<?> wildcardClass6 = line2.getClass();
        Line line9 = new Line((double) 100L, 97.0d);
        line9.slope = 32.0d;
        line9.yintercept = 100.0d;
        double double14 = line9.yintercept;
        java.lang.String str15 = line9.toString();
        boolean boolean16 = line2.Intersect(line9);
        double double17 = line9.slope;
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 10.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str5.equals("slope: 10.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str15.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        line28.slope = (byte) 10;
        java.lang.String str41 = line28.toString();
        Line line44 = new Line((double) (byte) 0, (double) 'a');
        double double45 = line44.slope;
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        line48.slope = 0.0d;
        boolean boolean51 = line44.Intersect(line48);
        double double52 = line48.yintercept;
        Line line55 = new Line(0.0d, (double) (-1L));
        boolean boolean56 = line48.Intersect(line55);
        Line line59 = new Line((double) 100L, (double) 100);
        java.lang.String str60 = line59.toString();
        boolean boolean61 = line48.Intersect(line59);
        line48.slope = (byte) 1;
        boolean boolean64 = line28.Intersect(line48);
        boolean boolean65 = line10.Intersect(line28);
        double double66 = line28.slope;
        java.lang.String str67 = line28.toString();
        line28.yintercept = '#';
        line28.slope = 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str41.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 97.0d + "'", double52 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str60.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str67.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        double double3 = line2.yintercept;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        Line line11 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean12 = line6.Intersect(line11);
        line6.yintercept = (byte) 1;
        boolean boolean15 = line2.Intersect(line6);
        double double16 = line2.yintercept;
        java.lang.String str17 = line2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str17.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
        Line line2 = new Line((double) 0L, (double) (-1.0f));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        double double4 = line2.slope;
        double double5 = line2.slope;
        java.lang.String str6 = line2.toString();
        line2.yintercept = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str6.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        double double16 = line8.yintercept;
        double double17 = line8.slope;
        boolean boolean18 = line2.Intersect(line8);
        line8.slope = (byte) 10;
        java.lang.String str21 = line8.toString();
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        double double25 = line24.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        line28.slope = 0.0d;
        boolean boolean31 = line24.Intersect(line28);
        double double32 = line28.yintercept;
        Line line35 = new Line(0.0d, (double) (-1L));
        boolean boolean36 = line28.Intersect(line35);
        Line line39 = new Line((double) 100L, (double) 100);
        java.lang.String str40 = line39.toString();
        boolean boolean41 = line28.Intersect(line39);
        line28.slope = (byte) 1;
        boolean boolean44 = line8.Intersect(line28);
        line8.yintercept = 52.0d;
        java.lang.Class<?> wildcardClass47 = line8.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str40.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        double double14 = line13.slope;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        line17.slope = 0.0d;
        boolean boolean20 = line13.Intersect(line17);
        double double21 = line13.yintercept;
        boolean boolean22 = line2.Intersect(line13);
        double double23 = line2.slope;
        java.lang.String str24 = line2.toString();
        double double25 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str24.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
        Line line2 = new Line((double) ' ', (double) 1);
        java.lang.String str3 = line2.toString();
        double double4 = line2.slope;
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        double double6 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 32.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str3.equals("slope: 32.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
        Line line2 = new Line((double) 0, 35.0d);
        java.lang.String str3 = line2.toString();
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 0.0, yintercept: 35.0, epsilon:1.0E-6" + "'", str3.equals("slope: 0.0, yintercept: 35.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
        Line line2 = new Line((double) (byte) 0, (double) (-1.0f));
        line2.yintercept = '4';
        double double5 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        java.lang.String str16 = line6.toString();
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        boolean boolean31 = line23.Intersect(line29);
        java.lang.Class<?> wildcardClass32 = line23.getClass();
        java.lang.String str33 = line23.toString();
        boolean boolean34 = line6.Intersect(line23);
        line23.slope = 97.0d;
        double double37 = line23.yintercept;
        double double38 = line23.slope;
        java.lang.Class<?> wildcardClass39 = line23.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 97.0d + "'", double37 == 97.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 97.0d + "'", double38 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        double double16 = line8.yintercept;
        double double17 = line8.slope;
        boolean boolean18 = line2.Intersect(line8);
        java.lang.String str19 = line8.toString();
        line8.slope = (short) 100;
        double double22 = line8.yintercept;
        double double23 = line8.yintercept;
        java.lang.Class<?> wildcardClass24 = line8.getClass();
        java.lang.Class<?> wildcardClass25 = line8.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str19.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 97.0d + "'", double23 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = 100.0f;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        double double8 = line7.slope;
        Line line11 = new Line((double) (byte) 0, (double) 'a');
        line11.slope = 0.0d;
        boolean boolean14 = line7.Intersect(line11);
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        double double18 = line17.slope;
        boolean boolean19 = line11.Intersect(line17);
        java.lang.Class<?> wildcardClass20 = line11.getClass();
        boolean boolean21 = line2.Intersect(line11);
        java.lang.Class<?> wildcardClass22 = line11.getClass();
        line11.yintercept = 0.0f;
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        double double40 = line28.yintercept;
        line28.yintercept = 0L;
        double double43 = line28.slope;
        double double44 = line28.yintercept;
        line28.slope = 0.0d;
        java.lang.Class<?> wildcardClass47 = line28.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 97.0d + "'", double40 == 97.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        double double3 = line2.yintercept;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        Line line11 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean12 = line6.Intersect(line11);
        line6.yintercept = (byte) 1;
        boolean boolean15 = line2.Intersect(line6);
        line2.yintercept = (short) -1;
        java.lang.Class<?> wildcardClass18 = line2.getClass();
        line2.slope = 0.0d;
        java.lang.String str21 = line2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str21.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.slope = 97.0d;
        double double17 = line12.slope;
        line12.slope = (-1);
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        double double23 = line22.slope;
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        double double27 = line26.slope;
        Line line30 = new Line((double) (byte) 0, (double) 'a');
        line30.slope = 0.0d;
        boolean boolean33 = line26.Intersect(line30);
        Line line36 = new Line((double) (byte) 0, (double) 'a');
        double double37 = line36.slope;
        boolean boolean38 = line30.Intersect(line36);
        java.lang.String str39 = line30.toString();
        double double40 = line30.slope;
        boolean boolean41 = line22.Intersect(line30);
        double double42 = line30.yintercept;
        double double43 = line30.slope;
        line30.slope = (-1.0f);
        boolean boolean46 = line12.Intersect(line30);
        Line line47 = null;
        try {
            boolean boolean48 = line12.Intersect(line47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str39.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 97.0d + "'", double42 == 97.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        double double14 = line12.yintercept;
        line12.yintercept = 100;
        java.lang.String str17 = line12.toString();
        Line line20 = new Line((double) (byte) 0, (double) 'a');
        double double21 = line20.slope;
        java.lang.Class<?> wildcardClass22 = line20.getClass();
        Line line25 = new Line((double) (byte) 0, (double) 'a');
        double double26 = line25.slope;
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        line29.slope = 0.0d;
        boolean boolean32 = line25.Intersect(line29);
        double double33 = line29.yintercept;
        Line line36 = new Line(0.0d, (double) (-1L));
        boolean boolean37 = line29.Intersect(line36);
        double double38 = line36.slope;
        boolean boolean39 = line20.Intersect(line36);
        boolean boolean40 = line12.Intersect(line20);
        double double41 = line20.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str17.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 97.0d + "'", double33 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 97.0d + "'", double41 == 97.0d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line2.yintercept;
        double double11 = line2.slope;
        double double12 = line2.yintercept;
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        double double16 = line15.slope;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        boolean boolean31 = line23.Intersect(line29);
        boolean boolean32 = line15.Intersect(line23);
        Line line35 = new Line((double) 10L, (double) ' ');
        line35.slope = 1L;
        double double38 = line35.slope;
        Line line41 = new Line((double) (byte) 0, (double) 'a');
        double double42 = line41.slope;
        Line line45 = new Line((double) (byte) 0, (double) 'a');
        line45.slope = 0.0d;
        boolean boolean48 = line41.Intersect(line45);
        double double49 = line41.yintercept;
        double double50 = line41.slope;
        boolean boolean51 = line35.Intersect(line41);
        boolean boolean52 = line15.Intersect(line41);
        Line line55 = new Line((double) ' ', (double) 1);
        boolean boolean56 = line15.Intersect(line55);
        double double57 = line15.yintercept;
        boolean boolean58 = line2.Intersect(line15);
        java.lang.String str59 = line15.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 97.0d + "'", double49 == 97.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 97.0d + "'", double57 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str59.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
        Line line2 = new Line(52.0d, (double) 0.0f);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
        Line line2 = new Line((double) 10.0f, (double) 100L);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test155");
        Line line2 = new Line((double) (byte) 100, 100.0d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
        Line line2 = new Line(0.0d, (double) 10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        double double23 = line22.slope;
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        line26.slope = 0.0d;
        boolean boolean29 = line22.Intersect(line26);
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        boolean boolean34 = line26.Intersect(line32);
        line32.yintercept = 0.0d;
        Line line39 = new Line((double) (byte) 0, (double) 'a');
        double double40 = line39.slope;
        Line line43 = new Line((double) (byte) 0, (double) 'a');
        line43.slope = 0.0d;
        boolean boolean46 = line39.Intersect(line43);
        boolean boolean47 = line32.Intersect(line43);
        boolean boolean48 = line10.Intersect(line43);
        line43.slope = (byte) 100;
        java.lang.String str51 = line43.toString();
        line43.slope = 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "slope: 100.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str51.equals("slope: 100.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 0.0d;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        boolean boolean27 = line12.Intersect(line23);
        line12.slope = 1.0d;
        java.lang.String str30 = line12.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "slope: 1.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str30.equals("slope: 1.0, yintercept: 0.0, epsilon:1.0E-6"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        Line line2 = new Line((double) 0.0f, (double) '#');
        line2.yintercept = ' ';
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 0.0d;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        boolean boolean27 = line12.Intersect(line23);
        java.lang.Class<?> wildcardClass28 = line23.getClass();
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        double double39 = line35.yintercept;
        Line line42 = new Line(0.0d, (double) (-1L));
        boolean boolean43 = line35.Intersect(line42);
        java.lang.Class<?> wildcardClass44 = line35.getClass();
        boolean boolean45 = line23.Intersect(line35);
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        double double49 = line48.slope;
        Line line52 = new Line((double) (byte) 0, (double) 'a');
        line52.slope = 0.0d;
        boolean boolean55 = line48.Intersect(line52);
        double double56 = line52.yintercept;
        Line line59 = new Line(0.0d, (double) (-1L));
        boolean boolean60 = line52.Intersect(line59);
        double double61 = line52.slope;
        java.lang.String str62 = line52.toString();
        boolean boolean63 = line23.Intersect(line52);
        java.lang.String str64 = line52.toString();
        line52.slope = (short) 10;
        Line line69 = new Line((double) 'a', (double) (byte) 10);
        double double70 = line69.yintercept;
        java.lang.String str71 = line69.toString();
        line69.slope = '#';
        boolean boolean74 = line52.Intersect(line69);
        Line line77 = new Line((double) 0.0f, 0.0d);
        boolean boolean78 = line52.Intersect(line77);
        line52.yintercept = (byte) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 97.0d + "'", double56 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str62.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str64.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str71.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
        Line line2 = new Line((double) 100L, 97.0d);
        line2.slope = 32.0d;
        line2.slope = '4';
        Line line9 = new Line((double) 100L, 97.0d);
        line9.slope = 32.0d;
        line9.yintercept = 100.0d;
        double double14 = line9.yintercept;
        java.lang.String str15 = line9.toString();
        boolean boolean16 = line2.Intersect(line9);
        java.lang.Class<?> wildcardClass17 = line9.getClass();
        Line line20 = new Line((double) 0L, (double) 100L);
        double double21 = line20.yintercept;
        boolean boolean22 = line9.Intersect(line20);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str15.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
        Line line2 = new Line((-1.0d), (double) (short) 1);
        double double3 = line2.slope;
        double double4 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        double double15 = line6.slope;
        line6.yintercept = 1L;
        line6.slope = 1;
        double double20 = line6.slope;
        java.lang.String str21 = line6.toString();
        line6.slope = 1.0f;
        line6.yintercept = 1.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 1.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str21.equals("slope: 1.0, yintercept: 1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        double double3 = line2.slope;
        line2.yintercept = 10.0f;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        line16.slope = 0.0d;
        boolean boolean19 = line12.Intersect(line16);
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        double double23 = line22.slope;
        boolean boolean24 = line16.Intersect(line22);
        boolean boolean25 = line8.Intersect(line16);
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        Line line38 = new Line((double) (byte) 0, (double) 'a');
        double double39 = line38.slope;
        boolean boolean40 = line32.Intersect(line38);
        line38.yintercept = 0.0d;
        Line line45 = new Line((double) (byte) 0, (double) 'a');
        double double46 = line45.slope;
        Line line49 = new Line((double) (byte) 0, (double) 'a');
        line49.slope = 0.0d;
        boolean boolean52 = line45.Intersect(line49);
        boolean boolean53 = line38.Intersect(line49);
        java.lang.Class<?> wildcardClass54 = line49.getClass();
        Line line57 = new Line((double) (byte) 0, (double) 'a');
        double double58 = line57.slope;
        Line line61 = new Line((double) (byte) 0, (double) 'a');
        line61.slope = 0.0d;
        boolean boolean64 = line57.Intersect(line61);
        double double65 = line61.yintercept;
        Line line68 = new Line(0.0d, (double) (-1L));
        boolean boolean69 = line61.Intersect(line68);
        java.lang.Class<?> wildcardClass70 = line61.getClass();
        boolean boolean71 = line49.Intersect(line61);
        boolean boolean72 = line16.Intersect(line61);
        Line line75 = new Line((double) (byte) 0, (double) 'a');
        double double76 = line75.slope;
        Line line79 = new Line((double) (byte) 0, (double) 'a');
        line79.slope = 0.0d;
        boolean boolean82 = line75.Intersect(line79);
        boolean boolean83 = line61.Intersect(line75);
        boolean boolean84 = line2.Intersect(line61);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 97.0d + "'", double65 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        Line line17 = new Line((double) 100L, (double) 100);
        java.lang.String str18 = line17.toString();
        boolean boolean19 = line6.Intersect(line17);
        line17.yintercept = (byte) 0;
        java.lang.Class<?> wildcardClass22 = line17.getClass();
        double double23 = line17.yintercept;
        java.lang.Class<?> wildcardClass24 = line17.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str18.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
        Line line2 = new Line((double) (byte) -1, (double) 10.0f);
        java.lang.String str3 = line2.toString();
        line2.yintercept = 0.0f;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: -1.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str3.equals("slope: -1.0, yintercept: 10.0, epsilon:1.0E-6"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        double double6 = line2.slope;
        Line line9 = new Line((double) ' ', (double) '4');
        boolean boolean10 = line2.Intersect(line9);
        line9.slope = 97.0d;
        java.lang.String str13 = line9.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "slope: 97.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str13.equals("slope: 97.0, yintercept: 52.0, epsilon:1.0E-6"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
        Line line2 = new Line((double) 10L, (double) ' ');
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        double double4 = line2.slope;
        Line line7 = new Line((double) 'a', (double) (byte) 10);
        line7.slope = (short) 100;
        line7.slope = 97.0d;
        boolean boolean12 = line2.Intersect(line7);
        Line line15 = new Line((double) (byte) 1, 1.0d);
        line15.slope = 10.0f;
        boolean boolean18 = line7.Intersect(line15);
        java.lang.String str19 = line7.toString();
        Line line22 = new Line(10.0d, (double) 0L);
        Line line25 = new Line((double) 'a', (double) (byte) 10);
        line25.yintercept = (-1.0f);
        boolean boolean28 = line22.Intersect(line25);
        java.lang.Class<?> wildcardClass29 = line25.getClass();
        boolean boolean30 = line7.Intersect(line25);
        line25.slope = (byte) 1;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str19.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
        Line line2 = new Line((double) 100, 1.0d);
        line2.yintercept = 97.0d;
        double double5 = line2.slope;
        line2.slope = (byte) 1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        Line line2 = new Line((double) 10, (double) 100L);
        java.lang.String str3 = line2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 10.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str3.equals("slope: 10.0, yintercept: 100.0, epsilon:1.0E-6"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        java.lang.String str16 = line6.toString();
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        boolean boolean31 = line23.Intersect(line29);
        java.lang.Class<?> wildcardClass32 = line23.getClass();
        java.lang.String str33 = line23.toString();
        boolean boolean34 = line6.Intersect(line23);
        java.lang.Class<?> wildcardClass35 = line6.getClass();
        double double36 = line6.slope;
        line6.yintercept = (short) 0;
        line6.yintercept = (-1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
        Line line2 = new Line((double) 100L, (double) (byte) -1);
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        line2.yintercept = 'a';
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
        Line line2 = new Line((double) 'a', 1.0d);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        line9.slope = 0.0d;
        boolean boolean12 = line5.Intersect(line9);
        double double13 = line9.yintercept;
        Line line16 = new Line(0.0d, (double) (-1L));
        boolean boolean17 = line9.Intersect(line16);
        java.lang.Class<?> wildcardClass18 = line16.getClass();
        double double19 = line16.yintercept;
        double double20 = line16.slope;
        Line line23 = new Line((double) 0, 35.0d);
        java.lang.String str24 = line23.toString();
        boolean boolean25 = line16.Intersect(line23);
        boolean boolean26 = line2.Intersect(line23);
        line23.yintercept = 0.0d;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "slope: 0.0, yintercept: 35.0, epsilon:1.0E-6" + "'", str24.equals("slope: 0.0, yintercept: 35.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        double double5 = line2.yintercept;
        line2.yintercept = '4';
        double double8 = line2.yintercept;
        java.lang.Class<?> wildcardClass9 = line2.getClass();
        double double10 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        java.lang.String str16 = line6.toString();
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        boolean boolean31 = line23.Intersect(line29);
        java.lang.Class<?> wildcardClass32 = line23.getClass();
        java.lang.String str33 = line23.toString();
        boolean boolean34 = line6.Intersect(line23);
        java.lang.String str35 = line23.toString();
        java.lang.String str36 = line23.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str35.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str36.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
        Line line2 = new Line((double) 100, 0.0d);
        double double3 = line2.slope;
        line2.yintercept = 0.0d;
        Line line8 = new Line((double) 100.0f, 100.0d);
        Line line11 = new Line((double) (short) -1, 32.0d);
        boolean boolean12 = line8.Intersect(line11);
        double double13 = line11.slope;
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        java.lang.Class<?> wildcardClass18 = line16.getClass();
        double double19 = line16.yintercept;
        boolean boolean20 = line11.Intersect(line16);
        line16.slope = 10.0d;
        boolean boolean23 = line2.Intersect(line16);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test177");
        Line line2 = new Line((double) 0, (double) 10.0f);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
        Line line2 = new Line((double) (short) 10, (double) (byte) 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
        Line line2 = new Line((double) 10, (double) '4');
        java.lang.String str3 = line2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 10.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str3.equals("slope: 10.0, yintercept: 52.0, epsilon:1.0E-6"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        Line line42 = new Line((double) ' ', (double) 1);
        boolean boolean43 = line2.Intersect(line42);
        java.lang.Class<?> wildcardClass44 = line42.getClass();
        java.lang.String str45 = line42.toString();
        java.lang.Class<?> wildcardClass46 = line42.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "slope: 32.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str45.equals("slope: 32.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
        Line line2 = new Line((double) ' ', (-1.0d));
        double double3 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        java.lang.Class<?> wildcardClass15 = line13.getClass();
        Line line18 = new Line(97.0d, (double) (short) -1);
        boolean boolean19 = line13.Intersect(line18);
        line13.yintercept = 1L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
        Line line2 = new Line((double) 0, 10.0d);
        Line line5 = new Line((double) 0L, (double) 100.0f);
        Line line8 = new Line((double) (short) -1, (double) (short) -1);
        line8.yintercept = (-1.0f);
        boolean boolean11 = line5.Intersect(line8);
        java.lang.String str12 = line8.toString();
        boolean boolean13 = line2.Intersect(line8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "slope: -1.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str12.equals("slope: -1.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
        Line line2 = new Line(35.0d, (double) 0L);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
        Line line2 = new Line((double) 10L, (double) ' ');
        Line line5 = new Line((double) 10L, (double) ' ');
        line5.slope = 1L;
        double double8 = line5.slope;
        double double9 = line5.slope;
        double double10 = line5.yintercept;
        boolean boolean11 = line2.Intersect(line5);
        double double12 = line5.slope;
        Line line15 = new Line((double) 'a', (double) (byte) 10);
        line15.slope = 100.0f;
        double double18 = line15.slope;
        boolean boolean19 = line5.Intersect(line15);
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        double double23 = line22.slope;
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        line26.slope = 0.0d;
        boolean boolean29 = line22.Intersect(line26);
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        boolean boolean34 = line26.Intersect(line32);
        java.lang.Class<?> wildcardClass35 = line26.getClass();
        java.lang.String str36 = line26.toString();
        Line line39 = new Line((double) (byte) 0, (double) 'a');
        double double40 = line39.slope;
        Line line43 = new Line((double) (byte) 0, (double) 'a');
        line43.slope = 0.0d;
        boolean boolean46 = line39.Intersect(line43);
        Line line49 = new Line((double) (byte) 0, (double) 'a');
        double double50 = line49.slope;
        boolean boolean51 = line43.Intersect(line49);
        java.lang.Class<?> wildcardClass52 = line43.getClass();
        java.lang.String str53 = line43.toString();
        boolean boolean54 = line26.Intersect(line43);
        line43.slope = 0.0d;
        Line line59 = new Line(10.0d, (double) 0L);
        Line line62 = new Line((double) 'a', (double) (byte) 10);
        line62.yintercept = (-1.0f);
        boolean boolean65 = line59.Intersect(line62);
        Line line68 = new Line((double) (byte) 0, (double) 'a');
        double double69 = line68.slope;
        java.lang.Class<?> wildcardClass70 = line68.getClass();
        Line line73 = new Line((double) (byte) 0, (double) 'a');
        double double74 = line73.slope;
        Line line77 = new Line((double) (byte) 0, (double) 'a');
        line77.slope = 0.0d;
        boolean boolean80 = line73.Intersect(line77);
        double double81 = line77.yintercept;
        Line line84 = new Line(0.0d, (double) (-1L));
        boolean boolean85 = line77.Intersect(line84);
        double double86 = line84.slope;
        boolean boolean87 = line68.Intersect(line84);
        boolean boolean88 = line59.Intersect(line68);
        double double89 = line68.slope;
        boolean boolean90 = line43.Intersect(line68);
        boolean boolean91 = line5.Intersect(line68);
        double double92 = line5.yintercept;
        java.lang.Class<?> wildcardClass93 = line5.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str36.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str53.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 97.0d + "'", double81 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 32.0d + "'", double92 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
        Line line2 = new Line((double) (byte) 0, (-1.0d));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        double double14 = line13.slope;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        line17.slope = 0.0d;
        boolean boolean20 = line13.Intersect(line17);
        double double21 = line13.yintercept;
        boolean boolean22 = line2.Intersect(line13);
        double double23 = line2.slope;
        line2.yintercept = 100;
        java.lang.Class<?> wildcardClass26 = line2.getClass();
        java.lang.Class<?> wildcardClass27 = line2.getClass();
        Line line28 = null;
        try {
            boolean boolean29 = line2.Intersect(line28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        line6.yintercept = (-1);
        java.lang.String str13 = line6.toString();
        java.lang.Class<?> wildcardClass14 = line6.getClass();
        line6.yintercept = (short) 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str13.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        line2.slope = 0.0d;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean8 = line2.Intersect(line7);
        double double9 = line2.yintercept;
        line2.slope = '4';
        java.lang.Class<?> wildcardClass12 = line2.getClass();
        java.lang.Class<?> wildcardClass13 = line2.getClass();
        double double14 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        double double16 = line6.slope;
        line6.yintercept = 10L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        Line line42 = new Line((double) ' ', (double) 1);
        boolean boolean43 = line2.Intersect(line42);
        double double44 = line2.yintercept;
        line2.slope = (-1.0d);
        line2.yintercept = (byte) -1;
        Line line51 = new Line((double) 100L, (double) 100);
        Line line54 = new Line((double) (byte) 0, (double) 'a');
        double double55 = line54.slope;
        Line line58 = new Line((double) (byte) 0, (double) 'a');
        line58.slope = 0.0d;
        boolean boolean61 = line54.Intersect(line58);
        Line line64 = new Line((double) (byte) 0, (double) 'a');
        double double65 = line64.slope;
        boolean boolean66 = line58.Intersect(line64);
        double double67 = line58.slope;
        Line line70 = new Line((double) 1.0f, (double) (short) 1);
        boolean boolean71 = line58.Intersect(line70);
        double double72 = line70.slope;
        boolean boolean73 = line51.Intersect(line70);
        boolean boolean74 = line2.Intersect(line70);
        line2.yintercept = 100;
        java.lang.Class<?> wildcardClass77 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 97.0d + "'", double44 == 97.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        line2.slope = 0.0d;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean8 = line2.Intersect(line7);
        java.lang.String str9 = line2.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str9.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        Line line2 = new Line((double) 100L, 97.0d);
        java.lang.String str3 = line2.toString();
        line2.yintercept = (byte) 100;
        line2.yintercept = (short) -1;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 100.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str3.equals("slope: 100.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        Line line2 = new Line(1.0d, (double) (byte) 100);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        Line line42 = new Line((double) 0.0f, (double) (short) 1);
        double double43 = line42.yintercept;
        boolean boolean44 = line28.Intersect(line42);
        Line line47 = new Line(10.0d, (double) (byte) 10);
        double double48 = line47.yintercept;
        boolean boolean49 = line28.Intersect(line47);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
        Line line2 = new Line((double) (short) 100, (double) ' ');
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        java.lang.String str4 = line2.toString();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "slope: 100.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str4.equals("slope: 100.0, yintercept: 32.0, epsilon:1.0E-6"));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test197");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        java.lang.String str11 = line6.toString();
        Line line14 = new Line(10.0d, (double) 10);
        boolean boolean15 = line6.Intersect(line14);
        Line line18 = new Line((double) (byte) 0, (double) 'a');
        double double19 = line18.slope;
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        line22.slope = 0.0d;
        boolean boolean25 = line18.Intersect(line22);
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        boolean boolean30 = line22.Intersect(line28);
        line28.yintercept = 0.0d;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        double double36 = line35.slope;
        Line line39 = new Line((double) (byte) 0, (double) 'a');
        line39.slope = 0.0d;
        boolean boolean42 = line35.Intersect(line39);
        boolean boolean43 = line28.Intersect(line39);
        java.lang.Class<?> wildcardClass44 = line39.getClass();
        double double45 = line39.slope;
        boolean boolean46 = line6.Intersect(line39);
        java.lang.Class<?> wildcardClass47 = line6.getClass();
        line6.slope = 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str11.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test198");
        Line line2 = new Line((double) 10L, (double) ' ');
        java.lang.String str3 = line2.toString();
        double double4 = line2.yintercept;
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        double double6 = line2.yintercept;
        double double7 = line2.slope;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 10.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str3.equals("slope: 10.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
        Line line2 = new Line((double) 100L, (double) 10L);
        Line line5 = new Line((double) 'a', (double) (byte) 10);
        line5.slope = (short) 100;
        line5.slope = 97.0d;
        line5.yintercept = (-1L);
        java.lang.String str12 = line5.toString();
        double double13 = line5.yintercept;
        line5.yintercept = (byte) 100;
        Line line18 = new Line((double) (byte) 0, (double) 'a');
        double double19 = line18.slope;
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        line22.slope = 0.0d;
        boolean boolean25 = line18.Intersect(line22);
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        boolean boolean30 = line22.Intersect(line28);
        line28.yintercept = 0.0d;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        double double36 = line35.slope;
        Line line39 = new Line((double) (byte) 0, (double) 'a');
        line39.slope = 0.0d;
        boolean boolean42 = line35.Intersect(line39);
        boolean boolean43 = line28.Intersect(line39);
        java.lang.Class<?> wildcardClass44 = line39.getClass();
        Line line47 = new Line((double) (byte) 0, (double) 'a');
        double double48 = line47.slope;
        Line line51 = new Line((double) (byte) 0, (double) 'a');
        line51.slope = 0.0d;
        boolean boolean54 = line47.Intersect(line51);
        double double55 = line51.yintercept;
        Line line58 = new Line(0.0d, (double) (-1L));
        boolean boolean59 = line51.Intersect(line58);
        java.lang.Class<?> wildcardClass60 = line51.getClass();
        boolean boolean61 = line39.Intersect(line51);
        Line line64 = new Line((double) (byte) 0, (double) 'a');
        double double65 = line64.slope;
        Line line68 = new Line((double) (byte) 0, (double) 'a');
        line68.slope = 0.0d;
        boolean boolean71 = line64.Intersect(line68);
        double double72 = line68.yintercept;
        Line line75 = new Line(0.0d, (double) (-1L));
        boolean boolean76 = line68.Intersect(line75);
        double double77 = line68.slope;
        java.lang.String str78 = line68.toString();
        boolean boolean79 = line39.Intersect(line68);
        line39.slope = ' ';
        boolean boolean82 = line5.Intersect(line39);
        java.lang.String str83 = line5.toString();
        boolean boolean84 = line2.Intersect(line5);
        line2.slope = (-1);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str12.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 97.0d + "'", double55 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 97.0d + "'", double72 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str78.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "slope: 97.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str83.equals("slope: 97.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test200");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 0.0d;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        boolean boolean27 = line12.Intersect(line23);
        java.lang.Class<?> wildcardClass28 = line12.getClass();
        java.lang.Class<?> wildcardClass29 = line12.getClass();
        double double30 = line12.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test201");
        Line line2 = new Line((double) 100, (double) 100.0f);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test202");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        double double23 = line22.slope;
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        line26.slope = 0.0d;
        boolean boolean29 = line22.Intersect(line26);
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        boolean boolean34 = line26.Intersect(line32);
        line32.yintercept = 0.0d;
        Line line39 = new Line((double) (byte) 0, (double) 'a');
        double double40 = line39.slope;
        Line line43 = new Line((double) (byte) 0, (double) 'a');
        line43.slope = 0.0d;
        boolean boolean46 = line39.Intersect(line43);
        boolean boolean47 = line32.Intersect(line43);
        boolean boolean48 = line10.Intersect(line43);
        line43.slope = (byte) 100;
        java.lang.Class<?> wildcardClass51 = line43.getClass();
        line43.yintercept = '4';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test203");
        Line line2 = new Line((double) 'a', 1.0d);
        java.lang.String str3 = line2.toString();
        line2.yintercept = (byte) -1;
        Line line8 = new Line((double) 0.0f, (double) 1);
        line8.slope = 97.0d;
        double double11 = line8.slope;
        line8.slope = 0.0d;
        java.lang.Class<?> wildcardClass14 = line8.getClass();
        Line line17 = new Line((double) 'a', (double) (byte) 10);
        double double18 = line17.slope;
        Line line21 = new Line((double) (byte) 0, (double) 'a');
        double double22 = line21.slope;
        Line line25 = new Line((double) (byte) 0, (double) 'a');
        double double26 = line25.slope;
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        line29.slope = 0.0d;
        boolean boolean32 = line25.Intersect(line29);
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        double double36 = line35.slope;
        boolean boolean37 = line29.Intersect(line35);
        java.lang.String str38 = line29.toString();
        double double39 = line29.slope;
        boolean boolean40 = line21.Intersect(line29);
        java.lang.Class<?> wildcardClass41 = line21.getClass();
        boolean boolean42 = line17.Intersect(line21);
        boolean boolean43 = line8.Intersect(line21);
        boolean boolean44 = line2.Intersect(line21);
        java.lang.String str45 = line2.toString();
        line2.slope = (-1.0d);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 97.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str3.equals("slope: 97.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str38.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str45.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test204");
        Line line2 = new Line((-1.0d), 10.0d);
        double double3 = line2.slope;
        line2.yintercept = '#';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test205");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        java.lang.String str16 = line6.toString();
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        boolean boolean31 = line23.Intersect(line29);
        java.lang.Class<?> wildcardClass32 = line23.getClass();
        java.lang.String str33 = line23.toString();
        boolean boolean34 = line6.Intersect(line23);
        line23.slope = 97.0d;
        java.lang.String str37 = line23.toString();
        Line line40 = new Line((double) (-1L), (double) '#');
        Line line43 = new Line((double) 0, (-1.0d));
        boolean boolean44 = line40.Intersect(line43);
        boolean boolean45 = line23.Intersect(line40);
        double double46 = line23.slope;
        Line line49 = new Line((double) '#', (double) 100);
        java.lang.String str50 = line49.toString();
        line49.slope = 10;
        boolean boolean53 = line23.Intersect(line49);
        line23.yintercept = (short) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "slope: 97.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str37.equals("slope: 97.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 97.0d + "'", double46 == 97.0d);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "slope: 35.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str50.equals("slope: 35.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test206");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        java.lang.String str14 = line2.toString();
        line2.slope = 10.0d;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        boolean boolean31 = line23.Intersect(line29);
        java.lang.Class<?> wildcardClass32 = line23.getClass();
        java.lang.String str33 = line23.toString();
        Line line36 = new Line((double) (byte) 0, (double) 'a');
        double double37 = line36.slope;
        Line line40 = new Line((double) (byte) 0, (double) 'a');
        line40.slope = 0.0d;
        boolean boolean43 = line36.Intersect(line40);
        Line line46 = new Line((double) (byte) 0, (double) 'a');
        double double47 = line46.slope;
        boolean boolean48 = line40.Intersect(line46);
        java.lang.Class<?> wildcardClass49 = line40.getClass();
        java.lang.String str50 = line40.toString();
        boolean boolean51 = line23.Intersect(line40);
        java.lang.Class<?> wildcardClass52 = line23.getClass();
        double double53 = line23.slope;
        boolean boolean54 = line2.Intersect(line23);
        double double55 = line2.yintercept;
        line2.slope = 52.0d;
        java.lang.String str58 = line2.toString();
        double double59 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str14.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str50.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 97.0d + "'", double55 == 97.0d);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "slope: 52.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str58.equals("slope: 52.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 97.0d + "'", double59 == 97.0d);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test207");
        Line line2 = new Line((double) 100.0f, (double) 100);
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        double double4 = line2.yintercept;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test208");
        Line line2 = new Line((double) 1L, (double) 100L);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test209");
        Line line2 = new Line((double) 100L, 97.0d);
        line2.slope = 32.0d;
        line2.slope = '4';
        Line line9 = new Line((double) 100L, 97.0d);
        line9.slope = 32.0d;
        line9.yintercept = 100.0d;
        double double14 = line9.yintercept;
        java.lang.String str15 = line9.toString();
        boolean boolean16 = line2.Intersect(line9);
        double double17 = line2.yintercept;
        double double18 = line2.yintercept;
        line2.slope = ' ';
        double double21 = line2.slope;
        Line line24 = new Line(10.0d, (double) 0L);
        Line line27 = new Line((double) 'a', (double) (byte) 10);
        line27.yintercept = (-1.0f);
        boolean boolean30 = line24.Intersect(line27);
        java.lang.Class<?> wildcardClass31 = line27.getClass();
        java.lang.Class<?> wildcardClass32 = line27.getClass();
        boolean boolean33 = line2.Intersect(line27);
        line2.slope = (short) 0;
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str15.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 32.0d + "'", double21 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test210");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        line28.slope = (byte) 10;
        java.lang.String str41 = line28.toString();
        Line line44 = new Line((double) (byte) 0, (double) 'a');
        double double45 = line44.slope;
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        line48.slope = 0.0d;
        boolean boolean51 = line44.Intersect(line48);
        double double52 = line48.yintercept;
        Line line55 = new Line(0.0d, (double) (-1L));
        boolean boolean56 = line48.Intersect(line55);
        Line line59 = new Line((double) 100L, (double) 100);
        java.lang.String str60 = line59.toString();
        boolean boolean61 = line48.Intersect(line59);
        line48.slope = (byte) 1;
        boolean boolean64 = line28.Intersect(line48);
        boolean boolean65 = line10.Intersect(line28);
        double double66 = line28.slope;
        java.lang.String str67 = line28.toString();
        double double68 = line28.slope;
        java.lang.String str69 = line28.toString();
        java.lang.Class<?> wildcardClass70 = line28.getClass();
        double double71 = line28.yintercept;
        java.lang.String str72 = line28.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str41.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 97.0d + "'", double52 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str60.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str67.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str69.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 97.0d + "'", double71 == 97.0d);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str72.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test211");
        Line line2 = new Line((double) ' ', 100.0d);
        double double3 = line2.yintercept;
        double double4 = line2.slope;
        line2.yintercept = 10L;
        double double7 = line2.yintercept;
        Line line10 = new Line((double) 10L, (double) ' ');
        line10.slope = 1L;
        double double13 = line10.slope;
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        Line line20 = new Line((double) (byte) 0, (double) 'a');
        line20.slope = 0.0d;
        boolean boolean23 = line16.Intersect(line20);
        double double24 = line16.yintercept;
        double double25 = line16.slope;
        boolean boolean26 = line10.Intersect(line16);
        line16.slope = (byte) 10;
        java.lang.String str29 = line16.toString();
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        Line line36 = new Line((double) (byte) 0, (double) 'a');
        line36.slope = 0.0d;
        boolean boolean39 = line32.Intersect(line36);
        double double40 = line36.yintercept;
        Line line43 = new Line(0.0d, (double) (-1L));
        boolean boolean44 = line36.Intersect(line43);
        Line line47 = new Line((double) 100L, (double) 100);
        java.lang.String str48 = line47.toString();
        boolean boolean49 = line36.Intersect(line47);
        line36.slope = (byte) 1;
        boolean boolean52 = line16.Intersect(line36);
        line16.yintercept = 52.0d;
        line16.yintercept = (byte) 10;
        line16.yintercept = 52.0d;
        java.lang.Class<?> wildcardClass59 = line16.getClass();
        boolean boolean60 = line2.Intersect(line16);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str29.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 97.0d + "'", double40 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str48.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test212");
        Line line2 = new Line((double) '4', (double) 0.0f);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test213");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 0.0d;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        boolean boolean27 = line12.Intersect(line23);
        java.lang.Class<?> wildcardClass28 = line23.getClass();
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        double double39 = line35.yintercept;
        Line line42 = new Line(0.0d, (double) (-1L));
        boolean boolean43 = line35.Intersect(line42);
        java.lang.Class<?> wildcardClass44 = line35.getClass();
        boolean boolean45 = line23.Intersect(line35);
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        double double49 = line48.slope;
        Line line52 = new Line((double) (byte) 0, (double) 'a');
        line52.slope = 0.0d;
        boolean boolean55 = line48.Intersect(line52);
        double double56 = line52.yintercept;
        Line line59 = new Line(0.0d, (double) (-1L));
        boolean boolean60 = line52.Intersect(line59);
        double double61 = line52.slope;
        java.lang.String str62 = line52.toString();
        boolean boolean63 = line23.Intersect(line52);
        line23.slope = ' ';
        line23.slope = '#';
        java.lang.String str68 = line23.toString();
        java.lang.String str69 = line23.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 97.0d + "'", double56 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str62.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "slope: 35.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str68.equals("slope: 35.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "slope: 35.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str69.equals("slope: 35.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test214");
        Line line2 = new Line((double) (-1), (double) 'a');
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test215");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 0.0d;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        boolean boolean27 = line12.Intersect(line23);
        java.lang.Class<?> wildcardClass28 = line23.getClass();
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        double double39 = line35.yintercept;
        Line line42 = new Line(0.0d, (double) (-1L));
        boolean boolean43 = line35.Intersect(line42);
        java.lang.Class<?> wildcardClass44 = line35.getClass();
        boolean boolean45 = line23.Intersect(line35);
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        double double49 = line48.slope;
        Line line52 = new Line((double) (byte) 0, (double) 'a');
        line52.slope = 0.0d;
        boolean boolean55 = line48.Intersect(line52);
        double double56 = line52.yintercept;
        Line line59 = new Line(0.0d, (double) (-1L));
        boolean boolean60 = line52.Intersect(line59);
        double double61 = line52.slope;
        java.lang.String str62 = line52.toString();
        boolean boolean63 = line23.Intersect(line52);
        java.lang.String str64 = line52.toString();
        java.lang.String str65 = line52.toString();
        line52.slope = '#';
        double double68 = line52.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 97.0d + "'", double56 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str62.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str64.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str65.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 35.0d + "'", double68 == 35.0d);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test216");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        line2.yintercept = 97.0d;
        line2.yintercept = 10.0d;
        Line line46 = new Line((double) 0L, (double) 100.0f);
        Line line49 = new Line((double) (short) -1, (double) (short) -1);
        line49.yintercept = (-1.0f);
        boolean boolean52 = line46.Intersect(line49);
        boolean boolean53 = line2.Intersect(line46);
        double double54 = line46.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 100.0d + "'", double54 == 100.0d);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test217");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        java.lang.String str14 = line2.toString();
        line2.slope = (short) 1;
        double double17 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str14.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test218");
        Line line2 = new Line((double) 10L, (double) ' ');
        java.lang.String str3 = line2.toString();
        double double4 = line2.slope;
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 10.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str3.equals("slope: 10.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test219");
        Line line2 = new Line(1.0d, 52.0d);
        line2.slope = '4';
        double double5 = line2.slope;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test220");
        Line line2 = new Line((double) 10L, (double) ' ');
        Line line5 = new Line((double) 10L, (double) ' ');
        line5.slope = 1L;
        double double8 = line5.slope;
        double double9 = line5.slope;
        double double10 = line5.yintercept;
        boolean boolean11 = line2.Intersect(line5);
        java.lang.Class<?> wildcardClass12 = line5.getClass();
        java.lang.Class<?> wildcardClass13 = line5.getClass();
        double double14 = line5.yintercept;
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test221");
        Line line2 = new Line((double) 100L, 97.0d);
        line2.slope = 32.0d;
        line2.yintercept = 100.0d;
        double double7 = line2.yintercept;
        java.lang.String str8 = line2.toString();
        java.lang.Class<?> wildcardClass9 = line2.getClass();
        Line line12 = new Line((double) 'a', (double) (byte) 10);
        double double13 = line12.slope;
        line12.yintercept = 10.0f;
        double double16 = line12.slope;
        Line line19 = new Line((double) ' ', (double) 1);
        line19.yintercept = 100.0f;
        boolean boolean22 = line12.Intersect(line19);
        boolean boolean23 = line2.Intersect(line12);
        Line line26 = new Line((double) (byte) 10, (-1.0d));
        java.lang.String str27 = line26.toString();
        boolean boolean28 = line12.Intersect(line26);
        double double29 = line26.slope;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str8.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "slope: 10.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str27.equals("slope: 10.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test222");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        double double4 = line2.slope;
        double double5 = line2.slope;
        line2.slope = (byte) 10;
        line2.yintercept = 32.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test223");
        Line line2 = new Line((double) ' ', (double) 1);
        line2.yintercept = 100.0f;
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        line2.slope = 0.0d;
        double double8 = line2.yintercept;
        java.lang.String str9 = line2.toString();
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        Line line20 = new Line((double) (byte) 0, (double) 'a');
        line20.slope = 0.0d;
        boolean boolean23 = line16.Intersect(line20);
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        double double27 = line26.slope;
        boolean boolean28 = line20.Intersect(line26);
        boolean boolean29 = line12.Intersect(line20);
        Line line32 = new Line((double) 10L, (double) ' ');
        line32.slope = 1L;
        double double35 = line32.slope;
        Line line38 = new Line((double) (byte) 0, (double) 'a');
        double double39 = line38.slope;
        Line line42 = new Line((double) (byte) 0, (double) 'a');
        line42.slope = 0.0d;
        boolean boolean45 = line38.Intersect(line42);
        double double46 = line38.yintercept;
        double double47 = line38.slope;
        boolean boolean48 = line32.Intersect(line38);
        boolean boolean49 = line12.Intersect(line38);
        line38.yintercept = 'a';
        boolean boolean52 = line2.Intersect(line38);
        line2.slope = 0.0d;
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 0.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str9.equals("slope: 0.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 97.0d + "'", double46 == 97.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test224");
        Line line2 = new Line((double) 0.0f, (double) 10.0f);
        double double3 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test225");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = 100.0f;
        double double5 = line2.slope;
        line2.yintercept = 1.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test226");
        Line line2 = new Line((double) ' ', (double) 100L);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test227");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        double double6 = line2.slope;
        java.lang.Class<?> wildcardClass7 = line2.getClass();
        Line line10 = new Line((double) ' ', 100.0d);
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        double double14 = line13.slope;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        double double18 = line17.slope;
        Line line21 = new Line((double) (byte) 0, (double) 'a');
        line21.slope = 0.0d;
        boolean boolean24 = line17.Intersect(line21);
        Line line27 = new Line((double) (byte) 0, (double) 'a');
        double double28 = line27.slope;
        boolean boolean29 = line21.Intersect(line27);
        boolean boolean30 = line13.Intersect(line21);
        line13.slope = 10.0d;
        boolean boolean33 = line10.Intersect(line13);
        boolean boolean34 = line2.Intersect(line10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test228");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = (short) 100;
        line2.slope = 97.0d;
        line2.yintercept = (-1L);
        java.lang.String str9 = line2.toString();
        double double10 = line2.yintercept;
        java.lang.Class<?> wildcardClass11 = line2.getClass();
        java.lang.String str12 = line2.toString();
        double double13 = line2.slope;
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str12.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test229");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        double double6 = line2.slope;
        Line line9 = new Line((double) ' ', (double) '4');
        boolean boolean10 = line2.Intersect(line9);
        java.lang.String str11 = line9.toString();
        java.lang.String str12 = line9.toString();
        line9.slope = 97.0d;
        double double15 = line9.slope;
        double double16 = line9.slope;
        Line line19 = new Line((double) 10L, (double) ' ');
        line19.slope = 1L;
        double double22 = line19.slope;
        double double23 = line19.slope;
        Line line26 = new Line((double) ' ', (double) '4');
        boolean boolean27 = line19.Intersect(line26);
        java.lang.String str28 = line26.toString();
        java.lang.String str29 = line26.toString();
        line26.slope = 97.0d;
        double double32 = line26.slope;
        double double33 = line26.slope;
        boolean boolean34 = line9.Intersect(line26);
        Line line37 = new Line((double) 10L, (double) ' ');
        line37.slope = 1L;
        double double40 = line37.slope;
        double double41 = line37.slope;
        Line line44 = new Line((double) ' ', (double) '4');
        boolean boolean45 = line37.Intersect(line44);
        line37.yintercept = 10;
        java.lang.Class<?> wildcardClass48 = line37.getClass();
        java.lang.Class<?> wildcardClass49 = line37.getClass();
        boolean boolean50 = line26.Intersect(line37);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 32.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str11.equals("slope: 32.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "slope: 32.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str12.equals("slope: 32.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "slope: 32.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str28.equals("slope: 32.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "slope: 32.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str29.equals("slope: 32.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 97.0d + "'", double33 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test230");
        Line line2 = new Line(32.0d, 0.0d);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test231");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        double double5 = line2.slope;
        line2.yintercept = 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test232");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        double double23 = line22.slope;
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        line26.slope = 0.0d;
        boolean boolean29 = line22.Intersect(line26);
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        boolean boolean34 = line26.Intersect(line32);
        line32.yintercept = 0.0d;
        Line line39 = new Line((double) (byte) 0, (double) 'a');
        double double40 = line39.slope;
        Line line43 = new Line((double) (byte) 0, (double) 'a');
        line43.slope = 0.0d;
        boolean boolean46 = line39.Intersect(line43);
        boolean boolean47 = line32.Intersect(line43);
        boolean boolean48 = line10.Intersect(line43);
        line43.slope = (byte) 100;
        java.lang.String str51 = line43.toString();
        java.lang.Class<?> wildcardClass52 = line43.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "slope: 100.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str51.equals("slope: 100.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test233");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        line10.slope = 0L;
        line10.yintercept = (-1L);
        java.lang.String str24 = line10.toString();
        line10.slope = (byte) -1;
        Line line29 = new Line((double) 10L, (double) ' ');
        line29.slope = 1L;
        double double32 = line29.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        double double36 = line35.slope;
        Line line39 = new Line((double) (byte) 0, (double) 'a');
        line39.slope = 0.0d;
        boolean boolean42 = line35.Intersect(line39);
        double double43 = line35.yintercept;
        double double44 = line35.slope;
        boolean boolean45 = line29.Intersect(line35);
        boolean boolean46 = line10.Intersect(line29);
        double double47 = line29.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str24.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 97.0d + "'", double43 == 97.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 32.0d + "'", double47 == 32.0d);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test234");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 0.0d;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        boolean boolean27 = line12.Intersect(line23);
        java.lang.Class<?> wildcardClass28 = line23.getClass();
        Line line31 = new Line((double) 100L, (double) 10L);
        boolean boolean32 = line23.Intersect(line31);
        java.lang.String str33 = line23.toString();
        java.lang.String str34 = line23.toString();
        java.lang.Class<?> wildcardClass35 = line23.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str34.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test235");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.String str15 = line6.toString();
        double double16 = line6.yintercept;
        java.lang.Class<?> wildcardClass17 = line6.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str15.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test236");
        Line line2 = new Line((double) 10L, 97.0d);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test237");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.slope = 1.0d;
        java.lang.String str17 = line12.toString();
        line12.slope = 10L;
        java.lang.String str20 = line12.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "slope: 1.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str17.equals("slope: 1.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str20.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test238");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        double double16 = line8.yintercept;
        double double17 = line8.slope;
        boolean boolean18 = line2.Intersect(line8);
        line8.slope = (byte) 10;
        java.lang.String str21 = line8.toString();
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        double double25 = line24.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        line28.slope = 0.0d;
        boolean boolean31 = line24.Intersect(line28);
        double double32 = line28.yintercept;
        Line line35 = new Line(0.0d, (double) (-1L));
        boolean boolean36 = line28.Intersect(line35);
        Line line39 = new Line((double) 100L, (double) 100);
        java.lang.String str40 = line39.toString();
        boolean boolean41 = line28.Intersect(line39);
        line28.slope = (byte) 1;
        boolean boolean44 = line8.Intersect(line28);
        double double45 = line8.yintercept;
        java.lang.Class<?> wildcardClass46 = line8.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str40.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 97.0d + "'", double45 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test239");
        Line line2 = new Line((double) (byte) 0, (double) '#');
        java.lang.String str3 = line2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 0.0, yintercept: 35.0, epsilon:1.0E-6" + "'", str3.equals("slope: 0.0, yintercept: 35.0, epsilon:1.0E-6"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test240");
        Line line2 = new Line((double) (short) 100, (double) (byte) 10);
        line2.yintercept = (-1L);
        java.lang.String str5 = line2.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 100.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str5.equals("slope: 100.0, yintercept: -1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test241");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        line2.slope = 100.0f;
        java.lang.Class<?> wildcardClass13 = line2.getClass();
        line2.yintercept = 100L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test242");
        Line line2 = new Line((double) 10, 0.0d);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test243");
        Line line2 = new Line((double) (short) 100, (double) ' ');
        double double3 = line2.yintercept;
        java.lang.String str4 = line2.toString();
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        line2.yintercept = 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "slope: 100.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str4.equals("slope: 100.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test244");
        Line line2 = new Line((double) (-1), (double) 0);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        double double10 = line9.slope;
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        line13.slope = 0.0d;
        boolean boolean16 = line9.Intersect(line13);
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        boolean boolean21 = line13.Intersect(line19);
        boolean boolean22 = line5.Intersect(line13);
        Line line25 = new Line((double) 10L, (double) ' ');
        line25.slope = 1L;
        double double28 = line25.slope;
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        double double39 = line31.yintercept;
        double double40 = line31.slope;
        boolean boolean41 = line25.Intersect(line31);
        boolean boolean42 = line5.Intersect(line31);
        Line line45 = new Line((double) ' ', (double) 1);
        boolean boolean46 = line5.Intersect(line45);
        boolean boolean47 = line2.Intersect(line45);
        line45.yintercept = 97.0d;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test245");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 0.0d;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        boolean boolean27 = line12.Intersect(line23);
        java.lang.String str28 = line23.toString();
        line23.yintercept = 0;
        line23.yintercept = 1L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str28.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test246");
        Line line2 = new Line((double) (short) 100, (double) ' ');
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        double double4 = line2.yintercept;
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test247");
        Line line2 = new Line((double) '#', (double) 100);
        double double3 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test248");
        Line line2 = new Line((double) 100L, (double) 100);
        java.lang.String str3 = line2.toString();
        double double4 = line2.slope;
        line2.yintercept = 0.0d;
        java.lang.String str7 = line2.toString();
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        double double11 = line10.slope;
        Line line14 = new Line((double) (byte) 0, (double) 'a');
        line14.slope = 0.0d;
        boolean boolean17 = line10.Intersect(line14);
        double double18 = line14.yintercept;
        Line line21 = new Line(0.0d, (double) (-1L));
        boolean boolean22 = line14.Intersect(line21);
        double double23 = line21.slope;
        java.lang.Class<?> wildcardClass24 = line21.getClass();
        boolean boolean25 = line2.Intersect(line21);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str3.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "slope: 100.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str7.equals("slope: 100.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test249");
        Line line2 = new Line((double) '4', (double) (-1.0f));
        double double3 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test250");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        Line line42 = new Line((double) ' ', (double) 1);
        boolean boolean43 = line2.Intersect(line42);
        double double44 = line2.yintercept;
        line2.slope = (-1.0d);
        java.lang.Class<?> wildcardClass47 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 97.0d + "'", double44 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test251");
        Line line2 = new Line((double) ' ', (double) 1);
        line2.slope = 'a';
        double double5 = line2.yintercept;
        java.lang.Class<?> wildcardClass6 = line2.getClass();
        double double7 = line2.slope;
        line2.yintercept = (short) 0;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test252");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        Line line42 = new Line((double) ' ', (double) 1);
        boolean boolean43 = line2.Intersect(line42);
        double double44 = line2.yintercept;
        Line line47 = new Line((double) 10L, (double) ' ');
        java.lang.String str48 = line47.toString();
        line47.yintercept = (short) 10;
        boolean boolean51 = line2.Intersect(line47);
        line47.yintercept = ' ';
        line47.slope = (short) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 97.0d + "'", double44 == 97.0d);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "slope: 10.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str48.equals("slope: 10.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test253");
        Line line2 = new Line((double) 10, (double) (byte) 1);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test254");
        Line line2 = new Line((double) 1, (double) (-1.0f));
        line2.slope = (short) 100;
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test255");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        line28.slope = (byte) 10;
        java.lang.String str41 = line28.toString();
        Line line44 = new Line((double) (byte) 0, (double) 'a');
        double double45 = line44.slope;
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        line48.slope = 0.0d;
        boolean boolean51 = line44.Intersect(line48);
        double double52 = line48.yintercept;
        Line line55 = new Line(0.0d, (double) (-1L));
        boolean boolean56 = line48.Intersect(line55);
        Line line59 = new Line((double) 100L, (double) 100);
        java.lang.String str60 = line59.toString();
        boolean boolean61 = line48.Intersect(line59);
        line48.slope = (byte) 1;
        boolean boolean64 = line28.Intersect(line48);
        boolean boolean65 = line10.Intersect(line28);
        double double66 = line28.slope;
        java.lang.String str67 = line28.toString();
        double double68 = line28.slope;
        java.lang.String str69 = line28.toString();
        java.lang.String str70 = line28.toString();
        line28.yintercept = 1.0d;
        line28.slope = (short) 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str41.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 97.0d + "'", double52 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str60.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str67.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str69.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str70.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test256");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        Line line17 = new Line((double) 100L, (double) 100);
        java.lang.String str18 = line17.toString();
        boolean boolean19 = line6.Intersect(line17);
        line17.yintercept = (byte) 0;
        line17.yintercept = 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str18.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test257");
        Line line2 = new Line((double) ' ', (double) 1);
        double double3 = line2.yintercept;
        line2.slope = ' ';
        java.lang.Class<?> wildcardClass6 = line2.getClass();
        line2.yintercept = (short) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test258");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.yintercept = (byte) 1;
        line2.slope = 1.0f;
        line2.yintercept = 'a';
        java.lang.String str9 = line2.toString();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 1.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str9.equals("slope: 1.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test259");
        Line line2 = new Line((double) (byte) -1, (double) 10L);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test260");
        Line line2 = new Line((double) (byte) 10, 97.0d);
        double double3 = line2.yintercept;
        double double4 = line2.yintercept;
        double double5 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test261");
        Line line2 = new Line((double) (short) 100, (double) ' ');
        double double3 = line2.yintercept;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        java.lang.Class<?> wildcardClass19 = line10.getClass();
        java.lang.String str20 = line10.toString();
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        double double24 = line23.slope;
        Line line27 = new Line((double) (byte) 0, (double) 'a');
        line27.slope = 0.0d;
        boolean boolean30 = line23.Intersect(line27);
        Line line33 = new Line((double) (byte) 0, (double) 'a');
        double double34 = line33.slope;
        boolean boolean35 = line27.Intersect(line33);
        java.lang.Class<?> wildcardClass36 = line27.getClass();
        java.lang.String str37 = line27.toString();
        boolean boolean38 = line10.Intersect(line27);
        line27.slope = 97.0d;
        double double41 = line27.yintercept;
        double double42 = line27.slope;
        boolean boolean43 = line2.Intersect(line27);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str20.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str37.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 97.0d + "'", double41 == 97.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 97.0d + "'", double42 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test262");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        java.lang.String str16 = line6.toString();
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        boolean boolean31 = line23.Intersect(line29);
        java.lang.Class<?> wildcardClass32 = line23.getClass();
        java.lang.String str33 = line23.toString();
        boolean boolean34 = line6.Intersect(line23);
        java.lang.Class<?> wildcardClass35 = line6.getClass();
        double double36 = line6.yintercept;
        java.lang.String str37 = line6.toString();
        line6.yintercept = (byte) -1;
        double double40 = line6.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str37.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test263");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        line2.slope = 0.0d;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean8 = line2.Intersect(line7);
        line2.yintercept = (byte) 1;
        double double11 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test264");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        double double4 = line2.slope;
        double double5 = line2.slope;
        line2.yintercept = 100.0f;
        double double8 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test265");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        java.lang.String str16 = line6.toString();
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        boolean boolean31 = line23.Intersect(line29);
        java.lang.Class<?> wildcardClass32 = line23.getClass();
        java.lang.String str33 = line23.toString();
        boolean boolean34 = line6.Intersect(line23);
        line23.slope = 0.0d;
        Line line39 = new Line(10.0d, (double) 0L);
        Line line42 = new Line((double) 'a', (double) (byte) 10);
        line42.yintercept = (-1.0f);
        boolean boolean45 = line39.Intersect(line42);
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        double double49 = line48.slope;
        java.lang.Class<?> wildcardClass50 = line48.getClass();
        Line line53 = new Line((double) (byte) 0, (double) 'a');
        double double54 = line53.slope;
        Line line57 = new Line((double) (byte) 0, (double) 'a');
        line57.slope = 0.0d;
        boolean boolean60 = line53.Intersect(line57);
        double double61 = line57.yintercept;
        Line line64 = new Line(0.0d, (double) (-1L));
        boolean boolean65 = line57.Intersect(line64);
        double double66 = line64.slope;
        boolean boolean67 = line48.Intersect(line64);
        boolean boolean68 = line39.Intersect(line48);
        double double69 = line48.slope;
        boolean boolean70 = line23.Intersect(line48);
        java.lang.Class<?> wildcardClass71 = line48.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 97.0d + "'", double61 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test266");
        Line line2 = new Line((double) (-1), 0.0d);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test267");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        java.lang.String str16 = line6.toString();
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        boolean boolean31 = line23.Intersect(line29);
        java.lang.Class<?> wildcardClass32 = line23.getClass();
        java.lang.String str33 = line23.toString();
        boolean boolean34 = line6.Intersect(line23);
        double double35 = line6.yintercept;
        line6.slope = 32.0d;
        Line line40 = new Line((double) 10L, (double) ' ');
        line40.slope = 1L;
        double double43 = line40.slope;
        double double44 = line40.slope;
        line40.yintercept = (-1.0d);
        boolean boolean47 = line6.Intersect(line40);
        java.lang.Class<?> wildcardClass48 = line40.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 97.0d + "'", double35 == 97.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test268");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        java.lang.String str16 = line6.toString();
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        boolean boolean31 = line23.Intersect(line29);
        java.lang.Class<?> wildcardClass32 = line23.getClass();
        java.lang.String str33 = line23.toString();
        boolean boolean34 = line6.Intersect(line23);
        double double35 = line6.yintercept;
        line6.yintercept = 10L;
        Line line40 = new Line((double) (byte) 0, (double) 'a');
        double double41 = line40.slope;
        Line line44 = new Line((double) (byte) 0, (double) 'a');
        double double45 = line44.slope;
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        line48.slope = 0.0d;
        boolean boolean51 = line44.Intersect(line48);
        Line line54 = new Line((double) (byte) 0, (double) 'a');
        double double55 = line54.slope;
        boolean boolean56 = line48.Intersect(line54);
        boolean boolean57 = line40.Intersect(line48);
        Line line60 = new Line((double) (byte) 0, (double) 'a');
        double double61 = line60.slope;
        Line line64 = new Line((double) (byte) 0, (double) 'a');
        line64.slope = 0.0d;
        boolean boolean67 = line60.Intersect(line64);
        Line line70 = new Line((double) (byte) 0, (double) 'a');
        double double71 = line70.slope;
        boolean boolean72 = line64.Intersect(line70);
        line70.yintercept = 0.0d;
        Line line77 = new Line((double) (byte) 0, (double) 'a');
        double double78 = line77.slope;
        Line line81 = new Line((double) (byte) 0, (double) 'a');
        line81.slope = 0.0d;
        boolean boolean84 = line77.Intersect(line81);
        boolean boolean85 = line70.Intersect(line81);
        boolean boolean86 = line48.Intersect(line81);
        line81.slope = (byte) 100;
        java.lang.Class<?> wildcardClass89 = line81.getClass();
        boolean boolean90 = line6.Intersect(line81);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 97.0d + "'", double35 == 97.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test269");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        line6.yintercept = (-1);
        java.lang.String str13 = line6.toString();
        double double14 = line6.slope;
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        line6.slope = 97.0d;
        Line line20 = new Line((double) (byte) 0, (double) 'a');
        double double21 = line20.slope;
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        line24.slope = 0.0d;
        boolean boolean27 = line20.Intersect(line24);
        Line line30 = new Line((double) ' ', (double) '4');
        boolean boolean31 = line20.Intersect(line30);
        double double32 = line20.slope;
        double double33 = line20.yintercept;
        java.lang.Class<?> wildcardClass34 = line20.getClass();
        boolean boolean35 = line6.Intersect(line20);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str13.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 97.0d + "'", double33 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test270");
        Line line2 = new Line((double) (-1L), (double) '#');
        Line line5 = new Line((double) 0, (-1.0d));
        boolean boolean6 = line2.Intersect(line5);
        Line line9 = new Line(10.0d, (double) 0L);
        Line line12 = new Line((double) 'a', (double) (byte) 10);
        line12.yintercept = (-1.0f);
        boolean boolean15 = line9.Intersect(line12);
        java.lang.Class<?> wildcardClass16 = line12.getClass();
        java.lang.Class<?> wildcardClass17 = line12.getClass();
        boolean boolean18 = line2.Intersect(line12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test271");
        Line line2 = new Line((double) (-1), (double) (byte) -1);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test272");
        Line line2 = new Line(100.0d, 1.0d);
        double double3 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test273");
        Line line2 = new Line((double) (short) 100, (double) (byte) -1);
        line2.slope = 100.0d;
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test274");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        java.lang.String str5 = line2.toString();
        double double6 = line2.yintercept;
        java.lang.Class<?> wildcardClass7 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str5.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test275");
        Line line2 = new Line((double) 'a', 1.0d);
        Line line5 = new Line((double) 'a', (double) (byte) 10);
        line5.slope = (short) 100;
        line5.slope = 97.0d;
        line5.yintercept = (-1L);
        java.lang.String str12 = line5.toString();
        double double13 = line5.yintercept;
        java.lang.Class<?> wildcardClass14 = line5.getClass();
        boolean boolean15 = line2.Intersect(line5);
        java.lang.String str16 = line2.toString();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str12.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 97.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str16.equals("slope: 97.0, yintercept: 1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test276");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        Line line42 = new Line((double) 0.0f, (double) (short) 1);
        double double43 = line42.yintercept;
        boolean boolean44 = line28.Intersect(line42);
        java.lang.Class<?> wildcardClass45 = line28.getClass();
        line28.slope = '4';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test277");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        Line line42 = new Line((double) ' ', (double) 1);
        boolean boolean43 = line2.Intersect(line42);
        double double44 = line2.yintercept;
        Line line47 = new Line((double) 10L, (double) ' ');
        java.lang.String str48 = line47.toString();
        line47.yintercept = (short) 10;
        boolean boolean51 = line2.Intersect(line47);
        double double52 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 97.0d + "'", double44 == 97.0d);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "slope: 10.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str48.equals("slope: 10.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 97.0d + "'", double52 == 97.0d);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test278");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.yintercept = 10L;
        line2.slope = 100L;
        Line line9 = new Line((double) 10L, (double) ' ');
        java.lang.Class<?> wildcardClass10 = line9.getClass();
        double double11 = line9.slope;
        Line line14 = new Line((double) 'a', (double) (byte) 10);
        line14.slope = (short) 100;
        line14.slope = 97.0d;
        boolean boolean19 = line9.Intersect(line14);
        boolean boolean20 = line2.Intersect(line14);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test279");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = (short) 100;
        line2.slope = 97.0d;
        line2.yintercept = (-1L);
        java.lang.String str9 = line2.toString();
        double double10 = line2.yintercept;
        line2.yintercept = (byte) 100;
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        double double16 = line15.slope;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        line19.slope = 0.0d;
        boolean boolean22 = line15.Intersect(line19);
        Line line25 = new Line((double) (byte) 0, (double) 'a');
        double double26 = line25.slope;
        boolean boolean27 = line19.Intersect(line25);
        line25.yintercept = 0.0d;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        Line line36 = new Line((double) (byte) 0, (double) 'a');
        line36.slope = 0.0d;
        boolean boolean39 = line32.Intersect(line36);
        boolean boolean40 = line25.Intersect(line36);
        java.lang.Class<?> wildcardClass41 = line36.getClass();
        Line line44 = new Line((double) (byte) 0, (double) 'a');
        double double45 = line44.slope;
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        line48.slope = 0.0d;
        boolean boolean51 = line44.Intersect(line48);
        double double52 = line48.yintercept;
        Line line55 = new Line(0.0d, (double) (-1L));
        boolean boolean56 = line48.Intersect(line55);
        java.lang.Class<?> wildcardClass57 = line48.getClass();
        boolean boolean58 = line36.Intersect(line48);
        Line line61 = new Line((double) (byte) 0, (double) 'a');
        double double62 = line61.slope;
        Line line65 = new Line((double) (byte) 0, (double) 'a');
        line65.slope = 0.0d;
        boolean boolean68 = line61.Intersect(line65);
        double double69 = line65.yintercept;
        Line line72 = new Line(0.0d, (double) (-1L));
        boolean boolean73 = line65.Intersect(line72);
        double double74 = line65.slope;
        java.lang.String str75 = line65.toString();
        boolean boolean76 = line36.Intersect(line65);
        line36.slope = ' ';
        boolean boolean79 = line2.Intersect(line36);
        double double80 = line2.slope;
        double double81 = line2.slope;
        double double82 = line2.yintercept;
        java.lang.String str83 = line2.toString();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 97.0d + "'", double52 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 97.0d + "'", double69 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str75.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 97.0d + "'", double80 == 97.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 97.0d + "'", double81 == 97.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 100.0d + "'", double82 == 100.0d);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "slope: 97.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str83.equals("slope: 97.0, yintercept: 100.0, epsilon:1.0E-6"));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test280");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        java.lang.String str14 = line2.toString();
        double double15 = line2.yintercept;
        Line line18 = new Line((double) 'a', (double) (byte) 10);
        line18.slope = (short) 100;
        line18.slope = 97.0d;
        line18.yintercept = (-1L);
        java.lang.String str25 = line18.toString();
        double double26 = line18.yintercept;
        line18.yintercept = (byte) 100;
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        Line line41 = new Line((double) (byte) 0, (double) 'a');
        double double42 = line41.slope;
        boolean boolean43 = line35.Intersect(line41);
        line41.yintercept = 0.0d;
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        double double49 = line48.slope;
        Line line52 = new Line((double) (byte) 0, (double) 'a');
        line52.slope = 0.0d;
        boolean boolean55 = line48.Intersect(line52);
        boolean boolean56 = line41.Intersect(line52);
        java.lang.Class<?> wildcardClass57 = line52.getClass();
        Line line60 = new Line((double) (byte) 0, (double) 'a');
        double double61 = line60.slope;
        Line line64 = new Line((double) (byte) 0, (double) 'a');
        line64.slope = 0.0d;
        boolean boolean67 = line60.Intersect(line64);
        double double68 = line64.yintercept;
        Line line71 = new Line(0.0d, (double) (-1L));
        boolean boolean72 = line64.Intersect(line71);
        java.lang.Class<?> wildcardClass73 = line64.getClass();
        boolean boolean74 = line52.Intersect(line64);
        Line line77 = new Line((double) (byte) 0, (double) 'a');
        double double78 = line77.slope;
        Line line81 = new Line((double) (byte) 0, (double) 'a');
        line81.slope = 0.0d;
        boolean boolean84 = line77.Intersect(line81);
        double double85 = line81.yintercept;
        Line line88 = new Line(0.0d, (double) (-1L));
        boolean boolean89 = line81.Intersect(line88);
        double double90 = line81.slope;
        java.lang.String str91 = line81.toString();
        boolean boolean92 = line52.Intersect(line81);
        line52.slope = ' ';
        boolean boolean95 = line18.Intersect(line52);
        java.lang.String str96 = line18.toString();
        boolean boolean97 = line2.Intersect(line18);
        double double98 = line18.slope;
        double double99 = line18.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str14.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str25.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 97.0d + "'", double68 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 97.0d + "'", double85 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str91.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + str96 + "' != '" + "slope: 97.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str96.equals("slope: 97.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 97.0d + "'", double98 == 97.0d);
        org.junit.Assert.assertTrue("'" + double99 + "' != '" + 100.0d + "'", double99 == 100.0d);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test281");
        Line line2 = new Line((double) ' ', (double) 1);
        java.lang.String str3 = line2.toString();
        double double4 = line2.yintercept;
        double double5 = line2.slope;
        line2.yintercept = 1L;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 32.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str3.equals("slope: 32.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test282");
        Line line2 = new Line((double) 100.0f, 10.0d);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test283");
        Line line2 = new Line((double) (-1.0f), (double) (short) 0);
        java.lang.String str3 = line2.toString();
        double double4 = line2.slope;
        java.lang.String str5 = line2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: -1.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str3.equals("slope: -1.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: -1.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str5.equals("slope: -1.0, yintercept: 0.0, epsilon:1.0E-6"));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test284");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        double double16 = line8.yintercept;
        double double17 = line8.slope;
        boolean boolean18 = line2.Intersect(line8);
        line8.slope = (byte) 10;
        java.lang.String str21 = line8.toString();
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        double double25 = line24.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        line28.slope = 0.0d;
        boolean boolean31 = line24.Intersect(line28);
        double double32 = line28.yintercept;
        Line line35 = new Line(0.0d, (double) (-1L));
        boolean boolean36 = line28.Intersect(line35);
        Line line39 = new Line((double) 100L, (double) 100);
        java.lang.String str40 = line39.toString();
        boolean boolean41 = line28.Intersect(line39);
        line28.slope = (byte) 1;
        boolean boolean44 = line8.Intersect(line28);
        line8.yintercept = 52.0d;
        line8.yintercept = (byte) 10;
        line8.yintercept = 52.0d;
        double double51 = line8.yintercept;
        double double52 = line8.yintercept;
        double double53 = line8.yintercept;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str40.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 52.0d + "'", double51 == 52.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 52.0d + "'", double52 == 52.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 52.0d + "'", double53 == 52.0d);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test285");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        java.lang.String str11 = line6.toString();
        Line line14 = new Line(10.0d, (double) 10);
        boolean boolean15 = line6.Intersect(line14);
        Line line18 = new Line((double) (short) 100, (double) ' ');
        double double19 = line18.yintercept;
        boolean boolean20 = line6.Intersect(line18);
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        double double24 = line23.slope;
        Line line27 = new Line((double) (byte) 0, (double) 'a');
        line27.slope = 0.0d;
        boolean boolean30 = line23.Intersect(line27);
        double double31 = line27.yintercept;
        line27.yintercept = (-1);
        java.lang.String str34 = line27.toString();
        double double35 = line27.yintercept;
        boolean boolean36 = line18.Intersect(line27);
        line18.yintercept = 100.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str11.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 97.0d + "'", double31 == 97.0d);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str34.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test286");
        Line line2 = new Line(97.0d, (double) (short) 100);
        double double3 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test287");
        Line line2 = new Line(35.0d, (double) 'a');
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test288");
        Line line2 = new Line((double) 100, 0.0d);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        double double10 = line9.slope;
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        line13.slope = 0.0d;
        boolean boolean16 = line9.Intersect(line13);
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        boolean boolean21 = line13.Intersect(line19);
        boolean boolean22 = line5.Intersect(line13);
        double double23 = line5.slope;
        double double24 = line5.slope;
        boolean boolean25 = line2.Intersect(line5);
        double double26 = line5.yintercept;
        line5.yintercept = (-1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 97.0d + "'", double26 == 97.0d);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test289");
        Line line2 = new Line((double) (byte) 0, (double) 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test290");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        double double14 = line13.slope;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        line17.slope = 0.0d;
        boolean boolean20 = line13.Intersect(line17);
        double double21 = line17.yintercept;
        boolean boolean22 = line2.Intersect(line17);
        Line line25 = new Line((double) (byte) 0, (double) 'a');
        line25.slope = (short) 100;
        double double28 = line25.yintercept;
        boolean boolean29 = line17.Intersect(line25);
        java.lang.Class<?> wildcardClass30 = line17.getClass();
        double double31 = line17.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 97.0d + "'", double28 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test291");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        double double16 = line8.yintercept;
        double double17 = line8.slope;
        boolean boolean18 = line2.Intersect(line8);
        line8.slope = (byte) 10;
        Line line23 = new Line((double) 'a', (double) (byte) 10);
        double double24 = line23.slope;
        line23.yintercept = 10.0f;
        double double27 = line23.slope;
        Line line30 = new Line((double) ' ', (double) 1);
        line30.yintercept = 100.0f;
        boolean boolean33 = line23.Intersect(line30);
        double double34 = line23.yintercept;
        boolean boolean35 = line8.Intersect(line23);
        Line line36 = null;
        try {
            boolean boolean37 = line23.Intersect(line36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 97.0d + "'", double27 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test292");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = (short) 100;
        line2.slope = 97.0d;
        line2.yintercept = (-1L);
        java.lang.String str9 = line2.toString();
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        Line line16 = new Line((double) 'a', (double) (byte) 10);
        line16.yintercept = (-1.0f);
        boolean boolean19 = line12.Intersect(line16);
        boolean boolean20 = line2.Intersect(line12);
        java.lang.String str21 = line2.toString();
        double double22 = line2.slope;
        line2.slope = (byte) 1;
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str21.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test293");
        Line line2 = new Line((double) ' ', 100.0d);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        double double10 = line9.slope;
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        line13.slope = 0.0d;
        boolean boolean16 = line9.Intersect(line13);
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        boolean boolean21 = line13.Intersect(line19);
        boolean boolean22 = line5.Intersect(line13);
        line5.slope = 10.0d;
        boolean boolean25 = line2.Intersect(line5);
        line2.slope = 100L;
        double double28 = line2.slope;
        line2.slope = (byte) 100;
        java.lang.Class<?> wildcardClass31 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test294");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        double double3 = line2.yintercept;
        java.lang.String str4 = line2.toString();
        line2.slope = 1;
        line2.slope = 0L;
        java.lang.String str9 = line2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str4.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 0.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str9.equals("slope: 0.0, yintercept: 10.0, epsilon:1.0E-6"));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test295");
        Line line2 = new Line((double) 100, 0.0d);
        double double3 = line2.slope;
        line2.yintercept = 0.0d;
        java.lang.Class<?> wildcardClass6 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test296");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        double double14 = line13.slope;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        line17.slope = 0.0d;
        boolean boolean20 = line13.Intersect(line17);
        double double21 = line17.yintercept;
        boolean boolean22 = line2.Intersect(line17);
        double double23 = line17.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test297");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        double double4 = line2.slope;
        java.lang.String str5 = line2.toString();
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        java.lang.Class<?> wildcardClass16 = line8.getClass();
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        double double27 = line19.yintercept;
        boolean boolean28 = line8.Intersect(line19);
        boolean boolean29 = line2.Intersect(line19);
        line19.slope = (byte) 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str5.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 97.0d + "'", double27 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test298");
        Line line2 = new Line(10.0d, 97.0d);
        double double3 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test299");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        line28.slope = (byte) 10;
        java.lang.String str41 = line28.toString();
        Line line44 = new Line((double) (byte) 0, (double) 'a');
        double double45 = line44.slope;
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        line48.slope = 0.0d;
        boolean boolean51 = line44.Intersect(line48);
        double double52 = line48.yintercept;
        Line line55 = new Line(0.0d, (double) (-1L));
        boolean boolean56 = line48.Intersect(line55);
        Line line59 = new Line((double) 100L, (double) 100);
        java.lang.String str60 = line59.toString();
        boolean boolean61 = line48.Intersect(line59);
        line48.slope = (byte) 1;
        boolean boolean64 = line28.Intersect(line48);
        boolean boolean65 = line10.Intersect(line28);
        double double66 = line28.slope;
        java.lang.String str67 = line28.toString();
        line28.yintercept = '#';
        java.lang.String str70 = line28.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str41.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 97.0d + "'", double52 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str60.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str67.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "slope: 10.0, yintercept: 35.0, epsilon:1.0E-6" + "'", str70.equals("slope: 10.0, yintercept: 35.0, epsilon:1.0E-6"));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test300");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        double double16 = line8.yintercept;
        double double17 = line8.slope;
        boolean boolean18 = line2.Intersect(line8);
        line8.slope = (byte) 10;
        java.lang.String str21 = line8.toString();
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        double double25 = line24.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        line28.slope = 0.0d;
        boolean boolean31 = line24.Intersect(line28);
        double double32 = line28.yintercept;
        Line line35 = new Line(0.0d, (double) (-1L));
        boolean boolean36 = line28.Intersect(line35);
        Line line39 = new Line((double) 100L, (double) 100);
        java.lang.String str40 = line39.toString();
        boolean boolean41 = line28.Intersect(line39);
        line28.slope = (byte) 1;
        boolean boolean44 = line8.Intersect(line28);
        line8.yintercept = 52.0d;
        Line line49 = new Line((double) (byte) 0, (double) 'a');
        double double50 = line49.slope;
        Line line53 = new Line((double) (byte) 0, (double) 'a');
        double double54 = line53.slope;
        Line line57 = new Line((double) (byte) 0, (double) 'a');
        line57.slope = 0.0d;
        boolean boolean60 = line53.Intersect(line57);
        Line line63 = new Line((double) (byte) 0, (double) 'a');
        double double64 = line63.slope;
        boolean boolean65 = line57.Intersect(line63);
        boolean boolean66 = line49.Intersect(line57);
        Line line69 = new Line((double) 10L, (double) ' ');
        line69.slope = 1L;
        double double72 = line69.slope;
        Line line75 = new Line((double) (byte) 0, (double) 'a');
        double double76 = line75.slope;
        Line line79 = new Line((double) (byte) 0, (double) 'a');
        line79.slope = 0.0d;
        boolean boolean82 = line75.Intersect(line79);
        double double83 = line75.yintercept;
        double double84 = line75.slope;
        boolean boolean85 = line69.Intersect(line75);
        boolean boolean86 = line49.Intersect(line75);
        line75.yintercept = 'a';
        line75.slope = '#';
        java.lang.String str91 = line75.toString();
        boolean boolean92 = line8.Intersect(line75);
        line75.yintercept = 1.0f;
        line75.slope = (byte) 100;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str40.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 97.0d + "'", double83 == 97.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "slope: 35.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str91.equals("slope: 35.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test301");
        Line line2 = new Line((double) (short) 1, (-1.0d));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test302");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        java.lang.String str11 = line6.toString();
        Line line14 = new Line(10.0d, (double) 10);
        boolean boolean15 = line6.Intersect(line14);
        Line line18 = new Line(97.0d, (double) (short) -1);
        java.lang.String str19 = line18.toString();
        boolean boolean20 = line6.Intersect(line18);
        line18.slope = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str11.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str19.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test303");
        Line line2 = new Line((double) 100L, (double) (short) -1);
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        java.lang.String str5 = line2.toString();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 100.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str5.equals("slope: 100.0, yintercept: -1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test304");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        java.lang.String str14 = line2.toString();
        line2.slope = 10.0d;
        java.lang.String str17 = line2.toString();
        double double18 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str14.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str17.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test305");
        Line line2 = new Line(52.0d, 10.0d);
        java.lang.String str3 = line2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 52.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str3.equals("slope: 52.0, yintercept: 10.0, epsilon:1.0E-6"));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test306");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        double double4 = line2.slope;
        line2.yintercept = (short) 1;
        java.lang.Class<?> wildcardClass7 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test307");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        double double18 = line17.slope;
        Line line21 = new Line((double) (byte) 0, (double) 'a');
        double double22 = line21.slope;
        Line line25 = new Line((double) (byte) 0, (double) 'a');
        line25.slope = 0.0d;
        boolean boolean28 = line21.Intersect(line25);
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        boolean boolean33 = line25.Intersect(line31);
        boolean boolean34 = line17.Intersect(line25);
        line25.slope = 0L;
        line25.yintercept = (-1L);
        boolean boolean39 = line6.Intersect(line25);
        java.lang.String str40 = line6.toString();
        line6.slope = (byte) 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str40.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test308");
        Line line2 = new Line((double) '#', (double) 0);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        line9.slope = 0.0d;
        boolean boolean12 = line5.Intersect(line9);
        double double13 = line9.yintercept;
        Line line16 = new Line(0.0d, (double) (-1L));
        boolean boolean17 = line9.Intersect(line16);
        Line line20 = new Line((double) 100L, (double) 100);
        java.lang.String str21 = line20.toString();
        boolean boolean22 = line9.Intersect(line20);
        double double23 = line9.yintercept;
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        double double27 = line26.slope;
        Line line30 = new Line((double) (byte) 0, (double) 'a');
        line30.slope = 0.0d;
        boolean boolean33 = line26.Intersect(line30);
        java.lang.Class<?> wildcardClass34 = line26.getClass();
        Line line37 = new Line((double) (byte) 0, (double) 'a');
        double double38 = line37.slope;
        Line line41 = new Line((double) (byte) 0, (double) 'a');
        line41.slope = 0.0d;
        boolean boolean44 = line37.Intersect(line41);
        double double45 = line41.yintercept;
        boolean boolean46 = line26.Intersect(line41);
        line41.slope = '#';
        line41.slope = (short) 10;
        line41.slope = 0;
        java.lang.String str53 = line41.toString();
        boolean boolean54 = line9.Intersect(line41);
        Line line57 = new Line((double) (byte) 0, (double) 'a');
        double double58 = line57.slope;
        Line line61 = new Line((double) (byte) 0, (double) 'a');
        line61.slope = 0.0d;
        boolean boolean64 = line57.Intersect(line61);
        Line line67 = new Line((double) ' ', (double) '4');
        boolean boolean68 = line57.Intersect(line67);
        double double69 = line67.yintercept;
        line67.yintercept = 100;
        java.lang.String str72 = line67.toString();
        Line line75 = new Line((double) (byte) 0, (double) 'a');
        double double76 = line75.slope;
        java.lang.Class<?> wildcardClass77 = line75.getClass();
        Line line80 = new Line((double) (byte) 0, (double) 'a');
        double double81 = line80.slope;
        Line line84 = new Line((double) (byte) 0, (double) 'a');
        line84.slope = 0.0d;
        boolean boolean87 = line80.Intersect(line84);
        double double88 = line84.yintercept;
        Line line91 = new Line(0.0d, (double) (-1L));
        boolean boolean92 = line84.Intersect(line91);
        double double93 = line91.slope;
        boolean boolean94 = line75.Intersect(line91);
        boolean boolean95 = line67.Intersect(line75);
        boolean boolean96 = line41.Intersect(line67);
        boolean boolean97 = line2.Intersect(line67);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str21.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 97.0d + "'", double23 == 97.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 97.0d + "'", double45 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str53.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 52.0d + "'", double69 == 52.0d);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str72.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 97.0d + "'", double88 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test309");
        Line line2 = new Line((double) 100.0f, 100.0d);
        Line line5 = new Line((double) (short) -1, 32.0d);
        boolean boolean6 = line2.Intersect(line5);
        line5.yintercept = 1.0f;
        line5.slope = (-1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test310");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = (short) 100;
        line2.slope = 97.0d;
        line2.yintercept = (-1L);
        java.lang.String str9 = line2.toString();
        double double10 = line2.yintercept;
        line2.yintercept = (byte) 100;
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        double double16 = line15.slope;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        line19.slope = 0.0d;
        boolean boolean22 = line15.Intersect(line19);
        Line line25 = new Line((double) (byte) 0, (double) 'a');
        double double26 = line25.slope;
        boolean boolean27 = line19.Intersect(line25);
        line25.yintercept = 0.0d;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        Line line36 = new Line((double) (byte) 0, (double) 'a');
        line36.slope = 0.0d;
        boolean boolean39 = line32.Intersect(line36);
        boolean boolean40 = line25.Intersect(line36);
        java.lang.Class<?> wildcardClass41 = line36.getClass();
        Line line44 = new Line((double) (byte) 0, (double) 'a');
        double double45 = line44.slope;
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        line48.slope = 0.0d;
        boolean boolean51 = line44.Intersect(line48);
        double double52 = line48.yintercept;
        Line line55 = new Line(0.0d, (double) (-1L));
        boolean boolean56 = line48.Intersect(line55);
        java.lang.Class<?> wildcardClass57 = line48.getClass();
        boolean boolean58 = line36.Intersect(line48);
        Line line61 = new Line((double) (byte) 0, (double) 'a');
        double double62 = line61.slope;
        Line line65 = new Line((double) (byte) 0, (double) 'a');
        line65.slope = 0.0d;
        boolean boolean68 = line61.Intersect(line65);
        double double69 = line65.yintercept;
        Line line72 = new Line(0.0d, (double) (-1L));
        boolean boolean73 = line65.Intersect(line72);
        double double74 = line65.slope;
        java.lang.String str75 = line65.toString();
        boolean boolean76 = line36.Intersect(line65);
        line36.slope = ' ';
        boolean boolean79 = line2.Intersect(line36);
        double double80 = line2.slope;
        double double81 = line2.slope;
        double double82 = line2.slope;
        double double83 = line2.slope;
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 97.0d + "'", double52 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 97.0d + "'", double69 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str75.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 97.0d + "'", double80 == 97.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 97.0d + "'", double81 == 97.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 97.0d + "'", double82 == 97.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 97.0d + "'", double83 == 97.0d);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test311");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        Line line42 = new Line((double) ' ', (double) 1);
        boolean boolean43 = line2.Intersect(line42);
        java.lang.String str44 = line2.toString();
        double double45 = line2.slope;
        double double46 = line2.yintercept;
        double double47 = line2.yintercept;
        double double48 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str44.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 97.0d + "'", double46 == 97.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 97.0d + "'", double47 == 97.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 97.0d + "'", double48 == 97.0d);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test312");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 0.0d;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        boolean boolean27 = line12.Intersect(line23);
        java.lang.String str28 = line12.toString();
        double double29 = line12.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "slope: 0.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str28.equals("slope: 0.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test313");
        Line line2 = new Line((double) (byte) 1, 1.0d);
        line2.slope = 10.0f;
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        double double6 = line2.slope;
        line2.yintercept = '4';
        java.lang.Class<?> wildcardClass9 = line2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test314");
        Line line2 = new Line((double) 'a', (double) (short) -1);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test315");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        double double14 = line13.slope;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        line17.slope = 0.0d;
        boolean boolean20 = line13.Intersect(line17);
        double double21 = line17.yintercept;
        boolean boolean22 = line2.Intersect(line17);
        java.lang.String str23 = line2.toString();
        line2.yintercept = 100L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str23.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test316");
        Line line2 = new Line(0.0d, 52.0d);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test317");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        double double15 = line6.slope;
        java.lang.String str16 = line6.toString();
        Line line19 = new Line((double) 10L, (double) ' ');
        boolean boolean20 = line6.Intersect(line19);
        java.lang.Class<?> wildcardClass21 = line19.getClass();
        double double22 = line19.slope;
        double double23 = line19.slope;
        java.lang.Class<?> wildcardClass24 = line19.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test318");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 0.0d;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        boolean boolean27 = line12.Intersect(line23);
        java.lang.Class<?> wildcardClass28 = line23.getClass();
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        double double39 = line35.yintercept;
        Line line42 = new Line(0.0d, (double) (-1L));
        boolean boolean43 = line35.Intersect(line42);
        java.lang.Class<?> wildcardClass44 = line35.getClass();
        boolean boolean45 = line23.Intersect(line35);
        java.lang.String str46 = line35.toString();
        java.lang.String str47 = line35.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str46.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str47.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test319");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        double double15 = line6.slope;
        double double16 = line6.yintercept;
        double double17 = line6.yintercept;
        java.lang.Class<?> wildcardClass18 = line6.getClass();
        line6.yintercept = 0.0d;
        java.lang.Class<?> wildcardClass21 = line6.getClass();
        double double22 = line6.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test320");
        Line line2 = new Line((-1.0d), 10.0d);
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        double double14 = line10.yintercept;
        Line line17 = new Line(0.0d, (double) (-1L));
        boolean boolean18 = line10.Intersect(line17);
        Line line21 = new Line((double) (byte) 0, (double) 'a');
        double double22 = line21.slope;
        Line line25 = new Line((double) (byte) 0, (double) 'a');
        double double26 = line25.slope;
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        line29.slope = 0.0d;
        boolean boolean32 = line25.Intersect(line29);
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        double double36 = line35.slope;
        boolean boolean37 = line29.Intersect(line35);
        boolean boolean38 = line21.Intersect(line29);
        line29.slope = 0L;
        line29.yintercept = (-1L);
        boolean boolean43 = line10.Intersect(line29);
        line10.yintercept = 1L;
        boolean boolean46 = line2.Intersect(line10);
        line10.yintercept = 97.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test321");
        Line line2 = new Line((-1.0d), 10.0d);
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        double double4 = line2.slope;
        line2.slope = 1.0d;
        line2.slope = '4';
        double double9 = line2.slope;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test322");
        Line line2 = new Line(0.0d, 1.0d);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test323");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        Line line17 = new Line((double) 100L, (double) 100);
        java.lang.String str18 = line17.toString();
        boolean boolean19 = line6.Intersect(line17);
        line17.yintercept = (short) 1;
        double double22 = line17.yintercept;
        Line line25 = new Line((double) (byte) 0, (double) 'a');
        double double26 = line25.slope;
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        Line line33 = new Line((double) (byte) 0, (double) 'a');
        line33.slope = 0.0d;
        boolean boolean36 = line29.Intersect(line33);
        Line line39 = new Line((double) (byte) 0, (double) 'a');
        double double40 = line39.slope;
        boolean boolean41 = line33.Intersect(line39);
        boolean boolean42 = line25.Intersect(line33);
        Line line45 = new Line((double) 10L, (double) ' ');
        line45.slope = 1L;
        double double48 = line45.slope;
        Line line51 = new Line((double) (byte) 0, (double) 'a');
        double double52 = line51.slope;
        Line line55 = new Line((double) (byte) 0, (double) 'a');
        line55.slope = 0.0d;
        boolean boolean58 = line51.Intersect(line55);
        double double59 = line51.yintercept;
        double double60 = line51.slope;
        boolean boolean61 = line45.Intersect(line51);
        boolean boolean62 = line25.Intersect(line51);
        double double63 = line51.yintercept;
        line51.yintercept = 0L;
        double double66 = line51.yintercept;
        java.lang.Class<?> wildcardClass67 = line51.getClass();
        boolean boolean68 = line17.Intersect(line51);
        line17.yintercept = (byte) 10;
        java.lang.String str71 = line17.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str18.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 97.0d + "'", double59 == 97.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 97.0d + "'", double63 == 97.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "slope: 100.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str71.equals("slope: 100.0, yintercept: 10.0, epsilon:1.0E-6"));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test324");
        Line line2 = new Line((double) 'a', 1.0d);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        line9.slope = 0.0d;
        boolean boolean12 = line5.Intersect(line9);
        double double13 = line9.yintercept;
        Line line16 = new Line(0.0d, (double) (-1L));
        boolean boolean17 = line9.Intersect(line16);
        java.lang.Class<?> wildcardClass18 = line16.getClass();
        double double19 = line16.yintercept;
        double double20 = line16.slope;
        Line line23 = new Line((double) 0, 35.0d);
        java.lang.String str24 = line23.toString();
        boolean boolean25 = line16.Intersect(line23);
        boolean boolean26 = line2.Intersect(line23);
        double double27 = line2.slope;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "slope: 0.0, yintercept: 35.0, epsilon:1.0E-6" + "'", str24.equals("slope: 0.0, yintercept: 35.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 97.0d + "'", double27 == 97.0d);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test325");
        Line line2 = new Line(0.0d, (double) '#');
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test326");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        double double15 = line6.slope;
        java.lang.String str16 = line6.toString();
        java.lang.Class<?> wildcardClass17 = line6.getClass();
        line6.yintercept = (byte) 1;
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        double double23 = line22.slope;
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        line26.slope = 0.0d;
        boolean boolean29 = line22.Intersect(line26);
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        boolean boolean34 = line26.Intersect(line32);
        line32.yintercept = 0.0d;
        line32.slope = 100.0f;
        line32.yintercept = 100;
        Line line43 = new Line((double) 'a', (double) (byte) -1);
        Line line46 = new Line(10.0d, (double) 0L);
        Line line49 = new Line((double) 'a', (double) (byte) 10);
        line49.yintercept = (-1.0f);
        boolean boolean52 = line46.Intersect(line49);
        java.lang.Class<?> wildcardClass53 = line49.getClass();
        java.lang.Class<?> wildcardClass54 = line49.getClass();
        boolean boolean55 = line43.Intersect(line49);
        boolean boolean56 = line32.Intersect(line49);
        boolean boolean57 = line6.Intersect(line32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test327");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        line2.slope = 0.0d;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean8 = line2.Intersect(line7);
        line2.yintercept = (byte) 1;
        double double11 = line2.slope;
        double double12 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test328");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        Line line7 = new Line((double) 'a', (double) (byte) 10);
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        double double11 = line10.slope;
        Line line14 = new Line((double) (byte) 0, (double) 'a');
        line14.slope = 0.0d;
        boolean boolean17 = line10.Intersect(line14);
        Line line20 = new Line((double) (byte) 0, (double) 'a');
        double double21 = line20.slope;
        boolean boolean22 = line14.Intersect(line20);
        boolean boolean23 = line7.Intersect(line20);
        double double24 = line20.yintercept;
        boolean boolean25 = line2.Intersect(line20);
        line2.yintercept = 0.0f;
        double double28 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test329");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        java.lang.String str5 = line2.toString();
        line2.yintercept = ' ';
        java.lang.Class<?> wildcardClass8 = line2.getClass();
        double double9 = line2.yintercept;
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str5.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test330");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) 'a', (double) (byte) 10);
        line6.yintercept = (-1.0f);
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line2.yintercept;
        java.lang.String str11 = line2.toString();
        line2.yintercept = 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str11.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test331");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        line2.slope = 0.0d;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean8 = line2.Intersect(line7);
        line7.slope = (short) 1;
        double double11 = line7.slope;
        java.lang.String str12 = line7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "slope: 1.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str12.equals("slope: 1.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test332");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.slope = 97.0d;
        double double17 = line12.slope;
        java.lang.String str18 = line12.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 97.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str18.equals("slope: 97.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test333");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        java.lang.Class<?> wildcardClass8 = line6.getClass();
        double double9 = line6.yintercept;
        boolean boolean10 = line2.Intersect(line6);
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        double double14 = line13.slope;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        line17.slope = 0.0d;
        boolean boolean20 = line13.Intersect(line17);
        java.lang.Class<?> wildcardClass21 = line13.getClass();
        line13.yintercept = (byte) -1;
        boolean boolean24 = line6.Intersect(line13);
        Line line27 = new Line(10.0d, (double) 10);
        line27.slope = 100L;
        line27.yintercept = (short) 1;
        boolean boolean32 = line13.Intersect(line27);
        Line line35 = new Line((double) 100.0f, 100.0d);
        Line line38 = new Line((double) (short) -1, 32.0d);
        boolean boolean39 = line35.Intersect(line38);
        java.lang.String str40 = line38.toString();
        boolean boolean41 = line27.Intersect(line38);
        line38.slope = 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: -1.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str40.equals("slope: -1.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test334");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        line28.slope = (byte) 10;
        java.lang.String str41 = line28.toString();
        Line line44 = new Line((double) (byte) 0, (double) 'a');
        double double45 = line44.slope;
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        line48.slope = 0.0d;
        boolean boolean51 = line44.Intersect(line48);
        double double52 = line48.yintercept;
        Line line55 = new Line(0.0d, (double) (-1L));
        boolean boolean56 = line48.Intersect(line55);
        Line line59 = new Line((double) 100L, (double) 100);
        java.lang.String str60 = line59.toString();
        boolean boolean61 = line48.Intersect(line59);
        line48.slope = (byte) 1;
        boolean boolean64 = line28.Intersect(line48);
        boolean boolean65 = line10.Intersect(line28);
        double double66 = line28.slope;
        double double67 = line28.slope;
        java.lang.String str68 = line28.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str41.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 97.0d + "'", double52 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str60.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str68.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test335");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        Line line42 = new Line((double) ' ', (double) 1);
        boolean boolean43 = line2.Intersect(line42);
        double double44 = line2.yintercept;
        line2.slope = (-1.0d);
        line2.slope = ' ';
        java.lang.String str49 = line2.toString();
        line2.slope = 10.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 97.0d + "'", double44 == 97.0d);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "slope: 32.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str49.equals("slope: 32.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test336");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = 100.0f;
        line2.yintercept = (-1L);
        Line line9 = new Line((double) ' ', 100.0d);
        boolean boolean10 = line2.Intersect(line9);
        java.lang.Class<?> wildcardClass11 = line9.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test337");
        Line line2 = new Line(10.0d, (double) 0L);
        Line line5 = new Line((double) 'a', (double) (byte) 10);
        line5.yintercept = (-1.0f);
        boolean boolean8 = line2.Intersect(line5);
        java.lang.Class<?> wildcardClass9 = line5.getClass();
        double double10 = line5.yintercept;
        java.lang.String str11 = line5.toString();
        double double12 = line5.slope;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str11.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test338");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        double double15 = line6.yintercept;
        line6.slope = 1.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test339");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        double double16 = line8.yintercept;
        double double17 = line8.slope;
        boolean boolean18 = line2.Intersect(line8);
        line8.slope = (byte) 10;
        double double21 = line8.slope;
        Line line24 = new Line((double) (short) -1, 32.0d);
        boolean boolean25 = line8.Intersect(line24);
        java.lang.Class<?> wildcardClass26 = line24.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test340");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = (short) 100;
        line2.slope = 97.0d;
        line2.yintercept = (-1L);
        java.lang.String str9 = line2.toString();
        double double10 = line2.yintercept;
        line2.yintercept = (byte) 100;
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        double double16 = line15.slope;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        line19.slope = 0.0d;
        boolean boolean22 = line15.Intersect(line19);
        Line line25 = new Line((double) (byte) 0, (double) 'a');
        double double26 = line25.slope;
        boolean boolean27 = line19.Intersect(line25);
        line25.yintercept = 0.0d;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        Line line36 = new Line((double) (byte) 0, (double) 'a');
        line36.slope = 0.0d;
        boolean boolean39 = line32.Intersect(line36);
        boolean boolean40 = line25.Intersect(line36);
        java.lang.Class<?> wildcardClass41 = line36.getClass();
        Line line44 = new Line((double) (byte) 0, (double) 'a');
        double double45 = line44.slope;
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        line48.slope = 0.0d;
        boolean boolean51 = line44.Intersect(line48);
        double double52 = line48.yintercept;
        Line line55 = new Line(0.0d, (double) (-1L));
        boolean boolean56 = line48.Intersect(line55);
        java.lang.Class<?> wildcardClass57 = line48.getClass();
        boolean boolean58 = line36.Intersect(line48);
        Line line61 = new Line((double) (byte) 0, (double) 'a');
        double double62 = line61.slope;
        Line line65 = new Line((double) (byte) 0, (double) 'a');
        line65.slope = 0.0d;
        boolean boolean68 = line61.Intersect(line65);
        double double69 = line65.yintercept;
        Line line72 = new Line(0.0d, (double) (-1L));
        boolean boolean73 = line65.Intersect(line72);
        double double74 = line65.slope;
        java.lang.String str75 = line65.toString();
        boolean boolean76 = line36.Intersect(line65);
        line36.slope = ' ';
        boolean boolean79 = line2.Intersect(line36);
        java.lang.String str80 = line2.toString();
        line2.slope = (byte) -1;
        double double83 = line2.yintercept;
        line2.yintercept = (byte) 10;
        line2.yintercept = 0.0d;
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 97.0d + "'", double52 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 97.0d + "'", double69 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str75.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "slope: 97.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str80.equals("slope: 97.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 100.0d + "'", double83 == 100.0d);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test341");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) 'a', (double) (byte) 10);
        line6.yintercept = (-1.0f);
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        double double11 = line2.yintercept;
        Line line14 = new Line((double) ' ', (double) 1);
        line14.slope = 'a';
        double double17 = line14.yintercept;
        java.lang.Class<?> wildcardClass18 = line14.getClass();
        Line line21 = new Line((double) (byte) 0, (double) 'a');
        double double22 = line21.slope;
        Line line25 = new Line((double) (byte) 0, (double) 'a');
        line25.slope = 0.0d;
        boolean boolean28 = line21.Intersect(line25);
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        boolean boolean33 = line25.Intersect(line31);
        line31.yintercept = 0.0d;
        Line line38 = new Line((double) (byte) 0, (double) 'a');
        double double39 = line38.slope;
        Line line42 = new Line((double) (byte) 0, (double) 'a');
        line42.slope = 0.0d;
        boolean boolean45 = line38.Intersect(line42);
        boolean boolean46 = line31.Intersect(line42);
        java.lang.Class<?> wildcardClass47 = line42.getClass();
        double double48 = line42.slope;
        boolean boolean49 = line14.Intersect(line42);
        boolean boolean50 = line2.Intersect(line42);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test342");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        double double14 = line13.slope;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        line17.slope = 0.0d;
        boolean boolean20 = line13.Intersect(line17);
        double double21 = line13.yintercept;
        boolean boolean22 = line2.Intersect(line13);
        line2.slope = 0;
        double double25 = line2.yintercept;
        java.lang.String str26 = line2.toString();
        java.lang.Class<?> wildcardClass27 = line2.getClass();
        double double28 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str26.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test343");
        Line line2 = new Line((double) (-1), (double) 0);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        double double10 = line9.slope;
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        line13.slope = 0.0d;
        boolean boolean16 = line9.Intersect(line13);
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        boolean boolean21 = line13.Intersect(line19);
        boolean boolean22 = line5.Intersect(line13);
        Line line25 = new Line((double) 10L, (double) ' ');
        line25.slope = 1L;
        double double28 = line25.slope;
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        double double39 = line31.yintercept;
        double double40 = line31.slope;
        boolean boolean41 = line25.Intersect(line31);
        boolean boolean42 = line5.Intersect(line31);
        Line line45 = new Line((double) ' ', (double) 1);
        boolean boolean46 = line5.Intersect(line45);
        boolean boolean47 = line2.Intersect(line45);
        Line line50 = new Line((double) ' ', 100.0d);
        Line line53 = new Line((double) (byte) 0, (double) 'a');
        double double54 = line53.slope;
        Line line57 = new Line((double) (byte) 0, (double) 'a');
        double double58 = line57.slope;
        Line line61 = new Line((double) (byte) 0, (double) 'a');
        line61.slope = 0.0d;
        boolean boolean64 = line57.Intersect(line61);
        Line line67 = new Line((double) (byte) 0, (double) 'a');
        double double68 = line67.slope;
        boolean boolean69 = line61.Intersect(line67);
        boolean boolean70 = line53.Intersect(line61);
        line53.slope = 10.0d;
        boolean boolean73 = line50.Intersect(line53);
        double double74 = line50.yintercept;
        boolean boolean75 = line45.Intersect(line50);
        line45.slope = 52.0d;
        java.lang.Class<?> wildcardClass78 = line45.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 100.0d + "'", double74 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test344");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 0.0d;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        boolean boolean27 = line12.Intersect(line23);
        java.lang.Class<?> wildcardClass28 = line23.getClass();
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        double double39 = line35.yintercept;
        Line line42 = new Line(0.0d, (double) (-1L));
        boolean boolean43 = line35.Intersect(line42);
        java.lang.Class<?> wildcardClass44 = line35.getClass();
        boolean boolean45 = line23.Intersect(line35);
        java.lang.String str46 = line23.toString();
        java.lang.Class<?> wildcardClass47 = line23.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str46.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test345");
        Line line2 = new Line((double) (-1L), (double) '#');
        Line line5 = new Line((double) 0, (-1.0d));
        boolean boolean6 = line2.Intersect(line5);
        double double7 = line5.slope;
        java.lang.Class<?> wildcardClass8 = line5.getClass();
        Line line11 = new Line((double) 100L, 97.0d);
        line11.slope = 32.0d;
        line11.yintercept = 100.0d;
        boolean boolean16 = line5.Intersect(line11);
        line5.slope = 10L;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test346");
        Line line2 = new Line((-1.0d), 10.0d);
        double double3 = line2.yintercept;
        double double4 = line2.slope;
        double double5 = line2.slope;
        java.lang.Class<?> wildcardClass6 = line2.getClass();
        line2.slope = (byte) 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test347");
        Line line2 = new Line((double) 100L, 97.0d);
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        Line line6 = new Line(97.0d, (double) ' ');
        double double7 = line6.yintercept;
        double double8 = line6.yintercept;
        java.lang.String str9 = line6.toString();
        boolean boolean10 = line2.Intersect(line6);
        line6.yintercept = ' ';
        line6.yintercept = 35.0d;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test348");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        line2.slope = (short) 100;
        double double5 = line2.yintercept;
        line2.yintercept = 1L;
        double double8 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test349");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        Line line42 = new Line((double) ' ', (double) 1);
        boolean boolean43 = line2.Intersect(line42);
        double double44 = line2.yintercept;
        line2.slope = (-1.0d);
        line2.slope = (byte) 10;
        line2.slope = (byte) -1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 97.0d + "'", double44 == 97.0d);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test350");
        Line line2 = new Line((double) 100L, 97.0d);
        line2.slope = 32.0d;
        line2.slope = '4';
        Line line9 = new Line((double) 100L, 97.0d);
        line9.slope = 32.0d;
        line9.yintercept = 100.0d;
        double double14 = line9.yintercept;
        java.lang.String str15 = line9.toString();
        boolean boolean16 = line2.Intersect(line9);
        double double17 = line2.yintercept;
        double double18 = line2.yintercept;
        line2.slope = ' ';
        double double21 = line2.slope;
        Line line24 = new Line(10.0d, (double) 0L);
        Line line27 = new Line((double) 'a', (double) (byte) 10);
        line27.yintercept = (-1.0f);
        boolean boolean30 = line24.Intersect(line27);
        java.lang.Class<?> wildcardClass31 = line27.getClass();
        java.lang.Class<?> wildcardClass32 = line27.getClass();
        boolean boolean33 = line2.Intersect(line27);
        double double34 = line2.slope;
        java.lang.String str35 = line2.toString();
        java.lang.Class<?> wildcardClass36 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str15.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 32.0d + "'", double21 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 32.0d + "'", double34 == 32.0d);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "slope: 32.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str35.equals("slope: 32.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test351");
        Line line2 = new Line((double) 1.0f, (double) 0.0f);
        double double3 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test352");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = (short) 100;
        line2.slope = 97.0d;
        line2.yintercept = (-1L);
        java.lang.String str9 = line2.toString();
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        Line line16 = new Line((double) 'a', (double) (byte) 10);
        line16.yintercept = (-1.0f);
        boolean boolean19 = line12.Intersect(line16);
        boolean boolean20 = line2.Intersect(line12);
        java.lang.Class<?> wildcardClass21 = line12.getClass();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test353");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        double double4 = line2.slope;
        java.lang.String str5 = line2.toString();
        java.lang.String str6 = line2.toString();
        double double7 = line2.slope;
        line2.yintercept = (-1.0f);
        java.lang.String str10 = line2.toString();
        java.lang.Class<?> wildcardClass11 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str5.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str6.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str10.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test354");
        Line line2 = new Line((double) (byte) 10, (double) (short) -1);
        java.lang.String str3 = line2.toString();
        java.lang.String str4 = line2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 10.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str3.equals("slope: 10.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "slope: 10.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str4.equals("slope: 10.0, yintercept: -1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test355");
        Line line2 = new Line((double) (short) 100, 0.0d);
        java.lang.String str3 = line2.toString();
        double double4 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 100.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str3.equals("slope: 100.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test356");
        Line line2 = new Line((double) (short) 100, (double) ' ');
        double double3 = line2.yintercept;
        java.lang.String str4 = line2.toString();
        Line line7 = new Line((double) 100.0f, 100.0d);
        Line line10 = new Line((double) (short) -1, 32.0d);
        boolean boolean11 = line7.Intersect(line10);
        line10.yintercept = 1.0f;
        boolean boolean14 = line2.Intersect(line10);
        java.lang.String str15 = line2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "slope: 100.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str4.equals("slope: 100.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "slope: 100.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str15.equals("slope: 100.0, yintercept: 32.0, epsilon:1.0E-6"));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test357");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.String str15 = line6.toString();
        double double16 = line6.slope;
        double double17 = line6.yintercept;
        java.lang.String str18 = line6.toString();
        line6.slope = (short) -1;
        java.lang.String str21 = line6.toString();
        java.lang.Class<?> wildcardClass22 = line6.getClass();
        line6.slope = 1.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str15.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str18.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: -1.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: -1.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test358");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        double double16 = line8.yintercept;
        double double17 = line8.slope;
        boolean boolean18 = line2.Intersect(line8);
        java.lang.String str19 = line8.toString();
        line8.slope = (short) 100;
        java.lang.String str22 = line8.toString();
        double double23 = line8.slope;
        Line line26 = new Line((double) 0.0f, (double) (short) 1);
        java.lang.String str27 = line26.toString();
        Line line30 = new Line((double) 0.0f, (double) 1);
        line30.slope = 97.0d;
        double double33 = line30.slope;
        boolean boolean34 = line26.Intersect(line30);
        java.lang.String str35 = line30.toString();
        boolean boolean36 = line8.Intersect(line30);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str19.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "slope: 100.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str22.equals("slope: 100.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "slope: 0.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str27.equals("slope: 0.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 97.0d + "'", double33 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "slope: 97.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str35.equals("slope: 97.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test359");
        Line line2 = new Line(35.0d, 0.0d);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test360");
        Line line2 = new Line(10.0d, (double) (-1L));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test361");
        Line line2 = new Line((double) 100L, 97.0d);
        java.lang.String str3 = line2.toString();
        double double4 = line2.slope;
        line2.yintercept = (short) 1;
        double double7 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 100.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str3.equals("slope: 100.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test362");
        Line line2 = new Line((double) ' ', (double) '4');
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        double double4 = line2.yintercept;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        double double8 = line7.slope;
        double double9 = line7.slope;
        java.lang.String str10 = line7.toString();
        java.lang.String str11 = line7.toString();
        double double12 = line7.slope;
        line7.yintercept = 10;
        boolean boolean15 = line2.Intersect(line7);
        Line line18 = new Line((double) (byte) 1, (double) 1L);
        boolean boolean19 = line2.Intersect(line18);
        java.lang.Class<?> wildcardClass20 = line2.getClass();
        double double21 = line2.slope;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str10.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str11.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 32.0d + "'", double21 == 32.0d);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test363");
        Line line2 = new Line(0.0d, (double) (-1));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test364");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = (short) 100;
        line2.slope = 97.0d;
        line2.yintercept = (-1L);
        java.lang.String str9 = line2.toString();
        double double10 = line2.yintercept;
        line2.yintercept = (byte) 100;
        line2.yintercept = 1.0d;
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test365");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        double double4 = line2.slope;
        double double5 = line2.slope;
        double double6 = line2.slope;
        java.lang.String str7 = line2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str7.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test366");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        java.lang.String str14 = line2.toString();
        line2.slope = 10.0d;
        java.lang.String str17 = line2.toString();
        java.lang.Class<?> wildcardClass18 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str14.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str17.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test367");
        Line line2 = new Line((double) 100.0f, (double) (short) 10);
        double double3 = line2.slope;
        double double4 = line2.slope;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        double double8 = line7.slope;
        Line line11 = new Line((double) (byte) 0, (double) 'a');
        double double12 = line11.slope;
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        line15.slope = 0.0d;
        boolean boolean18 = line11.Intersect(line15);
        Line line21 = new Line((double) (byte) 0, (double) 'a');
        double double22 = line21.slope;
        boolean boolean23 = line15.Intersect(line21);
        boolean boolean24 = line7.Intersect(line15);
        Line line27 = new Line((double) (byte) 0, (double) 'a');
        double double28 = line27.slope;
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        line31.slope = 0.0d;
        boolean boolean34 = line27.Intersect(line31);
        Line line37 = new Line((double) (byte) 0, (double) 'a');
        double double38 = line37.slope;
        boolean boolean39 = line31.Intersect(line37);
        line37.yintercept = 0.0d;
        Line line44 = new Line((double) (byte) 0, (double) 'a');
        double double45 = line44.slope;
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        line48.slope = 0.0d;
        boolean boolean51 = line44.Intersect(line48);
        boolean boolean52 = line37.Intersect(line48);
        boolean boolean53 = line15.Intersect(line48);
        boolean boolean54 = line2.Intersect(line48);
        java.lang.Class<?> wildcardClass55 = line48.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test368");
        Line line2 = new Line((double) 100, (double) (byte) 1);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test369");
        Line line2 = new Line((double) 10L, (double) ' ');
        java.lang.String str3 = line2.toString();
        double double4 = line2.yintercept;
        double double5 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 10.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str3.equals("slope: 10.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test370");
        Line line2 = new Line(35.0d, 35.0d);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test371");
        Line line2 = new Line((double) 0.0f, (double) (short) 1);
        java.lang.String str3 = line2.toString();
        Line line6 = new Line((double) 0.0f, (double) 1);
        line6.slope = 97.0d;
        double double9 = line6.slope;
        boolean boolean10 = line2.Intersect(line6);
        double double11 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 0.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str3.equals("slope: 0.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test372");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        java.lang.String str16 = line6.toString();
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        boolean boolean31 = line23.Intersect(line29);
        java.lang.Class<?> wildcardClass32 = line23.getClass();
        java.lang.String str33 = line23.toString();
        boolean boolean34 = line6.Intersect(line23);
        line23.slope = 97.0d;
        double double37 = line23.slope;
        java.lang.String str38 = line23.toString();
        double double39 = line23.slope;
        java.lang.Class<?> wildcardClass40 = line23.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 97.0d + "'", double37 == 97.0d);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "slope: 97.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str38.equals("slope: 97.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test373");
        Line line2 = new Line((double) '#', (double) (byte) -1);
        line2.yintercept = 52.0d;
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test374");
        Line line2 = new Line((double) '4', 97.0d);
        double double3 = line2.slope;
        double double4 = line2.yintercept;
        line2.slope = 35.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test375");
        Line line2 = new Line(97.0d, (double) (short) -1);
        line2.slope = (-1.0f);
        line2.slope = 10.0d;
        line2.slope = (-1L);
        double double9 = line2.slope;
        double double10 = line2.yintercept;
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        double double14 = line13.slope;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        line17.slope = 0.0d;
        boolean boolean20 = line13.Intersect(line17);
        java.lang.Class<?> wildcardClass21 = line13.getClass();
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        double double25 = line24.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        line28.slope = 0.0d;
        boolean boolean31 = line24.Intersect(line28);
        double double32 = line24.yintercept;
        boolean boolean33 = line13.Intersect(line24);
        boolean boolean34 = line2.Intersect(line13);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test376");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        line6.yintercept = 1.0d;
        line6.yintercept = 0.0d;
        double double20 = line6.slope;
        double double21 = line6.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test377");
        Line line2 = new Line(0.0d, (double) (-1L));
        line2.yintercept = (short) 100;
        Line line7 = new Line((double) ' ', (double) 1);
        java.lang.String str8 = line7.toString();
        double double9 = line7.slope;
        java.lang.Class<?> wildcardClass10 = line7.getClass();
        Line line13 = new Line((double) 10L, (double) ' ');
        java.lang.String str14 = line13.toString();
        double double15 = line13.yintercept;
        Line line18 = new Line((double) (byte) 0, (double) 'a');
        double double19 = line18.slope;
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        line22.slope = 0.0d;
        boolean boolean25 = line18.Intersect(line22);
        java.lang.Class<?> wildcardClass26 = line18.getClass();
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        Line line33 = new Line((double) (byte) 0, (double) 'a');
        line33.slope = 0.0d;
        boolean boolean36 = line29.Intersect(line33);
        double double37 = line33.yintercept;
        boolean boolean38 = line18.Intersect(line33);
        Line line41 = new Line((double) (byte) 0, (double) 'a');
        line41.slope = (short) 100;
        double double44 = line41.yintercept;
        boolean boolean45 = line33.Intersect(line41);
        java.lang.Class<?> wildcardClass46 = line41.getClass();
        boolean boolean47 = line13.Intersect(line41);
        boolean boolean48 = line7.Intersect(line41);
        boolean boolean49 = line2.Intersect(line7);
        java.lang.Class<?> wildcardClass50 = line7.getClass();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 32.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str8.equals("slope: 32.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "slope: 10.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str14.equals("slope: 10.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 97.0d + "'", double37 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 97.0d + "'", double44 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test378");
        Line line2 = new Line(97.0d, (-1.0d));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test379");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.yintercept = 10L;
        line2.slope = 100L;
        line2.slope = '4';
        java.lang.Class<?> wildcardClass9 = line2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test380");
        Line line2 = new Line((double) 10L, (double) ' ');
        Line line5 = new Line((double) 10L, (double) ' ');
        line5.slope = 1L;
        double double8 = line5.slope;
        double double9 = line5.slope;
        double double10 = line5.yintercept;
        boolean boolean11 = line2.Intersect(line5);
        line2.slope = 0;
        double double14 = line2.slope;
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test381");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 0.0d;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        boolean boolean27 = line12.Intersect(line23);
        java.lang.String str28 = line23.toString();
        line23.slope = 0.0d;
        Line line33 = new Line((double) (byte) 0, (double) 'a');
        line33.slope = 0.0d;
        Line line38 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean39 = line33.Intersect(line38);
        line38.slope = (short) 1;
        Line line44 = new Line((double) 10L, (double) ' ');
        line44.slope = 1L;
        double double47 = line44.slope;
        Line line50 = new Line((double) (byte) 0, (double) 'a');
        double double51 = line50.slope;
        Line line54 = new Line((double) (byte) 0, (double) 'a');
        line54.slope = 0.0d;
        boolean boolean57 = line50.Intersect(line54);
        double double58 = line50.yintercept;
        double double59 = line50.slope;
        boolean boolean60 = line44.Intersect(line50);
        java.lang.String str61 = line50.toString();
        double double62 = line50.yintercept;
        java.lang.String str63 = line50.toString();
        java.lang.String str64 = line50.toString();
        boolean boolean65 = line38.Intersect(line50);
        line38.yintercept = 100.0d;
        boolean boolean68 = line23.Intersect(line38);
        double double69 = line38.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str28.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 97.0d + "'", double58 == 97.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str61.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 97.0d + "'", double62 == 97.0d);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str63.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str64.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 1.0d + "'", double69 == 1.0d);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test382");
        Line line2 = new Line((double) (-1L), (double) 100.0f);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test383");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.Class<?> wildcardClass15 = line12.getClass();
        double double16 = line12.slope;
        java.lang.Class<?> wildcardClass17 = line12.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test384");
        Line line2 = new Line((double) 10L, (double) ' ');
        java.lang.String str3 = line2.toString();
        double double4 = line2.yintercept;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        double double8 = line7.slope;
        Line line11 = new Line((double) (byte) 0, (double) 'a');
        line11.slope = 0.0d;
        boolean boolean14 = line7.Intersect(line11);
        java.lang.Class<?> wildcardClass15 = line7.getClass();
        Line line18 = new Line((double) (byte) 0, (double) 'a');
        double double19 = line18.slope;
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        line22.slope = 0.0d;
        boolean boolean25 = line18.Intersect(line22);
        double double26 = line22.yintercept;
        boolean boolean27 = line7.Intersect(line22);
        Line line30 = new Line((double) (byte) 0, (double) 'a');
        line30.slope = (short) 100;
        double double33 = line30.yintercept;
        boolean boolean34 = line22.Intersect(line30);
        java.lang.Class<?> wildcardClass35 = line30.getClass();
        boolean boolean36 = line2.Intersect(line30);
        java.lang.Class<?> wildcardClass37 = line2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 10.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str3.equals("slope: 10.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 97.0d + "'", double26 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 97.0d + "'", double33 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test385");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        Line line42 = new Line((double) ' ', (double) 1);
        boolean boolean43 = line2.Intersect(line42);
        java.lang.String str44 = line2.toString();
        double double45 = line2.slope;
        double double46 = line2.yintercept;
        double double47 = line2.yintercept;
        line2.slope = 97.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str44.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 97.0d + "'", double46 == 97.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 97.0d + "'", double47 == 97.0d);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test386");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        double double16 = line6.slope;
        double double17 = line6.slope;
        Line line20 = new Line((double) (byte) 0, (double) 'a');
        double double21 = line20.slope;
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        double double25 = line24.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        line28.slope = 0.0d;
        boolean boolean31 = line24.Intersect(line28);
        Line line34 = new Line((double) (byte) 0, (double) 'a');
        double double35 = line34.slope;
        boolean boolean36 = line28.Intersect(line34);
        boolean boolean37 = line20.Intersect(line28);
        Line line40 = new Line((double) (byte) 10, 97.0d);
        double double41 = line40.yintercept;
        boolean boolean42 = line20.Intersect(line40);
        boolean boolean43 = line6.Intersect(line20);
        double double44 = line6.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 97.0d + "'", double41 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test387");
        Line line2 = new Line((double) (short) 100, (double) (-1));
        double double3 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test388");
        Line line2 = new Line((double) 100L, (double) 10L);
        Line line5 = new Line((double) 'a', (double) (byte) 10);
        line5.slope = (short) 100;
        line5.slope = 97.0d;
        line5.yintercept = (-1L);
        java.lang.String str12 = line5.toString();
        double double13 = line5.yintercept;
        line5.yintercept = (byte) 100;
        Line line18 = new Line((double) (byte) 0, (double) 'a');
        double double19 = line18.slope;
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        line22.slope = 0.0d;
        boolean boolean25 = line18.Intersect(line22);
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        boolean boolean30 = line22.Intersect(line28);
        line28.yintercept = 0.0d;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        double double36 = line35.slope;
        Line line39 = new Line((double) (byte) 0, (double) 'a');
        line39.slope = 0.0d;
        boolean boolean42 = line35.Intersect(line39);
        boolean boolean43 = line28.Intersect(line39);
        java.lang.Class<?> wildcardClass44 = line39.getClass();
        Line line47 = new Line((double) (byte) 0, (double) 'a');
        double double48 = line47.slope;
        Line line51 = new Line((double) (byte) 0, (double) 'a');
        line51.slope = 0.0d;
        boolean boolean54 = line47.Intersect(line51);
        double double55 = line51.yintercept;
        Line line58 = new Line(0.0d, (double) (-1L));
        boolean boolean59 = line51.Intersect(line58);
        java.lang.Class<?> wildcardClass60 = line51.getClass();
        boolean boolean61 = line39.Intersect(line51);
        Line line64 = new Line((double) (byte) 0, (double) 'a');
        double double65 = line64.slope;
        Line line68 = new Line((double) (byte) 0, (double) 'a');
        line68.slope = 0.0d;
        boolean boolean71 = line64.Intersect(line68);
        double double72 = line68.yintercept;
        Line line75 = new Line(0.0d, (double) (-1L));
        boolean boolean76 = line68.Intersect(line75);
        double double77 = line68.slope;
        java.lang.String str78 = line68.toString();
        boolean boolean79 = line39.Intersect(line68);
        line39.slope = ' ';
        boolean boolean82 = line5.Intersect(line39);
        java.lang.String str83 = line5.toString();
        boolean boolean84 = line2.Intersect(line5);
        line5.slope = 1.0d;
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str12.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 97.0d + "'", double55 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 97.0d + "'", double72 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str78.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "slope: 97.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str83.equals("slope: 97.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test389");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        double double4 = line2.yintercept;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test390");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = (short) 100;
        line2.slope = 97.0d;
        line2.yintercept = (-1L);
        java.lang.String str9 = line2.toString();
        double double10 = line2.yintercept;
        java.lang.String str11 = line2.toString();
        double double12 = line2.slope;
        double double13 = line2.slope;
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str11.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test391");
        Line line2 = new Line((double) 0.0f, (double) 1);
        line2.slope = 97.0d;
        double double5 = line2.slope;
        line2.slope = 0.0d;
        line2.yintercept = (byte) -1;
        line2.yintercept = 0.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test392");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.yintercept = (-1.0f);
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        double double8 = line7.slope;
        Line line11 = new Line((double) (byte) 0, (double) 'a');
        double double12 = line11.slope;
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        line15.slope = 0.0d;
        boolean boolean18 = line11.Intersect(line15);
        Line line21 = new Line((double) (byte) 0, (double) 'a');
        double double22 = line21.slope;
        boolean boolean23 = line15.Intersect(line21);
        boolean boolean24 = line7.Intersect(line15);
        Line line27 = new Line((double) (byte) 10, 97.0d);
        double double28 = line27.yintercept;
        boolean boolean29 = line7.Intersect(line27);
        line7.yintercept = 0.0f;
        boolean boolean32 = line2.Intersect(line7);
        line7.slope = 1.0d;
        Line line37 = new Line(32.0d, (double) 0L);
        boolean boolean38 = line7.Intersect(line37);
        java.lang.String str39 = line37.toString();
        double double40 = line37.yintercept;
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 97.0d + "'", double28 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "slope: 32.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str39.equals("slope: 32.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test393");
        Line line2 = new Line((double) 100, (double) 0L);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test394");
        Line line2 = new Line((double) ' ', (double) 1);
        double double3 = line2.yintercept;
        line2.slope = ' ';
        double double6 = line2.slope;
        java.lang.String str7 = line2.toString();
        java.lang.Class<?> wildcardClass8 = line2.getClass();
        double double9 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "slope: 32.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str7.equals("slope: 32.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test395");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        line6.yintercept = 1.0d;
        line6.yintercept = 0.0d;
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        double double23 = line22.slope;
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        line26.slope = 0.0d;
        boolean boolean29 = line22.Intersect(line26);
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        boolean boolean34 = line26.Intersect(line32);
        line32.yintercept = 0.0d;
        Line line39 = new Line((double) (byte) 0, (double) 'a');
        double double40 = line39.slope;
        Line line43 = new Line((double) (byte) 0, (double) 'a');
        line43.slope = 0.0d;
        boolean boolean46 = line39.Intersect(line43);
        boolean boolean47 = line32.Intersect(line43);
        java.lang.Class<?> wildcardClass48 = line43.getClass();
        Line line51 = new Line((double) (byte) 0, (double) 'a');
        double double52 = line51.slope;
        Line line55 = new Line((double) (byte) 0, (double) 'a');
        line55.slope = 0.0d;
        boolean boolean58 = line51.Intersect(line55);
        double double59 = line55.yintercept;
        Line line62 = new Line(0.0d, (double) (-1L));
        boolean boolean63 = line55.Intersect(line62);
        java.lang.Class<?> wildcardClass64 = line55.getClass();
        boolean boolean65 = line43.Intersect(line55);
        Line line68 = new Line((double) (byte) 0, (double) 'a');
        double double69 = line68.slope;
        Line line72 = new Line((double) (byte) 0, (double) 'a');
        line72.slope = 0.0d;
        boolean boolean75 = line68.Intersect(line72);
        double double76 = line72.yintercept;
        Line line79 = new Line(0.0d, (double) (-1L));
        boolean boolean80 = line72.Intersect(line79);
        double double81 = line72.slope;
        java.lang.String str82 = line72.toString();
        boolean boolean83 = line43.Intersect(line72);
        boolean boolean84 = line6.Intersect(line72);
        java.lang.String str85 = line72.toString();
        double double86 = line72.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 97.0d + "'", double59 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 97.0d + "'", double76 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str82.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str85.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test396");
        Line line2 = new Line((double) 100L, (double) 1.0f);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test397");
        Line line2 = new Line(10.0d, (double) 0L);
        Line line5 = new Line((double) 'a', (double) (byte) 10);
        line5.yintercept = (-1.0f);
        boolean boolean8 = line2.Intersect(line5);
        double double9 = line5.slope;
        line5.yintercept = 1;
        line5.slope = (byte) 1;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test398");
        Line line2 = new Line(35.0d, 100.0d);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test399");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        java.lang.Class<?> wildcardClass15 = line13.getClass();
        Line line18 = new Line(97.0d, (double) (short) -1);
        boolean boolean19 = line13.Intersect(line18);
        java.lang.String str20 = line13.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str20.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test400");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        double double15 = line6.slope;
        Line line18 = new Line((double) 1.0f, (double) (short) 1);
        boolean boolean19 = line6.Intersect(line18);
        double double20 = line18.yintercept;
        double double21 = line18.yintercept;
        double double22 = line18.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test401");
        Line line2 = new Line((double) 0L, (double) 100.0f);
        Line line5 = new Line((double) (short) -1, (double) (short) -1);
        line5.yintercept = (-1.0f);
        boolean boolean8 = line2.Intersect(line5);
        java.lang.String str9 = line2.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 0.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str9.equals("slope: 0.0, yintercept: 100.0, epsilon:1.0E-6"));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test402");
        Line line2 = new Line((double) 100, 1.0d);
        line2.yintercept = 97.0d;
        double double5 = line2.yintercept;
        line2.yintercept = (short) 1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test403");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = (short) 100;
        line2.slope = 97.0d;
        line2.yintercept = (-1L);
        java.lang.String str9 = line2.toString();
        double double10 = line2.slope;
        line2.slope = 'a';
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test404");
        Line line2 = new Line((-1.0d), (double) (short) 1);
        double double3 = line2.slope;
        line2.slope = (short) -1;
        java.lang.Class<?> wildcardClass6 = line2.getClass();
        line2.yintercept = 100.0f;
        double double9 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test405");
        Line line2 = new Line((double) ' ', (double) 1);
        line2.yintercept = 100.0f;
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        line2.slope = 0.0d;
        double double8 = line2.yintercept;
        java.lang.String str9 = line2.toString();
        java.lang.String str10 = line2.toString();
        java.lang.Class<?> wildcardClass11 = line2.getClass();
        line2.yintercept = 100.0d;
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 0.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str9.equals("slope: 0.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "slope: 0.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str10.equals("slope: 0.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test406");
        Line line2 = new Line((-1.0d), (double) (short) 1);
        double double3 = line2.slope;
        line2.slope = (short) -1;
        java.lang.Class<?> wildcardClass6 = line2.getClass();
        line2.yintercept = 100.0f;
        Line line11 = new Line((double) (byte) 0, (double) 'a');
        double double12 = line11.slope;
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        line15.slope = 0.0d;
        boolean boolean18 = line11.Intersect(line15);
        Line line21 = new Line((double) (byte) 0, (double) 'a');
        double double22 = line21.slope;
        boolean boolean23 = line15.Intersect(line21);
        line21.yintercept = 0.0d;
        line21.slope = 100.0f;
        line21.yintercept = 100;
        java.lang.String str30 = line21.toString();
        boolean boolean31 = line2.Intersect(line21);
        double double32 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str30.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test407");
        Line line2 = new Line(32.0d, (double) 10.0f);
        java.lang.String str3 = line2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 32.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str3.equals("slope: 32.0, yintercept: 10.0, epsilon:1.0E-6"));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test408");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        java.lang.String str14 = line2.toString();
        double double15 = line2.yintercept;
        Line line18 = new Line((double) 'a', (double) (byte) 10);
        line18.slope = (short) 100;
        line18.slope = 97.0d;
        line18.yintercept = (-1L);
        java.lang.String str25 = line18.toString();
        double double26 = line18.yintercept;
        line18.yintercept = (byte) 100;
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        Line line41 = new Line((double) (byte) 0, (double) 'a');
        double double42 = line41.slope;
        boolean boolean43 = line35.Intersect(line41);
        line41.yintercept = 0.0d;
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        double double49 = line48.slope;
        Line line52 = new Line((double) (byte) 0, (double) 'a');
        line52.slope = 0.0d;
        boolean boolean55 = line48.Intersect(line52);
        boolean boolean56 = line41.Intersect(line52);
        java.lang.Class<?> wildcardClass57 = line52.getClass();
        Line line60 = new Line((double) (byte) 0, (double) 'a');
        double double61 = line60.slope;
        Line line64 = new Line((double) (byte) 0, (double) 'a');
        line64.slope = 0.0d;
        boolean boolean67 = line60.Intersect(line64);
        double double68 = line64.yintercept;
        Line line71 = new Line(0.0d, (double) (-1L));
        boolean boolean72 = line64.Intersect(line71);
        java.lang.Class<?> wildcardClass73 = line64.getClass();
        boolean boolean74 = line52.Intersect(line64);
        Line line77 = new Line((double) (byte) 0, (double) 'a');
        double double78 = line77.slope;
        Line line81 = new Line((double) (byte) 0, (double) 'a');
        line81.slope = 0.0d;
        boolean boolean84 = line77.Intersect(line81);
        double double85 = line81.yintercept;
        Line line88 = new Line(0.0d, (double) (-1L));
        boolean boolean89 = line81.Intersect(line88);
        double double90 = line81.slope;
        java.lang.String str91 = line81.toString();
        boolean boolean92 = line52.Intersect(line81);
        line52.slope = ' ';
        boolean boolean95 = line18.Intersect(line52);
        java.lang.String str96 = line18.toString();
        boolean boolean97 = line2.Intersect(line18);
        line2.yintercept = (short) 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str14.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str25.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 97.0d + "'", double68 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 97.0d + "'", double85 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str91.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + str96 + "' != '" + "slope: 97.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str96.equals("slope: 97.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test409");
        Line line2 = new Line((double) 0L, (double) 0.0f);
        double double3 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test410");
        Line line2 = new Line((double) 100, (double) '#');
        double double3 = line2.slope;
        double double4 = line2.slope;
        double double5 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test411");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        java.lang.String str16 = line6.toString();
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        boolean boolean31 = line23.Intersect(line29);
        java.lang.Class<?> wildcardClass32 = line23.getClass();
        java.lang.String str33 = line23.toString();
        boolean boolean34 = line6.Intersect(line23);
        line23.slope = 97.0d;
        java.lang.Class<?> wildcardClass37 = line23.getClass();
        line23.slope = (short) 100;
        java.lang.String str40 = line23.toString();
        java.lang.String str41 = line23.toString();
        java.lang.String str42 = line23.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: 100.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str40.equals("slope: 100.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "slope: 100.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str41.equals("slope: 100.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "slope: 100.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str42.equals("slope: 100.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test412");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        java.lang.Class<?> wildcardClass8 = line6.getClass();
        double double9 = line6.yintercept;
        boolean boolean10 = line2.Intersect(line6);
        line6.slope = '#';
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        double double16 = line15.slope;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        line19.slope = 0.0d;
        boolean boolean22 = line15.Intersect(line19);
        double double23 = line19.yintercept;
        java.lang.String str24 = line19.toString();
        Line line27 = new Line(10.0d, (double) 10);
        boolean boolean28 = line19.Intersect(line27);
        boolean boolean29 = line6.Intersect(line27);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 97.0d + "'", double23 == 97.0d);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str24.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test413");
        Line line2 = new Line((double) 100L, (double) 100);
        java.lang.String str3 = line2.toString();
        Line line6 = new Line(10.0d, (double) 0L);
        Line line9 = new Line((double) 'a', (double) (byte) 10);
        line9.yintercept = (-1.0f);
        boolean boolean12 = line6.Intersect(line9);
        java.lang.Class<?> wildcardClass13 = line9.getClass();
        java.lang.Class<?> wildcardClass14 = line9.getClass();
        boolean boolean15 = line2.Intersect(line9);
        java.lang.String str16 = line9.toString();
        java.lang.String str17 = line9.toString();
        double double18 = line9.yintercept;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str3.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str16.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str17.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test414");
        Line line2 = new Line((double) 10L, (double) 1);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test415");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        double double14 = line13.slope;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        line17.slope = 0.0d;
        boolean boolean20 = line13.Intersect(line17);
        double double21 = line13.yintercept;
        boolean boolean22 = line2.Intersect(line13);
        Line line25 = new Line((double) 'a', (double) 'a');
        line25.yintercept = (byte) 0;
        boolean boolean28 = line13.Intersect(line25);
        java.lang.String str29 = line25.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "slope: 97.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str29.equals("slope: 97.0, yintercept: 0.0, epsilon:1.0E-6"));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test416");
        Line line2 = new Line((double) 0L, (double) 100.0f);
        Line line5 = new Line((double) (short) -1, (double) (short) -1);
        line5.yintercept = (-1.0f);
        boolean boolean8 = line2.Intersect(line5);
        java.lang.String str9 = line5.toString();
        double double10 = line5.yintercept;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: -1.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str9.equals("slope: -1.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test417");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 0.0d;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        boolean boolean27 = line12.Intersect(line23);
        java.lang.Class<?> wildcardClass28 = line23.getClass();
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        double double39 = line35.yintercept;
        Line line42 = new Line(0.0d, (double) (-1L));
        boolean boolean43 = line35.Intersect(line42);
        java.lang.Class<?> wildcardClass44 = line35.getClass();
        boolean boolean45 = line23.Intersect(line35);
        java.lang.Class<?> wildcardClass46 = line35.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test418");
        Line line2 = new Line((double) 100.0f, (double) (short) 10);
        double double3 = line2.slope;
        line2.yintercept = 32.0d;
        Line line8 = new Line((double) 10L, (double) ' ');
        line8.slope = 1L;
        double double11 = line8.slope;
        double double12 = line8.slope;
        Line line15 = new Line((double) ' ', (double) '4');
        boolean boolean16 = line8.Intersect(line15);
        line8.yintercept = 10;
        Line line21 = new Line((double) (byte) 0, (double) 'a');
        double double22 = line21.slope;
        Line line25 = new Line((double) (byte) 0, (double) 'a');
        line25.slope = 0.0d;
        boolean boolean28 = line21.Intersect(line25);
        double double29 = line25.yintercept;
        Line line32 = new Line(0.0d, (double) (-1L));
        boolean boolean33 = line25.Intersect(line32);
        Line line36 = new Line((double) (byte) 0, (double) 'a');
        double double37 = line36.slope;
        Line line40 = new Line((double) (byte) 0, (double) 'a');
        double double41 = line40.slope;
        Line line44 = new Line((double) (byte) 0, (double) 'a');
        line44.slope = 0.0d;
        boolean boolean47 = line40.Intersect(line44);
        Line line50 = new Line((double) (byte) 0, (double) 'a');
        double double51 = line50.slope;
        boolean boolean52 = line44.Intersect(line50);
        boolean boolean53 = line36.Intersect(line44);
        line44.slope = 0L;
        line44.yintercept = (-1L);
        java.lang.String str58 = line44.toString();
        line44.slope = (byte) -1;
        boolean boolean61 = line25.Intersect(line44);
        double double62 = line44.slope;
        boolean boolean63 = line8.Intersect(line44);
        boolean boolean64 = line2.Intersect(line8);
        line8.yintercept = 'a';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 97.0d + "'", double29 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str58.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-1.0d) + "'", double62 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test419");
        Line line2 = new Line(0.0d, (double) 0L);
        line2.yintercept = 'a';
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test420");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        line2.slope = 0.0d;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean8 = line2.Intersect(line7);
        line2.yintercept = (byte) 1;
        java.lang.Class<?> wildcardClass11 = line2.getClass();
        java.lang.Class<?> wildcardClass12 = line2.getClass();
        double double13 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test421");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        line2.slope = 0.0d;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean8 = line2.Intersect(line7);
        line7.yintercept = '4';
        Line line13 = new Line((double) 10L, (double) ' ');
        line13.slope = 1L;
        double double16 = line13.slope;
        double double17 = line13.slope;
        Line line20 = new Line((double) ' ', (double) '4');
        boolean boolean21 = line13.Intersect(line20);
        line20.slope = 97.0d;
        boolean boolean24 = line7.Intersect(line20);
        Line line25 = null;
        try {
            boolean boolean26 = line20.Intersect(line25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test422");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        double double16 = line8.yintercept;
        double double17 = line8.slope;
        boolean boolean18 = line2.Intersect(line8);
        java.lang.String str19 = line8.toString();
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        double double26 = line22.slope;
        Line line29 = new Line((double) ' ', (double) '4');
        boolean boolean30 = line22.Intersect(line29);
        boolean boolean31 = line8.Intersect(line22);
        java.lang.Class<?> wildcardClass32 = line8.getClass();
        java.lang.Class<?> wildcardClass33 = line8.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str19.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test423");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        double double16 = line8.yintercept;
        double double17 = line8.slope;
        boolean boolean18 = line2.Intersect(line8);
        java.lang.String str19 = line8.toString();
        double double20 = line8.yintercept;
        java.lang.String str21 = line8.toString();
        java.lang.String str22 = line8.toString();
        Line line25 = new Line((double) 'a', (double) (byte) 10);
        double double26 = line25.slope;
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        java.lang.Class<?> wildcardClass31 = line29.getClass();
        double double32 = line29.yintercept;
        boolean boolean33 = line25.Intersect(line29);
        boolean boolean34 = line8.Intersect(line25);
        java.lang.String str35 = line25.toString();
        java.lang.Class<?> wildcardClass36 = line25.getClass();
        double double37 = line25.yintercept;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str19.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str22.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 97.0d + "'", double26 == 97.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str35.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test424");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        Line line18 = new Line((double) (byte) 0, (double) 'a');
        double double19 = line18.slope;
        boolean boolean20 = line12.Intersect(line18);
        java.lang.String str21 = line12.toString();
        double double22 = line12.slope;
        boolean boolean23 = line2.Intersect(line12);
        double double24 = line2.slope;
        Line line27 = new Line(100.0d, (double) (byte) 100);
        boolean boolean28 = line2.Intersect(line27);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test425");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        Line line17 = new Line((double) 100L, (double) 100);
        java.lang.String str18 = line17.toString();
        boolean boolean19 = line6.Intersect(line17);
        java.lang.Class<?> wildcardClass20 = line6.getClass();
        java.lang.String str21 = line6.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str18.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test426");
        Line line2 = new Line((double) (-1), (double) 0);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        double double10 = line9.slope;
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        line13.slope = 0.0d;
        boolean boolean16 = line9.Intersect(line13);
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        boolean boolean21 = line13.Intersect(line19);
        boolean boolean22 = line5.Intersect(line13);
        Line line25 = new Line((double) 10L, (double) ' ');
        line25.slope = 1L;
        double double28 = line25.slope;
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        double double39 = line31.yintercept;
        double double40 = line31.slope;
        boolean boolean41 = line25.Intersect(line31);
        boolean boolean42 = line5.Intersect(line31);
        Line line45 = new Line((double) ' ', (double) 1);
        boolean boolean46 = line5.Intersect(line45);
        boolean boolean47 = line2.Intersect(line45);
        Line line50 = new Line((double) ' ', 100.0d);
        Line line53 = new Line((double) (byte) 0, (double) 'a');
        double double54 = line53.slope;
        Line line57 = new Line((double) (byte) 0, (double) 'a');
        double double58 = line57.slope;
        Line line61 = new Line((double) (byte) 0, (double) 'a');
        line61.slope = 0.0d;
        boolean boolean64 = line57.Intersect(line61);
        Line line67 = new Line((double) (byte) 0, (double) 'a');
        double double68 = line67.slope;
        boolean boolean69 = line61.Intersect(line67);
        boolean boolean70 = line53.Intersect(line61);
        line53.slope = 10.0d;
        boolean boolean73 = line50.Intersect(line53);
        double double74 = line50.yintercept;
        boolean boolean75 = line45.Intersect(line50);
        double double76 = line50.slope;
        java.lang.Class<?> wildcardClass77 = line50.getClass();
        line50.yintercept = 35.0d;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 100.0d + "'", double74 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 32.0d + "'", double76 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test427");
        Line line2 = new Line((double) 100L, 97.0d);
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        line2.slope = 10L;
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test428");
        Line line2 = new Line((double) 0L, 97.0d);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test429");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        Line line17 = new Line((double) 100L, (double) 100);
        java.lang.String str18 = line17.toString();
        boolean boolean19 = line6.Intersect(line17);
        line17.yintercept = (byte) 0;
        line17.slope = 32.0d;
        line17.slope = (short) -1;
        line17.yintercept = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str18.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test430");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        line28.yintercept = (byte) 1;
        line28.slope = 100;
        java.lang.String str44 = line28.toString();
        java.lang.Class<?> wildcardClass45 = line28.getClass();
        line28.slope = (-1.0f);
        java.lang.Class<?> wildcardClass48 = line28.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "slope: 100.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str44.equals("slope: 100.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test431");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        double double40 = line28.yintercept;
        java.lang.String str41 = line28.toString();
        line28.yintercept = 10.0f;
        double double44 = line28.slope;
        line28.yintercept = 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 97.0d + "'", double40 == 97.0d);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str41.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test432");
        Line line2 = new Line((double) ' ', (double) 1);
        line2.slope = 'a';
        double double5 = line2.yintercept;
        java.lang.Class<?> wildcardClass6 = line2.getClass();
        java.lang.String str7 = line2.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "slope: 97.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str7.equals("slope: 97.0, yintercept: 1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test433");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        line2.yintercept = 97.0d;
        java.lang.String str42 = line2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str42.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test434");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 0.0d;
        line12.slope = 100.0f;
        line12.yintercept = 100;
        line12.slope = 'a';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test435");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        double double6 = line2.slope;
        Line line9 = new Line((double) ' ', (double) '4');
        boolean boolean10 = line2.Intersect(line9);
        java.lang.String str11 = line9.toString();
        java.lang.String str12 = line9.toString();
        line9.slope = 97.0d;
        double double15 = line9.slope;
        double double16 = line9.slope;
        Line line19 = new Line((double) 10L, (double) ' ');
        line19.slope = 1L;
        double double22 = line19.slope;
        double double23 = line19.slope;
        Line line26 = new Line((double) ' ', (double) '4');
        boolean boolean27 = line19.Intersect(line26);
        java.lang.String str28 = line26.toString();
        java.lang.String str29 = line26.toString();
        line26.slope = 97.0d;
        double double32 = line26.slope;
        double double33 = line26.slope;
        boolean boolean34 = line9.Intersect(line26);
        java.lang.String str35 = line9.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 32.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str11.equals("slope: 32.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "slope: 32.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str12.equals("slope: 32.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "slope: 32.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str28.equals("slope: 32.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "slope: 32.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str29.equals("slope: 32.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 97.0d + "'", double33 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "slope: 97.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str35.equals("slope: 97.0, yintercept: 52.0, epsilon:1.0E-6"));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test436");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        double double5 = line2.yintercept;
        line2.yintercept = '4';
        Line line10 = new Line((double) (byte) 0, (double) (-1.0f));
        boolean boolean11 = line2.Intersect(line10);
        java.lang.String str12 = line10.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str12.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test437");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        double double14 = line2.yintercept;
        line2.yintercept = (-1.0f);
        line2.slope = 100.0d;
        line2.yintercept = 10;
        line2.yintercept = 100.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test438");
        Line line2 = new Line(32.0d, (double) (short) 100);
        java.lang.String str3 = line2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str3.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test439");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        java.lang.String str16 = line6.toString();
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        boolean boolean31 = line23.Intersect(line29);
        java.lang.Class<?> wildcardClass32 = line23.getClass();
        java.lang.String str33 = line23.toString();
        boolean boolean34 = line6.Intersect(line23);
        java.lang.Class<?> wildcardClass35 = line6.getClass();
        double double36 = line6.yintercept;
        java.lang.String str37 = line6.toString();
        java.lang.Class<?> wildcardClass38 = line6.getClass();
        line6.slope = (-1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str37.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test440");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 0.0d;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        boolean boolean27 = line12.Intersect(line23);
        java.lang.Class<?> wildcardClass28 = line23.getClass();
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        double double39 = line35.yintercept;
        Line line42 = new Line(0.0d, (double) (-1L));
        boolean boolean43 = line35.Intersect(line42);
        java.lang.Class<?> wildcardClass44 = line35.getClass();
        boolean boolean45 = line23.Intersect(line35);
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        double double49 = line48.slope;
        Line line52 = new Line((double) (byte) 0, (double) 'a');
        line52.slope = 0.0d;
        boolean boolean55 = line48.Intersect(line52);
        double double56 = line52.yintercept;
        Line line59 = new Line(0.0d, (double) (-1L));
        boolean boolean60 = line52.Intersect(line59);
        double double61 = line52.slope;
        java.lang.String str62 = line52.toString();
        boolean boolean63 = line23.Intersect(line52);
        java.lang.String str64 = line52.toString();
        java.lang.String str65 = line52.toString();
        java.lang.Class<?> wildcardClass66 = line52.getClass();
        double double67 = line52.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 97.0d + "'", double56 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str62.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str64.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str65.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test441");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.yintercept;
        double double6 = line2.yintercept;
        java.lang.String str7 = line2.toString();
        java.lang.Class<?> wildcardClass8 = line2.getClass();
        Line line11 = new Line((double) ' ', (double) 1);
        line11.yintercept = 100.0f;
        java.lang.Class<?> wildcardClass14 = line11.getClass();
        boolean boolean15 = line2.Intersect(line11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "slope: 1.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str7.equals("slope: 1.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test442");
        Line line2 = new Line((double) 100, (double) (-1L));
        java.lang.String str3 = line2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 100.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str3.equals("slope: 100.0, yintercept: -1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test443");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        double double14 = line13.slope;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        line17.slope = 0.0d;
        boolean boolean20 = line13.Intersect(line17);
        double double21 = line13.yintercept;
        boolean boolean22 = line2.Intersect(line13);
        Line line25 = new Line((double) 'a', (double) 'a');
        line25.yintercept = (byte) 0;
        boolean boolean28 = line13.Intersect(line25);
        Line line31 = new Line((double) ' ', (double) 1);
        line31.slope = 'a';
        double double34 = line31.yintercept;
        java.lang.Class<?> wildcardClass35 = line31.getClass();
        java.lang.Class<?> wildcardClass36 = line31.getClass();
        boolean boolean37 = line25.Intersect(line31);
        java.lang.Class<?> wildcardClass38 = line25.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test444");
        Line line2 = new Line((double) (short) 100, (double) ' ');
        double double3 = line2.yintercept;
        java.lang.String str4 = line2.toString();
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        java.lang.String str6 = line2.toString();
        java.lang.String str7 = line2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "slope: 100.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str4.equals("slope: 100.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "slope: 100.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str6.equals("slope: 100.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "slope: 100.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str7.equals("slope: 100.0, yintercept: 32.0, epsilon:1.0E-6"));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test445");
        Line line2 = new Line((double) 0L, (-1.0d));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test446");
        Line line2 = new Line((double) (-1), (double) 0);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        double double10 = line9.slope;
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        line13.slope = 0.0d;
        boolean boolean16 = line9.Intersect(line13);
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        boolean boolean21 = line13.Intersect(line19);
        boolean boolean22 = line5.Intersect(line13);
        Line line25 = new Line((double) 10L, (double) ' ');
        line25.slope = 1L;
        double double28 = line25.slope;
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        double double39 = line31.yintercept;
        double double40 = line31.slope;
        boolean boolean41 = line25.Intersect(line31);
        boolean boolean42 = line5.Intersect(line31);
        Line line45 = new Line((double) ' ', (double) 1);
        boolean boolean46 = line5.Intersect(line45);
        boolean boolean47 = line2.Intersect(line45);
        Line line50 = new Line((double) ' ', 100.0d);
        Line line53 = new Line((double) (byte) 0, (double) 'a');
        double double54 = line53.slope;
        Line line57 = new Line((double) (byte) 0, (double) 'a');
        double double58 = line57.slope;
        Line line61 = new Line((double) (byte) 0, (double) 'a');
        line61.slope = 0.0d;
        boolean boolean64 = line57.Intersect(line61);
        Line line67 = new Line((double) (byte) 0, (double) 'a');
        double double68 = line67.slope;
        boolean boolean69 = line61.Intersect(line67);
        boolean boolean70 = line53.Intersect(line61);
        line53.slope = 10.0d;
        boolean boolean73 = line50.Intersect(line53);
        double double74 = line50.yintercept;
        boolean boolean75 = line45.Intersect(line50);
        line45.slope = 52.0d;
        line45.slope = 35.0d;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 100.0d + "'", double74 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test447");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        Line line42 = new Line((double) ' ', (double) 1);
        boolean boolean43 = line2.Intersect(line42);
        double double44 = line2.yintercept;
        double double45 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 97.0d + "'", double44 == 97.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 97.0d + "'", double45 == 97.0d);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test448");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        java.lang.Class<?> wildcardClass15 = line13.getClass();
        java.lang.String str16 = line13.toString();
        Line line19 = new Line((double) 100.0f, 100.0d);
        Line line22 = new Line((double) (short) -1, 32.0d);
        boolean boolean23 = line19.Intersect(line22);
        double double24 = line22.slope;
        Line line27 = new Line((double) (byte) 0, (double) 'a');
        double double28 = line27.slope;
        java.lang.Class<?> wildcardClass29 = line27.getClass();
        double double30 = line27.yintercept;
        boolean boolean31 = line22.Intersect(line27);
        Line line34 = new Line((double) (byte) 0, (double) 'a');
        double double35 = line34.slope;
        Line line38 = new Line((double) (byte) 0, (double) 'a');
        double double39 = line38.slope;
        Line line42 = new Line((double) (byte) 0, (double) 'a');
        line42.slope = 0.0d;
        boolean boolean45 = line38.Intersect(line42);
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        double double49 = line48.slope;
        boolean boolean50 = line42.Intersect(line48);
        boolean boolean51 = line34.Intersect(line42);
        Line line54 = new Line((double) 10L, (double) ' ');
        line54.slope = 1L;
        double double57 = line54.slope;
        Line line60 = new Line((double) (byte) 0, (double) 'a');
        double double61 = line60.slope;
        Line line64 = new Line((double) (byte) 0, (double) 'a');
        line64.slope = 0.0d;
        boolean boolean67 = line60.Intersect(line64);
        double double68 = line60.yintercept;
        double double69 = line60.slope;
        boolean boolean70 = line54.Intersect(line60);
        boolean boolean71 = line34.Intersect(line60);
        boolean boolean72 = line27.Intersect(line60);
        boolean boolean73 = line13.Intersect(line60);
        Line line76 = new Line((double) (byte) 0, (double) 'a');
        double double77 = line76.slope;
        Line line80 = new Line((double) (byte) 0, (double) 'a');
        line80.slope = 0.0d;
        boolean boolean83 = line76.Intersect(line80);
        double double84 = line80.yintercept;
        Line line87 = new Line(0.0d, (double) (-1L));
        boolean boolean88 = line80.Intersect(line87);
        double double89 = line80.slope;
        double double90 = line80.yintercept;
        java.lang.String str91 = line80.toString();
        boolean boolean92 = line60.Intersect(line80);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 97.0d + "'", double30 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 97.0d + "'", double68 == 97.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 97.0d + "'", double84 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 97.0d + "'", double90 == 97.0d);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str91.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test449");
        Line line2 = new Line((double) 10.0f, (double) (short) -1);
        line2.slope = 100.0f;
        double double5 = line2.slope;
        double double6 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test450");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        double double3 = line2.slope;
        line2.yintercept = 0.0d;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        double double16 = line12.yintercept;
        Line line19 = new Line(0.0d, (double) (-1L));
        boolean boolean20 = line12.Intersect(line19);
        double double21 = line12.slope;
        java.lang.String str22 = line12.toString();
        java.lang.Class<?> wildcardClass23 = line12.getClass();
        java.lang.String str24 = line12.toString();
        double double25 = line12.slope;
        boolean boolean26 = line2.Intersect(line12);
        java.lang.Class<?> wildcardClass27 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str22.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str24.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test451");
        Line line2 = new Line((double) (short) 10, (double) 1);
        line2.slope = 100.0f;
        java.lang.String str5 = line2.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 100.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str5.equals("slope: 100.0, yintercept: 1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test452");
        Line line2 = new Line((double) 0L, (double) 10);
        double double3 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test453");
        Line line2 = new Line((double) 10L, (double) ' ');
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        double double4 = line2.slope;
        Line line7 = new Line((double) 'a', (double) (byte) 10);
        line7.slope = (short) 100;
        line7.slope = 97.0d;
        boolean boolean12 = line2.Intersect(line7);
        java.lang.String str13 = line2.toString();
        java.lang.String str14 = line2.toString();
        double double15 = line2.yintercept;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "slope: 10.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str13.equals("slope: 10.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "slope: 10.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str14.equals("slope: 10.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test454");
        Line line2 = new Line((double) 0.0f, (double) (short) 1);
        double double3 = line2.yintercept;
        double double4 = line2.yintercept;
        Line line7 = new Line(1.0d, (double) 1.0f);
        double double8 = line7.yintercept;
        Line line11 = new Line((double) 10L, (double) ' ');
        java.lang.Class<?> wildcardClass12 = line11.getClass();
        double double13 = line11.slope;
        Line line16 = new Line((double) 'a', (double) (byte) 10);
        line16.slope = (short) 100;
        line16.slope = 97.0d;
        boolean boolean21 = line11.Intersect(line16);
        Line line24 = new Line((double) (byte) 1, 1.0d);
        line24.slope = 10.0f;
        boolean boolean27 = line16.Intersect(line24);
        boolean boolean28 = line7.Intersect(line16);
        boolean boolean29 = line2.Intersect(line16);
        java.lang.String str30 = line2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "slope: 0.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str30.equals("slope: 0.0, yintercept: 1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test455");
        Line line2 = new Line((double) ' ', (double) 1);
        line2.yintercept = 100.0f;
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        line2.slope = 0.0d;
        line2.yintercept = 'a';
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test456");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        double double4 = line2.slope;
        java.lang.String str5 = line2.toString();
        java.lang.String str6 = line2.toString();
        double double7 = line2.slope;
        line2.yintercept = 10;
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        double double11 = line2.slope;
        java.lang.String str12 = line2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str5.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str6.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "slope: 0.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str12.equals("slope: 0.0, yintercept: 10.0, epsilon:1.0E-6"));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test457");
        Line line2 = new Line(32.0d, (double) 0L);
        double double3 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test458");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        double double3 = line2.slope;
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        java.lang.String str5 = line2.toString();
        java.lang.String str6 = line2.toString();
        Line line9 = new Line((double) 100L, (double) 100);
        java.lang.String str10 = line9.toString();
        Line line13 = new Line(10.0d, (double) 0L);
        Line line16 = new Line((double) 'a', (double) (byte) 10);
        line16.yintercept = (-1.0f);
        boolean boolean19 = line13.Intersect(line16);
        java.lang.Class<?> wildcardClass20 = line16.getClass();
        java.lang.Class<?> wildcardClass21 = line16.getClass();
        boolean boolean22 = line9.Intersect(line16);
        java.lang.String str23 = line16.toString();
        double double24 = line16.slope;
        boolean boolean25 = line2.Intersect(line16);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str5.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str6.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str10.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str23.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test459");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.String str15 = line6.toString();
        Line line18 = new Line((double) (byte) 0, (double) 'a');
        double double19 = line18.slope;
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        double double23 = line22.slope;
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        line26.slope = 0.0d;
        boolean boolean29 = line22.Intersect(line26);
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        boolean boolean34 = line26.Intersect(line32);
        boolean boolean35 = line18.Intersect(line26);
        Line line38 = new Line((double) (byte) 0, (double) 'a');
        double double39 = line38.slope;
        Line line42 = new Line((double) (byte) 0, (double) 'a');
        line42.slope = 0.0d;
        boolean boolean45 = line38.Intersect(line42);
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        double double49 = line48.slope;
        boolean boolean50 = line42.Intersect(line48);
        line48.yintercept = 0.0d;
        Line line55 = new Line((double) (byte) 0, (double) 'a');
        double double56 = line55.slope;
        Line line59 = new Line((double) (byte) 0, (double) 'a');
        line59.slope = 0.0d;
        boolean boolean62 = line55.Intersect(line59);
        boolean boolean63 = line48.Intersect(line59);
        java.lang.Class<?> wildcardClass64 = line59.getClass();
        Line line67 = new Line((double) (byte) 0, (double) 'a');
        double double68 = line67.slope;
        Line line71 = new Line((double) (byte) 0, (double) 'a');
        line71.slope = 0.0d;
        boolean boolean74 = line67.Intersect(line71);
        double double75 = line71.yintercept;
        Line line78 = new Line(0.0d, (double) (-1L));
        boolean boolean79 = line71.Intersect(line78);
        java.lang.Class<?> wildcardClass80 = line71.getClass();
        boolean boolean81 = line59.Intersect(line71);
        boolean boolean82 = line26.Intersect(line71);
        java.lang.String str83 = line26.toString();
        line26.slope = 1L;
        boolean boolean86 = line6.Intersect(line26);
        java.lang.String str87 = line6.toString();
        line6.slope = 100.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str15.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 97.0d + "'", double75 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str83.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str87.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test460");
        Line line2 = new Line((double) 1.0f, 10.0d);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test461");
        Line line2 = new Line((double) 100L, 97.0d);
        line2.slope = 32.0d;
        line2.slope = '4';
        Line line9 = new Line((double) 100L, 97.0d);
        line9.slope = 32.0d;
        line9.yintercept = 100.0d;
        double double14 = line9.yintercept;
        java.lang.String str15 = line9.toString();
        boolean boolean16 = line2.Intersect(line9);
        double double17 = line2.yintercept;
        double double18 = line2.yintercept;
        line2.slope = ' ';
        java.lang.Class<?> wildcardClass21 = line2.getClass();
        double double22 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str15.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test462");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        double double16 = line8.yintercept;
        double double17 = line8.slope;
        boolean boolean18 = line2.Intersect(line8);
        line8.slope = (byte) 10;
        java.lang.String str21 = line8.toString();
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        double double25 = line24.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        line28.slope = 0.0d;
        boolean boolean31 = line24.Intersect(line28);
        double double32 = line28.yintercept;
        Line line35 = new Line(0.0d, (double) (-1L));
        boolean boolean36 = line28.Intersect(line35);
        Line line39 = new Line((double) 100L, (double) 100);
        java.lang.String str40 = line39.toString();
        boolean boolean41 = line28.Intersect(line39);
        line28.slope = (byte) 1;
        boolean boolean44 = line8.Intersect(line28);
        line8.yintercept = 52.0d;
        line8.yintercept = (byte) 10;
        line8.yintercept = 52.0d;
        double double51 = line8.yintercept;
        java.lang.Class<?> wildcardClass52 = line8.getClass();
        double double53 = line8.yintercept;
        double double54 = line8.slope;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str40.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 52.0d + "'", double51 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 52.0d + "'", double53 == 52.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test463");
        Line line2 = new Line((double) ' ', (double) 1);
        double double3 = line2.yintercept;
        line2.slope = ' ';
        double double6 = line2.slope;
        java.lang.String str7 = line2.toString();
        Line line10 = new Line((double) 10L, (double) ' ');
        line10.slope = 1L;
        double double13 = line10.slope;
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        Line line20 = new Line((double) (byte) 0, (double) 'a');
        line20.slope = 0.0d;
        boolean boolean23 = line16.Intersect(line20);
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        double double27 = line26.slope;
        boolean boolean28 = line20.Intersect(line26);
        java.lang.String str29 = line20.toString();
        double double30 = line20.slope;
        boolean boolean31 = line10.Intersect(line20);
        boolean boolean32 = line2.Intersect(line20);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "slope: 32.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str7.equals("slope: 32.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str29.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test464");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        java.lang.String str14 = line2.toString();
        line2.slope = 10.0d;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        boolean boolean31 = line23.Intersect(line29);
        java.lang.Class<?> wildcardClass32 = line23.getClass();
        java.lang.String str33 = line23.toString();
        Line line36 = new Line((double) (byte) 0, (double) 'a');
        double double37 = line36.slope;
        Line line40 = new Line((double) (byte) 0, (double) 'a');
        line40.slope = 0.0d;
        boolean boolean43 = line36.Intersect(line40);
        Line line46 = new Line((double) (byte) 0, (double) 'a');
        double double47 = line46.slope;
        boolean boolean48 = line40.Intersect(line46);
        java.lang.Class<?> wildcardClass49 = line40.getClass();
        java.lang.String str50 = line40.toString();
        boolean boolean51 = line23.Intersect(line40);
        java.lang.Class<?> wildcardClass52 = line23.getClass();
        double double53 = line23.slope;
        boolean boolean54 = line2.Intersect(line23);
        java.lang.String str55 = line23.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str14.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str50.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str55.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test465");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        java.lang.String str16 = line6.toString();
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        boolean boolean31 = line23.Intersect(line29);
        java.lang.Class<?> wildcardClass32 = line23.getClass();
        java.lang.String str33 = line23.toString();
        boolean boolean34 = line6.Intersect(line23);
        line23.slope = 97.0d;
        line23.slope = (-1L);
        java.lang.Class<?> wildcardClass39 = line23.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test466");
        Line line2 = new Line((double) 10L, (double) ' ');
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        double double4 = line2.slope;
        Line line7 = new Line((double) 'a', (double) (byte) 10);
        line7.slope = (short) 100;
        line7.slope = 97.0d;
        boolean boolean12 = line2.Intersect(line7);
        java.lang.Class<?> wildcardClass13 = line7.getClass();
        java.lang.String str14 = line7.toString();
        java.lang.Class<?> wildcardClass15 = line7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str14.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test467");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        double double15 = line6.slope;
        line6.yintercept = 1L;
        line6.slope = 1;
        double double20 = line6.slope;
        double double21 = line6.slope;
        Line line24 = new Line((double) (byte) 100, (double) 1L);
        boolean boolean25 = line6.Intersect(line24);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test468");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.String str15 = line6.toString();
        Line line18 = new Line((double) (byte) 0, (double) 'a');
        double double19 = line18.slope;
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        double double23 = line22.slope;
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        line26.slope = 0.0d;
        boolean boolean29 = line22.Intersect(line26);
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        boolean boolean34 = line26.Intersect(line32);
        boolean boolean35 = line18.Intersect(line26);
        Line line38 = new Line((double) (byte) 0, (double) 'a');
        double double39 = line38.slope;
        Line line42 = new Line((double) (byte) 0, (double) 'a');
        line42.slope = 0.0d;
        boolean boolean45 = line38.Intersect(line42);
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        double double49 = line48.slope;
        boolean boolean50 = line42.Intersect(line48);
        line48.yintercept = 0.0d;
        Line line55 = new Line((double) (byte) 0, (double) 'a');
        double double56 = line55.slope;
        Line line59 = new Line((double) (byte) 0, (double) 'a');
        line59.slope = 0.0d;
        boolean boolean62 = line55.Intersect(line59);
        boolean boolean63 = line48.Intersect(line59);
        java.lang.Class<?> wildcardClass64 = line59.getClass();
        Line line67 = new Line((double) (byte) 0, (double) 'a');
        double double68 = line67.slope;
        Line line71 = new Line((double) (byte) 0, (double) 'a');
        line71.slope = 0.0d;
        boolean boolean74 = line67.Intersect(line71);
        double double75 = line71.yintercept;
        Line line78 = new Line(0.0d, (double) (-1L));
        boolean boolean79 = line71.Intersect(line78);
        java.lang.Class<?> wildcardClass80 = line71.getClass();
        boolean boolean81 = line59.Intersect(line71);
        boolean boolean82 = line26.Intersect(line71);
        java.lang.String str83 = line26.toString();
        line26.slope = 1L;
        boolean boolean86 = line6.Intersect(line26);
        line6.slope = (short) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str15.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 97.0d + "'", double75 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str83.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test469");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        java.lang.String str16 = line6.toString();
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        boolean boolean31 = line23.Intersect(line29);
        java.lang.Class<?> wildcardClass32 = line23.getClass();
        java.lang.String str33 = line23.toString();
        boolean boolean34 = line6.Intersect(line23);
        double double35 = line6.yintercept;
        line6.slope = 32.0d;
        java.lang.Class<?> wildcardClass38 = line6.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 97.0d + "'", double35 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test470");
        Line line2 = new Line(97.0d, (double) (short) -1);
        java.lang.String str3 = line2.toString();
        java.lang.String str4 = line2.toString();
        double double5 = line2.slope;
        line2.slope = 'a';
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str3.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str4.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test471");
        Line line2 = new Line((double) 0.0f, (double) (byte) 100);
        java.lang.String str3 = line2.toString();
        double double4 = line2.slope;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 0.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str3.equals("slope: 0.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test472");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        Line line42 = new Line((double) ' ', (double) 1);
        boolean boolean43 = line2.Intersect(line42);
        java.lang.Class<?> wildcardClass44 = line42.getClass();
        java.lang.String str45 = line42.toString();
        java.lang.String str46 = line42.toString();
        Line line49 = new Line((double) (byte) 0, (double) 'a');
        line49.slope = (short) 100;
        boolean boolean52 = line42.Intersect(line49);
        line49.yintercept = 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "slope: 32.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str45.equals("slope: 32.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "slope: 32.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str46.equals("slope: 32.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test473");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        double double16 = line8.yintercept;
        double double17 = line8.slope;
        boolean boolean18 = line2.Intersect(line8);
        line8.slope = (byte) 10;
        Line line23 = new Line((double) ' ', (double) 1);
        line23.yintercept = 100.0f;
        java.lang.Class<?> wildcardClass26 = line23.getClass();
        line23.slope = 0.0d;
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        Line line41 = new Line((double) (byte) 0, (double) 'a');
        double double42 = line41.slope;
        boolean boolean43 = line35.Intersect(line41);
        double double44 = line35.slope;
        line35.yintercept = 1L;
        line35.slope = 1;
        boolean boolean49 = line23.Intersect(line35);
        boolean boolean50 = line8.Intersect(line23);
        line8.yintercept = 1.0d;
        line8.yintercept = 1.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test474");
        Line line2 = new Line(0.0d, (double) (short) -1);
        Line line5 = new Line((double) 10L, (double) ' ');
        line5.slope = 1L;
        double double8 = line5.slope;
        double double9 = line5.slope;
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line5.Intersect(line12);
        line5.yintercept = 10;
        java.lang.Class<?> wildcardClass16 = line5.getClass();
        boolean boolean17 = line2.Intersect(line5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test475");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        double double14 = line2.slope;
        double double15 = line2.slope;
        double double16 = line2.slope;
        line2.slope = 10.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test476");
        Line line2 = new Line((double) 100L, (double) 0L);
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        Line line4 = null;
        try {
            boolean boolean5 = line2.Intersect(line4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test477");
        Line line2 = new Line((double) 1, (double) (byte) 10);
        double double3 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test478");
        Line line2 = new Line((double) ' ', (double) 1);
        java.lang.String str3 = line2.toString();
        double double4 = line2.yintercept;
        line2.slope = (byte) 10;
        line2.slope = 0;
        line2.yintercept = (-1.0f);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 32.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str3.equals("slope: 32.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test479");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        Line line17 = new Line((double) 100L, (double) 100);
        java.lang.String str18 = line17.toString();
        boolean boolean19 = line6.Intersect(line17);
        double double20 = line6.yintercept;
        java.lang.Class<?> wildcardClass21 = line6.getClass();
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        double double25 = line24.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        line28.slope = 0.0d;
        boolean boolean31 = line24.Intersect(line28);
        Line line34 = new Line((double) ' ', (double) '4');
        boolean boolean35 = line24.Intersect(line34);
        double double36 = line24.slope;
        double double37 = line24.yintercept;
        boolean boolean38 = line6.Intersect(line24);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str18.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 97.0d + "'", double37 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test480");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        line2.slope = 0.0d;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean8 = line2.Intersect(line7);
        line7.yintercept = 0.0f;
        java.lang.String str11 = line7.toString();
        double double12 = line7.yintercept;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 0.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str11.equals("slope: 0.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test481");
        Line line2 = new Line(100.0d, 10.0d);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test482");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 10;
        line12.yintercept = (byte) 0;
        line12.slope = 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test483");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        line2.slope = 0.0d;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean8 = line2.Intersect(line7);
        line2.yintercept = (byte) 1;
        line2.yintercept = 97.0d;
        line2.slope = 0L;
        line2.yintercept = 1;
        Line line19 = new Line(100.0d, (double) 'a');
        Line line22 = new Line((double) 'a', (double) (byte) 10);
        double double23 = line22.yintercept;
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        line26.slope = 0.0d;
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean32 = line26.Intersect(line31);
        line26.yintercept = (byte) 1;
        boolean boolean35 = line22.Intersect(line26);
        line22.yintercept = (short) -1;
        boolean boolean38 = line19.Intersect(line22);
        line22.slope = 52.0d;
        boolean boolean41 = line2.Intersect(line22);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test484");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        Line line42 = new Line((double) ' ', (double) 1);
        boolean boolean43 = line2.Intersect(line42);
        java.lang.String str44 = line2.toString();
        line2.slope = 52.0d;
        Line line49 = new Line((double) (byte) 0, (double) 'a');
        line49.slope = 0.0d;
        Line line54 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean55 = line49.Intersect(line54);
        line54.yintercept = '4';
        boolean boolean58 = line2.Intersect(line54);
        line54.yintercept = ' ';
        double double61 = line54.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str44.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test485");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.yintercept = 10;
        line12.yintercept = (byte) 0;
        Line line21 = new Line((double) 100L, 97.0d);
        line21.slope = 32.0d;
        line21.slope = '4';
        boolean boolean26 = line12.Intersect(line21);
        line12.slope = '#';
        Line line31 = new Line((double) 10L, (double) ' ');
        line31.slope = 1L;
        double double34 = line31.slope;
        double double35 = line31.slope;
        Line line38 = new Line((double) ' ', (double) '4');
        boolean boolean39 = line31.Intersect(line38);
        java.lang.String str40 = line38.toString();
        java.lang.String str41 = line38.toString();
        line38.slope = 97.0d;
        boolean boolean44 = line12.Intersect(line38);
        java.lang.String str45 = line38.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: 32.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str40.equals("slope: 32.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "slope: 32.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str41.equals("slope: 32.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "slope: 97.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str45.equals("slope: 97.0, yintercept: 52.0, epsilon:1.0E-6"));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test486");
        Line line2 = new Line((double) (byte) 10, (double) (byte) 0);
        double double3 = line2.slope;
        line2.slope = (short) -1;
        double double6 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test487");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        double double14 = line13.slope;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        line17.slope = 0.0d;
        boolean boolean20 = line13.Intersect(line17);
        double double21 = line17.yintercept;
        boolean boolean22 = line2.Intersect(line17);
        line17.slope = '#';
        double double25 = line17.yintercept;
        Line line28 = new Line((double) (-1), (double) 0);
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        double double36 = line35.slope;
        Line line39 = new Line((double) (byte) 0, (double) 'a');
        line39.slope = 0.0d;
        boolean boolean42 = line35.Intersect(line39);
        Line line45 = new Line((double) (byte) 0, (double) 'a');
        double double46 = line45.slope;
        boolean boolean47 = line39.Intersect(line45);
        boolean boolean48 = line31.Intersect(line39);
        Line line51 = new Line((double) 10L, (double) ' ');
        line51.slope = 1L;
        double double54 = line51.slope;
        Line line57 = new Line((double) (byte) 0, (double) 'a');
        double double58 = line57.slope;
        Line line61 = new Line((double) (byte) 0, (double) 'a');
        line61.slope = 0.0d;
        boolean boolean64 = line57.Intersect(line61);
        double double65 = line57.yintercept;
        double double66 = line57.slope;
        boolean boolean67 = line51.Intersect(line57);
        boolean boolean68 = line31.Intersect(line57);
        Line line71 = new Line((double) ' ', (double) 1);
        boolean boolean72 = line31.Intersect(line71);
        boolean boolean73 = line28.Intersect(line71);
        double double74 = line71.slope;
        boolean boolean75 = line17.Intersect(line71);
        line71.yintercept = (byte) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 97.0d + "'", double65 == 97.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 32.0d + "'", double74 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test488");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        line12.slope = 0.0d;
        boolean boolean15 = line8.Intersect(line12);
        double double16 = line8.yintercept;
        double double17 = line8.slope;
        boolean boolean18 = line2.Intersect(line8);
        line8.slope = (byte) 10;
        java.lang.String str21 = line8.toString();
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        double double25 = line24.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        line28.slope = 0.0d;
        boolean boolean31 = line24.Intersect(line28);
        double double32 = line28.yintercept;
        Line line35 = new Line(0.0d, (double) (-1L));
        boolean boolean36 = line28.Intersect(line35);
        Line line39 = new Line((double) 100L, (double) 100);
        java.lang.String str40 = line39.toString();
        boolean boolean41 = line28.Intersect(line39);
        line28.slope = (byte) 1;
        boolean boolean44 = line8.Intersect(line28);
        Line line47 = new Line((double) (byte) 0, (double) 'a');
        double double48 = line47.slope;
        Line line51 = new Line((double) (byte) 0, (double) 'a');
        line51.slope = 0.0d;
        boolean boolean54 = line47.Intersect(line51);
        Line line57 = new Line((double) (byte) 0, (double) 'a');
        double double58 = line57.slope;
        boolean boolean59 = line51.Intersect(line57);
        java.lang.Class<?> wildcardClass60 = line57.getClass();
        double double61 = line57.slope;
        boolean boolean62 = line8.Intersect(line57);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str40.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test489");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        java.lang.String str16 = line6.toString();
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        boolean boolean31 = line23.Intersect(line29);
        java.lang.Class<?> wildcardClass32 = line23.getClass();
        java.lang.String str33 = line23.toString();
        boolean boolean34 = line6.Intersect(line23);
        java.lang.Class<?> wildcardClass35 = line6.getClass();
        double double36 = line6.yintercept;
        java.lang.String str37 = line6.toString();
        line6.yintercept = (byte) -1;
        java.lang.String str40 = line6.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str37.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str40.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test490");
        Line line2 = new Line((double) 'a', (double) 1L);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test491");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        double double14 = line2.yintercept;
        line2.yintercept = (-1.0f);
        line2.slope = 100.0d;
        line2.yintercept = 10;
        double double21 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test492");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        double double14 = line12.yintercept;
        line12.yintercept = 100;
        java.lang.Class<?> wildcardClass17 = line12.getClass();
        java.lang.String str18 = line12.toString();
        java.lang.Class<?> wildcardClass19 = line12.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str18.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test493");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = (short) 100;
        line2.slope = 97.0d;
        line2.yintercept = (-1L);
        java.lang.String str9 = line2.toString();
        double double10 = line2.yintercept;
        java.lang.String str11 = line2.toString();
        java.lang.String str12 = line2.toString();
        Line line15 = new Line((double) 100L, (double) (short) -1);
        java.lang.Class<?> wildcardClass16 = line15.getClass();
        Line line19 = new Line((double) 10L, (double) ' ');
        line19.slope = 1L;
        double double22 = line19.slope;
        Line line25 = new Line((double) (byte) 0, (double) 'a');
        double double26 = line25.slope;
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        line29.slope = 0.0d;
        boolean boolean32 = line25.Intersect(line29);
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        double double36 = line35.slope;
        boolean boolean37 = line29.Intersect(line35);
        java.lang.String str38 = line29.toString();
        double double39 = line29.slope;
        boolean boolean40 = line19.Intersect(line29);
        Line line43 = new Line((double) 10L, (double) ' ');
        line43.slope = 1L;
        double double46 = line43.slope;
        double double47 = line43.slope;
        Line line50 = new Line((double) ' ', (double) '4');
        boolean boolean51 = line43.Intersect(line50);
        line50.slope = 97.0d;
        double double54 = line50.yintercept;
        boolean boolean55 = line19.Intersect(line50);
        boolean boolean56 = line15.Intersect(line19);
        Line line59 = new Line((double) 0.0f, (double) 1);
        line59.slope = 97.0d;
        double double62 = line59.slope;
        line59.slope = 0.0d;
        java.lang.Class<?> wildcardClass65 = line59.getClass();
        double double66 = line59.yintercept;
        boolean boolean67 = line15.Intersect(line59);
        Line line70 = new Line((double) 100L, 97.0d);
        line70.slope = 32.0d;
        line70.yintercept = 100.0d;
        double double75 = line70.yintercept;
        java.lang.String str76 = line70.toString();
        java.lang.Class<?> wildcardClass77 = line70.getClass();
        Line line80 = new Line((double) 'a', (double) (byte) 10);
        double double81 = line80.slope;
        line80.yintercept = 10.0f;
        double double84 = line80.slope;
        Line line87 = new Line((double) ' ', (double) 1);
        line87.yintercept = 100.0f;
        boolean boolean90 = line80.Intersect(line87);
        boolean boolean91 = line70.Intersect(line80);
        boolean boolean92 = line15.Intersect(line70);
        boolean boolean93 = line2.Intersect(line70);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str11.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str12.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str38.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 52.0d + "'", double54 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 97.0d + "'", double62 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 1.0d + "'", double66 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 100.0d + "'", double75 == 100.0d);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str76.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 97.0d + "'", double81 == 97.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 97.0d + "'", double84 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test494");
        Line line2 = new Line((double) '4', (double) 0L);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test495");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        boolean boolean19 = line2.Intersect(line10);
        Line line22 = new Line((double) 10L, (double) ' ');
        line22.slope = 1L;
        double double25 = line22.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        double double36 = line28.yintercept;
        double double37 = line28.slope;
        boolean boolean38 = line22.Intersect(line28);
        boolean boolean39 = line2.Intersect(line28);
        Line line42 = new Line((double) ' ', (double) 1);
        boolean boolean43 = line2.Intersect(line42);
        java.lang.Class<?> wildcardClass44 = line42.getClass();
        java.lang.String str45 = line42.toString();
        java.lang.String str46 = line42.toString();
        Line line49 = new Line((double) (byte) 0, (double) 'a');
        line49.slope = (short) 100;
        boolean boolean52 = line42.Intersect(line49);
        double double53 = line42.yintercept;
        java.lang.String str54 = line42.toString();
        java.lang.String str55 = line42.toString();
        java.lang.String str56 = line42.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "slope: 32.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str45.equals("slope: 32.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "slope: 32.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str46.equals("slope: 32.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "slope: 32.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str54.equals("slope: 32.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "slope: 32.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str55.equals("slope: 32.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "slope: 32.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str56.equals("slope: 32.0, yintercept: 1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test496");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        double double3 = line2.yintercept;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        Line line11 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean12 = line6.Intersect(line11);
        line6.yintercept = (byte) 1;
        boolean boolean15 = line2.Intersect(line6);
        line2.yintercept = (short) -1;
        line2.yintercept = 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test497");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        double double15 = line6.slope;
        java.lang.String str16 = line6.toString();
        java.lang.Class<?> wildcardClass17 = line6.getClass();
        java.lang.String str18 = line6.toString();
        Line line21 = new Line((double) 10L, (double) ' ');
        java.lang.Class<?> wildcardClass22 = line21.getClass();
        double double23 = line21.slope;
        Line line26 = new Line((double) 'a', (double) (byte) 10);
        line26.slope = (short) 100;
        line26.slope = 97.0d;
        boolean boolean31 = line21.Intersect(line26);
        java.lang.Class<?> wildcardClass32 = line26.getClass();
        double double33 = line26.slope;
        java.lang.String str34 = line26.toString();
        boolean boolean35 = line6.Intersect(line26);
        java.lang.Class<?> wildcardClass36 = line26.getClass();
        double double37 = line26.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str18.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 97.0d + "'", double33 == 97.0d);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str34.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test498");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        java.lang.Class<?> wildcardClass15 = line6.getClass();
        line6.yintercept = 1.0d;
        line6.yintercept = 0.0d;
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        double double23 = line22.slope;
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        line26.slope = 0.0d;
        boolean boolean29 = line22.Intersect(line26);
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        boolean boolean34 = line26.Intersect(line32);
        line32.yintercept = 0.0d;
        Line line39 = new Line((double) (byte) 0, (double) 'a');
        double double40 = line39.slope;
        Line line43 = new Line((double) (byte) 0, (double) 'a');
        line43.slope = 0.0d;
        boolean boolean46 = line39.Intersect(line43);
        boolean boolean47 = line32.Intersect(line43);
        java.lang.Class<?> wildcardClass48 = line43.getClass();
        Line line51 = new Line((double) (byte) 0, (double) 'a');
        double double52 = line51.slope;
        Line line55 = new Line((double) (byte) 0, (double) 'a');
        line55.slope = 0.0d;
        boolean boolean58 = line51.Intersect(line55);
        double double59 = line55.yintercept;
        Line line62 = new Line(0.0d, (double) (-1L));
        boolean boolean63 = line55.Intersect(line62);
        java.lang.Class<?> wildcardClass64 = line55.getClass();
        boolean boolean65 = line43.Intersect(line55);
        Line line68 = new Line((double) (byte) 0, (double) 'a');
        double double69 = line68.slope;
        Line line72 = new Line((double) (byte) 0, (double) 'a');
        line72.slope = 0.0d;
        boolean boolean75 = line68.Intersect(line72);
        double double76 = line72.yintercept;
        Line line79 = new Line(0.0d, (double) (-1L));
        boolean boolean80 = line72.Intersect(line79);
        double double81 = line72.slope;
        java.lang.String str82 = line72.toString();
        boolean boolean83 = line43.Intersect(line72);
        boolean boolean84 = line6.Intersect(line72);
        double double85 = line6.slope;
        java.lang.Class<?> wildcardClass86 = line6.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 97.0d + "'", double59 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 97.0d + "'", double76 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str82.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test499");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        double double14 = line13.slope;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        line17.slope = 0.0d;
        boolean boolean20 = line13.Intersect(line17);
        double double21 = line17.yintercept;
        boolean boolean22 = line2.Intersect(line17);
        line17.yintercept = 100.0f;
        java.lang.Class<?> wildcardClass25 = line17.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test500");
        Line line2 = new Line((double) (byte) 10, (double) ' ');
    }
}

