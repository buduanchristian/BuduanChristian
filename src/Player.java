public class Player {
//Instance Variable Requirements
    private String name;
    private int level;


//static variables
    private static int max_level=0;
    private static int player_count=0;


//Constructor
    Player(String playerName,int playerLevel){
        this.level = playerLevel;
        this.name= playerName;

        //player/object counter
        player_count++;

        //if process in finding the largest level among the players
        if (player_count == 1){
            max_level = playerLevel;
        }else if (playerLevel > max_level){
            max_level = playerLevel;
        }

    }
    //getters
    public static int getmax_level(){
        return max_level;
    }
    public static int getplayer_count(){
        return player_count;
    }

}