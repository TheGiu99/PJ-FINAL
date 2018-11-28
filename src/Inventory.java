import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Inventory {
	
	boolean showi = false;
	
	private Image inventory;
	
	public void init() throws SlickException {
		this.inventory = new Image("resources/blocks/inventory.png");
	}
	
	public void render(Graphics g) {
		g.drawImage(inventory, 400, 400);
	}

}
