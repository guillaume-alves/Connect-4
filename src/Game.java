import java.sql.PseudoColumnUsage;
import java.util.Arrays;
import java.util.Locale;
 
public class Game {
    String[][] gameTab = new String[6][7];
    Player[] playerTab = new Player[2];
    String line="", move="valid";
    int win=0;

    public void createPlayerTab(Player player1, Player player2) {
        playerTab[0] = player1;
        playerTab[1] = player2;
        for (int i=0;i<=5;i++){
            for (int j=0; j<=6;j++)
                gameTab[i][j]="-";
        }
    }

    public void checkTab(int rowToPlay, int columnToPlay) {
        try {
            if (gameTab[rowToPlay + 1][columnToPlay] == "-") {
                move = "invalid";
                System.out.println("Invalid move");
            }
        } catch (Exception e) {
            System.out.print("");
        } finally {
        }
    }

    public void fillTab(String playerTag, int rowToPlay, int columnToPlay){
        gameTab[rowToPlay][columnToPlay] = playerTag;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public int readTab (Player player){
            for (int i = 0; i <= 6; i++) { line += gameTab[5][i];}
                if (line.contains("XXXX") || line.contains("OOOO")) {
                    win=1;
                }
        return win;
        }

        public void printGameTab(){
            System.out.print("\n     ");
            for (int i = 1; i <= 7; i++) {
                System.out.print(i + "   ");
            }
            System.out.print("\n 1 | ");
            for (int i = 0; i <= 6; i++) {
                System.out.print(gameTab[0][i] + " | ");
            }
            System.out.print("\n 2 | ");
            for (int i = 0; i <= 6; i++) {
                System.out.print(gameTab[1][i] + " | ");
            }
            System.out.print("\n 3 | ");
            for (int i = 0; i <= 6; i++) {
                System.out.print(gameTab[2][i] + " | ");
            }
            System.out.print("\n 4 | ");
            for (int i = 0; i <= 6; i++) {
                System.out.print(gameTab[3][i] + " | ");
            }
            System.out.print("\n 5 | ");
            for (int i = 0; i <= 6; i++) {
                System.out.print(gameTab[4][i] + " | ");
            }
            System.out.print("\n 6 | ");
            for (int i = 0; i <= 6; i++) {
                System.out.print(gameTab[5][i] + " | ");
            }
            System.out.print("\n");
        }
}