package sabuzamel2015a06;

/**
 *
 * @author samyabuzamel
 */
public class Turtle extends Animal {
  
   public Turtle() {
		setName( "Joey the Turtle");
		setEyes( 2 );
		setLegs( 4 );
		setWeight(10); // kg
		setPosition(5); // Joey is a cheater, like all turtles
		
	}
	
	
	@Override
	public void move() {
		// Turtles are slow,
		// Get the position
		// Add one to the position
		// Set the position to the new value
		int pos = this.getPosition();
		
		pos = pos + 1;
		
		this.setPosition(pos);
   
   }
}
