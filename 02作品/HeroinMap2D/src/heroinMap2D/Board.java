
package heroinMap2D; 
 
import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.Graphics2D; 
import java.awt.Toolkit; 
import java.awt.event.MouseEvent; 
import java.awt.event.MouseListener; 
 
import javax.swing.JPanel; 
 
public class Board extends JPanel implements Runnable, MouseListener { 
    private int posX, posY; 
    private Thread thread; 
    private Hero hero; 
    private Map map; 
 
    public Board(Hero hero, Map map) { 
        this.hero = hero; 
        this.map = map; 
 
        addMouseListener(this); 
        setBackground(Color.BLACK); 
        setDoubleBuffered(true); 
    } 
 
    public void addNotify(){ 
        super.addNotify(); 
        thread = new Thread(this); 
        thread.start(); 
    } 
 
    public void paint(Graphics g){ 
        super.paint(g); 
 
        Graphics2D g2d = (Graphics2D)g; 
 
        // DRAW MAP. index -> index of map[] array 
        int index = 0; 
        while(index<(map.getMapWidthInTiles()*map.getMapHeightInTiles())){ 
            for(int i=0; i<map.getMapWidthInTiles(); i++){ 
                for(int j=0; j<map.getMapHeightInTiles(); j++){ 
                    g2d.drawImage(map.getTileImage(index), posX, posY, this); 
                    posX += map.getTileWidth(); 
                    index++; 
                }  
                posX = 0; 
                posY += map.getTileHeight(); 
            } 
            posY = 0; 
        } 
 
        // DRAW HERO 
        g2d.drawImage(hero.getImage(), hero.getX(), hero.getY(), this); 
 
        Toolkit.getDefaultToolkit().sync(); 
        g.dispose(); 
    } 
 
    public void run() { 
        while(true){ 
            repaint(); 
        }     
    } 
 
    @Override 
    public void mouseClicked(MouseEvent e) { 
        if(e.getButton() == 1){ 
            hero.moveTo(e.getX(), e.getY()); 
        } 
    }

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO 自動產生的方法 Stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO 自動產生的方法 Stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO 自動產生的方法 Stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO 自動產生的方法 Stub
		
	}}
