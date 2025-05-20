package comtnsday1;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//widening casting
		
       float b =10.2f; //1 byte of memory
       double i = b;   // 2 byte of memory
       System.out.println(i);
       
       //narrowing
       
       long f1 = 10000l;
       double f2 = (double)f1; //coversion explict
       System.out.println(f2);
       
	}

}
