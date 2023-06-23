import javax.swing.*;


    public class SnakeGame extends JFrame {
        Board board;

        SnakeGame() { //constructor
            board = new Board();
            add(board);
            pack();//FRAME WAS ADJUSTED TO BOARD SIZE
            setResizable(false);
            setVisible(true);
        }



    public static void main(String[] args) {
//Initialize snake game
        SnakeGame snakeGame = new SnakeGame();
    }
}