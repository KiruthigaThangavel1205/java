package Second_Package;

import First_Package.Base;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b=new Base();
//		b.defaultMethod(); not accessible
//		b.privateMethod(); not accessible
//		b.protectedMethod(); not accessible
		b.publicvar=200;
		b.publicMethod();
	}

}
