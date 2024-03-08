package org.revise;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BrowserLaunch_Junit {
	
	
	@AfterClass
	public static void AfterClass() {
		System.out.println("After Class");
	}
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@After
	public void after() {
		System.out.println("Ater");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
    @Test
	public  void method1() {
	System.out.println("Method1");
	}
	
    @Test
	public  void abc() {
	System.out.println("Method2");
	}
    
    @Test
	public  void hi() {
	System.out.println("Hi");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
