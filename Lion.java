package sabuzamel2015a06;

/**
 *
 * @author samyabuzamel
 */
public class Lion extends Animal {
  private int i = 0;
   
  public Lion() {
		setName( "Simba the Lion");
		setEyes( 2 );
		setLegs( 4 );
		setWeight(250); // kg
		setPosition(7); // Simba is smart and very fast.
		
	}
	
	/**
	 * The lion is the fastest animal in the race
	 *
	 */
	@Override
	public void move() {

		int pos = this.getPosition();
		
		
		/**
		 * Put the Lion to sleep for 5 moves,then move 7 places
		 */
		if( i++ % 6 == 0 ) {
			pos = pos + 7;
		} // Else sleep
		
		
		
		this.setPosition( pos );
		
		
	}

}
