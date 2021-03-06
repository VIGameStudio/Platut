package com.engine.tiled;

import com.badlogic.ashley.core.Engine;
import com.badlogic.gdx.maps.MapProperties;
import com.engine.core.IEntityFactory;

/**
 * Created by conor on 09/08/17.
 */

public class TiledUILoader {
    public static void loadUI(MapProperties properties, Engine engine, IEntityFactory entityFactory) {
        /*String filename = properties.get("ui", "", String.class);

        if (!filename.isEmpty()) {
            TiledMap uiMap = new TmxMapLoader().load(filename);
            MapLayers mapLayers = uiMap.getLayers();
            MapLayer uiLayer = mapLayers.get("ui");

            for (MapObject obj : uiLayer.getObjects()) {
                if (obj instanceof RectangleMapObject) {
                    Entity entity = new Entity();

                    Rectangle rectangle = ((RectangleMapObject) obj).getRectangle();
                    MapProperties layerProp = obj.getProperties();
                    String name = obj.getName();
                    String type = layerProp.get("type", "", String.class);

                    int hashedType = type.hashCode();
                    String imageSrc = layerProp.get("image", "", String.class);
                    String scriptSrc = layerProp.get("script", "", String.class);

                    entityFactory.addGameObject(entity, name, type, scriptSrc);
                    entityFactory.addTransform(entity, rectangle);

                    // TODO load ui widgets
                    if (hashedType == "sprite".hashCode()) {
                        entityFactory.addSprite(entity, imageSrc);
                    } else if (hashedType == "button".hashCode()) {
                        entityFactory.addButton(entity, rectangle, imageSrc);
                    } else if (hashedType == "toggle".hashCode()) {
                        String off = (String) layerProp.get("off");
                        String on = (String) layerProp.get("on");
                        //Boolean state = (Boolean) properties.get ("state");
                    }

                    engine.addEntity(entity);
                }
            }
        }*/
    }
}
