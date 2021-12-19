package BTSuDungInterface;

public class Dog extends Feline implements Pet {
	@Override
	public void beFriendly() {
		System.out.println("Dog is friendly");
		
	}

	@Override
	public void play() {
		System.out.println("Dog plays");		
	}

}
