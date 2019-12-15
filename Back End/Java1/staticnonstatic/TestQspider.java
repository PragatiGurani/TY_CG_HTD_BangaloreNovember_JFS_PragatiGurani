package com.capgemini.staticnonstatic;

public class TestQspider
{
	public static void main(String arr[])
	{
		Qspider btr=new Qspider();
		btr.swipe();
		btr.swipe();
		Qspider hebbal=new Qspider();
		hebbal.swipe();
		
		System.out.println(btr.branchCount); //2 called 2times
		System.out.println(hebbal.branchCount); // called once
		System.out.println(Qspider.totalCount);
	}

}
