package Tile;

public class Sami extends NpcTile{

    public Sami(int [] coords, String direction){

        super(spritePath: "/resources/Sami.png", name: "Sami", coords, movement: false)
    }

    // Interacts with player, and intrdouces himself
    // Tell the player his story, and then teaches player
    // a lesson, and at the end quizes and then gives 
    // player a reward key to a room
    public void interact(){}
}
