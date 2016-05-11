package heroinMap2D; 
 
import javax.swing.JFrame; 
import javax.swing.WindowConstants; 
 
public class Main { 
 
    /** 
     * @param args 
     */ 
    public static void main(String[] args) { 
        JFrame frame = new JFrame(); 
        Hero hero = new Hero(); 
        Map map = new Map(10, 10); 
        Board board = new Board(hero, map); 
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
        frame.add(board); 
        frame.setSize(800, 600); 
        frame.setVisible(true); 
    } 
 
} 
