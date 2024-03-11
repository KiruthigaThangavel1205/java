package First_Package;

public class Person 
{
  private String PersonName;
  private int PersonAge;
  private String PersonCity;
  
	public String getPersonName() {
		return(PersonName);
	}
	public void setPersonName(String Name) {
		this.PersonName=Name;
	}
	public int getPersonAge() {
		return PersonAge;
	}
	public void setPersonAge(int Age) {
		PersonAge = Age;
	}
	public String getPersonCity() {
		return PersonCity;
	}
	public void setPersonCity(String City) {
		PersonCity = City;
	}
	Person()
	{
		System.out.println("\nDefault Constructor INVOKED\n");
	}
	Person(String Name, int Age, String City)
	{
	  System.out.println("\nParameterized Constructor INVOKED\n");
	  this.PersonName=Name;
	  this.PersonAge=Age;
	  this.PersonCity=City;
	}
}