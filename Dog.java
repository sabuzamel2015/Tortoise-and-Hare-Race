package sabuzamel2015a06;



/**
 *
 * @author samyabuzamel
 */
public class Dog extends Animal {
  private int i = 0;
   
   public Dog() {
		setName("Clifford the big red dog");
		setEyes(2);
		setLegs(4);
		setWeight(20); // kg
		setPosition(6); // Clifford is not smart. He is not fast either
		
	}
	/**
	 * The dog is not as smart as the other animals in the race
	 */
	
	@Override
	public void move() {
		
		int pos = this.getPosition();
		
		/**
		 * Put Clifford to sleep for 6 moves, then move 1 place
		 */
		if( i++ % 7 == 0 ) {
			pos = pos + 1;
		
      } // Else sleep
      
      
      this.setPosition( pos );
    }

}

