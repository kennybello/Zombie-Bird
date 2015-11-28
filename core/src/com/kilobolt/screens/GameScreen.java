package com.kilobolt.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.kilobolt.gameworld.GameRenderer;
import com.kilobolt.gameworld.GameWorld;
import com.kilobolt.zbHelpers.InputHandler;

/**
 * Created by kennethbello on 2/8/15.
 */
public class GameScreen implements Screen {

    private GameWorld world;
    private GameRenderer renderer;
    private float runTime = 0;

    public GameScreen() {

        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);


        int midPointY = (int) (gameHeight / 2);

        world = new GameWorld(midPointY);// initialize world
        renderer = new GameRenderer(world, (int) gameHeight, midPointY);// initialze renderer

        Gdx.input.setInputProcessor(new InputHandler(world.getBird()));
    }

    @Override
    public void show() {
        Gdx.app.log("ZBGame", "created");
    }

    @Override
    public void render(float delta) {
        runTime += delta;
        world.update(delta);
        renderer.render(runTime);

    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log("ZBGame", "created");
    }

    @Override
    public void pause() {
        Gdx.app.log("ZBGame", "created");
    }

    @Override
    public void resume() {
        Gdx.app.log("ZBGame", "created");
    }

    @Override
    public void hide() {
        Gdx.app.log("ZBGame", "created");
    }

    @Override
    public void dispose() {
    }
}
