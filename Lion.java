public class Lion extends Animal{
	
private String jungle;
	
	
public Lion(String name,int age, String jungle){
		
super(name,age);
		
this.jungle = jungle;
		
	
}
	
public int myAge(){
	
return age;


}
public String makeSound(){
	return "Roar! Roar!" ;
}
	
public String getJungle(){
		
return jungle;
	
}
	
public void setJungle(String jungle){
		
this.jungle = jungle;
	
}

}
