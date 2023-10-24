package com.game.adinoventure.entity.system;

import com.artemis.Aspect;
import com.artemis.ComponentMapper;
import com.artemis.systems.IteratingSystem;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.game.adinoventure.entity.component.CollidableComponent;
import com.game.adinoventure.entity.component.TransformComponent;

public class CollisionDebugSystem extends IteratingSystem {
    Camera camera;
    ShapeRenderer shapeRenderer;
    private ComponentMapper<TransformComponent> transformMapper;
    private ComponentMapper<CollidableComponent> collidableMapper;
    public CollisionDebugSystem(Camera camera) {
        super(Aspect.all(TransformComponent.class, CollidableComponent.class));
        this.camera = camera;
        shapeRenderer = new ShapeRenderer();
    }

    @Override
    protected void begin() {
        shapeRenderer.setProjectionMatrix(camera.combined);
        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);//desenhar linhas
    }

    @Override
    protected void process(int entityId) {
        TransformComponent transformComponent = transformMapper.get(entityId);
        CollidableComponent collidableComponent = collidableMapper.get(entityId);

        Vector2 min = collidableComponent.getCollisionBox().getPosition(new Vector2());
        Vector2 max = collidableComponent.getCollisionBox().getSize(new Vector2().add(min));// tamanho + posição = quina superior

        Vector2 size = collidableComponent.getCollisionBox().getSize(new Vector2());

        shapeRenderer.setColor(Color.GREEN);
        shapeRenderer.rect(min.x,min.y,size.x,size.y);

        shapeRenderer.setColor(Color.BLUE);
        shapeRenderer.line(transformComponent.getPositionX(), transformComponent.getPositionY(), transformComponent.getPositionX() + transformComponent.getVelocityX(), transformComponent.getPositionY() + transformComponent.getVelocityY());

        shapeRenderer.setColor(Color.RED);
        if(collidableComponent.isOnGround()){
            shapeRenderer.line(min.x,min.y,max.x,min.y);

        }
        if(collidableComponent.isOnCeiling()){
            shapeRenderer.line(min.x,max.y,max.x,max.y);

        }
        if(collidableComponent.isOnLeftWall()){
            shapeRenderer.line(min.x,min.y,min.x,max.y);
        }
        if(collidableComponent.isOnRightWall()){
            shapeRenderer.line(max.x,min.y,max.x,max.y);
        }
    }

    @Override
    protected void end() {
        shapeRenderer.end();
    }

    @Override
    protected void dispose() {
        shapeRenderer.dispose();
    }
}
