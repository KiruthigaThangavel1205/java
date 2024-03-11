package First_Package;

public class Base 
{
  int defaultvar=20;
  public int publicvar=30;
  private int privatevar=40;
  protected int protectedvar=50;

    void defaultMethod()
	{
		System.out.println("\nDefault access Base class");
		System.out.println("Default variable : "+defaultvar);
	}
	public void publicMethod()
	{
		System.out.println("\nPublic access Base class");
		System.out.println("Public variable : "+publicvar);
	}
	private void privateMethod()
	{
		System.out.println("\nprivate access Base class");
		System.out.println("Private variable : "+privatevar);
	}
	protected void protectedMethod()
	{
		System.out.println("\nprotected access Base class");
		System.out.println("Protected variable : "+protectedvar);
	}
}