package net.qwertysam.api.gui.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import net.qwertysam.api.gui.ButtonHud;
import net.qwertysam.api.util.IDisposable;
import net.qwertysam.api.util.TouchInput;
import net.qwertysam.main.MyGdxGame;

public class GuiScreen extends ButtonHud implements Screen, IGuiScreen, IDisposable
{
	protected MyGdxGame game;
	protected OrthographicCamera camera;
	protected SpriteBatch batch;
	protected TouchInput touches;
	
	public GuiScreen(MyGdxGame game)
	{
		super();
		
		this.game = game;
		
		camera = new OrthographicCamera();
		camera.setToOrtho(game.isInverted(), 720, 1280);
		
		batch = new SpriteBatch();
		
		touches = new TouchInput(camera);
		
		init();
	}
	
	public void init()
	{}
	
	@Override
	public void show()
	{
	
	}
	
	public void update(float delta)
	{
	
	}
	
	@Override
	public void render(float delta)
	{
		tick(delta);
		
		// Resizes sprite batch to the screen size
		batch.setProjectionMatrix(camera.combined);
		
		// Clears the screen
		Gdx.gl.glClearColor(1F, 1F, 1F, 1F);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		// Begins the drawing phase
		batch.begin();
		
		// Draws the actual shiz in the screen
		drawScreen(delta);
		
		// Draws the buttons over everything
		renderEntries(batch);
		
		// Ends the drawing phase
		batch.end();
		
		// Updates the camera
		camera.update();
	}
	
	@Override
	public void tick(float delta)
	{
		touches.update();
		if (!isEmpty()) buttonTick(touches.getTouches(), camera.position.x - (camera.viewportWidth / 2), camera.position.y - (camera.viewportHeight / 2));
	}
	
	@Override
	public void drawScreen(float delta)
	{
	
	}
	
	@Override
	public void resize(int width, int height)
	{
	
	}
	
	@Override
	public void pause()
	{
	
	}
	
	@Override
	public void resume()
	{
	
	}
	
	@Override
	public void hide()
	{
	
	}
	
	@Override
	public void dispose()
	{
		batch.dispose();
	}
	
	public float getWidth()
	{
		return camera.viewportWidth;
	}
	
	public float getHeight()
	{
		return camera.viewportHeight;
	}
	
	public OrthographicCamera getCamera()
	{
		return camera;
	}
	
	public SpriteBatch getBatch()
	{
		return batch;
	}
	
	public MyGdxGame getGame()
	{
		return game;
	}
	
	public TouchInput getTouches()
	{
		return touches;
	}
}
