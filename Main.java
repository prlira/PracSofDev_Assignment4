package mazegame;
import java.util.Scanner;
public class Main {
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in); //This allows us to ask for input using the keyboard
	        boolean game=true; //This controls the game loop so it keeps running until the game ends.
	        int size=8;
	        int energy=20;
	        Player p=new Player(energy); // generates the energy level of the player
	        Maze maze = new Maze(size); // generates the maze the player will play on

	        System.out.println("WELCOME TO PAM'S MAZE!");
	        
	        while(game){
	            System.out.println("Player Position:["+p.locX()+","+p.locY()+"]");
	            System.out.println("Energy:"+p.Energy());
	            System.out.print("Move W/A/S/D:");
	            String move = s.nextLine().toUpperCase();

	            //The  following stores the player current position [x,y] by calling the methods under the Player class
	            // This helps the player know their location on the maze before moving using rhe keyboard.
	            int x = p.locX(); int y= p.locY(); 
	            if(move.equals("W")){
	                y++;
	            } 
	            else if(move.equals("S")){
	                y--;
	            } 
	            else if(move.equals("A")){
	                x--;
	            } 
	            else if(move.equals("D")){
	                x++;
	            } 
	    
	            else{
	                System.out.println("Please only press W(up), S(down), A(left), D(right)");
	                continue;
	            }
	            
	            //The following logic checks the maze at the player’s coordinates 
	            //calling the Tile class, we store the tile they step on so it  can know if the player can move there
	            //Otherwise if they hit a wall or get to the goal exit tile then it executes the respective methods from the Tile class.
	            Tile goaltile=maze.getTile(x, y);
	            if(goaltile.Wall()){
	                System.out.println("You hit a wall!");
	            } 
	            else{
	        
	                if (move.equals("W")) p.moveUp();
	                else if (move.equals("S")) p.moveDown();
	                else if (move.equals("A")) p.moveLeft();
	                else if (move.equals("D")) p.moveRight();
	            }

	            if(goaltile.Exit()) {
	                System.out.println("You escaped the maze!");
	            }else if (p.Energy()==0){
	                System.out.println("NO MORE ENERGY! Game over.");
	            }
	        }
	    }
	}
