package First_Package;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	Base b=new Base();
	b.defaultMethod();
	b.publicMethod();
//	b.privateMethod(); not accessible
	b.protectedMethod();
	
	b.defaultvar=100;
	b.defaultMethod();
	b.publicvar=200;
	b.publicMethod();
//	b.privatevar=300;
//	b.privateMethod(); not accessible
	b.protectedvar=400;
	b.protectedMethod();
	System.out.println(b instanceof Base);
	
	}

}
