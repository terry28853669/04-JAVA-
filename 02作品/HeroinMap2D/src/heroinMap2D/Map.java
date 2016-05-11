package heroinMap2D; 
 
import java.awt.Image; 
 
import javax.swing.ImageIcon; 
 
public class Map { 
    private int mapWidth, mapHeight, tileWidth, tileHeight; 
    private int[] map =  
        { 0,0,0,0,0,0,0,0,0,0, 
          0,0,0,0,0,0,0,0,0,0, 
          1,1,1,1,1,1,1,1,1,1, 
          0,0,0,0,0,0,0,0,0,0, 
          0,0,0,0,0,0,0,0,0,0, 
          0,0,0,0,0,0,0,0,0,0, 
          0,0,0,0,0,0,0,0,0,0, 
          0,0,0,0,0,0,0,0,0,0, 
          0,0,0,0,0,0,0,0,0,0, 
          0,0,0,0,0,0,0,0,0,0  
        }; 
    private Image[] tileImage; 
 
    public Map(int mapWidth, int mapHeight){ 
        this.mapWidth = mapWidth; 
        this.mapHeight = mapHeight; 
        this.tileImage = new Image[2]; 
        this.tileImage[1] = new ImageIcon(this.getClass().getResource("tile-grass.png")).getImage(); 
        this.tileImage[0] = new ImageIcon(this.getClass().getResource("tile-mountain.png")).getImage(); 
        this.tileWidth = this.tileImage[0].getWidth(null); 
        this.tileHeight = this.tileImage[0].getHeight(null); 
    } 
 
    public int getMapWidthInTiles(){ 
        return this.mapWidth; 
    } 
 
    public int getMapHeightInTiles(){ 
        return this.mapHeight; 
    } 
 
    public int getTileWidth(){ 
        return this.tileWidth; 
    } 
 
    public int getTileHeight(){ 
        return this.tileHeight; 
    } 
 
    public Image getTileImage(int index){ 
        return this.tileImage[map[index]]; 
    } 
} 
