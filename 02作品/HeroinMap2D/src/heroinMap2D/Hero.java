package heroinMap2D; 
 
import java.awt.Image; 
 
import javax.swing.ImageIcon; 
 
public class Hero{ 
    private int[] position; 
    private Image image; 
 
    public Hero(){ 
        position = new int[2]; 
        position[0] = 0; // X 
        position[1] = 0; // Y 
        image = new ImageIcon(getClass().getResource("held.gif")).getImage(); 
    } 
 
    public void setPosition(int x, int y){ 
        this.position[0] = x; 
        this.position[1] = y; 
    } 
 
    public int[] getPosition(){ 
        return this.position; 
    } 
 
    public int getX(){ 
        return this.position[0]; 
    } 
 
    public int getY(){ 
        return this.position[1]; 
    } 
 
    public Image getImage(){ 
        return this.image; 
    } 
 
    public void moveTo(int x, int y){ 
        while(this.position[0]!=x && this.position[1]!=y){ 
            if(this.position[0]<x){ 
                this.position[0]++; 
            } 
            if(this.position[1]<y){ 
                this.position[1]++; 
            } 
        } 
    } 
} 
