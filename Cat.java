public class Cat extends Animal{

private String breed;


public Cat(String name,int age, String breed)
{
	
super (name,age);
	
this.breed = breed;

}

public int myAge(){
	
return age; 

} 
public String makeSound(){
	return "Meow ! Meow! ";
}

public String getbreed(){
	
return breed;

}
 

public void setbreed(String breed){
	
this.breed = breed;

}

}
