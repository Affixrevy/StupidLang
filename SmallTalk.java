/*
Search:
Step 1 imediatly eliminate any death cells next to the robot
Step 2 find the highest cell on the grid
Step 3 check its not surrounded by death
if no cont. else check next highest
step 4 find the fastest posible route by directionaly based algorithims
*/
     

public static boolean Jail(board, highX, highY){
	boolean isJail = false;
	int wall = 0;
	
	for(int i = 1; i < 11; i++){
		if(board.position(highX + i, highY).isDeath()){
            //isDeath() checks for death cell
			if(board.position(highX + i, highY + 1).isDeath() && board.position(highX + i, highY - 1).isDeath()){
				wall++;
			}
		}
        if(board.position(highX - 1, highY).isDeath()){
            if(board.position(highX - i, highY + 1).isDeath() && board.position(highX - i, highY - 1).isDeath()){
                wall++
            }
        }
        if(board.position(highX, highY + i).isDeath()){
            if(board.position(highX + 1, highY + i).isDeath() && board.position(highX - 1, highY + i).isDeath()){
                wall++;
            }
        }
        if(board.position(highX, highY - i).isDeath()){
            if(board.position(highX + 1, highY - i).isDeath() && board.position(highX - 1, highY - i).isDeath()){
                if(wall + 1 == 4){
                    isJail = checkJail(highX, highY - i);
                }
            }
        }
	}

    return isJail;
}

public static boolean checkJail(startX, startY){
    if(startX)
}

Alg(board, player position, highTilePosition){           
	if(	
}