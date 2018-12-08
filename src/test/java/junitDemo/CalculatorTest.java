package junitDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
* Calculator Tester. 
* 
* @author <Authors name> 
* @since <pre>十一月 25, 2018</pre> 
* @version 1.0 
*/ 
public class CalculatorTest { 

@Before
public void before() throws Exception {

    System.out.println("======start=========");
}

@After
public void after() throws Exception {
    System.out.println("======end=========");
} 

/** 
* 
* Method: sum(int a) 
* 
*/ 
@Test
public void testSum() throws Exception { 
    Calculator calculator = new Calculator();
    assertEquals(6, calculator.sum(100));
    }
} 
