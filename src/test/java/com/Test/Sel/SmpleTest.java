package com.Test.Sel;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
public class SmpleTest {
	
	@Test
	public void test_Url()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void test_Title()
	{
		Assert.assertEquals("edgeops", "edgeops");
	}
	@Test
	public void test_ButtonText()
	{
		Assert.assertTrue(true);
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
		Assert.assertTrue(true);
	}
	@Test
	public void test1()
	{
		Assert.assertTrue(true);
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
		Assert.assertTrue(true);
	}
}
