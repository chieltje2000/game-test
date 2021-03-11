package tutorialgame;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.objects.SpriteObject;

public class Player extends SpriteObject {
	private TutorialWorld world;
	
	public Player(TutorialWorld world) {
        // Met `.concat()` plak je 2 strings aan elkaar.
        // De methode returned een nieuwe String terug. 
        super(new Sprite(TutorialWorld.MEDIA_URL.concat("player.png")));
        this.world = world;
    }
	
	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
