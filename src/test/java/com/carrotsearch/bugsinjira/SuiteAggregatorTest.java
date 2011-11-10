package com.carrotsearch.bugsinjira;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses(
{
    SuiteAggregatorTest.Test1.class,
    SuiteAggregatorTest.Test2.class
})
public class SuiteAggregatorTest
{
    public static class Test1 {
        @Test
        public void method1() {}
    }
    
    public static class Test2 extends Test1 {
    }    
}
