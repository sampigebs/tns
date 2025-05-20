package com.tns.day4;

public class SLInheritanceDemo {

	public static void main(String[] args) {
		
		Student obj = new Student("sam", "bgl", 123, 432, 456, "vit");
        System.out.println(obj);

        Citizen c1 = new Citizen("sampu", "gkt", 198, 765);
        System.out.println(c1);
	}

}
