package BTSuDungInterface;

public class Cat extends Feline implements Pet{

	@Override
	public void beFriendly() {
		System.out.println("Cat is friendly");
		
	}

	@Override
	public void play() {
		System.out.println("Cat plays");		
	}

}
