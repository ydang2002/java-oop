package BTSuDungInterface;

public class RobotDog extends RoBot implements Pet {

	@Override
	public void beFriendly() {
		System.out.println("RoboDog is friendly");
	}

	@Override
	public void play() {
		System.out.println("RoboDog plays");		
	}
	
}
