import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.Music;
//import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

public class MapGameState extends BasicGame implements GameState {

	private GameContainer container;	
	private Map map = new Map();
	private Player player = new Player(map);
	//private enemy enemy = new enemy(map);
	private TriggerController triggers = new TriggerController(map, player);
	private Camera camera = new Camera(player);
	public static final int ID = 2;
	private Hud hud = new Hud();
	private Action inventory = new Action();

	public MapGameState() {
		super("Giu is the Boss");
	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enter(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getID() {
		return ID;
	}

	@Override
	public void init(GameContainer container, StateBasedGame game) throws SlickException {
		this.container = container;
		Music background=new Music("resources/music/HBSF.ogg");
		background.loop();
		this.map.init();
		this.player.init();
		//this.enemy.init();
		this.hud.init();
		this.inventory.init();
		ActionController Icontroler = new ActionController(this.inventory);
		PlayerController controler = new PlayerController(this.player);
		container.getInput().addKeyListener(Icontroler);
		container.getInput().addKeyListener(controler);
	}

	@Override
	public void leave(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		//TODO Auto-generated method stub
		
	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
		this.camera.place(container, g);
		this.map.renderBackground();
		this.player.render(g);
		//this.enemy.render(g);
		this.map.renderForeground();
		this.hud.render(g);
		this.inventory.render(container, g);
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
		this.triggers.update();
		this.player.update(delta);
		//this.enemy.update(delta);
		this.camera.update(container);	
		this.inventory.update(container);
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		//TODO Auto-generated method stub
		
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		//TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(int key, char c) {
		if (Input.KEY_ESCAPE == key) {
			this.container.exit();
		}
	}

}