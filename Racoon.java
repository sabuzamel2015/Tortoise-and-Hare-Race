package sabuzamel2015a06;

/**
 *
 * @author samyabuzamel
 */

  public class Racoon extends Animal {
  private int i = 0;
   
  public Racoon() {
		setName( "Meeko the racoon");
		setEyes( 2 );
		setLegs( 4 );
		setWeight(10); // kg
		setPosition(2); // Meeko is not very fast. He is also not very smart
		
	}
	
	/**
	 * The Racoon is not as fast as the lion 
	 * He is not as smart as the Hare and the turtle, but smarter than the dog.
	 */
	@Override
	public void move() {

		int pos = this.getPosition();
		
		
		/**
		 * Put Meeko to sleep for 7 moves,then move 2 places
		 */
		if( i++ % 8 == 0 ) {
			pos = pos + 2;
		} // Else sleep
		
		
		
		this.setPosition( pos );
   }		
}
