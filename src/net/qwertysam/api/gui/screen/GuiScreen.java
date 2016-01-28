package net.qwertysam.api.gui.screen;

import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import net.qwertysam.api.gui.GuiButton;
import net.qwertysam.api.rendering.RenderableHolder;
import net.qwertysam.api.util.IDisposable;
import net.qwertysam.api.util.TouchInput;
import net.qwertysam.main.MyGdxGame;

public abstract class GuiScreen extends RenderableHolder<GuiButton> implements Screen, IGuiScreen, IDisposable
{
	protected MyGdxGame game;
	protected OrthographicCamera camera;
	protected SpriteBatch batch;
	protected TouchInput touches;
	
	/** The x offset of the buttons. */
	private float xButtonOffset;
	/** The y offset of the buttons. */
	private float yButtonOffset;
	
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
	
	/**
	 * Ticks all buttons in this.
	 * 
	 * @param touch the touch position on the screen
	 */
	public void buttonTick(List<Vector2> touch)
	{
		buttonTick(touch, 0F, 0F);
	}
	
	/**
	 * Ticks all buttons in this.
	 * 
	 * @param touches the touches' positions on the screen
	 * @param xOffset the bottom left x ordinate of the camera position relative to the world
	 * @param yOffset the bottom left y ordinate of the camera position relative to the world
	 */
	public void buttonTick(List<Vector2> touches, float xOffset, float yOffset)
	{
		xButtonOffset = xOffset;
		yButtonOffset = yOffset;
		
		if (touches.isEmpty())
		{
			updateButtons(null);
		}
		else
		{
			for (Vector2 touch : touches)
			{
				updateButtons(touch.add(xOffset, yOffset));// new Vector2(touch.x - xOffset, touch.y - yOffset)
			}
		}
	}
	
	@Override
	public void renderEntries(SpriteBatch batch)
	{
		renderEntries(batch, xButtonOffset, yButtonOffset);
	}
	
	private void updateButtons(Vector2 touch)
	{
		for (GuiButton entry : getEntries())
		{
			entry.update(touch);
		}
	}
	
	public abstract void pressAction(int buttonID);
	
	public abstract void releaseAction(int buttonID);
}
