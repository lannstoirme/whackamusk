package com.lannstoirme.whackamusk.managers;

import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.lannstoirme.whackamusk.gameobjects.Musk;

public class GameManager {
	static Array<Musk>musks; // array of the musk
	static Texture muskTexture; //texture image for the musk
	
	private static float MUSK_RESIZE_FACTOR = 2500f;
	
	private static float MUSK_VERT_POSITION_FACTOR = 5.8f;
	private static float MUSK1_HORIZ_POSITION_FACTOR = 5.8f;
	private static float MUSK2_HORIZ_POSITION_FACTOR = 2.4f;
	private static float MUSK3_HORIZ_POSITION_FACTOR = 1.5f;
	
	public static void initialize(float width, float height) {
		
		musks = new Array<Musk>();
		muskTexture = new Texture(Gdx.files.internal
				("assets/mersk.png"));
		// instantiate new musks and add it to the array
		for(int i=0; i<3; i++) {
			musks.add(new Musk());
		}
	
		// Set the musk's display position
		musks.get(0).position.set(width/MUSK1_HORIZ_POSITION_FACTOR,height/MUSK_VERT_POSITION_FACTOR);
		musks.get(1).position.set(width/MUSK2_HORIZ_POSITION_FACTOR,height/MUSK_VERT_POSITION_FACTOR);
		musks.get(2).position.set(width/MUSK3_HORIZ_POSITION_FACTOR,height/MUSK_VERT_POSITION_FACTOR);
		
		for(Musk musk : musks) {
			//instantiate sprite for the mole with the texture of it
			musk.muskSprite = new Sprite(muskTexture);
			
			//set the dimensions for the musk
			musk.width = musk.muskSprite.getWidth()*
					(width/MUSK_RESIZE_FACTOR);
			musk.width = musk.muskSprite.getHeight()*
					(width/MUSK_RESIZE_FACTOR);
			musk.muskSprite.setSize(musk.width,  musk.height);
			musk.muskSprite.setPosition(musk.position.x,  musk.position.y);
		}
		
	}
	
	public static void renderGame(SpriteBatch batch) {
		//Render(draw) each musk
		for(Musk musk: musks)
			musk.render(batch);
		
	}
	public static void dispose() {
		//dispose of the musk texture to ensure no memory leaks
		muskTexture.dispose();
	}
			
	
}
