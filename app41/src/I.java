class Person
{
	String name;
	int age;
	Person (String name, int age)
	{
		this.name = name;
		this.age = age;
	}
}
class I
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("Murali", 33);
		Person p2 = new Person("Swathi", 23);
		Person p3 = new Person("Suresh", 35);
		System.out.println(p1.name + "," + p1.age);
		System.out.println(p2.name + "," + p2.age);
		System.out.println(p3.name + "," + p3.age);
	}
}
