//package com.OilGame;
//
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.Screen;
//import com.badlogic.gdx.graphics.GL10;
//import com.OilGame.World;
//import com.OilGame.WorldRenderer;
//
//public class GameScreen implements Screen {
//	
//	private World world;
//	private WorldRenderer renderer;
//
//	/** Rest of methods ommited **/
//
//	@Override
//	public void render(float delta) {
//		Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
//		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
//		renderer.render();
//	}
//
//	@Override
//	public void resize(int width, int height) {
//		// TODO Auto-generated method stub
//	}
//
//	@Override
//	public void show() {
//		world = new World();
//		renderer = new WorldRenderer(world);
//	}
//
//	@Override
//	public void hide() {
//		// TODO Auto-generated method stub
//	}
//
//	@Override
//	public void pause() {
//		// TODO Auto-generated method stub
//	}
//
//	@Override
//	public void resume() {
//		// TODO Auto-generated method stub
//	}
//
//	@Override
//	public void dispose() {
//		// TODO Auto-generated method stub
//	}
//}
