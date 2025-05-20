package com.tns.day6.finalKeyword;

	final class FinalClassDemo 
	{
	void show()
	{
		System.out.println("confidential data");
	}

	class FinalClassDemo1 extends FinalClassDemo // we cannot do inheritance in final class
	{
		void show()
		{
			System.out.println("non confidential data");
		}
	}
}
