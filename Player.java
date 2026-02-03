package mazegame;

public class Player {
	    private int x;
	    private int y;
	    private int energy;
	  //Player class tells the player’s position (x, y) and remaining energy in the maze
	
	    // we use and getter methods to check the player’s current position and energy
	    public Player(int energy){
	    	this.energy=energy;
	        this.x=0;
	        this.y=0;
	        
	    }
	    
	    //the following functions  helps us update the coordinates and decrease energy
	    public void moveLeft(){ 
	    	x--; 
	    	energy--; 
	    	}
	    public void moveRight(){ 
	    	x++; 
	    	energy--; 
	    	}
	    public void moveUp(){
	    	y++; 
	    	energy--; 
	    	}
	    public void moveDown(){ 
	    	y--; 
	    	energy--; }
	    
	    public int locX() { return x; }
	    public int locY() { return y; }
	    public int Energy() { return energy;}
	}


