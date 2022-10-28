public class Main
{
	
public static void main(String[] args){
		
Animal animal;
	
Cat cat = new Cat ("famela",4, "American Cat");
		
Lion lion = new Lion("Ranes" ,9, "Mangyan");
		
		
animal = cat ;
		
System.out.println(animal.makeSound() + " I'm a "+ animal  + " My age is  "  + animal.myAge()+ "!"); 


		
animal = lion;
		
System.out.println(animal.makeSound()  + " I'm a " + animal  + " My age is " + animal.myAge() + " !");
		
}
}
