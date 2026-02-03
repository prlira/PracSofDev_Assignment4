package mazegame;

public class Tile{
	    private boolean isWall;
	    private boolean isExit;
	    //Tile class stores data from a single cell in the maze
	    //We return the value to check if the tile where the player is is a wall (isWall) or exit (isExit) 
	    public Tile(boolean wall,boolean exit) {
	        this.isWall = wall;
	        this.isExit = exit;
	    }
	    public boolean Exit(){ 
	    	return isExit; 
	    	}
	    public boolean Wall(){ 
	    	return isWall; 
	    	}
	  
	}


