import org.newdawn.slick.Input;
import org.newdawn.slick.KeyListener;

public class ActionController implements KeyListener{
	
	Action action=new Action();
	
	public ActionController(Action action) {
		this.action = action;
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
			if(this.action.showi){this.action.showi=false;}
			else {this.action.showi=true;}
		}
		if(Input.KEY_A==key)
		{
			if(this.action.trigger) {this.action.trigger=false;}
			else {this.action.trigger=true;}
		}
	}

	@Override
	public void keyReleased(int arg0, char arg1) {
		// TODO Auto-generated method stub
		
	}

}
