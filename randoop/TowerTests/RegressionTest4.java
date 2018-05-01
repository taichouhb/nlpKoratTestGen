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
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        tower6.add(10);
        Tower tower13 = new Tower(0);
        tower13.add((-1));
        Tower tower17 = new Tower((-1));
        java.lang.Class<?> wildcardClass18 = tower17.getClass();
        tower17.add((int) (byte) 1);
        tower13.moveTopTo(tower17);
        Tower tower23 = new Tower((-1));
        java.lang.Class<?> wildcardClass24 = tower23.getClass();
        tower23.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = tower23.getClass();
        tower6.moveDisks((int) (short) 0, tower13, tower23);
        int int29 = tower13.index();
        tower13.add(10);
        int int32 = tower13.index();
        int int33 = tower13.index();
        int int34 = tower13.index();
        Tower tower36 = new Tower((-1));
        java.lang.Class<?> wildcardClass37 = tower36.getClass();
        tower36.add(0);
        Tower tower42 = new Tower((-1));
        java.lang.Class<?> wildcardClass43 = tower42.getClass();
        tower42.add((int) (byte) 1);
        tower42.add(0);
        Tower tower49 = new Tower(0);
        tower42.moveTopTo(tower49);
        Tower tower52 = new Tower((-1));
        java.lang.Class<?> wildcardClass53 = tower52.getClass();
        tower52.add((int) (byte) 1);
        tower52.add(0);
        tower42.moveTopTo(tower52);
        tower42.add((int) '4');
        int int61 = tower42.index();
        Tower tower63 = new Tower(0);
        tower63.add((-1));
        tower63.add((int) (byte) 1);
        Tower tower70 = new Tower((-1));
        java.lang.Class<?> wildcardClass71 = tower70.getClass();
        tower70.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass74 = tower70.getClass();
        Tower tower76 = new Tower(0);
        tower76.add((-1));
        tower76.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass81 = tower76.getClass();
        Tower tower83 = new Tower((-1));
        tower83.add(0);
        tower76.moveTopTo(tower83);
        tower63.moveDisks((int) (short) 1, tower70, tower83);
        java.lang.Class<?> wildcardClass88 = tower83.getClass();
        tower36.moveDisks((int) (short) -1, tower42, tower83);
        java.lang.Class<?> wildcardClass90 = tower42.getClass();
        tower42.add((int) (byte) 1);
        tower13.moveTopTo(tower42);
        tower13.add((int) (short) 100);
        tower13.add((int) '4');
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test002");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower5 = new Tower((int) (short) 100);
        tower1.moveTopTo(tower5);
        tower1.add((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = tower1.getClass();
        tower1.add(97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test003");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        java.lang.Class<?> wildcardClass5 = tower1.getClass();
        Tower tower7 = new Tower(0);
        tower7.add((-1));
        tower7.add((int) (byte) 1);
        tower7.add((int) (byte) 1);
        Tower tower16 = new Tower(0);
        tower16.add((-1));
        java.lang.Class<?> wildcardClass19 = tower16.getClass();
        Tower tower21 = new Tower((-1));
        java.lang.Class<?> wildcardClass22 = tower21.getClass();
        tower21.add(0);
        tower16.moveTopTo(tower21);
        Tower tower27 = new Tower(0);
        tower27.add((-1));
        Tower tower31 = new Tower((-1));
        java.lang.Class<?> wildcardClass32 = tower31.getClass();
        tower31.add((int) (byte) 1);
        tower27.moveTopTo(tower31);
        tower7.moveDisks((int) (short) 1, tower21, tower27);
        java.lang.Class<?> wildcardClass37 = tower21.getClass();
        Tower tower39 = new Tower((-1));
        java.lang.Class<?> wildcardClass40 = tower39.getClass();
        tower39.add((int) (byte) 1);
        Tower tower44 = new Tower((-1));
        int int45 = tower44.index();
        tower39.moveTopTo(tower44);
        tower44.add(10);
        Tower tower51 = new Tower(0);
        tower51.add((-1));
        java.lang.Class<?> wildcardClass54 = tower51.getClass();
        Tower tower56 = new Tower((-1));
        java.lang.Class<?> wildcardClass57 = tower56.getClass();
        tower56.add(0);
        tower51.moveTopTo(tower56);
        Tower tower62 = new Tower((-1));
        int int63 = tower62.index();
        tower44.moveDisks(0, tower56, tower62);
        tower21.moveTopTo(tower56);
        int int66 = tower56.index();
        tower56.add(1);
        Tower tower70 = new Tower(0);
        tower56.moveTopTo(tower70);
        tower1.moveTopTo(tower56);
        int int73 = tower56.index();
        java.lang.Class<?> wildcardClass74 = tower56.getClass();
        tower56.add((int) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test004");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        Tower tower11 = new Tower(0);
        tower11.add((-1));
        tower11.add((int) (byte) 1);
        tower11.add((int) (byte) 1);
        Tower tower20 = new Tower(0);
        tower20.add((-1));
        java.lang.Class<?> wildcardClass23 = tower20.getClass();
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add(0);
        tower20.moveTopTo(tower25);
        Tower tower31 = new Tower(0);
        tower31.add((-1));
        Tower tower35 = new Tower((-1));
        java.lang.Class<?> wildcardClass36 = tower35.getClass();
        tower35.add((int) (byte) 1);
        tower31.moveTopTo(tower35);
        tower11.moveDisks((int) (short) 1, tower25, tower31);
        java.lang.Class<?> wildcardClass41 = tower25.getClass();
        java.lang.Class<?> wildcardClass42 = tower25.getClass();
        Tower tower44 = new Tower((-1));
        int int45 = tower44.index();
        tower44.add(1);
        tower6.moveDisks(1, tower25, tower44);
        Tower tower51 = new Tower(0);
        tower51.add((-1));
        tower51.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass56 = tower51.getClass();
        int int57 = tower51.index();
        Tower tower59 = new Tower((-1));
        tower59.add((int) (byte) 1);
        Tower tower64 = new Tower(0);
        Tower tower66 = new Tower(0);
        tower66.add((-1));
        Tower tower70 = new Tower(0);
        tower66.moveTopTo(tower70);
        Tower tower74 = new Tower(0);
        tower74.add((-1));
        Tower tower78 = new Tower((-1));
        java.lang.Class<?> wildcardClass79 = tower78.getClass();
        tower78.add((int) (byte) 1);
        tower78.add(0);
        Tower tower85 = new Tower(0);
        tower78.moveTopTo(tower85);
        Tower tower88 = new Tower((-1));
        java.lang.Class<?> wildcardClass89 = tower88.getClass();
        tower88.add((int) (byte) 1);
        tower88.add(0);
        tower78.moveTopTo(tower88);
        tower70.moveDisks((int) (byte) -1, tower74, tower88);
        tower59.moveDisks((int) (short) -1, tower64, tower70);
        tower25.moveDisks((int) (short) 0, tower51, tower64);
        java.lang.Class<?> wildcardClass98 = tower51.getClass();
        int int99 = tower51.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(wildcardClass98);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test005");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        int int5 = tower1.index();
        Tower tower7 = new Tower(0);
        tower7.add((-1));
        java.lang.Class<?> wildcardClass10 = tower7.getClass();
        int int11 = tower7.index();
        Tower tower13 = new Tower((-1));
        java.lang.Class<?> wildcardClass14 = tower13.getClass();
        tower13.add((int) (byte) 1);
        tower13.add(0);
        int int19 = tower13.index();
        java.lang.Class<?> wildcardClass20 = tower13.getClass();
        java.lang.Class<?> wildcardClass21 = tower13.getClass();
        tower7.moveTopTo(tower13);
        tower1.moveTopTo(tower7);
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add((int) (byte) 1);
        Tower tower30 = new Tower((-1));
        int int31 = tower30.index();
        tower25.moveTopTo(tower30);
        tower30.add(10);
        Tower tower37 = new Tower(0);
        tower37.add((-1));
        Tower tower41 = new Tower((-1));
        java.lang.Class<?> wildcardClass42 = tower41.getClass();
        tower41.add((int) (byte) 1);
        tower37.moveTopTo(tower41);
        Tower tower47 = new Tower((-1));
        java.lang.Class<?> wildcardClass48 = tower47.getClass();
        tower47.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass51 = tower47.getClass();
        tower30.moveDisks((int) (short) 0, tower37, tower47);
        int int53 = tower37.index();
        tower37.add(10);
        tower7.moveTopTo(tower37);
        Tower tower58 = new Tower((-1));
        java.lang.Class<?> wildcardClass59 = tower58.getClass();
        tower58.add((int) (byte) 1);
        tower58.add(0);
        Tower tower65 = new Tower(0);
        tower58.moveTopTo(tower65);
        Tower tower68 = new Tower((-1));
        java.lang.Class<?> wildcardClass69 = tower68.getClass();
        tower68.add((int) (byte) 1);
        tower68.add(0);
        tower58.moveTopTo(tower68);
        tower58.add((int) '4');
        int int77 = tower58.index();
        tower37.moveTopTo(tower58);
        java.lang.Class<?> wildcardClass79 = tower37.getClass();
        java.lang.Class<?> wildcardClass80 = tower37.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test006");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        java.lang.Class<?> wildcardClass11 = tower1.getClass();
        int int12 = tower1.index();
        tower1.add((-1));
        Tower tower16 = new Tower((-1));
        java.lang.Class<?> wildcardClass17 = tower16.getClass();
        tower16.add((int) (byte) 1);
        tower16.add(0);
        Tower tower23 = new Tower(0);
        tower16.moveTopTo(tower23);
        int int25 = tower16.index();
        tower16.add((int) (short) 10);
        Tower tower29 = new Tower((int) (byte) 0);
        tower29.add((-1));
        Tower tower33 = new Tower((-1));
        java.lang.Class<?> wildcardClass34 = tower33.getClass();
        tower33.add((int) (byte) 1);
        Tower tower38 = new Tower((-1));
        int int39 = tower38.index();
        tower33.moveTopTo(tower38);
        tower38.add(10);
        tower29.moveTopTo(tower38);
        Tower tower46 = new Tower((-1));
        java.lang.Class<?> wildcardClass47 = tower46.getClass();
        tower46.add((int) (byte) 1);
        Tower tower51 = new Tower((-1));
        int int52 = tower51.index();
        tower46.moveTopTo(tower51);
        tower51.add(10);
        Tower tower58 = new Tower(0);
        tower58.add((-1));
        Tower tower62 = new Tower((-1));
        java.lang.Class<?> wildcardClass63 = tower62.getClass();
        tower62.add((int) (byte) 1);
        tower58.moveTopTo(tower62);
        Tower tower68 = new Tower((-1));
        java.lang.Class<?> wildcardClass69 = tower68.getClass();
        tower68.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass72 = tower68.getClass();
        tower51.moveDisks((int) (short) 0, tower58, tower68);
        tower51.add((int) '#');
        int int76 = tower51.index();
        Tower tower78 = new Tower((-1));
        java.lang.Class<?> wildcardClass79 = tower78.getClass();
        tower78.add((int) (byte) 1);
        tower78.add(0);
        int int84 = tower78.index();
        tower29.moveDisks(0, tower51, tower78);
        tower16.moveTopTo(tower78);
        tower1.moveTopTo(tower78);
        int int88 = tower1.index();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test007");
        Tower tower1 = new Tower((int) (byte) 10);
        tower1.add((int) (short) 1);
        Tower tower5 = new Tower((-1));
        java.lang.Class<?> wildcardClass6 = tower5.getClass();
        tower5.add((int) (byte) 1);
        Tower tower10 = new Tower((-1));
        int int11 = tower10.index();
        tower5.moveTopTo(tower10);
        tower10.add(10);
        Tower tower17 = new Tower(0);
        tower17.add((-1));
        java.lang.Class<?> wildcardClass20 = tower17.getClass();
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add(0);
        tower17.moveTopTo(tower22);
        Tower tower28 = new Tower((-1));
        int int29 = tower28.index();
        tower10.moveDisks(0, tower22, tower28);
        int int31 = tower10.index();
        Tower tower33 = new Tower((int) (byte) 100);
        tower10.moveTopTo(tower33);
        int int35 = tower10.index();
        tower1.moveTopTo(tower10);
        int int37 = tower10.index();
        Tower tower39 = new Tower((-1));
        java.lang.Class<?> wildcardClass40 = tower39.getClass();
        tower39.add((int) (byte) 1);
        tower39.add(0);
        int int45 = tower39.index();
        java.lang.Class<?> wildcardClass46 = tower39.getClass();
        java.lang.Class<?> wildcardClass47 = tower39.getClass();
        tower10.moveTopTo(tower39);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test008");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        tower1.add(0);
        int int7 = tower1.index();
        Tower tower10 = new Tower(0);
        tower10.add((-1));
        tower10.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = tower10.getClass();
        Tower tower17 = new Tower((-1));
        tower17.add(0);
        tower10.moveTopTo(tower17);
        Tower tower22 = new Tower(0);
        tower22.add((-1));
        Tower tower27 = new Tower((-1));
        Tower tower29 = new Tower((-1));
        java.lang.Class<?> wildcardClass30 = tower29.getClass();
        tower29.add((int) (byte) 1);
        tower22.moveDisks((int) (byte) -1, tower27, tower29);
        Tower tower35 = new Tower(0);
        int int36 = tower35.index();
        tower29.moveTopTo(tower35);
        tower1.moveDisks((int) (short) 1, tower10, tower29);
        tower1.add((int) (short) -1);
        Tower tower42 = new Tower(100);
        java.lang.Class<?> wildcardClass43 = tower42.getClass();
        tower1.moveTopTo(tower42);
        java.lang.Class<?> wildcardClass45 = tower1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test009");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        tower1.add(0);
        Tower tower8 = new Tower(0);
        tower1.moveTopTo(tower8);
        Tower tower11 = new Tower((-1));
        java.lang.Class<?> wildcardClass12 = tower11.getClass();
        tower11.add((int) (byte) 1);
        tower11.add(0);
        tower1.moveTopTo(tower11);
        tower1.add((int) '4');
        Tower tower21 = new Tower(0);
        tower21.add((-1));
        tower21.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = tower21.getClass();
        Tower tower28 = new Tower((-1));
        tower28.add(0);
        tower21.moveTopTo(tower28);
        tower1.moveTopTo(tower21);
        int int33 = tower1.index();
        tower1.add(0);
        java.lang.Class<?> wildcardClass36 = tower1.getClass();
        java.lang.Class<?> wildcardClass37 = tower1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test010");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        tower6.add(10);
        Tower tower13 = new Tower(0);
        tower13.add((-1));
        Tower tower17 = new Tower((-1));
        java.lang.Class<?> wildcardClass18 = tower17.getClass();
        tower17.add((int) (byte) 1);
        tower13.moveTopTo(tower17);
        Tower tower23 = new Tower((-1));
        java.lang.Class<?> wildcardClass24 = tower23.getClass();
        tower23.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = tower23.getClass();
        tower6.moveDisks((int) (short) 0, tower13, tower23);
        int int29 = tower23.index();
        tower23.add((int) (short) -1);
        tower23.add((int) (short) 1);
        int int34 = tower23.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test011");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        tower6.add(10);
        Tower tower13 = new Tower(0);
        tower13.add((-1));
        Tower tower17 = new Tower((-1));
        java.lang.Class<?> wildcardClass18 = tower17.getClass();
        tower17.add((int) (byte) 1);
        tower13.moveTopTo(tower17);
        Tower tower23 = new Tower((-1));
        java.lang.Class<?> wildcardClass24 = tower23.getClass();
        tower23.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = tower23.getClass();
        tower6.moveDisks((int) (short) 0, tower13, tower23);
        int int29 = tower13.index();
        tower13.add(10);
        int int32 = tower13.index();
        Tower tower34 = new Tower(0);
        tower34.add((-1));
        java.lang.Class<?> wildcardClass37 = tower34.getClass();
        java.lang.Class<?> wildcardClass38 = tower34.getClass();
        int int39 = tower34.index();
        Tower tower41 = new Tower((int) (byte) 0);
        tower41.add((-1));
        Tower tower45 = new Tower(0);
        tower45.add((-1));
        Tower tower49 = new Tower((-1));
        java.lang.Class<?> wildcardClass50 = tower49.getClass();
        tower49.add((int) (byte) 1);
        tower45.moveTopTo(tower49);
        java.lang.Class<?> wildcardClass54 = tower49.getClass();
        tower41.moveTopTo(tower49);
        tower34.moveTopTo(tower41);
        tower13.moveTopTo(tower41);
        Tower tower59 = new Tower((int) (short) 100);
        tower59.add((int) (short) -1);
        tower59.add((-1));
        java.lang.Class<?> wildcardClass64 = tower59.getClass();
        tower41.moveTopTo(tower59);
        tower59.add((int) (byte) 10);
        int int68 = tower59.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test012");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        int int5 = tower1.index();
        Tower tower7 = new Tower(0);
        tower7.add((-1));
        java.lang.Class<?> wildcardClass10 = tower7.getClass();
        int int11 = tower7.index();
        Tower tower13 = new Tower((-1));
        java.lang.Class<?> wildcardClass14 = tower13.getClass();
        tower13.add((int) (byte) 1);
        tower13.add(0);
        int int19 = tower13.index();
        java.lang.Class<?> wildcardClass20 = tower13.getClass();
        java.lang.Class<?> wildcardClass21 = tower13.getClass();
        tower7.moveTopTo(tower13);
        tower1.moveTopTo(tower7);
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add((int) (byte) 1);
        Tower tower30 = new Tower((-1));
        int int31 = tower30.index();
        tower25.moveTopTo(tower30);
        tower30.add(10);
        Tower tower37 = new Tower(0);
        tower37.add((-1));
        Tower tower41 = new Tower((-1));
        java.lang.Class<?> wildcardClass42 = tower41.getClass();
        tower41.add((int) (byte) 1);
        tower37.moveTopTo(tower41);
        Tower tower47 = new Tower((-1));
        java.lang.Class<?> wildcardClass48 = tower47.getClass();
        tower47.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass51 = tower47.getClass();
        tower30.moveDisks((int) (short) 0, tower37, tower47);
        int int53 = tower37.index();
        tower37.add(10);
        tower7.moveTopTo(tower37);
        Tower tower58 = new Tower((-1));
        java.lang.Class<?> wildcardClass59 = tower58.getClass();
        tower58.add((int) (byte) 1);
        tower58.add(0);
        Tower tower65 = new Tower(0);
        tower58.moveTopTo(tower65);
        Tower tower68 = new Tower((-1));
        java.lang.Class<?> wildcardClass69 = tower68.getClass();
        tower68.add((int) (byte) 1);
        tower68.add(0);
        tower58.moveTopTo(tower68);
        tower58.add((int) '4');
        int int77 = tower58.index();
        tower37.moveTopTo(tower58);
        tower37.add((int) (short) 1);
        java.lang.Class<?> wildcardClass81 = tower37.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test013");
        Tower tower1 = new Tower(0);
        tower1.add((int) (byte) 10);
        Tower tower6 = new Tower((-1));
        Tower tower8 = new Tower(0);
        tower8.add((-1));
        tower8.add((int) (byte) 1);
        tower8.add((int) (byte) 1);
        Tower tower17 = new Tower(0);
        tower17.add((-1));
        java.lang.Class<?> wildcardClass20 = tower17.getClass();
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add(0);
        tower17.moveTopTo(tower22);
        Tower tower28 = new Tower(0);
        tower28.add((-1));
        Tower tower32 = new Tower((-1));
        java.lang.Class<?> wildcardClass33 = tower32.getClass();
        tower32.add((int) (byte) 1);
        tower28.moveTopTo(tower32);
        tower8.moveDisks((int) (short) 1, tower22, tower28);
        java.lang.Class<?> wildcardClass38 = tower22.getClass();
        java.lang.Class<?> wildcardClass39 = tower22.getClass();
        tower1.moveDisks((-1), tower6, tower22);
        java.lang.Class<?> wildcardClass41 = tower1.getClass();
        int int42 = tower1.index();
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test014");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower6.add(0);
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add((int) (byte) 1);
        tower15.add(0);
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = tower22.getClass();
        tower6.moveDisks((int) (short) 0, tower15, tower22);
        Tower tower29 = new Tower(100);
        tower6.moveTopTo(tower29);
        Tower tower33 = new Tower(0);
        tower33.add((-1));
        tower33.add((int) (byte) 1);
        Tower tower40 = new Tower((-1));
        java.lang.Class<?> wildcardClass41 = tower40.getClass();
        tower40.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass44 = tower40.getClass();
        Tower tower46 = new Tower(0);
        tower46.add((-1));
        tower46.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass51 = tower46.getClass();
        Tower tower53 = new Tower((-1));
        tower53.add(0);
        tower46.moveTopTo(tower53);
        tower33.moveDisks((int) (short) 1, tower40, tower53);
        java.lang.Class<?> wildcardClass58 = tower53.getClass();
        Tower tower60 = new Tower((-1));
        java.lang.Class<?> wildcardClass61 = tower60.getClass();
        tower60.add((int) (byte) 1);
        tower60.add(0);
        Tower tower67 = new Tower(0);
        tower60.moveTopTo(tower67);
        Tower tower70 = new Tower((-1));
        java.lang.Class<?> wildcardClass71 = tower70.getClass();
        tower70.add((int) (byte) 1);
        tower70.add(0);
        tower60.moveTopTo(tower70);
        tower60.add((int) '4');
        tower29.moveDisks((int) (byte) 0, tower53, tower60);
        int int80 = tower60.index();
        int int81 = tower60.index();
        tower60.add((int) (byte) 10);
        tower60.add(0);
        java.lang.Class<?> wildcardClass86 = tower60.getClass();
        int int87 = tower60.index();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test015");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        tower1.add(0);
        Tower tower8 = new Tower(0);
        tower1.moveTopTo(tower8);
        Tower tower11 = new Tower((-1));
        java.lang.Class<?> wildcardClass12 = tower11.getClass();
        tower11.add((int) (byte) 1);
        tower11.add(0);
        tower1.moveTopTo(tower11);
        tower1.add((int) (byte) 1);
        tower1.add(0);
        tower1.add((int) (byte) 1);
        tower1.add((-1));
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test016");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower5 = new Tower((-1));
        java.lang.Class<?> wildcardClass6 = tower5.getClass();
        tower5.add((int) (byte) 1);
        tower1.moveTopTo(tower5);
        java.lang.Class<?> wildcardClass10 = tower5.getClass();
        tower5.add(10);
        tower5.add(0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test017");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        tower6.add((int) '#');
        Tower tower12 = new Tower((-1));
        java.lang.Class<?> wildcardClass13 = tower12.getClass();
        tower12.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = tower12.getClass();
        int int17 = tower12.index();
        tower6.moveTopTo(tower12);
        tower6.add(0);
        int int21 = tower6.index();
        Tower tower23 = new Tower(0);
        tower23.add((-1));
        java.lang.Class<?> wildcardClass26 = tower23.getClass();
        Tower tower28 = new Tower((-1));
        java.lang.Class<?> wildcardClass29 = tower28.getClass();
        tower28.add(0);
        tower23.moveTopTo(tower28);
        int int33 = tower28.index();
        Tower tower35 = new Tower(0);
        tower35.add((-1));
        Tower tower39 = new Tower(0);
        tower35.moveTopTo(tower39);
        int int41 = tower39.index();
        Tower tower43 = new Tower(0);
        tower43.add((-1));
        java.lang.Class<?> wildcardClass46 = tower43.getClass();
        int int47 = tower43.index();
        tower39.moveTopTo(tower43);
        tower39.add((int) '4');
        tower28.moveTopTo(tower39);
        tower6.moveTopTo(tower39);
        int int53 = tower6.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test018");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower5 = new Tower(0);
        tower1.moveTopTo(tower5);
        tower5.add((-1));
        tower5.add((int) (byte) 1);
        tower5.add((int) '#');
        Tower tower14 = new Tower(0);
        int int15 = tower14.index();
        java.lang.Class<?> wildcardClass16 = tower14.getClass();
        tower14.add((int) 'a');
        Tower tower20 = new Tower((-1));
        java.lang.Class<?> wildcardClass21 = tower20.getClass();
        tower20.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = tower20.getClass();
        int int25 = tower20.index();
        int int26 = tower20.index();
        tower14.moveTopTo(tower20);
        java.lang.Class<?> wildcardClass28 = tower14.getClass();
        tower14.add((int) '#');
        tower5.moveTopTo(tower14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test019");
        Tower tower1 = new Tower((int) (byte) -1);
        int int2 = tower1.index();
        tower1.add((int) (byte) 100);
        int int5 = tower1.index();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test020");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        Tower tower11 = new Tower((-1));
        java.lang.Class<?> wildcardClass12 = tower11.getClass();
        tower11.add((int) (byte) 1);
        tower11.add(0);
        Tower tower18 = new Tower(0);
        tower11.moveTopTo(tower18);
        Tower tower21 = new Tower(1);
        tower6.moveDisks(1, tower18, tower21);
        Tower tower24 = new Tower((int) (short) 100);
        tower24.add((int) (short) -1);
        tower24.add((-1));
        int int29 = tower24.index();
        tower18.moveTopTo(tower24);
        Tower tower32 = new Tower(0);
        tower32.add((-1));
        tower32.add((int) (byte) 1);
        tower32.add((int) (byte) 1);
        Tower tower41 = new Tower(0);
        tower41.add((-1));
        java.lang.Class<?> wildcardClass44 = tower41.getClass();
        Tower tower46 = new Tower((-1));
        java.lang.Class<?> wildcardClass47 = tower46.getClass();
        tower46.add(0);
        tower41.moveTopTo(tower46);
        Tower tower52 = new Tower(0);
        tower52.add((-1));
        Tower tower56 = new Tower((-1));
        java.lang.Class<?> wildcardClass57 = tower56.getClass();
        tower56.add((int) (byte) 1);
        tower52.moveTopTo(tower56);
        tower32.moveDisks((int) (short) 1, tower46, tower52);
        tower24.moveTopTo(tower32);
        java.lang.Class<?> wildcardClass63 = tower32.getClass();
        Tower tower65 = new Tower(0);
        tower65.add((-1));
        tower65.add((int) (byte) 1);
        tower65.add((int) (byte) 1);
        Tower tower74 = new Tower(0);
        tower74.add((-1));
        java.lang.Class<?> wildcardClass77 = tower74.getClass();
        Tower tower79 = new Tower((-1));
        java.lang.Class<?> wildcardClass80 = tower79.getClass();
        tower79.add(0);
        tower74.moveTopTo(tower79);
        Tower tower85 = new Tower(0);
        tower85.add((-1));
        Tower tower89 = new Tower((-1));
        java.lang.Class<?> wildcardClass90 = tower89.getClass();
        tower89.add((int) (byte) 1);
        tower85.moveTopTo(tower89);
        tower65.moveDisks((int) (short) 1, tower79, tower85);
        tower65.add((int) (short) 0);
        tower32.moveTopTo(tower65);
        tower32.add((-1));
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test021");
        Tower tower1 = new Tower(97);
        tower1.add((int) (byte) 0);
        tower1.add((int) (byte) 100);
        tower1.add(1);
        tower1.add(100);
        tower1.add((int) (short) 1);
        tower1.add((int) (short) 1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test022");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower6.add(0);
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add((int) (byte) 1);
        tower15.add(0);
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = tower22.getClass();
        tower6.moveDisks((int) (short) 0, tower15, tower22);
        int int28 = tower15.index();
        Tower tower30 = new Tower(0);
        tower30.add((-1));
        java.lang.Class<?> wildcardClass33 = tower30.getClass();
        Tower tower35 = new Tower((-1));
        java.lang.Class<?> wildcardClass36 = tower35.getClass();
        tower35.add(0);
        tower30.moveTopTo(tower35);
        java.lang.Class<?> wildcardClass40 = tower30.getClass();
        int int41 = tower30.index();
        tower15.moveTopTo(tower30);
        Tower tower44 = new Tower((-1));
        java.lang.Class<?> wildcardClass45 = tower44.getClass();
        tower44.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass48 = tower44.getClass();
        int int49 = tower44.index();
        int int50 = tower44.index();
        Tower tower52 = new Tower(0);
        tower52.add((-1));
        tower52.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass57 = tower52.getClass();
        Tower tower59 = new Tower((-1));
        tower59.add(0);
        tower52.moveTopTo(tower59);
        java.lang.Class<?> wildcardClass63 = tower52.getClass();
        tower52.add((int) ' ');
        Tower tower67 = new Tower(0);
        tower67.add((-1));
        tower67.add((int) (byte) 1);
        tower67.add((int) (byte) 1);
        tower67.add(97);
        tower52.moveTopTo(tower67);
        tower44.moveTopTo(tower52);
        java.lang.Class<?> wildcardClass78 = tower44.getClass();
        tower30.moveTopTo(tower44);
        java.lang.Class<?> wildcardClass80 = tower44.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test023");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add(0);
        java.lang.Class<?> wildcardClass5 = tower1.getClass();
        int int6 = tower1.index();
        Tower tower8 = new Tower((int) (short) 100);
        tower8.add((int) (short) -1);
        Tower tower12 = new Tower(0);
        tower12.add((-1));
        tower12.add((int) (byte) 1);
        tower12.add((int) (byte) 1);
        Tower tower21 = new Tower(0);
        tower21.add((-1));
        java.lang.Class<?> wildcardClass24 = tower21.getClass();
        Tower tower26 = new Tower((-1));
        java.lang.Class<?> wildcardClass27 = tower26.getClass();
        tower26.add(0);
        tower21.moveTopTo(tower26);
        Tower tower32 = new Tower(0);
        tower32.add((-1));
        Tower tower36 = new Tower((-1));
        java.lang.Class<?> wildcardClass37 = tower36.getClass();
        tower36.add((int) (byte) 1);
        tower32.moveTopTo(tower36);
        tower12.moveDisks((int) (short) 1, tower26, tower32);
        java.lang.Class<?> wildcardClass42 = tower26.getClass();
        Tower tower44 = new Tower((-1));
        java.lang.Class<?> wildcardClass45 = tower44.getClass();
        tower44.add((int) (byte) 1);
        Tower tower49 = new Tower((-1));
        int int50 = tower49.index();
        tower44.moveTopTo(tower49);
        tower49.add(10);
        Tower tower56 = new Tower(0);
        tower56.add((-1));
        java.lang.Class<?> wildcardClass59 = tower56.getClass();
        Tower tower61 = new Tower((-1));
        java.lang.Class<?> wildcardClass62 = tower61.getClass();
        tower61.add(0);
        tower56.moveTopTo(tower61);
        Tower tower67 = new Tower((-1));
        int int68 = tower67.index();
        tower49.moveDisks(0, tower61, tower67);
        tower26.moveTopTo(tower61);
        int int71 = tower61.index();
        tower61.add(1);
        Tower tower75 = new Tower(0);
        tower61.moveTopTo(tower75);
        Tower tower78 = new Tower(0);
        tower78.add((-1));
        tower78.add((int) (byte) 1);
        Tower tower84 = new Tower((int) (byte) 0);
        tower78.moveTopTo(tower84);
        java.lang.Class<?> wildcardClass86 = tower84.getClass();
        tower75.moveTopTo(tower84);
        tower84.add((int) (short) -1);
        tower8.moveTopTo(tower84);
        java.lang.Class<?> wildcardClass91 = tower8.getClass();
        tower1.moveTopTo(tower8);
        int int93 = tower1.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test024");
        Tower tower1 = new Tower(0);
        tower1.add((int) (byte) 10);
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add((int) (byte) 1);
        Tower tower11 = new Tower((-1));
        int int12 = tower11.index();
        tower6.moveTopTo(tower11);
        tower11.add(10);
        Tower tower18 = new Tower(0);
        tower18.add((-1));
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add((int) (byte) 1);
        tower18.moveTopTo(tower22);
        Tower tower28 = new Tower((-1));
        java.lang.Class<?> wildcardClass29 = tower28.getClass();
        tower28.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass32 = tower28.getClass();
        tower11.moveDisks((int) (short) 0, tower18, tower28);
        int int34 = tower18.index();
        Tower tower36 = new Tower((int) (byte) 0);
        tower36.add((-1));
        Tower tower40 = new Tower(0);
        tower40.add((-1));
        Tower tower44 = new Tower((-1));
        java.lang.Class<?> wildcardClass45 = tower44.getClass();
        tower44.add((int) (byte) 1);
        tower40.moveTopTo(tower44);
        java.lang.Class<?> wildcardClass49 = tower44.getClass();
        tower36.moveTopTo(tower44);
        int int51 = tower36.index();
        tower1.moveDisks(1, tower18, tower36);
        java.lang.Class<?> wildcardClass53 = tower36.getClass();
        java.lang.Class<?> wildcardClass54 = tower36.getClass();
        int int55 = tower36.index();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test025");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower1.add((int) (short) -1);
        int int13 = tower1.index();
        Tower tower15 = new Tower(0);
        tower15.add((-1));
        Tower tower20 = new Tower((-1));
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add((int) (byte) 1);
        tower15.moveDisks((int) (byte) -1, tower20, tower22);
        Tower tower28 = new Tower(0);
        tower28.add((-1));
        tower28.add((int) (byte) 1);
        tower28.add((int) (byte) 1);
        Tower tower37 = new Tower(0);
        tower37.add((-1));
        java.lang.Class<?> wildcardClass40 = tower37.getClass();
        Tower tower42 = new Tower((-1));
        java.lang.Class<?> wildcardClass43 = tower42.getClass();
        tower42.add(0);
        tower37.moveTopTo(tower42);
        Tower tower48 = new Tower(0);
        tower48.add((-1));
        Tower tower52 = new Tower((-1));
        java.lang.Class<?> wildcardClass53 = tower52.getClass();
        tower52.add((int) (byte) 1);
        tower48.moveTopTo(tower52);
        tower28.moveDisks((int) (short) 1, tower42, tower48);
        java.lang.Class<?> wildcardClass58 = tower42.getClass();
        Tower tower60 = new Tower((-1));
        java.lang.Class<?> wildcardClass61 = tower60.getClass();
        tower60.add((int) (byte) 1);
        Tower tower65 = new Tower((-1));
        int int66 = tower65.index();
        tower60.moveTopTo(tower65);
        tower65.add(10);
        Tower tower72 = new Tower(0);
        tower72.add((-1));
        java.lang.Class<?> wildcardClass75 = tower72.getClass();
        Tower tower77 = new Tower((-1));
        java.lang.Class<?> wildcardClass78 = tower77.getClass();
        tower77.add(0);
        tower72.moveTopTo(tower77);
        Tower tower83 = new Tower((-1));
        int int84 = tower83.index();
        tower65.moveDisks(0, tower77, tower83);
        tower42.moveTopTo(tower77);
        tower15.moveTopTo(tower42);
        java.lang.Class<?> wildcardClass88 = tower42.getClass();
        int int89 = tower42.index();
        int int90 = tower42.index();
        tower1.moveTopTo(tower42);
        int int92 = tower1.index();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test026");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        tower1.add(0);
        Tower tower8 = new Tower(0);
        tower1.moveTopTo(tower8);
        int int10 = tower1.index();
        java.lang.Class<?> wildcardClass11 = tower1.getClass();
        java.lang.Class<?> wildcardClass12 = tower1.getClass();
        int int13 = tower1.index();
        int int14 = tower1.index();
        int int15 = tower1.index();
        java.lang.Class<?> wildcardClass16 = tower1.getClass();
        tower1.add((int) (short) -1);
        Tower tower20 = new Tower((-1));
        java.lang.Class<?> wildcardClass21 = tower20.getClass();
        tower20.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = tower20.getClass();
        int int25 = tower20.index();
        java.lang.Class<?> wildcardClass26 = tower20.getClass();
        java.lang.Class<?> wildcardClass27 = tower20.getClass();
        tower1.moveTopTo(tower20);
        int int29 = tower20.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test027");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower1.add((int) 'a');
        int int13 = tower1.index();
        tower1.add((int) ' ');
        tower1.add((int) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test028");
        Tower tower1 = new Tower((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        java.lang.Class<?> wildcardClass3 = tower1.getClass();
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        tower1.add(52);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test029");
        Tower tower1 = new Tower(35);
        Tower tower3 = new Tower(0);
        tower3.add((-1));
        java.lang.Class<?> wildcardClass6 = tower3.getClass();
        Tower tower8 = new Tower((-1));
        java.lang.Class<?> wildcardClass9 = tower8.getClass();
        tower8.add(0);
        tower3.moveTopTo(tower8);
        tower8.add(0);
        Tower tower17 = new Tower((-1));
        java.lang.Class<?> wildcardClass18 = tower17.getClass();
        tower17.add((int) (byte) 1);
        tower17.add(0);
        Tower tower24 = new Tower((-1));
        java.lang.Class<?> wildcardClass25 = tower24.getClass();
        tower24.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = tower24.getClass();
        tower8.moveDisks((int) (short) 0, tower17, tower24);
        Tower tower31 = new Tower(100);
        tower8.moveTopTo(tower31);
        Tower tower35 = new Tower(0);
        tower35.add((-1));
        tower35.add((int) (byte) 1);
        Tower tower42 = new Tower((-1));
        java.lang.Class<?> wildcardClass43 = tower42.getClass();
        tower42.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass46 = tower42.getClass();
        Tower tower48 = new Tower(0);
        tower48.add((-1));
        tower48.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass53 = tower48.getClass();
        Tower tower55 = new Tower((-1));
        tower55.add(0);
        tower48.moveTopTo(tower55);
        tower35.moveDisks((int) (short) 1, tower42, tower55);
        java.lang.Class<?> wildcardClass60 = tower55.getClass();
        Tower tower62 = new Tower((-1));
        java.lang.Class<?> wildcardClass63 = tower62.getClass();
        tower62.add((int) (byte) 1);
        tower62.add(0);
        Tower tower69 = new Tower(0);
        tower62.moveTopTo(tower69);
        Tower tower72 = new Tower((-1));
        java.lang.Class<?> wildcardClass73 = tower72.getClass();
        tower72.add((int) (byte) 1);
        tower72.add(0);
        tower62.moveTopTo(tower72);
        tower62.add((int) '4');
        tower31.moveDisks((int) (byte) 0, tower55, tower62);
        int int82 = tower62.index();
        int int83 = tower62.index();
        tower62.add((int) (byte) 10);
        tower62.add(0);
        java.lang.Class<?> wildcardClass88 = tower62.getClass();
        try {
            tower1.moveTopTo(tower62);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test030");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower6.add(0);
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add((int) (byte) 1);
        tower15.add(0);
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = tower22.getClass();
        tower6.moveDisks((int) (short) 0, tower15, tower22);
        Tower tower29 = new Tower(100);
        tower6.moveTopTo(tower29);
        Tower tower33 = new Tower(0);
        tower33.add((-1));
        tower33.add((int) (byte) 1);
        Tower tower40 = new Tower((-1));
        java.lang.Class<?> wildcardClass41 = tower40.getClass();
        tower40.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass44 = tower40.getClass();
        Tower tower46 = new Tower(0);
        tower46.add((-1));
        tower46.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass51 = tower46.getClass();
        Tower tower53 = new Tower((-1));
        tower53.add(0);
        tower46.moveTopTo(tower53);
        tower33.moveDisks((int) (short) 1, tower40, tower53);
        java.lang.Class<?> wildcardClass58 = tower53.getClass();
        Tower tower60 = new Tower((-1));
        java.lang.Class<?> wildcardClass61 = tower60.getClass();
        tower60.add((int) (byte) 1);
        tower60.add(0);
        Tower tower67 = new Tower(0);
        tower60.moveTopTo(tower67);
        Tower tower70 = new Tower((-1));
        java.lang.Class<?> wildcardClass71 = tower70.getClass();
        tower70.add((int) (byte) 1);
        tower70.add(0);
        tower60.moveTopTo(tower70);
        tower60.add((int) '4');
        tower29.moveDisks((int) (byte) 0, tower53, tower60);
        int int80 = tower60.index();
        int int81 = tower60.index();
        tower60.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass84 = tower60.getClass();
        int int85 = tower60.index();
        tower60.add((int) (byte) 1);
        tower60.add((int) '4');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test031");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower6.add(0);
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add((int) (byte) 1);
        tower15.add(0);
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = tower22.getClass();
        tower6.moveDisks((int) (short) 0, tower15, tower22);
        java.lang.Class<?> wildcardClass28 = tower22.getClass();
        Tower tower30 = new Tower((int) (byte) 0);
        tower22.moveTopTo(tower30);
        tower30.add(0);
        Tower tower35 = new Tower(0);
        tower35.add((-1));
        java.lang.Class<?> wildcardClass38 = tower35.getClass();
        int int39 = tower35.index();
        Tower tower41 = new Tower((-1));
        java.lang.Class<?> wildcardClass42 = tower41.getClass();
        tower41.add((int) (byte) 1);
        tower41.add(0);
        int int47 = tower41.index();
        java.lang.Class<?> wildcardClass48 = tower41.getClass();
        java.lang.Class<?> wildcardClass49 = tower41.getClass();
        tower35.moveTopTo(tower41);
        java.lang.Class<?> wildcardClass51 = tower41.getClass();
        tower30.moveTopTo(tower41);
        int int53 = tower41.index();
        tower41.add((int) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test032");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        tower6.add(10);
        Tower tower13 = new Tower(0);
        tower13.add((-1));
        Tower tower17 = new Tower((-1));
        java.lang.Class<?> wildcardClass18 = tower17.getClass();
        tower17.add((int) (byte) 1);
        tower13.moveTopTo(tower17);
        Tower tower23 = new Tower((-1));
        java.lang.Class<?> wildcardClass24 = tower23.getClass();
        tower23.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = tower23.getClass();
        tower6.moveDisks((int) (short) 0, tower13, tower23);
        tower6.add((int) '#');
        int int31 = tower6.index();
        int int32 = tower6.index();
        int int33 = tower6.index();
        java.lang.Class<?> wildcardClass34 = tower6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test033");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower6.add(0);
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add((int) (byte) 1);
        tower15.add(0);
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = tower22.getClass();
        tower6.moveDisks((int) (short) 0, tower15, tower22);
        tower6.add((int) (short) 100);
        tower6.add(0);
        int int32 = tower6.index();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test034");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        tower1.add((int) '4');
        java.lang.Class<?> wildcardClass7 = tower1.getClass();
        java.lang.Class<?> wildcardClass8 = tower1.getClass();
        java.lang.Class<?> wildcardClass9 = tower1.getClass();
        Tower tower12 = new Tower((-1));
        java.lang.Class<?> wildcardClass13 = tower12.getClass();
        tower12.add((int) (byte) 1);
        Tower tower17 = new Tower((-1));
        int int18 = tower17.index();
        tower12.moveTopTo(tower17);
        tower17.add(10);
        Tower tower24 = new Tower(0);
        tower24.add((-1));
        Tower tower28 = new Tower((-1));
        java.lang.Class<?> wildcardClass29 = tower28.getClass();
        tower28.add((int) (byte) 1);
        tower24.moveTopTo(tower28);
        Tower tower34 = new Tower((-1));
        java.lang.Class<?> wildcardClass35 = tower34.getClass();
        tower34.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass38 = tower34.getClass();
        tower17.moveDisks((int) (short) 0, tower24, tower34);
        tower17.add(10);
        Tower tower43 = new Tower(97);
        tower43.add((int) (byte) 0);
        tower43.add((int) (byte) 100);
        tower1.moveDisks((int) (short) -1, tower17, tower43);
        Tower tower50 = new Tower((-1));
        java.lang.Class<?> wildcardClass51 = tower50.getClass();
        tower50.add((int) (byte) 1);
        tower50.add(0);
        int int56 = tower50.index();
        Tower tower59 = new Tower(0);
        tower59.add((-1));
        tower59.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass64 = tower59.getClass();
        Tower tower66 = new Tower((-1));
        tower66.add(0);
        tower59.moveTopTo(tower66);
        Tower tower71 = new Tower(0);
        tower71.add((-1));
        Tower tower76 = new Tower((-1));
        Tower tower78 = new Tower((-1));
        java.lang.Class<?> wildcardClass79 = tower78.getClass();
        tower78.add((int) (byte) 1);
        tower71.moveDisks((int) (byte) -1, tower76, tower78);
        Tower tower84 = new Tower(0);
        int int85 = tower84.index();
        tower78.moveTopTo(tower84);
        tower50.moveDisks((int) (short) 1, tower59, tower78);
        int int88 = tower59.index();
        tower59.add((int) (byte) 0);
        java.lang.Class<?> wildcardClass91 = tower59.getClass();
        int int92 = tower59.index();
        tower17.moveTopTo(tower59);
        tower59.add(0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test035");
        Tower tower1 = new Tower((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        int int3 = tower1.index();
        int int4 = tower1.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test036");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        Tower tower11 = new Tower((-1));
        java.lang.Class<?> wildcardClass12 = tower11.getClass();
        tower11.add((int) (byte) 1);
        tower11.add(0);
        Tower tower18 = new Tower(0);
        tower11.moveTopTo(tower18);
        Tower tower21 = new Tower(1);
        tower6.moveDisks(1, tower18, tower21);
        Tower tower24 = new Tower((int) (short) 100);
        tower24.add((int) (short) -1);
        tower24.add((-1));
        int int29 = tower24.index();
        tower18.moveTopTo(tower24);
        Tower tower32 = new Tower(0);
        tower32.add((-1));
        java.lang.Class<?> wildcardClass35 = tower32.getClass();
        int int36 = tower32.index();
        tower24.moveTopTo(tower32);
        java.lang.Class<?> wildcardClass38 = tower24.getClass();
        Tower tower41 = new Tower((-1));
        java.lang.Class<?> wildcardClass42 = tower41.getClass();
        tower41.add((int) (byte) 1);
        tower41.add(0);
        Tower tower48 = new Tower(0);
        tower48.add((-1));
        java.lang.Class<?> wildcardClass51 = tower48.getClass();
        tower41.moveTopTo(tower48);
        int int53 = tower41.index();
        Tower tower55 = new Tower((-1));
        java.lang.Class<?> wildcardClass56 = tower55.getClass();
        tower55.add((int) (byte) 1);
        tower55.add(0);
        int int61 = tower55.index();
        java.lang.Class<?> wildcardClass62 = tower55.getClass();
        java.lang.Class<?> wildcardClass63 = tower55.getClass();
        tower24.moveDisks(0, tower41, tower55);
        tower55.add(35);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test037");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        tower6.add(10);
        Tower tower13 = new Tower(0);
        tower13.add((-1));
        java.lang.Class<?> wildcardClass16 = tower13.getClass();
        Tower tower18 = new Tower((-1));
        java.lang.Class<?> wildcardClass19 = tower18.getClass();
        tower18.add(0);
        tower13.moveTopTo(tower18);
        Tower tower24 = new Tower((-1));
        int int25 = tower24.index();
        tower6.moveDisks(0, tower18, tower24);
        int int27 = tower6.index();
        Tower tower30 = new Tower(1);
        int int31 = tower30.index();
        int int32 = tower30.index();
        java.lang.Class<?> wildcardClass33 = tower30.getClass();
        java.lang.Class<?> wildcardClass34 = tower30.getClass();
        Tower tower36 = new Tower(0);
        tower36.add((-1));
        java.lang.Class<?> wildcardClass39 = tower36.getClass();
        Tower tower41 = new Tower((-1));
        java.lang.Class<?> wildcardClass42 = tower41.getClass();
        tower41.add(0);
        tower36.moveTopTo(tower41);
        tower41.add(0);
        Tower tower50 = new Tower((-1));
        java.lang.Class<?> wildcardClass51 = tower50.getClass();
        tower50.add((int) (byte) 1);
        tower50.add(0);
        Tower tower57 = new Tower((-1));
        java.lang.Class<?> wildcardClass58 = tower57.getClass();
        tower57.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass61 = tower57.getClass();
        tower41.moveDisks((int) (short) 0, tower50, tower57);
        java.lang.Class<?> wildcardClass63 = tower57.getClass();
        Tower tower65 = new Tower((int) (byte) 0);
        tower57.moveTopTo(tower65);
        try {
            tower6.moveDisks((int) ' ', tower30, tower65);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test038");
        Tower tower1 = new Tower((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) '#');
        Tower tower7 = new Tower((int) (byte) -1);
        int int8 = tower7.index();
        tower7.add((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = tower7.getClass();
        java.lang.Class<?> wildcardClass12 = tower7.getClass();
        tower7.add(97);
        Tower tower16 = new Tower(0);
        tower16.add((-1));
        java.lang.Class<?> wildcardClass19 = tower16.getClass();
        int int20 = tower16.index();
        int int21 = tower16.index();
        java.lang.Class<?> wildcardClass22 = tower16.getClass();
        tower16.add(0);
        try {
            tower1.moveDisks((int) (short) 100, tower7, tower16);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test039");
        Tower tower1 = new Tower((int) '#');
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add(35);
        tower1.add(10);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test040");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        java.lang.Class<?> wildcardClass11 = tower1.getClass();
        int int12 = tower1.index();
        tower1.add((-1));
        tower1.add((int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = tower1.getClass();
        tower1.add((int) (short) 1);
        int int20 = tower1.index();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test041");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = tower1.getClass();
        int int6 = tower1.index();
        tower1.add(100);
        java.lang.Class<?> wildcardClass9 = tower1.getClass();
        Tower tower11 = new Tower(0);
        int int12 = tower11.index();
        java.lang.Class<?> wildcardClass13 = tower11.getClass();
        tower11.add((int) 'a');
        Tower tower17 = new Tower((-1));
        java.lang.Class<?> wildcardClass18 = tower17.getClass();
        tower17.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = tower17.getClass();
        int int22 = tower17.index();
        int int23 = tower17.index();
        tower11.moveTopTo(tower17);
        tower1.moveTopTo(tower11);
        Tower tower27 = null;
        Tower tower29 = new Tower(0);
        int int30 = tower29.index();
        tower11.moveDisks(0, tower27, tower29);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test042");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        java.lang.Class<?> wildcardClass11 = tower1.getClass();
        int int12 = tower1.index();
        tower1.add((-1));
        tower1.add((int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = tower1.getClass();
        tower1.add((int) (short) 1);
        tower1.add((int) 'a');
        tower1.add((int) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test043");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        tower1.add(0);
        Tower tower8 = new Tower(0);
        tower8.add((-1));
        java.lang.Class<?> wildcardClass11 = tower8.getClass();
        tower1.moveTopTo(tower8);
        Tower tower15 = new Tower((-1));
        Tower tower17 = new Tower((-1));
        tower17.add(0);
        tower1.moveDisks((int) (short) 0, tower15, tower17);
        int int21 = tower15.index();
        tower15.add(0);
        int int24 = tower15.index();
        Tower tower26 = new Tower((-1));
        java.lang.Class<?> wildcardClass27 = tower26.getClass();
        tower26.add((int) (byte) 1);
        tower26.add(0);
        int int32 = tower26.index();
        Tower tower35 = new Tower(0);
        tower35.add((-1));
        tower35.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass40 = tower35.getClass();
        Tower tower42 = new Tower((-1));
        tower42.add(0);
        tower35.moveTopTo(tower42);
        Tower tower47 = new Tower(0);
        tower47.add((-1));
        Tower tower52 = new Tower((-1));
        Tower tower54 = new Tower((-1));
        java.lang.Class<?> wildcardClass55 = tower54.getClass();
        tower54.add((int) (byte) 1);
        tower47.moveDisks((int) (byte) -1, tower52, tower54);
        Tower tower60 = new Tower(0);
        int int61 = tower60.index();
        tower54.moveTopTo(tower60);
        tower26.moveDisks((int) (short) 1, tower35, tower54);
        Tower tower65 = new Tower((-1));
        java.lang.Class<?> wildcardClass66 = tower65.getClass();
        tower65.add((int) (byte) 1);
        Tower tower70 = new Tower((-1));
        int int71 = tower70.index();
        tower65.moveTopTo(tower70);
        tower70.add(10);
        Tower tower77 = new Tower(0);
        tower77.add((-1));
        Tower tower81 = new Tower((-1));
        java.lang.Class<?> wildcardClass82 = tower81.getClass();
        tower81.add((int) (byte) 1);
        tower77.moveTopTo(tower81);
        Tower tower87 = new Tower((-1));
        java.lang.Class<?> wildcardClass88 = tower87.getClass();
        tower87.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass91 = tower87.getClass();
        tower70.moveDisks((int) (short) 0, tower77, tower87);
        tower87.add((int) (short) 100);
        tower26.moveTopTo(tower87);
        tower26.add((int) (short) -1);
        tower15.moveTopTo(tower26);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test044");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower5 = new Tower((int) (short) 100);
        tower1.moveTopTo(tower5);
        tower1.add((int) (byte) 100);
        Tower tower10 = new Tower((-1));
        java.lang.Class<?> wildcardClass11 = tower10.getClass();
        tower10.add((int) (byte) 1);
        tower10.add(0);
        Tower tower17 = new Tower(0);
        tower17.add((-1));
        java.lang.Class<?> wildcardClass20 = tower17.getClass();
        tower10.moveTopTo(tower17);
        Tower tower24 = new Tower((-1));
        Tower tower26 = new Tower((-1));
        tower26.add(0);
        tower10.moveDisks((int) (short) 0, tower24, tower26);
        int int30 = tower26.index();
        tower1.moveTopTo(tower26);
        tower1.add((int) ' ');
        tower1.add((int) '#');
        Tower tower37 = new Tower((int) 'a');
        tower37.add((int) (byte) 1);
        tower1.moveTopTo(tower37);
        java.lang.Class<?> wildcardClass41 = tower1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test045");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        tower1.add(0);
        Tower tower8 = new Tower(0);
        tower1.moveTopTo(tower8);
        int int10 = tower1.index();
        java.lang.Class<?> wildcardClass11 = tower1.getClass();
        java.lang.Class<?> wildcardClass12 = tower1.getClass();
        int int13 = tower1.index();
        Tower tower15 = new Tower(0);
        tower15.add((-1));
        java.lang.Class<?> wildcardClass18 = tower15.getClass();
        tower15.add((int) '4');
        java.lang.Class<?> wildcardClass21 = tower15.getClass();
        Tower tower23 = new Tower(0);
        tower23.add((-1));
        Tower tower27 = new Tower(0);
        tower23.moveTopTo(tower27);
        Tower tower31 = new Tower(0);
        tower31.add((-1));
        Tower tower35 = new Tower((-1));
        java.lang.Class<?> wildcardClass36 = tower35.getClass();
        tower35.add((int) (byte) 1);
        tower35.add(0);
        Tower tower42 = new Tower(0);
        tower35.moveTopTo(tower42);
        Tower tower45 = new Tower((-1));
        java.lang.Class<?> wildcardClass46 = tower45.getClass();
        tower45.add((int) (byte) 1);
        tower45.add(0);
        tower35.moveTopTo(tower45);
        tower27.moveDisks((int) (byte) -1, tower31, tower45);
        java.lang.Class<?> wildcardClass53 = tower45.getClass();
        int int54 = tower45.index();
        tower15.moveTopTo(tower45);
        tower1.moveTopTo(tower15);
        int int57 = tower1.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test046");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower5 = new Tower(0);
        tower1.moveTopTo(tower5);
        Tower tower9 = new Tower(0);
        tower9.add((-1));
        Tower tower13 = new Tower((-1));
        java.lang.Class<?> wildcardClass14 = tower13.getClass();
        tower13.add((int) (byte) 1);
        tower13.add(0);
        Tower tower20 = new Tower(0);
        tower13.moveTopTo(tower20);
        Tower tower23 = new Tower((-1));
        java.lang.Class<?> wildcardClass24 = tower23.getClass();
        tower23.add((int) (byte) 1);
        tower23.add(0);
        tower13.moveTopTo(tower23);
        tower5.moveDisks((int) (byte) -1, tower9, tower23);
        int int31 = tower5.index();
        Tower tower33 = new Tower(0);
        tower33.add((-1));
        tower33.add((int) (byte) 1);
        Tower tower39 = new Tower((int) (byte) 0);
        tower33.moveTopTo(tower39);
        tower5.moveTopTo(tower33);
        Tower tower43 = new Tower((-1));
        java.lang.Class<?> wildcardClass44 = tower43.getClass();
        tower43.add((int) (byte) 1);
        Tower tower48 = new Tower((-1));
        int int49 = tower48.index();
        tower43.moveTopTo(tower48);
        tower48.add(10);
        Tower tower55 = new Tower(0);
        tower55.add((-1));
        java.lang.Class<?> wildcardClass58 = tower55.getClass();
        Tower tower60 = new Tower((-1));
        java.lang.Class<?> wildcardClass61 = tower60.getClass();
        tower60.add(0);
        tower55.moveTopTo(tower60);
        Tower tower66 = new Tower((-1));
        int int67 = tower66.index();
        tower48.moveDisks(0, tower60, tower66);
        tower60.add((int) (byte) 100);
        tower33.moveTopTo(tower60);
        java.lang.Class<?> wildcardClass72 = tower33.getClass();
        java.lang.Class<?> wildcardClass73 = tower33.getClass();
        tower33.add(0);
        tower33.add((int) (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test047");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        tower1.add((int) (short) 1);
        tower1.add(0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test048");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        Tower tower11 = new Tower((-1));
        java.lang.Class<?> wildcardClass12 = tower11.getClass();
        tower11.add((int) (byte) 1);
        tower11.add(0);
        Tower tower18 = new Tower(0);
        tower11.moveTopTo(tower18);
        Tower tower21 = new Tower(1);
        tower6.moveDisks(1, tower18, tower21);
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add((int) (byte) 1);
        Tower tower30 = new Tower((-1));
        int int31 = tower30.index();
        tower25.moveTopTo(tower30);
        tower30.add(10);
        Tower tower37 = new Tower(0);
        tower37.add((-1));
        java.lang.Class<?> wildcardClass40 = tower37.getClass();
        Tower tower42 = new Tower((-1));
        java.lang.Class<?> wildcardClass43 = tower42.getClass();
        tower42.add(0);
        tower37.moveTopTo(tower42);
        Tower tower48 = new Tower((-1));
        int int49 = tower48.index();
        tower30.moveDisks(0, tower42, tower48);
        int int51 = tower30.index();
        Tower tower53 = new Tower(0);
        tower53.add((-1));
        Tower tower58 = new Tower((-1));
        Tower tower60 = new Tower((-1));
        java.lang.Class<?> wildcardClass61 = tower60.getClass();
        tower60.add((int) (byte) 1);
        tower53.moveDisks((int) (byte) -1, tower58, tower60);
        Tower tower66 = new Tower(0);
        int int67 = tower66.index();
        tower60.moveTopTo(tower66);
        tower6.moveDisks((int) (short) -1, tower30, tower60);
        java.lang.Class<?> wildcardClass70 = tower6.getClass();
        int int71 = tower6.index();
        java.lang.Class<?> wildcardClass72 = tower6.getClass();
        tower6.add((int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test049");
        Tower tower1 = new Tower((-1));
        tower1.add(0);
        int int4 = tower1.index();
        Tower tower6 = new Tower(0);
        tower6.add((-1));
        tower6.add((int) (byte) 1);
        Tower tower13 = new Tower((-1));
        java.lang.Class<?> wildcardClass14 = tower13.getClass();
        tower13.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = tower13.getClass();
        Tower tower19 = new Tower(0);
        tower19.add((-1));
        tower19.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = tower19.getClass();
        Tower tower26 = new Tower((-1));
        tower26.add(0);
        tower19.moveTopTo(tower26);
        tower6.moveDisks((int) (short) 1, tower13, tower26);
        int int31 = tower26.index();
        int int32 = tower26.index();
        tower1.moveTopTo(tower26);
        Tower tower35 = new Tower(0);
        tower35.add((-1));
        java.lang.Class<?> wildcardClass38 = tower35.getClass();
        Tower tower40 = new Tower((-1));
        java.lang.Class<?> wildcardClass41 = tower40.getClass();
        tower40.add(0);
        tower35.moveTopTo(tower40);
        tower40.add(0);
        Tower tower49 = new Tower((-1));
        java.lang.Class<?> wildcardClass50 = tower49.getClass();
        tower49.add((int) (byte) 1);
        tower49.add(0);
        Tower tower56 = new Tower((-1));
        java.lang.Class<?> wildcardClass57 = tower56.getClass();
        tower56.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass60 = tower56.getClass();
        tower40.moveDisks((int) (short) 0, tower49, tower56);
        int int62 = tower49.index();
        Tower tower64 = new Tower((int) (byte) -1);
        tower49.moveTopTo(tower64);
        int int66 = tower64.index();
        int int67 = tower64.index();
        tower64.add((int) (byte) 100);
        tower64.add((int) (short) 100);
        java.lang.Class<?> wildcardClass72 = tower64.getClass();
        tower26.moveTopTo(tower64);
        int int74 = tower64.index();
        int int75 = tower64.index();
        int int76 = tower64.index();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test050");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        tower1.add((int) (byte) 1);
        Tower tower10 = new Tower(0);
        tower10.add((-1));
        java.lang.Class<?> wildcardClass13 = tower10.getClass();
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add(0);
        tower10.moveTopTo(tower15);
        Tower tower21 = new Tower(0);
        tower21.add((-1));
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add((int) (byte) 1);
        tower21.moveTopTo(tower25);
        tower1.moveDisks((int) (short) 1, tower15, tower21);
        java.lang.Class<?> wildcardClass31 = tower15.getClass();
        java.lang.Class<?> wildcardClass32 = tower15.getClass();
        java.lang.Class<?> wildcardClass33 = tower15.getClass();
        int int34 = tower15.index();
        tower15.add(0);
        Tower tower38 = new Tower(0);
        tower38.add((-1));
        tower38.add((int) (byte) 1);
        tower15.moveTopTo(tower38);
        Tower tower45 = new Tower((-1));
        java.lang.Class<?> wildcardClass46 = tower45.getClass();
        tower45.add((int) (byte) 1);
        Tower tower50 = new Tower((-1));
        int int51 = tower50.index();
        tower45.moveTopTo(tower50);
        tower50.add(10);
        Tower tower57 = new Tower(0);
        tower57.add((-1));
        java.lang.Class<?> wildcardClass60 = tower57.getClass();
        Tower tower62 = new Tower((-1));
        java.lang.Class<?> wildcardClass63 = tower62.getClass();
        tower62.add(0);
        tower57.moveTopTo(tower62);
        Tower tower68 = new Tower((-1));
        int int69 = tower68.index();
        tower50.moveDisks(0, tower62, tower68);
        tower68.add((int) (short) 100);
        java.lang.Class<?> wildcardClass73 = tower68.getClass();
        tower68.add(32);
        int int76 = tower68.index();
        tower38.moveTopTo(tower68);
        java.lang.Class<?> wildcardClass78 = tower68.getClass();
        Tower tower79 = null;
        try {
            tower68.moveTopTo(tower79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test051");
        Tower tower1 = new Tower(0);
        int int2 = tower1.index();
        tower1.add((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test052");
        Tower tower1 = new Tower((int) (byte) -1);
        int int2 = tower1.index();
        tower1.add((int) (byte) 100);
        Tower tower6 = new Tower(0);
        tower6.add((-1));
        Tower tower11 = new Tower((-1));
        Tower tower13 = new Tower((-1));
        java.lang.Class<?> wildcardClass14 = tower13.getClass();
        tower13.add((int) (byte) 1);
        tower6.moveDisks((int) (byte) -1, tower11, tower13);
        java.lang.Class<?> wildcardClass18 = tower6.getClass();
        tower1.moveTopTo(tower6);
        tower6.add(0);
        int int22 = tower6.index();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test053");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower6.add(0);
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add((int) (byte) 1);
        tower15.add(0);
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = tower22.getClass();
        tower6.moveDisks((int) (short) 0, tower15, tower22);
        int int28 = tower15.index();
        Tower tower30 = new Tower((int) (byte) -1);
        tower15.moveTopTo(tower30);
        int int32 = tower30.index();
        java.lang.Class<?> wildcardClass33 = tower30.getClass();
        Tower tower35 = new Tower(0);
        tower35.add((-1));
        Tower tower39 = new Tower(0);
        tower35.moveTopTo(tower39);
        Tower tower43 = new Tower(0);
        tower43.add((-1));
        Tower tower47 = new Tower((-1));
        java.lang.Class<?> wildcardClass48 = tower47.getClass();
        tower47.add((int) (byte) 1);
        tower47.add(0);
        Tower tower54 = new Tower(0);
        tower47.moveTopTo(tower54);
        Tower tower57 = new Tower((-1));
        java.lang.Class<?> wildcardClass58 = tower57.getClass();
        tower57.add((int) (byte) 1);
        tower57.add(0);
        tower47.moveTopTo(tower57);
        tower39.moveDisks((int) (byte) -1, tower43, tower57);
        int int65 = tower39.index();
        tower39.add((int) (byte) 100);
        tower30.moveTopTo(tower39);
        Tower tower70 = new Tower(0);
        tower70.add((-1));
        tower70.add((int) (byte) 1);
        Tower tower76 = new Tower((int) (byte) 0);
        tower70.moveTopTo(tower76);
        java.lang.Class<?> wildcardClass78 = tower70.getClass();
        int int79 = tower70.index();
        tower70.add((int) (byte) 10);
        try {
            tower30.moveTopTo(tower70);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test054");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        Tower tower8 = new Tower((-1));
        java.lang.Class<?> wildcardClass9 = tower8.getClass();
        tower8.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = tower8.getClass();
        Tower tower14 = new Tower(0);
        tower14.add((-1));
        tower14.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = tower14.getClass();
        Tower tower21 = new Tower((-1));
        tower21.add(0);
        tower14.moveTopTo(tower21);
        tower1.moveDisks((int) (short) 1, tower8, tower21);
        java.lang.Class<?> wildcardClass26 = tower21.getClass();
        tower21.add((int) (byte) 1);
        int int29 = tower21.index();
        Tower tower31 = new Tower((-1));
        java.lang.Class<?> wildcardClass32 = tower31.getClass();
        tower31.add((int) (byte) 1);
        tower31.add(0);
        Tower tower38 = new Tower(0);
        tower31.moveTopTo(tower38);
        Tower tower41 = new Tower((-1));
        java.lang.Class<?> wildcardClass42 = tower41.getClass();
        tower41.add((int) (byte) 1);
        tower41.add(0);
        Tower tower48 = new Tower(0);
        tower41.moveTopTo(tower48);
        int int50 = tower41.index();
        java.lang.Class<?> wildcardClass51 = tower41.getClass();
        java.lang.Class<?> wildcardClass52 = tower41.getClass();
        Tower tower54 = new Tower((-1));
        java.lang.Class<?> wildcardClass55 = tower54.getClass();
        tower54.add((int) (byte) 1);
        tower54.add(0);
        Tower tower61 = new Tower(0);
        tower54.moveTopTo(tower61);
        Tower tower64 = new Tower((-1));
        java.lang.Class<?> wildcardClass65 = tower64.getClass();
        tower64.add((int) (byte) 1);
        tower64.add(0);
        tower54.moveTopTo(tower64);
        java.lang.Class<?> wildcardClass71 = tower54.getClass();
        tower41.moveTopTo(tower54);
        tower31.moveTopTo(tower41);
        tower31.add((int) 'a');
        tower21.moveTopTo(tower31);
        java.lang.Class<?> wildcardClass77 = tower31.getClass();
        int int78 = tower31.index();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test055");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower1.add((int) 'a');
        java.lang.Class<?> wildcardClass13 = tower1.getClass();
        java.lang.Class<?> wildcardClass14 = tower1.getClass();
        int int15 = tower1.index();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test056");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower5 = new Tower(0);
        tower1.moveTopTo(tower5);
        Tower tower8 = new Tower((-1));
        java.lang.Class<?> wildcardClass9 = tower8.getClass();
        tower8.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = tower8.getClass();
        java.lang.Class<?> wildcardClass13 = tower8.getClass();
        Tower tower15 = new Tower(0);
        tower15.add((-1));
        tower15.add((int) (byte) 1);
        Tower tower21 = new Tower((int) (byte) 0);
        tower15.moveTopTo(tower21);
        Tower tower25 = new Tower(0);
        tower25.add((-1));
        java.lang.Class<?> wildcardClass28 = tower25.getClass();
        Tower tower30 = new Tower((-1));
        java.lang.Class<?> wildcardClass31 = tower30.getClass();
        tower30.add(0);
        tower25.moveTopTo(tower30);
        tower25.add((int) 'a');
        Tower tower38 = new Tower(0);
        tower38.add((-1));
        Tower tower43 = new Tower((-1));
        Tower tower45 = new Tower((-1));
        java.lang.Class<?> wildcardClass46 = tower45.getClass();
        tower45.add((int) (byte) 1);
        tower38.moveDisks((int) (byte) -1, tower43, tower45);
        Tower tower51 = new Tower(0);
        tower51.add((-1));
        Tower tower56 = new Tower((-1));
        Tower tower58 = new Tower((-1));
        java.lang.Class<?> wildcardClass59 = tower58.getClass();
        tower58.add((int) (byte) 1);
        tower51.moveDisks((int) (byte) -1, tower56, tower58);
        Tower tower64 = new Tower(0);
        int int65 = tower64.index();
        tower58.moveTopTo(tower64);
        tower38.moveTopTo(tower58);
        tower15.moveDisks((int) (byte) -1, tower25, tower38);
        tower8.moveTopTo(tower25);
        tower5.moveTopTo(tower8);
        java.lang.Class<?> wildcardClass71 = tower5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test057");
        Tower tower1 = new Tower((-1));
        int int2 = tower1.index();
        int int3 = tower1.index();
        Tower tower5 = new Tower(0);
        tower5.add((-1));
        Tower tower10 = new Tower((-1));
        Tower tower12 = new Tower((-1));
        java.lang.Class<?> wildcardClass13 = tower12.getClass();
        tower12.add((int) (byte) 1);
        tower5.moveDisks((int) (byte) -1, tower10, tower12);
        int int17 = tower10.index();
        tower10.add((int) (short) 0);
        try {
            tower1.moveTopTo(tower10);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test058");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        tower6.add(10);
        Tower tower13 = new Tower(0);
        tower13.add((-1));
        Tower tower17 = new Tower((-1));
        java.lang.Class<?> wildcardClass18 = tower17.getClass();
        tower17.add((int) (byte) 1);
        tower13.moveTopTo(tower17);
        Tower tower23 = new Tower((-1));
        java.lang.Class<?> wildcardClass24 = tower23.getClass();
        tower23.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = tower23.getClass();
        tower6.moveDisks((int) (short) 0, tower13, tower23);
        int int29 = tower13.index();
        tower13.add(10);
        int int32 = tower13.index();
        int int33 = tower13.index();
        int int34 = tower13.index();
        Tower tower36 = new Tower((-1));
        java.lang.Class<?> wildcardClass37 = tower36.getClass();
        tower36.add(0);
        Tower tower42 = new Tower((-1));
        java.lang.Class<?> wildcardClass43 = tower42.getClass();
        tower42.add((int) (byte) 1);
        tower42.add(0);
        Tower tower49 = new Tower(0);
        tower42.moveTopTo(tower49);
        Tower tower52 = new Tower((-1));
        java.lang.Class<?> wildcardClass53 = tower52.getClass();
        tower52.add((int) (byte) 1);
        tower52.add(0);
        tower42.moveTopTo(tower52);
        tower42.add((int) '4');
        int int61 = tower42.index();
        Tower tower63 = new Tower(0);
        tower63.add((-1));
        tower63.add((int) (byte) 1);
        Tower tower70 = new Tower((-1));
        java.lang.Class<?> wildcardClass71 = tower70.getClass();
        tower70.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass74 = tower70.getClass();
        Tower tower76 = new Tower(0);
        tower76.add((-1));
        tower76.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass81 = tower76.getClass();
        Tower tower83 = new Tower((-1));
        tower83.add(0);
        tower76.moveTopTo(tower83);
        tower63.moveDisks((int) (short) 1, tower70, tower83);
        java.lang.Class<?> wildcardClass88 = tower83.getClass();
        tower36.moveDisks((int) (short) -1, tower42, tower83);
        java.lang.Class<?> wildcardClass90 = tower42.getClass();
        tower42.add((int) (byte) 1);
        tower13.moveTopTo(tower42);
        tower42.add((int) (short) 1);
        int int96 = tower42.index();
        Tower tower97 = null;
        try {
            tower42.moveTopTo(tower97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test059");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        tower1.add((int) (byte) 1);
        Tower tower10 = new Tower(0);
        tower10.add((-1));
        java.lang.Class<?> wildcardClass13 = tower10.getClass();
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add(0);
        tower10.moveTopTo(tower15);
        Tower tower21 = new Tower(0);
        tower21.add((-1));
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add((int) (byte) 1);
        tower21.moveTopTo(tower25);
        tower1.moveDisks((int) (short) 1, tower15, tower21);
        java.lang.Class<?> wildcardClass31 = tower15.getClass();
        Tower tower33 = new Tower((-1));
        java.lang.Class<?> wildcardClass34 = tower33.getClass();
        tower33.add((int) (byte) 1);
        Tower tower38 = new Tower((-1));
        int int39 = tower38.index();
        tower33.moveTopTo(tower38);
        tower38.add(10);
        Tower tower45 = new Tower(0);
        tower45.add((-1));
        java.lang.Class<?> wildcardClass48 = tower45.getClass();
        Tower tower50 = new Tower((-1));
        java.lang.Class<?> wildcardClass51 = tower50.getClass();
        tower50.add(0);
        tower45.moveTopTo(tower50);
        Tower tower56 = new Tower((-1));
        int int57 = tower56.index();
        tower38.moveDisks(0, tower50, tower56);
        tower15.moveTopTo(tower50);
        Tower tower61 = new Tower(0);
        int int62 = tower61.index();
        tower50.moveTopTo(tower61);
        Tower tower65 = new Tower(0);
        tower65.add((-1));
        tower65.add((int) (short) 0);
        tower50.moveTopTo(tower65);
        int int71 = tower65.index();
        java.lang.Class<?> wildcardClass72 = tower65.getClass();
        java.lang.Class<?> wildcardClass73 = tower65.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test060");
        Tower tower1 = new Tower((int) (short) 10);
        int int2 = tower1.index();
        java.lang.Class<?> wildcardClass3 = tower1.getClass();
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        tower1.add((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test061");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower5 = new Tower(0);
        tower1.moveTopTo(tower5);
        Tower tower9 = new Tower(0);
        tower9.add((-1));
        Tower tower13 = new Tower((-1));
        java.lang.Class<?> wildcardClass14 = tower13.getClass();
        tower13.add((int) (byte) 1);
        tower13.add(0);
        Tower tower20 = new Tower(0);
        tower13.moveTopTo(tower20);
        Tower tower23 = new Tower((-1));
        java.lang.Class<?> wildcardClass24 = tower23.getClass();
        tower23.add((int) (byte) 1);
        tower23.add(0);
        tower13.moveTopTo(tower23);
        tower5.moveDisks((int) (byte) -1, tower9, tower23);
        int int31 = tower5.index();
        tower5.add((int) (byte) 100);
        java.lang.Class<?> wildcardClass34 = tower5.getClass();
        int int35 = tower5.index();
        tower5.add((int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test062");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        tower1.add(0);
        tower1.add(0);
        java.lang.Class<?> wildcardClass9 = tower1.getClass();
        int int10 = tower1.index();
        tower1.add(100);
        tower1.add(10);
        java.lang.Class<?> wildcardClass15 = tower1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test063");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        tower1.add(0);
        int int7 = tower1.index();
        Tower tower10 = new Tower(0);
        tower10.add((-1));
        tower10.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = tower10.getClass();
        Tower tower17 = new Tower((-1));
        tower17.add(0);
        tower10.moveTopTo(tower17);
        Tower tower22 = new Tower(0);
        tower22.add((-1));
        Tower tower27 = new Tower((-1));
        Tower tower29 = new Tower((-1));
        java.lang.Class<?> wildcardClass30 = tower29.getClass();
        tower29.add((int) (byte) 1);
        tower22.moveDisks((int) (byte) -1, tower27, tower29);
        Tower tower35 = new Tower(0);
        int int36 = tower35.index();
        tower29.moveTopTo(tower35);
        tower1.moveDisks((int) (short) 1, tower10, tower29);
        Tower tower41 = new Tower((-1));
        java.lang.Class<?> wildcardClass42 = tower41.getClass();
        tower41.add((int) (byte) 1);
        tower41.add(0);
        Tower tower48 = new Tower(0);
        tower41.moveTopTo(tower48);
        Tower tower51 = new Tower((-1));
        java.lang.Class<?> wildcardClass52 = tower51.getClass();
        tower51.add((int) (byte) 1);
        tower51.add(0);
        tower41.moveTopTo(tower51);
        tower41.add((int) '4');
        Tower tower61 = new Tower(0);
        tower61.add((-1));
        tower61.add((int) (byte) 1);
        tower61.add((int) (byte) 1);
        Tower tower70 = new Tower(0);
        tower70.add((-1));
        java.lang.Class<?> wildcardClass73 = tower70.getClass();
        Tower tower75 = new Tower((-1));
        java.lang.Class<?> wildcardClass76 = tower75.getClass();
        tower75.add(0);
        tower70.moveTopTo(tower75);
        Tower tower81 = new Tower(0);
        tower81.add((-1));
        Tower tower85 = new Tower((-1));
        java.lang.Class<?> wildcardClass86 = tower85.getClass();
        tower85.add((int) (byte) 1);
        tower81.moveTopTo(tower85);
        tower61.moveDisks((int) (short) 1, tower75, tower81);
        tower1.moveDisks((int) (byte) 1, tower41, tower81);
        int int92 = tower1.index();
        java.lang.Class<?> wildcardClass93 = tower1.getClass();
        int int94 = tower1.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test064");
        Tower tower1 = new Tower((-1));
        tower1.add(0);
        int int4 = tower1.index();
        Tower tower6 = new Tower(0);
        tower6.add((-1));
        tower6.add((int) (byte) 1);
        Tower tower13 = new Tower((-1));
        java.lang.Class<?> wildcardClass14 = tower13.getClass();
        tower13.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = tower13.getClass();
        Tower tower19 = new Tower(0);
        tower19.add((-1));
        tower19.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = tower19.getClass();
        Tower tower26 = new Tower((-1));
        tower26.add(0);
        tower19.moveTopTo(tower26);
        tower6.moveDisks((int) (short) 1, tower13, tower26);
        int int31 = tower26.index();
        int int32 = tower26.index();
        tower1.moveTopTo(tower26);
        tower1.add((int) (byte) 1);
        int int36 = tower1.index();
        java.lang.Class<?> wildcardClass37 = tower1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test065");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        tower6.add((int) '#');
        java.lang.Class<?> wildcardClass11 = tower6.getClass();
        java.lang.Class<?> wildcardClass12 = tower6.getClass();
        tower6.add((int) ' ');
        tower6.add(0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test066");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower5 = new Tower(0);
        tower1.moveTopTo(tower5);
        Tower tower9 = new Tower(0);
        tower9.add((-1));
        Tower tower13 = new Tower((-1));
        java.lang.Class<?> wildcardClass14 = tower13.getClass();
        tower13.add((int) (byte) 1);
        tower13.add(0);
        Tower tower20 = new Tower(0);
        tower13.moveTopTo(tower20);
        Tower tower23 = new Tower((-1));
        java.lang.Class<?> wildcardClass24 = tower23.getClass();
        tower23.add((int) (byte) 1);
        tower23.add(0);
        tower13.moveTopTo(tower23);
        tower5.moveDisks((int) (byte) -1, tower9, tower23);
        java.lang.Class<?> wildcardClass31 = tower5.getClass();
        java.lang.Class<?> wildcardClass32 = tower5.getClass();
        tower5.add((int) ' ');
        tower5.add((int) (short) -1);
        Tower tower38 = new Tower((-1));
        java.lang.Class<?> wildcardClass39 = tower38.getClass();
        tower38.add((int) (byte) 1);
        Tower tower43 = new Tower((-1));
        int int44 = tower43.index();
        tower38.moveTopTo(tower43);
        tower43.add(10);
        Tower tower50 = new Tower(0);
        tower50.add((-1));
        Tower tower54 = new Tower((-1));
        java.lang.Class<?> wildcardClass55 = tower54.getClass();
        tower54.add((int) (byte) 1);
        tower50.moveTopTo(tower54);
        Tower tower60 = new Tower((-1));
        java.lang.Class<?> wildcardClass61 = tower60.getClass();
        tower60.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass64 = tower60.getClass();
        tower43.moveDisks((int) (short) 0, tower50, tower60);
        tower43.add(10);
        Tower tower70 = new Tower((-1));
        java.lang.Class<?> wildcardClass71 = tower70.getClass();
        tower70.add((int) (byte) 1);
        Tower tower75 = new Tower((-1));
        int int76 = tower75.index();
        tower70.moveTopTo(tower75);
        tower75.add(10);
        tower75.add(0);
        Tower tower83 = new Tower(0);
        tower83.add((-1));
        java.lang.Class<?> wildcardClass86 = tower83.getClass();
        int int87 = tower83.index();
        tower43.moveDisks((int) (byte) 0, tower75, tower83);
        tower5.moveTopTo(tower43);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test067");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        tower1.add((int) (byte) 1);
        Tower tower10 = new Tower(0);
        tower10.add((-1));
        java.lang.Class<?> wildcardClass13 = tower10.getClass();
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add(0);
        tower10.moveTopTo(tower15);
        Tower tower21 = new Tower(0);
        tower21.add((-1));
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add((int) (byte) 1);
        tower21.moveTopTo(tower25);
        tower1.moveDisks((int) (short) 1, tower15, tower21);
        java.lang.Class<?> wildcardClass31 = tower15.getClass();
        Tower tower33 = new Tower((-1));
        java.lang.Class<?> wildcardClass34 = tower33.getClass();
        tower33.add((int) (byte) 1);
        Tower tower38 = new Tower((-1));
        int int39 = tower38.index();
        tower33.moveTopTo(tower38);
        tower38.add(10);
        Tower tower45 = new Tower(0);
        tower45.add((-1));
        java.lang.Class<?> wildcardClass48 = tower45.getClass();
        Tower tower50 = new Tower((-1));
        java.lang.Class<?> wildcardClass51 = tower50.getClass();
        tower50.add(0);
        tower45.moveTopTo(tower50);
        Tower tower56 = new Tower((-1));
        int int57 = tower56.index();
        tower38.moveDisks(0, tower50, tower56);
        tower15.moveTopTo(tower50);
        Tower tower61 = new Tower(0);
        int int62 = tower61.index();
        tower50.moveTopTo(tower61);
        Tower tower65 = new Tower(0);
        tower65.add((-1));
        tower65.add((int) (short) 0);
        tower50.moveTopTo(tower65);
        int int71 = tower65.index();
        java.lang.Class<?> wildcardClass72 = tower65.getClass();
        int int73 = tower65.index();
        tower65.add((int) (byte) 0);
        Tower tower76 = null;
        try {
            tower65.moveTopTo(tower76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test068");
        Tower tower1 = new Tower(97);
        tower1.add((int) (byte) 0);
        Tower tower5 = new Tower((-1));
        java.lang.Class<?> wildcardClass6 = tower5.getClass();
        tower5.add((int) (byte) 1);
        tower5.add(0);
        int int11 = tower5.index();
        Tower tower14 = new Tower(0);
        tower14.add((-1));
        tower14.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = tower14.getClass();
        Tower tower21 = new Tower((-1));
        tower21.add(0);
        tower14.moveTopTo(tower21);
        Tower tower26 = new Tower(0);
        tower26.add((-1));
        Tower tower31 = new Tower((-1));
        Tower tower33 = new Tower((-1));
        java.lang.Class<?> wildcardClass34 = tower33.getClass();
        tower33.add((int) (byte) 1);
        tower26.moveDisks((int) (byte) -1, tower31, tower33);
        Tower tower39 = new Tower(0);
        int int40 = tower39.index();
        tower33.moveTopTo(tower39);
        tower5.moveDisks((int) (short) 1, tower14, tower33);
        tower1.moveTopTo(tower5);
        tower1.add((int) (byte) 100);
        Tower tower47 = new Tower(0);
        tower47.add((-1));
        java.lang.Class<?> wildcardClass50 = tower47.getClass();
        tower47.add((int) '4');
        java.lang.Class<?> wildcardClass53 = tower47.getClass();
        java.lang.Class<?> wildcardClass54 = tower47.getClass();
        java.lang.Class<?> wildcardClass55 = tower47.getClass();
        Tower tower58 = new Tower((-1));
        java.lang.Class<?> wildcardClass59 = tower58.getClass();
        tower58.add((int) (byte) 1);
        Tower tower63 = new Tower((-1));
        int int64 = tower63.index();
        tower58.moveTopTo(tower63);
        tower63.add(10);
        Tower tower70 = new Tower(0);
        tower70.add((-1));
        Tower tower74 = new Tower((-1));
        java.lang.Class<?> wildcardClass75 = tower74.getClass();
        tower74.add((int) (byte) 1);
        tower70.moveTopTo(tower74);
        Tower tower80 = new Tower((-1));
        java.lang.Class<?> wildcardClass81 = tower80.getClass();
        tower80.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass84 = tower80.getClass();
        tower63.moveDisks((int) (short) 0, tower70, tower80);
        tower63.add(10);
        Tower tower89 = new Tower(97);
        tower89.add((int) (byte) 0);
        tower89.add((int) (byte) 100);
        tower47.moveDisks((int) (short) -1, tower63, tower89);
        tower1.moveTopTo(tower47);
        java.lang.Class<?> wildcardClass96 = tower1.getClass();
        java.lang.Class<?> wildcardClass97 = tower1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(wildcardClass96);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test069");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        tower1.add((int) (byte) 1);
        Tower tower9 = new Tower((int) (byte) 0);
        tower9.add((-1));
        tower1.moveTopTo(tower9);
        tower9.add((int) (byte) 100);
        tower9.add(1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test070");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        int int5 = tower1.index();
        Tower tower7 = new Tower(0);
        tower7.add((-1));
        java.lang.Class<?> wildcardClass10 = tower7.getClass();
        int int11 = tower7.index();
        Tower tower13 = new Tower((-1));
        java.lang.Class<?> wildcardClass14 = tower13.getClass();
        tower13.add((int) (byte) 1);
        tower13.add(0);
        int int19 = tower13.index();
        java.lang.Class<?> wildcardClass20 = tower13.getClass();
        java.lang.Class<?> wildcardClass21 = tower13.getClass();
        tower7.moveTopTo(tower13);
        tower1.moveTopTo(tower7);
        tower1.add((int) (short) 0);
        tower1.add((-1));
        Tower tower29 = new Tower((int) 'a');
        tower29.add((int) (byte) 1);
        tower1.moveTopTo(tower29);
        tower1.add((int) ' ');
        Tower tower36 = new Tower(0);
        tower36.add((-1));
        java.lang.Class<?> wildcardClass39 = tower36.getClass();
        Tower tower41 = new Tower((-1));
        java.lang.Class<?> wildcardClass42 = tower41.getClass();
        tower41.add(0);
        tower36.moveTopTo(tower41);
        tower41.add(0);
        Tower tower50 = new Tower((-1));
        java.lang.Class<?> wildcardClass51 = tower50.getClass();
        tower50.add((int) (byte) 1);
        tower50.add(0);
        Tower tower57 = new Tower((-1));
        java.lang.Class<?> wildcardClass58 = tower57.getClass();
        tower57.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass61 = tower57.getClass();
        tower41.moveDisks((int) (short) 0, tower50, tower57);
        Tower tower64 = new Tower(100);
        tower41.moveTopTo(tower64);
        Tower tower67 = new Tower(0);
        tower67.add((-1));
        java.lang.Class<?> wildcardClass70 = tower67.getClass();
        Tower tower72 = new Tower((-1));
        java.lang.Class<?> wildcardClass73 = tower72.getClass();
        tower72.add(0);
        tower67.moveTopTo(tower72);
        tower72.add(0);
        Tower tower81 = new Tower((-1));
        java.lang.Class<?> wildcardClass82 = tower81.getClass();
        tower81.add((int) (byte) 1);
        tower81.add(0);
        Tower tower88 = new Tower((-1));
        java.lang.Class<?> wildcardClass89 = tower88.getClass();
        tower88.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass92 = tower88.getClass();
        tower72.moveDisks((int) (short) 0, tower81, tower88);
        int int94 = tower81.index();
        tower41.moveTopTo(tower81);
        java.lang.Class<?> wildcardClass96 = tower41.getClass();
        tower1.moveTopTo(tower41);
        int int98 = tower1.index();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(wildcardClass92);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass96);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test071");
        Tower tower1 = new Tower((int) (byte) 0);
        tower1.add((-1));
        Tower tower5 = new Tower((-1));
        java.lang.Class<?> wildcardClass6 = tower5.getClass();
        tower5.add((int) (byte) 1);
        Tower tower10 = new Tower((-1));
        int int11 = tower10.index();
        tower5.moveTopTo(tower10);
        tower10.add(10);
        tower1.moveTopTo(tower10);
        Tower tower17 = new Tower((-1));
        java.lang.Class<?> wildcardClass18 = tower17.getClass();
        tower17.add((int) (byte) 1);
        Tower tower22 = new Tower((-1));
        int int23 = tower22.index();
        tower17.moveTopTo(tower22);
        tower22.add((int) '#');
        java.lang.Class<?> wildcardClass27 = tower22.getClass();
        tower10.moveTopTo(tower22);
        Tower tower30 = new Tower(0);
        tower30.add((-1));
        tower30.add((int) (byte) 1);
        tower30.add((int) (byte) 1);
        Tower tower39 = new Tower(0);
        tower39.add((-1));
        java.lang.Class<?> wildcardClass42 = tower39.getClass();
        Tower tower44 = new Tower((-1));
        java.lang.Class<?> wildcardClass45 = tower44.getClass();
        tower44.add(0);
        tower39.moveTopTo(tower44);
        Tower tower50 = new Tower(0);
        tower50.add((-1));
        Tower tower54 = new Tower((-1));
        java.lang.Class<?> wildcardClass55 = tower54.getClass();
        tower54.add((int) (byte) 1);
        tower50.moveTopTo(tower54);
        tower30.moveDisks((int) (short) 1, tower44, tower50);
        tower10.moveTopTo(tower50);
        tower50.add((int) '4');
        Tower tower64 = new Tower(0);
        tower64.add((-1));
        Tower tower69 = new Tower((-1));
        Tower tower71 = new Tower((-1));
        java.lang.Class<?> wildcardClass72 = tower71.getClass();
        tower71.add((int) (byte) 1);
        tower64.moveDisks((int) (byte) -1, tower69, tower71);
        Tower tower77 = new Tower(0);
        int int78 = tower77.index();
        tower71.moveTopTo(tower77);
        int int80 = tower71.index();
        int int81 = tower71.index();
        tower71.add((int) (short) 10);
        tower50.moveTopTo(tower71);
        int int85 = tower71.index();
        tower71.add(0);
        Tower tower89 = new Tower((int) 'a');
        tower89.add((int) (byte) 1);
        int int92 = tower89.index();
        java.lang.Class<?> wildcardClass93 = tower89.getClass();
        tower71.moveTopTo(tower89);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 97 + "'", int92 == 97);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test072");
        Tower tower1 = new Tower(0);
        tower1.add((int) (byte) 10);
        Tower tower6 = new Tower((-1));
        Tower tower8 = new Tower(0);
        tower8.add((-1));
        tower8.add((int) (byte) 1);
        tower8.add((int) (byte) 1);
        Tower tower17 = new Tower(0);
        tower17.add((-1));
        java.lang.Class<?> wildcardClass20 = tower17.getClass();
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add(0);
        tower17.moveTopTo(tower22);
        Tower tower28 = new Tower(0);
        tower28.add((-1));
        Tower tower32 = new Tower((-1));
        java.lang.Class<?> wildcardClass33 = tower32.getClass();
        tower32.add((int) (byte) 1);
        tower28.moveTopTo(tower32);
        tower8.moveDisks((int) (short) 1, tower22, tower28);
        java.lang.Class<?> wildcardClass38 = tower22.getClass();
        java.lang.Class<?> wildcardClass39 = tower22.getClass();
        tower1.moveDisks((-1), tower6, tower22);
        int int41 = tower6.index();
        java.lang.Class<?> wildcardClass42 = tower6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test073");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower7 = new Tower(0);
        tower7.add((-1));
        Tower tower12 = new Tower((-1));
        Tower tower14 = new Tower((-1));
        java.lang.Class<?> wildcardClass15 = tower14.getClass();
        tower14.add((int) (byte) 1);
        tower7.moveDisks((int) (byte) -1, tower12, tower14);
        Tower tower20 = new Tower(0);
        int int21 = tower20.index();
        tower14.moveTopTo(tower20);
        Tower tower24 = new Tower(0);
        tower24.add((-1));
        java.lang.Class<?> wildcardClass27 = tower24.getClass();
        Tower tower29 = new Tower((-1));
        java.lang.Class<?> wildcardClass30 = tower29.getClass();
        tower29.add(0);
        tower24.moveTopTo(tower29);
        tower24.add((int) 'a');
        int int36 = tower24.index();
        tower1.moveDisks((int) (short) 0, tower14, tower24);
        int int38 = tower24.index();
        tower24.add((int) (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test074");
        Tower tower1 = new Tower((int) 'a');
        tower1.add((int) (byte) 1);
        Tower tower5 = new Tower(0);
        tower5.add((-1));
        Tower tower9 = new Tower((-1));
        java.lang.Class<?> wildcardClass10 = tower9.getClass();
        tower9.add((int) (byte) 1);
        tower5.moveTopTo(tower9);
        java.lang.Class<?> wildcardClass14 = tower9.getClass();
        int int15 = tower9.index();
        tower1.moveTopTo(tower9);
        Tower tower19 = new Tower(0);
        tower19.add((-1));
        java.lang.Class<?> wildcardClass22 = tower19.getClass();
        Tower tower24 = new Tower((-1));
        java.lang.Class<?> wildcardClass25 = tower24.getClass();
        tower24.add(0);
        tower19.moveTopTo(tower24);
        tower24.add(0);
        Tower tower33 = new Tower((-1));
        java.lang.Class<?> wildcardClass34 = tower33.getClass();
        tower33.add((int) (byte) 1);
        tower33.add(0);
        Tower tower40 = new Tower((-1));
        java.lang.Class<?> wildcardClass41 = tower40.getClass();
        tower40.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass44 = tower40.getClass();
        tower24.moveDisks((int) (short) 0, tower33, tower40);
        int int46 = tower33.index();
        Tower tower48 = new Tower((int) (byte) -1);
        tower33.moveTopTo(tower48);
        int int50 = tower48.index();
        int int51 = tower48.index();
        tower48.add((int) (byte) 100);
        int int54 = tower48.index();
        tower48.add(97);
        Tower tower58 = new Tower((int) (byte) 0);
        Tower tower61 = new Tower((-1));
        java.lang.Class<?> wildcardClass62 = tower61.getClass();
        tower61.add((int) (byte) 1);
        tower61.add(0);
        Tower tower68 = new Tower(0);
        tower61.moveTopTo(tower68);
        Tower tower71 = new Tower((-1));
        java.lang.Class<?> wildcardClass72 = tower71.getClass();
        tower71.add((int) (byte) 1);
        tower71.add(0);
        tower61.moveTopTo(tower71);
        java.lang.Class<?> wildcardClass78 = tower61.getClass();
        Tower tower80 = new Tower((-1));
        java.lang.Class<?> wildcardClass81 = tower80.getClass();
        tower80.add((int) (byte) 1);
        Tower tower85 = new Tower((-1));
        int int86 = tower85.index();
        tower80.moveTopTo(tower85);
        tower85.add((int) '#');
        tower58.moveDisks(0, tower61, tower85);
        java.lang.Class<?> wildcardClass91 = tower85.getClass();
        tower1.moveDisks(0, tower48, tower85);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test075");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower6.add(0);
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add((int) (byte) 1);
        tower15.add(0);
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = tower22.getClass();
        tower6.moveDisks((int) (short) 0, tower15, tower22);
        Tower tower29 = new Tower(100);
        tower6.moveTopTo(tower29);
        java.lang.Class<?> wildcardClass31 = tower6.getClass();
        Tower tower33 = new Tower(0);
        tower33.add((-1));
        Tower tower37 = new Tower(0);
        tower33.moveTopTo(tower37);
        Tower tower41 = new Tower(0);
        tower41.add((-1));
        Tower tower45 = new Tower((-1));
        java.lang.Class<?> wildcardClass46 = tower45.getClass();
        tower45.add((int) (byte) 1);
        tower45.add(0);
        Tower tower52 = new Tower(0);
        tower45.moveTopTo(tower52);
        Tower tower55 = new Tower((-1));
        java.lang.Class<?> wildcardClass56 = tower55.getClass();
        tower55.add((int) (byte) 1);
        tower55.add(0);
        tower45.moveTopTo(tower55);
        tower37.moveDisks((int) (byte) -1, tower41, tower55);
        java.lang.Class<?> wildcardClass63 = tower55.getClass();
        tower6.moveTopTo(tower55);
        Tower tower66 = new Tower((int) '#');
        int int67 = tower66.index();
        try {
            tower6.moveTopTo(tower66);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 35 + "'", int67 == 35);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test076");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower5 = new Tower(0);
        tower1.moveTopTo(tower5);
        int int7 = tower1.index();
        java.lang.Class<?> wildcardClass8 = tower1.getClass();
        tower1.add(10);
        tower1.add(35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test077");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        tower1.add(0);
        Tower tower8 = new Tower(0);
        tower1.moveTopTo(tower8);
        Tower tower11 = new Tower((-1));
        java.lang.Class<?> wildcardClass12 = tower11.getClass();
        tower11.add((int) (byte) 1);
        tower11.add(0);
        tower1.moveTopTo(tower11);
        tower1.add((int) '4');
        Tower tower21 = new Tower(0);
        tower21.add((-1));
        tower21.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = tower21.getClass();
        Tower tower28 = new Tower((-1));
        tower28.add(0);
        tower21.moveTopTo(tower28);
        tower1.moveTopTo(tower21);
        java.lang.Class<?> wildcardClass33 = tower21.getClass();
        int int34 = tower21.index();
        int int35 = tower21.index();
        Tower tower37 = new Tower(0);
        tower37.add((-1));
        java.lang.Class<?> wildcardClass40 = tower37.getClass();
        Tower tower42 = new Tower((-1));
        java.lang.Class<?> wildcardClass43 = tower42.getClass();
        tower42.add(0);
        tower37.moveTopTo(tower42);
        tower37.add((int) 'a');
        java.lang.Class<?> wildcardClass49 = tower37.getClass();
        tower21.moveTopTo(tower37);
        Tower tower52 = new Tower(97);
        tower52.add((int) (byte) 0);
        Tower tower56 = new Tower((-1));
        java.lang.Class<?> wildcardClass57 = tower56.getClass();
        tower56.add((int) (byte) 1);
        tower56.add(0);
        int int62 = tower56.index();
        Tower tower65 = new Tower(0);
        tower65.add((-1));
        tower65.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass70 = tower65.getClass();
        Tower tower72 = new Tower((-1));
        tower72.add(0);
        tower65.moveTopTo(tower72);
        Tower tower77 = new Tower(0);
        tower77.add((-1));
        Tower tower82 = new Tower((-1));
        Tower tower84 = new Tower((-1));
        java.lang.Class<?> wildcardClass85 = tower84.getClass();
        tower84.add((int) (byte) 1);
        tower77.moveDisks((int) (byte) -1, tower82, tower84);
        Tower tower90 = new Tower(0);
        int int91 = tower90.index();
        tower84.moveTopTo(tower90);
        tower56.moveDisks((int) (short) 1, tower65, tower84);
        tower52.moveTopTo(tower56);
        tower52.add((int) (byte) 100);
        tower37.moveTopTo(tower52);
        java.lang.Class<?> wildcardClass98 = tower37.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test078");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        tower1.add(0);
        Tower tower8 = new Tower(0);
        tower1.moveTopTo(tower8);
        Tower tower11 = new Tower((-1));
        java.lang.Class<?> wildcardClass12 = tower11.getClass();
        tower11.add((int) (byte) 1);
        tower11.add(0);
        tower1.moveTopTo(tower11);
        tower1.add((int) (byte) 1);
        tower1.add(0);
        tower1.add((int) (byte) 1);
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add((int) (byte) 1);
        Tower tower30 = new Tower((-1));
        int int31 = tower30.index();
        tower25.moveTopTo(tower30);
        tower30.add(10);
        Tower tower37 = new Tower(0);
        tower37.add((-1));
        Tower tower41 = new Tower((-1));
        java.lang.Class<?> wildcardClass42 = tower41.getClass();
        tower41.add((int) (byte) 1);
        tower37.moveTopTo(tower41);
        Tower tower47 = new Tower((-1));
        java.lang.Class<?> wildcardClass48 = tower47.getClass();
        tower47.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass51 = tower47.getClass();
        tower30.moveDisks((int) (short) 0, tower37, tower47);
        tower30.add((int) '#');
        Tower tower56 = new Tower((-1));
        java.lang.Class<?> wildcardClass57 = tower56.getClass();
        tower56.add((int) (byte) 1);
        Tower tower61 = new Tower((-1));
        int int62 = tower61.index();
        tower56.moveTopTo(tower61);
        tower61.add(10);
        Tower tower68 = new Tower(0);
        tower68.add((-1));
        Tower tower72 = new Tower((-1));
        java.lang.Class<?> wildcardClass73 = tower72.getClass();
        tower72.add((int) (byte) 1);
        tower68.moveTopTo(tower72);
        Tower tower78 = new Tower((-1));
        java.lang.Class<?> wildcardClass79 = tower78.getClass();
        tower78.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass82 = tower78.getClass();
        tower61.moveDisks((int) (short) 0, tower68, tower78);
        tower30.moveTopTo(tower68);
        tower30.add((int) (short) 0);
        int int87 = tower30.index();
        tower1.moveTopTo(tower30);
        java.lang.Class<?> wildcardClass89 = tower30.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test079");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        tower1.add((int) (byte) 1);
        Tower tower10 = new Tower(0);
        tower10.add((-1));
        java.lang.Class<?> wildcardClass13 = tower10.getClass();
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add(0);
        tower10.moveTopTo(tower15);
        Tower tower21 = new Tower(0);
        tower21.add((-1));
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add((int) (byte) 1);
        tower21.moveTopTo(tower25);
        tower1.moveDisks((int) (short) 1, tower15, tower21);
        java.lang.Class<?> wildcardClass31 = tower15.getClass();
        Tower tower33 = new Tower((-1));
        java.lang.Class<?> wildcardClass34 = tower33.getClass();
        tower33.add((int) (byte) 1);
        Tower tower38 = new Tower((-1));
        int int39 = tower38.index();
        tower33.moveTopTo(tower38);
        tower38.add(10);
        Tower tower45 = new Tower(0);
        tower45.add((-1));
        java.lang.Class<?> wildcardClass48 = tower45.getClass();
        Tower tower50 = new Tower((-1));
        java.lang.Class<?> wildcardClass51 = tower50.getClass();
        tower50.add(0);
        tower45.moveTopTo(tower50);
        Tower tower56 = new Tower((-1));
        int int57 = tower56.index();
        tower38.moveDisks(0, tower50, tower56);
        tower15.moveTopTo(tower50);
        tower15.add((int) '#');
        tower15.add(1);
        tower15.add((int) (short) 10);
        int int66 = tower15.index();
        int int67 = tower15.index();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test080");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = tower1.getClass();
        int int6 = tower1.index();
        tower1.add(100);
        java.lang.Class<?> wildcardClass9 = tower1.getClass();
        Tower tower11 = new Tower(0);
        int int12 = tower11.index();
        java.lang.Class<?> wildcardClass13 = tower11.getClass();
        tower11.add((int) 'a');
        Tower tower17 = new Tower((-1));
        java.lang.Class<?> wildcardClass18 = tower17.getClass();
        tower17.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = tower17.getClass();
        int int22 = tower17.index();
        int int23 = tower17.index();
        tower11.moveTopTo(tower17);
        tower1.moveTopTo(tower11);
        int int26 = tower11.index();
        int int27 = tower11.index();
        tower11.add((int) '4');
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test081");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        tower1.add(0);
        tower1.add(0);
        Tower tower10 = new Tower(0);
        tower10.add((int) 'a');
        Tower tower14 = new Tower(0);
        tower14.add((-1));
        java.lang.Class<?> wildcardClass17 = tower14.getClass();
        int int18 = tower14.index();
        Tower tower20 = new Tower(0);
        tower20.add((-1));
        java.lang.Class<?> wildcardClass23 = tower20.getClass();
        int int24 = tower20.index();
        Tower tower26 = new Tower((-1));
        java.lang.Class<?> wildcardClass27 = tower26.getClass();
        tower26.add((int) (byte) 1);
        tower26.add(0);
        int int32 = tower26.index();
        java.lang.Class<?> wildcardClass33 = tower26.getClass();
        java.lang.Class<?> wildcardClass34 = tower26.getClass();
        tower20.moveTopTo(tower26);
        tower14.moveTopTo(tower20);
        Tower tower38 = new Tower((-1));
        java.lang.Class<?> wildcardClass39 = tower38.getClass();
        tower38.add((int) (byte) 1);
        Tower tower43 = new Tower((-1));
        int int44 = tower43.index();
        tower38.moveTopTo(tower43);
        tower43.add(10);
        Tower tower50 = new Tower(0);
        tower50.add((-1));
        Tower tower54 = new Tower((-1));
        java.lang.Class<?> wildcardClass55 = tower54.getClass();
        tower54.add((int) (byte) 1);
        tower50.moveTopTo(tower54);
        Tower tower60 = new Tower((-1));
        java.lang.Class<?> wildcardClass61 = tower60.getClass();
        tower60.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass64 = tower60.getClass();
        tower43.moveDisks((int) (short) 0, tower50, tower60);
        int int66 = tower50.index();
        tower50.add(10);
        tower20.moveTopTo(tower50);
        Tower tower71 = new Tower((-1));
        java.lang.Class<?> wildcardClass72 = tower71.getClass();
        tower71.add((int) (byte) 1);
        tower71.add(0);
        Tower tower78 = new Tower(0);
        tower71.moveTopTo(tower78);
        Tower tower81 = new Tower((-1));
        java.lang.Class<?> wildcardClass82 = tower81.getClass();
        tower81.add((int) (byte) 1);
        tower81.add(0);
        tower71.moveTopTo(tower81);
        tower71.add((int) '4');
        int int90 = tower71.index();
        tower50.moveTopTo(tower71);
        tower10.moveTopTo(tower71);
        int int93 = tower71.index();
        tower71.add(100);
        int int96 = tower71.index();
        java.lang.Class<?> wildcardClass97 = tower71.getClass();
        tower1.moveTopTo(tower71);
        java.lang.Class<?> wildcardClass99 = tower1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass97);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test082");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        Tower tower11 = new Tower(0);
        tower11.add((-1));
        tower11.add((int) (byte) 1);
        tower11.add((int) (byte) 1);
        Tower tower20 = new Tower(0);
        tower20.add((-1));
        java.lang.Class<?> wildcardClass23 = tower20.getClass();
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add(0);
        tower20.moveTopTo(tower25);
        Tower tower31 = new Tower(0);
        tower31.add((-1));
        Tower tower35 = new Tower((-1));
        java.lang.Class<?> wildcardClass36 = tower35.getClass();
        tower35.add((int) (byte) 1);
        tower31.moveTopTo(tower35);
        tower11.moveDisks((int) (short) 1, tower25, tower31);
        java.lang.Class<?> wildcardClass41 = tower25.getClass();
        java.lang.Class<?> wildcardClass42 = tower25.getClass();
        Tower tower44 = new Tower((-1));
        int int45 = tower44.index();
        tower44.add(1);
        tower6.moveDisks(1, tower25, tower44);
        tower25.add((int) '4');
        tower25.add((int) (byte) 100);
        tower25.add((int) (byte) 0);
        tower25.add((int) (byte) 0);
        tower25.add((int) (byte) 1);
        tower25.add(100);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test083");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        Tower tower8 = new Tower((-1));
        java.lang.Class<?> wildcardClass9 = tower8.getClass();
        tower8.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = tower8.getClass();
        Tower tower14 = new Tower(0);
        tower14.add((-1));
        tower14.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = tower14.getClass();
        Tower tower21 = new Tower((-1));
        tower21.add(0);
        tower14.moveTopTo(tower21);
        tower1.moveDisks((int) (short) 1, tower8, tower21);
        tower21.add((int) (short) 10);
        int int28 = tower21.index();
        java.lang.Class<?> wildcardClass29 = tower21.getClass();
        Tower tower31 = new Tower((-1));
        java.lang.Class<?> wildcardClass32 = tower31.getClass();
        tower31.add((int) (byte) 1);
        tower31.add(0);
        tower31.add(0);
        Tower tower40 = new Tower((-1));
        java.lang.Class<?> wildcardClass41 = tower40.getClass();
        tower40.add((int) (byte) 1);
        tower40.add(0);
        int int46 = tower40.index();
        Tower tower49 = new Tower(0);
        tower49.add((-1));
        tower49.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass54 = tower49.getClass();
        Tower tower56 = new Tower((-1));
        tower56.add(0);
        tower49.moveTopTo(tower56);
        Tower tower61 = new Tower(0);
        tower61.add((-1));
        Tower tower66 = new Tower((-1));
        Tower tower68 = new Tower((-1));
        java.lang.Class<?> wildcardClass69 = tower68.getClass();
        tower68.add((int) (byte) 1);
        tower61.moveDisks((int) (byte) -1, tower66, tower68);
        Tower tower74 = new Tower(0);
        int int75 = tower74.index();
        tower68.moveTopTo(tower74);
        tower40.moveDisks((int) (short) 1, tower49, tower68);
        int int78 = tower49.index();
        tower49.add((int) (byte) 0);
        java.lang.Class<?> wildcardClass81 = tower49.getClass();
        tower31.moveTopTo(tower49);
        tower21.moveTopTo(tower49);
        Tower tower85 = new Tower(0);
        tower85.add((-1));
        Tower tower89 = new Tower(0);
        tower85.moveTopTo(tower89);
        java.lang.Class<?> wildcardClass91 = tower85.getClass();
        tower21.moveTopTo(tower85);
        java.lang.Class<?> wildcardClass93 = tower21.getClass();
        tower21.add(32);
        java.lang.Class<?> wildcardClass96 = tower21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test084");
        Tower tower1 = new Tower(97);
        tower1.add((int) (byte) 0);
        tower1.add((int) (byte) 100);
        tower1.add(1);
        java.lang.Class<?> wildcardClass8 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower13 = new Tower((-1));
        java.lang.Class<?> wildcardClass14 = tower13.getClass();
        tower13.add((int) (byte) 1);
        Tower tower18 = new Tower((-1));
        int int19 = tower18.index();
        tower13.moveTopTo(tower18);
        Tower tower22 = new Tower(0);
        tower22.add((-1));
        java.lang.Class<?> wildcardClass25 = tower22.getClass();
        Tower tower27 = new Tower((-1));
        java.lang.Class<?> wildcardClass28 = tower27.getClass();
        tower27.add(0);
        tower22.moveTopTo(tower27);
        tower27.add(0);
        Tower tower36 = new Tower((-1));
        java.lang.Class<?> wildcardClass37 = tower36.getClass();
        tower36.add((int) (byte) 1);
        tower36.add(0);
        Tower tower43 = new Tower((-1));
        java.lang.Class<?> wildcardClass44 = tower43.getClass();
        tower43.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass47 = tower43.getClass();
        tower27.moveDisks((int) (short) 0, tower36, tower43);
        int int49 = tower36.index();
        Tower tower51 = new Tower((int) (byte) -1);
        tower36.moveTopTo(tower51);
        int int53 = tower51.index();
        java.lang.Class<?> wildcardClass54 = tower51.getClass();
        Tower tower56 = new Tower(0);
        tower56.add((-1));
        Tower tower60 = new Tower(0);
        tower56.moveTopTo(tower60);
        Tower tower64 = new Tower(0);
        tower64.add((-1));
        Tower tower68 = new Tower((-1));
        java.lang.Class<?> wildcardClass69 = tower68.getClass();
        tower68.add((int) (byte) 1);
        tower68.add(0);
        Tower tower75 = new Tower(0);
        tower68.moveTopTo(tower75);
        Tower tower78 = new Tower((-1));
        java.lang.Class<?> wildcardClass79 = tower78.getClass();
        tower78.add((int) (byte) 1);
        tower78.add(0);
        tower68.moveTopTo(tower78);
        tower60.moveDisks((int) (byte) -1, tower64, tower78);
        int int86 = tower60.index();
        tower60.add((int) (byte) 100);
        tower51.moveTopTo(tower60);
        tower60.add((int) (short) 10);
        int int92 = tower60.index();
        tower1.moveDisks(0, tower13, tower60);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test085");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        tower6.add(10);
        Tower tower13 = new Tower(0);
        tower13.add((-1));
        java.lang.Class<?> wildcardClass16 = tower13.getClass();
        Tower tower18 = new Tower((-1));
        java.lang.Class<?> wildcardClass19 = tower18.getClass();
        tower18.add(0);
        tower13.moveTopTo(tower18);
        Tower tower24 = new Tower((-1));
        int int25 = tower24.index();
        tower6.moveDisks(0, tower18, tower24);
        int int27 = tower6.index();
        Tower tower30 = new Tower(0);
        tower30.add((-1));
        java.lang.Class<?> wildcardClass33 = tower30.getClass();
        int int34 = tower30.index();
        Tower tower36 = new Tower(0);
        tower36.add((-1));
        java.lang.Class<?> wildcardClass39 = tower36.getClass();
        int int40 = tower36.index();
        Tower tower42 = new Tower((-1));
        java.lang.Class<?> wildcardClass43 = tower42.getClass();
        tower42.add((int) (byte) 1);
        tower42.add(0);
        int int48 = tower42.index();
        java.lang.Class<?> wildcardClass49 = tower42.getClass();
        java.lang.Class<?> wildcardClass50 = tower42.getClass();
        tower36.moveTopTo(tower42);
        tower30.moveTopTo(tower36);
        tower30.add((int) (short) 0);
        Tower tower56 = new Tower((-1));
        java.lang.Class<?> wildcardClass57 = tower56.getClass();
        tower56.add((int) (byte) 1);
        tower56.add(0);
        int int62 = tower56.index();
        Tower tower65 = new Tower(0);
        tower65.add((-1));
        tower65.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass70 = tower65.getClass();
        Tower tower72 = new Tower((-1));
        tower72.add(0);
        tower65.moveTopTo(tower72);
        Tower tower77 = new Tower(0);
        tower77.add((-1));
        Tower tower82 = new Tower((-1));
        Tower tower84 = new Tower((-1));
        java.lang.Class<?> wildcardClass85 = tower84.getClass();
        tower84.add((int) (byte) 1);
        tower77.moveDisks((int) (byte) -1, tower82, tower84);
        Tower tower90 = new Tower(0);
        int int91 = tower90.index();
        tower84.moveTopTo(tower90);
        tower56.moveDisks((int) (short) 1, tower65, tower84);
        int int94 = tower65.index();
        tower6.moveDisks((int) (short) -1, tower30, tower65);
        int int96 = tower6.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test086");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower6 = new Tower((-1));
        Tower tower8 = new Tower((-1));
        java.lang.Class<?> wildcardClass9 = tower8.getClass();
        tower8.add((int) (byte) 1);
        tower1.moveDisks((int) (byte) -1, tower6, tower8);
        Tower tower14 = new Tower(0);
        tower14.add((-1));
        Tower tower18 = new Tower((int) (short) 100);
        tower14.moveTopTo(tower18);
        int int20 = tower18.index();
        tower8.moveTopTo(tower18);
        tower18.add((int) (byte) -1);
        tower18.add((int) (byte) 0);
        tower18.add((int) '4');
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test087");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        Tower tower8 = new Tower((-1));
        java.lang.Class<?> wildcardClass9 = tower8.getClass();
        tower8.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = tower8.getClass();
        Tower tower14 = new Tower(0);
        tower14.add((-1));
        tower14.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = tower14.getClass();
        Tower tower21 = new Tower((-1));
        tower21.add(0);
        tower14.moveTopTo(tower21);
        tower1.moveDisks((int) (short) 1, tower8, tower21);
        java.lang.Class<?> wildcardClass26 = tower21.getClass();
        tower21.add((int) (byte) 1);
        int int29 = tower21.index();
        Tower tower31 = new Tower((-1));
        java.lang.Class<?> wildcardClass32 = tower31.getClass();
        tower31.add((int) (byte) 1);
        tower31.add(0);
        Tower tower38 = new Tower(0);
        tower31.moveTopTo(tower38);
        Tower tower41 = new Tower((-1));
        java.lang.Class<?> wildcardClass42 = tower41.getClass();
        tower41.add((int) (byte) 1);
        tower41.add(0);
        Tower tower48 = new Tower(0);
        tower41.moveTopTo(tower48);
        int int50 = tower41.index();
        java.lang.Class<?> wildcardClass51 = tower41.getClass();
        java.lang.Class<?> wildcardClass52 = tower41.getClass();
        Tower tower54 = new Tower((-1));
        java.lang.Class<?> wildcardClass55 = tower54.getClass();
        tower54.add((int) (byte) 1);
        tower54.add(0);
        Tower tower61 = new Tower(0);
        tower54.moveTopTo(tower61);
        Tower tower64 = new Tower((-1));
        java.lang.Class<?> wildcardClass65 = tower64.getClass();
        tower64.add((int) (byte) 1);
        tower64.add(0);
        tower54.moveTopTo(tower64);
        java.lang.Class<?> wildcardClass71 = tower54.getClass();
        tower41.moveTopTo(tower54);
        tower31.moveTopTo(tower41);
        tower31.add((int) 'a');
        tower21.moveTopTo(tower31);
        java.lang.Class<?> wildcardClass77 = tower31.getClass();
        tower31.add(10);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test088");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        tower1.add((int) (byte) 1);
        int int8 = tower1.index();
        java.lang.Class<?> wildcardClass9 = tower1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test089");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        tower1.add(0);
        Tower tower8 = new Tower(0);
        tower1.moveTopTo(tower8);
        Tower tower11 = new Tower((-1));
        java.lang.Class<?> wildcardClass12 = tower11.getClass();
        tower11.add((int) (byte) 1);
        tower11.add(0);
        tower1.moveTopTo(tower11);
        tower1.add((int) '4');
        Tower tower21 = new Tower(0);
        tower21.add((-1));
        tower21.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = tower21.getClass();
        Tower tower28 = new Tower((-1));
        tower28.add(0);
        tower21.moveTopTo(tower28);
        tower1.moveTopTo(tower21);
        tower1.add((int) '#');
        int int35 = tower1.index();
        int int36 = tower1.index();
        Tower tower38 = new Tower((-1));
        java.lang.Class<?> wildcardClass39 = tower38.getClass();
        tower38.add((int) (byte) 1);
        Tower tower43 = new Tower((-1));
        int int44 = tower43.index();
        tower38.moveTopTo(tower43);
        Tower tower48 = new Tower((-1));
        java.lang.Class<?> wildcardClass49 = tower48.getClass();
        tower48.add((int) (byte) 1);
        tower48.add(0);
        Tower tower55 = new Tower(0);
        tower48.moveTopTo(tower55);
        Tower tower58 = new Tower(1);
        tower43.moveDisks(1, tower55, tower58);
        Tower tower61 = new Tower((int) (short) 100);
        tower61.add((int) (short) -1);
        tower61.add((-1));
        int int66 = tower61.index();
        tower55.moveTopTo(tower61);
        java.lang.Class<?> wildcardClass68 = tower55.getClass();
        tower55.add((int) (short) 1);
        tower1.moveTopTo(tower55);
        java.lang.Class<?> wildcardClass72 = tower55.getClass();
        Tower tower74 = new Tower(0);
        tower74.add((-1));
        Tower tower78 = new Tower(0);
        tower74.moveTopTo(tower78);
        int int80 = tower78.index();
        Tower tower82 = new Tower(0);
        tower82.add((-1));
        java.lang.Class<?> wildcardClass85 = tower82.getClass();
        int int86 = tower82.index();
        tower78.moveTopTo(tower82);
        tower78.add((int) (short) 10);
        tower78.add((int) (byte) -1);
        tower78.add((int) (short) 100);
        tower55.moveTopTo(tower78);
        int int95 = tower78.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test090");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        int int11 = tower1.index();
        tower1.add((int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = tower1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test091");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        tower6.add(10);
        tower6.add(0);
        tower6.add((int) (byte) 10);
        Tower tower17 = new Tower(0);
        tower17.add((-1));
        java.lang.Class<?> wildcardClass20 = tower17.getClass();
        java.lang.Class<?> wildcardClass21 = tower17.getClass();
        Tower tower23 = new Tower(0);
        tower23.add((-1));
        tower23.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = tower23.getClass();
        Tower tower30 = new Tower((-1));
        tower30.add(0);
        tower23.moveTopTo(tower30);
        java.lang.Class<?> wildcardClass34 = tower30.getClass();
        java.lang.Class<?> wildcardClass35 = tower30.getClass();
        tower17.moveTopTo(tower30);
        tower30.add(0);
        tower30.add((int) (short) -1);
        tower30.add((int) (short) -1);
        Tower tower44 = new Tower(0);
        tower44.add((-1));
        java.lang.Class<?> wildcardClass47 = tower44.getClass();
        java.lang.Class<?> wildcardClass48 = tower44.getClass();
        Tower tower50 = new Tower(0);
        tower50.add((-1));
        tower50.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass55 = tower50.getClass();
        Tower tower57 = new Tower((-1));
        tower57.add(0);
        tower50.moveTopTo(tower57);
        java.lang.Class<?> wildcardClass61 = tower57.getClass();
        java.lang.Class<?> wildcardClass62 = tower57.getClass();
        tower44.moveTopTo(tower57);
        tower6.moveDisks(0, tower30, tower44);
        java.lang.Class<?> wildcardClass65 = tower6.getClass();
        tower6.add((int) (byte) -1);
        int int68 = tower6.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test092");
        Tower tower1 = new Tower((int) (byte) -1);
        int int2 = tower1.index();
        tower1.add((int) (byte) 100);
        Tower tower6 = new Tower(0);
        tower6.add((-1));
        Tower tower11 = new Tower((-1));
        Tower tower13 = new Tower((-1));
        java.lang.Class<?> wildcardClass14 = tower13.getClass();
        tower13.add((int) (byte) 1);
        tower6.moveDisks((int) (byte) -1, tower11, tower13);
        java.lang.Class<?> wildcardClass18 = tower6.getClass();
        tower1.moveTopTo(tower6);
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add((int) (byte) 1);
        tower22.add(0);
        Tower tower29 = new Tower(0);
        tower22.moveTopTo(tower29);
        Tower tower32 = new Tower((-1));
        java.lang.Class<?> wildcardClass33 = tower32.getClass();
        tower32.add((int) (byte) 1);
        tower32.add(0);
        tower22.moveTopTo(tower32);
        Tower tower40 = new Tower(0);
        tower40.add((-1));
        Tower tower44 = new Tower(0);
        tower40.moveTopTo(tower44);
        int int46 = tower40.index();
        int int47 = tower40.index();
        tower32.moveTopTo(tower40);
        Tower tower50 = new Tower(0);
        tower50.add((-1));
        java.lang.Class<?> wildcardClass53 = tower50.getClass();
        Tower tower55 = new Tower((-1));
        java.lang.Class<?> wildcardClass56 = tower55.getClass();
        tower55.add(0);
        tower50.moveTopTo(tower55);
        tower55.add(0);
        Tower tower64 = new Tower((-1));
        java.lang.Class<?> wildcardClass65 = tower64.getClass();
        tower64.add((int) (byte) 1);
        tower64.add(0);
        Tower tower71 = new Tower((-1));
        java.lang.Class<?> wildcardClass72 = tower71.getClass();
        tower71.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass75 = tower71.getClass();
        tower55.moveDisks((int) (short) 0, tower64, tower71);
        int int77 = tower64.index();
        Tower tower79 = new Tower((int) (byte) -1);
        tower64.moveTopTo(tower79);
        tower1.moveDisks(0, tower32, tower79);
        int int82 = tower1.index();
        int int83 = tower1.index();
        java.lang.Class<?> wildcardClass84 = tower1.getClass();
        int int85 = tower1.index();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test093");
        Tower tower1 = new Tower(10);
        int int2 = tower1.index();
        Tower tower4 = new Tower((-1));
        java.lang.Class<?> wildcardClass5 = tower4.getClass();
        tower4.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = tower4.getClass();
        tower4.add((int) (byte) 100);
        tower4.add((int) '#');
        int int13 = tower4.index();
        Tower tower16 = new Tower(0);
        tower16.add((-1));
        Tower tower21 = new Tower((-1));
        Tower tower23 = new Tower((-1));
        java.lang.Class<?> wildcardClass24 = tower23.getClass();
        tower23.add((int) (byte) 1);
        tower16.moveDisks((int) (byte) -1, tower21, tower23);
        java.lang.Class<?> wildcardClass28 = tower16.getClass();
        java.lang.Class<?> wildcardClass29 = tower16.getClass();
        java.lang.Class<?> wildcardClass30 = tower16.getClass();
        java.lang.Class<?> wildcardClass31 = tower16.getClass();
        Tower tower34 = new Tower(0);
        tower34.add((-1));
        Tower tower38 = new Tower(0);
        tower34.moveTopTo(tower38);
        int int40 = tower38.index();
        int int41 = tower38.index();
        java.lang.Class<?> wildcardClass42 = tower38.getClass();
        int int43 = tower38.index();
        Tower tower45 = new Tower((-1));
        java.lang.Class<?> wildcardClass46 = tower45.getClass();
        tower45.add((int) (byte) 1);
        tower45.add(0);
        Tower tower52 = new Tower(0);
        tower45.moveTopTo(tower52);
        int int54 = tower45.index();
        java.lang.Class<?> wildcardClass55 = tower45.getClass();
        java.lang.Class<?> wildcardClass56 = tower45.getClass();
        int int57 = tower45.index();
        int int58 = tower45.index();
        int int59 = tower45.index();
        java.lang.Class<?> wildcardClass60 = tower45.getClass();
        java.lang.Class<?> wildcardClass61 = tower45.getClass();
        tower45.add(100);
        int int64 = tower45.index();
        tower16.moveDisks(0, tower38, tower45);
        tower16.add((int) (byte) 10);
        int int68 = tower16.index();
        Tower tower70 = new Tower((-1));
        java.lang.Class<?> wildcardClass71 = tower70.getClass();
        tower70.add((int) (byte) 1);
        Tower tower75 = new Tower((-1));
        int int76 = tower75.index();
        tower70.moveTopTo(tower75);
        tower4.moveDisks((int) (short) 1, tower16, tower75);
        try {
            tower1.moveTopTo(tower75);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test094");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower6.add(0);
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add((int) (byte) 1);
        tower15.add(0);
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = tower22.getClass();
        tower6.moveDisks((int) (short) 0, tower15, tower22);
        int int28 = tower15.index();
        Tower tower30 = new Tower(0);
        tower30.add((-1));
        java.lang.Class<?> wildcardClass33 = tower30.getClass();
        Tower tower35 = new Tower((-1));
        java.lang.Class<?> wildcardClass36 = tower35.getClass();
        tower35.add(0);
        tower30.moveTopTo(tower35);
        java.lang.Class<?> wildcardClass40 = tower30.getClass();
        int int41 = tower30.index();
        tower15.moveTopTo(tower30);
        tower15.add(97);
        Tower tower46 = new Tower((int) (byte) -1);
        int int47 = tower46.index();
        java.lang.Class<?> wildcardClass48 = tower46.getClass();
        java.lang.Class<?> wildcardClass49 = tower46.getClass();
        tower15.moveTopTo(tower46);
        Tower tower52 = new Tower((int) (byte) 100);
        java.lang.Class<?> wildcardClass53 = tower52.getClass();
        try {
            tower15.moveTopTo(tower52);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test095");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        Tower tower7 = new Tower((int) (byte) 0);
        tower1.moveTopTo(tower7);
        Tower tower11 = new Tower(0);
        tower11.add((-1));
        java.lang.Class<?> wildcardClass14 = tower11.getClass();
        Tower tower16 = new Tower((-1));
        java.lang.Class<?> wildcardClass17 = tower16.getClass();
        tower16.add(0);
        tower11.moveTopTo(tower16);
        tower11.add((int) 'a');
        Tower tower24 = new Tower(0);
        tower24.add((-1));
        Tower tower29 = new Tower((-1));
        Tower tower31 = new Tower((-1));
        java.lang.Class<?> wildcardClass32 = tower31.getClass();
        tower31.add((int) (byte) 1);
        tower24.moveDisks((int) (byte) -1, tower29, tower31);
        Tower tower37 = new Tower(0);
        tower37.add((-1));
        Tower tower42 = new Tower((-1));
        Tower tower44 = new Tower((-1));
        java.lang.Class<?> wildcardClass45 = tower44.getClass();
        tower44.add((int) (byte) 1);
        tower37.moveDisks((int) (byte) -1, tower42, tower44);
        Tower tower50 = new Tower(0);
        int int51 = tower50.index();
        tower44.moveTopTo(tower50);
        tower24.moveTopTo(tower44);
        tower1.moveDisks((int) (byte) -1, tower11, tower24);
        Tower tower56 = new Tower((int) (byte) 0);
        tower56.add((-1));
        tower11.moveTopTo(tower56);
        java.lang.Class<?> wildcardClass60 = tower56.getClass();
        java.lang.Class<?> wildcardClass61 = tower56.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test096");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower6.add(0);
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add((int) (byte) 1);
        tower15.add(0);
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = tower22.getClass();
        tower6.moveDisks((int) (short) 0, tower15, tower22);
        Tower tower29 = new Tower(100);
        tower6.moveTopTo(tower29);
        Tower tower32 = new Tower(0);
        tower32.add((-1));
        java.lang.Class<?> wildcardClass35 = tower32.getClass();
        Tower tower37 = new Tower((-1));
        java.lang.Class<?> wildcardClass38 = tower37.getClass();
        tower37.add(0);
        tower32.moveTopTo(tower37);
        tower37.add(0);
        Tower tower46 = new Tower((-1));
        java.lang.Class<?> wildcardClass47 = tower46.getClass();
        tower46.add((int) (byte) 1);
        tower46.add(0);
        Tower tower53 = new Tower((-1));
        java.lang.Class<?> wildcardClass54 = tower53.getClass();
        tower53.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass57 = tower53.getClass();
        tower37.moveDisks((int) (short) 0, tower46, tower53);
        int int59 = tower46.index();
        tower6.moveTopTo(tower46);
        java.lang.Class<?> wildcardClass61 = tower6.getClass();
        int int62 = tower6.index();
        tower6.add((int) (short) 0);
        tower6.add((int) 'a');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test097");
        Tower tower1 = new Tower((-1));
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower(0);
        Tower tower8 = new Tower(0);
        tower8.add((-1));
        Tower tower12 = new Tower(0);
        tower8.moveTopTo(tower12);
        Tower tower16 = new Tower(0);
        tower16.add((-1));
        Tower tower20 = new Tower((-1));
        java.lang.Class<?> wildcardClass21 = tower20.getClass();
        tower20.add((int) (byte) 1);
        tower20.add(0);
        Tower tower27 = new Tower(0);
        tower20.moveTopTo(tower27);
        Tower tower30 = new Tower((-1));
        java.lang.Class<?> wildcardClass31 = tower30.getClass();
        tower30.add((int) (byte) 1);
        tower30.add(0);
        tower20.moveTopTo(tower30);
        tower12.moveDisks((int) (byte) -1, tower16, tower30);
        tower1.moveDisks((int) (short) -1, tower6, tower12);
        int int39 = tower12.index();
        tower12.add((int) 'a');
        int int42 = tower12.index();
        tower12.add(32);
        tower12.add((int) (short) 0);
        int int47 = tower12.index();
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test098");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = tower1.getClass();
        java.lang.Class<?> wildcardClass6 = tower1.getClass();
        Tower tower8 = new Tower(0);
        tower8.add((-1));
        tower8.add((int) (byte) 1);
        Tower tower14 = new Tower((int) (byte) 0);
        tower8.moveTopTo(tower14);
        Tower tower18 = new Tower(0);
        tower18.add((-1));
        java.lang.Class<?> wildcardClass21 = tower18.getClass();
        Tower tower23 = new Tower((-1));
        java.lang.Class<?> wildcardClass24 = tower23.getClass();
        tower23.add(0);
        tower18.moveTopTo(tower23);
        tower18.add((int) 'a');
        Tower tower31 = new Tower(0);
        tower31.add((-1));
        Tower tower36 = new Tower((-1));
        Tower tower38 = new Tower((-1));
        java.lang.Class<?> wildcardClass39 = tower38.getClass();
        tower38.add((int) (byte) 1);
        tower31.moveDisks((int) (byte) -1, tower36, tower38);
        Tower tower44 = new Tower(0);
        tower44.add((-1));
        Tower tower49 = new Tower((-1));
        Tower tower51 = new Tower((-1));
        java.lang.Class<?> wildcardClass52 = tower51.getClass();
        tower51.add((int) (byte) 1);
        tower44.moveDisks((int) (byte) -1, tower49, tower51);
        Tower tower57 = new Tower(0);
        int int58 = tower57.index();
        tower51.moveTopTo(tower57);
        tower31.moveTopTo(tower51);
        tower8.moveDisks((int) (byte) -1, tower18, tower31);
        tower1.moveTopTo(tower18);
        java.lang.Class<?> wildcardClass63 = tower1.getClass();
        Tower tower65 = new Tower((-1));
        java.lang.Class<?> wildcardClass66 = tower65.getClass();
        tower65.add((int) (byte) 1);
        Tower tower70 = new Tower((-1));
        int int71 = tower70.index();
        tower65.moveTopTo(tower70);
        tower70.add(10);
        Tower tower77 = new Tower(0);
        tower77.add((-1));
        Tower tower81 = new Tower((-1));
        java.lang.Class<?> wildcardClass82 = tower81.getClass();
        tower81.add((int) (byte) 1);
        tower77.moveTopTo(tower81);
        Tower tower87 = new Tower((-1));
        java.lang.Class<?> wildcardClass88 = tower87.getClass();
        tower87.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass91 = tower87.getClass();
        tower70.moveDisks((int) (short) 0, tower77, tower87);
        int int93 = tower77.index();
        tower77.add(10);
        int int96 = tower77.index();
        tower77.add((int) (byte) 10);
        try {
            tower1.moveTopTo(tower77);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test099");
        Tower tower1 = new Tower((int) (byte) 10);
        tower1.add((int) (short) 1);
        int int4 = tower1.index();
        int int5 = tower1.index();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test100");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        tower1.add((int) (byte) 1);
        Tower tower10 = new Tower(0);
        tower10.add((-1));
        java.lang.Class<?> wildcardClass13 = tower10.getClass();
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add(0);
        tower10.moveTopTo(tower15);
        Tower tower21 = new Tower(0);
        tower21.add((-1));
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add((int) (byte) 1);
        tower21.moveTopTo(tower25);
        tower1.moveDisks((int) (short) 1, tower15, tower21);
        tower1.add(100);
        int int33 = tower1.index();
        java.lang.Class<?> wildcardClass34 = tower1.getClass();
        tower1.add((int) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test101");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower6 = new Tower((-1));
        Tower tower8 = new Tower((-1));
        java.lang.Class<?> wildcardClass9 = tower8.getClass();
        tower8.add((int) (byte) 1);
        tower1.moveDisks((int) (byte) -1, tower6, tower8);
        java.lang.Class<?> wildcardClass13 = tower1.getClass();
        java.lang.Class<?> wildcardClass14 = tower1.getClass();
        java.lang.Class<?> wildcardClass15 = tower1.getClass();
        java.lang.Class<?> wildcardClass16 = tower1.getClass();
        Tower tower19 = new Tower(0);
        tower19.add((-1));
        Tower tower23 = new Tower(0);
        tower19.moveTopTo(tower23);
        int int25 = tower23.index();
        int int26 = tower23.index();
        java.lang.Class<?> wildcardClass27 = tower23.getClass();
        int int28 = tower23.index();
        Tower tower30 = new Tower((-1));
        java.lang.Class<?> wildcardClass31 = tower30.getClass();
        tower30.add((int) (byte) 1);
        tower30.add(0);
        Tower tower37 = new Tower(0);
        tower30.moveTopTo(tower37);
        int int39 = tower30.index();
        java.lang.Class<?> wildcardClass40 = tower30.getClass();
        java.lang.Class<?> wildcardClass41 = tower30.getClass();
        int int42 = tower30.index();
        int int43 = tower30.index();
        int int44 = tower30.index();
        java.lang.Class<?> wildcardClass45 = tower30.getClass();
        java.lang.Class<?> wildcardClass46 = tower30.getClass();
        tower30.add(100);
        int int49 = tower30.index();
        tower1.moveDisks(0, tower23, tower30);
        tower1.add((int) (byte) 10);
        tower1.add((int) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test102");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        tower6.add(10);
        Tower tower13 = new Tower(0);
        tower13.add((-1));
        java.lang.Class<?> wildcardClass16 = tower13.getClass();
        Tower tower18 = new Tower((-1));
        java.lang.Class<?> wildcardClass19 = tower18.getClass();
        tower18.add(0);
        tower13.moveTopTo(tower18);
        Tower tower24 = new Tower((-1));
        int int25 = tower24.index();
        tower6.moveDisks(0, tower18, tower24);
        int int27 = tower6.index();
        Tower tower29 = new Tower((int) (byte) 100);
        tower6.moveTopTo(tower29);
        java.lang.Class<?> wildcardClass31 = tower6.getClass();
        Tower tower33 = new Tower((-1));
        java.lang.Class<?> wildcardClass34 = tower33.getClass();
        tower33.add((int) (byte) 1);
        Tower tower38 = new Tower((-1));
        int int39 = tower38.index();
        tower33.moveTopTo(tower38);
        Tower tower43 = new Tower((-1));
        java.lang.Class<?> wildcardClass44 = tower43.getClass();
        tower43.add((int) (byte) 1);
        tower43.add(0);
        Tower tower50 = new Tower(0);
        tower43.moveTopTo(tower50);
        Tower tower53 = new Tower(1);
        tower38.moveDisks(1, tower50, tower53);
        Tower tower56 = new Tower((int) (short) 100);
        tower56.add((int) (short) -1);
        tower56.add((-1));
        int int61 = tower56.index();
        tower50.moveTopTo(tower56);
        java.lang.Class<?> wildcardClass63 = tower50.getClass();
        tower50.add((int) (short) 1);
        tower50.add(1);
        java.lang.Class<?> wildcardClass68 = tower50.getClass();
        try {
            tower6.moveTopTo(tower50);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test103");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower5 = new Tower(0);
        tower1.moveTopTo(tower5);
        int int7 = tower5.index();
        int int8 = tower5.index();
        java.lang.Class<?> wildcardClass9 = tower5.getClass();
        int int10 = tower5.index();
        int int11 = tower5.index();
        tower5.add((int) (short) -1);
        int int14 = tower5.index();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test104");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower6.add(0);
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add((int) (byte) 1);
        tower15.add(0);
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = tower22.getClass();
        tower6.moveDisks((int) (short) 0, tower15, tower22);
        java.lang.Class<?> wildcardClass28 = tower22.getClass();
        int int29 = tower22.index();
        Tower tower32 = new Tower(0);
        tower32.add((-1));
        tower32.add((int) (byte) 1);
        tower32.add((int) (byte) 1);
        Tower tower41 = new Tower(0);
        tower41.add((-1));
        java.lang.Class<?> wildcardClass44 = tower41.getClass();
        Tower tower46 = new Tower((-1));
        java.lang.Class<?> wildcardClass47 = tower46.getClass();
        tower46.add(0);
        tower41.moveTopTo(tower46);
        Tower tower52 = new Tower(0);
        tower52.add((-1));
        Tower tower56 = new Tower((-1));
        java.lang.Class<?> wildcardClass57 = tower56.getClass();
        tower56.add((int) (byte) 1);
        tower52.moveTopTo(tower56);
        tower32.moveDisks((int) (short) 1, tower46, tower52);
        tower32.add(100);
        int int64 = tower32.index();
        tower32.add(97);
        int int67 = tower32.index();
        Tower tower69 = new Tower((-1));
        java.lang.Class<?> wildcardClass70 = tower69.getClass();
        tower69.add((int) (byte) 1);
        tower69.add(0);
        Tower tower76 = new Tower(0);
        tower69.moveTopTo(tower76);
        Tower tower79 = new Tower((-1));
        java.lang.Class<?> wildcardClass80 = tower79.getClass();
        tower79.add((int) (byte) 1);
        tower79.add(0);
        tower69.moveTopTo(tower79);
        tower69.add((int) '4');
        Tower tower89 = new Tower(0);
        tower89.add((-1));
        Tower tower93 = new Tower(0);
        tower89.moveTopTo(tower93);
        tower69.moveTopTo(tower89);
        tower22.moveDisks((int) (byte) 0, tower32, tower69);
        tower22.add(1);
        int int99 = tower22.index();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-1) + "'", int99 == (-1));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test105");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower5 = new Tower(0);
        tower1.moveTopTo(tower5);
        Tower tower9 = new Tower(0);
        tower9.add((-1));
        Tower tower13 = new Tower((-1));
        java.lang.Class<?> wildcardClass14 = tower13.getClass();
        tower13.add((int) (byte) 1);
        tower13.add(0);
        Tower tower20 = new Tower(0);
        tower13.moveTopTo(tower20);
        Tower tower23 = new Tower((-1));
        java.lang.Class<?> wildcardClass24 = tower23.getClass();
        tower23.add((int) (byte) 1);
        tower23.add(0);
        tower13.moveTopTo(tower23);
        tower5.moveDisks((int) (byte) -1, tower9, tower23);
        java.lang.Class<?> wildcardClass31 = tower23.getClass();
        Tower tower33 = new Tower((-1));
        tower33.add(0);
        java.lang.Class<?> wildcardClass36 = tower33.getClass();
        int int37 = tower33.index();
        tower23.moveTopTo(tower33);
        tower33.add((int) (byte) 0);
        int int41 = tower33.index();
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test106");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        tower1.add(0);
        Tower tower8 = new Tower(0);
        tower1.moveTopTo(tower8);
        Tower tower11 = new Tower((-1));
        java.lang.Class<?> wildcardClass12 = tower11.getClass();
        tower11.add((int) (byte) 1);
        tower11.add(0);
        Tower tower18 = new Tower(0);
        tower11.moveTopTo(tower18);
        int int20 = tower11.index();
        java.lang.Class<?> wildcardClass21 = tower11.getClass();
        java.lang.Class<?> wildcardClass22 = tower11.getClass();
        Tower tower24 = new Tower((-1));
        java.lang.Class<?> wildcardClass25 = tower24.getClass();
        tower24.add((int) (byte) 1);
        tower24.add(0);
        Tower tower31 = new Tower(0);
        tower24.moveTopTo(tower31);
        Tower tower34 = new Tower((-1));
        java.lang.Class<?> wildcardClass35 = tower34.getClass();
        tower34.add((int) (byte) 1);
        tower34.add(0);
        tower24.moveTopTo(tower34);
        java.lang.Class<?> wildcardClass41 = tower24.getClass();
        tower11.moveTopTo(tower24);
        tower1.moveTopTo(tower11);
        Tower tower46 = new Tower(0);
        tower46.add((-1));
        Tower tower50 = new Tower(0);
        tower46.moveTopTo(tower50);
        int int52 = tower50.index();
        Tower tower54 = new Tower(0);
        tower54.add((-1));
        java.lang.Class<?> wildcardClass57 = tower54.getClass();
        int int58 = tower54.index();
        tower50.moveTopTo(tower54);
        java.lang.Class<?> wildcardClass60 = tower54.getClass();
        tower54.add(0);
        Tower tower64 = new Tower((int) (short) 0);
        java.lang.Class<?> wildcardClass65 = tower64.getClass();
        tower11.moveDisks((int) (short) 0, tower54, tower64);
        tower54.add((int) (byte) 0);
        tower54.add((int) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test107");
        Tower tower1 = new Tower((int) (byte) 0);
        tower1.add((-1));
        Tower tower5 = new Tower((-1));
        java.lang.Class<?> wildcardClass6 = tower5.getClass();
        tower5.add((int) (byte) 1);
        Tower tower10 = new Tower((-1));
        int int11 = tower10.index();
        tower5.moveTopTo(tower10);
        tower10.add(10);
        tower1.moveTopTo(tower10);
        Tower tower18 = new Tower((-1));
        java.lang.Class<?> wildcardClass19 = tower18.getClass();
        tower18.add((int) (byte) 1);
        Tower tower23 = new Tower((-1));
        int int24 = tower23.index();
        tower18.moveTopTo(tower23);
        tower23.add(10);
        Tower tower30 = new Tower(0);
        tower30.add((-1));
        Tower tower34 = new Tower((-1));
        java.lang.Class<?> wildcardClass35 = tower34.getClass();
        tower34.add((int) (byte) 1);
        tower30.moveTopTo(tower34);
        Tower tower40 = new Tower((-1));
        java.lang.Class<?> wildcardClass41 = tower40.getClass();
        tower40.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass44 = tower40.getClass();
        tower23.moveDisks((int) (short) 0, tower30, tower40);
        tower23.add((int) '#');
        int int48 = tower23.index();
        Tower tower50 = new Tower((-1));
        java.lang.Class<?> wildcardClass51 = tower50.getClass();
        tower50.add((int) (byte) 1);
        tower50.add(0);
        int int56 = tower50.index();
        tower1.moveDisks(0, tower23, tower50);
        int int58 = tower23.index();
        tower23.add((int) (short) 10);
        tower23.add((int) (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test108");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        Tower tower11 = new Tower((-1));
        java.lang.Class<?> wildcardClass12 = tower11.getClass();
        tower11.add((int) (byte) 1);
        tower11.add(0);
        Tower tower18 = new Tower(0);
        tower11.moveTopTo(tower18);
        Tower tower21 = new Tower(1);
        tower6.moveDisks(1, tower18, tower21);
        Tower tower24 = new Tower((int) (short) 100);
        tower24.add((int) (short) -1);
        tower24.add((-1));
        int int29 = tower24.index();
        tower18.moveTopTo(tower24);
        int int31 = tower18.index();
        int int32 = tower18.index();
        tower18.add((int) (short) 10);
        Tower tower36 = new Tower(0);
        tower36.add((-1));
        java.lang.Class<?> wildcardClass39 = tower36.getClass();
        int int40 = tower36.index();
        int int41 = tower36.index();
        java.lang.Class<?> wildcardClass42 = tower36.getClass();
        tower36.add((int) (short) -1);
        java.lang.Class<?> wildcardClass45 = tower36.getClass();
        java.lang.Class<?> wildcardClass46 = tower36.getClass();
        java.lang.Class<?> wildcardClass47 = tower36.getClass();
        tower36.add((int) (short) 1);
        tower18.moveTopTo(tower36);
        tower18.add((int) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test109");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        tower6.add(10);
        Tower tower13 = new Tower(0);
        tower13.add((-1));
        Tower tower17 = new Tower((-1));
        java.lang.Class<?> wildcardClass18 = tower17.getClass();
        tower17.add((int) (byte) 1);
        tower13.moveTopTo(tower17);
        Tower tower23 = new Tower((-1));
        java.lang.Class<?> wildcardClass24 = tower23.getClass();
        tower23.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = tower23.getClass();
        tower6.moveDisks((int) (short) 0, tower13, tower23);
        tower6.add(10);
        Tower tower32 = new Tower(0);
        tower32.add((-1));
        Tower tower37 = new Tower((-1));
        Tower tower39 = new Tower((-1));
        java.lang.Class<?> wildcardClass40 = tower39.getClass();
        tower39.add((int) (byte) 1);
        tower32.moveDisks((int) (byte) -1, tower37, tower39);
        Tower tower45 = new Tower(0);
        int int46 = tower45.index();
        tower39.moveTopTo(tower45);
        int int48 = tower39.index();
        tower6.moveTopTo(tower39);
        java.lang.Class<?> wildcardClass50 = tower39.getClass();
        java.lang.Class<?> wildcardClass51 = tower39.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test110");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        tower6.add(10);
        Tower tower13 = new Tower(0);
        tower13.add((-1));
        Tower tower17 = new Tower((-1));
        java.lang.Class<?> wildcardClass18 = tower17.getClass();
        tower17.add((int) (byte) 1);
        tower13.moveTopTo(tower17);
        Tower tower23 = new Tower((-1));
        java.lang.Class<?> wildcardClass24 = tower23.getClass();
        tower23.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = tower23.getClass();
        tower6.moveDisks((int) (short) 0, tower13, tower23);
        int int29 = tower13.index();
        tower13.add(10);
        int int32 = tower13.index();
        Tower tower34 = new Tower(0);
        tower34.add((-1));
        java.lang.Class<?> wildcardClass37 = tower34.getClass();
        java.lang.Class<?> wildcardClass38 = tower34.getClass();
        int int39 = tower34.index();
        Tower tower41 = new Tower((int) (byte) 0);
        tower41.add((-1));
        Tower tower45 = new Tower(0);
        tower45.add((-1));
        Tower tower49 = new Tower((-1));
        java.lang.Class<?> wildcardClass50 = tower49.getClass();
        tower49.add((int) (byte) 1);
        tower45.moveTopTo(tower49);
        java.lang.Class<?> wildcardClass54 = tower49.getClass();
        tower41.moveTopTo(tower49);
        tower34.moveTopTo(tower41);
        tower13.moveTopTo(tower41);
        tower41.add((int) (short) 0);
        tower41.add(32);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test111");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        int int5 = tower1.index();
        Tower tower7 = new Tower((-1));
        java.lang.Class<?> wildcardClass8 = tower7.getClass();
        tower7.add((int) (byte) 1);
        tower7.add(0);
        int int13 = tower7.index();
        java.lang.Class<?> wildcardClass14 = tower7.getClass();
        java.lang.Class<?> wildcardClass15 = tower7.getClass();
        tower1.moveTopTo(tower7);
        java.lang.Class<?> wildcardClass17 = tower7.getClass();
        Tower tower20 = new Tower(0);
        tower20.add((-1));
        java.lang.Class<?> wildcardClass23 = tower20.getClass();
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add(0);
        tower20.moveTopTo(tower25);
        tower20.add((int) 'a');
        int int32 = tower20.index();
        int int33 = tower20.index();
        Tower tower35 = new Tower(0);
        tower35.add((-1));
        Tower tower40 = new Tower((-1));
        Tower tower42 = new Tower((-1));
        java.lang.Class<?> wildcardClass43 = tower42.getClass();
        tower42.add((int) (byte) 1);
        tower35.moveDisks((int) (byte) -1, tower40, tower42);
        java.lang.Class<?> wildcardClass47 = tower35.getClass();
        int int48 = tower35.index();
        tower7.moveDisks(0, tower20, tower35);
        tower20.add((int) '4');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test112");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower7 = new Tower(0);
        tower7.add((-1));
        Tower tower12 = new Tower((-1));
        Tower tower14 = new Tower((-1));
        java.lang.Class<?> wildcardClass15 = tower14.getClass();
        tower14.add((int) (byte) 1);
        tower7.moveDisks((int) (byte) -1, tower12, tower14);
        Tower tower20 = new Tower(0);
        int int21 = tower20.index();
        tower14.moveTopTo(tower20);
        Tower tower24 = new Tower(0);
        tower24.add((-1));
        java.lang.Class<?> wildcardClass27 = tower24.getClass();
        Tower tower29 = new Tower((-1));
        java.lang.Class<?> wildcardClass30 = tower29.getClass();
        tower29.add(0);
        tower24.moveTopTo(tower29);
        tower24.add((int) 'a');
        int int36 = tower24.index();
        tower1.moveDisks((int) (short) 0, tower14, tower24);
        int int38 = tower24.index();
        java.lang.Class<?> wildcardClass39 = tower24.getClass();
        int int40 = tower24.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test113");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower6 = new Tower((-1));
        Tower tower8 = new Tower((-1));
        java.lang.Class<?> wildcardClass9 = tower8.getClass();
        tower8.add((int) (byte) 1);
        tower1.moveDisks((int) (byte) -1, tower6, tower8);
        Tower tower14 = new Tower(0);
        tower14.add((-1));
        Tower tower18 = new Tower((int) (short) 100);
        tower14.moveTopTo(tower18);
        int int20 = tower18.index();
        tower8.moveTopTo(tower18);
        int int22 = tower18.index();
        java.lang.Class<?> wildcardClass23 = tower18.getClass();
        java.lang.Class<?> wildcardClass24 = tower18.getClass();
        tower18.add(10);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test114");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower6 = new Tower((-1));
        Tower tower8 = new Tower((-1));
        java.lang.Class<?> wildcardClass9 = tower8.getClass();
        tower8.add((int) (byte) 1);
        tower1.moveDisks((int) (byte) -1, tower6, tower8);
        java.lang.Class<?> wildcardClass13 = tower1.getClass();
        int int14 = tower1.index();
        Tower tower17 = new Tower((int) (byte) -1);
        Tower tower19 = new Tower(0);
        tower19.add((-1));
        java.lang.Class<?> wildcardClass22 = tower19.getClass();
        Tower tower24 = new Tower((-1));
        java.lang.Class<?> wildcardClass25 = tower24.getClass();
        tower24.add(0);
        tower19.moveTopTo(tower24);
        tower24.add(0);
        Tower tower33 = new Tower((-1));
        java.lang.Class<?> wildcardClass34 = tower33.getClass();
        tower33.add((int) (byte) 1);
        tower33.add(0);
        Tower tower40 = new Tower((-1));
        java.lang.Class<?> wildcardClass41 = tower40.getClass();
        tower40.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass44 = tower40.getClass();
        tower24.moveDisks((int) (short) 0, tower33, tower40);
        java.lang.Class<?> wildcardClass46 = tower40.getClass();
        Tower tower48 = new Tower((int) (byte) 0);
        tower40.moveTopTo(tower48);
        tower40.add((int) (byte) 10);
        tower1.moveDisks((-1), tower17, tower40);
        java.lang.Class<?> wildcardClass53 = tower1.getClass();
        tower1.add(0);
        int int56 = tower1.index();
        java.lang.Class<?> wildcardClass57 = tower1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test115");
        Tower tower1 = new Tower((int) (byte) 0);
        tower1.add((-1));
        Tower tower5 = new Tower((-1));
        java.lang.Class<?> wildcardClass6 = tower5.getClass();
        tower5.add((int) (byte) 1);
        Tower tower10 = new Tower((-1));
        int int11 = tower10.index();
        tower5.moveTopTo(tower10);
        tower10.add(10);
        tower1.moveTopTo(tower10);
        Tower tower17 = new Tower((-1));
        java.lang.Class<?> wildcardClass18 = tower17.getClass();
        tower17.add((int) (byte) 1);
        Tower tower22 = new Tower((-1));
        int int23 = tower22.index();
        tower17.moveTopTo(tower22);
        tower22.add((int) '#');
        java.lang.Class<?> wildcardClass27 = tower22.getClass();
        tower10.moveTopTo(tower22);
        java.lang.Class<?> wildcardClass29 = tower22.getClass();
        Tower tower31 = new Tower((-1));
        java.lang.Class<?> wildcardClass32 = tower31.getClass();
        tower31.add((int) (byte) 1);
        tower31.add(0);
        Tower tower38 = new Tower(0);
        tower31.moveTopTo(tower38);
        int int40 = tower31.index();
        tower22.moveTopTo(tower31);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test116");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        java.lang.Class<?> wildcardClass5 = tower1.getClass();
        Tower tower7 = new Tower(0);
        tower7.add((-1));
        tower7.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = tower7.getClass();
        Tower tower14 = new Tower((-1));
        tower14.add(0);
        tower7.moveTopTo(tower14);
        java.lang.Class<?> wildcardClass18 = tower14.getClass();
        java.lang.Class<?> wildcardClass19 = tower14.getClass();
        tower1.moveTopTo(tower14);
        tower14.add(0);
        tower14.add((int) (short) -1);
        tower14.add((int) (short) -1);
        int int27 = tower14.index();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test117");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        Tower tower7 = new Tower((int) (byte) 0);
        tower1.moveTopTo(tower7);
        Tower tower11 = new Tower(0);
        tower11.add((-1));
        java.lang.Class<?> wildcardClass14 = tower11.getClass();
        Tower tower16 = new Tower((-1));
        java.lang.Class<?> wildcardClass17 = tower16.getClass();
        tower16.add(0);
        tower11.moveTopTo(tower16);
        tower11.add((int) 'a');
        Tower tower24 = new Tower(0);
        tower24.add((-1));
        Tower tower29 = new Tower((-1));
        Tower tower31 = new Tower((-1));
        java.lang.Class<?> wildcardClass32 = tower31.getClass();
        tower31.add((int) (byte) 1);
        tower24.moveDisks((int) (byte) -1, tower29, tower31);
        Tower tower37 = new Tower(0);
        tower37.add((-1));
        Tower tower42 = new Tower((-1));
        Tower tower44 = new Tower((-1));
        java.lang.Class<?> wildcardClass45 = tower44.getClass();
        tower44.add((int) (byte) 1);
        tower37.moveDisks((int) (byte) -1, tower42, tower44);
        Tower tower50 = new Tower(0);
        int int51 = tower50.index();
        tower44.moveTopTo(tower50);
        tower24.moveTopTo(tower44);
        tower1.moveDisks((int) (byte) -1, tower11, tower24);
        tower1.add((int) '#');
        int int57 = tower1.index();
        tower1.add((int) (byte) -1);
        int int60 = tower1.index();
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test118");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower5 = new Tower(0);
        tower1.moveTopTo(tower5);
        Tower tower9 = new Tower(0);
        tower9.add((-1));
        Tower tower13 = new Tower((-1));
        java.lang.Class<?> wildcardClass14 = tower13.getClass();
        tower13.add((int) (byte) 1);
        tower13.add(0);
        Tower tower20 = new Tower(0);
        tower13.moveTopTo(tower20);
        Tower tower23 = new Tower((-1));
        java.lang.Class<?> wildcardClass24 = tower23.getClass();
        tower23.add((int) (byte) 1);
        tower23.add(0);
        tower13.moveTopTo(tower23);
        tower5.moveDisks((int) (byte) -1, tower9, tower23);
        java.lang.Class<?> wildcardClass31 = tower5.getClass();
        Tower tower33 = new Tower(0);
        tower33.add((-1));
        tower33.add((int) (byte) 1);
        tower33.add((int) (byte) 1);
        Tower tower42 = new Tower(0);
        tower42.add((-1));
        java.lang.Class<?> wildcardClass45 = tower42.getClass();
        Tower tower47 = new Tower((-1));
        java.lang.Class<?> wildcardClass48 = tower47.getClass();
        tower47.add(0);
        tower42.moveTopTo(tower47);
        Tower tower53 = new Tower(0);
        tower53.add((-1));
        Tower tower57 = new Tower((-1));
        java.lang.Class<?> wildcardClass58 = tower57.getClass();
        tower57.add((int) (byte) 1);
        tower53.moveTopTo(tower57);
        tower33.moveDisks((int) (short) 1, tower47, tower53);
        java.lang.Class<?> wildcardClass63 = tower47.getClass();
        Tower tower65 = new Tower((-1));
        java.lang.Class<?> wildcardClass66 = tower65.getClass();
        tower65.add((int) (byte) 1);
        Tower tower70 = new Tower((-1));
        int int71 = tower70.index();
        tower65.moveTopTo(tower70);
        tower70.add(10);
        Tower tower77 = new Tower(0);
        tower77.add((-1));
        java.lang.Class<?> wildcardClass80 = tower77.getClass();
        Tower tower82 = new Tower((-1));
        java.lang.Class<?> wildcardClass83 = tower82.getClass();
        tower82.add(0);
        tower77.moveTopTo(tower82);
        Tower tower88 = new Tower((-1));
        int int89 = tower88.index();
        tower70.moveDisks(0, tower82, tower88);
        tower47.moveTopTo(tower82);
        tower47.add(1);
        java.lang.Class<?> wildcardClass94 = tower47.getClass();
        tower5.moveTopTo(tower47);
        int int96 = tower47.index();
        tower47.add((int) '4');
        java.lang.Class<?> wildcardClass99 = tower47.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass94);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test119");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        tower6.add(10);
        tower6.add(0);
        tower6.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = tower6.getClass();
        tower6.add((-1));
        java.lang.Class<?> wildcardClass18 = tower6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test120");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        tower1.add((int) (byte) 1);
        Tower tower10 = new Tower(0);
        tower10.add((-1));
        java.lang.Class<?> wildcardClass13 = tower10.getClass();
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add(0);
        tower10.moveTopTo(tower15);
        Tower tower21 = new Tower(0);
        tower21.add((-1));
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add((int) (byte) 1);
        tower21.moveTopTo(tower25);
        tower1.moveDisks((int) (short) 1, tower15, tower21);
        java.lang.Class<?> wildcardClass31 = tower15.getClass();
        Tower tower33 = new Tower((-1));
        java.lang.Class<?> wildcardClass34 = tower33.getClass();
        tower33.add((int) (byte) 1);
        Tower tower38 = new Tower((-1));
        int int39 = tower38.index();
        tower33.moveTopTo(tower38);
        tower38.add(10);
        Tower tower45 = new Tower(0);
        tower45.add((-1));
        java.lang.Class<?> wildcardClass48 = tower45.getClass();
        Tower tower50 = new Tower((-1));
        java.lang.Class<?> wildcardClass51 = tower50.getClass();
        tower50.add(0);
        tower45.moveTopTo(tower50);
        Tower tower56 = new Tower((-1));
        int int57 = tower56.index();
        tower38.moveDisks(0, tower50, tower56);
        tower15.moveTopTo(tower50);
        int int60 = tower50.index();
        tower50.add(1);
        java.lang.Class<?> wildcardClass63 = tower50.getClass();
        int int64 = tower50.index();
        java.lang.Class<?> wildcardClass65 = tower50.getClass();
        tower50.add((int) '4');
        int int68 = tower50.index();
        int int69 = tower50.index();
        Tower tower71 = new Tower((-1));
        java.lang.Class<?> wildcardClass72 = tower71.getClass();
        tower71.add((int) (byte) 1);
        Tower tower76 = new Tower((-1));
        int int77 = tower76.index();
        tower71.moveTopTo(tower76);
        Tower tower81 = new Tower((-1));
        java.lang.Class<?> wildcardClass82 = tower81.getClass();
        tower81.add((int) (byte) 1);
        tower81.add(0);
        Tower tower88 = new Tower(0);
        tower81.moveTopTo(tower88);
        Tower tower91 = new Tower(1);
        tower76.moveDisks(1, tower88, tower91);
        tower50.moveTopTo(tower76);
        tower76.add((int) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test121");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = tower1.getClass();
        Tower tower7 = new Tower((-1));
        java.lang.Class<?> wildcardClass8 = tower7.getClass();
        tower7.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = tower7.getClass();
        tower7.add((int) (byte) 100);
        int int14 = tower7.index();
        int int15 = tower7.index();
        java.lang.Class<?> wildcardClass16 = tower7.getClass();
        tower1.moveTopTo(tower7);
        tower1.add(10);
        java.lang.Class<?> wildcardClass20 = tower1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test122");
        Tower tower1 = new Tower((int) '#');
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add(35);
        int int5 = tower1.index();
        int int6 = tower1.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test123");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        Tower tower11 = new Tower((-1));
        java.lang.Class<?> wildcardClass12 = tower11.getClass();
        tower11.add((int) (byte) 1);
        tower11.add(0);
        Tower tower18 = new Tower(0);
        tower11.moveTopTo(tower18);
        Tower tower21 = new Tower(1);
        tower6.moveDisks(1, tower18, tower21);
        Tower tower24 = new Tower((int) (short) 100);
        tower24.add((int) (short) -1);
        tower24.add((-1));
        int int29 = tower24.index();
        tower18.moveTopTo(tower24);
        Tower tower32 = new Tower(0);
        tower32.add((-1));
        java.lang.Class<?> wildcardClass35 = tower32.getClass();
        int int36 = tower32.index();
        tower24.moveTopTo(tower32);
        java.lang.Class<?> wildcardClass38 = tower24.getClass();
        java.lang.Class<?> wildcardClass39 = tower24.getClass();
        tower24.add((int) (byte) 0);
        Tower tower43 = new Tower((-1));
        java.lang.Class<?> wildcardClass44 = tower43.getClass();
        tower43.add((int) (byte) 1);
        Tower tower48 = new Tower((-1));
        int int49 = tower48.index();
        tower43.moveTopTo(tower48);
        tower48.add(10);
        tower48.add(0);
        tower48.add((int) (byte) 10);
        java.lang.Class<?> wildcardClass57 = tower48.getClass();
        tower48.add((-1));
        tower24.moveTopTo(tower48);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test124");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        Tower tower11 = new Tower(0);
        tower11.add((-1));
        tower11.add((int) (byte) 1);
        tower11.add((int) (byte) 1);
        Tower tower20 = new Tower(0);
        tower20.add((-1));
        java.lang.Class<?> wildcardClass23 = tower20.getClass();
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add(0);
        tower20.moveTopTo(tower25);
        Tower tower31 = new Tower(0);
        tower31.add((-1));
        Tower tower35 = new Tower((-1));
        java.lang.Class<?> wildcardClass36 = tower35.getClass();
        tower35.add((int) (byte) 1);
        tower31.moveTopTo(tower35);
        tower11.moveDisks((int) (short) 1, tower25, tower31);
        java.lang.Class<?> wildcardClass41 = tower25.getClass();
        java.lang.Class<?> wildcardClass42 = tower25.getClass();
        Tower tower44 = new Tower((-1));
        int int45 = tower44.index();
        tower44.add(1);
        tower6.moveDisks(1, tower25, tower44);
        Tower tower51 = new Tower(0);
        tower51.add((-1));
        tower51.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass56 = tower51.getClass();
        int int57 = tower51.index();
        Tower tower59 = new Tower((-1));
        tower59.add((int) (byte) 1);
        Tower tower64 = new Tower(0);
        Tower tower66 = new Tower(0);
        tower66.add((-1));
        Tower tower70 = new Tower(0);
        tower66.moveTopTo(tower70);
        Tower tower74 = new Tower(0);
        tower74.add((-1));
        Tower tower78 = new Tower((-1));
        java.lang.Class<?> wildcardClass79 = tower78.getClass();
        tower78.add((int) (byte) 1);
        tower78.add(0);
        Tower tower85 = new Tower(0);
        tower78.moveTopTo(tower85);
        Tower tower88 = new Tower((-1));
        java.lang.Class<?> wildcardClass89 = tower88.getClass();
        tower88.add((int) (byte) 1);
        tower88.add(0);
        tower78.moveTopTo(tower88);
        tower70.moveDisks((int) (byte) -1, tower74, tower88);
        tower59.moveDisks((int) (short) -1, tower64, tower70);
        tower25.moveDisks((int) (short) 0, tower51, tower64);
        int int98 = tower51.index();
        int int99 = tower51.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test125");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        int int5 = tower1.index();
        Tower tower7 = new Tower(0);
        tower7.add((-1));
        java.lang.Class<?> wildcardClass10 = tower7.getClass();
        int int11 = tower7.index();
        Tower tower13 = new Tower((-1));
        java.lang.Class<?> wildcardClass14 = tower13.getClass();
        tower13.add((int) (byte) 1);
        tower13.add(0);
        int int19 = tower13.index();
        java.lang.Class<?> wildcardClass20 = tower13.getClass();
        java.lang.Class<?> wildcardClass21 = tower13.getClass();
        tower7.moveTopTo(tower13);
        tower1.moveTopTo(tower7);
        int int24 = tower7.index();
        Tower tower27 = new Tower((-1));
        java.lang.Class<?> wildcardClass28 = tower27.getClass();
        tower27.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass31 = tower27.getClass();
        tower27.add((int) (byte) 100);
        java.lang.Class<?> wildcardClass34 = tower27.getClass();
        Tower tower36 = new Tower(0);
        tower36.add((-1));
        Tower tower41 = new Tower((-1));
        Tower tower43 = new Tower((-1));
        java.lang.Class<?> wildcardClass44 = tower43.getClass();
        tower43.add((int) (byte) 1);
        tower36.moveDisks((int) (byte) -1, tower41, tower43);
        int int48 = tower41.index();
        int int49 = tower41.index();
        java.lang.Class<?> wildcardClass50 = tower41.getClass();
        int int51 = tower41.index();
        java.lang.Class<?> wildcardClass52 = tower41.getClass();
        tower41.add((int) (byte) 10);
        tower7.moveDisks((int) (short) 1, tower27, tower41);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test126");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower1.add((int) 'a');
        int int13 = tower1.index();
        int int14 = tower1.index();
        tower1.add(1);
        tower1.add((int) (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test127");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        Tower tower11 = new Tower((-1));
        java.lang.Class<?> wildcardClass12 = tower11.getClass();
        tower11.add((int) (byte) 1);
        tower11.add(0);
        Tower tower18 = new Tower(0);
        tower11.moveTopTo(tower18);
        Tower tower21 = new Tower(1);
        tower6.moveDisks(1, tower18, tower21);
        java.lang.Class<?> wildcardClass23 = tower18.getClass();
        Tower tower25 = new Tower(0);
        tower25.add((-1));
        java.lang.Class<?> wildcardClass28 = tower25.getClass();
        Tower tower30 = new Tower((-1));
        java.lang.Class<?> wildcardClass31 = tower30.getClass();
        tower30.add(0);
        tower25.moveTopTo(tower30);
        tower30.add(0);
        Tower tower39 = new Tower((-1));
        java.lang.Class<?> wildcardClass40 = tower39.getClass();
        tower39.add((int) (byte) 1);
        tower39.add(0);
        Tower tower46 = new Tower((-1));
        java.lang.Class<?> wildcardClass47 = tower46.getClass();
        tower46.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass50 = tower46.getClass();
        tower30.moveDisks((int) (short) 0, tower39, tower46);
        int int52 = tower39.index();
        Tower tower54 = new Tower((int) (byte) -1);
        tower39.moveTopTo(tower54);
        int int56 = tower54.index();
        int int57 = tower54.index();
        tower54.add((int) (byte) 100);
        int int60 = tower54.index();
        tower18.moveTopTo(tower54);
        tower54.add(10);
        tower54.add((int) ' ');
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test128");
        Tower tower1 = new Tower((int) (short) 100);
        tower1.add((int) (short) -1);
        tower1.add((-1));
        Tower tower7 = new Tower(0);
        tower7.add((-1));
        Tower tower12 = new Tower((-1));
        Tower tower14 = new Tower((-1));
        java.lang.Class<?> wildcardClass15 = tower14.getClass();
        tower14.add((int) (byte) 1);
        tower7.moveDisks((int) (byte) -1, tower12, tower14);
        Tower tower20 = new Tower(0);
        tower20.add((-1));
        tower20.add((int) (byte) 1);
        tower20.add((int) (byte) 1);
        Tower tower29 = new Tower(0);
        tower29.add((-1));
        java.lang.Class<?> wildcardClass32 = tower29.getClass();
        Tower tower34 = new Tower((-1));
        java.lang.Class<?> wildcardClass35 = tower34.getClass();
        tower34.add(0);
        tower29.moveTopTo(tower34);
        Tower tower40 = new Tower(0);
        tower40.add((-1));
        Tower tower44 = new Tower((-1));
        java.lang.Class<?> wildcardClass45 = tower44.getClass();
        tower44.add((int) (byte) 1);
        tower40.moveTopTo(tower44);
        tower20.moveDisks((int) (short) 1, tower34, tower40);
        java.lang.Class<?> wildcardClass50 = tower34.getClass();
        Tower tower52 = new Tower((-1));
        java.lang.Class<?> wildcardClass53 = tower52.getClass();
        tower52.add((int) (byte) 1);
        Tower tower57 = new Tower((-1));
        int int58 = tower57.index();
        tower52.moveTopTo(tower57);
        tower57.add(10);
        Tower tower64 = new Tower(0);
        tower64.add((-1));
        java.lang.Class<?> wildcardClass67 = tower64.getClass();
        Tower tower69 = new Tower((-1));
        java.lang.Class<?> wildcardClass70 = tower69.getClass();
        tower69.add(0);
        tower64.moveTopTo(tower69);
        Tower tower75 = new Tower((-1));
        int int76 = tower75.index();
        tower57.moveDisks(0, tower69, tower75);
        tower34.moveTopTo(tower69);
        tower7.moveTopTo(tower34);
        tower1.moveTopTo(tower7);
        java.lang.Class<?> wildcardClass81 = tower1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test129");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = tower1.getClass();
        Tower tower7 = new Tower(0);
        tower7.add((-1));
        tower7.add((int) (byte) 1);
        Tower tower14 = new Tower((-1));
        java.lang.Class<?> wildcardClass15 = tower14.getClass();
        tower14.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = tower14.getClass();
        Tower tower20 = new Tower(0);
        tower20.add((-1));
        tower20.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = tower20.getClass();
        Tower tower27 = new Tower((-1));
        tower27.add(0);
        tower20.moveTopTo(tower27);
        tower7.moveDisks((int) (short) 1, tower14, tower27);
        tower1.moveTopTo(tower7);
        tower7.add((int) '#');
        int int35 = tower7.index();
        Tower tower37 = new Tower(0);
        tower37.add((-1));
        Tower tower41 = new Tower((-1));
        java.lang.Class<?> wildcardClass42 = tower41.getClass();
        tower41.add((int) (byte) 1);
        tower37.moveTopTo(tower41);
        java.lang.Class<?> wildcardClass46 = tower41.getClass();
        tower7.moveTopTo(tower41);
        int int48 = tower7.index();
        tower7.add((int) (byte) -1);
        tower7.add((int) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test130");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower6.add(0);
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add((int) (byte) 1);
        tower15.add(0);
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = tower22.getClass();
        tower6.moveDisks((int) (short) 0, tower15, tower22);
        Tower tower29 = new Tower(100);
        tower6.moveTopTo(tower29);
        Tower tower32 = new Tower(0);
        tower32.add((-1));
        java.lang.Class<?> wildcardClass35 = tower32.getClass();
        Tower tower37 = new Tower((-1));
        java.lang.Class<?> wildcardClass38 = tower37.getClass();
        tower37.add(0);
        tower32.moveTopTo(tower37);
        tower37.add(0);
        Tower tower46 = new Tower((-1));
        java.lang.Class<?> wildcardClass47 = tower46.getClass();
        tower46.add((int) (byte) 1);
        tower46.add(0);
        Tower tower53 = new Tower((-1));
        java.lang.Class<?> wildcardClass54 = tower53.getClass();
        tower53.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass57 = tower53.getClass();
        tower37.moveDisks((int) (short) 0, tower46, tower53);
        int int59 = tower46.index();
        tower6.moveTopTo(tower46);
        Tower tower62 = new Tower(0);
        tower62.add((-1));
        Tower tower67 = new Tower((-1));
        Tower tower69 = new Tower((-1));
        java.lang.Class<?> wildcardClass70 = tower69.getClass();
        tower69.add((int) (byte) 1);
        tower62.moveDisks((int) (byte) -1, tower67, tower69);
        java.lang.Class<?> wildcardClass74 = tower62.getClass();
        java.lang.Class<?> wildcardClass75 = tower62.getClass();
        java.lang.Class<?> wildcardClass76 = tower62.getClass();
        java.lang.Class<?> wildcardClass77 = tower62.getClass();
        int int78 = tower62.index();
        tower46.moveTopTo(tower62);
        java.lang.Class<?> wildcardClass80 = tower46.getClass();
        java.lang.Class<?> wildcardClass81 = tower46.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test131");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        Tower tower11 = new Tower((-1));
        java.lang.Class<?> wildcardClass12 = tower11.getClass();
        tower11.add((int) (byte) 1);
        tower11.add(0);
        Tower tower18 = new Tower(0);
        tower11.moveTopTo(tower18);
        Tower tower21 = new Tower(1);
        tower6.moveDisks(1, tower18, tower21);
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add((int) (byte) 1);
        Tower tower30 = new Tower((-1));
        int int31 = tower30.index();
        tower25.moveTopTo(tower30);
        tower30.add(10);
        Tower tower37 = new Tower(0);
        tower37.add((-1));
        java.lang.Class<?> wildcardClass40 = tower37.getClass();
        Tower tower42 = new Tower((-1));
        java.lang.Class<?> wildcardClass43 = tower42.getClass();
        tower42.add(0);
        tower37.moveTopTo(tower42);
        Tower tower48 = new Tower((-1));
        int int49 = tower48.index();
        tower30.moveDisks(0, tower42, tower48);
        int int51 = tower30.index();
        Tower tower53 = new Tower(0);
        tower53.add((-1));
        Tower tower58 = new Tower((-1));
        Tower tower60 = new Tower((-1));
        java.lang.Class<?> wildcardClass61 = tower60.getClass();
        tower60.add((int) (byte) 1);
        tower53.moveDisks((int) (byte) -1, tower58, tower60);
        Tower tower66 = new Tower(0);
        int int67 = tower66.index();
        tower60.moveTopTo(tower66);
        tower6.moveDisks((int) (short) -1, tower30, tower60);
        java.lang.Class<?> wildcardClass70 = tower30.getClass();
        java.lang.Class<?> wildcardClass71 = tower30.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test132");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = tower1.getClass();
        int int6 = tower1.index();
        java.lang.Class<?> wildcardClass7 = tower1.getClass();
        java.lang.Class<?> wildcardClass8 = tower1.getClass();
        java.lang.Class<?> wildcardClass9 = tower1.getClass();
        tower1.add(1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test133");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower6.add(0);
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add((int) (byte) 1);
        tower15.add(0);
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = tower22.getClass();
        tower6.moveDisks((int) (short) 0, tower15, tower22);
        int int28 = tower15.index();
        Tower tower30 = new Tower((int) (byte) -1);
        tower15.moveTopTo(tower30);
        int int32 = tower30.index();
        java.lang.Class<?> wildcardClass33 = tower30.getClass();
        Tower tower35 = new Tower(0);
        tower35.add((-1));
        Tower tower39 = new Tower(0);
        tower35.moveTopTo(tower39);
        Tower tower43 = new Tower(0);
        tower43.add((-1));
        Tower tower47 = new Tower((-1));
        java.lang.Class<?> wildcardClass48 = tower47.getClass();
        tower47.add((int) (byte) 1);
        tower47.add(0);
        Tower tower54 = new Tower(0);
        tower47.moveTopTo(tower54);
        Tower tower57 = new Tower((-1));
        java.lang.Class<?> wildcardClass58 = tower57.getClass();
        tower57.add((int) (byte) 1);
        tower57.add(0);
        tower47.moveTopTo(tower57);
        tower39.moveDisks((int) (byte) -1, tower43, tower57);
        int int65 = tower39.index();
        tower39.add((int) (byte) 100);
        tower30.moveTopTo(tower39);
        int int69 = tower39.index();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test134");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        Tower tower8 = new Tower((-1));
        java.lang.Class<?> wildcardClass9 = tower8.getClass();
        tower8.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = tower8.getClass();
        Tower tower14 = new Tower(0);
        tower14.add((-1));
        tower14.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = tower14.getClass();
        Tower tower21 = new Tower((-1));
        tower21.add(0);
        tower14.moveTopTo(tower21);
        tower1.moveDisks((int) (short) 1, tower8, tower21);
        java.lang.Class<?> wildcardClass26 = tower21.getClass();
        java.lang.Class<?> wildcardClass27 = tower21.getClass();
        int int28 = tower21.index();
        Tower tower30 = new Tower((int) (byte) 100);
        java.lang.Class<?> wildcardClass31 = tower30.getClass();
        tower21.moveTopTo(tower30);
        int int33 = tower21.index();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test135");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower6.add(0);
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add((int) (byte) 1);
        tower15.add(0);
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = tower22.getClass();
        tower6.moveDisks((int) (short) 0, tower15, tower22);
        int int28 = tower15.index();
        tower15.add((int) (byte) -1);
        Tower tower32 = new Tower((-1));
        tower32.add(0);
        java.lang.Class<?> wildcardClass35 = tower32.getClass();
        int int36 = tower32.index();
        tower15.moveTopTo(tower32);
        Tower tower40 = new Tower(0);
        tower40.add((-1));
        java.lang.Class<?> wildcardClass43 = tower40.getClass();
        int int44 = tower40.index();
        Tower tower46 = new Tower(0);
        tower46.add((-1));
        java.lang.Class<?> wildcardClass49 = tower46.getClass();
        int int50 = tower46.index();
        Tower tower52 = new Tower((-1));
        java.lang.Class<?> wildcardClass53 = tower52.getClass();
        tower52.add((int) (byte) 1);
        tower52.add(0);
        int int58 = tower52.index();
        java.lang.Class<?> wildcardClass59 = tower52.getClass();
        java.lang.Class<?> wildcardClass60 = tower52.getClass();
        tower46.moveTopTo(tower52);
        tower40.moveTopTo(tower46);
        tower40.add(1);
        tower40.add((int) (byte) -1);
        Tower tower68 = new Tower(0);
        tower68.add((-1));
        tower68.add((int) (byte) 1);
        tower68.add((int) (byte) 1);
        Tower tower76 = new Tower((int) (byte) 0);
        tower76.add((-1));
        tower68.moveTopTo(tower76);
        tower76.add((int) (byte) 100);
        tower76.add(0);
        Tower tower85 = new Tower(97);
        tower85.add((int) (byte) 0);
        tower85.add((int) (byte) 100);
        tower85.add(1);
        java.lang.Class<?> wildcardClass92 = tower85.getClass();
        tower76.moveTopTo(tower85);
        tower32.moveDisks(1, tower40, tower85);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test136");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower6 = new Tower((-1));
        Tower tower8 = new Tower((-1));
        java.lang.Class<?> wildcardClass9 = tower8.getClass();
        tower8.add((int) (byte) 1);
        tower1.moveDisks((int) (byte) -1, tower6, tower8);
        int int13 = tower6.index();
        int int14 = tower6.index();
        tower6.add((int) (short) 1);
        int int17 = tower6.index();
        tower6.add(100);
        int int20 = tower6.index();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test137");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower6 = new Tower((-1));
        Tower tower8 = new Tower((-1));
        java.lang.Class<?> wildcardClass9 = tower8.getClass();
        tower8.add((int) (byte) 1);
        tower1.moveDisks((int) (byte) -1, tower6, tower8);
        Tower tower14 = new Tower(0);
        tower14.add((-1));
        Tower tower18 = new Tower((int) (short) 100);
        tower14.moveTopTo(tower18);
        int int20 = tower18.index();
        tower8.moveTopTo(tower18);
        tower8.add((int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = tower8.getClass();
        tower8.add(52);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test138");
        Tower tower1 = new Tower((-1));
        tower1.add(0);
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        int int5 = tower1.index();
        Tower tower7 = new Tower((-1));
        tower7.add(0);
        java.lang.Class<?> wildcardClass10 = tower7.getClass();
        Tower tower12 = new Tower((-1));
        java.lang.Class<?> wildcardClass13 = tower12.getClass();
        tower12.add((int) (byte) 1);
        Tower tower17 = new Tower((-1));
        int int18 = tower17.index();
        tower12.moveTopTo(tower17);
        tower17.add(10);
        Tower tower24 = new Tower(0);
        tower24.add((-1));
        Tower tower28 = new Tower((-1));
        java.lang.Class<?> wildcardClass29 = tower28.getClass();
        tower28.add((int) (byte) 1);
        tower24.moveTopTo(tower28);
        Tower tower34 = new Tower((-1));
        java.lang.Class<?> wildcardClass35 = tower34.getClass();
        tower34.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass38 = tower34.getClass();
        tower17.moveDisks((int) (short) 0, tower24, tower34);
        java.lang.Class<?> wildcardClass40 = tower17.getClass();
        tower7.moveTopTo(tower17);
        tower1.moveTopTo(tower7);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test139");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower1.add((int) (short) -1);
        Tower tower14 = new Tower(0);
        tower14.add((-1));
        tower14.add((int) (byte) 1);
        Tower tower20 = new Tower((int) (byte) 0);
        tower14.moveTopTo(tower20);
        java.lang.Class<?> wildcardClass22 = tower20.getClass();
        java.lang.Class<?> wildcardClass23 = tower20.getClass();
        tower1.moveTopTo(tower20);
        java.lang.Class<?> wildcardClass25 = tower1.getClass();
        tower1.add((int) (short) 1);
        java.lang.Class<?> wildcardClass28 = tower1.getClass();
        int int29 = tower1.index();
        tower1.add((int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test140");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        tower1.add((int) '4');
        java.lang.Class<?> wildcardClass7 = tower1.getClass();
        java.lang.Class<?> wildcardClass8 = tower1.getClass();
        java.lang.Class<?> wildcardClass9 = tower1.getClass();
        int int10 = tower1.index();
        java.lang.Class<?> wildcardClass11 = tower1.getClass();
        tower1.add((int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test141");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        int int5 = tower1.index();
        Tower tower7 = new Tower(0);
        tower7.add((-1));
        java.lang.Class<?> wildcardClass10 = tower7.getClass();
        int int11 = tower7.index();
        Tower tower13 = new Tower((-1));
        java.lang.Class<?> wildcardClass14 = tower13.getClass();
        tower13.add((int) (byte) 1);
        tower13.add(0);
        int int19 = tower13.index();
        java.lang.Class<?> wildcardClass20 = tower13.getClass();
        java.lang.Class<?> wildcardClass21 = tower13.getClass();
        tower7.moveTopTo(tower13);
        tower1.moveTopTo(tower7);
        tower1.add(1);
        tower1.add((int) (byte) -1);
        int int28 = tower1.index();
        java.lang.Class<?> wildcardClass29 = tower1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test142");
        Tower tower1 = new Tower((int) (byte) 0);
        tower1.add((-1));
        Tower tower5 = new Tower(0);
        tower5.add((-1));
        Tower tower9 = new Tower((-1));
        java.lang.Class<?> wildcardClass10 = tower9.getClass();
        tower9.add((int) (byte) 1);
        tower5.moveTopTo(tower9);
        java.lang.Class<?> wildcardClass14 = tower9.getClass();
        tower1.moveTopTo(tower9);
        tower1.add((int) (short) 1);
        int int18 = tower1.index();
        java.lang.Class<?> wildcardClass19 = tower1.getClass();
        int int20 = tower1.index();
        tower1.add((int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test143");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        Tower tower11 = new Tower((-1));
        java.lang.Class<?> wildcardClass12 = tower11.getClass();
        tower11.add((int) (byte) 1);
        tower11.add(0);
        Tower tower18 = new Tower(0);
        tower11.moveTopTo(tower18);
        Tower tower21 = new Tower(1);
        tower6.moveDisks(1, tower18, tower21);
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add((int) (byte) 1);
        Tower tower30 = new Tower((-1));
        int int31 = tower30.index();
        tower25.moveTopTo(tower30);
        tower30.add(10);
        Tower tower37 = new Tower(0);
        tower37.add((-1));
        java.lang.Class<?> wildcardClass40 = tower37.getClass();
        Tower tower42 = new Tower((-1));
        java.lang.Class<?> wildcardClass43 = tower42.getClass();
        tower42.add(0);
        tower37.moveTopTo(tower42);
        Tower tower48 = new Tower((-1));
        int int49 = tower48.index();
        tower30.moveDisks(0, tower42, tower48);
        int int51 = tower30.index();
        Tower tower53 = new Tower(0);
        tower53.add((-1));
        Tower tower58 = new Tower((-1));
        Tower tower60 = new Tower((-1));
        java.lang.Class<?> wildcardClass61 = tower60.getClass();
        tower60.add((int) (byte) 1);
        tower53.moveDisks((int) (byte) -1, tower58, tower60);
        Tower tower66 = new Tower(0);
        int int67 = tower66.index();
        tower60.moveTopTo(tower66);
        tower6.moveDisks((int) (short) -1, tower30, tower60);
        int int70 = tower6.index();
        java.lang.Class<?> wildcardClass71 = tower6.getClass();
        int int72 = tower6.index();
        java.lang.Class<?> wildcardClass73 = tower6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test144");
        Tower tower1 = new Tower((-1));
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower(0);
        Tower tower8 = new Tower(0);
        tower8.add((-1));
        Tower tower12 = new Tower(0);
        tower8.moveTopTo(tower12);
        Tower tower16 = new Tower(0);
        tower16.add((-1));
        Tower tower20 = new Tower((-1));
        java.lang.Class<?> wildcardClass21 = tower20.getClass();
        tower20.add((int) (byte) 1);
        tower20.add(0);
        Tower tower27 = new Tower(0);
        tower20.moveTopTo(tower27);
        Tower tower30 = new Tower((-1));
        java.lang.Class<?> wildcardClass31 = tower30.getClass();
        tower30.add((int) (byte) 1);
        tower30.add(0);
        tower20.moveTopTo(tower30);
        tower12.moveDisks((int) (byte) -1, tower16, tower30);
        tower1.moveDisks((int) (short) -1, tower6, tower12);
        tower1.add((int) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test145");
        Tower tower1 = new Tower((-1));
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower(0);
        Tower tower8 = new Tower(0);
        tower8.add((-1));
        Tower tower12 = new Tower(0);
        tower8.moveTopTo(tower12);
        Tower tower16 = new Tower(0);
        tower16.add((-1));
        Tower tower20 = new Tower((-1));
        java.lang.Class<?> wildcardClass21 = tower20.getClass();
        tower20.add((int) (byte) 1);
        tower20.add(0);
        Tower tower27 = new Tower(0);
        tower20.moveTopTo(tower27);
        Tower tower30 = new Tower((-1));
        java.lang.Class<?> wildcardClass31 = tower30.getClass();
        tower30.add((int) (byte) 1);
        tower30.add(0);
        tower20.moveTopTo(tower30);
        tower12.moveDisks((int) (byte) -1, tower16, tower30);
        tower1.moveDisks((int) (short) -1, tower6, tower12);
        tower12.add((int) '#');
        java.lang.Class<?> wildcardClass41 = tower12.getClass();
        tower12.add(10);
        java.lang.Class<?> wildcardClass44 = tower12.getClass();
        tower12.add(35);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test146");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = tower1.getClass();
        tower1.add((int) (byte) 100);
        Tower tower10 = new Tower(0);
        tower10.add((-1));
        tower10.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = tower10.getClass();
        tower10.add(1);
        Tower tower19 = new Tower(0);
        tower19.add((-1));
        Tower tower23 = new Tower(0);
        tower19.moveTopTo(tower23);
        Tower tower27 = new Tower(0);
        tower27.add((-1));
        Tower tower31 = new Tower((-1));
        java.lang.Class<?> wildcardClass32 = tower31.getClass();
        tower31.add((int) (byte) 1);
        tower31.add(0);
        Tower tower38 = new Tower(0);
        tower31.moveTopTo(tower38);
        Tower tower41 = new Tower((-1));
        java.lang.Class<?> wildcardClass42 = tower41.getClass();
        tower41.add((int) (byte) 1);
        tower41.add(0);
        tower31.moveTopTo(tower41);
        tower23.moveDisks((int) (byte) -1, tower27, tower41);
        java.lang.Class<?> wildcardClass49 = tower41.getClass();
        int int50 = tower41.index();
        java.lang.Class<?> wildcardClass51 = tower41.getClass();
        tower1.moveDisks((int) (byte) 0, tower10, tower41);
        tower10.add((int) (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test147");
        Tower tower1 = new Tower((-1));
        int int2 = tower1.index();
        tower1.add(1);
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add((int) (byte) 1);
        Tower tower11 = new Tower((-1));
        int int12 = tower11.index();
        tower6.moveTopTo(tower11);
        Tower tower16 = new Tower(0);
        tower16.add((-1));
        tower16.add((int) (byte) 1);
        tower16.add((int) (byte) 1);
        Tower tower25 = new Tower(0);
        tower25.add((-1));
        java.lang.Class<?> wildcardClass28 = tower25.getClass();
        Tower tower30 = new Tower((-1));
        java.lang.Class<?> wildcardClass31 = tower30.getClass();
        tower30.add(0);
        tower25.moveTopTo(tower30);
        Tower tower36 = new Tower(0);
        tower36.add((-1));
        Tower tower40 = new Tower((-1));
        java.lang.Class<?> wildcardClass41 = tower40.getClass();
        tower40.add((int) (byte) 1);
        tower36.moveTopTo(tower40);
        tower16.moveDisks((int) (short) 1, tower30, tower36);
        java.lang.Class<?> wildcardClass46 = tower30.getClass();
        java.lang.Class<?> wildcardClass47 = tower30.getClass();
        Tower tower49 = new Tower((-1));
        int int50 = tower49.index();
        tower49.add(1);
        tower11.moveDisks(1, tower30, tower49);
        tower30.add((int) '4');
        tower1.moveTopTo(tower30);
        tower1.add((int) (byte) 10);
        tower1.add(1);
        tower1.add(0);
        Tower tower64 = new Tower(0);
        tower64.add((-1));
        Tower tower68 = new Tower(0);
        tower64.moveTopTo(tower68);
        int int70 = tower68.index();
        Tower tower72 = new Tower(0);
        tower72.add((-1));
        java.lang.Class<?> wildcardClass75 = tower72.getClass();
        int int76 = tower72.index();
        tower68.moveTopTo(tower72);
        java.lang.Class<?> wildcardClass78 = tower72.getClass();
        tower72.add((int) (byte) 0);
        tower72.add((int) (short) 100);
        tower1.moveTopTo(tower72);
        java.lang.Class<?> wildcardClass84 = tower72.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test148");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower6.add(0);
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add((int) (byte) 1);
        tower15.add(0);
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = tower22.getClass();
        tower6.moveDisks((int) (short) 0, tower15, tower22);
        Tower tower29 = new Tower(100);
        tower6.moveTopTo(tower29);
        java.lang.Class<?> wildcardClass31 = tower6.getClass();
        tower6.add((int) (short) 1);
        tower6.add((int) (byte) 1);
        Tower tower37 = new Tower((int) (byte) -1);
        int int38 = tower37.index();
        int int39 = tower37.index();
        tower6.moveTopTo(tower37);
        tower37.add((int) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test149");
        Tower tower1 = new Tower(0);
        tower1.add((int) (byte) 10);
        Tower tower6 = new Tower((-1));
        Tower tower8 = new Tower(0);
        tower8.add((-1));
        tower8.add((int) (byte) 1);
        tower8.add((int) (byte) 1);
        Tower tower17 = new Tower(0);
        tower17.add((-1));
        java.lang.Class<?> wildcardClass20 = tower17.getClass();
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add(0);
        tower17.moveTopTo(tower22);
        Tower tower28 = new Tower(0);
        tower28.add((-1));
        Tower tower32 = new Tower((-1));
        java.lang.Class<?> wildcardClass33 = tower32.getClass();
        tower32.add((int) (byte) 1);
        tower28.moveTopTo(tower32);
        tower8.moveDisks((int) (short) 1, tower22, tower28);
        java.lang.Class<?> wildcardClass38 = tower22.getClass();
        java.lang.Class<?> wildcardClass39 = tower22.getClass();
        tower1.moveDisks((-1), tower6, tower22);
        int int41 = tower6.index();
        tower6.add(32);
        java.lang.Class<?> wildcardClass44 = tower6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test150");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        Tower tower11 = new Tower(0);
        tower11.add((-1));
        tower11.add((int) (byte) 1);
        tower11.add((int) (byte) 1);
        Tower tower20 = new Tower(0);
        tower20.add((-1));
        java.lang.Class<?> wildcardClass23 = tower20.getClass();
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add(0);
        tower20.moveTopTo(tower25);
        Tower tower31 = new Tower(0);
        tower31.add((-1));
        Tower tower35 = new Tower((-1));
        java.lang.Class<?> wildcardClass36 = tower35.getClass();
        tower35.add((int) (byte) 1);
        tower31.moveTopTo(tower35);
        tower11.moveDisks((int) (short) 1, tower25, tower31);
        java.lang.Class<?> wildcardClass41 = tower25.getClass();
        java.lang.Class<?> wildcardClass42 = tower25.getClass();
        Tower tower44 = new Tower((-1));
        int int45 = tower44.index();
        tower44.add(1);
        tower6.moveDisks(1, tower25, tower44);
        Tower tower50 = new Tower(0);
        int int51 = tower50.index();
        tower25.moveTopTo(tower50);
        Tower tower54 = new Tower((-1));
        java.lang.Class<?> wildcardClass55 = tower54.getClass();
        tower54.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass58 = tower54.getClass();
        int int59 = tower54.index();
        tower54.add(100);
        Tower tower63 = new Tower(0);
        tower63.add((-1));
        tower63.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass68 = tower63.getClass();
        tower63.add(1);
        tower63.add((int) (byte) -1);
        java.lang.Class<?> wildcardClass73 = tower63.getClass();
        tower54.moveTopTo(tower63);
        tower50.moveTopTo(tower63);
        tower50.add((int) (byte) 0);
        int int78 = tower50.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test151");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        tower6.add(10);
        Tower tower13 = new Tower(0);
        tower13.add((-1));
        java.lang.Class<?> wildcardClass16 = tower13.getClass();
        Tower tower18 = new Tower((-1));
        java.lang.Class<?> wildcardClass19 = tower18.getClass();
        tower18.add(0);
        tower13.moveTopTo(tower18);
        Tower tower24 = new Tower((-1));
        int int25 = tower24.index();
        tower6.moveDisks(0, tower18, tower24);
        int int27 = tower6.index();
        java.lang.Class<?> wildcardClass28 = tower6.getClass();
        java.lang.Class<?> wildcardClass29 = tower6.getClass();
        java.lang.Class<?> wildcardClass30 = tower6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test152");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        Tower tower7 = new Tower((int) (byte) 0);
        tower1.moveTopTo(tower7);
        Tower tower11 = new Tower(0);
        tower11.add((-1));
        java.lang.Class<?> wildcardClass14 = tower11.getClass();
        Tower tower16 = new Tower((-1));
        java.lang.Class<?> wildcardClass17 = tower16.getClass();
        tower16.add(0);
        tower11.moveTopTo(tower16);
        tower11.add((int) 'a');
        Tower tower24 = new Tower(0);
        tower24.add((-1));
        Tower tower29 = new Tower((-1));
        Tower tower31 = new Tower((-1));
        java.lang.Class<?> wildcardClass32 = tower31.getClass();
        tower31.add((int) (byte) 1);
        tower24.moveDisks((int) (byte) -1, tower29, tower31);
        Tower tower37 = new Tower(0);
        tower37.add((-1));
        Tower tower42 = new Tower((-1));
        Tower tower44 = new Tower((-1));
        java.lang.Class<?> wildcardClass45 = tower44.getClass();
        tower44.add((int) (byte) 1);
        tower37.moveDisks((int) (byte) -1, tower42, tower44);
        Tower tower50 = new Tower(0);
        int int51 = tower50.index();
        tower44.moveTopTo(tower50);
        tower24.moveTopTo(tower44);
        tower1.moveDisks((int) (byte) -1, tower11, tower24);
        int int55 = tower11.index();
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test153");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        tower1.add((int) (byte) 1);
        Tower tower10 = new Tower(0);
        tower10.add((-1));
        java.lang.Class<?> wildcardClass13 = tower10.getClass();
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add(0);
        tower10.moveTopTo(tower15);
        Tower tower21 = new Tower(0);
        tower21.add((-1));
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add((int) (byte) 1);
        tower21.moveTopTo(tower25);
        tower1.moveDisks((int) (short) 1, tower15, tower21);
        java.lang.Class<?> wildcardClass31 = tower15.getClass();
        Tower tower33 = new Tower((-1));
        java.lang.Class<?> wildcardClass34 = tower33.getClass();
        tower33.add((int) (byte) 1);
        Tower tower38 = new Tower((-1));
        int int39 = tower38.index();
        tower33.moveTopTo(tower38);
        tower38.add(10);
        Tower tower45 = new Tower(0);
        tower45.add((-1));
        java.lang.Class<?> wildcardClass48 = tower45.getClass();
        Tower tower50 = new Tower((-1));
        java.lang.Class<?> wildcardClass51 = tower50.getClass();
        tower50.add(0);
        tower45.moveTopTo(tower50);
        Tower tower56 = new Tower((-1));
        int int57 = tower56.index();
        tower38.moveDisks(0, tower50, tower56);
        tower15.moveTopTo(tower50);
        Tower tower61 = new Tower(0);
        tower61.add((-1));
        tower61.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass66 = tower61.getClass();
        tower15.moveTopTo(tower61);
        tower61.add((int) (short) 1);
        int int70 = tower61.index();
        Tower tower72 = new Tower(0);
        tower72.add((-1));
        java.lang.Class<?> wildcardClass75 = tower72.getClass();
        Tower tower77 = new Tower((-1));
        java.lang.Class<?> wildcardClass78 = tower77.getClass();
        tower77.add(0);
        tower72.moveTopTo(tower77);
        java.lang.Class<?> wildcardClass82 = tower72.getClass();
        java.lang.Class<?> wildcardClass83 = tower72.getClass();
        tower61.moveTopTo(tower72);
        int int85 = tower61.index();
        tower61.add(100);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test154");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower6 = new Tower((-1));
        Tower tower8 = new Tower((-1));
        java.lang.Class<?> wildcardClass9 = tower8.getClass();
        tower8.add((int) (byte) 1);
        tower1.moveDisks((int) (byte) -1, tower6, tower8);
        java.lang.Class<?> wildcardClass13 = tower1.getClass();
        int int14 = tower1.index();
        Tower tower17 = new Tower((int) (byte) -1);
        Tower tower19 = new Tower(0);
        tower19.add((-1));
        java.lang.Class<?> wildcardClass22 = tower19.getClass();
        Tower tower24 = new Tower((-1));
        java.lang.Class<?> wildcardClass25 = tower24.getClass();
        tower24.add(0);
        tower19.moveTopTo(tower24);
        tower24.add(0);
        Tower tower33 = new Tower((-1));
        java.lang.Class<?> wildcardClass34 = tower33.getClass();
        tower33.add((int) (byte) 1);
        tower33.add(0);
        Tower tower40 = new Tower((-1));
        java.lang.Class<?> wildcardClass41 = tower40.getClass();
        tower40.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass44 = tower40.getClass();
        tower24.moveDisks((int) (short) 0, tower33, tower40);
        java.lang.Class<?> wildcardClass46 = tower40.getClass();
        Tower tower48 = new Tower((int) (byte) 0);
        tower40.moveTopTo(tower48);
        tower40.add((int) (byte) 10);
        tower1.moveDisks((-1), tower17, tower40);
        int int53 = tower1.index();
        java.lang.Class<?> wildcardClass54 = tower1.getClass();
        tower1.add((int) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test155");
        Tower tower1 = new Tower(0);
        tower1.add((int) (byte) 10);
        Tower tower6 = new Tower((-1));
        Tower tower8 = new Tower(0);
        tower8.add((-1));
        tower8.add((int) (byte) 1);
        tower8.add((int) (byte) 1);
        Tower tower17 = new Tower(0);
        tower17.add((-1));
        java.lang.Class<?> wildcardClass20 = tower17.getClass();
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add(0);
        tower17.moveTopTo(tower22);
        Tower tower28 = new Tower(0);
        tower28.add((-1));
        Tower tower32 = new Tower((-1));
        java.lang.Class<?> wildcardClass33 = tower32.getClass();
        tower32.add((int) (byte) 1);
        tower28.moveTopTo(tower32);
        tower8.moveDisks((int) (short) 1, tower22, tower28);
        java.lang.Class<?> wildcardClass38 = tower22.getClass();
        java.lang.Class<?> wildcardClass39 = tower22.getClass();
        tower1.moveDisks((-1), tower6, tower22);
        java.lang.Class<?> wildcardClass41 = tower1.getClass();
        tower1.add(0);
        java.lang.Class<?> wildcardClass44 = tower1.getClass();
        java.lang.Class<?> wildcardClass45 = tower1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test156");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        tower1.add(0);
        Tower tower8 = new Tower(0);
        tower1.moveTopTo(tower8);
        int int10 = tower1.index();
        java.lang.Class<?> wildcardClass11 = tower1.getClass();
        java.lang.Class<?> wildcardClass12 = tower1.getClass();
        Tower tower14 = new Tower((-1));
        java.lang.Class<?> wildcardClass15 = tower14.getClass();
        tower14.add((int) (byte) 1);
        tower14.add(0);
        Tower tower21 = new Tower(0);
        tower14.moveTopTo(tower21);
        Tower tower24 = new Tower((-1));
        java.lang.Class<?> wildcardClass25 = tower24.getClass();
        tower24.add((int) (byte) 1);
        tower24.add(0);
        tower14.moveTopTo(tower24);
        java.lang.Class<?> wildcardClass31 = tower14.getClass();
        tower1.moveTopTo(tower14);
        tower1.add(32);
        java.lang.Class<?> wildcardClass35 = tower1.getClass();
        int int36 = tower1.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test157");
        Tower tower1 = new Tower(10);
        int int2 = tower1.index();
        int int3 = tower1.index();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test158");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        tower1.add((int) (byte) 1);
        Tower tower10 = new Tower(0);
        tower10.add((-1));
        java.lang.Class<?> wildcardClass13 = tower10.getClass();
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add(0);
        tower10.moveTopTo(tower15);
        Tower tower21 = new Tower(0);
        tower21.add((-1));
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add((int) (byte) 1);
        tower21.moveTopTo(tower25);
        tower1.moveDisks((int) (short) 1, tower15, tower21);
        java.lang.Class<?> wildcardClass31 = tower15.getClass();
        Tower tower33 = new Tower((-1));
        java.lang.Class<?> wildcardClass34 = tower33.getClass();
        tower33.add((int) (byte) 1);
        Tower tower38 = new Tower((-1));
        int int39 = tower38.index();
        tower33.moveTopTo(tower38);
        tower38.add(10);
        Tower tower45 = new Tower(0);
        tower45.add((-1));
        java.lang.Class<?> wildcardClass48 = tower45.getClass();
        Tower tower50 = new Tower((-1));
        java.lang.Class<?> wildcardClass51 = tower50.getClass();
        tower50.add(0);
        tower45.moveTopTo(tower50);
        Tower tower56 = new Tower((-1));
        int int57 = tower56.index();
        tower38.moveDisks(0, tower50, tower56);
        tower15.moveTopTo(tower50);
        int int60 = tower50.index();
        tower50.add(1);
        tower50.add((-1));
        tower50.add((int) (short) 0);
        java.lang.Class<?> wildcardClass67 = tower50.getClass();
        Tower tower69 = new Tower((-1));
        java.lang.Class<?> wildcardClass70 = tower69.getClass();
        tower69.add((int) (byte) 1);
        tower69.add(0);
        Tower tower76 = new Tower(0);
        tower69.moveTopTo(tower76);
        int int78 = tower69.index();
        java.lang.Class<?> wildcardClass79 = tower69.getClass();
        java.lang.Class<?> wildcardClass80 = tower69.getClass();
        int int81 = tower69.index();
        int int82 = tower69.index();
        tower69.add((int) (short) 10);
        tower50.moveTopTo(tower69);
        tower50.add(1);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test159");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        Tower tower11 = new Tower((-1));
        java.lang.Class<?> wildcardClass12 = tower11.getClass();
        tower11.add((int) (byte) 1);
        tower11.add(0);
        Tower tower18 = new Tower(0);
        tower11.moveTopTo(tower18);
        Tower tower21 = new Tower(1);
        tower6.moveDisks(1, tower18, tower21);
        Tower tower24 = new Tower((int) (short) 100);
        tower24.add((int) (short) -1);
        tower24.add((-1));
        int int29 = tower24.index();
        tower18.moveTopTo(tower24);
        int int31 = tower18.index();
        int int32 = tower18.index();
        tower18.add((int) (short) 10);
        tower18.add((-1));
        Tower tower38 = new Tower((int) (byte) 100);
        Tower tower41 = new Tower((int) (short) -1);
        int int42 = tower41.index();
        Tower tower43 = null;
        tower38.moveDisks((int) (short) -1, tower41, tower43);
        int int45 = tower38.index();
        tower18.moveTopTo(tower38);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test160");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        tower6.add(10);
        Tower tower13 = new Tower(0);
        tower13.add((-1));
        Tower tower17 = new Tower((-1));
        java.lang.Class<?> wildcardClass18 = tower17.getClass();
        tower17.add((int) (byte) 1);
        tower13.moveTopTo(tower17);
        Tower tower23 = new Tower((-1));
        java.lang.Class<?> wildcardClass24 = tower23.getClass();
        tower23.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = tower23.getClass();
        tower6.moveDisks((int) (short) 0, tower13, tower23);
        int int29 = tower13.index();
        tower13.add(10);
        int int32 = tower13.index();
        Tower tower34 = new Tower(0);
        tower34.add((-1));
        java.lang.Class<?> wildcardClass37 = tower34.getClass();
        java.lang.Class<?> wildcardClass38 = tower34.getClass();
        int int39 = tower34.index();
        Tower tower41 = new Tower((int) (byte) 0);
        tower41.add((-1));
        Tower tower45 = new Tower(0);
        tower45.add((-1));
        Tower tower49 = new Tower((-1));
        java.lang.Class<?> wildcardClass50 = tower49.getClass();
        tower49.add((int) (byte) 1);
        tower45.moveTopTo(tower49);
        java.lang.Class<?> wildcardClass54 = tower49.getClass();
        tower41.moveTopTo(tower49);
        tower34.moveTopTo(tower41);
        tower13.moveTopTo(tower41);
        java.lang.Class<?> wildcardClass58 = tower41.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test161");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower6 = new Tower((-1));
        Tower tower8 = new Tower((-1));
        java.lang.Class<?> wildcardClass9 = tower8.getClass();
        tower8.add((int) (byte) 1);
        tower1.moveDisks((int) (byte) -1, tower6, tower8);
        int int13 = tower6.index();
        int int14 = tower6.index();
        java.lang.Class<?> wildcardClass15 = tower6.getClass();
        int int16 = tower6.index();
        tower6.add(10);
        Tower tower20 = new Tower(0);
        tower20.add((-1));
        java.lang.Class<?> wildcardClass23 = tower20.getClass();
        int int24 = tower20.index();
        int int25 = tower20.index();
        java.lang.Class<?> wildcardClass26 = tower20.getClass();
        tower20.add(10);
        tower6.moveTopTo(tower20);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test162");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        tower1.add((int) (byte) 1);
        Tower tower10 = new Tower(0);
        tower10.add((-1));
        java.lang.Class<?> wildcardClass13 = tower10.getClass();
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add(0);
        tower10.moveTopTo(tower15);
        Tower tower21 = new Tower(0);
        tower21.add((-1));
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add((int) (byte) 1);
        tower21.moveTopTo(tower25);
        tower1.moveDisks((int) (short) 1, tower15, tower21);
        java.lang.Class<?> wildcardClass31 = tower15.getClass();
        Tower tower33 = new Tower((-1));
        java.lang.Class<?> wildcardClass34 = tower33.getClass();
        tower33.add((int) (byte) 1);
        Tower tower38 = new Tower((-1));
        int int39 = tower38.index();
        tower33.moveTopTo(tower38);
        tower38.add(10);
        Tower tower45 = new Tower(0);
        tower45.add((-1));
        java.lang.Class<?> wildcardClass48 = tower45.getClass();
        Tower tower50 = new Tower((-1));
        java.lang.Class<?> wildcardClass51 = tower50.getClass();
        tower50.add(0);
        tower45.moveTopTo(tower50);
        Tower tower56 = new Tower((-1));
        int int57 = tower56.index();
        tower38.moveDisks(0, tower50, tower56);
        tower15.moveTopTo(tower50);
        Tower tower61 = new Tower(0);
        int int62 = tower61.index();
        tower50.moveTopTo(tower61);
        Tower tower65 = new Tower(0);
        tower65.add((-1));
        tower65.add((int) (short) 0);
        tower50.moveTopTo(tower65);
        int int71 = tower65.index();
        java.lang.Class<?> wildcardClass72 = tower65.getClass();
        int int73 = tower65.index();
        int int74 = tower65.index();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test163");
        Tower tower1 = new Tower((int) (byte) 0);
        tower1.add((-1));
        Tower tower5 = new Tower((-1));
        java.lang.Class<?> wildcardClass6 = tower5.getClass();
        tower5.add((int) (byte) 1);
        Tower tower10 = new Tower((-1));
        int int11 = tower10.index();
        tower5.moveTopTo(tower10);
        tower10.add(10);
        tower1.moveTopTo(tower10);
        Tower tower17 = new Tower(0);
        tower17.add((-1));
        tower17.add((int) (byte) 1);
        tower17.add((int) (byte) 1);
        Tower tower26 = new Tower(0);
        tower26.add((-1));
        java.lang.Class<?> wildcardClass29 = tower26.getClass();
        Tower tower31 = new Tower((-1));
        java.lang.Class<?> wildcardClass32 = tower31.getClass();
        tower31.add(0);
        tower26.moveTopTo(tower31);
        Tower tower37 = new Tower(0);
        tower37.add((-1));
        Tower tower41 = new Tower((-1));
        java.lang.Class<?> wildcardClass42 = tower41.getClass();
        tower41.add((int) (byte) 1);
        tower37.moveTopTo(tower41);
        tower17.moveDisks((int) (short) 1, tower31, tower37);
        java.lang.Class<?> wildcardClass47 = tower31.getClass();
        Tower tower49 = new Tower((-1));
        java.lang.Class<?> wildcardClass50 = tower49.getClass();
        tower49.add((int) (byte) 1);
        Tower tower54 = new Tower((-1));
        int int55 = tower54.index();
        tower49.moveTopTo(tower54);
        tower54.add(10);
        Tower tower61 = new Tower(0);
        tower61.add((-1));
        java.lang.Class<?> wildcardClass64 = tower61.getClass();
        Tower tower66 = new Tower((-1));
        java.lang.Class<?> wildcardClass67 = tower66.getClass();
        tower66.add(0);
        tower61.moveTopTo(tower66);
        Tower tower72 = new Tower((-1));
        int int73 = tower72.index();
        tower54.moveDisks(0, tower66, tower72);
        tower31.moveTopTo(tower66);
        int int76 = tower66.index();
        tower66.add(1);
        java.lang.Class<?> wildcardClass79 = tower66.getClass();
        tower10.moveTopTo(tower66);
        int int81 = tower66.index();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test164");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        tower1.add(0);
        tower1.add(0);
        java.lang.Class<?> wildcardClass9 = tower1.getClass();
        tower1.add(0);
        Tower tower13 = new Tower((-1));
        java.lang.Class<?> wildcardClass14 = tower13.getClass();
        tower13.add((int) (byte) 1);
        Tower tower18 = new Tower((-1));
        int int19 = tower18.index();
        tower13.moveTopTo(tower18);
        tower18.add(10);
        Tower tower25 = new Tower(0);
        tower25.add((-1));
        java.lang.Class<?> wildcardClass28 = tower25.getClass();
        Tower tower30 = new Tower((-1));
        java.lang.Class<?> wildcardClass31 = tower30.getClass();
        tower30.add(0);
        tower25.moveTopTo(tower30);
        Tower tower36 = new Tower((-1));
        int int37 = tower36.index();
        tower18.moveDisks(0, tower30, tower36);
        tower36.add((int) (short) 100);
        java.lang.Class<?> wildcardClass41 = tower36.getClass();
        tower1.moveTopTo(tower36);
        java.lang.Class<?> wildcardClass43 = tower1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test165");
        Tower tower1 = new Tower(97);
        tower1.add((int) (byte) 0);
        tower1.add((int) (byte) 100);
        tower1.add(1);
        tower1.add(100);
        Tower tower11 = new Tower((-1));
        tower11.add((int) (byte) 1);
        Tower tower16 = new Tower(0);
        Tower tower18 = new Tower(0);
        tower18.add((-1));
        Tower tower22 = new Tower(0);
        tower18.moveTopTo(tower22);
        Tower tower26 = new Tower(0);
        tower26.add((-1));
        Tower tower30 = new Tower((-1));
        java.lang.Class<?> wildcardClass31 = tower30.getClass();
        tower30.add((int) (byte) 1);
        tower30.add(0);
        Tower tower37 = new Tower(0);
        tower30.moveTopTo(tower37);
        Tower tower40 = new Tower((-1));
        java.lang.Class<?> wildcardClass41 = tower40.getClass();
        tower40.add((int) (byte) 1);
        tower40.add(0);
        tower30.moveTopTo(tower40);
        tower22.moveDisks((int) (byte) -1, tower26, tower40);
        tower11.moveDisks((int) (short) -1, tower16, tower22);
        tower22.add((int) '#');
        tower1.moveTopTo(tower22);
        java.lang.Class<?> wildcardClass52 = tower22.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test166");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        tower1.add((int) (byte) 1);
        Tower tower10 = new Tower(0);
        tower10.add((-1));
        java.lang.Class<?> wildcardClass13 = tower10.getClass();
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add(0);
        tower10.moveTopTo(tower15);
        Tower tower21 = new Tower(0);
        tower21.add((-1));
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add((int) (byte) 1);
        tower21.moveTopTo(tower25);
        tower1.moveDisks((int) (short) 1, tower15, tower21);
        java.lang.Class<?> wildcardClass31 = tower15.getClass();
        java.lang.Class<?> wildcardClass32 = tower15.getClass();
        java.lang.Class<?> wildcardClass33 = tower15.getClass();
        int int34 = tower15.index();
        tower15.add(0);
        Tower tower38 = new Tower(0);
        tower38.add((-1));
        tower38.add((int) (byte) 1);
        tower15.moveTopTo(tower38);
        java.lang.Class<?> wildcardClass44 = tower38.getClass();
        tower38.add((int) (short) 1);
        Tower tower48 = new Tower(0);
        tower48.add((-1));
        java.lang.Class<?> wildcardClass51 = tower48.getClass();
        Tower tower53 = new Tower((-1));
        java.lang.Class<?> wildcardClass54 = tower53.getClass();
        tower53.add(0);
        tower48.moveTopTo(tower53);
        tower53.add(0);
        Tower tower62 = new Tower((-1));
        java.lang.Class<?> wildcardClass63 = tower62.getClass();
        tower62.add((int) (byte) 1);
        tower62.add(0);
        Tower tower69 = new Tower((-1));
        java.lang.Class<?> wildcardClass70 = tower69.getClass();
        tower69.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass73 = tower69.getClass();
        tower53.moveDisks((int) (short) 0, tower62, tower69);
        int int75 = tower62.index();
        java.lang.Class<?> wildcardClass76 = tower62.getClass();
        java.lang.Class<?> wildcardClass77 = tower62.getClass();
        int int78 = tower62.index();
        java.lang.Class<?> wildcardClass79 = tower62.getClass();
        tower38.moveTopTo(tower62);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test167");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        Tower tower7 = new Tower((int) (byte) 0);
        tower1.moveTopTo(tower7);
        java.lang.Class<?> wildcardClass9 = tower7.getClass();
        tower7.add((int) '#');
        java.lang.Class<?> wildcardClass12 = tower7.getClass();
        Tower tower14 = new Tower(0);
        tower14.add((-1));
        tower14.add((int) (byte) 1);
        tower14.add((int) (byte) 1);
        Tower tower23 = new Tower(0);
        tower23.add((-1));
        java.lang.Class<?> wildcardClass26 = tower23.getClass();
        Tower tower28 = new Tower((-1));
        java.lang.Class<?> wildcardClass29 = tower28.getClass();
        tower28.add(0);
        tower23.moveTopTo(tower28);
        Tower tower34 = new Tower(0);
        tower34.add((-1));
        Tower tower38 = new Tower((-1));
        java.lang.Class<?> wildcardClass39 = tower38.getClass();
        tower38.add((int) (byte) 1);
        tower34.moveTopTo(tower38);
        tower14.moveDisks((int) (short) 1, tower28, tower34);
        java.lang.Class<?> wildcardClass44 = tower28.getClass();
        Tower tower46 = new Tower((-1));
        java.lang.Class<?> wildcardClass47 = tower46.getClass();
        tower46.add((int) (byte) 1);
        Tower tower51 = new Tower((-1));
        int int52 = tower51.index();
        tower46.moveTopTo(tower51);
        tower51.add(10);
        Tower tower58 = new Tower(0);
        tower58.add((-1));
        java.lang.Class<?> wildcardClass61 = tower58.getClass();
        Tower tower63 = new Tower((-1));
        java.lang.Class<?> wildcardClass64 = tower63.getClass();
        tower63.add(0);
        tower58.moveTopTo(tower63);
        Tower tower69 = new Tower((-1));
        int int70 = tower69.index();
        tower51.moveDisks(0, tower63, tower69);
        tower28.moveTopTo(tower63);
        int int73 = tower63.index();
        tower63.add(1);
        Tower tower77 = new Tower(0);
        tower63.moveTopTo(tower77);
        tower63.add((int) (byte) 1);
        tower7.moveTopTo(tower63);
        tower63.add((int) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test168");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        tower1.add(0);
        Tower tower8 = new Tower(0);
        tower8.add((-1));
        java.lang.Class<?> wildcardClass11 = tower8.getClass();
        tower1.moveTopTo(tower8);
        Tower tower15 = new Tower(0);
        tower15.add((-1));
        tower15.add((int) (byte) 1);
        tower15.add((int) (byte) 1);
        Tower tower24 = new Tower(0);
        tower24.add((-1));
        java.lang.Class<?> wildcardClass27 = tower24.getClass();
        Tower tower29 = new Tower((-1));
        java.lang.Class<?> wildcardClass30 = tower29.getClass();
        tower29.add(0);
        tower24.moveTopTo(tower29);
        Tower tower35 = new Tower(0);
        tower35.add((-1));
        Tower tower39 = new Tower((-1));
        java.lang.Class<?> wildcardClass40 = tower39.getClass();
        tower39.add((int) (byte) 1);
        tower35.moveTopTo(tower39);
        tower15.moveDisks((int) (short) 1, tower29, tower35);
        Tower tower46 = new Tower((-1));
        java.lang.Class<?> wildcardClass47 = tower46.getClass();
        tower46.add((int) (byte) 1);
        Tower tower51 = new Tower((-1));
        int int52 = tower51.index();
        tower46.moveTopTo(tower51);
        tower51.add(10);
        Tower tower58 = new Tower(0);
        tower58.add((-1));
        java.lang.Class<?> wildcardClass61 = tower58.getClass();
        Tower tower63 = new Tower((-1));
        java.lang.Class<?> wildcardClass64 = tower63.getClass();
        tower63.add(0);
        tower58.moveTopTo(tower63);
        Tower tower69 = new Tower((-1));
        int int70 = tower69.index();
        tower51.moveDisks(0, tower63, tower69);
        tower8.moveDisks((int) (byte) 0, tower29, tower63);
        java.lang.Class<?> wildcardClass73 = tower63.getClass();
        java.lang.Class<?> wildcardClass74 = tower63.getClass();
        int int75 = tower63.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test169");
        Tower tower1 = new Tower((int) 'a');
        tower1.add((int) (byte) 1);
        Tower tower5 = new Tower((-1));
        java.lang.Class<?> wildcardClass6 = tower5.getClass();
        tower5.add((int) (byte) 1);
        Tower tower10 = new Tower((-1));
        int int11 = tower10.index();
        tower5.moveTopTo(tower10);
        Tower tower15 = new Tower(0);
        tower15.add((-1));
        tower15.add((int) (byte) 1);
        tower15.add((int) (byte) 1);
        Tower tower24 = new Tower(0);
        tower24.add((-1));
        java.lang.Class<?> wildcardClass27 = tower24.getClass();
        Tower tower29 = new Tower((-1));
        java.lang.Class<?> wildcardClass30 = tower29.getClass();
        tower29.add(0);
        tower24.moveTopTo(tower29);
        Tower tower35 = new Tower(0);
        tower35.add((-1));
        Tower tower39 = new Tower((-1));
        java.lang.Class<?> wildcardClass40 = tower39.getClass();
        tower39.add((int) (byte) 1);
        tower35.moveTopTo(tower39);
        tower15.moveDisks((int) (short) 1, tower29, tower35);
        java.lang.Class<?> wildcardClass45 = tower29.getClass();
        java.lang.Class<?> wildcardClass46 = tower29.getClass();
        Tower tower48 = new Tower((-1));
        int int49 = tower48.index();
        tower48.add(1);
        tower10.moveDisks(1, tower29, tower48);
        tower29.add((int) '4');
        tower1.moveTopTo(tower29);
        Tower tower57 = new Tower((-1));
        java.lang.Class<?> wildcardClass58 = tower57.getClass();
        tower57.add((int) (byte) 1);
        Tower tower62 = new Tower((-1));
        int int63 = tower62.index();
        tower57.moveTopTo(tower62);
        tower62.add(10);
        Tower tower69 = new Tower(0);
        tower69.add((-1));
        Tower tower73 = new Tower((-1));
        java.lang.Class<?> wildcardClass74 = tower73.getClass();
        tower73.add((int) (byte) 1);
        tower69.moveTopTo(tower73);
        Tower tower79 = new Tower((-1));
        java.lang.Class<?> wildcardClass80 = tower79.getClass();
        tower79.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass83 = tower79.getClass();
        tower62.moveDisks((int) (short) 0, tower69, tower79);
        int int85 = tower69.index();
        tower69.add(10);
        java.lang.Class<?> wildcardClass88 = tower69.getClass();
        int int89 = tower69.index();
        try {
            tower1.moveTopTo(tower69);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test170");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        Tower tower11 = new Tower((-1));
        java.lang.Class<?> wildcardClass12 = tower11.getClass();
        tower11.add((int) (byte) 1);
        tower11.add(0);
        Tower tower18 = new Tower(0);
        tower11.moveTopTo(tower18);
        Tower tower21 = new Tower(1);
        tower6.moveDisks(1, tower18, tower21);
        Tower tower24 = new Tower((int) (short) 100);
        tower24.add((int) (short) -1);
        tower24.add((-1));
        int int29 = tower24.index();
        tower18.moveTopTo(tower24);
        int int31 = tower18.index();
        int int32 = tower18.index();
        tower18.add(0);
        int int35 = tower18.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test171");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower6 = new Tower((-1));
        Tower tower8 = new Tower((-1));
        java.lang.Class<?> wildcardClass9 = tower8.getClass();
        tower8.add((int) (byte) 1);
        tower1.moveDisks((int) (byte) -1, tower6, tower8);
        java.lang.Class<?> wildcardClass13 = tower1.getClass();
        java.lang.Class<?> wildcardClass14 = tower1.getClass();
        java.lang.Class<?> wildcardClass15 = tower1.getClass();
        Tower tower18 = new Tower(0);
        tower18.add((-1));
        java.lang.Class<?> wildcardClass21 = tower18.getClass();
        Tower tower23 = new Tower((-1));
        java.lang.Class<?> wildcardClass24 = tower23.getClass();
        tower23.add(0);
        tower18.moveTopTo(tower23);
        java.lang.Class<?> wildcardClass28 = tower18.getClass();
        int int29 = tower18.index();
        tower18.add((int) (short) 1);
        Tower tower33 = new Tower(0);
        tower33.add((-1));
        tower33.add((int) (byte) 1);
        tower33.add((int) (byte) 1);
        Tower tower42 = new Tower(0);
        tower42.add((-1));
        java.lang.Class<?> wildcardClass45 = tower42.getClass();
        Tower tower47 = new Tower((-1));
        java.lang.Class<?> wildcardClass48 = tower47.getClass();
        tower47.add(0);
        tower42.moveTopTo(tower47);
        Tower tower53 = new Tower(0);
        tower53.add((-1));
        Tower tower57 = new Tower((-1));
        java.lang.Class<?> wildcardClass58 = tower57.getClass();
        tower57.add((int) (byte) 1);
        tower53.moveTopTo(tower57);
        tower33.moveDisks((int) (short) 1, tower47, tower53);
        java.lang.Class<?> wildcardClass63 = tower47.getClass();
        Tower tower65 = new Tower((-1));
        java.lang.Class<?> wildcardClass66 = tower65.getClass();
        tower65.add((int) (byte) 1);
        Tower tower70 = new Tower((-1));
        int int71 = tower70.index();
        tower65.moveTopTo(tower70);
        tower70.add(10);
        Tower tower77 = new Tower(0);
        tower77.add((-1));
        java.lang.Class<?> wildcardClass80 = tower77.getClass();
        Tower tower82 = new Tower((-1));
        java.lang.Class<?> wildcardClass83 = tower82.getClass();
        tower82.add(0);
        tower77.moveTopTo(tower82);
        Tower tower88 = new Tower((-1));
        int int89 = tower88.index();
        tower70.moveDisks(0, tower82, tower88);
        tower47.moveTopTo(tower82);
        tower47.add(1);
        tower1.moveDisks((int) (byte) -1, tower18, tower47);
        java.lang.Class<?> wildcardClass95 = tower47.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test172");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = tower1.getClass();
        tower1.add(1);
        tower1.add((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = tower1.getClass();
        Tower tower14 = new Tower((-1));
        java.lang.Class<?> wildcardClass15 = tower14.getClass();
        tower14.add((int) (byte) 1);
        tower14.add(0);
        int int20 = tower14.index();
        Tower tower23 = new Tower(0);
        tower23.add((-1));
        tower23.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = tower23.getClass();
        Tower tower30 = new Tower((-1));
        tower30.add(0);
        tower23.moveTopTo(tower30);
        Tower tower35 = new Tower(0);
        tower35.add((-1));
        Tower tower40 = new Tower((-1));
        Tower tower42 = new Tower((-1));
        java.lang.Class<?> wildcardClass43 = tower42.getClass();
        tower42.add((int) (byte) 1);
        tower35.moveDisks((int) (byte) -1, tower40, tower42);
        Tower tower48 = new Tower(0);
        int int49 = tower48.index();
        tower42.moveTopTo(tower48);
        tower14.moveDisks((int) (short) 1, tower23, tower42);
        int int52 = tower23.index();
        Tower tower54 = new Tower((int) 'a');
        tower54.add((int) (byte) 1);
        int int57 = tower54.index();
        Tower tower59 = new Tower(0);
        tower59.add((-1));
        Tower tower63 = new Tower(0);
        tower59.moveTopTo(tower63);
        Tower tower67 = new Tower(0);
        tower67.add((-1));
        Tower tower71 = new Tower((-1));
        java.lang.Class<?> wildcardClass72 = tower71.getClass();
        tower71.add((int) (byte) 1);
        tower71.add(0);
        Tower tower78 = new Tower(0);
        tower71.moveTopTo(tower78);
        Tower tower81 = new Tower((-1));
        java.lang.Class<?> wildcardClass82 = tower81.getClass();
        tower81.add((int) (byte) 1);
        tower81.add(0);
        tower71.moveTopTo(tower81);
        tower63.moveDisks((int) (byte) -1, tower67, tower81);
        java.lang.Class<?> wildcardClass89 = tower63.getClass();
        java.lang.Class<?> wildcardClass90 = tower63.getClass();
        tower54.moveTopTo(tower63);
        int int92 = tower63.index();
        java.lang.Class<?> wildcardClass93 = tower63.getClass();
        tower1.moveDisks(0, tower23, tower63);
        java.lang.Class<?> wildcardClass95 = tower63.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 97 + "'", int57 == 97);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test173");
        Tower tower1 = new Tower(10);
        int int2 = tower1.index();
        tower1.add((int) (byte) 1);
        int int5 = tower1.index();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test174");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = tower1.getClass();
        Tower tower8 = new Tower((-1));
        tower8.add(0);
        tower1.moveTopTo(tower8);
        java.lang.Class<?> wildcardClass12 = tower8.getClass();
        Tower tower14 = new Tower((-1));
        java.lang.Class<?> wildcardClass15 = tower14.getClass();
        tower14.add((int) (byte) 1);
        tower14.add(0);
        int int20 = tower14.index();
        Tower tower23 = new Tower(0);
        tower23.add((-1));
        tower23.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = tower23.getClass();
        Tower tower30 = new Tower((-1));
        tower30.add(0);
        tower23.moveTopTo(tower30);
        Tower tower35 = new Tower(0);
        tower35.add((-1));
        Tower tower40 = new Tower((-1));
        Tower tower42 = new Tower((-1));
        java.lang.Class<?> wildcardClass43 = tower42.getClass();
        tower42.add((int) (byte) 1);
        tower35.moveDisks((int) (byte) -1, tower40, tower42);
        Tower tower48 = new Tower(0);
        int int49 = tower48.index();
        tower42.moveTopTo(tower48);
        tower14.moveDisks((int) (short) 1, tower23, tower42);
        tower8.moveTopTo(tower42);
        java.lang.Class<?> wildcardClass53 = tower42.getClass();
        Tower tower56 = new Tower((-1));
        java.lang.Class<?> wildcardClass57 = tower56.getClass();
        tower56.add((int) (byte) 1);
        Tower tower61 = new Tower((-1));
        int int62 = tower61.index();
        tower56.moveTopTo(tower61);
        tower61.add((int) '#');
        java.lang.Class<?> wildcardClass66 = tower61.getClass();
        java.lang.Class<?> wildcardClass67 = tower61.getClass();
        Tower tower69 = new Tower((-1));
        java.lang.Class<?> wildcardClass70 = tower69.getClass();
        tower69.add(0);
        java.lang.Class<?> wildcardClass73 = tower69.getClass();
        try {
            tower42.moveDisks(52, tower61, tower69);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test175");
        Tower tower1 = new Tower((int) (short) 100);
        tower1.add((int) (short) -1);
        Tower tower5 = new Tower(0);
        tower5.add((-1));
        tower5.add((int) (byte) 1);
        Tower tower11 = new Tower((int) (byte) 0);
        tower5.moveTopTo(tower11);
        Tower tower15 = new Tower(0);
        tower15.add((-1));
        java.lang.Class<?> wildcardClass18 = tower15.getClass();
        Tower tower20 = new Tower((-1));
        java.lang.Class<?> wildcardClass21 = tower20.getClass();
        tower20.add(0);
        tower15.moveTopTo(tower20);
        tower15.add((int) 'a');
        Tower tower28 = new Tower(0);
        tower28.add((-1));
        Tower tower33 = new Tower((-1));
        Tower tower35 = new Tower((-1));
        java.lang.Class<?> wildcardClass36 = tower35.getClass();
        tower35.add((int) (byte) 1);
        tower28.moveDisks((int) (byte) -1, tower33, tower35);
        Tower tower41 = new Tower(0);
        tower41.add((-1));
        Tower tower46 = new Tower((-1));
        Tower tower48 = new Tower((-1));
        java.lang.Class<?> wildcardClass49 = tower48.getClass();
        tower48.add((int) (byte) 1);
        tower41.moveDisks((int) (byte) -1, tower46, tower48);
        Tower tower54 = new Tower(0);
        int int55 = tower54.index();
        tower48.moveTopTo(tower54);
        tower28.moveTopTo(tower48);
        tower5.moveDisks((int) (byte) -1, tower15, tower28);
        tower1.moveTopTo(tower15);
        tower15.add((int) (short) 0);
        tower15.add((int) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test176");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower1.add((int) (short) -1);
        Tower tower14 = new Tower(0);
        tower14.add((-1));
        tower14.add((int) (byte) 1);
        Tower tower20 = new Tower((int) (byte) 0);
        tower14.moveTopTo(tower20);
        java.lang.Class<?> wildcardClass22 = tower20.getClass();
        java.lang.Class<?> wildcardClass23 = tower20.getClass();
        tower1.moveTopTo(tower20);
        int int25 = tower1.index();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test177");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        tower1.add(0);
        Tower tower8 = new Tower(0);
        tower8.add((-1));
        java.lang.Class<?> wildcardClass11 = tower8.getClass();
        tower1.moveTopTo(tower8);
        Tower tower15 = new Tower((-1));
        Tower tower17 = new Tower((-1));
        tower17.add(0);
        tower1.moveDisks((int) (short) 0, tower15, tower17);
        tower15.add((int) (byte) 100);
        tower15.add((int) ' ');
        int int25 = tower15.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test178");
        Tower tower1 = new Tower((int) (short) 100);
        tower1.add((int) (short) -1);
        Tower tower5 = new Tower(0);
        tower5.add((-1));
        tower5.add((int) (byte) 1);
        tower5.add((int) (byte) 1);
        Tower tower14 = new Tower(0);
        tower14.add((-1));
        java.lang.Class<?> wildcardClass17 = tower14.getClass();
        Tower tower19 = new Tower((-1));
        java.lang.Class<?> wildcardClass20 = tower19.getClass();
        tower19.add(0);
        tower14.moveTopTo(tower19);
        Tower tower25 = new Tower(0);
        tower25.add((-1));
        Tower tower29 = new Tower((-1));
        java.lang.Class<?> wildcardClass30 = tower29.getClass();
        tower29.add((int) (byte) 1);
        tower25.moveTopTo(tower29);
        tower5.moveDisks((int) (short) 1, tower19, tower25);
        java.lang.Class<?> wildcardClass35 = tower19.getClass();
        Tower tower37 = new Tower((-1));
        java.lang.Class<?> wildcardClass38 = tower37.getClass();
        tower37.add((int) (byte) 1);
        Tower tower42 = new Tower((-1));
        int int43 = tower42.index();
        tower37.moveTopTo(tower42);
        tower42.add(10);
        Tower tower49 = new Tower(0);
        tower49.add((-1));
        java.lang.Class<?> wildcardClass52 = tower49.getClass();
        Tower tower54 = new Tower((-1));
        java.lang.Class<?> wildcardClass55 = tower54.getClass();
        tower54.add(0);
        tower49.moveTopTo(tower54);
        Tower tower60 = new Tower((-1));
        int int61 = tower60.index();
        tower42.moveDisks(0, tower54, tower60);
        tower19.moveTopTo(tower54);
        int int64 = tower54.index();
        tower54.add(1);
        Tower tower68 = new Tower(0);
        tower54.moveTopTo(tower68);
        Tower tower71 = new Tower(0);
        tower71.add((-1));
        tower71.add((int) (byte) 1);
        Tower tower77 = new Tower((int) (byte) 0);
        tower71.moveTopTo(tower77);
        java.lang.Class<?> wildcardClass79 = tower77.getClass();
        tower68.moveTopTo(tower77);
        tower77.add((int) (short) -1);
        tower1.moveTopTo(tower77);
        tower77.add((int) '#');
        tower77.add((int) (short) -1);
        int int88 = tower77.index();
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test179");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        tower6.add((int) '#');
        Tower tower12 = new Tower((-1));
        java.lang.Class<?> wildcardClass13 = tower12.getClass();
        tower12.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = tower12.getClass();
        int int17 = tower12.index();
        tower6.moveTopTo(tower12);
        int int19 = tower12.index();
        Tower tower21 = new Tower(0);
        tower21.add((-1));
        Tower tower25 = new Tower(0);
        tower21.moveTopTo(tower25);
        Tower tower29 = new Tower(0);
        tower29.add((-1));
        Tower tower33 = new Tower((-1));
        java.lang.Class<?> wildcardClass34 = tower33.getClass();
        tower33.add((int) (byte) 1);
        tower33.add(0);
        Tower tower40 = new Tower(0);
        tower33.moveTopTo(tower40);
        Tower tower43 = new Tower((-1));
        java.lang.Class<?> wildcardClass44 = tower43.getClass();
        tower43.add((int) (byte) 1);
        tower43.add(0);
        tower33.moveTopTo(tower43);
        tower25.moveDisks((int) (byte) -1, tower29, tower43);
        int int51 = tower25.index();
        Tower tower53 = new Tower(0);
        tower53.add((-1));
        tower53.add((int) (byte) 1);
        Tower tower59 = new Tower((int) (byte) 0);
        tower53.moveTopTo(tower59);
        tower25.moveTopTo(tower53);
        Tower tower63 = new Tower((-1));
        java.lang.Class<?> wildcardClass64 = tower63.getClass();
        tower63.add((int) (byte) 1);
        Tower tower68 = new Tower((-1));
        int int69 = tower68.index();
        tower63.moveTopTo(tower68);
        tower68.add(10);
        Tower tower75 = new Tower(0);
        tower75.add((-1));
        java.lang.Class<?> wildcardClass78 = tower75.getClass();
        Tower tower80 = new Tower((-1));
        java.lang.Class<?> wildcardClass81 = tower80.getClass();
        tower80.add(0);
        tower75.moveTopTo(tower80);
        Tower tower86 = new Tower((-1));
        int int87 = tower86.index();
        tower68.moveDisks(0, tower80, tower86);
        tower80.add((int) (byte) 100);
        tower53.moveTopTo(tower80);
        tower12.moveTopTo(tower53);
        java.lang.Class<?> wildcardClass93 = tower53.getClass();
        int int94 = tower53.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test180");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        tower6.add(10);
        Tower tower13 = new Tower(0);
        tower13.add((-1));
        Tower tower17 = new Tower((-1));
        java.lang.Class<?> wildcardClass18 = tower17.getClass();
        tower17.add((int) (byte) 1);
        tower13.moveTopTo(tower17);
        Tower tower23 = new Tower((-1));
        java.lang.Class<?> wildcardClass24 = tower23.getClass();
        tower23.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = tower23.getClass();
        tower6.moveDisks((int) (short) 0, tower13, tower23);
        tower6.add((int) '#');
        tower6.add((int) ' ');
        Tower tower34 = new Tower((-1));
        java.lang.Class<?> wildcardClass35 = tower34.getClass();
        tower34.add((int) (byte) 1);
        Tower tower39 = new Tower((-1));
        int int40 = tower39.index();
        tower34.moveTopTo(tower39);
        Tower tower44 = new Tower((-1));
        java.lang.Class<?> wildcardClass45 = tower44.getClass();
        tower44.add((int) (byte) 1);
        tower44.add(0);
        Tower tower51 = new Tower(0);
        tower44.moveTopTo(tower51);
        Tower tower54 = new Tower(1);
        tower39.moveDisks(1, tower51, tower54);
        tower54.add((int) '#');
        tower6.moveTopTo(tower54);
        Tower tower59 = null;
        try {
            tower6.moveTopTo(tower59);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test181");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        tower1.add((int) '4');
        java.lang.Class<?> wildcardClass7 = tower1.getClass();
        Tower tower9 = new Tower(0);
        tower9.add((-1));
        Tower tower13 = new Tower(0);
        tower9.moveTopTo(tower13);
        Tower tower17 = new Tower(0);
        tower17.add((-1));
        Tower tower21 = new Tower((-1));
        java.lang.Class<?> wildcardClass22 = tower21.getClass();
        tower21.add((int) (byte) 1);
        tower21.add(0);
        Tower tower28 = new Tower(0);
        tower21.moveTopTo(tower28);
        Tower tower31 = new Tower((-1));
        java.lang.Class<?> wildcardClass32 = tower31.getClass();
        tower31.add((int) (byte) 1);
        tower31.add(0);
        tower21.moveTopTo(tower31);
        tower13.moveDisks((int) (byte) -1, tower17, tower31);
        java.lang.Class<?> wildcardClass39 = tower31.getClass();
        int int40 = tower31.index();
        tower1.moveTopTo(tower31);
        java.lang.Class<?> wildcardClass42 = tower31.getClass();
        tower31.add(10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test182");
        Tower tower1 = new Tower((int) (byte) 100);
        Tower tower4 = new Tower((int) (short) -1);
        int int5 = tower4.index();
        Tower tower6 = null;
        tower1.moveDisks((int) (short) -1, tower4, tower6);
        int int8 = tower4.index();
        int int9 = tower4.index();
        Tower tower12 = new Tower((-1));
        tower12.add(0);
        int int15 = tower12.index();
        Tower tower17 = new Tower(0);
        tower17.add((-1));
        tower17.add((int) (byte) 1);
        Tower tower24 = new Tower((-1));
        java.lang.Class<?> wildcardClass25 = tower24.getClass();
        tower24.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = tower24.getClass();
        Tower tower30 = new Tower(0);
        tower30.add((-1));
        tower30.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass35 = tower30.getClass();
        Tower tower37 = new Tower((-1));
        tower37.add(0);
        tower30.moveTopTo(tower37);
        tower17.moveDisks((int) (short) 1, tower24, tower37);
        int int42 = tower37.index();
        int int43 = tower37.index();
        tower12.moveTopTo(tower37);
        Tower tower46 = new Tower((-1));
        java.lang.Class<?> wildcardClass47 = tower46.getClass();
        tower46.add((int) (byte) 1);
        tower46.add(0);
        Tower tower53 = new Tower(0);
        tower46.moveTopTo(tower53);
        int int55 = tower46.index();
        java.lang.Class<?> wildcardClass56 = tower46.getClass();
        java.lang.Class<?> wildcardClass57 = tower46.getClass();
        int int58 = tower46.index();
        int int59 = tower46.index();
        int int60 = tower46.index();
        java.lang.Class<?> wildcardClass61 = tower46.getClass();
        tower46.add((int) (short) -1);
        Tower tower65 = new Tower((-1));
        java.lang.Class<?> wildcardClass66 = tower65.getClass();
        tower65.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass69 = tower65.getClass();
        int int70 = tower65.index();
        java.lang.Class<?> wildcardClass71 = tower65.getClass();
        java.lang.Class<?> wildcardClass72 = tower65.getClass();
        tower46.moveTopTo(tower65);
        tower46.add((int) (short) 0);
        try {
            tower4.moveDisks(52, tower37, tower46);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test183");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        tower1.add((int) (byte) 1);
        Tower tower9 = new Tower((int) (byte) 0);
        tower9.add((-1));
        tower1.moveTopTo(tower9);
        java.lang.Class<?> wildcardClass13 = tower9.getClass();
        int int14 = tower9.index();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test184");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower5 = new Tower(0);
        tower1.moveTopTo(tower5);
        Tower tower9 = new Tower(0);
        tower9.add((-1));
        Tower tower13 = new Tower((-1));
        java.lang.Class<?> wildcardClass14 = tower13.getClass();
        tower13.add((int) (byte) 1);
        tower13.add(0);
        Tower tower20 = new Tower(0);
        tower13.moveTopTo(tower20);
        Tower tower23 = new Tower((-1));
        java.lang.Class<?> wildcardClass24 = tower23.getClass();
        tower23.add((int) (byte) 1);
        tower23.add(0);
        tower13.moveTopTo(tower23);
        tower5.moveDisks((int) (byte) -1, tower9, tower23);
        java.lang.Class<?> wildcardClass31 = tower23.getClass();
        int int32 = tower23.index();
        Tower tower34 = new Tower(0);
        tower34.add((-1));
        java.lang.Class<?> wildcardClass37 = tower34.getClass();
        Tower tower39 = new Tower((-1));
        java.lang.Class<?> wildcardClass40 = tower39.getClass();
        tower39.add(0);
        tower34.moveTopTo(tower39);
        tower39.add(0);
        Tower tower48 = new Tower((-1));
        java.lang.Class<?> wildcardClass49 = tower48.getClass();
        tower48.add((int) (byte) 1);
        tower48.add(0);
        Tower tower55 = new Tower((-1));
        java.lang.Class<?> wildcardClass56 = tower55.getClass();
        tower55.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass59 = tower55.getClass();
        tower39.moveDisks((int) (short) 0, tower48, tower55);
        Tower tower62 = new Tower(100);
        tower39.moveTopTo(tower62);
        java.lang.Class<?> wildcardClass64 = tower39.getClass();
        tower39.add((int) (short) 1);
        tower23.moveTopTo(tower39);
        Tower tower69 = null;
        Tower tower70 = null;
        try {
            tower39.moveDisks(97, tower69, tower70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test185");
        Tower tower1 = new Tower((-1));
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower(0);
        Tower tower8 = new Tower(0);
        tower8.add((-1));
        Tower tower12 = new Tower(0);
        tower8.moveTopTo(tower12);
        Tower tower16 = new Tower(0);
        tower16.add((-1));
        Tower tower20 = new Tower((-1));
        java.lang.Class<?> wildcardClass21 = tower20.getClass();
        tower20.add((int) (byte) 1);
        tower20.add(0);
        Tower tower27 = new Tower(0);
        tower20.moveTopTo(tower27);
        Tower tower30 = new Tower((-1));
        java.lang.Class<?> wildcardClass31 = tower30.getClass();
        tower30.add((int) (byte) 1);
        tower30.add(0);
        tower20.moveTopTo(tower30);
        tower12.moveDisks((int) (byte) -1, tower16, tower30);
        tower1.moveDisks((int) (short) -1, tower6, tower12);
        tower12.add(0);
        java.lang.Class<?> wildcardClass41 = tower12.getClass();
        int int42 = tower12.index();
        tower12.add((int) 'a');
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test186");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        tower1.add((int) '4');
        java.lang.Class<?> wildcardClass7 = tower1.getClass();
        java.lang.Class<?> wildcardClass8 = tower1.getClass();
        java.lang.Class<?> wildcardClass9 = tower1.getClass();
        Tower tower11 = new Tower((-1));
        java.lang.Class<?> wildcardClass12 = tower11.getClass();
        tower11.add((int) (byte) 1);
        tower11.add(0);
        Tower tower18 = new Tower(0);
        tower11.moveTopTo(tower18);
        Tower tower21 = new Tower((-1));
        java.lang.Class<?> wildcardClass22 = tower21.getClass();
        tower21.add((int) (byte) 1);
        tower21.add(0);
        tower11.moveTopTo(tower21);
        tower11.add((int) '4');
        Tower tower31 = new Tower(0);
        tower31.add((-1));
        Tower tower35 = new Tower(0);
        tower31.moveTopTo(tower35);
        tower11.moveTopTo(tower31);
        java.lang.Class<?> wildcardClass38 = tower31.getClass();
        int int39 = tower31.index();
        tower1.moveTopTo(tower31);
        tower1.add(0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test187");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower5 = new Tower(0);
        tower1.moveTopTo(tower5);
        int int7 = tower5.index();
        int int8 = tower5.index();
        java.lang.Class<?> wildcardClass9 = tower5.getClass();
        int int10 = tower5.index();
        java.lang.Class<?> wildcardClass11 = tower5.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test188");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        tower1.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = tower1.getClass();
        Tower tower8 = new Tower((-1));
        tower8.add(0);
        tower1.moveTopTo(tower8);
        java.lang.Class<?> wildcardClass12 = tower8.getClass();
        Tower tower14 = null;
        Tower tower16 = new Tower((-1));
        java.lang.Class<?> wildcardClass17 = tower16.getClass();
        tower16.add((int) (byte) 1);
        tower16.add(0);
        int int22 = tower16.index();
        Tower tower25 = new Tower(0);
        tower25.add((-1));
        tower25.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass30 = tower25.getClass();
        Tower tower32 = new Tower((-1));
        tower32.add(0);
        tower25.moveTopTo(tower32);
        Tower tower37 = new Tower(0);
        tower37.add((-1));
        Tower tower42 = new Tower((-1));
        Tower tower44 = new Tower((-1));
        java.lang.Class<?> wildcardClass45 = tower44.getClass();
        tower44.add((int) (byte) 1);
        tower37.moveDisks((int) (byte) -1, tower42, tower44);
        Tower tower50 = new Tower(0);
        int int51 = tower50.index();
        tower44.moveTopTo(tower50);
        tower16.moveDisks((int) (short) 1, tower25, tower44);
        java.lang.Class<?> wildcardClass54 = tower44.getClass();
        tower44.add(100);
        tower8.moveDisks((int) (byte) -1, tower14, tower44);
        tower44.add((int) (short) -1);
        java.lang.Class<?> wildcardClass60 = tower44.getClass();
        tower44.add(0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test189");
        Tower tower1 = new Tower((int) (byte) 0);
        tower1.add((-1));
        Tower tower5 = new Tower((-1));
        java.lang.Class<?> wildcardClass6 = tower5.getClass();
        tower5.add((int) (byte) 1);
        Tower tower10 = new Tower((-1));
        int int11 = tower10.index();
        tower5.moveTopTo(tower10);
        tower10.add(10);
        tower1.moveTopTo(tower10);
        Tower tower18 = new Tower((-1));
        java.lang.Class<?> wildcardClass19 = tower18.getClass();
        tower18.add((int) (byte) 1);
        Tower tower23 = new Tower((-1));
        int int24 = tower23.index();
        tower18.moveTopTo(tower23);
        tower23.add(10);
        Tower tower30 = new Tower(0);
        tower30.add((-1));
        Tower tower34 = new Tower((-1));
        java.lang.Class<?> wildcardClass35 = tower34.getClass();
        tower34.add((int) (byte) 1);
        tower30.moveTopTo(tower34);
        Tower tower40 = new Tower((-1));
        java.lang.Class<?> wildcardClass41 = tower40.getClass();
        tower40.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass44 = tower40.getClass();
        tower23.moveDisks((int) (short) 0, tower30, tower40);
        tower23.add((int) '#');
        int int48 = tower23.index();
        Tower tower50 = new Tower((-1));
        java.lang.Class<?> wildcardClass51 = tower50.getClass();
        tower50.add((int) (byte) 1);
        tower50.add(0);
        int int56 = tower50.index();
        tower1.moveDisks(0, tower23, tower50);
        int int58 = tower23.index();
        tower23.add((-1));
        java.lang.Class<?> wildcardClass61 = tower23.getClass();
        int int62 = tower23.index();
        int int63 = tower23.index();
        Tower tower65 = new Tower(0);
        tower65.add((-1));
        java.lang.Class<?> wildcardClass68 = tower65.getClass();
        Tower tower70 = new Tower((-1));
        java.lang.Class<?> wildcardClass71 = tower70.getClass();
        tower70.add(0);
        tower65.moveTopTo(tower70);
        tower70.add(0);
        Tower tower79 = new Tower((-1));
        java.lang.Class<?> wildcardClass80 = tower79.getClass();
        tower79.add((int) (byte) 1);
        tower79.add(0);
        Tower tower86 = new Tower((-1));
        java.lang.Class<?> wildcardClass87 = tower86.getClass();
        tower86.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass90 = tower86.getClass();
        tower70.moveDisks((int) (short) 0, tower79, tower86);
        Tower tower93 = new Tower(100);
        tower70.moveTopTo(tower93);
        int int95 = tower70.index();
        java.lang.Class<?> wildcardClass96 = tower70.getClass();
        tower23.moveTopTo(tower70);
        tower70.add(1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test190");
        Tower tower1 = new Tower((-1));
        java.lang.Class<?> wildcardClass2 = tower1.getClass();
        tower1.add((int) (byte) 1);
        Tower tower6 = new Tower((-1));
        int int7 = tower6.index();
        tower1.moveTopTo(tower6);
        tower6.add(10);
        Tower tower13 = new Tower(0);
        tower13.add((-1));
        Tower tower17 = new Tower((-1));
        java.lang.Class<?> wildcardClass18 = tower17.getClass();
        tower17.add((int) (byte) 1);
        tower13.moveTopTo(tower17);
        Tower tower23 = new Tower((-1));
        java.lang.Class<?> wildcardClass24 = tower23.getClass();
        tower23.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = tower23.getClass();
        tower6.moveDisks((int) (short) 0, tower13, tower23);
        tower23.add(35);
        int int31 = tower23.index();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test191");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower6.add(0);
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add((int) (byte) 1);
        tower15.add(0);
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = tower22.getClass();
        tower6.moveDisks((int) (short) 0, tower15, tower22);
        Tower tower29 = new Tower(100);
        tower6.moveTopTo(tower29);
        java.lang.Class<?> wildcardClass31 = tower6.getClass();
        tower6.add((int) (short) 1);
        tower6.add((int) (byte) 1);
        Tower tower37 = new Tower((int) (byte) -1);
        int int38 = tower37.index();
        int int39 = tower37.index();
        tower6.moveTopTo(tower37);
        int int41 = tower37.index();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test192");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        int int5 = tower1.index();
        Tower tower7 = new Tower(0);
        tower7.add((-1));
        java.lang.Class<?> wildcardClass10 = tower7.getClass();
        int int11 = tower7.index();
        Tower tower13 = new Tower((-1));
        java.lang.Class<?> wildcardClass14 = tower13.getClass();
        tower13.add((int) (byte) 1);
        tower13.add(0);
        int int19 = tower13.index();
        java.lang.Class<?> wildcardClass20 = tower13.getClass();
        java.lang.Class<?> wildcardClass21 = tower13.getClass();
        tower7.moveTopTo(tower13);
        tower1.moveTopTo(tower7);
        tower1.add((int) (short) 0);
        tower1.add((-1));
        Tower tower29 = new Tower((int) 'a');
        tower29.add((int) (byte) 1);
        tower1.moveTopTo(tower29);
        java.lang.Class<?> wildcardClass33 = tower1.getClass();
        int int34 = tower1.index();
        tower1.add((int) (byte) -1);
        java.lang.Class<?> wildcardClass37 = tower1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test193");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        Tower tower6 = new Tower((-1));
        java.lang.Class<?> wildcardClass7 = tower6.getClass();
        tower6.add(0);
        tower1.moveTopTo(tower6);
        tower6.add(0);
        Tower tower15 = new Tower((-1));
        java.lang.Class<?> wildcardClass16 = tower15.getClass();
        tower15.add((int) (byte) 1);
        tower15.add(0);
        Tower tower22 = new Tower((-1));
        java.lang.Class<?> wildcardClass23 = tower22.getClass();
        tower22.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = tower22.getClass();
        tower6.moveDisks((int) (short) 0, tower15, tower22);
        int int28 = tower15.index();
        tower15.add((int) (byte) -1);
        java.lang.Class<?> wildcardClass31 = tower15.getClass();
        int int32 = tower15.index();
        java.lang.Class<?> wildcardClass33 = tower15.getClass();
        Tower tower35 = new Tower((-1));
        java.lang.Class<?> wildcardClass36 = tower35.getClass();
        tower35.add((int) (byte) 1);
        tower35.add(0);
        Tower tower42 = new Tower(0);
        tower35.moveTopTo(tower42);
        Tower tower45 = new Tower((-1));
        java.lang.Class<?> wildcardClass46 = tower45.getClass();
        tower45.add((int) (byte) 1);
        tower45.add(0);
        tower35.moveTopTo(tower45);
        tower35.add((int) '4');
        Tower tower55 = new Tower(0);
        tower55.add((-1));
        Tower tower59 = new Tower(0);
        tower55.moveTopTo(tower59);
        tower35.moveTopTo(tower55);
        tower15.moveTopTo(tower55);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test194");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        Tower tower6 = new Tower((-1));
        Tower tower8 = new Tower((-1));
        java.lang.Class<?> wildcardClass9 = tower8.getClass();
        tower8.add((int) (byte) 1);
        tower1.moveDisks((int) (byte) -1, tower6, tower8);
        java.lang.Class<?> wildcardClass13 = tower6.getClass();
        int int14 = tower6.index();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test195");
        Tower tower1 = new Tower((-1));
        tower1.add((int) (short) 10);
        int int4 = tower1.index();
        Tower tower6 = new Tower(0);
        tower6.add((-1));
        Tower tower10 = new Tower(0);
        tower6.moveTopTo(tower10);
        Tower tower14 = new Tower(0);
        tower14.add((-1));
        Tower tower18 = new Tower((-1));
        java.lang.Class<?> wildcardClass19 = tower18.getClass();
        tower18.add((int) (byte) 1);
        tower18.add(0);
        Tower tower25 = new Tower(0);
        tower18.moveTopTo(tower25);
        Tower tower28 = new Tower((-1));
        java.lang.Class<?> wildcardClass29 = tower28.getClass();
        tower28.add((int) (byte) 1);
        tower28.add(0);
        tower18.moveTopTo(tower28);
        tower10.moveDisks((int) (byte) -1, tower14, tower28);
        tower14.add((int) (short) -1);
        Tower tower40 = new Tower(0);
        tower40.add((-1));
        Tower tower44 = new Tower(0);
        tower40.moveTopTo(tower44);
        int int46 = tower44.index();
        Tower tower48 = new Tower(0);
        tower48.add((-1));
        java.lang.Class<?> wildcardClass51 = tower48.getClass();
        int int52 = tower48.index();
        tower44.moveTopTo(tower48);
        tower44.add((int) (short) 10);
        Tower tower57 = new Tower((-1));
        java.lang.Class<?> wildcardClass58 = tower57.getClass();
        tower57.add((int) (byte) 1);
        Tower tower62 = new Tower((-1));
        int int63 = tower62.index();
        tower57.moveTopTo(tower62);
        tower62.add(10);
        Tower tower69 = new Tower(0);
        tower69.add((-1));
        java.lang.Class<?> wildcardClass72 = tower69.getClass();
        Tower tower74 = new Tower((-1));
        java.lang.Class<?> wildcardClass75 = tower74.getClass();
        tower74.add(0);
        tower69.moveTopTo(tower74);
        Tower tower80 = new Tower((-1));
        int int81 = tower80.index();
        tower62.moveDisks(0, tower74, tower80);
        tower80.add((int) (short) 100);
        int int85 = tower80.index();
        tower14.moveDisks(0, tower44, tower80);
        tower1.moveTopTo(tower44);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test196");
        Tower tower1 = new Tower(0);
        tower1.add((-1));
        java.lang.Class<?> wildcardClass4 = tower1.getClass();
        int int5 = tower1.index();
        Tower tower7 = new Tower(0);
        tower7.add((-1));
        java.lang.Class<?> wildcardClass10 = tower7.getClass();
        int int11 = tower7.index();
        Tower tower13 = new Tower((-1));
        java.lang.Class<?> wildcardClass14 = tower13.getClass();
        tower13.add((int) (byte) 1);
        tower13.add(0);
        int int19 = tower13.index();
        java.lang.Class<?> wildcardClass20 = tower13.getClass();
        java.lang.Class<?> wildcardClass21 = tower13.getClass();
        tower7.moveTopTo(tower13);
        tower1.moveTopTo(tower7);
        Tower tower25 = new Tower((-1));
        java.lang.Class<?> wildcardClass26 = tower25.getClass();
        tower25.add((int) (byte) 1);
        Tower tower30 = new Tower((-1));
        int int31 = tower30.index();
        tower25.moveTopTo(tower30);
        tower30.add(10);
        Tower tower37 = new Tower(0);
        tower37.add((-1));
        Tower tower41 = new Tower((-1));
        java.lang.Class<?> wildcardClass42 = tower41.getClass();
        tower41.add((int) (byte) 1);
        tower37.moveTopTo(tower41);
        Tower tower47 = new Tower((-1));
        java.lang.Class<?> wildcardClass48 = tower47.getClass();
        tower47.add((int) (byte) 1);
        java.lang.Class<?> wildcardClass51 = tower47.getClass();
        tower30.moveDisks((int) (short) 0, tower37, tower47);
        int int53 = tower37.index();
        tower37.add(10);
        tower7.moveTopTo(tower37);
        tower7.add((int) (short) 10);
        java.lang.Class<?> wildcardClass59 = tower7.getClass();
        java.lang.Class<?> wildcardClass60 = tower7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }
}

