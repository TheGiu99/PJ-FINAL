import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Action {
	
	boolean showi;
	boolean panel;
	
	private Image inventory;
	
	public void init() throws SlickException {
		this.showi=false;
		this.inventory = new Image("resources/blocks/inventory.png");
	}
	
	public void render(GameContainer container, Graphics g) {
		if(showi){
			g.drawImage(inventory, container.getWidth()/3+75, container.getHeight()/3);
			
		}
	}
	
	public void update(GameContainer container){

	}

	public void setShowi(boolean b) {
		this.showi=b;
	}

}
