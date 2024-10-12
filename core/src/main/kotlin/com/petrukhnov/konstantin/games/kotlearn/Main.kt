package com.petrukhnov.konstantin.games.kotlearn

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.badlogic.gdx.math.Rectangle


class Main : ApplicationAdapter() {

    val rect = Rectangle(100f, 100f, 100f, 100f)

    override fun create() {
        super.create()
    }


    override fun render() {

        Gdx.gl.glClearColor(33f, 0f, 0.2f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        val shapeRenderer: ShapeRenderer = ShapeRenderer()


        shapeRenderer.begin(ShapeType.Filled)
        shapeRenderer.rect(100f,100f,100f,100f)
        //rect.x += 1
        //shapeRenderer.rect(rect.x, rect.y, rect.height, rect.width)
        shapeRenderer.end()
    }
}
