package com.Sample;

import org.testng.annotations.Test;

public class Manju_demo
{
	@Test(groups = "smoke")
	  
	  public void create()
	  {
		  System.out.println("created succesfully");
	  }

	@Test(groups = "regression")
	public void modify()
	{
		System.out.println("modified succesfully");
	}
	}


