package com.platut.scripts;

import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.framework.SceneManager;
import com.framework.Script;
import com.framework.components.CSprite;

/**
 * Created by conor on 16/07/16.
 */
public class HealthGUIController extends Script {

    CSprite sprite;

    public HealthGUIController(SceneManager manager, Entity entity) { super(manager, entity); }

    @Override
    public void start () {
        sprite = getEntity ().getComponent (CSprite.class);
    }

    @Override
    public void update (float deltaTime) {
        sprite.sprite.setX (getTransform().position.x);
        sprite.sprite.setY (getTransform().position.y);
    }

    @Override
    public void draw (SpriteBatch batch) {
    }

    @Override
    public void drawGUI (SpriteBatch batch) {
        sprite.sprite.draw (batch);
    }
}