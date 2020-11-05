package com.lannstoirme.whackamusk.gameobjects;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Musk {
	public Sprite muskSprite; // sprite to display the musk
	public Vector2 position =new Vector2();
	public float height,width;
	public float scaleFactor; //scaling factor for the mole
	
	public enum State {GOINGUP, GOINGDOWN}; //define mole's states
	public State state=State.GOINGUP;
	
	
	public float currentHeight = 0.0f; //current height of the mole above ground
	
	public float speed = 2f;
	
	public void render(SpriteBatch batch) {
		
		muskSprite.draw(batch);
	}
	
	public void update() {
		//
	}

}
