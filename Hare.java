package sabuzamel2015a06;



/**
 *
 * @author samyabuzamel
 */
public class Hare extends Animal {
   private int i = 0;
	
	public Hare() {
		setName( "Phil Collins the Hare");
		setEyes( 2 );
		setLegs( 4 );
		setWeight(1); // kg
		setPosition(0); // Not a cheater, but not too bright
		
	}
	
	/**
	 * The hare is faster than the turtle
	 * Much faster
	 */
	@Override
	public void move() {

		int pos = this.getPosition();
		
		
		/**
		 * Put the hare to sleep for 4 moves, move 1 move
		 */
		if( i++ % 5 == 0 ) {
			pos = pos + 4;
		} // Else sleep
		
		
		
		this.setPosition( pos );
		
		
	}

}
 
