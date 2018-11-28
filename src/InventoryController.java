import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;

public class InventoryController implements KeyListener{
	
	Inventory inventory=new Inventory();
	
	public InventoryController(Inventory inventory) {
		this.inventory = inventory;
	}

	@Override
	public void inputEnded() {}

	@Override
	public void inputStarted() {}

	@Override
	public boolean isAcceptingInput() {return true;}

	@Override
	public void setInput(Input input) {}

	@Override
	public void keyPressed(int key, char c) {
		if(Input.KEY_I==key)
		{
			if(this.inventory.showi){this.inventory.showi=false;}
			else {this.inventory.showi=true;}
		}
	}

	@Override
	public void keyReleased(int arg0, char arg1) {
		// TODO Auto-generated method stub
		
	}

}
