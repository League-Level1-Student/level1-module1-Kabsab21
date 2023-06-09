package _07_duck;

public class duck {
	 int numberOfFriends = 5;
	 String favoriteFood = "donuts";
	
	 



	public duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	

	void quack(){
	System.out.println("quacke");
	}
	
	void waddle(){
		System.out.println("waddle waddle");
	}
	
}