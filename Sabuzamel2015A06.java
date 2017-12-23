package sabuzamel2015a06;

import java.util.ArrayList;

/**
 *
 * @author samyabuzamel
 */
public class Sabuzamel2015A06 {

   /**
    * Worked on assignment with Taha Zuhair, Kashan Sheikh, Al Campbell, 
    * Carlos Miyares and Adam Gruber
    */
   /*
   This assigntment is in reference to animals racing. There are programming
   techniques such as setters and getters that are used in this assignment*/
   
   
   public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		char[] c = { '~', '<', '>', '#' };
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add( new Turtle() );
		animals.add( new Hare() );
		animals.add( new Dog() );
      animals.add( new Lion() );
      animals.add(new Racoon() );
      // Make more animals
		// Add them to the array
		// Run the game
		
		
		System.out.println( "The race characters are:");
		
		// Print the name of the two animals
		for( Animal animal : animals ) {
			System.out.println( animal.getName() );
		}
		
		int lengthOfRace = 80;
		boolean gameOver = false;
		while( !gameOver ) {
			for( Animal animal : animals ) {
				animal.move();
				if( animal.getPosition() > lengthOfRace ) {
					System.out.println( animal.getName() + " wins");
					gameOver = true;
					break;
				} else {
					System.out.println( animal.getName() + " position " + animal.getPosition());
					for( int i = 0; i < animal.getPosition(); i++ ) {
						System.out.print( c[i % c.length ] );
					}
					System.out.println();
				}
				
			}
			System.out.println();
			// Go to sleep for 1 second
			Thread.sleep(1000);
		}
		
   }
} 

