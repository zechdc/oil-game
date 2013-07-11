



package com.OilGame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.VertexAttributes.Usage;
import com.badlogic.gdx.graphics.Color;


public class Game implements ApplicationListener {
	private Mesh mesh;
	
	
	@Override
	public void create() {
		// TODO Auto-generated method stub
		if (mesh == null) {
            mesh = new Mesh(true, 3, 3, 
                    new VertexAttribute(Usage.Position, 3, "a_position"),    
            		new VertexAttribute(Usage.ColorPacked, 4, "a_color"));

            mesh.setVertices(new float[] { -0.5f, -0.5f, 0, Color.toFloatBits(255, 0, 0, 255),
                                           0.5f, -0.5f, 0, Color.toFloatBits(255, 0, 0, 255), 
                                           0, 0.5f, 0, Color.toFloatBits(255, 0, 255, 0) });   
            mesh.setIndices(new short[] { 0, 1, 2 });                       
    }

	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        mesh.render(GL10.GL_TRIANGLES, 0, 3);

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
