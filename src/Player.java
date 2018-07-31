
public class Player {
	private int x_coord;
	private int y_coord;
	
	enum Direction
	{
	    LEFT, RIGHT, UP, DOWN, NONE;
	}
	
	private Direction facing;
	
	public int getcoord(boolean left) {
		if (left)
			return x_coord;
		else
			return y_coord; 
	}
	
	public void setDirection(Direction newDirection) {
		//adjust direction
		facing = newDirection;
	}
	
	public void update(){
		//all the necessary updating and checking of player 
		move();
	}
	
	private void move() {
		//move based on direction
		switch(this.facing) {
		   case LEFT:
		      x_coord--;
		      break;
		   
		   case RIGHT :
		      x_coord++;
		      break;
		   case UP :
			   y_coord++;
			   break;
		   case DOWN :
			   y_coord--;
			   break;
		   default :
			   //nada
		}
	}
	
}
