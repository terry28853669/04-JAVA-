import java.awt.*; 
import javax.swing.*; 
 
public class TopLevelWindow { 
 
    private static void createWindow() { 
        JFrame frame = new JFrame("Simple GUI"); 
 
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_ CLOSE);  
        JLabel textLabel = new JLabel("Hi Ans ",SwingConstants.CENTER); 
        textLabel.setPreferredSize(new Dimension(300, 100)); 
        frame.getContentPane().add(textLabel, BorderLayout.CENTER); 
 
        //Display the window.  
        frame.setLocationRelativeTo(null); 
        frame.pack(); 
        frame.setVisible(true); 
    } 
    public static void main(String[] args) { 
 
        createWindow(); 
        createWindow(); 
    } 
 
} 
