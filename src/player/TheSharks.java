package player;

public class TheSharks extends Player {
	
	
	

	@Override
	public String Roshambo() {
		// TODO Auto-generated method stub
		
		int random = (int) (Math.random() * 3);
		
		if(random == 1){
			setRoshambo("Rock");
		}
		else if (random ==2){
			setRoshambo("Peper");
		}
		else{
			setRoshambo("Scissors");
		}
		
		return getRoshambo();
	}

	public void printName() {
		System.out.println( Roshambo());
	}
	
	
	
	
	
	
}
