package com.petrukhnov.konstantin.games.kotlearn

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.badlogic.gdx.math.Rectangle


class Main : ApplicationAdapter() {

    val cat = Rectangle(100f, 500f, 100f, 100f)
    var catVerticalVelocity = 0f
    val gravity = 0.1f

    override fun create() {
        super.create()
    }

    /**
     * Render function will run in a loop
     */
    override fun render() {

        // gravity - fall down
        catVerticalVelocity += gravity
        cat.y -= catVerticalVelocity

        // invisible platform to stop cat at y==10
        if (cat.y < 10) {
            cat.y = 10f
            catVerticalVelocity = 0f
        }
        // jump
        // if cat is standing on platform - throw it up in the air
        if (catVerticalVelocity == 0f) {
            catVerticalVelocity = -5f
        }


        //background color and fill
        Gdx.gl.glClearColor(0.5f, 1f, 0.5f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        val shapeRenderer: ShapeRenderer = ShapeRenderer()
        shapeRenderer.begin(ShapeType.Filled)

        shapeRenderer.rect(cat.x, cat.y, cat.width, cat.height)
        shapeRenderer.end()
    }
}
