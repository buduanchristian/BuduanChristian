//class
public class PlayerMain {
    //main class
    public static void main(String[] args) throws Exception {
        System.out.println("Howdy Coder!");

        // player objects
        Player player1 = new Player("Buduan",1021);
        Player player2 = new Player("Christian", 10707);
        Player player3 = new Player("Joseph", 256);
        Player player4 = new Player("Ahyan", 2133);

        //Displaying the total players and the max level among the player objects
        System.out.println("Total Player(s) : " + Player.getplayer_count());
        System.out.println("Highest level Player :" + Player.getmax_level());
    }
}

