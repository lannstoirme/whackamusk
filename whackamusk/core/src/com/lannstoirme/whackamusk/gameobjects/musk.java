package com.lannstoirme.whackamusk.gameobjects;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class musk {
	public Sprite muskSprite; // sprite to display the musk
	public Vector2 position =new Vector2();
	public float height,width;
	
	public void render(SpriteBatch batch) {
		
		moleSprite.draw(batch);
	}

}
