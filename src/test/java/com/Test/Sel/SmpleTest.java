package com.Test.Sel;



import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SmpleTest {
	
	@Test
	public void test_Url()
	{
		Assert.assertEquals("url", "https://www.amazon.com/");
	}
	@Test
	public void test_Title()
	{
		Assert.assertEquals("edgeops", "edgeops");
	}
	@Test
	public void test_ButtonText()
	{
		Assert.assertTrue(false);
	}
	@Test
	public void test_SerachText()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void test_Customer_Details()
	{
	throw new SkipException("skipped");
	}
	@Test
	public void test_ApiUrl()
	{
		throw new SkipException("skipped");
	}
	@Test
	public void test_ExecutionCount()
	{
		Assert.assertEquals(20, 10);
	}
	@Test
	public void test_humidity()
	{
		Assert.assertEquals(20, 10.15);
	}
	@Test
	public void test1()
	{
		Assert.assertEquals(36,36);
	}
	@Test
	public void test2()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void test3()
	{
		Assert.assertTrue(false);
	}
	@Test
	public void test4()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void test5()
	{
		Assert.assertEquals(38,36);
	}
}
