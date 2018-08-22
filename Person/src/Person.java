import java.util.ArrayList;

public class Person {
	
	//define variables
	private String name;
	private int age;
	private String jobTitle;
	
	//creating the input function
	public Person(String name, int age, String jobT) {
		// TODO Auto-generated constructor stub
		this.name=name; //if you dont have this, it will print name=null
		this.age=age; //if you dont have this, it will print age=0
		this.jobTitle=jobT; //if you dont have this, it will print Jobt=null
	}

	public static void main(String[] args) // Always needed and one per class!

	{
	
	Person vinu = new Person("vinu",24,"It Consultant"); //adding an object/a person
	Person seys = new Person("seys",17,"It guy");
	
	ArrayList<Person> people = new ArrayList<Person>(); //we want to import all the people created in an array. Note that PEOPLE is plural because the array will carry a list of each person
	
	people.add(vinu); //actually adds the people > stores as people[0]
	people.add(seys); //as this array wont know what to print, you need a toString method
	
	System.out.println(people.toString()); //this should print out the array, but only after defining toString (see outside/below the main)
	//However, this is messy, so create a for loop >>>>>> .toString calls the toString method!!!!
	
	for (int i=0; i< people.size(); i++) //PEOPLE.SIZE() BETTER THAN WHILE LOOP
	{
	System.out.println(people.get(i)); //PEOPLE.GET(i) FOR ARRAYLIST, PEOPLE[1] FOR ARRAY
	}
	
	for(int i = 0; i<people.size(); i++){
        if(people.get(i).getName().contains(searchName)){
            System.out.println(people.get(i).getName() +" "+ people.get(i).getAge() +" "+ people.get(i).getJOBBBB());
	}
	
	public String toString() {
		return "Name: " + name + "\nAge: " + age + "\nJob Title: " + jobTitle + "\n";
	}
}

