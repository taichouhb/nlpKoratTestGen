import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test001");
        Line line2 = new Line((double) (byte) 0, (double) 100L);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test002");
        Line line2 = new Line((double) 100.0f, 100.0d);
        Line line5 = new Line((double) (short) -1, 32.0d);
        boolean boolean6 = line2.Intersect(line5);
        java.lang.Class<?> wildcardClass7 = line2.getClass();
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        double double11 = line10.slope;
        Line line14 = new Line((double) (byte) 0, (double) 'a');
        double double15 = line14.slope;
        Line line18 = new Line((double) (byte) 0, (double) 'a');
        line18.slope = 0.0d;
        boolean boolean21 = line14.Intersect(line18);
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        double double25 = line24.slope;
        boolean boolean26 = line18.Intersect(line24);
        boolean boolean27 = line10.Intersect(line18);
        Line line30 = new Line((double) 10L, (double) ' ');
        line30.slope = 1L;
        double double33 = line30.slope;
        Line line36 = new Line((double) (byte) 0, (double) 'a');
        double double37 = line36.slope;
        Line line40 = new Line((double) (byte) 0, (double) 'a');
        line40.slope = 0.0d;
        boolean boolean43 = line36.Intersect(line40);
        double double44 = line36.yintercept;
        double double45 = line36.slope;
        boolean boolean46 = line30.Intersect(line36);
        line36.slope = (byte) 10;
        java.lang.String str49 = line36.toString();
        Line line52 = new Line((double) (byte) 0, (double) 'a');
        double double53 = line52.slope;
        Line line56 = new Line((double) (byte) 0, (double) 'a');
        line56.slope = 0.0d;
        boolean boolean59 = line52.Intersect(line56);
        double double60 = line56.yintercept;
        Line line63 = new Line(0.0d, (double) (-1L));
        boolean boolean64 = line56.Intersect(line63);
        Line line67 = new Line((double) 100L, (double) 100);
        java.lang.String str68 = line67.toString();
        boolean boolean69 = line56.Intersect(line67);
        line56.slope = (byte) 1;
        boolean boolean72 = line36.Intersect(line56);
        boolean boolean73 = line18.Intersect(line36);
        double double74 = line36.slope;
        double double75 = line36.slope;
        boolean boolean76 = line2.Intersect(line36);
        double double77 = line36.yintercept;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 97.0d + "'", double44 == 97.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str49.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 97.0d + "'", double60 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str68.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 10.0d + "'", double74 == 10.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 10.0d + "'", double75 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 97.0d + "'", double77 == 97.0d);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test003");
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
        line2.yintercept = (byte) 0;
        Line line30 = new Line((double) 10L, (double) ' ');
        line30.slope = 1L;
        boolean boolean33 = line2.Intersect(line30);
        double double34 = line30.slope;
        Line line37 = new Line((double) 10L, (double) ' ');
        Line line40 = new Line((double) 10L, (double) ' ');
        line40.slope = 1L;
        double double43 = line40.slope;
        double double44 = line40.slope;
        double double45 = line40.yintercept;
        boolean boolean46 = line37.Intersect(line40);
        double double47 = line40.slope;
        boolean boolean48 = line30.Intersect(line40);
        line30.yintercept = 0.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 32.0d + "'", double45 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test004");
        Line line2 = new Line((double) 0L, (double) 1.0f);
        double double3 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test005");
        Line line2 = new Line((double) (short) -1, (double) (short) 1);
        Line line5 = new Line((-1.0d), (double) 100);
        double double6 = line5.slope;
        Line line9 = new Line((double) 'a', (double) (byte) 10);
        double double10 = line9.slope;
        line9.yintercept = 10.0f;
        double double13 = line9.slope;
        double double14 = line9.slope;
        line9.yintercept = ' ';
        boolean boolean17 = line5.Intersect(line9);
        boolean boolean18 = line2.Intersect(line9);
        line9.slope = (byte) 10;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test006");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        double double4 = line2.slope;
        double double5 = line2.slope;
        double double6 = line2.yintercept;
        double double7 = line2.slope;
        java.lang.Class<?> wildcardClass8 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test007");
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
        java.lang.String str71 = line52.toString();
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
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str71.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test008");
        Line line2 = new Line((double) 100L, (double) 100);
        java.lang.String str3 = line2.toString();
        double double4 = line2.slope;
        double double5 = line2.slope;
        line2.yintercept = 100.0d;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str3.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test009");
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
        double double67 = line52.yintercept;
        Line line70 = new Line((double) 100L, (double) 100);
        java.lang.String str71 = line70.toString();
        Line line74 = new Line(10.0d, (double) 0L);
        Line line77 = new Line((double) 'a', (double) (byte) 10);
        line77.yintercept = (-1.0f);
        boolean boolean80 = line74.Intersect(line77);
        java.lang.Class<?> wildcardClass81 = line77.getClass();
        java.lang.Class<?> wildcardClass82 = line77.getClass();
        boolean boolean83 = line70.Intersect(line77);
        java.lang.String str84 = line77.toString();
        java.lang.String str85 = line77.toString();
        boolean boolean86 = line52.Intersect(line77);
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
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 97.0d + "'", double67 == 97.0d);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str71.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str84.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str85.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test010");
        Line line2 = new Line((double) '#', (double) 0.0f);
        double double3 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test011");
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
        double double30 = line25.yintercept;
        double double31 = line25.yintercept;
        double double32 = line25.slope;
        double double33 = line25.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 97.0d + "'", double28 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 97.0d + "'", double30 == 97.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 97.0d + "'", double31 == 97.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test012");
        Line line2 = new Line((double) (-1.0f), (double) 100);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test013");
        Line line2 = new Line(10.0d, (double) 10);
        line2.slope = 100L;
        line2.yintercept = (short) 1;
        java.lang.Class<?> wildcardClass7 = line2.getClass();
        Line line10 = new Line((double) 100L, 97.0d);
        boolean boolean11 = line2.Intersect(line10);
        java.lang.String str12 = line2.toString();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "slope: 100.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str12.equals("slope: 100.0, yintercept: 1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test014");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        double double11 = line10.slope;
        Line line14 = new Line((double) (byte) 0, (double) 'a');
        line14.slope = 0.0d;
        boolean boolean17 = line10.Intersect(line14);
        Line line20 = new Line((double) (byte) 0, (double) 'a');
        double double21 = line20.slope;
        boolean boolean22 = line14.Intersect(line20);
        java.lang.String str23 = line14.toString();
        double double24 = line14.slope;
        boolean boolean25 = line6.Intersect(line14);
        java.lang.Class<?> wildcardClass26 = line6.getClass();
        boolean boolean27 = line2.Intersect(line6);
        double double28 = line2.yintercept;
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        line31.slope = 0.0d;
        Line line36 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean37 = line31.Intersect(line36);
        line36.yintercept = '4';
        boolean boolean40 = line2.Intersect(line36);
        Line line43 = new Line(0.0d, (double) '4');
        boolean boolean44 = line36.Intersect(line43);
        Line line47 = new Line((double) 10L, (double) ' ');
        line47.slope = 1L;
        double double50 = line47.slope;
        Line line53 = new Line((double) (byte) 0, (double) 'a');
        double double54 = line53.slope;
        Line line57 = new Line((double) (byte) 0, (double) 'a');
        line57.slope = 0.0d;
        boolean boolean60 = line53.Intersect(line57);
        double double61 = line53.yintercept;
        double double62 = line53.slope;
        boolean boolean63 = line47.Intersect(line53);
        line53.slope = (byte) 10;
        double double66 = line53.slope;
        Line line69 = new Line((double) (short) -1, 32.0d);
        boolean boolean70 = line53.Intersect(line69);
        boolean boolean71 = line43.Intersect(line69);
        double double72 = line69.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str23.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 97.0d + "'", double61 == 97.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 32.0d + "'", double72 == 32.0d);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test015");
        Line line2 = new Line((double) '4', (double) (byte) -1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test016");
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
        line2.slope = (short) 1;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test017");
        Line line2 = new Line(10.0d, (double) 1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test018");
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
        line5.slope = (-1L);
        line5.slope = 35.0d;
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test019");
        Line line2 = new Line((double) 100.0f, 100.0d);
        Line line5 = new Line((double) (short) -1, 32.0d);
        boolean boolean6 = line2.Intersect(line5);
        double double7 = line5.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        double double11 = line10.slope;
        java.lang.Class<?> wildcardClass12 = line10.getClass();
        double double13 = line10.yintercept;
        boolean boolean14 = line5.Intersect(line10);
        java.lang.String str15 = line10.toString();
        double double16 = line10.slope;
        java.lang.String str17 = line10.toString();
        java.lang.String str18 = line10.toString();
        double double19 = line10.yintercept;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str15.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str17.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str18.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test020");
        Line line2 = new Line((-1.0d), 10.0d);
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        double double4 = line2.yintercept;
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        line2.slope = 0.0d;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test021");
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
        line23.slope = (short) 100;
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test022");
        Line line2 = new Line((double) 10L, (double) ' ');
        java.lang.String str3 = line2.toString();
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        Line line7 = new Line(0.0d, (double) (short) -1);
        line7.yintercept = 10;
        boolean boolean10 = line2.Intersect(line7);
        line7.slope = 100L;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 10.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str3.equals("slope: 10.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test023");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        java.lang.Class<?> wildcardClass11 = line2.getClass();
        double double12 = line2.yintercept;
        java.lang.Class<?> wildcardClass13 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test024");
        Line line2 = new Line((double) 0L, (double) 100.0f);
        line2.yintercept = 100.0f;
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test025");
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
        java.lang.String str19 = line10.toString();
        double double20 = line10.slope;
        boolean boolean21 = line2.Intersect(line10);
        double double22 = line10.yintercept;
        double double23 = line10.slope;
        double double24 = line10.yintercept;
        line10.yintercept = 1;
        double double27 = line10.slope;
        java.lang.String str28 = line10.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str19.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "slope: 0.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str28.equals("slope: 0.0, yintercept: 1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test026");
        Line line2 = new Line((double) (short) 100, (double) '4');
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test027");
        Line line2 = new Line((double) (short) 1, (double) (byte) 1);
        Line line5 = new Line((double) '4', (double) (byte) 10);
        line5.yintercept = (short) 100;
        boolean boolean8 = line2.Intersect(line5);
        double double9 = line5.slope;
        double double10 = line5.yintercept;
        line5.slope = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test028");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        java.lang.Class<?> wildcardClass8 = line6.getClass();
        double double9 = line6.yintercept;
        boolean boolean10 = line2.Intersect(line6);
        line2.slope = 10L;
        double double13 = line2.yintercept;
        line2.yintercept = (byte) 0;
        line2.yintercept = (byte) 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test029");
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
        java.lang.String str19 = line10.toString();
        double double20 = line10.slope;
        boolean boolean21 = line2.Intersect(line10);
        double double22 = line10.yintercept;
        double double23 = line10.slope;
        double double24 = line10.yintercept;
        java.lang.Class<?> wildcardClass25 = line10.getClass();
        line10.yintercept = 0.0d;
        line10.yintercept = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str19.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test030");
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
        java.lang.Class<?> wildcardClass45 = line28.getClass();
        double double46 = line28.yintercept;
        java.lang.String str47 = line28.toString();
        line28.yintercept = 0.0d;
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
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 97.0d + "'", double46 == 97.0d);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "slope: 35.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str47.equals("slope: 35.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test031");
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
        double double22 = line8.slope;
        java.lang.Class<?> wildcardClass23 = line8.getClass();
        Line line26 = new Line((double) 100L, (double) 100);
        java.lang.String str27 = line26.toString();
        line26.slope = 0.0f;
        double double30 = line26.slope;
        boolean boolean31 = line8.Intersect(line26);
        double double32 = line26.yintercept;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str19.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str27.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test032");
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
        line38.yintercept = (short) 0;
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
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test033");
        Line line2 = new Line((-1.0d), 10.0d);
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        double double4 = line2.slope;
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test034");
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
        java.lang.String str19 = line10.toString();
        double double20 = line10.slope;
        boolean boolean21 = line2.Intersect(line10);
        java.lang.Class<?> wildcardClass22 = line2.getClass();
        java.lang.Class<?> wildcardClass23 = line2.getClass();
        Line line26 = new Line((double) 10L, (double) ' ');
        line26.slope = 1L;
        double double29 = line26.slope;
        double double30 = line26.slope;
        Line line33 = new Line((double) ' ', (double) '4');
        boolean boolean34 = line26.Intersect(line33);
        java.lang.String str35 = line33.toString();
        java.lang.String str36 = line33.toString();
        java.lang.Class<?> wildcardClass37 = line33.getClass();
        boolean boolean38 = line2.Intersect(line33);
        java.lang.String str39 = line2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str19.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "slope: 32.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str35.equals("slope: 32.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "slope: 32.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str36.equals("slope: 32.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str39.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test035");
        Line line2 = new Line(97.0d, (double) (short) -1);
        line2.slope = (-1.0f);
        line2.slope = 10.0d;
        line2.slope = (-1L);
        java.lang.Class<?> wildcardClass9 = line2.getClass();
        Line line12 = new Line((double) (short) 1, 0.0d);
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        double double16 = line15.slope;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        line19.slope = 0.0d;
        boolean boolean22 = line15.Intersect(line19);
        double double23 = line19.yintercept;
        line19.yintercept = (-1);
        java.lang.String str26 = line19.toString();
        line19.slope = 1L;
        boolean boolean29 = line12.Intersect(line19);
        double double30 = line12.yintercept;
        boolean boolean31 = line2.Intersect(line12);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 97.0d + "'", double23 == 97.0d);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str26.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test036");
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
        double double55 = line23.slope;
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
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test037");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        double double8 = line7.slope;
        Line line11 = new Line((double) (byte) 0, (double) 'a');
        line11.slope = 0.0d;
        boolean boolean14 = line7.Intersect(line11);
        double double15 = line11.yintercept;
        Line line18 = new Line(0.0d, (double) (-1L));
        boolean boolean19 = line11.Intersect(line18);
        double double20 = line18.slope;
        boolean boolean21 = line2.Intersect(line18);
        line18.yintercept = (byte) 100;
        double double24 = line18.yintercept;
        line18.slope = 10.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test038");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        line2.slope = (short) 100;
        double double5 = line2.yintercept;
        line2.slope = (byte) 10;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test039");
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
        double double24 = line2.yintercept;
        line2.slope = 100.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test040");
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
        line8.slope = 10;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test041");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = (short) 100;
        line2.slope = 97.0d;
        line2.yintercept = (-1L);
        java.lang.String str9 = line2.toString();
        double double10 = line2.yintercept;
        java.lang.Class<?> wildcardClass11 = line2.getClass();
        java.lang.String str12 = line2.toString();
        line2.yintercept = 35.0d;
        java.lang.String str15 = line2.toString();
        java.lang.Class<?> wildcardClass16 = line2.getClass();
        Line line19 = new Line((double) '4', (double) (byte) 1);
        line19.yintercept = ' ';
        line19.slope = 10.0d;
        double double24 = line19.slope;
        boolean boolean25 = line2.Intersect(line19);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str12.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "slope: 97.0, yintercept: 35.0, epsilon:1.0E-6" + "'", str15.equals("slope: 97.0, yintercept: 35.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test042");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        line2.slope = 0.0d;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean8 = line2.Intersect(line7);
        line7.slope = (short) 1;
        Line line13 = new Line((double) 10L, (double) ' ');
        line13.slope = 1L;
        double double16 = line13.slope;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        double double27 = line19.yintercept;
        double double28 = line19.slope;
        boolean boolean29 = line13.Intersect(line19);
        java.lang.String str30 = line19.toString();
        double double31 = line19.yintercept;
        java.lang.String str32 = line19.toString();
        java.lang.String str33 = line19.toString();
        boolean boolean34 = line7.Intersect(line19);
        line7.yintercept = 100.0d;
        line7.slope = 100.0d;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 97.0d + "'", double27 == 97.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str30.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 97.0d + "'", double31 == 97.0d);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str32.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test043");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.yintercept;
        double double6 = line2.yintercept;
        java.lang.String str7 = line2.toString();
        line2.yintercept = (-1);
        line2.yintercept = 0.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "slope: 1.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str7.equals("slope: 1.0, yintercept: 32.0, epsilon:1.0E-6"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test044");
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
        java.lang.String str49 = line43.toString();
        line43.slope = 100;
        double double52 = line43.yintercept;
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
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str49.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 97.0d + "'", double52 == 97.0d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test045");
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
        java.lang.String str99 = line18.toString();
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
        org.junit.Assert.assertTrue("'" + str99 + "' != '" + "slope: 97.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str99.equals("slope: 97.0, yintercept: 100.0, epsilon:1.0E-6"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test046");
        Line line2 = new Line((double) '#', (double) 100);
        double double3 = line2.slope;
        java.lang.String str4 = line2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "slope: 35.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str4.equals("slope: 35.0, yintercept: 100.0, epsilon:1.0E-6"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test047");
        Line line2 = new Line(10.0d, (double) 10);
        line2.slope = 100L;
        Line line7 = new Line(0.0d, (double) (byte) -1);
        boolean boolean8 = line2.Intersect(line7);
        line7.yintercept = 0.0d;
        java.lang.String str11 = line7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 0.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str11.equals("slope: 0.0, yintercept: 0.0, epsilon:1.0E-6"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test048");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        double double4 = line2.slope;
        java.lang.String str5 = line2.toString();
        java.lang.String str6 = line2.toString();
        double double7 = line2.slope;
        line2.yintercept = 10;
        line2.slope = (byte) 10;
        line2.slope = (byte) 0;
        double double14 = line2.slope;
        double double15 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str5.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str6.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test049");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        line2.slope = 0.0d;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean8 = line2.Intersect(line7);
        line7.yintercept = 0.0f;
        java.lang.String str11 = line7.toString();
        double double12 = line7.slope;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 0.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str11.equals("slope: 0.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test050");
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
        double double19 = line17.slope;
        java.lang.String str20 = line17.toString();
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        double double24 = line23.slope;
        Line line27 = new Line((double) (byte) 0, (double) 'a');
        line27.slope = 0.0d;
        boolean boolean30 = line23.Intersect(line27);
        java.lang.Class<?> wildcardClass31 = line23.getClass();
        Line line34 = new Line((double) (byte) 0, (double) 'a');
        double double35 = line34.slope;
        Line line38 = new Line((double) (byte) 0, (double) 'a');
        line38.slope = 0.0d;
        boolean boolean41 = line34.Intersect(line38);
        double double42 = line34.yintercept;
        boolean boolean43 = line23.Intersect(line34);
        boolean boolean44 = line17.Intersect(line34);
        boolean boolean45 = line6.Intersect(line17);
        double double46 = line17.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str20.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 97.0d + "'", double42 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test051");
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
        Line line39 = new Line((double) 10.0f, (double) 10.0f);
        line39.yintercept = (byte) 1;
        boolean boolean42 = line6.Intersect(line39);
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test052");
        Line line2 = new Line((double) ' ', (double) '#');
        line2.yintercept = '4';
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test053");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        line2.slope = 100.0f;
        line2.yintercept = 1.0f;
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        double double18 = line17.slope;
        double double19 = line17.slope;
        java.lang.String str20 = line17.toString();
        java.lang.String str21 = line17.toString();
        double double22 = line17.slope;
        line17.yintercept = 10;
        line17.slope = (byte) 10;
        line17.slope = (byte) 0;
        double double29 = line17.slope;
        line17.yintercept = (byte) 10;
        boolean boolean32 = line2.Intersect(line17);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str20.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test054");
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
        java.lang.String str45 = line28.toString();
        line28.slope = 10;
        line28.yintercept = '#';
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
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "slope: 0.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str45.equals("slope: 0.0, yintercept: 0.0, epsilon:1.0E-6"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test055");
        Line line2 = new Line((-1.0d), 10.0d);
        double double3 = line2.yintercept;
        double double4 = line2.slope;
        java.lang.String str5 = line2.toString();
        line2.slope = (byte) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: -1.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str5.equals("slope: -1.0, yintercept: 10.0, epsilon:1.0E-6"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test056");
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
        java.lang.String str29 = line23.toString();
        java.lang.String str30 = line23.toString();
        line23.slope = 10L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str29.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str30.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test057");
        Line line2 = new Line((double) (-1L), (double) '#');
        Line line5 = new Line((double) 0, (-1.0d));
        boolean boolean6 = line2.Intersect(line5);
        double double7 = line5.slope;
        java.lang.Class<?> wildcardClass8 = line5.getClass();
        double double9 = line5.slope;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test058");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        double double6 = line2.slope;
        Line line9 = new Line((double) ' ', (double) '4');
        boolean boolean10 = line2.Intersect(line9);
        java.lang.String str11 = line9.toString();
        java.lang.String str12 = line9.toString();
        java.lang.Class<?> wildcardClass13 = line9.getClass();
        line9.yintercept = 100;
        line9.yintercept = 10.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 32.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str11.equals("slope: 32.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "slope: 32.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str12.equals("slope: 32.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test059");
        Line line2 = new Line((double) (byte) 0, (double) (-1.0f));
        double double3 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test060");
        Line line2 = new Line((double) 1, 1.0d);
        Line line5 = new Line((double) 10, (double) 0.0f);
        boolean boolean6 = line2.Intersect(line5);
        double double7 = line2.slope;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test061");
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
        java.lang.Class<?> wildcardClass31 = line22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test062");
        Line line2 = new Line((double) ' ', (double) 1);
        line2.yintercept = 100.0f;
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        line2.slope = 0.0d;
        double double8 = line2.yintercept;
        line2.slope = 0.0f;
        line2.yintercept = 0.0d;
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test063");
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
        line17.slope = 'a';
        java.lang.String str25 = line17.toString();
        double double26 = line17.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "slope: 97.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str25.equals("slope: 97.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 97.0d + "'", double26 == 97.0d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test064");
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
        line8.slope = 0L;
        java.lang.Class<?> wildcardClass24 = line8.getClass();
        line8.yintercept = 0.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test065");
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
        java.lang.Class<?> wildcardClass36 = line6.getClass();
        double double37 = line6.yintercept;
        double double38 = line6.yintercept;
        java.lang.String str39 = line6.toString();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 97.0d + "'", double37 == 97.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 97.0d + "'", double38 == 97.0d);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str39.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test066");
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
        line6.slope = (byte) 1;
        line6.yintercept = 100.0f;
        double double24 = line6.slope;
        double double25 = line6.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str18.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test067");
        Line line2 = new Line(35.0d, (double) 1L);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test068");
        Line line2 = new Line((double) 'a', (double) (byte) -1);
        Line line5 = new Line(10.0d, (double) 0L);
        Line line8 = new Line((double) 'a', (double) (byte) 10);
        line8.yintercept = (-1.0f);
        boolean boolean11 = line5.Intersect(line8);
        java.lang.Class<?> wildcardClass12 = line8.getClass();
        java.lang.Class<?> wildcardClass13 = line8.getClass();
        boolean boolean14 = line2.Intersect(line8);
        Line line17 = new Line((double) 100, 52.0d);
        Line line20 = new Line((double) (byte) 0, (double) 'a');
        double double21 = line20.slope;
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        line24.slope = 0.0d;
        boolean boolean27 = line20.Intersect(line24);
        double double28 = line24.yintercept;
        Line line31 = new Line(0.0d, (double) (-1L));
        boolean boolean32 = line24.Intersect(line31);
        Line line35 = new Line((double) 100L, (double) 100);
        java.lang.String str36 = line35.toString();
        boolean boolean37 = line24.Intersect(line35);
        line35.yintercept = (short) 1;
        line35.yintercept = 1.0f;
        boolean boolean42 = line17.Intersect(line35);
        boolean boolean43 = line8.Intersect(line17);
        double double44 = line8.slope;
        line8.slope = 1;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 97.0d + "'", double28 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str36.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 97.0d + "'", double44 == 97.0d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test069");
        Line line2 = new Line(10.0d, (double) '#');
        Line line5 = new Line((double) 0, (-1.0d));
        double double6 = line5.yintercept;
        boolean boolean7 = line2.Intersect(line5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test070");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = 100.0f;
        line2.yintercept = (-1L);
        Line line9 = new Line((double) ' ', 100.0d);
        boolean boolean10 = line2.Intersect(line9);
        java.lang.Class<?> wildcardClass11 = line2.getClass();
        line2.yintercept = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test071");
        Line line2 = new Line(35.0d, (double) 10L);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test072");
        Line line2 = new Line(1.0d, (double) 1.0f);
        line2.yintercept = 1L;
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test073");
        Line line2 = new Line((double) 'a', (double) 'a');
        double double3 = line2.yintercept;
        double double4 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test074");
        Line line2 = new Line((double) 0L, (double) 100.0f);
        Line line5 = new Line((double) (short) -1, (double) (short) -1);
        line5.yintercept = (-1.0f);
        boolean boolean8 = line2.Intersect(line5);
        double double9 = line5.yintercept;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test075");
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
        Line line37 = new Line(97.0d, (double) (short) -1);
        java.lang.String str38 = line37.toString();
        boolean boolean39 = line23.Intersect(line37);
        Line line42 = new Line((double) 0.0f, (double) (short) 1);
        java.lang.String str43 = line42.toString();
        Line line46 = new Line((double) 0.0f, (double) 1);
        line46.slope = 97.0d;
        double double49 = line46.slope;
        boolean boolean50 = line42.Intersect(line46);
        boolean boolean51 = line23.Intersect(line46);
        double double52 = line46.slope;
        double double53 = line46.slope;
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
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str38.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "slope: 0.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str43.equals("slope: 0.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 97.0d + "'", double49 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 97.0d + "'", double52 == 97.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 97.0d + "'", double53 == 97.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test076");
        Line line2 = new Line((double) (short) 100, (double) ' ');
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        double double4 = line2.yintercept;
        line2.yintercept = 0.0f;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test077");
        Line line2 = new Line((double) 100.0f, (double) (short) -1);
        Line line5 = new Line(1.0d, (double) 'a');
        boolean boolean6 = line2.Intersect(line5);
        line5.slope = (short) 1;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test078");
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
        double double19 = line2.yintercept;
        double double20 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 32.0d + "'", double20 == 32.0d);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test079");
        Line line2 = new Line(1.0d, (-1.0d));
        double double3 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test080");
        Line line2 = new Line((double) ' ', (double) 1);
        line2.yintercept = 100.0f;
        java.lang.String str5 = line2.toString();
        line2.yintercept = (byte) 100;
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str5.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test081");
        Line line2 = new Line((double) (short) 1, (double) 0.0f);
        line2.yintercept = (-1.0f);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test082");
        Line line2 = new Line((double) (short) 100, (double) (short) 1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test083");
        Line line2 = new Line((double) (byte) 10, (double) (byte) 100);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test084");
        Line line2 = new Line((double) (byte) 10, (-1.0d));
        Line line5 = new Line((double) 100L, 97.0d);
        line5.slope = 32.0d;
        java.lang.String str8 = line5.toString();
        boolean boolean9 = line2.Intersect(line5);
        double double10 = line5.yintercept;
        java.lang.String str11 = line5.toString();
        Line line14 = new Line((double) 10L, (double) ' ');
        line14.slope = 1L;
        double double17 = line14.slope;
        Line line20 = new Line((double) (byte) 0, (double) 'a');
        double double21 = line20.slope;
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        line24.slope = 0.0d;
        boolean boolean27 = line20.Intersect(line24);
        double double28 = line20.yintercept;
        double double29 = line20.slope;
        boolean boolean30 = line14.Intersect(line20);
        line20.slope = (byte) 10;
        java.lang.String str33 = line20.toString();
        Line line36 = new Line((double) (byte) 0, (double) 'a');
        double double37 = line36.slope;
        Line line40 = new Line((double) (byte) 0, (double) 'a');
        line40.slope = 0.0d;
        boolean boolean43 = line36.Intersect(line40);
        double double44 = line40.yintercept;
        Line line47 = new Line(0.0d, (double) (-1L));
        boolean boolean48 = line40.Intersect(line47);
        Line line51 = new Line((double) 100L, (double) 100);
        java.lang.String str52 = line51.toString();
        boolean boolean53 = line40.Intersect(line51);
        line40.slope = (byte) 1;
        boolean boolean56 = line20.Intersect(line40);
        java.lang.Class<?> wildcardClass57 = line40.getClass();
        boolean boolean58 = line5.Intersect(line40);
        line40.yintercept = 100;
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 32.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str8.equals("slope: 32.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 32.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str11.equals("slope: 32.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 97.0d + "'", double28 == 97.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 97.0d + "'", double44 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str52.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test085");
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
        Line line24 = new Line((double) ' ', (double) 1);
        line24.yintercept = 100.0f;
        java.lang.Class<?> wildcardClass27 = line24.getClass();
        line24.slope = 0.0d;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        Line line36 = new Line((double) (byte) 0, (double) 'a');
        line36.slope = 0.0d;
        boolean boolean39 = line32.Intersect(line36);
        Line line42 = new Line((double) (byte) 0, (double) 'a');
        double double43 = line42.slope;
        boolean boolean44 = line36.Intersect(line42);
        double double45 = line36.slope;
        line36.yintercept = 1L;
        line36.slope = 1;
        boolean boolean50 = line24.Intersect(line36);
        line36.slope = (-1);
        java.lang.String str53 = line36.toString();
        boolean boolean54 = line11.Intersect(line36);
        java.lang.Class<?> wildcardClass55 = line11.getClass();
        Line line58 = new Line((double) 0.0f, (double) 1);
        line58.slope = 97.0d;
        line58.yintercept = 35.0d;
        boolean boolean63 = line11.Intersect(line58);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "slope: -1.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str53.equals("slope: -1.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test086");
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
        double double45 = line28.slope;
        double double46 = line28.yintercept;
        line28.yintercept = 100L;
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
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test087");
        Line line2 = new Line((double) ' ', (double) 1);
        java.lang.String str3 = line2.toString();
        double double4 = line2.slope;
        line2.slope = 1L;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 32.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str3.equals("slope: 32.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test088");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) 'a', (double) (byte) 10);
        line6.yintercept = (-1.0f);
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line2.yintercept;
        java.lang.String str11 = line2.toString();
        java.lang.String str12 = line2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str11.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str12.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test089");
        Line line2 = new Line((double) (byte) 100, 1.0d);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test090");
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
        java.lang.String str47 = line39.toString();
        line39.yintercept = 35.0d;
        line39.slope = 1;
        double double52 = line39.yintercept;
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
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 35.0d + "'", double52 == 35.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test091");
        Line line2 = new Line(97.0d, (double) (short) -1);
        java.lang.String str3 = line2.toString();
        java.lang.String str4 = line2.toString();
        line2.yintercept = (-1);
        Line line9 = new Line(0.0d, 0.0d);
        boolean boolean10 = line2.Intersect(line9);
        line9.slope = 1.0d;
        double double13 = line9.slope;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str3.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str4.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test092");
        Line line2 = new Line(0.0d, (double) 100.0f);
        Line line5 = new Line((double) 0.0f, (double) (short) 1);
        double double6 = line5.yintercept;
        double double7 = line5.yintercept;
        Line line10 = new Line((double) 0.0f, (double) (byte) 100);
        java.lang.String str11 = line10.toString();
        boolean boolean12 = line5.Intersect(line10);
        boolean boolean13 = line2.Intersect(line5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 0.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str11.equals("slope: 0.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test093");
        Line line2 = new Line((double) 1, (double) 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test094");
        Line line2 = new Line((double) (byte) 10, (double) (short) 1);
        line2.yintercept = 1;
        double double5 = line2.slope;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test095");
        Line line2 = new Line(97.0d, (double) (short) -1);
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
        line20.yintercept = (short) 1;
        double double25 = line20.yintercept;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        Line line36 = new Line((double) (byte) 0, (double) 'a');
        line36.slope = 0.0d;
        boolean boolean39 = line32.Intersect(line36);
        Line line42 = new Line((double) (byte) 0, (double) 'a');
        double double43 = line42.slope;
        boolean boolean44 = line36.Intersect(line42);
        boolean boolean45 = line28.Intersect(line36);
        Line line48 = new Line((double) 10L, (double) ' ');
        line48.slope = 1L;
        double double51 = line48.slope;
        Line line54 = new Line((double) (byte) 0, (double) 'a');
        double double55 = line54.slope;
        Line line58 = new Line((double) (byte) 0, (double) 'a');
        line58.slope = 0.0d;
        boolean boolean61 = line54.Intersect(line58);
        double double62 = line54.yintercept;
        double double63 = line54.slope;
        boolean boolean64 = line48.Intersect(line54);
        boolean boolean65 = line28.Intersect(line54);
        double double66 = line54.yintercept;
        line54.yintercept = 0L;
        double double69 = line54.yintercept;
        java.lang.Class<?> wildcardClass70 = line54.getClass();
        boolean boolean71 = line20.Intersect(line54);
        line20.yintercept = (byte) 10;
        boolean boolean74 = line2.Intersect(line20);
        line2.slope = 1;
        java.lang.String str77 = line2.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str21.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 97.0d + "'", double62 == 97.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 97.0d + "'", double66 == 97.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "slope: 1.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str77.equals("slope: 1.0, yintercept: -1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test096");
        Line line2 = new Line((double) 10L, (double) ' ');
        java.lang.String str3 = line2.toString();
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        Line line7 = new Line(0.0d, (double) (short) -1);
        line7.yintercept = 10;
        boolean boolean10 = line2.Intersect(line7);
        line2.slope = (-1.0d);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 10.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str3.equals("slope: 10.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test097");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = 100.0f;
        line2.yintercept = (-1L);
        double double7 = line2.yintercept;
        double double8 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test098");
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
        java.lang.String str80 = line36.toString();
        line36.yintercept = 0L;
        line36.yintercept = 0.0d;
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
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "slope: 32.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str80.equals("slope: 32.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test099");
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
        line19.yintercept = (short) 1;
        double double24 = line19.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test100");
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
        java.lang.String str27 = line7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "slope: 0.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str27.equals("slope: 0.0, yintercept: 1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test101");
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
        line28.yintercept = (short) 100;
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
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test102");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        double double6 = line2.slope;
        Line line9 = new Line((double) (byte) 1, 1.0d);
        line9.slope = 10.0f;
        boolean boolean12 = line2.Intersect(line9);
        double double13 = line9.slope;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test103");
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
        double double68 = line23.yintercept;
        line23.slope = (byte) 100;
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
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 97.0d + "'", double68 == 97.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test104");
        Line line2 = new Line((double) ' ', (double) 1);
        line2.yintercept = 100.0f;
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        line2.slope = 0.0d;
        line2.slope = (-1.0d);
        double double10 = line2.yintercept;
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test105");
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
        java.lang.String str67 = line10.toString();
        double double68 = line10.yintercept;
        double double69 = line10.yintercept;
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
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str67.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 97.0d + "'", double68 == 97.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 97.0d + "'", double69 == 97.0d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test106");
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
        java.lang.Class<?> wildcardClass38 = line23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test107");
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
        double double44 = line42.yintercept;
        line42.slope = (-1);
        java.lang.String str47 = line42.toString();
        java.lang.Class<?> wildcardClass48 = line42.getClass();
        java.lang.String str49 = line42.toString();
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
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "slope: -1.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str47.equals("slope: -1.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "slope: -1.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str49.equals("slope: -1.0, yintercept: 1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test108");
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
        line2.yintercept = (byte) 0;
        Line line30 = new Line((double) 10L, (double) ' ');
        line30.slope = 1L;
        boolean boolean33 = line2.Intersect(line30);
        double double34 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test109");
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
        double double85 = line2.yintercept;
        line2.slope = (-1L);
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
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 10.0d + "'", double85 == 10.0d);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test110");
        Line line2 = new Line((double) '#', (double) 1L);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        line5.slope = 0.0d;
        double double8 = line5.slope;
        boolean boolean9 = line2.Intersect(line5);
        java.lang.String str10 = line5.toString();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str10.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test111");
        Line line2 = new Line((double) (byte) 10, (-1.0d));
        Line line5 = new Line((double) 100L, 97.0d);
        line5.slope = 32.0d;
        java.lang.String str8 = line5.toString();
        boolean boolean9 = line2.Intersect(line5);
        Line line12 = new Line((double) ' ', (double) 1);
        double double13 = line12.yintercept;
        line12.slope = ' ';
        double double16 = line12.slope;
        boolean boolean17 = line2.Intersect(line12);
        double double18 = line2.slope;
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 32.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str8.equals("slope: 32.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test112");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        double double6 = line2.slope;
        Line line9 = new Line((double) (byte) 1, 1.0d);
        line9.slope = 10.0f;
        boolean boolean12 = line2.Intersect(line9);
        line2.slope = 0.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test113");
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
        line6.yintercept = (short) 100;
        double double20 = line6.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test114");
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
        double double21 = line2.yintercept;
        double double22 = line2.slope;
        java.lang.String str23 = line2.toString();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str23.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test115");
        Line line2 = new Line((double) ' ', (double) 1);
        line2.yintercept = 100.0f;
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        java.lang.String str6 = line2.toString();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str6.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test116");
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
        java.lang.String str39 = line25.toString();
        line25.slope = (byte) -1;
        boolean boolean42 = line6.Intersect(line25);
        double double43 = line25.slope;
        java.lang.Class<?> wildcardClass44 = line25.getClass();
        line25.slope = 1.0d;
        java.lang.Class<?> wildcardClass47 = line25.getClass();
        line25.slope = 10L;
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
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str39.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test117");
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
        java.lang.String str83 = line2.toString();
        double double84 = line2.slope;
        double double85 = line2.yintercept;
        double double86 = line2.slope;
        Line line89 = new Line((double) (byte) 10, (-1.0d));
        line89.yintercept = 0.0d;
        double double92 = line89.yintercept;
        boolean boolean93 = line2.Intersect(line89);
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
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "slope: 97.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str83.equals("slope: 97.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 97.0d + "'", double84 == 97.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 100.0d + "'", double85 == 100.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 97.0d + "'", double86 == 97.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test118");
        Line line2 = new Line((double) 1.0f, (double) 1L);
        double double3 = line2.slope;
        line2.yintercept = 'a';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test119");
        Line line2 = new Line(100.0d, (double) 'a');
        double double3 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test120");
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
        java.lang.String str19 = line10.toString();
        double double20 = line10.slope;
        boolean boolean21 = line2.Intersect(line10);
        java.lang.Class<?> wildcardClass22 = line2.getClass();
        java.lang.Class<?> wildcardClass23 = line2.getClass();
        Line line26 = new Line((double) 10, (double) 0.0f);
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        java.lang.Class<?> wildcardClass31 = line29.getClass();
        boolean boolean32 = line26.Intersect(line29);
        line29.yintercept = '#';
        boolean boolean35 = line2.Intersect(line29);
        Line line38 = new Line((double) 10L, (double) 100.0f);
        boolean boolean39 = line29.Intersect(line38);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str19.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test121");
        Line line2 = new Line((double) (short) -1, (double) (short) -1);
        line2.yintercept = (-1.0f);
        java.lang.String str5 = line2.toString();
        double double6 = line2.slope;
        java.lang.Class<?> wildcardClass7 = line2.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: -1.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str5.equals("slope: -1.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test122");
        Line line2 = new Line((-1.0d), (double) (-1L));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test123");
        Line line2 = new Line((double) 10.0f, 52.0d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test124");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        java.lang.String str5 = line2.toString();
        line2.yintercept = ' ';
        java.lang.Class<?> wildcardClass8 = line2.getClass();
        java.lang.String str9 = line2.toString();
        Line line12 = new Line((double) 1, (double) 10.0f);
        boolean boolean13 = line2.Intersect(line12);
        line12.slope = 1.0f;
        line12.yintercept = 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str5.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 0.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str9.equals("slope: 0.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test125");
        Line line2 = new Line(10.0d, 97.0d);
        double double3 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test126");
        Line line2 = new Line(32.0d, (double) 0L);
        java.lang.String str3 = line2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 32.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str3.equals("slope: 32.0, yintercept: 0.0, epsilon:1.0E-6"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test127");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        double double14 = line12.yintercept;
        line12.yintercept = 100;
        line12.yintercept = (-1);
        line12.slope = (-1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test128");
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
        line28.yintercept = (byte) 1;
        Line line50 = new Line((double) (short) 10, (double) (short) 0);
        boolean boolean51 = line28.Intersect(line50);
        double double52 = line50.yintercept;
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test129");
        Line line2 = new Line((double) 0.0f, (double) 100);
        line2.yintercept = '4';
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test130");
        Line line2 = new Line(10.0d, (double) 0L);
        Line line5 = new Line((double) 'a', (double) (byte) 10);
        line5.yintercept = (-1.0f);
        boolean boolean8 = line2.Intersect(line5);
        java.lang.Class<?> wildcardClass9 = line5.getClass();
        java.lang.Class<?> wildcardClass10 = line5.getClass();
        double double11 = line5.slope;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test131");
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
        double double18 = line12.slope;
        java.lang.Class<?> wildcardClass19 = line12.getClass();
        java.lang.String str20 = line12.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "slope: 97.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str20.equals("slope: 97.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test132");
        Line line2 = new Line((double) 0, 10.0d);
        line2.yintercept = 0.0d;
        double double5 = line2.yintercept;
        java.lang.Class<?> wildcardClass6 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test133");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = (short) 100;
        line2.slope = 97.0d;
        java.lang.String str7 = line2.toString();
        java.lang.String str8 = line2.toString();
        Line line11 = new Line((double) 10L, (double) ' ');
        line11.slope = 1L;
        double double14 = line11.yintercept;
        boolean boolean15 = line2.Intersect(line11);
        line2.slope = 100;
        double double18 = line2.slope;
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str7.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str8.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test134");
        Line line2 = new Line((double) 0, (double) 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test135");
        Line line2 = new Line((double) (byte) 10, (double) (-1.0f));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test136");
        Line line2 = new Line((double) 0, (double) (short) 1);
        java.lang.String str3 = line2.toString();
        Line line6 = new Line((double) (byte) -1, (double) 10.0f);
        boolean boolean7 = line2.Intersect(line6);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 0.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str3.equals("slope: 0.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test137");
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
        java.lang.Class<?> wildcardClass24 = line2.getClass();
        double double25 = line2.yintercept;
        java.lang.Class<?> wildcardClass26 = line2.getClass();
        line2.slope = 1.0d;
        double double29 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 97.0d + "'", double29 == 97.0d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test138");
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
        line2.yintercept = 0.0d;
        line2.slope = '4';
        double double28 = line2.slope;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 52.0d + "'", double28 == 52.0d);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test139");
        Line line2 = new Line((double) 0, (double) 10L);
        line2.slope = '4';
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test140");
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
        line15.yintercept = '#';
        Line line23 = new Line(97.0d, (double) (short) -1);
        java.lang.String str24 = line23.toString();
        boolean boolean25 = line15.Intersect(line23);
        double double26 = line15.yintercept;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str24.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 35.0d + "'", double26 == 35.0d);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test141");
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
        line2.yintercept = (-1.0d);
        java.lang.String str21 = line2.toString();
        double double22 = line2.slope;
        line2.yintercept = (byte) 1;
        double double25 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 1.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str21.equals("slope: 1.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test142");
        Line line2 = new Line((double) 100L, 97.0d);
        line2.yintercept = 97.0d;
        java.lang.String str5 = line2.toString();
        double double6 = line2.slope;
        line2.yintercept = 1L;
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 100.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str5.equals("slope: 100.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test143");
        Line line2 = new Line(100.0d, (double) (byte) 100);
        line2.yintercept = (byte) 1;
        line2.slope = 100.0f;
        java.lang.String str7 = line2.toString();
        line2.slope = (-1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "slope: 100.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str7.equals("slope: 100.0, yintercept: 1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test144");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        double double3 = line2.slope;
        line2.yintercept = 10.0f;
        double double6 = line2.slope;
        double double7 = line2.slope;
        line2.yintercept = 10;
        Line line12 = new Line((double) (short) 1, (double) 0.0f);
        boolean boolean13 = line2.Intersect(line12);
        java.lang.Class<?> wildcardClass14 = line12.getClass();
        java.lang.Class<?> wildcardClass15 = line12.getClass();
        Line line18 = new Line((double) (byte) 0, (double) 'a');
        double double19 = line18.slope;
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        line22.slope = 0.0d;
        boolean boolean25 = line18.Intersect(line22);
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        boolean boolean30 = line22.Intersect(line28);
        java.lang.Class<?> wildcardClass31 = line22.getClass();
        java.lang.String str32 = line22.toString();
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        double double36 = line35.slope;
        Line line39 = new Line((double) (byte) 0, (double) 'a');
        line39.slope = 0.0d;
        boolean boolean42 = line35.Intersect(line39);
        Line line45 = new Line((double) (byte) 0, (double) 'a');
        double double46 = line45.slope;
        boolean boolean47 = line39.Intersect(line45);
        java.lang.Class<?> wildcardClass48 = line39.getClass();
        java.lang.String str49 = line39.toString();
        boolean boolean50 = line22.Intersect(line39);
        double double51 = line22.yintercept;
        line22.slope = 32.0d;
        Line line56 = new Line((double) 10L, (double) ' ');
        line56.slope = 1L;
        double double59 = line56.slope;
        double double60 = line56.slope;
        line56.yintercept = (-1.0d);
        boolean boolean63 = line22.Intersect(line56);
        boolean boolean64 = line12.Intersect(line22);
        line12.yintercept = 'a';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str32.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str49.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 97.0d + "'", double51 == 97.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.0d + "'", double59 == 1.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test145");
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
        double double68 = line23.yintercept;
        Line line71 = new Line((double) 'a', (double) (byte) 10);
        line71.slope = (short) 100;
        line71.slope = 97.0d;
        line71.yintercept = (-1L);
        java.lang.String str78 = line71.toString();
        double double79 = line71.yintercept;
        java.lang.String str80 = line71.toString();
        java.lang.String str81 = line71.toString();
        line71.yintercept = (byte) -1;
        boolean boolean84 = line23.Intersect(line71);
        java.lang.Class<?> wildcardClass85 = line71.getClass();
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
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 97.0d + "'", double68 == 97.0d);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str78.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str80.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str81.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test146");
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
        java.lang.Class<?> wildcardClass41 = line36.getClass();
        Line line44 = new Line((double) (byte) 0, (double) 'a');
        double double45 = line44.slope;
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        line48.slope = 0.0d;
        boolean boolean51 = line44.Intersect(line48);
        Line line54 = new Line((double) (byte) 0, (double) 'a');
        double double55 = line54.slope;
        boolean boolean56 = line48.Intersect(line54);
        java.lang.Class<?> wildcardClass57 = line48.getClass();
        java.lang.String str58 = line48.toString();
        Line line61 = new Line((double) (byte) 0, (double) 'a');
        double double62 = line61.slope;
        Line line65 = new Line((double) (byte) 0, (double) 'a');
        line65.slope = 0.0d;
        boolean boolean68 = line61.Intersect(line65);
        Line line71 = new Line((double) (byte) 0, (double) 'a');
        double double72 = line71.slope;
        boolean boolean73 = line65.Intersect(line71);
        java.lang.Class<?> wildcardClass74 = line65.getClass();
        java.lang.String str75 = line65.toString();
        boolean boolean76 = line48.Intersect(line65);
        line65.slope = 97.0d;
        java.lang.Class<?> wildcardClass79 = line65.getClass();
        line65.slope = (short) 100;
        double double82 = line65.yintercept;
        java.lang.Class<?> wildcardClass83 = line65.getClass();
        line65.yintercept = 10L;
        boolean boolean86 = line36.Intersect(line65);
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
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str58.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str75.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 97.0d + "'", double82 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test147");
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
        line8.slope = 32.0d;
        Line line28 = new Line((double) '#', (double) 0);
        java.lang.String str29 = line28.toString();
        boolean boolean30 = line8.Intersect(line28);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str19.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 97.0d + "'", double23 == 97.0d);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "slope: 35.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str29.equals("slope: 35.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test148");
        Line line2 = new Line((double) 0.0f, (double) (short) 1);
        double double3 = line2.yintercept;
        double double4 = line2.yintercept;
        line2.yintercept = 'a';
        java.lang.Class<?> wildcardClass7 = line2.getClass();
        line2.slope = 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test149");
        Line line2 = new Line((double) 10L, (double) ' ');
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        double double4 = line2.slope;
        Line line7 = new Line((double) 'a', (double) (byte) 10);
        line7.slope = (short) 100;
        line7.slope = 97.0d;
        boolean boolean12 = line2.Intersect(line7);
        java.lang.String str13 = line2.toString();
        line2.yintercept = (-1);
        Line line18 = new Line((double) 10L, (double) ' ');
        java.lang.String str19 = line18.toString();
        java.lang.String str20 = line18.toString();
        boolean boolean21 = line2.Intersect(line18);
        Line line24 = new Line((-1.0d), 10.0d);
        double double25 = line24.yintercept;
        boolean boolean26 = line2.Intersect(line24);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "slope: 10.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str13.equals("slope: 10.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 10.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str19.equals("slope: 10.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "slope: 10.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str20.equals("slope: 10.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test150");
        Line line2 = new Line(100.0d, (double) (byte) 100);
        line2.slope = 1L;
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test151");
        Line line2 = new Line(32.0d, 97.0d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test152");
        Line line2 = new Line(0.0d, (double) (byte) -1);
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test153");
        Line line2 = new Line((double) 1.0f, (double) 100.0f);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test154");
        Line line2 = new Line((double) '#', (double) 100);
        java.lang.String str3 = line2.toString();
        line2.yintercept = ' ';
        java.lang.Class<?> wildcardClass6 = line2.getClass();
        line2.slope = 10.0d;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 35.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str3.equals("slope: 35.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test155");
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
        java.lang.Class<?> wildcardClass20 = line18.getClass();
        Line line23 = new Line((double) 10L, (double) ' ');
        line23.slope = 1L;
        double double26 = line23.slope;
        double double27 = line23.slope;
        Line line30 = new Line((double) ' ', (double) '4');
        boolean boolean31 = line23.Intersect(line30);
        line23.yintercept = 10;
        java.lang.Class<?> wildcardClass34 = line23.getClass();
        java.lang.Class<?> wildcardClass35 = line23.getClass();
        boolean boolean36 = line18.Intersect(line23);
        line23.yintercept = 10.0f;
        line23.yintercept = 32.0d;
        Line line43 = new Line((double) 'a', (double) (short) 1);
        Line line46 = new Line(0.0d, 10.0d);
        boolean boolean47 = line43.Intersect(line46);
        boolean boolean48 = line23.Intersect(line46);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test156");
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
        java.lang.String str21 = line16.toString();
        line16.slope = 32.0d;
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str13.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test157");
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
        line2.slope = (short) -1;
        double double30 = line2.slope;
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test158");
        Line line2 = new Line(52.0d, 35.0d);
        line2.slope = 100.0d;
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test159");
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
        double double27 = line2.yintercept;
        double double28 = line2.yintercept;
        line2.yintercept = (byte) -1;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str8.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test160");
        Line line2 = new Line((double) '#', (double) 100);
        java.lang.String str3 = line2.toString();
        line2.yintercept = 0.0f;
        line2.slope = 100.0f;
        double double8 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 35.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str3.equals("slope: 35.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test161");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        java.lang.String str5 = line2.toString();
        line2.yintercept = ' ';
        java.lang.Class<?> wildcardClass8 = line2.getClass();
        double double9 = line2.yintercept;
        line2.yintercept = 10L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str5.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test162");
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
        java.lang.Class<?> wildcardClass30 = line25.getClass();
        Line line33 = new Line((double) (byte) 0, (double) 'a');
        double double34 = line33.slope;
        Line line37 = new Line((double) (byte) 0, (double) 'a');
        double double38 = line37.slope;
        Line line41 = new Line((double) (byte) 0, (double) 'a');
        line41.slope = 0.0d;
        boolean boolean44 = line37.Intersect(line41);
        Line line47 = new Line((double) (byte) 0, (double) 'a');
        double double48 = line47.slope;
        boolean boolean49 = line41.Intersect(line47);
        boolean boolean50 = line33.Intersect(line41);
        Line line53 = new Line((double) 10L, (double) ' ');
        line53.slope = 1L;
        double double56 = line53.slope;
        Line line59 = new Line((double) (byte) 0, (double) 'a');
        double double60 = line59.slope;
        Line line63 = new Line((double) (byte) 0, (double) 'a');
        line63.slope = 0.0d;
        boolean boolean66 = line59.Intersect(line63);
        double double67 = line59.yintercept;
        double double68 = line59.slope;
        boolean boolean69 = line53.Intersect(line59);
        boolean boolean70 = line33.Intersect(line59);
        line59.yintercept = (byte) 1;
        line59.slope = 100;
        java.lang.String str75 = line59.toString();
        double double76 = line59.slope;
        double double77 = line59.yintercept;
        java.lang.String str78 = line59.toString();
        boolean boolean79 = line25.Intersect(line59);
        java.lang.String str80 = line59.toString();
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 97.0d + "'", double67 == 97.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "slope: 100.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str75.equals("slope: 100.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 100.0d + "'", double76 == 100.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.0d + "'", double77 == 1.0d);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "slope: 100.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str78.equals("slope: 100.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "slope: 100.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str80.equals("slope: 100.0, yintercept: 1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test163");
        Line line2 = new Line(32.0d, (double) (-1L));
        line2.slope = (short) 100;
        double double5 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test164");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        double double6 = line2.slope;
        Line line9 = new Line((double) ' ', (double) '4');
        boolean boolean10 = line2.Intersect(line9);
        line2.yintercept = 10;
        java.lang.Class<?> wildcardClass13 = line2.getClass();
        double double14 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test165");
        Line line2 = new Line(32.0d, (double) 0L);
        double double3 = line2.slope;
        line2.yintercept = (-1);
        double double6 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test166");
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
        Line line37 = new Line((double) (byte) 0, (double) 'a');
        double double38 = line37.slope;
        line37.yintercept = (byte) 100;
        boolean boolean41 = line23.Intersect(line37);
        Line line44 = new Line((double) '#', (double) (byte) 10);
        double double45 = line44.slope;
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        double double49 = line48.slope;
        Line line52 = new Line((double) (byte) 0, (double) 'a');
        line52.slope = 0.0d;
        boolean boolean55 = line48.Intersect(line52);
        Line line58 = new Line((double) (byte) 0, (double) 'a');
        double double59 = line58.slope;
        boolean boolean60 = line52.Intersect(line58);
        line58.yintercept = 10;
        line58.yintercept = (byte) 0;
        Line line67 = new Line((double) 100L, 97.0d);
        line67.slope = 32.0d;
        line67.slope = '4';
        boolean boolean72 = line58.Intersect(line67);
        line67.yintercept = (-1.0f);
        line67.yintercept = '4';
        boolean boolean77 = line44.Intersect(line67);
        boolean boolean78 = line37.Intersect(line44);
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
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 35.0d + "'", double45 == 35.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test167");
        Line line2 = new Line(35.0d, 52.0d);
        line2.slope = (byte) 10;
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test168");
        Line line2 = new Line((double) 10.0f, (double) 10.0f);
        Line line5 = new Line((double) 0, 10.0d);
        double double6 = line5.slope;
        boolean boolean7 = line2.Intersect(line5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test169");
        Line line2 = new Line((double) 'a', (double) (byte) -1);
        Line line5 = new Line(10.0d, (double) 0L);
        Line line8 = new Line((double) 'a', (double) (byte) 10);
        line8.yintercept = (-1.0f);
        boolean boolean11 = line5.Intersect(line8);
        java.lang.Class<?> wildcardClass12 = line8.getClass();
        java.lang.Class<?> wildcardClass13 = line8.getClass();
        boolean boolean14 = line2.Intersect(line8);
        Line line17 = new Line((double) 100, 52.0d);
        Line line20 = new Line((double) (byte) 0, (double) 'a');
        double double21 = line20.slope;
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        line24.slope = 0.0d;
        boolean boolean27 = line20.Intersect(line24);
        double double28 = line24.yintercept;
        Line line31 = new Line(0.0d, (double) (-1L));
        boolean boolean32 = line24.Intersect(line31);
        Line line35 = new Line((double) 100L, (double) 100);
        java.lang.String str36 = line35.toString();
        boolean boolean37 = line24.Intersect(line35);
        line35.yintercept = (short) 1;
        line35.yintercept = 1.0f;
        boolean boolean42 = line17.Intersect(line35);
        boolean boolean43 = line8.Intersect(line17);
        java.lang.Class<?> wildcardClass44 = line17.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 97.0d + "'", double28 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str36.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test170");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        line12.yintercept = (-1.0f);
        Line line18 = new Line((double) '#', (double) 100.0f);
        boolean boolean19 = line12.Intersect(line18);
        line18.yintercept = 100L;
        Line line24 = new Line((double) 'a', (double) (byte) 10);
        double double25 = line24.slope;
        java.lang.Class<?> wildcardClass26 = line24.getClass();
        java.lang.Class<?> wildcardClass27 = line24.getClass();
        java.lang.Class<?> wildcardClass28 = line24.getClass();
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        double double39 = line35.yintercept;
        java.lang.String str40 = line35.toString();
        Line line43 = new Line(10.0d, (double) 10);
        boolean boolean44 = line35.Intersect(line43);
        Line line47 = new Line((double) (short) 100, (double) ' ');
        double double48 = line47.yintercept;
        boolean boolean49 = line35.Intersect(line47);
        Line line52 = new Line((double) (byte) 0, (double) 'a');
        double double53 = line52.slope;
        Line line56 = new Line((double) (byte) 0, (double) 'a');
        line56.slope = 0.0d;
        boolean boolean59 = line52.Intersect(line56);
        double double60 = line56.yintercept;
        line56.yintercept = (-1);
        java.lang.String str63 = line56.toString();
        double double64 = line56.yintercept;
        boolean boolean65 = line47.Intersect(line56);
        boolean boolean66 = line24.Intersect(line47);
        boolean boolean67 = line18.Intersect(line24);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str40.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 32.0d + "'", double48 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 97.0d + "'", double60 == 97.0d);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str63.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-1.0d) + "'", double64 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test171");
        Line line2 = new Line((double) ' ', (double) 1);
        line2.yintercept = 100.0f;
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        java.lang.Class<?> wildcardClass6 = line2.getClass();
        line2.yintercept = (-1L);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test172");
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
        double double45 = line42.slope;
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
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test173");
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
        line28.slope = (byte) 1;
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
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test174");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = (short) 100;
        line2.slope = 97.0d;
        java.lang.String str7 = line2.toString();
        java.lang.String str8 = line2.toString();
        Line line11 = new Line((double) 10L, (double) ' ');
        line11.slope = 1L;
        double double14 = line11.yintercept;
        boolean boolean15 = line2.Intersect(line11);
        line2.slope = 52.0d;
        line2.slope = 0.0d;
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str7.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str8.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test175");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        java.lang.Class<?> wildcardClass11 = line2.getClass();
        double double12 = line2.yintercept;
        double double13 = line2.slope;
        line2.yintercept = 32.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test176");
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
        Line line31 = new Line((double) ' ', (double) 1);
        line31.yintercept = 100.0f;
        java.lang.Class<?> wildcardClass34 = line31.getClass();
        line31.yintercept = ' ';
        boolean boolean37 = line23.Intersect(line31);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str28.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test177");
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
        java.lang.Class<?> wildcardClass21 = line2.getClass();
        java.lang.String str22 = line2.toString();
        line2.yintercept = 97.0d;
        java.lang.Class<?> wildcardClass25 = line2.getClass();
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str13.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str22.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test178");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = (short) 100;
        line2.slope = 97.0d;
        java.lang.String str7 = line2.toString();
        java.lang.String str8 = line2.toString();
        Line line11 = new Line((double) 10L, (double) ' ');
        line11.slope = 1L;
        double double14 = line11.yintercept;
        boolean boolean15 = line2.Intersect(line11);
        line2.slope = 100;
        line2.yintercept = 1.0f;
        line2.yintercept = (short) -1;
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str7.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str8.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test179");
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
        double double20 = line10.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test180");
        Line line2 = new Line(10.0d, (double) 'a');
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test181");
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
        java.lang.Class<?> wildcardClass36 = line6.getClass();
        double double37 = line6.yintercept;
        double double38 = line6.yintercept;
        java.lang.Class<?> wildcardClass39 = line6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 97.0d + "'", double37 == 97.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 97.0d + "'", double38 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test182");
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
        line54.slope = (-1);
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
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test183");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        double double5 = line2.yintercept;
        line2.yintercept = (short) 0;
        line2.slope = 0.0d;
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test184");
        Line line2 = new Line((double) 10.0f, (double) 0L);
        double double3 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test185");
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
        double double42 = line28.yintercept;
        Line line45 = new Line((double) (short) 100, 35.0d);
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        double double49 = line48.slope;
        Line line52 = new Line((double) (byte) 0, (double) 'a');
        line52.slope = 0.0d;
        boolean boolean55 = line48.Intersect(line52);
        Line line58 = new Line((double) (byte) 0, (double) 'a');
        double double59 = line58.slope;
        boolean boolean60 = line52.Intersect(line58);
        line52.slope = (-1L);
        java.lang.String str63 = line52.toString();
        double double64 = line52.yintercept;
        boolean boolean65 = line45.Intersect(line52);
        boolean boolean66 = line28.Intersect(line52);
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
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "slope: -1.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str63.equals("slope: -1.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 97.0d + "'", double64 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test186");
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
        Line line36 = new Line((double) 10L, (double) ' ');
        line36.slope = 1L;
        double double39 = line36.slope;
        Line line42 = new Line((double) (byte) 0, (double) 'a');
        double double43 = line42.slope;
        Line line46 = new Line((double) (byte) 0, (double) 'a');
        line46.slope = 0.0d;
        boolean boolean49 = line42.Intersect(line46);
        double double50 = line42.yintercept;
        double double51 = line42.slope;
        boolean boolean52 = line36.Intersect(line42);
        java.lang.String str53 = line42.toString();
        double double54 = line42.yintercept;
        java.lang.String str55 = line42.toString();
        boolean boolean56 = line27.Intersect(line42);
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
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 97.0d + "'", double50 == 97.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str53.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 97.0d + "'", double54 == 97.0d);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str55.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test187");
        Line line2 = new Line((double) (byte) -1, (double) 'a');
        double double3 = line2.yintercept;
        line2.slope = 32.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test188");
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
        line6.slope = 100;
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
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test189");
        Line line2 = new Line(32.0d, 10.0d);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test190");
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
        java.lang.Class<?> wildcardClass40 = line6.getClass();
        java.lang.Class<?> wildcardClass41 = line6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test191");
        Line line2 = new Line((double) '#', (double) (short) -1);
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
        double double47 = line5.yintercept;
        line5.slope = (-1.0d);
        line5.yintercept = (byte) -1;
        Line line54 = new Line((double) 100L, (double) 100);
        Line line57 = new Line((double) (byte) 0, (double) 'a');
        double double58 = line57.slope;
        Line line61 = new Line((double) (byte) 0, (double) 'a');
        line61.slope = 0.0d;
        boolean boolean64 = line57.Intersect(line61);
        Line line67 = new Line((double) (byte) 0, (double) 'a');
        double double68 = line67.slope;
        boolean boolean69 = line61.Intersect(line67);
        double double70 = line61.slope;
        Line line73 = new Line((double) 1.0f, (double) (short) 1);
        boolean boolean74 = line61.Intersect(line73);
        double double75 = line73.slope;
        boolean boolean76 = line54.Intersect(line73);
        boolean boolean77 = line5.Intersect(line73);
        boolean boolean78 = line2.Intersect(line5);
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
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 97.0d + "'", double47 == 97.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 1.0d + "'", double75 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test192");
        Line line2 = new Line((double) 0.0f, (double) (short) 1);
        double double3 = line2.yintercept;
        double double4 = line2.yintercept;
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        java.lang.Class<?> wildcardClass6 = line2.getClass();
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        double double10 = line9.slope;
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        line13.slope = 0.0d;
        boolean boolean16 = line9.Intersect(line13);
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        boolean boolean21 = line13.Intersect(line19);
        java.lang.String str22 = line13.toString();
        double double23 = line13.slope;
        double double24 = line13.yintercept;
        java.lang.String str25 = line13.toString();
        line13.slope = (short) -1;
        java.lang.String str28 = line13.toString();
        line13.yintercept = 0.0d;
        boolean boolean31 = line2.Intersect(line13);
        Line line32 = null;
        try {
            boolean boolean33 = line2.Intersect(line32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str22.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str25.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "slope: -1.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str28.equals("slope: -1.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test193");
        Line line2 = new Line(52.0d, (double) 10.0f);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test194");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        double double5 = line2.yintercept;
        line2.yintercept = '4';
        java.lang.Class<?> wildcardClass8 = line2.getClass();
        java.lang.Class<?> wildcardClass9 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test195");
        Line line2 = new Line((-1.0d), (double) (byte) 0);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        line9.slope = 0.0d;
        boolean boolean12 = line5.Intersect(line9);
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        double double16 = line15.slope;
        boolean boolean17 = line9.Intersect(line15);
        java.lang.Class<?> wildcardClass18 = line9.getClass();
        java.lang.String str19 = line9.toString();
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
        boolean boolean37 = line9.Intersect(line26);
        double double38 = line9.yintercept;
        double double39 = line9.slope;
        boolean boolean40 = line2.Intersect(line9);
        java.lang.Class<?> wildcardClass41 = line9.getClass();
        line9.slope = 100;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str19.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str36.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 97.0d + "'", double38 == 97.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test196");
        Line line2 = new Line((double) 0, (-1.0d));
        java.lang.String str3 = line2.toString();
        line2.yintercept = 10L;
        line2.yintercept = 52.0d;
        java.lang.String str8 = line2.toString();
        java.lang.String str9 = line2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str3.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 0.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str8.equals("slope: 0.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 0.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str9.equals("slope: 0.0, yintercept: 52.0, epsilon:1.0E-6"));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test197");
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
        Line line26 = new Line((double) 10L, (double) ' ');
        line26.slope = 1L;
        double double29 = line26.slope;
        double double30 = line26.slope;
        Line line33 = new Line((double) ' ', (double) '4');
        boolean boolean34 = line26.Intersect(line33);
        line33.slope = 97.0d;
        double double37 = line33.yintercept;
        boolean boolean38 = line2.Intersect(line33);
        java.lang.Class<?> wildcardClass39 = line2.getClass();
        double double40 = line2.slope;
        line2.yintercept = (short) 10;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 52.0d + "'", double37 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test198");
        Line line2 = new Line((double) (-1L), (double) '#');
        Line line5 = new Line((double) 0, (-1.0d));
        boolean boolean6 = line2.Intersect(line5);
        double double7 = line5.slope;
        java.lang.Class<?> wildcardClass8 = line5.getClass();
        line5.slope = (byte) 0;
        line5.yintercept = 1L;
        double double13 = line5.slope;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test199");
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
        double double19 = line2.slope;
        Line line20 = null;
        try {
            boolean boolean21 = line2.Intersect(line20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str15.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test200");
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
        java.lang.Class<?> wildcardClass41 = line28.getClass();
        Line line44 = new Line((double) (byte) 0, (double) 'a');
        double double45 = line44.slope;
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        double double49 = line48.slope;
        Line line52 = new Line((double) (byte) 0, (double) 'a');
        line52.slope = 0.0d;
        boolean boolean55 = line48.Intersect(line52);
        Line line58 = new Line((double) (byte) 0, (double) 'a');
        double double59 = line58.slope;
        boolean boolean60 = line52.Intersect(line58);
        java.lang.String str61 = line52.toString();
        double double62 = line52.slope;
        boolean boolean63 = line44.Intersect(line52);
        boolean boolean64 = line28.Intersect(line44);
        double double65 = line28.yintercept;
        double double66 = line28.yintercept;
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
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str61.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 97.0d + "'", double65 == 97.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 97.0d + "'", double66 == 97.0d);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test201");
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
        java.lang.Class<?> wildcardClass64 = line52.getClass();
        line52.slope = (byte) 10;
        line52.slope = (byte) -1;
        Line line71 = new Line((double) 100.0f, 100.0d);
        Line line74 = new Line((double) (short) -1, 32.0d);
        boolean boolean75 = line71.Intersect(line74);
        line74.yintercept = 1.0f;
        double double78 = line74.yintercept;
        boolean boolean79 = line52.Intersect(line74);
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
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 1.0d + "'", double78 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test202");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.slope = 97.0d;
        line12.yintercept = (-1.0d);
        Line line21 = new Line((double) (byte) 0, (double) 'a');
        double double22 = line21.slope;
        Line line25 = new Line((double) (byte) 0, (double) 'a');
        line25.slope = 0.0d;
        boolean boolean28 = line21.Intersect(line25);
        double double29 = line25.yintercept;
        Line line32 = new Line(0.0d, (double) (-1L));
        boolean boolean33 = line25.Intersect(line32);
        Line line36 = new Line((double) 100L, (double) 100);
        java.lang.String str37 = line36.toString();
        boolean boolean38 = line25.Intersect(line36);
        line36.yintercept = (short) 1;
        line36.yintercept = 1.0f;
        boolean boolean43 = line12.Intersect(line36);
        java.lang.Class<?> wildcardClass44 = line12.getClass();
        line12.slope = 35.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 97.0d + "'", double29 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str37.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test203");
        Line line2 = new Line((double) (byte) 10, (-1.0d));
        Line line5 = new Line((double) 100L, 97.0d);
        line5.slope = 32.0d;
        java.lang.String str8 = line5.toString();
        boolean boolean9 = line2.Intersect(line5);
        Line line12 = new Line((double) ' ', (double) 1);
        double double13 = line12.yintercept;
        line12.slope = ' ';
        double double16 = line12.slope;
        boolean boolean17 = line2.Intersect(line12);
        line12.slope = 100;
        line12.yintercept = 10.0f;
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 32.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str8.equals("slope: 32.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test204");
        Line line2 = new Line(100.0d, 1.0d);
        line2.slope = 10;
        Line line7 = new Line((double) 100.0f, 100.0d);
        Line line10 = new Line((double) (short) -1, 32.0d);
        boolean boolean11 = line7.Intersect(line10);
        double double12 = line10.slope;
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        double double16 = line15.slope;
        java.lang.Class<?> wildcardClass17 = line15.getClass();
        double double18 = line15.yintercept;
        boolean boolean19 = line10.Intersect(line15);
        line15.slope = 10.0d;
        Line line24 = new Line((double) 'a', (double) (byte) 10);
        line24.slope = 100.0f;
        double double27 = line24.slope;
        Line line30 = new Line(10.0d, (double) 0L);
        Line line33 = new Line((double) 'a', (double) (byte) 10);
        line33.yintercept = (-1.0f);
        boolean boolean36 = line30.Intersect(line33);
        boolean boolean37 = line24.Intersect(line30);
        boolean boolean38 = line15.Intersect(line30);
        java.lang.String str39 = line15.toString();
        boolean boolean40 = line2.Intersect(line15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str39.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test205");
        Line line2 = new Line((double) (-1.0f), 0.0d);
        line2.slope = 32.0d;
        double double5 = line2.slope;
        java.lang.String str6 = line2.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "slope: 32.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str6.equals("slope: 32.0, yintercept: 0.0, epsilon:1.0E-6"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test206");
        Line line2 = new Line((double) 0, (-1.0d));
        java.lang.String str3 = line2.toString();
        line2.yintercept = 10L;
        line2.yintercept = 52.0d;
        java.lang.String str8 = line2.toString();
        double double9 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str3.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 0.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str8.equals("slope: 0.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test207");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        line12.yintercept = (-1.0f);
        Line line18 = new Line((double) 'a', 1.0d);
        java.lang.String str19 = line18.toString();
        Line line22 = new Line((double) 'a', (double) (byte) 10);
        line22.slope = (short) 100;
        line22.slope = 97.0d;
        line22.yintercept = (-1L);
        java.lang.String str29 = line22.toString();
        double double30 = line22.yintercept;
        line22.slope = 0;
        boolean boolean33 = line18.Intersect(line22);
        boolean boolean34 = line12.Intersect(line22);
        java.lang.String str35 = line12.toString();
        java.lang.String str36 = line12.toString();
        line12.slope = (-1.0d);
        double double39 = line12.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 97.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str19.equals("slope: 97.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str29.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "slope: 32.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str35.equals("slope: 32.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "slope: 32.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str36.equals("slope: 32.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test208");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        line12.slope = 1.0d;
        double double17 = line12.slope;
        line12.yintercept = 52.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test209");
        Line line2 = new Line((double) 0.0f, 1.0d);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test210");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = 100.0f;
        double double5 = line2.slope;
        Line line8 = new Line(10.0d, (double) 0L);
        Line line11 = new Line((double) 'a', (double) (byte) 10);
        line11.yintercept = (-1.0f);
        boolean boolean14 = line8.Intersect(line11);
        boolean boolean15 = line2.Intersect(line8);
        java.lang.String str16 = line8.toString();
        line8.yintercept = 0L;
        double double19 = line8.yintercept;
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        double double23 = line22.slope;
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        line26.slope = 0.0d;
        boolean boolean29 = line22.Intersect(line26);
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        boolean boolean34 = line26.Intersect(line32);
        double double35 = line26.slope;
        Line line38 = new Line((double) 1.0f, (double) (short) 1);
        boolean boolean39 = line26.Intersect(line38);
        Line line42 = new Line((double) (byte) 0, (double) 'a');
        double double43 = line42.slope;
        Line line46 = new Line((double) (byte) 0, (double) 'a');
        line46.slope = 0.0d;
        boolean boolean49 = line42.Intersect(line46);
        Line line52 = new Line((double) ' ', (double) '4');
        boolean boolean53 = line42.Intersect(line52);
        line52.yintercept = (-1.0f);
        Line line58 = new Line((double) '#', (double) 100.0f);
        boolean boolean59 = line52.Intersect(line58);
        boolean boolean60 = line26.Intersect(line58);
        double double61 = line58.slope;
        boolean boolean62 = line8.Intersect(line58);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 10.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str16.equals("slope: 10.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 35.0d + "'", double61 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test211");
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
        double double26 = line8.yintercept;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 97.0d + "'", double26 == 97.0d);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test212");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        line12.yintercept = (-1.0f);
        Line line18 = new Line((double) '#', (double) 100.0f);
        boolean boolean19 = line12.Intersect(line18);
        java.lang.String str20 = line12.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "slope: 32.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str20.equals("slope: 32.0, yintercept: -1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test213");
        Line line2 = new Line((-1.0d), (double) 100);
        double double3 = line2.slope;
        Line line6 = new Line((double) 'a', (double) (byte) 10);
        double double7 = line6.slope;
        line6.yintercept = 10.0f;
        double double10 = line6.slope;
        double double11 = line6.slope;
        line6.yintercept = ' ';
        boolean boolean14 = line2.Intersect(line6);
        Line line17 = new Line((double) (byte) 0, (double) 'a');
        double double18 = line17.slope;
        Line line21 = new Line((double) (byte) 0, (double) 'a');
        line21.slope = 0.0d;
        boolean boolean24 = line17.Intersect(line21);
        double double25 = line17.yintercept;
        double double26 = line17.slope;
        double double27 = line17.yintercept;
        Line line30 = new Line((double) (byte) 0, (double) 'a');
        double double31 = line30.slope;
        Line line34 = new Line((double) (byte) 0, (double) 'a');
        double double35 = line34.slope;
        Line line38 = new Line((double) (byte) 0, (double) 'a');
        line38.slope = 0.0d;
        boolean boolean41 = line34.Intersect(line38);
        Line line44 = new Line((double) (byte) 0, (double) 'a');
        double double45 = line44.slope;
        boolean boolean46 = line38.Intersect(line44);
        boolean boolean47 = line30.Intersect(line38);
        Line line50 = new Line((double) 10L, (double) ' ');
        line50.slope = 1L;
        double double53 = line50.slope;
        Line line56 = new Line((double) (byte) 0, (double) 'a');
        double double57 = line56.slope;
        Line line60 = new Line((double) (byte) 0, (double) 'a');
        line60.slope = 0.0d;
        boolean boolean63 = line56.Intersect(line60);
        double double64 = line56.yintercept;
        double double65 = line56.slope;
        boolean boolean66 = line50.Intersect(line56);
        boolean boolean67 = line30.Intersect(line56);
        Line line70 = new Line((double) ' ', (double) 1);
        boolean boolean71 = line30.Intersect(line70);
        double double72 = line30.yintercept;
        boolean boolean73 = line17.Intersect(line30);
        boolean boolean74 = line2.Intersect(line30);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 97.0d + "'", double27 == 97.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 97.0d + "'", double64 == 97.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 97.0d + "'", double72 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test214");
        Line line2 = new Line((double) (byte) 10, (double) (short) 1);
        line2.yintercept = 1;
        double double5 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test215");
        Line line2 = new Line((double) (byte) 1, (double) '#');
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test216");
        Line line2 = new Line((double) 100L, (double) 100);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        line9.slope = 0.0d;
        boolean boolean12 = line5.Intersect(line9);
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        double double16 = line15.slope;
        boolean boolean17 = line9.Intersect(line15);
        double double18 = line9.slope;
        Line line21 = new Line((double) 1.0f, (double) (short) 1);
        boolean boolean22 = line9.Intersect(line21);
        double double23 = line21.slope;
        boolean boolean24 = line2.Intersect(line21);
        double double25 = line2.slope;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test217");
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
        double double65 = line52.yintercept;
        line52.yintercept = (short) 100;
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
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 97.0d + "'", double65 == 97.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test218");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        java.lang.Class<?> wildcardClass8 = line6.getClass();
        double double9 = line6.yintercept;
        boolean boolean10 = line2.Intersect(line6);
        line2.slope = 10L;
        double double13 = line2.yintercept;
        line2.yintercept = (byte) 0;
        java.lang.Class<?> wildcardClass16 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test219");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        line9.slope = 0.0d;
        boolean boolean12 = line5.Intersect(line9);
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        double double16 = line15.slope;
        boolean boolean17 = line9.Intersect(line15);
        boolean boolean18 = line2.Intersect(line15);
        double double19 = line2.slope;
        double double20 = line2.slope;
        java.lang.String str21 = line2.toString();
        double double22 = line2.yintercept;
        line2.yintercept = 35.0d;
        line2.slope = (byte) 100;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str21.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test220");
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
        java.lang.String str68 = line10.toString();
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
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str68.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test221");
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
        line2.slope = 1.0d;
        double double25 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test222");
        Line line2 = new Line((double) (short) 100, (double) ' ');
        double double3 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test223");
        Line line2 = new Line(10.0d, (double) 0L);
        Line line5 = new Line((double) 'a', (double) (byte) 10);
        line5.yintercept = (-1.0f);
        boolean boolean8 = line2.Intersect(line5);
        java.lang.Class<?> wildcardClass9 = line5.getClass();
        double double10 = line5.yintercept;
        java.lang.String str11 = line5.toString();
        java.lang.Class<?> wildcardClass12 = line5.getClass();
        line5.yintercept = 100.0f;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str11.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test224");
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
        java.lang.Class<?> wildcardClass49 = line2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test225");
        Line line2 = new Line((double) 0L, 0.0d);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test226");
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
        double double65 = line52.yintercept;
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
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 97.0d + "'", double65 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test227");
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
        java.lang.Class<?> wildcardClass64 = line52.getClass();
        Line line67 = new Line((double) '#', 0.0d);
        boolean boolean68 = line52.Intersect(line67);
        java.lang.String str69 = line67.toString();
        Line line72 = new Line((double) 10L, (double) ' ');
        line72.slope = 1L;
        double double75 = line72.slope;
        double double76 = line72.slope;
        Line line79 = new Line((double) ' ', (double) '4');
        boolean boolean80 = line72.Intersect(line79);
        double double81 = line79.slope;
        boolean boolean82 = line67.Intersect(line79);
        Line line85 = new Line((double) (byte) 0, (double) 'a');
        double double86 = line85.slope;
        Line line89 = new Line((double) (byte) 0, (double) 'a');
        line89.slope = 0.0d;
        boolean boolean92 = line85.Intersect(line89);
        double double93 = line89.yintercept;
        line89.yintercept = (-1);
        java.lang.String str96 = line89.toString();
        double double97 = line89.slope;
        java.lang.String str98 = line89.toString();
        boolean boolean99 = line67.Intersect(line89);
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
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "slope: 35.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str69.equals("slope: 35.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 1.0d + "'", double75 == 1.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 32.0d + "'", double81 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 97.0d + "'", double93 == 97.0d);
        org.junit.Assert.assertTrue("'" + str96 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str96.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.0d + "'", double97 == 0.0d);
        org.junit.Assert.assertTrue("'" + str98 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str98.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test228");
        Line line2 = new Line((double) ' ', (double) 1);
        line2.slope = (short) 0;
        java.lang.String str5 = line2.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 0.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str5.equals("slope: 0.0, yintercept: 1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test229");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        double double5 = line2.yintercept;
        line2.yintercept = '4';
        Line line10 = new Line((double) (byte) 0, (double) (-1.0f));
        boolean boolean11 = line2.Intersect(line10);
        Line line14 = new Line((double) (byte) 0, (double) 'a');
        double double15 = line14.slope;
        double double16 = line14.slope;
        double double17 = line14.slope;
        line14.yintercept = 100.0f;
        boolean boolean20 = line10.Intersect(line14);
        line14.yintercept = (short) -1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test230");
        Line line2 = new Line((double) (short) 1, (double) (-1));
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        java.lang.String str7 = line5.toString();
        double double8 = line5.slope;
        boolean boolean9 = line2.Intersect(line5);
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
        line20.slope = 0L;
        line20.yintercept = (-1L);
        line20.yintercept = 0.0d;
        double double36 = line20.yintercept;
        boolean boolean37 = line2.Intersect(line20);
        java.lang.Class<?> wildcardClass38 = line20.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str7.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test231");
        Line line2 = new Line((double) 10L, (double) (-1));
        Line line5 = new Line((double) 100L, (double) 100);
        boolean boolean6 = line2.Intersect(line5);
        double double7 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test232");
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
        line10.slope = 100.0f;
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
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test233");
        Line line2 = new Line((double) 10L, (double) ' ');
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        double double4 = line2.slope;
        Line line7 = new Line((double) 'a', (double) (byte) 10);
        line7.slope = (short) 100;
        line7.slope = 97.0d;
        boolean boolean12 = line2.Intersect(line7);
        java.lang.Class<?> wildcardClass13 = line7.getClass();
        java.lang.String str14 = line7.toString();
        line7.slope = 10;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str14.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test234");
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
        line7.yintercept = 52.0d;
        line7.slope = 100.0f;
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 97.0d + "'", double28 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test235");
        Line line2 = new Line((double) (byte) 100, (double) (short) 10);
        java.lang.String str3 = line2.toString();
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 100.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str3.equals("slope: 100.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test236");
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
        java.lang.String str53 = line49.toString();
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
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "slope: 100.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str53.equals("slope: 100.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test237");
        Line line2 = new Line((double) (-1.0f), (double) ' ');
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        line9.slope = 0.0d;
        boolean boolean12 = line5.Intersect(line9);
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        double double16 = line15.slope;
        boolean boolean17 = line9.Intersect(line15);
        line15.slope = 97.0d;
        line15.yintercept = (-1.0d);
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
        line39.yintercept = (short) 1;
        line39.yintercept = 1.0f;
        boolean boolean46 = line15.Intersect(line39);
        java.lang.Class<?> wildcardClass47 = line15.getClass();
        boolean boolean48 = line2.Intersect(line15);
        line15.yintercept = 0;
        line15.slope = 10.0f;
        line15.slope = (short) 10;
        java.lang.Class<?> wildcardClass55 = line15.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str40.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test238");
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
        java.lang.String str39 = line6.toString();
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
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str39.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test239");
        Line line2 = new Line((double) ' ', (double) 1);
        java.lang.String str3 = line2.toString();
        double double4 = line2.slope;
        java.lang.Class<?> wildcardClass5 = line2.getClass();
        Line line8 = new Line((double) 10L, (double) ' ');
        java.lang.String str9 = line8.toString();
        double double10 = line8.yintercept;
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
        double double32 = line28.yintercept;
        boolean boolean33 = line13.Intersect(line28);
        Line line36 = new Line((double) (byte) 0, (double) 'a');
        line36.slope = (short) 100;
        double double39 = line36.yintercept;
        boolean boolean40 = line28.Intersect(line36);
        java.lang.Class<?> wildcardClass41 = line36.getClass();
        boolean boolean42 = line8.Intersect(line36);
        boolean boolean43 = line2.Intersect(line36);
        line2.yintercept = (short) 10;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 32.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str3.equals("slope: 32.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 10.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str9.equals("slope: 10.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 97.0d + "'", double39 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test240");
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
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        double double27 = line26.slope;
        Line line30 = new Line((double) (byte) 0, (double) 'a');
        double double31 = line30.slope;
        Line line34 = new Line((double) (byte) 0, (double) 'a');
        line34.slope = 0.0d;
        boolean boolean37 = line30.Intersect(line34);
        Line line40 = new Line((double) (byte) 0, (double) 'a');
        double double41 = line40.slope;
        boolean boolean42 = line34.Intersect(line40);
        boolean boolean43 = line26.Intersect(line34);
        Line line46 = new Line((double) 10L, (double) ' ');
        line46.slope = 1L;
        double double49 = line46.slope;
        Line line52 = new Line((double) (byte) 0, (double) 'a');
        double double53 = line52.slope;
        Line line56 = new Line((double) (byte) 0, (double) 'a');
        line56.slope = 0.0d;
        boolean boolean59 = line52.Intersect(line56);
        double double60 = line52.yintercept;
        double double61 = line52.slope;
        boolean boolean62 = line46.Intersect(line52);
        boolean boolean63 = line26.Intersect(line52);
        Line line66 = new Line((double) ' ', (double) 1);
        boolean boolean67 = line26.Intersect(line66);
        java.lang.String str68 = line26.toString();
        line26.yintercept = (byte) 100;
        boolean boolean71 = line2.Intersect(line26);
        double double72 = line26.yintercept;
        java.lang.String str73 = line26.toString();
        double double74 = line26.yintercept;
        double double75 = line26.slope;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str8.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 97.0d + "'", double60 == 97.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str68.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 100.0d + "'", double72 == 100.0d);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "slope: 0.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str73.equals("slope: 0.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 100.0d + "'", double74 == 100.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test241");
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
        java.lang.String str17 = line6.toString();
        line6.yintercept = '4';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str15.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str17.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test242");
        Line line2 = new Line((-1.0d), (-1.0d));
        double double3 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test243");
        Line line2 = new Line(10.0d, 0.0d);
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
        double double43 = line31.yintercept;
        line31.yintercept = 0L;
        double double46 = line31.slope;
        java.lang.String str47 = line31.toString();
        line31.slope = 35.0d;
        Line line52 = new Line(32.0d, (double) 10.0f);
        double double53 = line52.slope;
        java.lang.String str54 = line52.toString();
        java.lang.Class<?> wildcardClass55 = line52.getClass();
        boolean boolean56 = line31.Intersect(line52);
        boolean boolean57 = line2.Intersect(line52);
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
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 97.0d + "'", double43 == 97.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "slope: 0.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str47.equals("slope: 0.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 32.0d + "'", double53 == 32.0d);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "slope: 32.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str54.equals("slope: 32.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test244");
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
        java.lang.Class<?> wildcardClass64 = line52.getClass();
        Line line67 = new Line((double) '#', 0.0d);
        boolean boolean68 = line52.Intersect(line67);
        java.lang.String str69 = line67.toString();
        java.lang.Class<?> wildcardClass70 = line67.getClass();
        double double71 = line67.slope;
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
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "slope: 35.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str69.equals("slope: 35.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 35.0d + "'", double71 == 35.0d);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test245");
        Line line2 = new Line((double) (short) 1, (double) (-1));
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        java.lang.String str7 = line5.toString();
        double double8 = line5.slope;
        boolean boolean9 = line2.Intersect(line5);
        Line line12 = new Line((double) 'a', (double) (byte) 10);
        double double13 = line12.slope;
        java.lang.Class<?> wildcardClass14 = line12.getClass();
        java.lang.Class<?> wildcardClass15 = line12.getClass();
        double double16 = line12.slope;
        boolean boolean17 = line2.Intersect(line12);
        java.lang.Class<?> wildcardClass18 = line12.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str7.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test246");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        line2.slope = 100.0f;
        java.lang.Class<?> wildcardClass13 = line2.getClass();
        double double14 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test247");
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
        java.lang.String str22 = line8.toString();
        Line line25 = new Line((double) 100.0f, (double) (short) -1);
        Line line28 = new Line(1.0d, (double) 'a');
        boolean boolean29 = line25.Intersect(line28);
        boolean boolean30 = line8.Intersect(line25);
        java.lang.String str31 = line8.toString();
        double double32 = line8.slope;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str22.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str31.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test248");
        Line line2 = new Line((double) 10L, (double) ' ');
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        double double4 = line2.slope;
        Line line7 = new Line((double) 'a', (double) (byte) 10);
        line7.slope = (short) 100;
        line7.slope = 97.0d;
        boolean boolean12 = line2.Intersect(line7);
        double double13 = line7.yintercept;
        java.lang.String str14 = line7.toString();
        java.lang.Class<?> wildcardClass15 = line7.getClass();
        line7.slope = 10.0f;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str14.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test249");
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
        double double49 = line2.slope;
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
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test250");
        Line line2 = new Line((double) (short) 10, (double) (byte) 10);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test251");
        Line line2 = new Line(97.0d, (double) (short) -1);
        line2.slope = (-1.0f);
        line2.slope = 10.0d;
        line2.slope = (-1L);
        java.lang.Class<?> wildcardClass9 = line2.getClass();
        line2.slope = (byte) 100;
        line2.slope = (-1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test252");
        Line line2 = new Line((double) (short) 100, (double) 1.0f);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test253");
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
        line2.yintercept = 10L;
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        double double30 = line29.slope;
        Line line33 = new Line((double) (byte) 0, (double) 'a');
        line33.slope = 0.0d;
        boolean boolean36 = line29.Intersect(line33);
        Line line39 = new Line((double) (byte) 0, (double) 'a');
        double double40 = line39.slope;
        boolean boolean41 = line33.Intersect(line39);
        double double42 = line33.slope;
        Line line45 = new Line((double) 1.0f, (double) (short) 1);
        boolean boolean46 = line33.Intersect(line45);
        double double47 = line45.slope;
        boolean boolean48 = line2.Intersect(line45);
        double double49 = line45.slope;
        double double50 = line45.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 97.0d + "'", double23 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test254");
        Line line2 = new Line(97.0d, (double) (short) 1);
        Line line5 = new Line((double) 0, (-1.0d));
        boolean boolean6 = line2.Intersect(line5);
        java.lang.String str7 = line5.toString();
        java.lang.Class<?> wildcardClass8 = line5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str7.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test255");
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
        java.lang.Class<?> wildcardClass20 = line5.getClass();
        java.lang.String str21 = line5.toString();
        line5.slope = 'a';
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 1.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str21.equals("slope: 1.0, yintercept: 32.0, epsilon:1.0E-6"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test256");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        double double4 = line2.slope;
        java.lang.String str5 = line2.toString();
        java.lang.String str6 = line2.toString();
        double double7 = line2.slope;
        Line line10 = new Line((double) 'a', 1.0d);
        Line line13 = new Line((double) 'a', (double) (byte) 10);
        line13.slope = (short) 100;
        line13.slope = 97.0d;
        line13.yintercept = (-1L);
        java.lang.String str20 = line13.toString();
        double double21 = line13.yintercept;
        java.lang.Class<?> wildcardClass22 = line13.getClass();
        boolean boolean23 = line10.Intersect(line13);
        boolean boolean24 = line2.Intersect(line13);
        double double25 = line13.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str5.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str6.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str20.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test257");
        Line line2 = new Line((double) 10L, (double) ' ');
        java.lang.String str3 = line2.toString();
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        Line line7 = new Line(0.0d, (double) (short) -1);
        line7.yintercept = 10;
        boolean boolean10 = line2.Intersect(line7);
        Line line13 = new Line((double) 10L, (double) ' ');
        line13.slope = 1L;
        double double16 = line13.slope;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        line23.slope = 0.0d;
        boolean boolean26 = line19.Intersect(line23);
        double double27 = line19.yintercept;
        double double28 = line19.slope;
        boolean boolean29 = line13.Intersect(line19);
        java.lang.String str30 = line19.toString();
        line19.slope = 0.0d;
        boolean boolean33 = line7.Intersect(line19);
        line19.slope = (short) 100;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 10.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str3.equals("slope: 10.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 97.0d + "'", double27 == 97.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str30.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test258");
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
        double double21 = line6.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test259");
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
        line27.yintercept = 52.0d;
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
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test260");
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
        double double42 = line28.slope;
        java.lang.Class<?> wildcardClass43 = line28.getClass();
        Line line46 = new Line((double) 'a', (double) (byte) 10);
        double double47 = line46.slope;
        Line line50 = new Line((double) (byte) 0, (double) 'a');
        double double51 = line50.slope;
        Line line54 = new Line((double) (byte) 0, (double) 'a');
        double double55 = line54.slope;
        Line line58 = new Line((double) (byte) 0, (double) 'a');
        line58.slope = 0.0d;
        boolean boolean61 = line54.Intersect(line58);
        Line line64 = new Line((double) (byte) 0, (double) 'a');
        double double65 = line64.slope;
        boolean boolean66 = line58.Intersect(line64);
        java.lang.String str67 = line58.toString();
        double double68 = line58.slope;
        boolean boolean69 = line50.Intersect(line58);
        java.lang.Class<?> wildcardClass70 = line50.getClass();
        boolean boolean71 = line46.Intersect(line50);
        double double72 = line46.yintercept;
        Line line75 = new Line((double) (byte) 0, (double) 'a');
        line75.slope = 0.0d;
        Line line80 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean81 = line75.Intersect(line80);
        line80.yintercept = '4';
        boolean boolean84 = line46.Intersect(line80);
        Line line87 = new Line(0.0d, (double) '4');
        boolean boolean88 = line80.Intersect(line87);
        Line line91 = new Line((double) 0.0f, (double) (short) 1);
        double double92 = line91.yintercept;
        double double93 = line91.yintercept;
        line91.slope = (short) 0;
        java.lang.String str96 = line91.toString();
        boolean boolean97 = line87.Intersect(line91);
        boolean boolean98 = line28.Intersect(line87);
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
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 97.0d + "'", double47 == 97.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str67.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 1.0d + "'", double92 == 1.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 1.0d + "'", double93 == 1.0d);
        org.junit.Assert.assertTrue("'" + str96 + "' != '" + "slope: 0.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str96.equals("slope: 0.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test261");
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
        Line line22 = new Line((double) (byte) 100, 52.0d);
        Line line25 = new Line((double) (byte) 0, (double) 'a');
        double double26 = line25.slope;
        Line line29 = new Line((double) (byte) 0, (double) 'a');
        line29.slope = 0.0d;
        boolean boolean32 = line25.Intersect(line29);
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        double double36 = line35.slope;
        boolean boolean37 = line29.Intersect(line35);
        line35.slope = 97.0d;
        boolean boolean40 = line22.Intersect(line35);
        boolean boolean41 = line18.Intersect(line35);
        java.lang.String str42 = line35.toString();
        line35.slope = (short) -1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "slope: 97.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str42.equals("slope: 97.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test262");
        Line line2 = new Line((double) (short) 1, (double) ' ');
        java.lang.String str3 = line2.toString();
        double double4 = line2.slope;
        double double5 = line2.slope;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 1.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str3.equals("slope: 1.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test263");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        java.lang.String str5 = line2.toString();
        double double6 = line2.yintercept;
        line2.slope = ' ';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str5.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test264");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        java.lang.Class<?> wildcardClass11 = line2.getClass();
        double double12 = line2.slope;
        line2.yintercept = 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test265");
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
        java.lang.String str50 = line2.toString();
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
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "slope: 0.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str50.equals("slope: 0.0, yintercept: 100.0, epsilon:1.0E-6"));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test266");
        Line line2 = new Line((double) 100.0f, (double) (-1L));
        line2.slope = 100.0d;
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test267");
        Line line2 = new Line((double) 100L, 97.0d);
        line2.slope = 32.0d;
        line2.yintercept = 100.0d;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        double double10 = line9.slope;
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        line13.slope = 0.0d;
        boolean boolean16 = line9.Intersect(line13);
        Line line19 = new Line((double) ' ', (double) '4');
        boolean boolean20 = line9.Intersect(line19);
        double double21 = line19.yintercept;
        boolean boolean22 = line2.Intersect(line19);
        line2.slope = 100;
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test268");
        Line line2 = new Line((double) 10L, (double) ' ');
        java.lang.String str3 = line2.toString();
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        line2.slope = (-1.0f);
        line2.yintercept = 1L;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 10.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str3.equals("slope: 10.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test269");
        Line line2 = new Line((double) 10L, (double) ' ');
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        double double4 = line2.slope;
        Line line7 = new Line((double) 'a', (double) (byte) 10);
        line7.slope = (short) 100;
        line7.slope = 97.0d;
        boolean boolean12 = line2.Intersect(line7);
        java.lang.Class<?> wildcardClass13 = line7.getClass();
        double double14 = line7.slope;
        double double15 = line7.slope;
        java.lang.String str16 = line7.toString();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str16.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test270");
        Line line2 = new Line((double) 100, (double) 'a');
        double double3 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test271");
        Line line2 = new Line((double) 0.0f, (double) (short) 1);
        double double3 = line2.yintercept;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        line10.slope = 0.0d;
        boolean boolean13 = line6.Intersect(line10);
        Line line16 = new Line((double) (byte) 0, (double) 'a');
        double double17 = line16.slope;
        boolean boolean18 = line10.Intersect(line16);
        line16.yintercept = 10;
        line16.yintercept = (byte) 0;
        Line line25 = new Line((double) 100L, 97.0d);
        line25.slope = 32.0d;
        line25.slope = '4';
        boolean boolean30 = line16.Intersect(line25);
        line25.yintercept = (-1.0f);
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        double double36 = line35.slope;
        Line line39 = new Line((double) (byte) 0, (double) 'a');
        line39.slope = 0.0d;
        boolean boolean42 = line35.Intersect(line39);
        double double43 = line39.yintercept;
        double double44 = line39.yintercept;
        boolean boolean45 = line25.Intersect(line39);
        boolean boolean46 = line2.Intersect(line25);
        line25.yintercept = (byte) -1;
        line25.yintercept = (byte) 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 97.0d + "'", double43 == 97.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 97.0d + "'", double44 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test272");
        Line line2 = new Line((-1.0d), (double) (short) 100);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test273");
        Line line2 = new Line(97.0d, (double) (byte) 1);
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test274");
        Line line2 = new Line((double) 'a', (double) 100);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test275");
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
        java.lang.Class<?> wildcardClass18 = line6.getClass();
        line6.slope = 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test276");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        Line line8 = new Line((double) 0, (-1.0d));
        java.lang.String str9 = line8.toString();
        line8.yintercept = 10L;
        boolean boolean12 = line2.Intersect(line8);
        Line line15 = new Line((double) 'a', (double) (byte) 10);
        double double16 = line15.slope;
        line15.yintercept = 10.0f;
        double double19 = line15.slope;
        double double20 = line15.slope;
        boolean boolean21 = line2.Intersect(line15);
        double double22 = line15.yintercept;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str9.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test277");
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
        double double76 = line45.slope;
        line45.slope = (-1L);
        double double79 = line45.yintercept;
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
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 1.0d + "'", double79 == 1.0d);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test278");
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
        double double19 = line7.slope;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test279");
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
        java.lang.String str19 = line10.toString();
        double double20 = line10.slope;
        boolean boolean21 = line2.Intersect(line10);
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        double double25 = line24.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        Line line38 = new Line((double) (byte) 0, (double) 'a');
        double double39 = line38.slope;
        boolean boolean40 = line32.Intersect(line38);
        boolean boolean41 = line24.Intersect(line32);
        Line line44 = new Line((double) (byte) 10, 97.0d);
        double double45 = line44.yintercept;
        boolean boolean46 = line24.Intersect(line44);
        line24.yintercept = 0.0f;
        boolean boolean49 = line10.Intersect(line24);
        java.lang.Class<?> wildcardClass50 = line10.getClass();
        Line line53 = new Line((double) 10L, (double) ' ');
        java.lang.Class<?> wildcardClass54 = line53.getClass();
        double double55 = line53.slope;
        Line line58 = new Line((double) 'a', (double) (byte) 10);
        line58.slope = (short) 100;
        line58.slope = 97.0d;
        boolean boolean63 = line53.Intersect(line58);
        java.lang.Class<?> wildcardClass64 = line58.getClass();
        double double65 = line58.slope;
        double double66 = line58.slope;
        boolean boolean67 = line10.Intersect(line58);
        double double68 = line58.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str19.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 97.0d + "'", double45 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 97.0d + "'", double65 == 97.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 97.0d + "'", double66 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test280");
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
        java.lang.Class<?> wildcardClass55 = line2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test281");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        double double4 = line2.slope;
        java.lang.String str5 = line2.toString();
        java.lang.String str6 = line2.toString();
        double double7 = line2.slope;
        line2.yintercept = 10;
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        double double11 = line2.slope;
        Line line14 = new Line((double) (byte) 0, (double) 'a');
        double double15 = line14.slope;
        Line line18 = new Line((double) (byte) 0, (double) 'a');
        line18.slope = 0.0d;
        boolean boolean21 = line14.Intersect(line18);
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        double double25 = line24.slope;
        boolean boolean26 = line18.Intersect(line24);
        java.lang.Class<?> wildcardClass27 = line18.getClass();
        java.lang.String str28 = line18.toString();
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        double double32 = line31.slope;
        Line line35 = new Line((double) (byte) 0, (double) 'a');
        line35.slope = 0.0d;
        boolean boolean38 = line31.Intersect(line35);
        Line line41 = new Line((double) (byte) 0, (double) 'a');
        double double42 = line41.slope;
        boolean boolean43 = line35.Intersect(line41);
        java.lang.Class<?> wildcardClass44 = line35.getClass();
        java.lang.String str45 = line35.toString();
        boolean boolean46 = line18.Intersect(line35);
        line35.slope = 0.0d;
        Line line51 = new Line(10.0d, (double) 0L);
        Line line54 = new Line((double) 'a', (double) (byte) 10);
        line54.yintercept = (-1.0f);
        boolean boolean57 = line51.Intersect(line54);
        Line line60 = new Line((double) (byte) 0, (double) 'a');
        double double61 = line60.slope;
        java.lang.Class<?> wildcardClass62 = line60.getClass();
        Line line65 = new Line((double) (byte) 0, (double) 'a');
        double double66 = line65.slope;
        Line line69 = new Line((double) (byte) 0, (double) 'a');
        line69.slope = 0.0d;
        boolean boolean72 = line65.Intersect(line69);
        double double73 = line69.yintercept;
        Line line76 = new Line(0.0d, (double) (-1L));
        boolean boolean77 = line69.Intersect(line76);
        double double78 = line76.slope;
        boolean boolean79 = line60.Intersect(line76);
        boolean boolean80 = line51.Intersect(line60);
        double double81 = line60.slope;
        boolean boolean82 = line35.Intersect(line60);
        java.lang.String str83 = line60.toString();
        line60.yintercept = 'a';
        boolean boolean86 = line2.Intersect(line60);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str5.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str6.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str28.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str45.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 97.0d + "'", double73 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str83.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test282");
        Line line2 = new Line((double) ' ', (double) 1);
        line2.slope = 'a';
        double double5 = line2.yintercept;
        java.lang.Class<?> wildcardClass6 = line2.getClass();
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
        double double36 = line30.slope;
        boolean boolean37 = line2.Intersect(line30);
        Line line40 = new Line(32.0d, (double) (byte) 10);
        boolean boolean41 = line30.Intersect(line40);
        line40.slope = 0.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test283");
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
        double double24 = line10.slope;
        double double25 = line10.slope;
        java.lang.String str26 = line10.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str26.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test284");
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
        double double17 = line13.yintercept;
        Line line20 = new Line((double) (byte) 10, (-1.0d));
        double double21 = line20.yintercept;
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        double double25 = line24.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        line28.slope = 0.0d;
        boolean boolean31 = line24.Intersect(line28);
        Line line34 = new Line((double) ' ', (double) '4');
        boolean boolean35 = line24.Intersect(line34);
        double double36 = line24.yintercept;
        boolean boolean37 = line20.Intersect(line24);
        boolean boolean38 = line13.Intersect(line24);
        java.lang.Class<?> wildcardClass39 = line13.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test285");
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
        double double22 = line8.slope;
        java.lang.Class<?> wildcardClass23 = line8.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str19.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test286");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = 100.0f;
        double double5 = line2.slope;
        Line line8 = new Line(10.0d, (double) 0L);
        Line line11 = new Line((double) 'a', (double) (byte) 10);
        line11.yintercept = (-1.0f);
        boolean boolean14 = line8.Intersect(line11);
        boolean boolean15 = line2.Intersect(line8);
        java.lang.String str16 = line8.toString();
        line8.slope = 0L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 10.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str16.equals("slope: 10.0, yintercept: 0.0, epsilon:1.0E-6"));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test287");
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
        line6.slope = (short) 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test288");
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
        java.lang.String str19 = line2.toString();
        java.lang.String str20 = line2.toString();
        line2.slope = 1.0f;
        java.lang.Class<?> wildcardClass23 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 1.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str19.equals("slope: 1.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "slope: 1.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str20.equals("slope: 1.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test289");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) (byte) 0, (double) 'a');
        double double13 = line12.slope;
        boolean boolean14 = line6.Intersect(line12);
        java.lang.String str15 = line6.toString();
        Line line18 = new Line((double) 'a', (double) (byte) 10);
        line18.slope = (short) 100;
        line18.slope = 97.0d;
        java.lang.String str23 = line18.toString();
        java.lang.String str24 = line18.toString();
        Line line27 = new Line((double) 10L, (double) ' ');
        line27.slope = 1L;
        double double30 = line27.yintercept;
        boolean boolean31 = line18.Intersect(line27);
        Line line34 = new Line((double) (byte) 0, (double) 'a');
        double double35 = line34.slope;
        java.lang.Class<?> wildcardClass36 = line34.getClass();
        java.lang.String str37 = line34.toString();
        boolean boolean38 = line18.Intersect(line34);
        boolean boolean39 = line6.Intersect(line34);
        java.lang.Class<?> wildcardClass40 = line34.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str15.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str23.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str24.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 32.0d + "'", double30 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str37.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test290");
        Line line2 = new Line(10.0d, (double) 0L);
        Line line5 = new Line((double) 'a', (double) (byte) 10);
        line5.yintercept = (-1.0f);
        boolean boolean8 = line2.Intersect(line5);
        java.lang.String str9 = line5.toString();
        java.lang.String str10 = line5.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str10.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test291");
        Line line2 = new Line(0.0d, (double) 1);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test292");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        double double14 = line2.slope;
        double double15 = line2.yintercept;
        java.lang.String str16 = line2.toString();
        line2.slope = 32.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test293");
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
        double double19 = line17.slope;
        java.lang.String str20 = line17.toString();
        Line line23 = new Line((double) (byte) 0, (double) 'a');
        double double24 = line23.slope;
        Line line27 = new Line((double) (byte) 0, (double) 'a');
        line27.slope = 0.0d;
        boolean boolean30 = line23.Intersect(line27);
        java.lang.Class<?> wildcardClass31 = line23.getClass();
        Line line34 = new Line((double) (byte) 0, (double) 'a');
        double double35 = line34.slope;
        Line line38 = new Line((double) (byte) 0, (double) 'a');
        line38.slope = 0.0d;
        boolean boolean41 = line34.Intersect(line38);
        double double42 = line34.yintercept;
        boolean boolean43 = line23.Intersect(line34);
        boolean boolean44 = line17.Intersect(line34);
        boolean boolean45 = line6.Intersect(line17);
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        double double49 = line48.slope;
        Line line52 = new Line((double) (byte) 0, (double) 'a');
        line52.slope = 0.0d;
        boolean boolean55 = line48.Intersect(line52);
        double double56 = line52.yintercept;
        java.lang.String str57 = line52.toString();
        Line line60 = new Line(10.0d, (double) 10);
        boolean boolean61 = line52.Intersect(line60);
        Line line64 = new Line((double) (short) 100, (double) ' ');
        double double65 = line64.yintercept;
        boolean boolean66 = line52.Intersect(line64);
        boolean boolean67 = line6.Intersect(line64);
        double double68 = line64.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str20.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 97.0d + "'", double42 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 97.0d + "'", double56 == 97.0d);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str57.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 32.0d + "'", double65 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 100.0d + "'", double68 == 100.0d);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test294");
        Line line2 = new Line((double) 100, (double) (-1.0f));
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        line9.slope = 0.0d;
        boolean boolean12 = line5.Intersect(line9);
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        double double16 = line15.slope;
        boolean boolean17 = line9.Intersect(line15);
        line15.slope = 97.0d;
        line15.yintercept = (-1.0d);
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
        line39.yintercept = (short) 1;
        line39.yintercept = 1.0f;
        boolean boolean46 = line15.Intersect(line39);
        line39.slope = 100.0f;
        boolean boolean49 = line2.Intersect(line39);
        double double50 = line39.slope;
        line39.yintercept = '4';
        double double53 = line39.slope;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 97.0d + "'", double32 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str40.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 100.0d + "'", double53 == 100.0d);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test295");
        Line line2 = new Line((double) (byte) 10, 97.0d);
        double double3 = line2.yintercept;
        double double4 = line2.slope;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        double double8 = line7.slope;
        Line line11 = new Line((double) (byte) 0, (double) 'a');
        line11.slope = 0.0d;
        boolean boolean14 = line7.Intersect(line11);
        java.lang.Class<?> wildcardClass15 = line7.getClass();
        java.lang.Class<?> wildcardClass16 = line7.getClass();
        double double17 = line7.yintercept;
        boolean boolean18 = line2.Intersect(line7);
        double double19 = line7.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test296");
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
        line28.yintercept = '4';
        Line line49 = new Line((double) ' ', (double) 1);
        java.lang.String str50 = line49.toString();
        double double51 = line49.yintercept;
        line49.slope = (byte) 10;
        line49.slope = 0;
        boolean boolean56 = line28.Intersect(line49);
        java.lang.Class<?> wildcardClass57 = line49.getClass();
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
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "slope: 32.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str50.equals("slope: 32.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test297");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = 1.0d;
        Line line7 = new Line((double) 'a', (double) (byte) 10);
        double double8 = line7.yintercept;
        java.lang.String str9 = line7.toString();
        line7.slope = 1;
        line7.slope = 0L;
        java.lang.Class<?> wildcardClass14 = line7.getClass();
        boolean boolean15 = line2.Intersect(line7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test298");
        Line line2 = new Line((double) 10L, (double) ' ');
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        double double4 = line2.slope;
        Line line7 = new Line((double) 'a', (double) (byte) 10);
        line7.slope = (short) 100;
        line7.slope = 97.0d;
        boolean boolean12 = line2.Intersect(line7);
        java.lang.String str13 = line2.toString();
        line2.yintercept = (-1);
        Line line18 = new Line((double) 10L, (double) ' ');
        java.lang.String str19 = line18.toString();
        java.lang.String str20 = line18.toString();
        boolean boolean21 = line2.Intersect(line18);
        double double22 = line18.yintercept;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "slope: 10.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str13.equals("slope: 10.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 10.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str19.equals("slope: 10.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "slope: 10.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str20.equals("slope: 10.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 32.0d + "'", double22 == 32.0d);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test299");
        Line line2 = new Line((double) '#', (double) (byte) 10);
        double double3 = line2.slope;
        line2.yintercept = 52.0d;
        Line line8 = new Line((double) 0.0f, (double) (short) 1);
        double double9 = line8.yintercept;
        double double10 = line8.yintercept;
        line8.yintercept = 'a';
        java.lang.Class<?> wildcardClass13 = line8.getClass();
        java.lang.Class<?> wildcardClass14 = line8.getClass();
        boolean boolean15 = line2.Intersect(line8);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test300");
        Line line2 = new Line((double) (byte) -1, (double) (short) 1);
        java.lang.String str3 = line2.toString();
        java.lang.String str4 = line2.toString();
        double double5 = line2.slope;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: -1.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str3.equals("slope: -1.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "slope: -1.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str4.equals("slope: -1.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test301");
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
        line28.yintercept = 1L;
        double double48 = line28.slope;
        line28.slope = 0.0d;
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
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test302");
        Line line2 = new Line((double) ' ', (double) 1);
        java.lang.String str3 = line2.toString();
        double double4 = line2.yintercept;
        double double5 = line2.slope;
        line2.slope = '4';
        line2.slope = (-1.0f);
        double double10 = line2.slope;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 32.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str3.equals("slope: 32.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test303");
        Line line2 = new Line((double) 1, (double) 1L);
        double double3 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test304");
        Line line2 = new Line((double) 100L, (double) 1);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test305");
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
        double double26 = line20.yintercept;
        line20.yintercept = 32.0d;
        line20.slope = 0.0d;
        double double31 = line20.yintercept;
        double double32 = line20.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 97.0d + "'", double26 == 97.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 32.0d + "'", double31 == 32.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test306");
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
        line6.yintercept = (byte) -1;
        java.lang.String str24 = line6.toString();
        line6.yintercept = 1.0d;
        line6.yintercept = (short) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "slope: 1.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str24.equals("slope: 1.0, yintercept: -1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test307");
        Line line2 = new Line((double) 100.0f, (double) 1L);
        Line line5 = new Line((double) 10L, (double) ' ');
        line5.slope = 1L;
        double double8 = line5.slope;
        Line line11 = new Line((double) (byte) 0, (double) 'a');
        double double12 = line11.slope;
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        line15.slope = 0.0d;
        boolean boolean18 = line11.Intersect(line15);
        double double19 = line11.yintercept;
        double double20 = line11.slope;
        boolean boolean21 = line5.Intersect(line11);
        line11.slope = (byte) 10;
        Line line26 = new Line((double) 'a', (double) (byte) 10);
        double double27 = line26.slope;
        line26.yintercept = 10.0f;
        double double30 = line26.slope;
        Line line33 = new Line((double) ' ', (double) 1);
        line33.yintercept = 100.0f;
        boolean boolean36 = line26.Intersect(line33);
        double double37 = line26.yintercept;
        boolean boolean38 = line11.Intersect(line26);
        java.lang.Class<?> wildcardClass39 = line26.getClass();
        line26.slope = 100.0f;
        boolean boolean42 = line2.Intersect(line26);
        java.lang.Class<?> wildcardClass43 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 97.0d + "'", double27 == 97.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 97.0d + "'", double30 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test308");
        Line line2 = new Line((double) 100.0f, 100.0d);
        Line line5 = new Line((double) (short) -1, 32.0d);
        boolean boolean6 = line2.Intersect(line5);
        double double7 = line5.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        double double11 = line10.slope;
        java.lang.Class<?> wildcardClass12 = line10.getClass();
        double double13 = line10.yintercept;
        boolean boolean14 = line5.Intersect(line10);
        java.lang.String str15 = line10.toString();
        line10.yintercept = 52.0d;
        java.lang.String str18 = line10.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str15.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 0.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str18.equals("slope: 0.0, yintercept: 52.0, epsilon:1.0E-6"));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test309");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        java.lang.Class<?> wildcardClass15 = line13.getClass();
        double double16 = line13.yintercept;
        double double17 = line13.slope;
        Line line20 = new Line((double) 'a', (double) (byte) 10);
        line20.slope = (short) 100;
        line20.slope = 97.0d;
        line20.yintercept = (-1L);
        java.lang.String str27 = line20.toString();
        double double28 = line20.yintercept;
        java.lang.Class<?> wildcardClass29 = line20.getClass();
        java.lang.String str30 = line20.toString();
        line20.yintercept = 35.0d;
        java.lang.Class<?> wildcardClass33 = line20.getClass();
        java.lang.String str34 = line20.toString();
        boolean boolean35 = line13.Intersect(line20);
        line20.yintercept = '4';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str27.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str30.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "slope: 97.0, yintercept: 35.0, epsilon:1.0E-6" + "'", str34.equals("slope: 97.0, yintercept: 35.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test310");
        Line line2 = new Line(0.0d, (-1.0d));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test311");
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
        line13.yintercept = 0.0d;
        line13.yintercept = (byte) 0;
        double double21 = line13.yintercept;
        java.lang.String str22 = line13.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "slope: 0.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str22.equals("slope: 0.0, yintercept: 0.0, epsilon:1.0E-6"));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test312");
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
        double double19 = line7.yintercept;
        Line line22 = new Line((double) 10L, (double) (-1));
        boolean boolean23 = line7.Intersect(line22);
        line22.yintercept = (-1.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test313");
        Line line2 = new Line(1.0d, (double) 1.0f);
        double double3 = line2.yintercept;
        Line line6 = new Line((double) 10L, (double) ' ');
        java.lang.Class<?> wildcardClass7 = line6.getClass();
        double double8 = line6.slope;
        Line line11 = new Line((double) 'a', (double) (byte) 10);
        line11.slope = (short) 100;
        line11.slope = 97.0d;
        boolean boolean16 = line6.Intersect(line11);
        Line line19 = new Line((double) (byte) 1, 1.0d);
        line19.slope = 10.0f;
        boolean boolean22 = line11.Intersect(line19);
        boolean boolean23 = line2.Intersect(line11);
        double double24 = line2.yintercept;
        java.lang.Class<?> wildcardClass25 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test314");
        Line line2 = new Line(1.0d, (double) 'a');
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test315");
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
        double double22 = line6.yintercept;
        line6.yintercept = (-1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str18.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test316");
        Line line2 = new Line((double) 0.0f, (double) '#');
        java.lang.String str3 = line2.toString();
        double double4 = line2.slope;
        double double5 = line2.yintercept;
        line2.yintercept = 10.0d;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 0.0, yintercept: 35.0, epsilon:1.0E-6" + "'", str3.equals("slope: 0.0, yintercept: 35.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test317");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        double double6 = line2.slope;
        line2.yintercept = '4';
        line2.yintercept = 97.0d;
        java.lang.String str11 = line2.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 1.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str11.equals("slope: 1.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test318");
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
        java.lang.String str44 = line28.toString();
        Line line47 = new Line((double) 100L, 97.0d);
        line47.slope = 32.0d;
        java.lang.String str50 = line47.toString();
        double double51 = line47.slope;
        boolean boolean52 = line28.Intersect(line47);
        java.lang.String str53 = line47.toString();
        double double54 = line47.yintercept;
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
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "slope: 35.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str44.equals("slope: 35.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "slope: 32.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str50.equals("slope: 32.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 32.0d + "'", double51 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "slope: 32.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str53.equals("slope: 32.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 97.0d + "'", double54 == 97.0d);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test319");
        Line line2 = new Line((double) 'a', (double) (byte) -1);
        Line line5 = new Line(10.0d, (double) 0L);
        Line line8 = new Line((double) 'a', (double) (byte) 10);
        line8.yintercept = (-1.0f);
        boolean boolean11 = line5.Intersect(line8);
        java.lang.Class<?> wildcardClass12 = line8.getClass();
        java.lang.Class<?> wildcardClass13 = line8.getClass();
        boolean boolean14 = line2.Intersect(line8);
        Line line17 = new Line((double) 100, 52.0d);
        Line line20 = new Line((double) (byte) 0, (double) 'a');
        double double21 = line20.slope;
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        line24.slope = 0.0d;
        boolean boolean27 = line20.Intersect(line24);
        double double28 = line24.yintercept;
        Line line31 = new Line(0.0d, (double) (-1L));
        boolean boolean32 = line24.Intersect(line31);
        Line line35 = new Line((double) 100L, (double) 100);
        java.lang.String str36 = line35.toString();
        boolean boolean37 = line24.Intersect(line35);
        line35.yintercept = (short) 1;
        line35.yintercept = 1.0f;
        boolean boolean42 = line17.Intersect(line35);
        boolean boolean43 = line8.Intersect(line17);
        line8.slope = 100.0f;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 97.0d + "'", double28 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str36.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test320");
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
        line6.yintercept = (byte) 0;
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        double double23 = line22.slope;
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        line26.slope = 0.0d;
        boolean boolean29 = line22.Intersect(line26);
        double double30 = line26.yintercept;
        Line line33 = new Line(0.0d, (double) (-1L));
        boolean boolean34 = line26.Intersect(line33);
        double double35 = line26.slope;
        java.lang.String str36 = line26.toString();
        Line line39 = new Line((double) 10L, (double) ' ');
        boolean boolean40 = line26.Intersect(line39);
        java.lang.Class<?> wildcardClass41 = line39.getClass();
        line39.yintercept = (short) 1;
        double double44 = line39.slope;
        boolean boolean45 = line6.Intersect(line39);
        double double46 = line6.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str15.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 97.0d + "'", double30 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str36.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test321");
        Line line2 = new Line((double) '#', (double) (short) 1);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test322");
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
        double double24 = line10.yintercept;
        Line line27 = new Line((double) (byte) 0, (double) 'a');
        double double28 = line27.slope;
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        line31.slope = 0.0d;
        boolean boolean34 = line27.Intersect(line31);
        Line line37 = new Line((double) ' ', (double) '4');
        boolean boolean38 = line27.Intersect(line37);
        java.lang.String str39 = line27.toString();
        line27.slope = 10.0d;
        Line line44 = new Line((double) (byte) 0, (double) 'a');
        double double45 = line44.slope;
        Line line48 = new Line((double) (byte) 0, (double) 'a');
        line48.slope = 0.0d;
        boolean boolean51 = line44.Intersect(line48);
        Line line54 = new Line((double) (byte) 0, (double) 'a');
        double double55 = line54.slope;
        boolean boolean56 = line48.Intersect(line54);
        java.lang.Class<?> wildcardClass57 = line48.getClass();
        java.lang.String str58 = line48.toString();
        Line line61 = new Line((double) (byte) 0, (double) 'a');
        double double62 = line61.slope;
        Line line65 = new Line((double) (byte) 0, (double) 'a');
        line65.slope = 0.0d;
        boolean boolean68 = line61.Intersect(line65);
        Line line71 = new Line((double) (byte) 0, (double) 'a');
        double double72 = line71.slope;
        boolean boolean73 = line65.Intersect(line71);
        java.lang.Class<?> wildcardClass74 = line65.getClass();
        java.lang.String str75 = line65.toString();
        boolean boolean76 = line48.Intersect(line65);
        java.lang.Class<?> wildcardClass77 = line48.getClass();
        double double78 = line48.slope;
        boolean boolean79 = line27.Intersect(line48);
        line27.slope = (short) 10;
        java.lang.String str82 = line27.toString();
        boolean boolean83 = line10.Intersect(line27);
        line10.yintercept = (short) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str39.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str58.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str75.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str82.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test323");
        Line line2 = new Line(10.0d, 97.0d);
        java.lang.String str3 = line2.toString();
        line2.slope = 10L;
        double double6 = line2.slope;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 10.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str3.equals("slope: 10.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test324");
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
        java.lang.Class<?> wildcardClass42 = line28.getClass();
        double double43 = line28.yintercept;
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
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 97.0d + "'", double43 == 97.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 97.0d + "'", double44 == 97.0d);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test325");
        Line line2 = new Line((double) (byte) 10, (-1.0d));
        Line line5 = new Line((double) 100L, 97.0d);
        line5.slope = 32.0d;
        java.lang.String str8 = line5.toString();
        boolean boolean9 = line2.Intersect(line5);
        line5.yintercept = (-1L);
        double double12 = line5.slope;
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 32.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str8.equals("slope: 32.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test326");
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
        java.lang.String str24 = line2.toString();
        java.lang.String str25 = line2.toString();
        java.lang.Class<?> wildcardClass26 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str8.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str24.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str25.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test327");
        Line line2 = new Line((double) (-1), (double) (-1L));
        Line line5 = new Line((double) 10L, (double) ' ');
        line5.yintercept = 10L;
        java.lang.String str8 = line5.toString();
        java.lang.Class<?> wildcardClass9 = line5.getClass();
        boolean boolean10 = line2.Intersect(line5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 10.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str8.equals("slope: 10.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test328");
        Line line2 = new Line((double) 0.0f, 0.0d);
        line2.yintercept = 35.0d;
        line2.slope = (short) 1;
        Line line9 = new Line(97.0d, (double) (short) -1);
        boolean boolean10 = line2.Intersect(line9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test329");
        Line line2 = new Line(1.0d, (double) 1L);
        line2.yintercept = 1;
        Line line7 = new Line(97.0d, (double) (short) -1);
        java.lang.String str8 = line7.toString();
        java.lang.String str9 = line7.toString();
        line7.yintercept = (-1);
        Line line14 = new Line(0.0d, 0.0d);
        boolean boolean15 = line7.Intersect(line14);
        boolean boolean16 = line2.Intersect(line7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str8.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test330");
        Line line2 = new Line((double) '4', 97.0d);
        line2.yintercept = 1.0d;
        line2.yintercept = 35.0d;
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test331");
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
        line52.slope = 0;
        java.lang.String str66 = line52.toString();
        java.lang.String str67 = line52.toString();
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
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str66.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str67.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test332");
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
        double double35 = line23.slope;
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
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test333");
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
        java.lang.String str17 = line13.toString();
        line13.slope = (short) -1;
        java.lang.String str20 = line13.toString();
        line13.slope = (short) -1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "slope: 0.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str17.equals("slope: 0.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "slope: -1.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str20.equals("slope: -1.0, yintercept: -1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test334");
        Line line2 = new Line((-1.0d), (double) (short) 1);
        Line line5 = new Line((double) '#', (double) (byte) 10);
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        double double10 = line9.slope;
        Line line13 = new Line((double) (byte) 0, (double) 'a');
        line13.slope = 0.0d;
        boolean boolean16 = line9.Intersect(line13);
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        double double20 = line19.slope;
        boolean boolean21 = line13.Intersect(line19);
        line19.yintercept = 10;
        line19.yintercept = (byte) 0;
        Line line28 = new Line((double) 100L, 97.0d);
        line28.slope = 32.0d;
        line28.slope = '4';
        boolean boolean33 = line19.Intersect(line28);
        line28.yintercept = (-1.0f);
        line28.yintercept = '4';
        boolean boolean38 = line5.Intersect(line28);
        boolean boolean39 = line2.Intersect(line5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test335");
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
        java.lang.Class<?> wildcardClass23 = line8.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str19.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "slope: 100.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str22.equals("slope: 100.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test336");
        Line line2 = new Line((double) (-1.0f), 0.0d);
        line2.yintercept = 0.0d;
        java.lang.String str5 = line2.toString();
        double double6 = line2.slope;
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: -1.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str5.equals("slope: -1.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test337");
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
        line2.yintercept = (short) 10;
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
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test338");
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
        line17.yintercept = 1.0f;
        double double24 = line17.slope;
        double double25 = line17.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str18.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test339");
        Line line2 = new Line((double) 0.0f, 10.0d);
        Line line5 = new Line((double) 100, 32.0d);
        line5.yintercept = 0.0d;
        boolean boolean8 = line2.Intersect(line5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test340");
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
        java.lang.String str20 = line12.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "slope: -1.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str20.equals("slope: -1.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test341");
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
        line6.slope = (-1L);
        java.lang.Class<?> wildcardClass19 = line6.getClass();
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        line22.slope = 0.0d;
        Line line27 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean28 = line22.Intersect(line27);
        line27.slope = (short) 1;
        boolean boolean31 = line6.Intersect(line27);
        double double32 = line6.slope;
        java.lang.Class<?> wildcardClass33 = line6.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test342");
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
        Line line37 = new Line((double) (byte) 0, (double) 'a');
        double double38 = line37.slope;
        Line line41 = new Line((double) (byte) 0, (double) 'a');
        line41.slope = 0.0d;
        boolean boolean44 = line37.Intersect(line41);
        Line line47 = new Line((double) ' ', (double) '4');
        boolean boolean48 = line37.Intersect(line47);
        line47.yintercept = (-1.0f);
        boolean boolean51 = line23.Intersect(line47);
        line47.yintercept = (-1.0f);
        java.lang.Class<?> wildcardClass54 = line47.getClass();
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
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test343");
        Line line2 = new Line(97.0d, (double) (-1L));
        line2.yintercept = 32.0d;
        double double5 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test344");
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
        line12.yintercept = (byte) 100;
        Line line33 = new Line((double) (byte) 0, (double) 'a');
        double double34 = line33.slope;
        Line line37 = new Line((double) (byte) 0, (double) 'a');
        line37.slope = 0.0d;
        boolean boolean40 = line33.Intersect(line37);
        Line line43 = new Line((double) (byte) 0, (double) 'a');
        double double44 = line43.slope;
        boolean boolean45 = line37.Intersect(line43);
        line43.yintercept = 10;
        line43.yintercept = (byte) 0;
        java.lang.Class<?> wildcardClass50 = line43.getClass();
        Line line53 = new Line((double) (byte) 100, (double) 1L);
        line53.yintercept = '#';
        boolean boolean56 = line43.Intersect(line53);
        boolean boolean57 = line12.Intersect(line53);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test345");
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
        Line line32 = new Line((double) 100L, (double) 100);
        java.lang.String str33 = line32.toString();
        boolean boolean34 = line19.Intersect(line32);
        java.lang.String str35 = line19.toString();
        java.lang.String str36 = line19.toString();
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
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str33.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str35.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str36.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test346");
        Line line2 = new Line((double) 'a', (double) 'a');
        line2.slope = 100;
        Line line7 = new Line(10.0d, (double) 10);
        line7.yintercept = 0.0d;
        java.lang.String str10 = line7.toString();
        line7.slope = 0.0d;
        boolean boolean13 = line2.Intersect(line7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "slope: 10.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str10.equals("slope: 10.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test347");
        Line line2 = new Line((double) (short) -1, 52.0d);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test348");
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
        line35.yintercept = ' ';
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
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test349");
        Line line2 = new Line((double) 100L, (double) 100);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        line9.slope = 0.0d;
        boolean boolean12 = line5.Intersect(line9);
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        double double16 = line15.slope;
        boolean boolean17 = line9.Intersect(line15);
        double double18 = line9.slope;
        Line line21 = new Line((double) 1.0f, (double) (short) 1);
        boolean boolean22 = line9.Intersect(line21);
        double double23 = line21.slope;
        boolean boolean24 = line2.Intersect(line21);
        Line line27 = new Line((double) (byte) 0, (double) 'a');
        double double28 = line27.slope;
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        line31.slope = 0.0d;
        boolean boolean34 = line27.Intersect(line31);
        double double35 = line31.yintercept;
        Line line38 = new Line(0.0d, (double) (-1L));
        boolean boolean39 = line31.Intersect(line38);
        java.lang.Class<?> wildcardClass40 = line38.getClass();
        double double41 = line38.yintercept;
        double double42 = line38.slope;
        Line line45 = new Line((double) 0, 35.0d);
        java.lang.String str46 = line45.toString();
        boolean boolean47 = line38.Intersect(line45);
        double double48 = line38.slope;
        boolean boolean49 = line2.Intersect(line38);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 97.0d + "'", double35 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "slope: 0.0, yintercept: 35.0, epsilon:1.0E-6" + "'", str46.equals("slope: 0.0, yintercept: 35.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test350");
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
        double double67 = line52.yintercept;
        java.lang.Class<?> wildcardClass68 = line52.getClass();
        line52.slope = (-1.0f);
        Line line73 = new Line(10.0d, (double) 10);
        line73.yintercept = 0.0d;
        java.lang.String str76 = line73.toString();
        java.lang.Class<?> wildcardClass77 = line73.getClass();
        Line line80 = new Line((double) 100L, 97.0d);
        line80.slope = 32.0d;
        line80.yintercept = 100.0d;
        double double85 = line80.yintercept;
        java.lang.String str86 = line80.toString();
        boolean boolean87 = line73.Intersect(line80);
        line80.slope = (short) -1;
        line80.slope = 1;
        boolean boolean92 = line52.Intersect(line80);
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
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 97.0d + "'", double67 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "slope: 10.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str76.equals("slope: 10.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 100.0d + "'", double85 == 100.0d);
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str86.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test351");
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
        line28.slope = 1;
        line28.slope = 35.0d;
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
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test352");
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
        line15.yintercept = '#';
        Line line23 = new Line(97.0d, (double) (short) -1);
        java.lang.String str24 = line23.toString();
        boolean boolean25 = line15.Intersect(line23);
        double double26 = line23.yintercept;
        double double27 = line23.yintercept;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str24.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test353");
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
        line6.slope = (-1L);
        java.lang.Class<?> wildcardClass19 = line6.getClass();
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        line22.slope = 0.0d;
        Line line27 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean28 = line22.Intersect(line27);
        line27.slope = (short) 1;
        boolean boolean31 = line6.Intersect(line27);
        line6.yintercept = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test354");
        Line line2 = new Line((double) (-1), (double) 0);
        line2.yintercept = (byte) -1;
        line2.slope = 0.0d;
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test355");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        java.lang.Class<?> wildcardClass10 = line2.getClass();
        line2.yintercept = (byte) -1;
        java.lang.Class<?> wildcardClass13 = line2.getClass();
        java.lang.Class<?> wildcardClass14 = line2.getClass();
        java.lang.Class<?> wildcardClass15 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test356");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        line12.yintercept = (-1.0f);
        Line line18 = new Line((double) '#', (double) 100.0f);
        boolean boolean19 = line12.Intersect(line18);
        double double20 = line18.slope;
        double double21 = line18.slope;
        Line line24 = new Line((double) (byte) 0, (double) 'a');
        double double25 = line24.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        line32.slope = 0.0d;
        boolean boolean35 = line28.Intersect(line32);
        Line line38 = new Line((double) (byte) 0, (double) 'a');
        double double39 = line38.slope;
        boolean boolean40 = line32.Intersect(line38);
        boolean boolean41 = line24.Intersect(line32);
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
        boolean boolean61 = line24.Intersect(line50);
        double double62 = line50.yintercept;
        java.lang.String str63 = line50.toString();
        line50.yintercept = 10.0f;
        double double66 = line50.slope;
        double double67 = line50.yintercept;
        boolean boolean68 = line18.Intersect(line50);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 97.0d + "'", double58 == 97.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 97.0d + "'", double62 == 97.0d);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str63.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test357");
        Line line2 = new Line((double) (byte) -1, (double) ' ');
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test358");
        Line line2 = new Line((double) 'a', 1.0d);
        java.lang.String str3 = line2.toString();
        Line line6 = new Line((double) 'a', (double) (byte) 10);
        line6.slope = (short) 100;
        line6.slope = 97.0d;
        line6.yintercept = (-1L);
        java.lang.String str13 = line6.toString();
        double double14 = line6.yintercept;
        line6.slope = 0;
        boolean boolean17 = line2.Intersect(line6);
        java.lang.String str18 = line2.toString();
        double double19 = line2.yintercept;
        Line line22 = new Line((double) ' ', (double) 1);
        line22.yintercept = 100.0f;
        java.lang.Class<?> wildcardClass25 = line22.getClass();
        line22.slope = 0.0d;
        Line line30 = new Line((double) (byte) 0, (double) 'a');
        double double31 = line30.slope;
        Line line34 = new Line((double) (byte) 0, (double) 'a');
        line34.slope = 0.0d;
        boolean boolean37 = line30.Intersect(line34);
        Line line40 = new Line((double) (byte) 0, (double) 'a');
        double double41 = line40.slope;
        boolean boolean42 = line34.Intersect(line40);
        double double43 = line34.slope;
        line34.yintercept = 1L;
        line34.slope = 1;
        boolean boolean48 = line22.Intersect(line34);
        line34.slope = (-1);
        double double51 = line34.slope;
        boolean boolean52 = line2.Intersect(line34);
        line2.yintercept = (-1L);
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
        boolean boolean96 = line2.Intersect(line75);
        line2.slope = 100;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 97.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str3.equals("slope: 97.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str13.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 97.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str18.equals("slope: 97.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
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
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test359");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        double double7 = line6.slope;
        Line line10 = new Line((double) (byte) 0, (double) 'a');
        double double11 = line10.slope;
        Line line14 = new Line((double) (byte) 0, (double) 'a');
        line14.slope = 0.0d;
        boolean boolean17 = line10.Intersect(line14);
        Line line20 = new Line((double) (byte) 0, (double) 'a');
        double double21 = line20.slope;
        boolean boolean22 = line14.Intersect(line20);
        java.lang.String str23 = line14.toString();
        double double24 = line14.slope;
        boolean boolean25 = line6.Intersect(line14);
        java.lang.Class<?> wildcardClass26 = line6.getClass();
        boolean boolean27 = line2.Intersect(line6);
        double double28 = line2.yintercept;
        Line line31 = new Line((double) (byte) 0, (double) 'a');
        line31.slope = 0.0d;
        Line line36 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean37 = line31.Intersect(line36);
        line36.yintercept = '4';
        boolean boolean40 = line2.Intersect(line36);
        Line line43 = new Line(0.0d, (double) '4');
        boolean boolean44 = line36.Intersect(line43);
        Line line47 = new Line((double) 0.0f, (double) (short) 1);
        double double48 = line47.yintercept;
        double double49 = line47.yintercept;
        line47.slope = (short) 0;
        java.lang.String str52 = line47.toString();
        boolean boolean53 = line43.Intersect(line47);
        line43.yintercept = (short) 10;
        line43.slope = (short) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str23.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "slope: 0.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str52.equals("slope: 0.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test360");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        double double10 = line6.yintercept;
        Line line13 = new Line(0.0d, (double) (-1L));
        boolean boolean14 = line6.Intersect(line13);
        java.lang.Class<?> wildcardClass15 = line13.getClass();
        double double16 = line13.yintercept;
        double double17 = line13.slope;
        Line line20 = new Line((double) 'a', (double) (byte) 10);
        line20.slope = (short) 100;
        line20.slope = 97.0d;
        line20.yintercept = (-1L);
        java.lang.String str27 = line20.toString();
        double double28 = line20.yintercept;
        java.lang.Class<?> wildcardClass29 = line20.getClass();
        java.lang.String str30 = line20.toString();
        line20.yintercept = 35.0d;
        java.lang.Class<?> wildcardClass33 = line20.getClass();
        java.lang.String str34 = line20.toString();
        boolean boolean35 = line13.Intersect(line20);
        double double36 = line20.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str27.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str30.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "slope: 97.0, yintercept: 35.0, epsilon:1.0E-6" + "'", str34.equals("slope: 97.0, yintercept: 35.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 97.0d + "'", double36 == 97.0d);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test361");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        double double6 = line2.slope;
        Line line9 = new Line((double) ' ', (double) '4');
        boolean boolean10 = line2.Intersect(line9);
        java.lang.String str11 = line9.toString();
        java.lang.String str12 = line9.toString();
        java.lang.Class<?> wildcardClass13 = line9.getClass();
        java.lang.Class<?> wildcardClass14 = line9.getClass();
        line9.slope = 0L;
        line9.yintercept = 32.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "slope: 32.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str11.equals("slope: 32.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "slope: 32.0, yintercept: 52.0, epsilon:1.0E-6" + "'", str12.equals("slope: 32.0, yintercept: 52.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test362");
        Line line2 = new Line((double) 100L, 97.0d);
        line2.yintercept = 97.0d;
        java.lang.String str5 = line2.toString();
        java.lang.Class<?> wildcardClass6 = line2.getClass();
        double double7 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 100.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str5.equals("slope: 100.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test363");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        line2.slope = 0.0d;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean8 = line2.Intersect(line7);
        line2.yintercept = 10.0d;
        double double11 = line2.slope;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test364");
        Line line2 = new Line((double) (short) 100, (double) (byte) 10);
        double double3 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test365");
        Line line2 = new Line(97.0d, (double) ' ');
        double double3 = line2.yintercept;
        double double4 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test366");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.yintercept = (byte) 1;
        line2.slope = 1.0f;
        line2.yintercept = 'a';
        double double9 = line2.slope;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test367");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        double double14 = line2.slope;
        double double15 = line2.yintercept;
        java.lang.String str16 = line2.toString();
        double double17 = line2.yintercept;
        line2.yintercept = 10L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str16.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test368");
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
        double double45 = line28.yintercept;
        double double46 = line28.slope;
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
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test369");
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
        double double48 = line45.slope;
        java.lang.Class<?> wildcardClass49 = line45.getClass();
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
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 32.0d + "'", double48 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test370");
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
        java.lang.String str52 = line47.toString();
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
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "slope: 10.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str52.equals("slope: 10.0, yintercept: 10.0, epsilon:1.0E-6"));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test371");
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
        line43.slope = 1;
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
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test372");
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
        double double19 = line2.yintercept;
        line2.slope = 0L;
        double double22 = line2.slope;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test373");
        Line line2 = new Line((double) 100L, 97.0d);
        line2.slope = 32.0d;
        double double5 = line2.yintercept;
        double double6 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test374");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        java.lang.String str14 = line2.toString();
        double double15 = line2.slope;
        double double16 = line2.yintercept;
        double double17 = line2.slope;
        java.lang.Class<?> wildcardClass18 = line2.getClass();
        java.lang.Class<?> wildcardClass19 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str14.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test375");
        Line line2 = new Line((double) (-1L), (double) '#');
        Line line5 = new Line((double) 0, (-1.0d));
        boolean boolean6 = line2.Intersect(line5);
        Line line9 = new Line((-1.0d), 10.0d);
        java.lang.Class<?> wildcardClass10 = line9.getClass();
        double double11 = line9.yintercept;
        line9.yintercept = 35.0d;
        Line line16 = new Line((double) 10L, (double) ' ');
        line16.slope = 1L;
        double double19 = line16.slope;
        Line line22 = new Line((double) (byte) 0, (double) 'a');
        double double23 = line22.slope;
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        line26.slope = 0.0d;
        boolean boolean29 = line22.Intersect(line26);
        double double30 = line22.yintercept;
        double double31 = line22.slope;
        boolean boolean32 = line16.Intersect(line22);
        java.lang.String str33 = line22.toString();
        line22.slope = (short) 100;
        Line line38 = new Line((double) 10.0f, (double) (short) -1);
        double double39 = line38.yintercept;
        boolean boolean40 = line22.Intersect(line38);
        java.lang.Class<?> wildcardClass41 = line38.getClass();
        line38.yintercept = (byte) 100;
        boolean boolean44 = line9.Intersect(line38);
        boolean boolean45 = line5.Intersect(line38);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 97.0d + "'", double30 == 97.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str33.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test376");
        Line line2 = new Line((double) ' ', (double) 1);
        double double3 = line2.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test377");
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
        java.lang.String str19 = line2.toString();
        Line line22 = new Line((double) 1, (double) (byte) 10);
        boolean boolean23 = line2.Intersect(line22);
        line22.yintercept = (short) 1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 1.0, yintercept: 32.0, epsilon:1.0E-6" + "'", str19.equals("slope: 1.0, yintercept: 32.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test378");
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
        double double24 = line10.yintercept;
        double double25 = line10.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test379");
        Line line2 = new Line((double) (short) 1, (double) 0.0f);
        java.lang.String str3 = line2.toString();
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 1.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str3.equals("slope: 1.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test380");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        double double3 = line2.slope;
        Line line6 = new Line((double) (byte) 0, (double) 'a');
        line6.slope = 0.0d;
        boolean boolean9 = line2.Intersect(line6);
        Line line12 = new Line((double) ' ', (double) '4');
        boolean boolean13 = line2.Intersect(line12);
        double double14 = line12.yintercept;
        line12.yintercept = 100;
        double double17 = line12.slope;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test381");
        Line line2 = new Line((double) 100L, (double) (byte) 0);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test382");
        Line line2 = new Line((-1.0d), (double) 0.0f);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test383");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        line2.slope = (short) 100;
        line2.slope = 97.0d;
        java.lang.String str7 = line2.toString();
        java.lang.String str8 = line2.toString();
        Line line11 = new Line((double) 10L, (double) ' ');
        line11.slope = 1L;
        double double14 = line11.yintercept;
        boolean boolean15 = line2.Intersect(line11);
        line2.slope = 100;
        java.lang.String str18 = line2.toString();
        Line line21 = new Line((double) (byte) 0, (double) 'a');
        double double22 = line21.slope;
        boolean boolean23 = line2.Intersect(line21);
        line21.yintercept = 10.0d;
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str7.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str8.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 100.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str18.equals("slope: 100.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test384");
        Line line2 = new Line((double) 'a', (double) (byte) -1);
        Line line5 = new Line(10.0d, (double) 0L);
        Line line8 = new Line((double) 'a', (double) (byte) 10);
        line8.yintercept = (-1.0f);
        boolean boolean11 = line5.Intersect(line8);
        java.lang.Class<?> wildcardClass12 = line8.getClass();
        java.lang.Class<?> wildcardClass13 = line8.getClass();
        boolean boolean14 = line2.Intersect(line8);
        double double15 = line8.slope;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test385");
        Line line2 = new Line((double) (byte) 0, (double) 'a');
        line2.slope = 0.0d;
        Line line7 = new Line((double) (byte) 0, (double) 'a');
        boolean boolean8 = line2.Intersect(line7);
        line2.yintercept = (byte) 1;
        java.lang.Class<?> wildcardClass11 = line2.getClass();
        java.lang.String str12 = line2.toString();
        java.lang.Class<?> wildcardClass13 = line2.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "slope: 0.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str12.equals("slope: 0.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test386");
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
        java.lang.String str25 = line17.toString();
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        Line line36 = new Line((double) (byte) 0, (double) 'a');
        line36.slope = 0.0d;
        boolean boolean39 = line32.Intersect(line36);
        Line line42 = new Line((double) (byte) 0, (double) 'a');
        double double43 = line42.slope;
        boolean boolean44 = line36.Intersect(line42);
        boolean boolean45 = line28.Intersect(line36);
        Line line48 = new Line((double) 10L, (double) ' ');
        line48.slope = 1L;
        double double51 = line48.slope;
        Line line54 = new Line((double) (byte) 0, (double) 'a');
        double double55 = line54.slope;
        Line line58 = new Line((double) (byte) 0, (double) 'a');
        line58.slope = 0.0d;
        boolean boolean61 = line54.Intersect(line58);
        double double62 = line54.yintercept;
        double double63 = line54.slope;
        boolean boolean64 = line48.Intersect(line54);
        boolean boolean65 = line28.Intersect(line54);
        Line line68 = new Line((double) ' ', (double) 1);
        boolean boolean69 = line28.Intersect(line68);
        double double70 = line68.yintercept;
        line68.slope = (-1);
        java.lang.Class<?> wildcardClass73 = line68.getClass();
        java.lang.Class<?> wildcardClass74 = line68.getClass();
        Line line77 = new Line((-1.0d), (double) 100);
        boolean boolean78 = line68.Intersect(line77);
        boolean boolean79 = line17.Intersect(line77);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "slope: 0.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str25.equals("slope: 0.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 97.0d + "'", double62 == 97.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test387");
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
        line23.slope = (byte) -1;
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
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test388");
        Line line2 = new Line((double) (-1.0f), (double) 0.0f);
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        java.lang.String str5 = line2.toString();
        double double6 = line2.slope;
        line2.slope = 100L;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: -1.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str5.equals("slope: -1.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test389");
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
        boolean boolean54 = line2.Intersect(line41);
        line2.slope = 0.0d;
        java.lang.Class<?> wildcardClass57 = line2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 97.0d + "'", double45 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str53.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test390");
        Line line2 = new Line((double) 1, (double) (byte) -1);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test391");
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
        line6.slope = (byte) 1;
        line6.yintercept = 0.0d;
        Line line26 = new Line((double) (byte) 0, (double) 'a');
        double double27 = line26.slope;
        Line line30 = new Line((double) (byte) 0, (double) 'a');
        line30.slope = 0.0d;
        boolean boolean33 = line26.Intersect(line30);
        Line line36 = new Line((double) ' ', (double) '4');
        boolean boolean37 = line26.Intersect(line36);
        line36.yintercept = (-1.0f);
        Line line42 = new Line((double) '#', (double) 100.0f);
        boolean boolean43 = line36.Intersect(line42);
        boolean boolean44 = line6.Intersect(line36);
        line36.yintercept = 97.0d;
        Line line49 = new Line((double) 100L, 97.0d);
        line49.slope = 32.0d;
        line49.yintercept = 100.0d;
        line49.yintercept = 'a';
        boolean boolean56 = line36.Intersect(line49);
        line36.slope = (short) 0;
        line36.slope = 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str18.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test392");
        Line line2 = new Line(52.0d, (double) (-1));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test393");
        Line line2 = new Line(52.0d, (double) (byte) 0);
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        double double4 = line2.yintercept;
        double double5 = line2.yintercept;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test394");
        Line line2 = new Line((-1.0d), (double) (byte) 0);
        Line line5 = new Line((double) (byte) 0, (double) 'a');
        double double6 = line5.slope;
        Line line9 = new Line((double) (byte) 0, (double) 'a');
        line9.slope = 0.0d;
        boolean boolean12 = line5.Intersect(line9);
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        double double16 = line15.slope;
        boolean boolean17 = line9.Intersect(line15);
        java.lang.Class<?> wildcardClass18 = line9.getClass();
        java.lang.String str19 = line9.toString();
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
        boolean boolean37 = line9.Intersect(line26);
        double double38 = line9.yintercept;
        double double39 = line9.slope;
        boolean boolean40 = line2.Intersect(line9);
        Line line43 = new Line(32.0d, (double) (-1));
        boolean boolean44 = line9.Intersect(line43);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str19.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str36.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 97.0d + "'", double38 == 97.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test395");
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
        Line line26 = new Line((double) 10L, (double) ' ');
        line26.slope = 1L;
        double double29 = line26.slope;
        double double30 = line26.slope;
        Line line33 = new Line((double) ' ', (double) '4');
        boolean boolean34 = line26.Intersect(line33);
        line33.slope = 97.0d;
        double double37 = line33.yintercept;
        boolean boolean38 = line2.Intersect(line33);
        double double39 = line2.slope;
        double double40 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str21.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 52.0d + "'", double37 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 32.0d + "'", double40 == 32.0d);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test396");
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
        double double42 = line28.yintercept;
        double double43 = line28.slope;
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
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test397");
        Line line2 = new Line((double) 'a', 35.0d);
        double double3 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test398");
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
        line23.slope = 100;
        double double66 = line23.slope;
        double double67 = line23.yintercept;
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
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 100.0d + "'", double66 == 100.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 97.0d + "'", double67 == 97.0d);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test399");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.yintercept = 10L;
        line2.slope = 100L;
        line2.slope = 'a';
        java.lang.Class<?> wildcardClass9 = line2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test400");
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
        double double22 = line17.yintercept;
        line17.slope = '4';
        line17.slope = (-1.0f);
        java.lang.String str27 = line17.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str18.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "slope: -1.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str27.equals("slope: -1.0, yintercept: 0.0, epsilon:1.0E-6"));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test401");
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
        java.lang.String str31 = line25.toString();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str19.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str31.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test402");
        Line line2 = new Line((double) ' ', 1.0d);
        Line line5 = new Line((double) 10, (double) 0.0f);
        Line line8 = new Line((double) (byte) 0, (double) 'a');
        double double9 = line8.slope;
        java.lang.Class<?> wildcardClass10 = line8.getClass();
        boolean boolean11 = line5.Intersect(line8);
        line8.yintercept = '#';
        boolean boolean14 = line2.Intersect(line8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test403");
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
        Line line32 = new Line((double) 100L, (double) 100);
        java.lang.String str33 = line32.toString();
        boolean boolean34 = line19.Intersect(line32);
        double double35 = line19.slope;
        Line line38 = new Line((double) (byte) 0, (double) 'a');
        double double39 = line38.slope;
        Line line42 = new Line((double) (byte) 0, (double) 'a');
        double double43 = line42.slope;
        Line line46 = new Line((double) (byte) 0, (double) 'a');
        line46.slope = 0.0d;
        boolean boolean49 = line42.Intersect(line46);
        Line line52 = new Line((double) (byte) 0, (double) 'a');
        double double53 = line52.slope;
        boolean boolean54 = line46.Intersect(line52);
        boolean boolean55 = line38.Intersect(line46);
        Line line58 = new Line((double) (byte) 10, 97.0d);
        double double59 = line58.yintercept;
        boolean boolean60 = line38.Intersect(line58);
        line38.yintercept = 10L;
        Line line65 = new Line((double) (byte) 0, (double) 'a');
        double double66 = line65.slope;
        Line line69 = new Line((double) (byte) 0, (double) 'a');
        line69.slope = 0.0d;
        boolean boolean72 = line65.Intersect(line69);
        Line line75 = new Line((double) (byte) 0, (double) 'a');
        double double76 = line75.slope;
        boolean boolean77 = line69.Intersect(line75);
        double double78 = line69.slope;
        Line line81 = new Line((double) 1.0f, (double) (short) 1);
        boolean boolean82 = line69.Intersect(line81);
        double double83 = line81.slope;
        boolean boolean84 = line38.Intersect(line81);
        double double85 = line81.yintercept;
        boolean boolean86 = line19.Intersect(line81);
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
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str33.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 97.0d + "'", double59 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 1.0d + "'", double83 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 1.0d + "'", double85 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test404");
        Line line2 = new Line((double) 0.0f, (double) 1.0f);
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test405");
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
        double double46 = line28.yintercept;
        java.lang.String str47 = line28.toString();
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
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "slope: 100.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str47.equals("slope: 100.0, yintercept: 1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test406");
        Line line2 = new Line((double) (-1.0f), 0.0d);
        line2.yintercept = 0.0d;
        java.lang.String str5 = line2.toString();
        Line line8 = new Line((double) (-1), (double) 0);
        Line line11 = new Line((double) (byte) 0, (double) 'a');
        double double12 = line11.slope;
        Line line15 = new Line((double) (byte) 0, (double) 'a');
        double double16 = line15.slope;
        Line line19 = new Line((double) (byte) 0, (double) 'a');
        line19.slope = 0.0d;
        boolean boolean22 = line15.Intersect(line19);
        Line line25 = new Line((double) (byte) 0, (double) 'a');
        double double26 = line25.slope;
        boolean boolean27 = line19.Intersect(line25);
        boolean boolean28 = line11.Intersect(line19);
        Line line31 = new Line((double) 10L, (double) ' ');
        line31.slope = 1L;
        double double34 = line31.slope;
        Line line37 = new Line((double) (byte) 0, (double) 'a');
        double double38 = line37.slope;
        Line line41 = new Line((double) (byte) 0, (double) 'a');
        line41.slope = 0.0d;
        boolean boolean44 = line37.Intersect(line41);
        double double45 = line37.yintercept;
        double double46 = line37.slope;
        boolean boolean47 = line31.Intersect(line37);
        boolean boolean48 = line11.Intersect(line37);
        Line line51 = new Line((double) ' ', (double) 1);
        boolean boolean52 = line11.Intersect(line51);
        boolean boolean53 = line8.Intersect(line51);
        Line line56 = new Line((double) ' ', 100.0d);
        Line line59 = new Line((double) (byte) 0, (double) 'a');
        double double60 = line59.slope;
        Line line63 = new Line((double) (byte) 0, (double) 'a');
        double double64 = line63.slope;
        Line line67 = new Line((double) (byte) 0, (double) 'a');
        line67.slope = 0.0d;
        boolean boolean70 = line63.Intersect(line67);
        Line line73 = new Line((double) (byte) 0, (double) 'a');
        double double74 = line73.slope;
        boolean boolean75 = line67.Intersect(line73);
        boolean boolean76 = line59.Intersect(line67);
        line59.slope = 10.0d;
        boolean boolean79 = line56.Intersect(line59);
        double double80 = line56.yintercept;
        boolean boolean81 = line51.Intersect(line56);
        double double82 = line51.slope;
        java.lang.String str83 = line51.toString();
        double double84 = line51.yintercept;
        boolean boolean85 = line2.Intersect(line51);
        double double86 = line51.yintercept;
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: -1.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str5.equals("slope: -1.0, yintercept: 0.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 97.0d + "'", double45 == 97.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 100.0d + "'", double80 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 32.0d + "'", double82 == 32.0d);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "slope: 32.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str83.equals("slope: 32.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 1.0d + "'", double84 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 1.0d + "'", double86 == 1.0d);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test407");
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
        java.lang.Class<?> wildcardClass36 = line6.getClass();
        java.lang.Class<?> wildcardClass37 = line6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test408");
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
        line6.yintercept = (short) 100;
        java.lang.String str20 = line6.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "slope: 0.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str20.equals("slope: 0.0, yintercept: 100.0, epsilon:1.0E-6"));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test409");
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
        double double67 = line52.yintercept;
        java.lang.Class<?> wildcardClass68 = line52.getClass();
        java.lang.Class<?> wildcardClass69 = line52.getClass();
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
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 97.0d + "'", double67 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test410");
        Line line2 = new Line((double) '#', 32.0d);
        double double3 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test411");
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
        line11.slope = 10;
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
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test412");
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
        java.lang.String str67 = line10.toString();
        line10.slope = 1L;
        line10.slope = 100.0d;
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
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str67.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test413");
        Line line2 = new Line((double) 100L, (double) (short) 10);
        Line line5 = new Line((double) 'a', (double) (byte) 10);
        line5.yintercept = (-1.0f);
        boolean boolean8 = line2.Intersect(line5);
        java.lang.Class<?> wildcardClass9 = line2.getClass();
        Line line12 = new Line((double) 1.0f, 52.0d);
        java.lang.Class<?> wildcardClass13 = line12.getClass();
        boolean boolean14 = line2.Intersect(line12);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test414");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        double double3 = line2.slope;
        line2.yintercept = 10.0f;
        double double6 = line2.slope;
        double double7 = line2.slope;
        line2.yintercept = 10;
        Line line12 = new Line((double) (short) 1, (double) 0.0f);
        boolean boolean13 = line2.Intersect(line12);
        double double14 = line12.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test415");
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
        line12.yintercept = 52.0d;
        double double49 = line12.slope;
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
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test416");
        Line line2 = new Line((double) 100L, 97.0d);
        line2.slope = 32.0d;
        java.lang.String str5 = line2.toString();
        Line line8 = new Line((double) (short) 1, (double) (byte) 1);
        Line line11 = new Line((double) '4', (double) (byte) 10);
        line11.yintercept = (short) 100;
        boolean boolean14 = line8.Intersect(line11);
        double double15 = line11.slope;
        boolean boolean16 = line2.Intersect(line11);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 32.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str5.equals("slope: 32.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test417");
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
        line6.yintercept = (byte) -1;
        Line line25 = new Line((double) (byte) 0, (double) (byte) 10);
        boolean boolean26 = line6.Intersect(line25);
        line6.slope = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test418");
        Line line2 = new Line((double) 'a', (double) (short) 1);
        Line line5 = new Line(0.0d, 10.0d);
        boolean boolean6 = line2.Intersect(line5);
        double double7 = line5.yintercept;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test419");
        Line line2 = new Line(97.0d, (double) (short) -1);
        java.lang.String str3 = line2.toString();
        java.lang.String str4 = line2.toString();
        line2.yintercept = (-1);
        double double7 = line2.yintercept;
        java.lang.String str8 = line2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str3.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str4.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 97.0, yintercept: -1.0, epsilon:1.0E-6" + "'", str8.equals("slope: 97.0, yintercept: -1.0, epsilon:1.0E-6"));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test420");
        Line line2 = new Line((double) 0.0f, (double) 1);
        line2.slope = 97.0d;
        line2.yintercept = 35.0d;
        Line line9 = new Line((double) 'a', 1.0d);
        java.lang.String str10 = line9.toString();
        line9.yintercept = (byte) -1;
        Line line15 = new Line((double) 0.0f, (double) 1);
        line15.slope = 97.0d;
        double double18 = line15.slope;
        line15.slope = 0.0d;
        java.lang.Class<?> wildcardClass21 = line15.getClass();
        Line line24 = new Line((double) 'a', (double) (byte) 10);
        double double25 = line24.slope;
        Line line28 = new Line((double) (byte) 0, (double) 'a');
        double double29 = line28.slope;
        Line line32 = new Line((double) (byte) 0, (double) 'a');
        double double33 = line32.slope;
        Line line36 = new Line((double) (byte) 0, (double) 'a');
        line36.slope = 0.0d;
        boolean boolean39 = line32.Intersect(line36);
        Line line42 = new Line((double) (byte) 0, (double) 'a');
        double double43 = line42.slope;
        boolean boolean44 = line36.Intersect(line42);
        java.lang.String str45 = line36.toString();
        double double46 = line36.slope;
        boolean boolean47 = line28.Intersect(line36);
        java.lang.Class<?> wildcardClass48 = line28.getClass();
        boolean boolean49 = line24.Intersect(line28);
        boolean boolean50 = line15.Intersect(line28);
        boolean boolean51 = line9.Intersect(line28);
        double double52 = line28.slope;
        Line line55 = new Line((double) 100.0f, 97.0d);
        boolean boolean56 = line28.Intersect(line55);
        boolean boolean57 = line2.Intersect(line28);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "slope: 97.0, yintercept: 1.0, epsilon:1.0E-6" + "'", str10.equals("slope: 97.0, yintercept: 1.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "slope: 0.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str45.equals("slope: 0.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test421");
        Line line2 = new Line((double) 100L, 97.0d);
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        line2.slope = 1L;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test422");
        Line line2 = new Line((double) 100, 52.0d);
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
        line20.yintercept = (short) 1;
        line20.yintercept = 1.0f;
        boolean boolean27 = line2.Intersect(line20);
        line20.yintercept = 1.0d;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "slope: 100.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str21.equals("slope: 100.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test423");
        Line line2 = new Line((double) ' ', (double) 1);
        double double3 = line2.yintercept;
        line2.slope = ' ';
        line2.slope = 32.0d;
        Line line10 = new Line((double) (-1L), (double) '#');
        Line line13 = new Line((double) 0, (-1.0d));
        boolean boolean14 = line10.Intersect(line13);
        boolean boolean15 = line2.Intersect(line10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test424");
        Line line2 = new Line((double) (short) -1, 32.0d);
        line2.yintercept = (byte) 100;
        line2.slope = 0.0f;
        double double7 = line2.slope;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test425");
        Line line2 = new Line((double) 'a', (double) (byte) 10);
        double double3 = line2.slope;
        line2.yintercept = 10.0f;
        double double6 = line2.slope;
        double double7 = line2.slope;
        line2.yintercept = 10;
        Line line12 = new Line((double) (short) 1, (double) 0.0f);
        boolean boolean13 = line2.Intersect(line12);
        line12.yintercept = (-1);
        double double16 = line12.yintercept;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test426");
        Line line2 = new Line((double) 10L, (double) ' ');
        line2.slope = 1L;
        double double5 = line2.slope;
        double double6 = line2.slope;
        Line line9 = new Line((double) ' ', (double) '4');
        boolean boolean10 = line2.Intersect(line9);
        line9.slope = 97.0d;
        double double13 = line9.yintercept;
        java.lang.Class<?> wildcardClass14 = line9.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test427");
        Line line2 = new Line((double) 100L, 97.0d);
        line2.slope = 32.0d;
        java.lang.String str5 = line2.toString();
        double double6 = line2.slope;
        double double7 = line2.slope;
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 32.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str5.equals("slope: 32.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test428");
        Line line2 = new Line(97.0d, (double) ' ');
        double double3 = line2.yintercept;
        double double4 = line2.yintercept;
        line2.yintercept = 0.0d;
        java.lang.Class<?> wildcardClass7 = line2.getClass();
        java.lang.String str8 = line2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "slope: 97.0, yintercept: 0.0, epsilon:1.0E-6" + "'", str8.equals("slope: 97.0, yintercept: 0.0, epsilon:1.0E-6"));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test429");
        Line line2 = new Line((double) 1.0f, (double) (byte) 0);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test430");
        Line line2 = new Line((double) 100L, 97.0d);
        line2.slope = 32.0d;
        java.lang.String str5 = line2.toString();
        line2.slope = '#';
        double double8 = line2.yintercept;
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 32.0, yintercept: 97.0, epsilon:1.0E-6" + "'", str5.equals("slope: 32.0, yintercept: 97.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test431");
        Line line2 = new Line((double) 100L, (double) (short) -1);
        java.lang.Class<?> wildcardClass3 = line2.getClass();
        java.lang.Class<?> wildcardClass4 = line2.getClass();
        Line line7 = new Line((double) 'a', (double) (byte) 10);
        double double8 = line7.yintercept;
        java.lang.String str9 = line7.toString();
        line7.slope = 1;
        line7.slope = 0L;
        line7.slope = 10.0d;
        boolean boolean16 = line2.Intersect(line7);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "slope: 97.0, yintercept: 10.0, epsilon:1.0E-6" + "'", str9.equals("slope: 97.0, yintercept: 10.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test432");
        Line line2 = new Line((double) ' ', (double) 1);
        line2.yintercept = 100.0f;
        java.lang.String str5 = line2.toString();
        double double6 = line2.slope;
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "slope: 32.0, yintercept: 100.0, epsilon:1.0E-6" + "'", str5.equals("slope: 32.0, yintercept: 100.0, epsilon:1.0E-6"));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test433");
        Line line2 = new Line((double) (short) 1, 1.0d);
        Line line5 = new Line((double) ' ', (double) '4');
        boolean boolean6 = line2.Intersect(line5);
        double double7 = line5.slope;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
    }
}

