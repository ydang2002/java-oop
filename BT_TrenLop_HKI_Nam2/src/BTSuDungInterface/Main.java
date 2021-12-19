package BTSuDungInterface;

public class Main {

	public static void main(String[] args) {
		Pet[] pets = new Pet[3];
		pets[0] = new Dog();
		pets[1] = new Cat();
		pets[2] = new RobotDog();
		
		for(Pet pet: pets) {
			pet.beFriendly();
			pet.play();
		}
		
	}

}
