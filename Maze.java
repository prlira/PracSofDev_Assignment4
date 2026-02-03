package mazegame;

public class Maze {
    private int size;
    private Tile[][] grid;
    public Maze(int size){
        this.size=size;
        //using a for-loop we make an array of tiles using the size and we fills every position [x,y] 
        //with a tile that is not a wall and not an exit
        grid = new Tile[size][size];
        for(int x=0;x<size;x++){
            for(int y = 0;y < size;y++){
                grid[x][y] =new Tile(false, false);
            }
        }
        //the starting tile should not be an exit
        int exitX=0,exitY=0;
        grid[0][0]= new Tile(false, false);
        while (exitX==0 && exitY==0) {
            exitX =(int)(Math.random()*size);
            exitY =(int)(Math.random()* size);
            //multiplying a random decimal between 0 and 1 (Math.random()) by the maze size
            //we converting it to an integer so it will be a usable coordinate
        }
        //This block uses a while loop and generating random coordinates 
        //then it sets that randomly chosen tile as the exit
        grid[exitX][exitY]=new Tile(false, true);
    }
//we use getTile method method to return the tile at the given coordinates
    //if the coordinates are outside the maze boundaries it returns a new tile marked as a wall
    public Tile getTile(int x, int y) {
        if (x<0){
            return new Tile(true, false);
        }
        if (x>= size){
            return new Tile(true, false);
        }
        if (y<0){
            return new Tile(true, false);
        }
        if (y>=size){
            return new Tile(true, false);
        }
        return grid[x][y];
    }


    public int getSize() {
        return size;
    }
}
