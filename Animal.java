public abstract class Animal
{
	
protected String name;
protected int  age;

	
	
public Animal(String name,int age){
		
this.name = name;
this.age = age;
	
}


public abstract String makeSound();
public String getName(){
		return name;
	}
public void setName(String name){
		
this.name = name;
	
}

public abstract int myAge();
public double getAge(){
	return age;
}
public void setHeight(int age){
	this.age = age;
}
}
