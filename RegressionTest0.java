import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection2.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = objCollection0.retainAll((java.util.Collection<java.lang.Object>) objCollection2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Iterator<java.lang.Object> objİtor1 = objCollection0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = objCollection0.add((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objİtor1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Iterator<java.lang.Object> objİtor1 = objCollection0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = objCollection0.add((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objİtor1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection2.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream4 = objCollection2.parallelStream();
        java.util.Set<java.lang.Object> objSet5 = objCollection2.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection6 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator7 = objCollection6.spliterator();
        java.util.Iterator<java.lang.Object> objİtor8 = objCollection6.iterator();
        boolean boolean9 = objSet5.containsAll((java.util.Collection<java.lang.Object>) objCollection6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = objCollection0.retainAll((java.util.Collection<java.lang.Object>) objSet5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objStream4);
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertNotNull(objCollection6);
        org.junit.Assert.assertNotNull(objSpliterator7);
        org.junit.Assert.assertNotNull(objİtor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Iterator<java.lang.Object> objİtor1 = objCollection0.iterator();
        org.apache.commons.collections4.Bag<java.lang.constant.ConstantDesc> constantDescCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = objCollection0.add((java.lang.Object) constantDescCollection2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objİtor1);
        org.junit.Assert.assertNotNull(constantDescCollection2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        // The following exception was thrown during execution in test generation
        try {
            objCollection4.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.util.Collection<java.lang.Object> objCollection8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = objCollection4.containsAll(objCollection8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.iterator()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.lang.Class<?> wildcardClass3 = objStream2.getClass();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = objCollection2.remove((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objSet3.contains((java.lang.Object) objCollection8);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: collection");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection13 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean15 = objCollection14.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection16 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean17 = objCollection14.containsAll((java.util.Collection<java.lang.Object>) objCollection16);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection18 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean19 = objCollection18.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream20 = objCollection18.parallelStream();
        java.util.Set<java.lang.Object> objSet21 = objCollection18.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection22 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator23 = objCollection22.spliterator();
        java.util.Iterator<java.lang.Object> objİtor24 = objCollection22.iterator();
        boolean boolean25 = objSet21.containsAll((java.util.Collection<java.lang.Object>) objCollection22);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection26 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean27 = objCollection26.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream28 = objCollection26.parallelStream();
        java.util.Set<java.lang.Object> objSet29 = objCollection26.uniqueSet();
        boolean boolean30 = objCollection22.containsAll((java.util.Collection<java.lang.Object>) objCollection26);
        boolean boolean31 = objCollection14.containsAll((java.util.Collection<java.lang.Object>) objCollection22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = objCollection8.removeAll((java.util.Collection<java.lang.Object>) objCollection22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objCollection13);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objCollection16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objStream20);
        org.junit.Assert.assertNotNull(objSet21);
        org.junit.Assert.assertNotNull(objCollection22);
        org.junit.Assert.assertNotNull(objSpliterator23);
        org.junit.Assert.assertNotNull(objİtor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objCollection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objStream28);
        org.junit.Assert.assertNotNull(objSet29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection13 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection8);
        // The following exception was thrown during execution in test generation
        try {
            objCollection13.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objCollection13);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator3 = objCollection0.spliterator();
        java.lang.Class<?> wildcardClass4 = objCollection0.getClass();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objSpliterator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection13 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator15 = objCollection14.spliterator();
        java.util.Iterator<java.lang.Object> objİtor16 = objCollection14.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = objCollection8.addAll((java.util.Collection<java.lang.Object>) objCollection14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objCollection13);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertNotNull(objSpliterator15);
        org.junit.Assert.assertNotNull(objİtor16);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection12.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection12.parallelStream();
        java.util.Set<java.lang.Object> objSet15 = objCollection12.uniqueSet();
        boolean boolean16 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection12);
        boolean boolean17 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = objCollection8.remove(obj18, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = objCollection2.remove((java.lang.Object) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection12.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection12.parallelStream();
        java.util.Set<java.lang.Object> objSet15 = objCollection12.uniqueSet();
        boolean boolean16 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection12);
        boolean boolean17 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.util.Iterator<java.lang.Object> objİtor18 = objCollection8.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection19 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean20 = objCollection19.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream21 = objCollection19.parallelStream();
        java.util.Set<java.lang.Object> objSet22 = objCollection19.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = objCollection8.removeAll((java.util.Collection<java.lang.Object>) objCollection19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objİtor18);
        org.junit.Assert.assertNotNull(objCollection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objStream21);
        org.junit.Assert.assertNotNull(objSet22);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection10 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean11 = objCollection10.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection10.containsAll((java.util.Collection<java.lang.Object>) objCollection12);
        java.lang.Class<?> wildcardClass14 = objCollection10.getClass();
        boolean boolean15 = objCollection8.equals((java.lang.Object) wildcardClass14);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection16 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean17 = objCollection16.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream18 = objCollection16.parallelStream();
        java.lang.Class<?> wildcardClass19 = objStream18.getClass();
        java.lang.Class[] classArray21 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        wildcardClassArray22[0] = wildcardClass19;
        java.lang.Class<?>[] wildcardClassArray25 = objCollection8.toArray(wildcardClassArray22);
        java.lang.reflect.Type[] typeArray26 = objCollection4.toArray((java.lang.reflect.Type[]) wildcardClassArray25);
        boolean boolean27 = objCollection4.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection28 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator29 = objCollection28.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = objCollection4.addAll((java.util.Collection<java.lang.Object>) objCollection28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objCollection16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objStream18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objCollection28);
        org.junit.Assert.assertNotNull(objSpliterator29);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection1 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean2 = objCollection1.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream3 = objCollection1.parallelStream();
        java.util.Set<java.lang.Object> objSet4 = objCollection1.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection9 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean10 = objCollection9.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream11 = objCollection9.parallelStream();
        java.util.Set<java.lang.Object> objSet12 = objCollection9.uniqueSet();
        java.lang.Object[] objArray17 = new java.lang.Object[] { objSet4, 1.0f, 0, (short) 0, (-1.0f), objSet12, 0L, 100, (short) 1, (-1L) };
        java.util.ArrayList<java.lang.Object> objList18 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList18, objArray17);
        boolean boolean21 = objList18.remove((java.lang.Object) (-1.0f));
        objList18.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = objCollection0.add((java.lang.Object) objList18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertNotNull(objCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objStream11);
        org.junit.Assert.assertNotNull(objSet12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[[], 1.0, 0, 0, -1.0, [], 0, 100, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[[], 1.0, 0, 0, -1.0, [], 0, 100, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Iterator<java.lang.Object> objİtor1 = objCollection0.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection2.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream4 = objCollection2.parallelStream();
        java.util.Set<java.lang.Object> objSet5 = objCollection2.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection6 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator7 = objCollection6.spliterator();
        java.util.Iterator<java.lang.Object> objİtor8 = objCollection6.iterator();
        boolean boolean9 = objSet5.containsAll((java.util.Collection<java.lang.Object>) objCollection6);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection10 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean11 = objCollection10.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream12 = objCollection10.parallelStream();
        java.util.Set<java.lang.Object> objSet13 = objCollection10.uniqueSet();
        boolean boolean14 = objCollection6.containsAll((java.util.Collection<java.lang.Object>) objCollection10);
        java.lang.Object obj15 = null;
        boolean boolean16 = objCollection6.equals(obj15);
        java.util.stream.Stream<java.lang.Object> objStream17 = objCollection6.stream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = objCollection0.removeAll((java.util.Collection<java.lang.Object>) objCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objİtor1);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objStream4);
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertNotNull(objCollection6);
        org.junit.Assert.assertNotNull(objSpliterator7);
        org.junit.Assert.assertNotNull(objİtor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objStream12);
        org.junit.Assert.assertNotNull(objSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objStream17);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.lang.Object obj13 = null;
        boolean boolean14 = objCollection4.equals(obj13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = objCollection4.remove((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.collections4.SortedBag<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(strComparableCollection0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        // The following exception was thrown during execution in test generation
        try {
            objCollection0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.lang.Class<?> wildcardClass8 = objSet3.getClass();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.stream.Stream<java.lang.Object> objStream1 = objCollection0.stream();
        java.lang.Class<?> wildcardClass2 = objCollection0.getClass();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objStream1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        java.lang.Object[] objArray4 = objCollection0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = objCollection0.add((java.lang.Object) 10.0d, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.collections4.SortedBag<org.apache.commons.collections4.BenchmarkedClass> benchmarkedClassCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(benchmarkedClassCollection0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.util.Iterator<java.lang.Object> objİtor8 = objCollection4.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection9 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean10 = objCollection9.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection11 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean12 = objCollection9.containsAll((java.util.Collection<java.lang.Object>) objCollection11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = objCollection4.retainAll((java.util.Collection<java.lang.Object>) objCollection9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objİtor8);
        org.junit.Assert.assertNotNull(objCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objCollection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection2.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection2.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.lang.Class<?> wildcardClass6 = objCollection2.getClass();
        boolean boolean7 = objCollection0.equals((java.lang.Object) wildcardClass6);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection0);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objCollection8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection13 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection8);
        java.lang.Class<?> wildcardClass14 = objCollection8.getClass();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objCollection13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.lang.Object obj13 = null;
        boolean boolean14 = objCollection4.equals(obj13);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection15 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection4);
        java.util.Iterator<java.lang.Object> objİtor16 = objCollection15.iterator();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objCollection15);
        org.junit.Assert.assertNotNull(objİtor16);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.collections4.SortedBag<java.util.List<java.lang.Object>> objListCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(objListCollection0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.collections4.Bag<java.util.List<java.lang.Object>> objListCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(objListCollection0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection13 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean15 = objCollection14.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream16 = objCollection14.parallelStream();
        java.util.Set<java.lang.Object> objSet17 = objCollection14.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection18 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator19 = objCollection18.spliterator();
        java.util.Iterator<java.lang.Object> objİtor20 = objCollection18.iterator();
        boolean boolean21 = objSet17.containsAll((java.util.Collection<java.lang.Object>) objCollection18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = objCollection4.remove((java.lang.Object) objSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objCollection13);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objStream16);
        org.junit.Assert.assertNotNull(objSet17);
        org.junit.Assert.assertNotNull(objCollection18);
        org.junit.Assert.assertNotNull(objSpliterator19);
        org.junit.Assert.assertNotNull(objİtor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.collections4.Bag<java.lang.AutoCloseable> autoCloseableCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(autoCloseableCollection0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = bag2.remove((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.stream.Stream<java.lang.Object> objStream3 = objCollection0.stream();
        boolean boolean4 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator6 = objCollection5.spliterator();
        java.util.Iterator<java.lang.Object> objİtor7 = objCollection5.iterator();
        java.util.Iterator<java.lang.Object> objİtor8 = objCollection5.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = objCollection0.add((java.lang.Object) objSpliterator9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertNotNull(objSpliterator6);
        org.junit.Assert.assertNotNull(objİtor7);
        org.junit.Assert.assertNotNull(objİtor8);
        org.junit.Assert.assertNotNull(objSpliterator9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.collections4.Bag<java.lang.reflect.AnnotatedElement> annotatedElementCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(annotatedElementCollection0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.collections4.Bag<java.io.Serializable> serializableCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(serializableCollection0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.collections4.Bag<org.apache.commons.collections4.Bag<java.lang.Object>> objCollectionCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(objCollectionCollection0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection3 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean4 = objCollection3.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean6 = objCollection3.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.lang.Class<?> wildcardClass7 = objCollection3.getClass();
        boolean boolean8 = objCollection0.equals((java.lang.Object) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            objCollection0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.collections4.SortedBag<java.lang.CharSequence> charSequenceCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(charSequenceCollection0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.util.Iterator<java.lang.Object> objİtor8 = objCollection4.iterator();
        java.util.stream.Stream<java.lang.Object> objStream9 = objCollection4.parallelStream();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objİtor8);
        org.junit.Assert.assertNotNull(objStream9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.collections4.Bag<java.lang.reflect.Type[]> typeArrayCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(typeArrayCollection0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.collections4.Bag<java.util.Collection<java.lang.Object>> objCollectionCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(objCollectionCollection0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.collections4.Bag<java.util.stream.Stream<java.lang.Object>> objStreamCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(objStreamCollection0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: collection");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Iterator<java.lang.Object> objİtor3 = objCollection0.iterator();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objİtor3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.collections4.SortedBag<java.io.Serializable> serializableCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(serializableCollection0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection2.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection2.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.lang.Class<?> wildcardClass6 = objCollection2.getClass();
        boolean boolean7 = objCollection0.equals((java.lang.Object) wildcardClass6);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.lang.Class<?> wildcardClass11 = objStream10.getClass();
        java.lang.Class[] classArray13 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        wildcardClassArray14[0] = wildcardClass11;
        java.lang.Class<?>[] wildcardClassArray17 = objCollection0.toArray(wildcardClassArray14);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection18 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection19 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection18);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection20 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection18);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection21 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = objCollection0.remove((java.lang.Object) randomAccessCollection18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(randomAccessCollection18);
        org.junit.Assert.assertNotNull(randomAccessCollection19);
        org.junit.Assert.assertNotNull(randomAccessCollection20);
        org.junit.Assert.assertNotNull(randomAccessCollection21);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.collections4.SortedBag<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator3 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor4 = objCollection0.iterator();
        java.util.Collection<java.lang.Object> objCollection5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = objCollection0.retainAll(objCollection5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objSpliterator3);
        org.junit.Assert.assertNotNull(objİtor4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.collections4.Bag<java.util.AbstractList<java.lang.Object>> objListCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(objListCollection0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.collections4.Bag<java.util.Iterator<java.lang.Object>[]> objİtorArrayCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(objİtorArrayCollection0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.stream.Stream<java.lang.Object> objStream3 = objCollection0.stream();
        boolean boolean4 = objCollection0.isEmpty();
        java.util.Set<java.lang.Object> objSet5 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection6 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean7 = objCollection6.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream8 = objCollection6.parallelStream();
        java.util.Set<java.lang.Object> objSet9 = objCollection6.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection10 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator11 = objCollection10.spliterator();
        java.util.Iterator<java.lang.Object> objİtor12 = objCollection10.iterator();
        boolean boolean13 = objSet9.containsAll((java.util.Collection<java.lang.Object>) objCollection10);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean15 = objCollection14.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream16 = objCollection14.parallelStream();
        java.util.Set<java.lang.Object> objSet17 = objCollection14.uniqueSet();
        boolean boolean18 = objCollection10.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        java.lang.Object obj19 = null;
        boolean boolean20 = objCollection10.equals(obj19);
        java.util.stream.Stream<java.lang.Object> objStream21 = objCollection10.stream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = objCollection0.add((java.lang.Object) objCollection10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertNotNull(objCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objStream8);
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertNotNull(objCollection10);
        org.junit.Assert.assertNotNull(objSpliterator11);
        org.junit.Assert.assertNotNull(objİtor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objStream16);
        org.junit.Assert.assertNotNull(objSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objStream21);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator3 = objCollection0.spliterator();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = objCollection0.retainAll((java.util.Collection<java.lang.Object>) objCollection5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objSpliterator3);
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertNotNull(objİtor6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.collections4.SortedBag<java.util.ArrayList<java.lang.Object>> objListCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(objListCollection0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection12.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection12.parallelStream();
        java.util.Set<java.lang.Object> objSet15 = objCollection12.uniqueSet();
        boolean boolean16 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection12);
        boolean boolean17 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        // The following exception was thrown during execution in test generation
        try {
            objCollection8.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.collections4.Bag<java.lang.CharSequence> charSequenceCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(charSequenceCollection0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.collections4.Bag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(randomAccessCollection0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.collections4.SortedBag<java.lang.reflect.GenericDeclaration> genericDeclarationCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(genericDeclarationCollection0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        java.lang.Class<?> wildcardClass3 = randomAccessCollection0.getClass();
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.stream.Stream<java.lang.Object> objStream3 = objCollection0.stream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        java.util.Iterator<java.lang.Object> objİtor7 = objCollection4.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator8 = objCollection4.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection9 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean10 = objCollection9.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream11 = objCollection9.parallelStream();
        java.util.Set<java.lang.Object> objSet12 = objCollection9.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection13 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator14 = objCollection13.spliterator();
        java.util.Iterator<java.lang.Object> objİtor15 = objCollection13.iterator();
        boolean boolean16 = objSet12.containsAll((java.util.Collection<java.lang.Object>) objCollection13);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection17 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean18 = objCollection17.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection19 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean20 = objCollection19.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection21 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean22 = objCollection19.containsAll((java.util.Collection<java.lang.Object>) objCollection21);
        java.lang.Class<?> wildcardClass23 = objCollection19.getClass();
        boolean boolean24 = objCollection17.equals((java.lang.Object) wildcardClass23);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection25 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean26 = objCollection25.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream27 = objCollection25.parallelStream();
        java.lang.Class<?> wildcardClass28 = objStream27.getClass();
        java.lang.Class[] classArray30 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray31 = (java.lang.Class<?>[]) classArray30;
        wildcardClassArray31[0] = wildcardClass28;
        java.lang.Class<?>[] wildcardClassArray34 = objCollection17.toArray(wildcardClassArray31);
        java.lang.reflect.Type[] typeArray35 = objCollection13.toArray((java.lang.reflect.Type[]) wildcardClassArray34);
        java.util.Collection[] collectionArray37 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.Object>[] objCollectionArray38 = (java.util.Collection<java.lang.Object>[]) collectionArray37;
        objCollectionArray38[0] = objCollection4;
        objCollectionArray38[1] = objCollection13;
        java.util.Collection<java.lang.Object>[] objCollectionArray43 = objCollection0.toArray(objCollectionArray38);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertNotNull(objİtor7);
        org.junit.Assert.assertNotNull(objSpliterator8);
        org.junit.Assert.assertNotNull(objCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objStream11);
        org.junit.Assert.assertNotNull(objSet12);
        org.junit.Assert.assertNotNull(objCollection13);
        org.junit.Assert.assertNotNull(objSpliterator14);
        org.junit.Assert.assertNotNull(objİtor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objCollection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objCollection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objCollection21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objCollection25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objStream27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(collectionArray37);
        org.junit.Assert.assertNotNull(objCollectionArray38);
        org.junit.Assert.assertNotNull(objCollectionArray43);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.collections4.Bag<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(wildcardClassOfFieldCollection0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Iterator<java.lang.Object> objİtor3 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator4 = objCollection0.spliterator();
        java.lang.Class<?> wildcardClass5 = objSpliterator4.getClass();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objİtor3);
        org.junit.Assert.assertNotNull(objSpliterator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection5);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection7 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection5);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection8 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = objCollection0.remove((java.lang.Object) randomAccessCollection5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection7);
        org.junit.Assert.assertNotNull(randomAccessCollection8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        java.lang.Class<?> wildcardClass6 = randomAccessCollection5.getClass();
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection13 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection4);
        java.util.Set<java.lang.Object> objSet14 = objCollection13.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection15 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean16 = objCollection15.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream17 = objCollection15.parallelStream();
        java.util.Set<java.lang.Object> objSet18 = objCollection15.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection19 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator20 = objCollection19.spliterator();
        java.util.Iterator<java.lang.Object> objİtor21 = objCollection19.iterator();
        boolean boolean22 = objSet18.containsAll((java.util.Collection<java.lang.Object>) objCollection19);
        org.apache.commons.collections4.Bag bag23 = org.apache.commons.collections4.BagUtils.EMPTY_SORTED_BAG;
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection24 = org.apache.commons.collections4.BagUtils.collectionBag((org.apache.commons.collections4.Bag<java.lang.Object>) bag23);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection25 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean26 = objCollection25.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream27 = objCollection25.parallelStream();
        java.util.Set<java.lang.Object> objSet28 = objCollection25.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection29 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator30 = objCollection29.spliterator();
        java.util.Iterator<java.lang.Object> objİtor31 = objCollection29.iterator();
        boolean boolean32 = objSet28.containsAll((java.util.Collection<java.lang.Object>) objCollection29);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection33 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean34 = objCollection33.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection35 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean36 = objCollection35.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection37 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean38 = objCollection35.containsAll((java.util.Collection<java.lang.Object>) objCollection37);
        java.lang.Class<?> wildcardClass39 = objCollection35.getClass();
        boolean boolean40 = objCollection33.equals((java.lang.Object) wildcardClass39);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection41 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean42 = objCollection41.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream43 = objCollection41.parallelStream();
        java.lang.Class<?> wildcardClass44 = objStream43.getClass();
        java.lang.Class[] classArray46 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        wildcardClassArray47[0] = wildcardClass44;
        java.lang.Class<?>[] wildcardClassArray50 = objCollection33.toArray(wildcardClassArray47);
        java.lang.reflect.Type[] typeArray51 = objCollection29.toArray((java.lang.reflect.Type[]) wildcardClassArray50);
        boolean boolean52 = objCollection24.addAll((java.util.Collection<java.lang.Object>) objCollection29);
        boolean boolean53 = objCollection19.equals((java.lang.Object) boolean52);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = objSet14.retainAll((java.util.Collection<java.lang.Object>) objCollection19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objCollection13);
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertNotNull(objCollection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objStream17);
        org.junit.Assert.assertNotNull(objSet18);
        org.junit.Assert.assertNotNull(objCollection19);
        org.junit.Assert.assertNotNull(objSpliterator20);
        org.junit.Assert.assertNotNull(objİtor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(bag23);
        org.junit.Assert.assertNotNull(objCollection24);
        org.junit.Assert.assertNotNull(objCollection25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objStream27);
        org.junit.Assert.assertNotNull(objSet28);
        org.junit.Assert.assertNotNull(objCollection29);
        org.junit.Assert.assertNotNull(objSpliterator30);
        org.junit.Assert.assertNotNull(objİtor31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objCollection33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objCollection35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objCollection37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objCollection41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objStream43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.collections4.SortedBag<java.util.stream.BaseStream<java.lang.Object, java.util.stream.Stream<java.lang.Object>>> objBaseStreamCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(objBaseStreamCollection0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        java.lang.Object[] objArray16 = new java.lang.Object[] { objSet3, 1.0f, 0, (short) 0, (-1.0f), objSet11, 0L, 100, (short) 1, (-1L) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        boolean boolean20 = objList17.remove((java.lang.Object) (-1.0f));
        objList17.clear();
        java.lang.Class<?> wildcardClass22 = objList17.getClass();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[[], 1.0, 0, 0, -1.0, [], 0, 100, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[[], 1.0, 0, 0, -1.0, [], 0, 100, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.collections4.Bag<java.lang.Class<?>> wildcardClassCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(wildcardClassCollection0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        java.util.Spliterator<java.lang.Object> objSpliterator4 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection7 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection6);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection8 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection6);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection9 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection8);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection10 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = objCollection0.add((java.lang.Object) randomAccessCollection9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objSpliterator4);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection7);
        org.junit.Assert.assertNotNull(randomAccessCollection8);
        org.junit.Assert.assertNotNull(randomAccessCollection9);
        org.junit.Assert.assertNotNull(randomAccessCollection10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.collections4.Bag<java.lang.Class<?>[]> wildcardClassArrayCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(wildcardClassArrayCollection0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        java.lang.Object[] objArray16 = new java.lang.Object[] { objSet3, 1.0f, 0, (short) 0, (-1.0f), objSet11, 0L, 100, (short) 1, (-1L) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        boolean boolean20 = objList17.remove((java.lang.Object) (-1.0f));
        objList17.clear();
        java.util.stream.Stream<java.lang.Object> objStream22 = objList17.parallelStream();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[[], 1.0, 0, 0, -1.0, [], 0, 100, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[[], 1.0, 0, 0, -1.0, [], 0, 100, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objStream22);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.collections4.SortedBag<java.lang.AutoCloseable> autoCloseableCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(autoCloseableCollection0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Iterator<java.lang.Object> objİtor3 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator4 = objCollection0.spliterator();
        java.util.stream.Stream<java.lang.Object> objStream5 = objCollection0.stream();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objİtor3);
        org.junit.Assert.assertNotNull(objSpliterator4);
        org.junit.Assert.assertNotNull(objStream5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.collections4.Bag<java.lang.reflect.GenericDeclaration> genericDeclarationCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(genericDeclarationCollection0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        java.util.stream.Stream<java.lang.Object> objStream4 = objCollection0.stream();
        java.util.Iterator<java.lang.Object> objİtor5 = objCollection0.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection6 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean7 = objCollection6.isEmpty();
        org.apache.commons.collections4.Bag bag8 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean9 = objCollection6.equals((java.lang.Object) bag8);
        java.util.Spliterator<java.lang.Object> objSpliterator10 = objCollection6.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = objCollection0.add((java.lang.Object) objSpliterator10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objStream4);
        org.junit.Assert.assertNotNull(objİtor5);
        org.junit.Assert.assertNotNull(objCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(bag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objSpliterator10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection12.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection12.parallelStream();
        java.util.Set<java.lang.Object> objSet15 = objCollection12.uniqueSet();
        boolean boolean16 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection12);
        boolean boolean17 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection18 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean19 = objCollection18.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream20 = objCollection18.parallelStream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection21 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean22 = objCollection21.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection23 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean24 = objCollection21.containsAll((java.util.Collection<java.lang.Object>) objCollection23);
        java.lang.Class<?> wildcardClass25 = objCollection21.getClass();
        boolean boolean26 = objCollection18.equals((java.lang.Object) wildcardClass25);
        java.util.Set<java.lang.Object> objSet27 = objCollection18.uniqueSet();
        java.util.stream.Stream<java.lang.Object> objStream28 = objSet27.stream();
        boolean boolean29 = objCollection0.equals((java.lang.Object) objStream28);
        // The following exception was thrown during execution in test generation
        try {
            objCollection0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objStream20);
        org.junit.Assert.assertNotNull(objCollection21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objCollection23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objSet27);
        org.junit.Assert.assertNotNull(objStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.collections4.Bag<org.apache.commons.collections4.BenchmarkedClass> benchmarkedClassCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(benchmarkedClassCollection0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.Bag<java.lang.Object> objCollection1 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: collection");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.collections4.SortedBag<java.lang.reflect.Type> typeCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(typeCollection0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator3 = objCollection0.spliterator();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray11 = objCollection0.toArray(strArray10);
        java.util.Spliterator<java.lang.Object> objSpliterator12 = objCollection0.spliterator();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objSpliterator3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(objSpliterator12);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.collections4.SortedBag<java.lang.Class<?>[]> wildcardClassArrayCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(wildcardClassArrayCollection0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        java.util.Iterator<java.lang.Object> objİtor4 = objCollection2.iterator();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objİtor4);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Iterator<java.lang.Object> objİtor3 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator4 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        // The following exception was thrown during execution in test generation
        try {
            objCollection0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objİtor3);
        org.junit.Assert.assertNotNull(objSpliterator4);
        org.junit.Assert.assertNotNull(objCollection5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection3 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean4 = objCollection3.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean6 = objCollection3.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.lang.Class<?> wildcardClass7 = objCollection3.getClass();
        boolean boolean8 = objCollection0.equals((java.lang.Object) wildcardClass7);
        java.util.Set<java.lang.Object> objSet9 = objCollection0.uniqueSet();
        java.lang.Object[] objArray10 = objSet9.toArray();
        java.lang.Class<?> wildcardClass11 = objSet9.getClass();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        java.util.stream.Stream<java.lang.Object> objStream4 = objCollection0.stream();
        java.lang.Class<?> wildcardClass5 = objStream4.getClass();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objStream4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.lang.Object obj13 = null;
        boolean boolean14 = objCollection4.equals(obj13);
        java.util.stream.Stream<java.lang.Object> objStream15 = objCollection4.stream();
        java.util.stream.Stream<java.lang.Object> objStream16 = objCollection4.parallelStream();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objStream15);
        org.junit.Assert.assertNotNull(objStream16);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.collections4.SortedBag<java.lang.constant.Constable> constableCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        java.lang.Class<?> wildcardClass1 = constableCollection0.getClass();
        org.junit.Assert.assertNotNull(constableCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.collections4.SortedBag<java.lang.Cloneable> cloneableCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(cloneableCollection0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.collections4.SortedBag<java.util.AbstractList<java.lang.Object>> objListCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(objListCollection0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.util.Iterator<java.lang.Object> objİtor8 = objCollection4.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection9 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection10 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean11 = objCollection10.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream12 = objCollection10.parallelStream();
        java.util.Set<java.lang.Object> objSet13 = objCollection10.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator15 = objCollection14.spliterator();
        java.util.Iterator<java.lang.Object> objİtor16 = objCollection14.iterator();
        boolean boolean17 = objSet13.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection18 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean19 = objCollection18.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream20 = objCollection18.parallelStream();
        java.util.Set<java.lang.Object> objSet21 = objCollection18.uniqueSet();
        boolean boolean22 = objCollection14.containsAll((java.util.Collection<java.lang.Object>) objCollection18);
        java.lang.Object obj23 = null;
        boolean boolean24 = objCollection14.equals(obj23);
        java.util.stream.Stream<java.lang.Object> objStream25 = objCollection14.stream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = objCollection9.remove((java.lang.Object) objStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objİtor8);
        org.junit.Assert.assertNotNull(objCollection9);
        org.junit.Assert.assertNotNull(objCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objStream12);
        org.junit.Assert.assertNotNull(objSet13);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertNotNull(objSpliterator15);
        org.junit.Assert.assertNotNull(objİtor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objStream20);
        org.junit.Assert.assertNotNull(objSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objStream25);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        java.lang.Object[] objArray16 = new java.lang.Object[] { objSet3, 1.0f, 0, (short) 0, (-1.0f), objSet11, 0L, 100, (short) 1, (-1L) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        boolean boolean20 = objList17.remove((java.lang.Object) (-1.0f));
        objList17.clear();
        java.util.RandomAccess[] randomAccessArray22 = new java.util.RandomAccess[] {};
        java.util.RandomAccess[] randomAccessArray23 = objList17.toArray(randomAccessArray22);
        java.util.stream.Stream<java.lang.Object> objStream24 = objList17.stream();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[[], 1.0, 0, 0, -1.0, [], 0, 100, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[[], 1.0, 0, 0, -1.0, [], 0, 100, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(randomAccessArray22);
        org.junit.Assert.assertNotNull(randomAccessArray23);
        org.junit.Assert.assertNotNull(objStream24);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.collections4.Bag<java.lang.reflect.Type> typeCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(typeCollection0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection12.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection12.parallelStream();
        java.util.Set<java.lang.Object> objSet15 = objCollection12.uniqueSet();
        boolean boolean16 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection12);
        boolean boolean17 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        boolean boolean18 = objCollection0.isEmpty();
        java.util.Spliterator<java.lang.Object> objSpliterator19 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection20 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator21 = objCollection20.spliterator();
        java.util.Iterator<java.lang.Object> objİtor22 = objCollection20.iterator();
        java.util.Iterator<java.lang.Object> objİtor23 = objCollection20.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator24 = objCollection20.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = objCollection0.add((java.lang.Object) objCollection20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objSpliterator19);
        org.junit.Assert.assertNotNull(objCollection20);
        org.junit.Assert.assertNotNull(objSpliterator21);
        org.junit.Assert.assertNotNull(objİtor22);
        org.junit.Assert.assertNotNull(objİtor23);
        org.junit.Assert.assertNotNull(objSpliterator24);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        java.util.stream.Stream<java.lang.Object> objStream4 = objCollection0.stream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection0);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objStream4);
        org.junit.Assert.assertNotNull(objCollection5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.stream.Stream<java.lang.Object> objStream1 = objCollection0.stream();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection2);
        boolean boolean4 = objCollection0.equals((java.lang.Object) randomAccessCollection2);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection2);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objStream1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        // The following exception was thrown during execution in test generation
        try {
            objCollection0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator3 = objCollection0.spliterator();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        java.util.Set<java.lang.Object> objSet5 = objCollection0.uniqueSet();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objSpliterator3);
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertNotNull(objSet5);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Iterator<java.lang.Object> objİtor3 = objCollection0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            objCollection0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objİtor3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection12.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection12.parallelStream();
        java.util.Set<java.lang.Object> objSet15 = objCollection12.uniqueSet();
        boolean boolean16 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection12);
        boolean boolean17 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.util.Spliterator<java.lang.Object> objSpliterator18 = objCollection0.spliterator();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objSpliterator18);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator3 = objCollection0.spliterator();
        java.util.stream.Stream<java.lang.Object> objStream4 = objCollection0.parallelStream();
        java.util.stream.Stream<java.lang.Object> objStream5 = objCollection0.parallelStream();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objSpliterator3);
        org.junit.Assert.assertNotNull(objStream4);
        org.junit.Assert.assertNotNull(objStream5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator3 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor4 = objCollection0.iterator();
        boolean boolean5 = objCollection0.isEmpty();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection0.iterator();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objSpliterator3);
        org.junit.Assert.assertNotNull(objİtor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objİtor6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Iterator<java.lang.Object> objİtor3 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator4 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection5.iterator();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objİtor3);
        org.junit.Assert.assertNotNull(objSpliterator4);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertNotNull(objİtor6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        java.util.Spliterator<java.lang.Object> objSpliterator4 = objCollection0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            objCollection0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objSpliterator4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.collections4.SortedBag<java.lang.reflect.AnnotatedElement> annotatedElementCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(annotatedElementCollection0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.collections4.SortedBag<java.lang.CharSequence[]> charSequenceArrayCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(charSequenceArrayCollection0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection12.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection12.parallelStream();
        java.util.Set<java.lang.Object> objSet15 = objCollection12.uniqueSet();
        boolean boolean16 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection12);
        boolean boolean17 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        boolean boolean18 = objCollection0.isEmpty();
        java.util.Spliterator<java.lang.Object> objSpliterator19 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection20 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean21 = objCollection20.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection22 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean23 = objCollection20.containsAll((java.util.Collection<java.lang.Object>) objCollection22);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection24 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean25 = objCollection24.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream26 = objCollection24.parallelStream();
        java.util.Set<java.lang.Object> objSet27 = objCollection24.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection28 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator29 = objCollection28.spliterator();
        java.util.Iterator<java.lang.Object> objİtor30 = objCollection28.iterator();
        boolean boolean31 = objSet27.containsAll((java.util.Collection<java.lang.Object>) objCollection28);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection32 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean33 = objCollection32.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream34 = objCollection32.parallelStream();
        java.util.Set<java.lang.Object> objSet35 = objCollection32.uniqueSet();
        boolean boolean36 = objCollection28.containsAll((java.util.Collection<java.lang.Object>) objCollection32);
        boolean boolean37 = objCollection20.containsAll((java.util.Collection<java.lang.Object>) objCollection28);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection38 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean39 = objCollection38.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream40 = objCollection38.parallelStream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection41 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean42 = objCollection41.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection43 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean44 = objCollection41.containsAll((java.util.Collection<java.lang.Object>) objCollection43);
        java.lang.Class<?> wildcardClass45 = objCollection41.getClass();
        boolean boolean46 = objCollection38.equals((java.lang.Object) wildcardClass45);
        java.util.Set<java.lang.Object> objSet47 = objCollection38.uniqueSet();
        java.util.stream.Stream<java.lang.Object> objStream48 = objSet47.stream();
        boolean boolean49 = objCollection20.equals((java.lang.Object) objStream48);
        boolean boolean50 = objCollection0.equals((java.lang.Object) boolean49);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objSpliterator19);
        org.junit.Assert.assertNotNull(objCollection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objCollection22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objCollection24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objStream26);
        org.junit.Assert.assertNotNull(objSet27);
        org.junit.Assert.assertNotNull(objCollection28);
        org.junit.Assert.assertNotNull(objSpliterator29);
        org.junit.Assert.assertNotNull(objİtor30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objCollection32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objStream34);
        org.junit.Assert.assertNotNull(objSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objCollection38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objStream40);
        org.junit.Assert.assertNotNull(objCollection41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objCollection43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objSet47);
        org.junit.Assert.assertNotNull(objStream48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.lang.Object obj13 = null;
        boolean boolean14 = objCollection4.equals(obj13);
        java.util.Iterator<java.lang.Object> objİtor15 = objCollection4.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection16 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator17 = objCollection16.spliterator();
        java.util.Iterator<java.lang.Object> objİtor18 = objCollection16.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator19 = objCollection16.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = objCollection4.retainAll((java.util.Collection<java.lang.Object>) objCollection16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objİtor15);
        org.junit.Assert.assertNotNull(objCollection16);
        org.junit.Assert.assertNotNull(objSpliterator17);
        org.junit.Assert.assertNotNull(objİtor18);
        org.junit.Assert.assertNotNull(objSpliterator19);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.util.stream.Stream<java.lang.Object> objStream8 = objSet3.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            objSet3.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objStream8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection3);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.util.Iterator<java.lang.Object> objİtor12 = objCollection8.iterator();
        boolean boolean13 = objCollection0.contains((java.lang.Object) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean15 = objCollection14.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream16 = objCollection14.parallelStream();
        java.util.Set<java.lang.Object> objSet17 = objCollection14.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection18 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator19 = objCollection18.spliterator();
        java.util.Iterator<java.lang.Object> objİtor20 = objCollection18.iterator();
        boolean boolean21 = objSet17.containsAll((java.util.Collection<java.lang.Object>) objCollection18);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection22 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean23 = objCollection22.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream24 = objCollection22.parallelStream();
        java.util.Set<java.lang.Object> objSet25 = objCollection22.uniqueSet();
        boolean boolean26 = objCollection18.containsAll((java.util.Collection<java.lang.Object>) objCollection22);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection27 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection18);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection28 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection29 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection28);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection30 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection29);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection31 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection29);
        boolean boolean32 = objCollection27.contains((java.lang.Object) randomAccessCollection31);
        java.util.Iterator<java.lang.Object> objİtor33 = objCollection27.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = objCollection0.addAll((java.util.Collection<java.lang.Object>) objCollection27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objİtor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objStream16);
        org.junit.Assert.assertNotNull(objSet17);
        org.junit.Assert.assertNotNull(objCollection18);
        org.junit.Assert.assertNotNull(objSpliterator19);
        org.junit.Assert.assertNotNull(objİtor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objCollection22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objStream24);
        org.junit.Assert.assertNotNull(objSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objCollection27);
        org.junit.Assert.assertNotNull(randomAccessCollection28);
        org.junit.Assert.assertNotNull(randomAccessCollection29);
        org.junit.Assert.assertNotNull(randomAccessCollection30);
        org.junit.Assert.assertNotNull(randomAccessCollection31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objİtor33);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.collections4.SortedBag<java.lang.AutoCloseable[]> autoCloseableArrayCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(autoCloseableArrayCollection0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.collections4.Bag<java.lang.constant.Constable> constableCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(constableCollection0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection4);
        boolean boolean6 = objCollection0.contains((java.lang.Object) randomAccessCollection5);
        boolean boolean7 = objCollection0.isEmpty();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        java.util.Spliterator<java.lang.Object> objSpliterator4 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection5.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection7 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection5);
        java.util.Set<java.lang.Object> objSet8 = objCollection7.uniqueSet();
        java.util.stream.Stream<java.lang.Object> objStream9 = objCollection7.parallelStream();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objSpliterator4);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objSet8);
        org.junit.Assert.assertNotNull(objStream9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection13 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean15 = objCollection14.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream16 = objCollection14.parallelStream();
        java.util.Set<java.lang.Object> objSet17 = objCollection14.uniqueSet();
        java.util.stream.Stream<java.lang.Object> objStream18 = objCollection14.parallelStream();
        boolean boolean19 = objCollection13.retainAll((java.util.Collection<java.lang.Object>) objCollection14);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objCollection13);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objStream16);
        org.junit.Assert.assertNotNull(objSet17);
        org.junit.Assert.assertNotNull(objStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection3);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection5);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection7 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection5);
        java.lang.Class<?> wildcardClass8 = randomAccessCollection5.getClass();
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection9 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean10 = objCollection9.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection11 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean12 = objCollection9.containsAll((java.util.Collection<java.lang.Object>) objCollection11);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection13 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection14 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection13);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection15 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection13);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection16 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection13);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection17 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection16);
        boolean boolean18 = objCollection11.contains((java.lang.Object) randomAccessCollection17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = objCollection4.retainAll((java.util.Collection<java.lang.Object>) objCollection11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objCollection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(randomAccessCollection13);
        org.junit.Assert.assertNotNull(randomAccessCollection14);
        org.junit.Assert.assertNotNull(randomAccessCollection15);
        org.junit.Assert.assertNotNull(randomAccessCollection16);
        org.junit.Assert.assertNotNull(randomAccessCollection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        java.util.Spliterator<java.lang.Object> objSpliterator4 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection5.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection7 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection5);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection10 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean11 = objCollection10.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection10.containsAll((java.util.Collection<java.lang.Object>) objCollection12);
        java.lang.Class<?> wildcardClass14 = objCollection10.getClass();
        boolean boolean15 = objCollection8.equals((java.lang.Object) wildcardClass14);
        java.util.stream.Stream<java.lang.Object> objStream16 = objCollection8.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = objCollection7.add((java.lang.Object) objCollection8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objSpliterator4);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objStream16);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.collections4.SortedBag<java.lang.invoke.TypeDescriptor> typeDescriptorCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(typeDescriptorCollection0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection3 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean4 = objCollection3.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean6 = objCollection3.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.lang.Class<?> wildcardClass7 = objCollection3.getClass();
        boolean boolean8 = objCollection0.equals((java.lang.Object) wildcardClass7);
        java.util.Set<java.lang.Object> objSet9 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection10 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean11 = objCollection10.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream12 = objCollection10.parallelStream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection13 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean14 = objCollection13.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection15 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean16 = objCollection13.containsAll((java.util.Collection<java.lang.Object>) objCollection15);
        java.lang.Class<?> wildcardClass17 = objCollection13.getClass();
        boolean boolean18 = objCollection10.equals((java.lang.Object) wildcardClass17);
        java.util.Set<java.lang.Object> objSet19 = objCollection10.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = objSet9.retainAll((java.util.Collection<java.lang.Object>) objSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertNotNull(objCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objStream12);
        org.junit.Assert.assertNotNull(objCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objCollection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objSet19);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Iterator<java.lang.Object> objİtor3 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator4 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        java.util.Collection<java.lang.Object> objCollection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = objCollection5.containsAll(objCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.stream()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objİtor3);
        org.junit.Assert.assertNotNull(objSpliterator4);
        org.junit.Assert.assertNotNull(objCollection5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.collections4.Bag<java.lang.Iterable<java.lang.Object>> objIterableCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(objIterableCollection0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.collections4.SortedBag<java.lang.String[]> strArrayCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(strArrayCollection0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.collections4.Bag<java.util.Collection<java.lang.Object>[]> objCollectionArrayCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(objCollectionArrayCollection0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.stream.Stream<java.lang.Object> objStream3 = objCollection0.stream();
        boolean boolean4 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection0);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objCollection5);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection3 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean4 = objCollection3.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean6 = objCollection3.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.lang.Class<?> wildcardClass7 = objCollection3.getClass();
        boolean boolean8 = objCollection0.equals((java.lang.Object) wildcardClass7);
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection10 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean11 = objCollection10.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream12 = objCollection10.parallelStream();
        java.util.Set<java.lang.Object> objSet13 = objCollection10.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator15 = objCollection14.spliterator();
        java.util.Iterator<java.lang.Object> objİtor16 = objCollection14.iterator();
        boolean boolean17 = objSet13.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection18 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean19 = objCollection18.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream20 = objCollection18.parallelStream();
        java.util.Set<java.lang.Object> objSet21 = objCollection18.uniqueSet();
        boolean boolean22 = objCollection14.containsAll((java.util.Collection<java.lang.Object>) objCollection18);
        boolean boolean23 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection24 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection14);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objStream12);
        org.junit.Assert.assertNotNull(objSet13);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertNotNull(objSpliterator15);
        org.junit.Assert.assertNotNull(objİtor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objStream20);
        org.junit.Assert.assertNotNull(objSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objCollection24);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.collections4.Bag<java.util.AbstractCollection<java.lang.Object>> objCollectionCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(objCollectionCollection0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection3);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection4);
        java.lang.Class<?> wildcardClass6 = randomAccessCollection5.getClass();
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection3 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection3);
        boolean boolean5 = objCollection4.isEmpty();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objCollection3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection13 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection4);
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection4.parallelStream();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection15 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = objCollection4.add((java.lang.Object) randomAccessCollection15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objCollection13);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(randomAccessCollection15);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.collections4.Bag bag0 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        java.util.Set<java.lang.Object> objSet1 = bag0.uniqueSet();
        java.util.Set<java.lang.Object> objSet2 = bag0.uniqueSet();
        org.junit.Assert.assertNotNull(bag0);
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertNotNull(objSet2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection3 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean4 = objCollection3.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean6 = objCollection3.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.lang.Class<?> wildcardClass7 = objCollection3.getClass();
        boolean boolean8 = objCollection0.equals((java.lang.Object) wildcardClass7);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection9 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection10 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection0);
        java.util.Iterator<java.lang.Object> objİtor11 = objCollection10.iterator();
        java.util.Set<java.lang.Object> objSet12 = objCollection10.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            objCollection10.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objCollection9);
        org.junit.Assert.assertNotNull(objCollection10);
        org.junit.Assert.assertNotNull(objİtor11);
        org.junit.Assert.assertNotNull(objSet12);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        java.util.Spliterator<java.lang.Object> objSpliterator4 = objCollection2.spliterator();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objSpliterator4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection7 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection8 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection7);
        org.junit.Assert.assertNotNull(randomAccessCollection8);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator3 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor4 = objCollection0.iterator();
        java.util.stream.Stream<java.lang.Object> objStream5 = objCollection0.stream();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection0.stream();
        java.lang.Class<?> wildcardClass7 = objCollection0.getClass();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objSpliterator3);
        org.junit.Assert.assertNotNull(objİtor4);
        org.junit.Assert.assertNotNull(objStream5);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.collections4.SortedBag<java.lang.Class<?>> wildcardClassCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(wildcardClassCollection0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.collections4.SortedBag<java.lang.Class<?>[][]> wildcardClassArrayCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(wildcardClassArrayCollection0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection13 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection4);
        java.util.Set<java.lang.Object> objSet14 = objCollection13.uniqueSet();
        java.util.Spliterator<java.lang.Object> objSpliterator15 = objSet14.spliterator();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objCollection13);
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertNotNull(objSpliterator15);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess[]> randomAccessArrayCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(randomAccessArrayCollection0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        boolean boolean4 = objCollection0.isEmpty();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection0.spliterator();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objSpliterator5);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        // The following exception was thrown during execution in test generation
        try {
            objCollection8.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection3 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean4 = objCollection3.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean6 = objCollection3.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.lang.Class<?> wildcardClass7 = objCollection3.getClass();
        boolean boolean8 = objCollection0.equals((java.lang.Object) wildcardClass7);
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection10 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean11 = objCollection10.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream12 = objCollection10.parallelStream();
        java.util.Set<java.lang.Object> objSet13 = objCollection10.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator15 = objCollection14.spliterator();
        java.util.Iterator<java.lang.Object> objİtor16 = objCollection14.iterator();
        boolean boolean17 = objSet13.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection18 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean19 = objCollection18.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream20 = objCollection18.parallelStream();
        java.util.Set<java.lang.Object> objSet21 = objCollection18.uniqueSet();
        boolean boolean22 = objCollection14.containsAll((java.util.Collection<java.lang.Object>) objCollection18);
        boolean boolean23 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection24 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean25 = objCollection24.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream26 = objCollection24.parallelStream();
        java.util.Set<java.lang.Object> objSet27 = objCollection24.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection28 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator29 = objCollection28.spliterator();
        java.util.Iterator<java.lang.Object> objİtor30 = objCollection28.iterator();
        boolean boolean31 = objSet27.containsAll((java.util.Collection<java.lang.Object>) objCollection28);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection32 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean33 = objCollection32.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream34 = objCollection32.parallelStream();
        java.util.Set<java.lang.Object> objSet35 = objCollection32.uniqueSet();
        boolean boolean36 = objCollection28.containsAll((java.util.Collection<java.lang.Object>) objCollection32);
        java.lang.Object obj37 = null;
        boolean boolean38 = objCollection28.equals(obj37);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection39 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection28);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = objCollection0.add((java.lang.Object) objCollection28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objStream12);
        org.junit.Assert.assertNotNull(objSet13);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertNotNull(objSpliterator15);
        org.junit.Assert.assertNotNull(objİtor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objStream20);
        org.junit.Assert.assertNotNull(objSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objCollection24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objStream26);
        org.junit.Assert.assertNotNull(objSet27);
        org.junit.Assert.assertNotNull(objCollection28);
        org.junit.Assert.assertNotNull(objSpliterator29);
        org.junit.Assert.assertNotNull(objİtor30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objCollection32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objStream34);
        org.junit.Assert.assertNotNull(objSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objCollection39);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        java.lang.Object[] objArray16 = new java.lang.Object[] { objSet3, 1.0f, 0, (short) 0, (-1.0f), objSet11, 0L, 100, (short) 1, (-1L) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        boolean boolean20 = objList17.remove((java.lang.Object) (-1.0f));
        java.util.Collection[] collectionArray22 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.Object>[] objCollectionArray23 = (java.util.Collection<java.lang.Object>[]) collectionArray22;
        java.util.Collection[] collectionArray25 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.Object>[] objCollectionArray26 = (java.util.Collection<java.lang.Object>[]) collectionArray25;
        java.util.Collection[] collectionArray28 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.Object>[] objCollectionArray29 = (java.util.Collection<java.lang.Object>[]) collectionArray28;
        java.util.Collection[] collectionArray31 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.Object>[] objCollectionArray32 = (java.util.Collection<java.lang.Object>[]) collectionArray31;
        java.util.Collection[] collectionArray34 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.Object>[] objCollectionArray35 = (java.util.Collection<java.lang.Object>[]) collectionArray34;
        java.util.Collection[] collectionArray37 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.Object>[] objCollectionArray38 = (java.util.Collection<java.lang.Object>[]) collectionArray37;
        java.util.Collection[][] collectionArray40 = new java.util.Collection[6][];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.Object>[][] objCollectionArray41 = (java.util.Collection<java.lang.Object>[][]) collectionArray40;
        objCollectionArray41[0] = objCollectionArray23;
        objCollectionArray41[1] = objCollectionArray26;
        objCollectionArray41[2] = collectionArray28;
        objCollectionArray41[3] = collectionArray31;
        objCollectionArray41[4] = collectionArray34;
        objCollectionArray41[5] = objCollectionArray38;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Object>[][] objCollectionArray54 = objList17.toArray(objCollectionArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: arraycopy: element type mismatch: can not cast one of the elements of java.lang.Object[] to the type of the destination array, [Ljava.util.Collection;");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[[], 1.0, 0, 0, -1.0, [], 0, 100, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[[], 1.0, 0, 0, -1.0, [], 0, 100, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(collectionArray22);
        org.junit.Assert.assertNotNull(objCollectionArray23);
        org.junit.Assert.assertNotNull(collectionArray25);
        org.junit.Assert.assertNotNull(objCollectionArray26);
        org.junit.Assert.assertNotNull(collectionArray28);
        org.junit.Assert.assertNotNull(objCollectionArray29);
        org.junit.Assert.assertNotNull(collectionArray31);
        org.junit.Assert.assertNotNull(objCollectionArray32);
        org.junit.Assert.assertNotNull(collectionArray34);
        org.junit.Assert.assertNotNull(objCollectionArray35);
        org.junit.Assert.assertNotNull(collectionArray37);
        org.junit.Assert.assertNotNull(objCollectionArray38);
        org.junit.Assert.assertNotNull(collectionArray40);
        org.junit.Assert.assertNotNull(objCollectionArray41);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator3 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor4 = objCollection0.iterator();
        java.util.stream.Stream<java.lang.Object> objStream5 = objCollection0.stream();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection0.stream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection7 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean8 = objCollection7.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream9 = objCollection7.parallelStream();
        java.util.Set<java.lang.Object> objSet10 = objCollection7.uniqueSet();
        boolean boolean11 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objSet10);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objSpliterator3);
        org.junit.Assert.assertNotNull(objİtor4);
        org.junit.Assert.assertNotNull(objStream5);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objStream9);
        org.junit.Assert.assertNotNull(objSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection7 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.collections4.SortedBag<java.lang.constant.Constable[]> constableArrayCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(constableArrayCollection0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.collections4.Bag<java.util.RandomAccess[]> randomAccessArrayCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(randomAccessArrayCollection0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.collections4.SortedBag<java.lang.Iterable<java.lang.Object>[]> objIterableArrayCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(objIterableArrayCollection0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.collections4.SortedBag<java.lang.String> strCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(strCollection0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection5);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection7 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection6);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection8 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection7);
        org.junit.Assert.assertNotNull(randomAccessCollection8);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Iterator<java.lang.Object> objİtor3 = objCollection0.iterator();
        java.util.Iterator<java.lang.Object> objİtor4 = objCollection0.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator6 = objCollection5.spliterator();
        java.util.Iterator<java.lang.Object> objİtor7 = objCollection5.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator8 = objCollection5.spliterator();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "" };
        java.lang.String[] strArray16 = objCollection5.toArray(strArray15);
        java.lang.Comparable<java.lang.String>[] strComparableArray17 = objCollection0.toArray((java.lang.Comparable<java.lang.String>[]) strArray15);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objİtor3);
        org.junit.Assert.assertNotNull(objİtor4);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertNotNull(objSpliterator6);
        org.junit.Assert.assertNotNull(objİtor7);
        org.junit.Assert.assertNotNull(objSpliterator8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strComparableArray17);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.stream.Stream<java.lang.Object> objStream3 = objCollection0.stream();
        boolean boolean4 = objCollection0.isEmpty();
        java.util.Set<java.lang.Object> objSet5 = objCollection0.uniqueSet();
        java.util.Iterator<java.lang.Object> objİtor6 = objSet5.iterator();
        java.lang.Object[] objArray7 = objSet5.toArray();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        java.lang.Object[] objArray4 = objCollection0.toArray();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean6 = objCollection5.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection7 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean8 = objCollection5.containsAll((java.util.Collection<java.lang.Object>) objCollection7);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection9 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection10 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection9);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection11 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection9);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection12 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection9);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection13 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection12);
        boolean boolean14 = objCollection7.contains((java.lang.Object) randomAccessCollection13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = objCollection0.remove((java.lang.Object) objCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(randomAccessCollection9);
        org.junit.Assert.assertNotNull(randomAccessCollection10);
        org.junit.Assert.assertNotNull(randomAccessCollection11);
        org.junit.Assert.assertNotNull(randomAccessCollection12);
        org.junit.Assert.assertNotNull(randomAccessCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        java.util.Iterator<java.lang.Object> objİtor5 = objCollection0.iterator();
        java.util.Collection<java.lang.Object> objCollection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = objCollection0.containsAll(objCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.iterator()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertNotNull(objİtor5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.collections4.Bag bag0 = org.apache.commons.collections4.BagUtils.EMPTY_SORTED_BAG;
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection1 = org.apache.commons.collections4.BagUtils.collectionBag((org.apache.commons.collections4.Bag<java.lang.Object>) bag0);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection2.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream4 = objCollection2.parallelStream();
        java.util.Set<java.lang.Object> objSet5 = objCollection2.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection6 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator7 = objCollection6.spliterator();
        java.util.Iterator<java.lang.Object> objİtor8 = objCollection6.iterator();
        boolean boolean9 = objSet5.containsAll((java.util.Collection<java.lang.Object>) objCollection6);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection10 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean11 = objCollection10.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection12.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean15 = objCollection12.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        java.lang.Class<?> wildcardClass16 = objCollection12.getClass();
        boolean boolean17 = objCollection10.equals((java.lang.Object) wildcardClass16);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection18 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean19 = objCollection18.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream20 = objCollection18.parallelStream();
        java.lang.Class<?> wildcardClass21 = objStream20.getClass();
        java.lang.Class[] classArray23 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        wildcardClassArray24[0] = wildcardClass21;
        java.lang.Class<?>[] wildcardClassArray27 = objCollection10.toArray(wildcardClassArray24);
        java.lang.reflect.Type[] typeArray28 = objCollection6.toArray((java.lang.reflect.Type[]) wildcardClassArray27);
        boolean boolean29 = objCollection1.addAll((java.util.Collection<java.lang.Object>) objCollection6);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection30 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean31 = objCollection30.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream32 = objCollection30.parallelStream();
        java.util.Set<java.lang.Object> objSet33 = objCollection30.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = objCollection6.retainAll((java.util.Collection<java.lang.Object>) objCollection30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bag0);
        org.junit.Assert.assertNotNull(objCollection1);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objStream4);
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertNotNull(objCollection6);
        org.junit.Assert.assertNotNull(objSpliterator7);
        org.junit.Assert.assertNotNull(objİtor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objStream20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objCollection30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objStream32);
        org.junit.Assert.assertNotNull(objSet33);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.collections4.Bag<java.lang.CharSequence[]> charSequenceArrayCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(charSequenceArrayCollection0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.lang.Object obj13 = null;
        boolean boolean14 = objCollection4.equals(obj13);
        java.util.Iterator<java.lang.Object> objİtor15 = objCollection4.iterator();
        java.lang.Class<?> wildcardClass16 = objİtor15.getClass();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objİtor15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        java.util.Spliterator<java.lang.Object> objSpliterator4 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection5.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection7 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection5);
        java.util.Spliterator<java.lang.Object> objSpliterator8 = objCollection5.spliterator();
        java.util.stream.Stream<java.lang.Object> objStream9 = objCollection5.parallelStream();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objSpliterator4);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objSpliterator8);
        org.junit.Assert.assertNotNull(objStream9);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection3 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean4 = objCollection3.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean6 = objCollection3.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.lang.Class<?> wildcardClass7 = objCollection3.getClass();
        boolean boolean8 = objCollection0.equals((java.lang.Object) wildcardClass7);
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection10 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean11 = objCollection10.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream12 = objCollection10.parallelStream();
        java.util.Set<java.lang.Object> objSet13 = objCollection10.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator15 = objCollection14.spliterator();
        java.util.Iterator<java.lang.Object> objİtor16 = objCollection14.iterator();
        boolean boolean17 = objSet13.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection18 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean19 = objCollection18.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream20 = objCollection18.parallelStream();
        java.util.Set<java.lang.Object> objSet21 = objCollection18.uniqueSet();
        boolean boolean22 = objCollection14.containsAll((java.util.Collection<java.lang.Object>) objCollection18);
        boolean boolean23 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        java.lang.Object[] objArray24 = objCollection14.toArray();
        java.util.Iterator<java.lang.Object> objİtor25 = objCollection14.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection26 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean27 = objCollection26.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream28 = objCollection26.parallelStream();
        java.util.Set<java.lang.Object> objSet29 = objCollection26.uniqueSet();
        java.util.Set<java.lang.Object> objSet30 = objCollection26.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = objCollection14.removeAll((java.util.Collection<java.lang.Object>) objSet30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objStream12);
        org.junit.Assert.assertNotNull(objSet13);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertNotNull(objSpliterator15);
        org.junit.Assert.assertNotNull(objİtor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objStream20);
        org.junit.Assert.assertNotNull(objSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objİtor25);
        org.junit.Assert.assertNotNull(objCollection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objStream28);
        org.junit.Assert.assertNotNull(objSet29);
        org.junit.Assert.assertNotNull(objSet30);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Iterator<java.lang.Object> objİtor3 = objCollection0.iterator();
        java.util.Iterator<java.lang.Object> objİtor4 = objCollection0.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean6 = objCollection5.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection7 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean8 = objCollection5.containsAll((java.util.Collection<java.lang.Object>) objCollection7);
        java.util.Iterator<java.lang.Object> objİtor9 = objCollection5.iterator();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection11 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection0);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objİtor3);
        org.junit.Assert.assertNotNull(objİtor4);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objİtor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objCollection11);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        java.util.Spliterator<java.lang.Object> objSpliterator4 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection5.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection7 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection5);
        java.util.Set<java.lang.Object> objSet8 = objCollection7.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection9 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection7);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objSpliterator4);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objSet8);
        org.junit.Assert.assertNotNull(objCollection9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.stream.Stream<java.lang.Object> objStream3 = objCollection0.stream();
        boolean boolean4 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream5 = objCollection0.stream();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objStream5);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        java.util.Iterator<java.lang.Object> objİtor4 = objCollection0.iterator();
        java.util.Iterator<java.lang.Object> objİtor5 = objCollection0.iterator();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objİtor4);
        org.junit.Assert.assertNotNull(objİtor5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection4);
        boolean boolean6 = objCollection0.contains((java.lang.Object) randomAccessCollection5);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection7 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator8 = objCollection7.spliterator();
        java.util.Iterator<java.lang.Object> objİtor9 = objCollection7.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator10 = objCollection7.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = objCollection0.add((java.lang.Object) objSpliterator10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objSpliterator8);
        org.junit.Assert.assertNotNull(objİtor9);
        org.junit.Assert.assertNotNull(objSpliterator10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.collections4.Bag<java.lang.Class<?>[][]> wildcardClassArrayCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(wildcardClassArrayCollection0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator3 = objCollection0.spliterator();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        java.util.stream.Stream<java.lang.Object> objStream5 = objSet4.parallelStream();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objSpliterator3);
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertNotNull(objStream5);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Iterator<java.lang.Object> objİtor3 = objCollection0.iterator();
        java.lang.Class<?> wildcardClass4 = objCollection0.getClass();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objİtor3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator3 = objCollection0.spliterator();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        java.util.stream.Stream<java.lang.Object> objStream5 = objSet4.stream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection6 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator7 = objCollection6.spliterator();
        java.util.Iterator<java.lang.Object> objİtor8 = objCollection6.iterator();
        java.util.Iterator<java.lang.Object> objİtor9 = objCollection6.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator10 = objCollection6.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection11 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection6);
        java.lang.Class<?> wildcardClass12 = objCollection6.getClass();
        boolean boolean13 = objSet4.equals((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objSpliterator3);
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertNotNull(objStream5);
        org.junit.Assert.assertNotNull(objCollection6);
        org.junit.Assert.assertNotNull(objSpliterator7);
        org.junit.Assert.assertNotNull(objİtor8);
        org.junit.Assert.assertNotNull(objİtor9);
        org.junit.Assert.assertNotNull(objSpliterator10);
        org.junit.Assert.assertNotNull(objCollection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection12.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection12.parallelStream();
        java.util.Set<java.lang.Object> objSet15 = objCollection12.uniqueSet();
        boolean boolean16 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection12);
        boolean boolean17 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        boolean boolean18 = objCollection8.isEmpty();
        java.lang.Object[] objArray19 = objCollection8.toArray();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.collections4.SortedBag<java.lang.Object[]> objArrayCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(objArrayCollection0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection1);
        java.lang.Class<?> wildcardClass5 = randomAccessCollection4.getClass();
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.collections4.SortedBag<java.util.Set<java.lang.Object>> objSetCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(objSetCollection0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection12.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection12.parallelStream();
        java.util.Set<java.lang.Object> objSet15 = objCollection12.uniqueSet();
        boolean boolean16 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection12);
        boolean boolean17 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        boolean boolean18 = objCollection0.isEmpty();
        java.util.Spliterator<java.lang.Object> objSpliterator19 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection20 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        java.util.stream.Stream<java.lang.Object> objStream21 = objCollection0.stream();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objSpliterator19);
        org.junit.Assert.assertNotNull(objCollection20);
        org.junit.Assert.assertNotNull(objStream21);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection3 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean4 = objCollection3.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean6 = objCollection3.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.lang.Class<?> wildcardClass7 = objCollection3.getClass();
        boolean boolean8 = objCollection0.equals((java.lang.Object) wildcardClass7);
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection10 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean11 = objCollection10.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream12 = objCollection10.parallelStream();
        java.util.Set<java.lang.Object> objSet13 = objCollection10.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator15 = objCollection14.spliterator();
        java.util.Iterator<java.lang.Object> objİtor16 = objCollection14.iterator();
        boolean boolean17 = objSet13.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection18 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean19 = objCollection18.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream20 = objCollection18.parallelStream();
        java.util.Set<java.lang.Object> objSet21 = objCollection18.uniqueSet();
        boolean boolean22 = objCollection14.containsAll((java.util.Collection<java.lang.Object>) objCollection18);
        boolean boolean23 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        java.lang.Object[] objArray24 = objCollection14.toArray();
        java.util.stream.Stream<java.lang.Object> objStream25 = objCollection14.parallelStream();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objStream12);
        org.junit.Assert.assertNotNull(objSet13);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertNotNull(objSpliterator15);
        org.junit.Assert.assertNotNull(objİtor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objStream20);
        org.junit.Assert.assertNotNull(objSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objStream25);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.collections4.Bag<java.lang.Iterable<java.lang.Object>[][]> objIterableArrayCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(objIterableArrayCollection0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.collections4.Bag<java.lang.Comparable<java.lang.String>[]> strComparableArrayCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(strComparableArrayCollection0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.collections4.SortedBag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(objCollection0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.stream.Stream<java.lang.Object> objStream1 = objCollection0.stream();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection2);
        boolean boolean4 = objCollection0.equals((java.lang.Object) randomAccessCollection2);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection2);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objStream1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.util.Iterator<java.lang.Object> objİtor12 = objCollection8.iterator();
        boolean boolean13 = objCollection0.contains((java.lang.Object) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean15 = objCollection14.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream16 = objCollection14.parallelStream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection17 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean18 = objCollection17.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection19 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean20 = objCollection17.containsAll((java.util.Collection<java.lang.Object>) objCollection19);
        java.lang.Class<?> wildcardClass21 = objCollection17.getClass();
        boolean boolean22 = objCollection14.equals((java.lang.Object) wildcardClass21);
        java.util.Set<java.lang.Object> objSet23 = objCollection14.uniqueSet();
        java.lang.Class<?> wildcardClass24 = objSet23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = objCollection8.add((java.lang.Object) objSet23, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objİtor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objStream16);
        org.junit.Assert.assertNotNull(objCollection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objCollection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objSet23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.collections4.Bag<java.util.stream.BaseStream<java.lang.Object, java.util.stream.Stream<java.lang.Object>>> objBaseStreamCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(objBaseStreamCollection0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.lang.Object[] objArray1 = objCollection0.toArray();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            objCollection0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objStream2);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection13 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection14 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection15 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection14);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection16 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection15);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection17 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection15);
        boolean boolean18 = objCollection13.contains((java.lang.Object) randomAccessCollection17);
        // The following exception was thrown during execution in test generation
        try {
            objCollection13.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objCollection13);
        org.junit.Assert.assertNotNull(randomAccessCollection14);
        org.junit.Assert.assertNotNull(randomAccessCollection15);
        org.junit.Assert.assertNotNull(randomAccessCollection16);
        org.junit.Assert.assertNotNull(randomAccessCollection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection2.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection2.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.lang.Class<?> wildcardClass6 = objCollection2.getClass();
        boolean boolean7 = objCollection0.equals((java.lang.Object) wildcardClass6);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.lang.Class<?> wildcardClass11 = objStream10.getClass();
        java.lang.Class[] classArray13 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        wildcardClassArray14[0] = wildcardClass11;
        java.lang.Class<?>[] wildcardClassArray17 = objCollection0.toArray(wildcardClassArray14);
        boolean boolean18 = objCollection0.isEmpty();
        java.lang.Class<?> wildcardClass19 = objCollection0.getClass();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection3);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection7 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection7);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.util.stream.Stream<java.lang.Object> objStream13 = objCollection8.stream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean15 = objCollection14.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream16 = objCollection14.parallelStream();
        java.util.Set<java.lang.Object> objSet17 = objCollection14.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection18 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator19 = objCollection18.spliterator();
        java.util.Iterator<java.lang.Object> objİtor20 = objCollection18.iterator();
        boolean boolean21 = objSet17.containsAll((java.util.Collection<java.lang.Object>) objCollection18);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection22 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection18);
        boolean boolean24 = objCollection22.equals((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = objCollection8.retainAll((java.util.Collection<java.lang.Object>) objCollection22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objStream13);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objStream16);
        org.junit.Assert.assertNotNull(objSet17);
        org.junit.Assert.assertNotNull(objCollection18);
        org.junit.Assert.assertNotNull(objSpliterator19);
        org.junit.Assert.assertNotNull(objİtor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objCollection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.lang.Object obj13 = null;
        boolean boolean14 = objCollection4.equals(obj13);
        java.util.stream.Stream<java.lang.Object> objStream15 = objCollection4.stream();
        java.util.Set<java.lang.Object> objSet16 = objCollection4.uniqueSet();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objStream15);
        org.junit.Assert.assertNotNull(objSet16);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection12.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection12.parallelStream();
        java.util.Set<java.lang.Object> objSet15 = objCollection12.uniqueSet();
        boolean boolean16 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection12);
        boolean boolean17 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.lang.Object obj18 = null;
        boolean boolean19 = objCollection0.contains(obj18);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        java.lang.Class<?> wildcardClass4 = randomAccessCollection3.getClass();
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.collections4.SortedBag<org.apache.commons.collections4.SortedBag<java.util.RandomAccess>> randomAccessCollectionCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        java.lang.Class<?> wildcardClass1 = randomAccessCollectionCollection0.getClass();
        org.junit.Assert.assertNotNull(randomAccessCollectionCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection12.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection12.parallelStream();
        java.util.Set<java.lang.Object> objSet15 = objCollection12.uniqueSet();
        boolean boolean16 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection12);
        boolean boolean17 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.util.Collection<java.lang.Object> objCollection18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = objCollection8.addAll(objCollection18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.collections4.Bag<java.lang.Comparable<java.lang.String>> strComparableCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(strComparableCollection0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.collections4.Bag<java.util.RandomAccess[][]> randomAccessArrayCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(randomAccessArrayCollection0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator3 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor4 = objCollection0.iterator();
        java.util.Iterator<java.lang.Object> objİtor5 = objCollection0.iterator();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection0.parallelStream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection7 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection0);
        java.util.Set<java.lang.Object> objSet8 = objCollection7.uniqueSet();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objSpliterator3);
        org.junit.Assert.assertNotNull(objİtor4);
        org.junit.Assert.assertNotNull(objİtor5);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objSet8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection12.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection12.parallelStream();
        java.util.Set<java.lang.Object> objSet15 = objCollection12.uniqueSet();
        boolean boolean16 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection12);
        boolean boolean17 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.util.Set<java.lang.Object> objSet18 = objCollection8.uniqueSet();
        java.util.Iterator<java.lang.Object> objİtor19 = objSet18.iterator();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objSet18);
        org.junit.Assert.assertNotNull(objİtor19);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.collections4.Bag<java.lang.Object[]> objArrayCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(objArrayCollection0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection5);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection7 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection6);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection8 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection7);
        org.junit.Assert.assertNotNull(randomAccessCollection8);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.collections4.SortedBag<java.util.stream.Stream<java.lang.Object>[]> objStreamArrayCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(objStreamArrayCollection0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.util.Iterator<java.lang.Object> objİtor8 = objSet3.iterator();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objİtor8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection12.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection12.parallelStream();
        java.util.Set<java.lang.Object> objSet15 = objCollection12.uniqueSet();
        boolean boolean16 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection12);
        boolean boolean17 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection18 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean19 = objCollection18.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream20 = objCollection18.parallelStream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection21 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean22 = objCollection21.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection23 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean24 = objCollection21.containsAll((java.util.Collection<java.lang.Object>) objCollection23);
        java.lang.Class<?> wildcardClass25 = objCollection21.getClass();
        boolean boolean26 = objCollection18.equals((java.lang.Object) wildcardClass25);
        java.util.Set<java.lang.Object> objSet27 = objCollection18.uniqueSet();
        java.util.stream.Stream<java.lang.Object> objStream28 = objSet27.stream();
        boolean boolean29 = objCollection0.equals((java.lang.Object) objStream28);
        java.util.Spliterator<java.lang.Object> objSpliterator30 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection31 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objStream20);
        org.junit.Assert.assertNotNull(objCollection21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objCollection23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objSet27);
        org.junit.Assert.assertNotNull(objStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objSpliterator30);
        org.junit.Assert.assertNotNull(objCollection31);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.collections4.Bag<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(genericDeclarationArrayCollection0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection12.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection12.parallelStream();
        java.util.Set<java.lang.Object> objSet15 = objCollection12.uniqueSet();
        boolean boolean16 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection12);
        boolean boolean17 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        boolean boolean18 = objCollection0.isEmpty();
        java.util.Set<java.lang.Object> objSet19 = objCollection0.uniqueSet();
        boolean boolean20 = objSet19.isEmpty();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection2);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection2);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection2);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection13 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection4);
        java.util.Set<java.lang.Object> objSet14 = objCollection13.uniqueSet();
        java.util.Spliterator<java.lang.Object> objSpliterator15 = objCollection13.spliterator();
        java.util.Collection<java.lang.Object> objCollection16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = objCollection13.containsAll(objCollection16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.stream()\" because \"coll\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objCollection13);
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertNotNull(objSpliterator15);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection2);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection3);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection12.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection12.parallelStream();
        java.util.Set<java.lang.Object> objSet15 = objCollection12.uniqueSet();
        boolean boolean16 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection12);
        boolean boolean17 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.util.Iterator<java.lang.Object> objİtor18 = objCollection8.iterator();
        java.util.Set<java.lang.Object> objSet19 = objCollection8.uniqueSet();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objİtor18);
        org.junit.Assert.assertNotNull(objSet19);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.lang.Object obj13 = null;
        boolean boolean14 = objCollection4.equals(obj13);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection15 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection4);
        boolean boolean16 = objCollection4.isEmpty();
        java.util.Iterator<java.lang.Object> objİtor17 = objCollection4.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection18 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean19 = objCollection18.isEmpty();
        org.apache.commons.collections4.Bag bag20 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean21 = objCollection18.equals((java.lang.Object) bag20);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection22 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = objCollection4.add((java.lang.Object) objCollection18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objCollection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objİtor17);
        org.junit.Assert.assertNotNull(objCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(bag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objCollection22);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection3);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.lang.Object[] objArray1 = objCollection0.toArray();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.lang.Class<?> wildcardClass3 = objStream2.getClass();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.stream.Stream<java.lang.Object> objStream3 = objCollection0.stream();
        boolean boolean4 = objCollection0.isEmpty();
        java.util.Set<java.lang.Object> objSet5 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection6 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean7 = objCollection6.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection6.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection10 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean11 = objCollection10.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream12 = objCollection10.parallelStream();
        java.util.Set<java.lang.Object> objSet13 = objCollection10.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator15 = objCollection14.spliterator();
        java.util.Iterator<java.lang.Object> objİtor16 = objCollection14.iterator();
        boolean boolean17 = objSet13.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection18 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean19 = objCollection18.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream20 = objCollection18.parallelStream();
        java.util.Set<java.lang.Object> objSet21 = objCollection18.uniqueSet();
        boolean boolean22 = objCollection14.containsAll((java.util.Collection<java.lang.Object>) objCollection18);
        boolean boolean23 = objCollection6.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        boolean boolean24 = objCollection6.isEmpty();
        java.util.Spliterator<java.lang.Object> objSpliterator25 = objCollection6.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection26 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection6);
        boolean boolean27 = objSet5.contains((java.lang.Object) objCollection6);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertNotNull(objCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objStream12);
        org.junit.Assert.assertNotNull(objSet13);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertNotNull(objSpliterator15);
        org.junit.Assert.assertNotNull(objİtor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objStream20);
        org.junit.Assert.assertNotNull(objSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objSpliterator25);
        org.junit.Assert.assertNotNull(objCollection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.collections4.SortedBag<java.lang.Iterable<java.lang.Object>[][]> objIterableArrayCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(objIterableArrayCollection0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection3 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean4 = objCollection3.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean6 = objCollection3.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.lang.Class<?> wildcardClass7 = objCollection3.getClass();
        boolean boolean8 = objCollection0.equals((java.lang.Object) wildcardClass7);
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection0.spliterator();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection0.stream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection11 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean12 = objCollection11.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream13 = objCollection11.parallelStream();
        java.util.Set<java.lang.Object> objSet14 = objCollection11.uniqueSet();
        java.util.stream.Stream<java.lang.Object> objStream15 = objCollection11.parallelStream();
        java.util.Iterator<java.lang.Object> objİtor16 = objCollection11.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = objCollection0.removeAll((java.util.Collection<java.lang.Object>) objCollection11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objCollection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objStream13);
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertNotNull(objStream15);
        org.junit.Assert.assertNotNull(objİtor16);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.stream.Stream<java.lang.Object> objStream3 = objCollection0.stream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objCollection4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection3 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean4 = objCollection3.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean6 = objCollection3.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.lang.Class<?> wildcardClass7 = objCollection3.getClass();
        boolean boolean8 = objCollection0.equals((java.lang.Object) wildcardClass7);
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection10 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean11 = objCollection10.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream12 = objCollection10.parallelStream();
        java.util.Set<java.lang.Object> objSet13 = objCollection10.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator15 = objCollection14.spliterator();
        java.util.Iterator<java.lang.Object> objİtor16 = objCollection14.iterator();
        boolean boolean17 = objSet13.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection18 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean19 = objCollection18.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream20 = objCollection18.parallelStream();
        java.util.Set<java.lang.Object> objSet21 = objCollection18.uniqueSet();
        boolean boolean22 = objCollection14.containsAll((java.util.Collection<java.lang.Object>) objCollection18);
        boolean boolean23 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        java.lang.Object[] objArray24 = objCollection14.toArray();
        // The following exception was thrown during execution in test generation
        try {
            objCollection14.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objStream12);
        org.junit.Assert.assertNotNull(objSet13);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertNotNull(objSpliterator15);
        org.junit.Assert.assertNotNull(objİtor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objStream20);
        org.junit.Assert.assertNotNull(objSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.collections4.Bag<java.lang.String[][]> strArrayCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(strArrayCollection0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection12.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection12.parallelStream();
        java.util.Set<java.lang.Object> objSet15 = objCollection12.uniqueSet();
        boolean boolean16 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection12);
        boolean boolean17 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        boolean boolean18 = objCollection0.isEmpty();
        java.util.Spliterator<java.lang.Object> objSpliterator19 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection20 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        java.util.stream.Stream<java.lang.Object> objStream21 = objCollection20.parallelStream();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objSpliterator19);
        org.junit.Assert.assertNotNull(objCollection20);
        org.junit.Assert.assertNotNull(objStream21);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Iterator<java.lang.Object> objİtor3 = objCollection0.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection7 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean8 = objCollection7.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection9 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean10 = objCollection7.containsAll((java.util.Collection<java.lang.Object>) objCollection9);
        java.lang.Class<?> wildcardClass11 = objCollection7.getClass();
        boolean boolean12 = objCollection4.equals((java.lang.Object) wildcardClass11);
        java.util.Set<java.lang.Object> objSet13 = objCollection4.uniqueSet();
        java.lang.Object[] objArray14 = objSet13.toArray();
        boolean boolean15 = objCollection0.equals((java.lang.Object) objSet13);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection16 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection0);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection17 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator18 = objCollection17.spliterator();
        java.util.Iterator<java.lang.Object> objİtor19 = objCollection17.iterator();
        java.util.stream.Stream<java.lang.Object> objStream20 = objCollection17.stream();
        boolean boolean21 = objCollection17.isEmpty();
        java.util.Set<java.lang.Object> objSet22 = objCollection17.uniqueSet();
        java.util.Iterator<java.lang.Object> objİtor23 = objSet22.iterator();
        java.util.stream.Stream<java.lang.Object> objStream24 = objSet22.stream();
        boolean boolean25 = objCollection16.containsAll((java.util.Collection<java.lang.Object>) objSet22);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objİtor3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objSet13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objCollection16);
        org.junit.Assert.assertNotNull(objCollection17);
        org.junit.Assert.assertNotNull(objSpliterator18);
        org.junit.Assert.assertNotNull(objİtor19);
        org.junit.Assert.assertNotNull(objStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objSet22);
        org.junit.Assert.assertNotNull(objİtor23);
        org.junit.Assert.assertNotNull(objStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection5);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection7 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection5);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection8 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection7);
        org.junit.Assert.assertNotNull(randomAccessCollection8);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        java.util.Set<java.lang.Object> objSet4 = bag2.uniqueSet();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection5);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection7 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection5);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection8 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection5);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection9 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection8);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection10 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection9);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection11 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection9);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection12 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection11);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection13 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = objSet4.add((java.lang.Object) randomAccessCollection12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection7);
        org.junit.Assert.assertNotNull(randomAccessCollection8);
        org.junit.Assert.assertNotNull(randomAccessCollection9);
        org.junit.Assert.assertNotNull(randomAccessCollection10);
        org.junit.Assert.assertNotNull(randomAccessCollection11);
        org.junit.Assert.assertNotNull(randomAccessCollection12);
        org.junit.Assert.assertNotNull(randomAccessCollection13);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection7 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection8 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection7);
        boolean boolean9 = objCollection2.contains((java.lang.Object) randomAccessCollection8);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection10 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection8);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection11 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection8);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection7);
        org.junit.Assert.assertNotNull(randomAccessCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(randomAccessCollection10);
        org.junit.Assert.assertNotNull(randomAccessCollection11);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.lang.Object obj13 = null;
        boolean boolean14 = objCollection4.equals(obj13);
        java.util.stream.Stream<java.lang.Object> objStream15 = objCollection4.stream();
        boolean boolean16 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream17 = objCollection4.stream();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objStream17);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objSet4);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection4);
        boolean boolean6 = objCollection0.contains((java.lang.Object) randomAccessCollection5);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection7 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection5);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(randomAccessCollection7);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.collections4.SortedBag<java.util.Collection<java.lang.Object>> objCollectionCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(objCollectionCollection0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection13 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection4);
        java.util.Set<java.lang.Object> objSet14 = objCollection13.uniqueSet();
        java.util.stream.Stream<java.lang.Object> objStream15 = objSet14.parallelStream();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objCollection13);
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertNotNull(objStream15);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.collections4.SortedBag<java.lang.constant.ConstantDesc> constantDescCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(constantDescCollection0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.collections4.BenchmarkedClass benchmarkedClass0 = new org.apache.commons.collections4.BenchmarkedClass();
        benchmarkedClass0.init();
        benchmarkedClass0.init();
        benchmarkedClass0.init();
        benchmarkedClass0.init();
        benchmarkedClass0.init();
        benchmarkedClass0.init();
        benchmarkedClass0.init();
        benchmarkedClass0.init();
        benchmarkedClass0.init();
        benchmarkedClass0.init();
        benchmarkedClass0.init();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection3);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection7 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection8 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection7);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection7);
        org.junit.Assert.assertNotNull(randomAccessCollection8);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.collections4.SortedBag<java.util.Iterator<java.lang.Object>[]> objİtorArrayCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(objİtorArrayCollection0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.util.Iterator<java.lang.Object> objİtor12 = objCollection8.iterator();
        boolean boolean13 = objCollection0.contains((java.lang.Object) objCollection8);
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection0.stream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection15 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean16 = objCollection15.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream17 = objCollection15.parallelStream();
        java.util.Set<java.lang.Object> objSet18 = objCollection15.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection19 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator20 = objCollection19.spliterator();
        java.util.Iterator<java.lang.Object> objİtor21 = objCollection19.iterator();
        boolean boolean22 = objSet18.containsAll((java.util.Collection<java.lang.Object>) objCollection19);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection23 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean24 = objCollection23.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream25 = objCollection23.parallelStream();
        java.util.Set<java.lang.Object> objSet26 = objCollection23.uniqueSet();
        boolean boolean27 = objCollection19.containsAll((java.util.Collection<java.lang.Object>) objCollection23);
        java.lang.Object obj28 = null;
        boolean boolean29 = objCollection19.equals(obj28);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection30 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection19);
        boolean boolean31 = objCollection19.isEmpty();
        java.util.Iterator<java.lang.Object> objİtor32 = objCollection19.iterator();
        boolean boolean33 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection19);
        java.util.Collection<java.lang.Object> objCollection34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = objCollection0.addAll(objCollection34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objİtor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objCollection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objStream17);
        org.junit.Assert.assertNotNull(objSet18);
        org.junit.Assert.assertNotNull(objCollection19);
        org.junit.Assert.assertNotNull(objSpliterator20);
        org.junit.Assert.assertNotNull(objİtor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objCollection23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objStream25);
        org.junit.Assert.assertNotNull(objSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objCollection30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objİtor32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator3 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objSpliterator3);
        org.junit.Assert.assertNotNull(objCollection4);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.collections4.Bag<java.lang.String> strCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(strCollection0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection13 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection8);
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection13.stream();
        java.util.Iterator<java.lang.Object> objİtor15 = objCollection13.iterator();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objCollection13);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objİtor15);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection7 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection8 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection9 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection8);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection10 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection8);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection7);
        org.junit.Assert.assertNotNull(randomAccessCollection8);
        org.junit.Assert.assertNotNull(randomAccessCollection9);
        org.junit.Assert.assertNotNull(randomAccessCollection10);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.collections4.SortedBag<java.lang.constant.ConstantDesc[]> constantDescArrayCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(constantDescArrayCollection0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        java.util.Spliterator<java.lang.Object> objSpliterator4 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        java.util.Set<java.lang.Object> objSet6 = objCollection5.uniqueSet();
        java.util.stream.Stream<java.lang.Object> objStream7 = objCollection5.stream();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objSpliterator4);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertNotNull(objSet6);
        org.junit.Assert.assertNotNull(objStream7);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection3);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection3);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection1 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean2 = objCollection1.isEmpty();
        org.apache.commons.collections4.Bag bag3 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean4 = objCollection1.equals((java.lang.Object) bag3);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean6 = objCollection5.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream7 = objCollection5.parallelStream();
        java.util.Set<java.lang.Object> objSet8 = objCollection5.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection9 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator10 = objCollection9.spliterator();
        java.util.Iterator<java.lang.Object> objİtor11 = objCollection9.iterator();
        boolean boolean12 = objSet8.containsAll((java.util.Collection<java.lang.Object>) objCollection9);
        java.util.Iterator<java.lang.Object> objİtor13 = objCollection9.iterator();
        boolean boolean14 = objCollection1.contains((java.lang.Object) objCollection9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = objCollection0.addAll((java.util.Collection<java.lang.Object>) objCollection1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(bag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objStream7);
        org.junit.Assert.assertNotNull(objSet8);
        org.junit.Assert.assertNotNull(objCollection9);
        org.junit.Assert.assertNotNull(objSpliterator10);
        org.junit.Assert.assertNotNull(objİtor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objİtor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator3 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor4 = objCollection0.iterator();
        java.util.stream.Stream<java.lang.Object> objStream5 = objCollection0.stream();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection0.stream();
        java.util.Collection<java.lang.Object> objCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = objCollection0.removeAll(objCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objSpliterator3);
        org.junit.Assert.assertNotNull(objİtor4);
        org.junit.Assert.assertNotNull(objStream5);
        org.junit.Assert.assertNotNull(objStream6);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator3 = objCollection0.spliterator();
        java.lang.Object[] objArray4 = objCollection0.toArray();
        java.util.stream.Stream<java.lang.Object> objStream5 = objCollection0.stream();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objSpliterator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objStream5);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.stream.Stream<java.lang.Object> objStream1 = objCollection0.stream();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection2);
        boolean boolean4 = objCollection0.equals((java.lang.Object) randomAccessCollection2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean6 = objCollection5.isEmpty();
        org.apache.commons.collections4.Bag bag7 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean8 = objCollection5.equals((java.lang.Object) bag7);
        boolean boolean9 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        boolean boolean10 = objCollection0.isEmpty();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection11 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection12 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection11);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection13 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection11);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection14 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection11);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection15 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection11);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection16 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection11);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection17 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection16);
        java.lang.Class<?> wildcardClass18 = randomAccessCollection17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = objCollection0.remove((java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objStream1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(bag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(randomAccessCollection11);
        org.junit.Assert.assertNotNull(randomAccessCollection12);
        org.junit.Assert.assertNotNull(randomAccessCollection13);
        org.junit.Assert.assertNotNull(randomAccessCollection14);
        org.junit.Assert.assertNotNull(randomAccessCollection15);
        org.junit.Assert.assertNotNull(randomAccessCollection16);
        org.junit.Assert.assertNotNull(randomAccessCollection17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.collections4.Bag bag0 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        java.util.Set<java.lang.Object> objSet1 = bag0.uniqueSet();
        java.util.stream.Stream<java.lang.Object> objStream2 = objSet1.stream();
        // The following exception was thrown during execution in test generation
        try {
            objSet1.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bag0);
        org.junit.Assert.assertNotNull(objSet1);
        org.junit.Assert.assertNotNull(objStream2);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.collections4.SortedBag<java.util.Iterator<java.lang.Object>> objİtorCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        java.lang.Class<?> wildcardClass1 = objİtorCollection0.getClass();
        org.junit.Assert.assertNotNull(objİtorCollection0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection3 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        java.util.stream.Stream<java.lang.Object> objStream4 = objCollection3.parallelStream();
        java.util.Iterator<java.lang.Object> objİtor5 = objCollection3.iterator();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objCollection3);
        org.junit.Assert.assertNotNull(objStream4);
        org.junit.Assert.assertNotNull(objİtor5);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.util.Iterator<java.lang.Object> objİtor12 = objCollection8.iterator();
        boolean boolean13 = objCollection0.contains((java.lang.Object) objCollection8);
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection0.stream();
        java.util.Spliterator<java.lang.Object> objSpliterator15 = objCollection0.spliterator();
        java.util.Collection<java.lang.Object> objCollection16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = objCollection0.removeAll(objCollection16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objİtor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objSpliterator15);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        java.util.Set<java.lang.Object> objSet4 = bag2.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.collectionBag((org.apache.commons.collections4.Bag<java.lang.Object>) bag2);
        java.util.Set<java.lang.Object> objSet6 = bag2.uniqueSet();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertNotNull(objSet6);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection2);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection3);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection3);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection3);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection7 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection7);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection2);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection3);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection3);
        java.lang.Class<?> wildcardClass6 = randomAccessCollection5.getClass();
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection3 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean4 = objCollection3.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean6 = objCollection3.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.lang.Class<?> wildcardClass7 = objCollection3.getClass();
        boolean boolean8 = objCollection0.equals((java.lang.Object) wildcardClass7);
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection10 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean11 = objCollection10.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream12 = objCollection10.parallelStream();
        java.util.Set<java.lang.Object> objSet13 = objCollection10.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator15 = objCollection14.spliterator();
        java.util.Iterator<java.lang.Object> objİtor16 = objCollection14.iterator();
        boolean boolean17 = objSet13.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection18 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean19 = objCollection18.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream20 = objCollection18.parallelStream();
        java.util.Set<java.lang.Object> objSet21 = objCollection18.uniqueSet();
        boolean boolean22 = objCollection14.containsAll((java.util.Collection<java.lang.Object>) objCollection18);
        boolean boolean23 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        boolean boolean24 = objCollection14.isEmpty();
        java.util.Iterator<java.lang.Object> objİtor25 = objCollection14.iterator();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objStream12);
        org.junit.Assert.assertNotNull(objSet13);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertNotNull(objSpliterator15);
        org.junit.Assert.assertNotNull(objİtor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objStream20);
        org.junit.Assert.assertNotNull(objSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objİtor25);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.collections4.SortedBag<java.lang.reflect.Type[]> typeArrayCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(typeArrayCollection0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.collections4.Bag<java.lang.Iterable<java.lang.Object>[]> objIterableArrayCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(objIterableArrayCollection0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.lang.Object[] objArray2 = objCollection0.toArray();
        java.util.Iterator<java.lang.Object> objİtor3 = objCollection0.iterator();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = objCollection0.remove(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objİtor3);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection5);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection7 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection6);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection8 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection7);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection9 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection8);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection10 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection9);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection7);
        org.junit.Assert.assertNotNull(randomAccessCollection8);
        org.junit.Assert.assertNotNull(randomAccessCollection9);
        org.junit.Assert.assertNotNull(randomAccessCollection10);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        java.util.Spliterator<java.lang.Object> objSpliterator4 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection5.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection7 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection5);
        java.util.Set<java.lang.Object> objSet8 = objCollection7.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection9 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean10 = objCollection9.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection11 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean12 = objCollection9.containsAll((java.util.Collection<java.lang.Object>) objCollection11);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection13 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean14 = objCollection13.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream15 = objCollection13.parallelStream();
        java.util.Set<java.lang.Object> objSet16 = objCollection13.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection17 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator18 = objCollection17.spliterator();
        java.util.Iterator<java.lang.Object> objİtor19 = objCollection17.iterator();
        boolean boolean20 = objSet16.containsAll((java.util.Collection<java.lang.Object>) objCollection17);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection21 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean22 = objCollection21.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream23 = objCollection21.parallelStream();
        java.util.Set<java.lang.Object> objSet24 = objCollection21.uniqueSet();
        boolean boolean25 = objCollection17.containsAll((java.util.Collection<java.lang.Object>) objCollection21);
        boolean boolean26 = objCollection9.containsAll((java.util.Collection<java.lang.Object>) objCollection17);
        boolean boolean27 = objCollection7.removeAll((java.util.Collection<java.lang.Object>) objCollection17);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objSpliterator4);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertNotNull(objCollection7);
        org.junit.Assert.assertNotNull(objSet8);
        org.junit.Assert.assertNotNull(objCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objCollection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objStream15);
        org.junit.Assert.assertNotNull(objSet16);
        org.junit.Assert.assertNotNull(objCollection17);
        org.junit.Assert.assertNotNull(objSpliterator18);
        org.junit.Assert.assertNotNull(objİtor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objCollection21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objStream23);
        org.junit.Assert.assertNotNull(objSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection3);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection7 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection6);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection8 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection6);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection9 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection7);
        org.junit.Assert.assertNotNull(randomAccessCollection8);
        org.junit.Assert.assertNotNull(randomAccessCollection9);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection13 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection14 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection15 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection14);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection16 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection15);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection17 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection15);
        boolean boolean18 = objCollection13.contains((java.lang.Object) randomAccessCollection17);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection19 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection17);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection20 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection17);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objCollection13);
        org.junit.Assert.assertNotNull(randomAccessCollection14);
        org.junit.Assert.assertNotNull(randomAccessCollection15);
        org.junit.Assert.assertNotNull(randomAccessCollection16);
        org.junit.Assert.assertNotNull(randomAccessCollection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(randomAccessCollection19);
        org.junit.Assert.assertNotNull(randomAccessCollection20);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection7 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection8 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection7);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection7);
        org.junit.Assert.assertNotNull(randomAccessCollection8);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.stream.Stream<java.lang.Object> objStream1 = objCollection0.stream();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection2);
        boolean boolean4 = objCollection0.equals((java.lang.Object) randomAccessCollection2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean6 = objCollection5.isEmpty();
        org.apache.commons.collections4.Bag bag7 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean8 = objCollection5.equals((java.lang.Object) bag7);
        boolean boolean9 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        boolean boolean10 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection11 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator12 = objCollection11.spliterator();
        java.util.Iterator<java.lang.Object> objİtor13 = objCollection11.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection11);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection15 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection11);
        boolean boolean16 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection11);
        // The following exception was thrown during execution in test generation
        try {
            objCollection11.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objStream1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(bag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objCollection11);
        org.junit.Assert.assertNotNull(objSpliterator12);
        org.junit.Assert.assertNotNull(objİtor13);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertNotNull(objCollection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection2);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection3);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.stream.Stream<java.lang.Object> objStream1 = objCollection0.stream();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection2);
        boolean boolean4 = objCollection0.equals((java.lang.Object) randomAccessCollection2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean6 = objCollection5.isEmpty();
        org.apache.commons.collections4.Bag bag7 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean8 = objCollection5.equals((java.lang.Object) bag7);
        boolean boolean9 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        boolean boolean10 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection11 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator12 = objCollection11.spliterator();
        java.util.Iterator<java.lang.Object> objİtor13 = objCollection11.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection11);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection15 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection11);
        boolean boolean16 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection11);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection17 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        java.util.Iterator<java.lang.Object> objİtor18 = objCollection17.iterator();
        java.util.Set<java.lang.Object> objSet19 = objCollection17.uniqueSet();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objStream1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(bag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objCollection11);
        org.junit.Assert.assertNotNull(objSpliterator12);
        org.junit.Assert.assertNotNull(objİtor13);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertNotNull(objCollection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objCollection17);
        org.junit.Assert.assertNotNull(objİtor18);
        org.junit.Assert.assertNotNull(objSet19);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection2);
        java.util.stream.Stream<java.lang.Object> objStream4 = objCollection0.stream();
        java.util.Iterator<java.lang.Object> objİtor5 = objCollection0.iterator();
        java.lang.Object[] objArray6 = objCollection0.toArray();
        java.util.Spliterator<java.lang.Object> objSpliterator7 = objCollection0.spliterator();
        boolean boolean8 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection9 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean10 = objCollection9.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream11 = objCollection9.parallelStream();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection12.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean15 = objCollection12.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        java.lang.Class<?> wildcardClass16 = objCollection12.getClass();
        boolean boolean17 = objCollection9.equals((java.lang.Object) wildcardClass16);
        java.util.Set<java.lang.Object> objSet18 = objCollection9.uniqueSet();
        java.util.stream.Stream<java.lang.Object> objStream19 = objSet18.stream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = objCollection0.retainAll((java.util.Collection<java.lang.Object>) objSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objStream4);
        org.junit.Assert.assertNotNull(objİtor5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objStream11);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objSet18);
        org.junit.Assert.assertNotNull(objStream19);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator3 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor4 = objCollection0.iterator();
        java.util.Iterator<java.lang.Object> objİtor5 = objCollection0.iterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection6 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        java.util.Iterator<java.lang.Object> objİtor7 = objCollection6.iterator();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objSpliterator3);
        org.junit.Assert.assertNotNull(objİtor4);
        org.junit.Assert.assertNotNull(objİtor5);
        org.junit.Assert.assertNotNull(objCollection6);
        org.junit.Assert.assertNotNull(objİtor7);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.collections4.SortedBag<org.apache.commons.collections4.Bag<java.lang.Object>> objCollectionCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(objCollectionCollection0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection2);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection2);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection2);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection2);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection2);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.collections4.Bag bag0 = org.apache.commons.collections4.BagUtils.EMPTY_SORTED_BAG;
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection1 = org.apache.commons.collections4.BagUtils.collectionBag((org.apache.commons.collections4.Bag<java.lang.Object>) bag0);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection1);
        org.junit.Assert.assertNotNull(bag0);
        org.junit.Assert.assertNotNull(objCollection1);
        org.junit.Assert.assertNotNull(objCollection2);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.lang.Object obj13 = null;
        boolean boolean14 = objCollection4.equals(obj13);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection15 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection16 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection15);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objCollection15);
        org.junit.Assert.assertNotNull(objCollection16);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection3);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection7 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection8 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection7);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection7);
        org.junit.Assert.assertNotNull(randomAccessCollection8);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        java.util.Spliterator<java.lang.Object> objSpliterator4 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection5 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection6 = org.apache.commons.collections4.BagUtils.synchronizedBag(objCollection0);
        java.util.stream.Stream<java.lang.Object> objStream7 = objCollection0.parallelStream();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objSpliterator4);
        org.junit.Assert.assertNotNull(objCollection5);
        org.junit.Assert.assertNotNull(objCollection6);
        org.junit.Assert.assertNotNull(objStream7);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        java.lang.Object[] objArray16 = new java.lang.Object[] { objSet3, 1.0f, 0, (short) 0, (-1.0f), objSet11, 0L, 100, (short) 1, (-1L) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        boolean boolean20 = objList17.remove((java.lang.Object) (-1.0f));
        java.util.Iterator<java.lang.Object> objİtor21 = objList17.iterator();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[[], 1.0, 0, 0, -1.0, [], 0, 100, 1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[[], 1.0, 0, 0, -1.0, [], 0, 100, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objİtor21);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection2.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection2.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.lang.Class<?> wildcardClass6 = objCollection2.getClass();
        boolean boolean7 = objCollection0.equals((java.lang.Object) wildcardClass6);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.lang.Class<?> wildcardClass11 = objStream10.getClass();
        java.lang.Class[] classArray13 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        wildcardClassArray14[0] = wildcardClass11;
        java.lang.Class<?>[] wildcardClassArray17 = objCollection0.toArray(wildcardClassArray14);
        boolean boolean18 = objCollection0.isEmpty();
        java.util.Spliterator<java.lang.Object> objSpliterator19 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection20 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.stream.Stream<java.lang.Object> objStream21 = objCollection20.stream();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection22 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection23 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection22);
        boolean boolean24 = objCollection20.equals((java.lang.Object) randomAccessCollection22);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection25 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean26 = objCollection25.isEmpty();
        org.apache.commons.collections4.Bag bag27 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean28 = objCollection25.equals((java.lang.Object) bag27);
        boolean boolean29 = objCollection20.containsAll((java.util.Collection<java.lang.Object>) objCollection25);
        boolean boolean30 = objCollection20.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream31 = objCollection20.parallelStream();
        java.util.Set<java.lang.Object> objSet32 = objCollection20.uniqueSet();
        boolean boolean33 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objSet32);
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objSpliterator19);
        org.junit.Assert.assertNotNull(objCollection20);
        org.junit.Assert.assertNotNull(objStream21);
        org.junit.Assert.assertNotNull(randomAccessCollection22);
        org.junit.Assert.assertNotNull(randomAccessCollection23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objCollection25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(bag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objStream31);
        org.junit.Assert.assertNotNull(objSet32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection3);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection7 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection4);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection8 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
        org.junit.Assert.assertNotNull(randomAccessCollection7);
        org.junit.Assert.assertNotNull(randomAccessCollection8);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        org.apache.commons.collections4.Bag bag2 = org.apache.commons.collections4.BagUtils.EMPTY_BAG;
        boolean boolean3 = objCollection0.equals((java.lang.Object) bag2);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean5 = objCollection4.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream6 = objCollection4.parallelStream();
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection8.spliterator();
        java.util.Iterator<java.lang.Object> objİtor10 = objCollection8.iterator();
        boolean boolean11 = objSet7.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.util.Iterator<java.lang.Object> objİtor12 = objCollection8.iterator();
        boolean boolean13 = objCollection0.contains((java.lang.Object) objCollection8);
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection0.stream();
        java.util.Spliterator<java.lang.Object> objSpliterator15 = objCollection0.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection16 = org.apache.commons.collections4.BagUtils.collectionBag(objCollection0);
        java.util.Set<java.lang.Object> objSet17 = objCollection16.uniqueSet();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(bag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objStream6);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(objİtor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objİtor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objSpliterator15);
        org.junit.Assert.assertNotNull(objCollection16);
        org.junit.Assert.assertNotNull(objSet17);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator1 = objCollection0.spliterator();
        java.util.Iterator<java.lang.Object> objİtor2 = objCollection0.iterator();
        java.util.stream.Stream<java.lang.Object> objStream3 = objCollection0.stream();
        boolean boolean4 = objCollection0.isEmpty();
        java.util.Set<java.lang.Object> objSet5 = objCollection0.uniqueSet();
        java.util.Spliterator<java.lang.Object> objSpliterator6 = objSet5.spliterator();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objSpliterator1);
        org.junit.Assert.assertNotNull(objİtor2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertNotNull(objSpliterator6);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection1);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection2);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.collections4.Bag<java.lang.Comparable<java.lang.String>[][]> strComparableArrayCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        org.junit.Assert.assertNotNull(strComparableArrayCollection0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.stream.Stream<java.lang.Object> objStream1 = objCollection0.stream();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection2);
        boolean boolean4 = objCollection0.equals((java.lang.Object) randomAccessCollection2);
        java.util.stream.Stream<java.lang.Object> objStream5 = objCollection0.parallelStream();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertNotNull(objStream1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objStream5);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess[][]> randomAccessArrayCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.junit.Assert.assertNotNull(randomAccessArrayCollection0);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection0 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean1 = objCollection0.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection4 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator5 = objCollection4.spliterator();
        java.util.Iterator<java.lang.Object> objİtor6 = objCollection4.iterator();
        boolean boolean7 = objSet3.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection8 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean9 = objCollection8.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream10 = objCollection8.parallelStream();
        java.util.Set<java.lang.Object> objSet11 = objCollection8.uniqueSet();
        boolean boolean12 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.util.Set<java.lang.Object> objSet13 = objCollection4.uniqueSet();
        org.junit.Assert.assertNotNull(objCollection0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objStream2);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objCollection4);
        org.junit.Assert.assertNotNull(objSpliterator5);
        org.junit.Assert.assertNotNull(objİtor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objSet13);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection0 = org.apache.commons.collections4.BagUtils.emptySortedBag();
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection1 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection2 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection0);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection3 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection2);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection4 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection3);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection5 = org.apache.commons.collections4.BagUtils.synchronizedSortedBag(randomAccessCollection3);
        org.apache.commons.collections4.SortedBag<java.util.RandomAccess> randomAccessCollection6 = org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection0);
        org.junit.Assert.assertNotNull(randomAccessCollection1);
        org.junit.Assert.assertNotNull(randomAccessCollection2);
        org.junit.Assert.assertNotNull(randomAccessCollection3);
        org.junit.Assert.assertNotNull(randomAccessCollection4);
        org.junit.Assert.assertNotNull(randomAccessCollection5);
        org.junit.Assert.assertNotNull(randomAccessCollection6);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.collections4.Bag bag0 = org.apache.commons.collections4.BagUtils.EMPTY_SORTED_BAG;
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection1 = org.apache.commons.collections4.BagUtils.collectionBag((org.apache.commons.collections4.Bag<java.lang.Object>) bag0);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection2 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean3 = objCollection2.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream4 = objCollection2.parallelStream();
        java.util.Set<java.lang.Object> objSet5 = objCollection2.uniqueSet();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection6 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator7 = objCollection6.spliterator();
        java.util.Iterator<java.lang.Object> objİtor8 = objCollection6.iterator();
        boolean boolean9 = objSet5.containsAll((java.util.Collection<java.lang.Object>) objCollection6);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection10 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean11 = objCollection10.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection12 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean13 = objCollection12.isEmpty();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection14 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean15 = objCollection12.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        java.lang.Class<?> wildcardClass16 = objCollection12.getClass();
        boolean boolean17 = objCollection10.equals((java.lang.Object) wildcardClass16);
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection18 = org.apache.commons.collections4.BagUtils.emptyBag();
        boolean boolean19 = objCollection18.isEmpty();
        java.util.stream.Stream<java.lang.Object> objStream20 = objCollection18.parallelStream();
        java.lang.Class<?> wildcardClass21 = objStream20.getClass();
        java.lang.Class[] classArray23 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        wildcardClassArray24[0] = wildcardClass21;
        java.lang.Class<?>[] wildcardClassArray27 = objCollection10.toArray(wildcardClassArray24);
        java.lang.reflect.Type[] typeArray28 = objCollection6.toArray((java.lang.reflect.Type[]) wildcardClassArray27);
        boolean boolean29 = objCollection1.addAll((java.util.Collection<java.lang.Object>) objCollection6);
        java.util.Spliterator<java.lang.Object> objSpliterator30 = objCollection1.spliterator();
        org.apache.commons.collections4.Bag<java.lang.Object> objCollection31 = org.apache.commons.collections4.BagUtils.emptyBag();
        java.util.Spliterator<java.lang.Object> objSpliterator32 = objCollection31.spliterator();
        java.util.Iterator<java.lang.Object> objİtor33 = objCollection31.iterator();
        java.util.stream.Stream<java.lang.Object> objStream34 = objCollection31.stream();
        java.util.stream.Stream<java.lang.Object> objStream35 = objCollection31.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = objCollection1.add((java.lang.Object) objCollection31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bag0);
        org.junit.Assert.assertNotNull(objCollection1);
        org.junit.Assert.assertNotNull(objCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objStream4);
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertNotNull(objCollection6);
        org.junit.Assert.assertNotNull(objSpliterator7);
        org.junit.Assert.assertNotNull(objİtor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objStream20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objSpliterator30);
        org.junit.Assert.assertNotNull(objCollection31);
        org.junit.Assert.assertNotNull(objSpliterator32);
        org.junit.Assert.assertNotNull(objİtor33);
        org.junit.Assert.assertNotNull(objStream34);
        org.junit.Assert.assertNotNull(objStream35);
    }
}

