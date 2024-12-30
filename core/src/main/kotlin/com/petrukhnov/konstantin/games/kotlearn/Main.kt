package com.petrukhnov.konstantin.games.kotlearn

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType


class Main : ApplicationAdapter() {

    override fun create() {
        super.create()
    }

    /**
     * Render function will run in a loop
     */
    override fun render() {

        //background color and fill
        Gdx.gl.glClearColor(0.5f, 1f, 0.5f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        val shapeRenderer: ShapeRenderer = ShapeRenderer()
        shapeRenderer.begin(ShapeType.Filled)

        shapeRenderer.rect(100f, 200f, 30f, 30f)
        shapeRenderer.end()
    }
}
