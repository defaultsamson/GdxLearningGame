package net.qwertysam.resource;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public class TouchInput
{
	public static final int MAX_TOUCHES = 4; // Typically hardware limit is 10
	
	private Input input;
	private OrthographicCamera camera;
	
	private boolean isTouched;
	public List<Vector2> touches;
	
	public TouchInput(OrthographicCamera camera)
	{
		this(Gdx.input, camera);
	}
	
	public TouchInput(Input input, OrthographicCamera camera)
	{
		this.input = input;
		this.camera = camera;
		
		this.isTouched = false;
		this.touches = new ArrayList<Vector2>();
	}
	
	public void update()
	{
		touches.clear();
		
		isTouched = input.isTouched();
		
		for (int i = 0; i < MAX_TOUCHES; i++)
		{
			if (input.isTouched(i))
			{
				Vector3 vector3 = camera.unproject(new Vector3(input.getX(i), input.getY(i), 0F));
				touches.add(new Vector2(vector3.x, vector3.y));
			}
		}
	}
	
	public boolean isTouched()
	{
		return isTouched;
	}
	
	public List<Vector2> getTouches()
	{
		return touches;
	}
}
