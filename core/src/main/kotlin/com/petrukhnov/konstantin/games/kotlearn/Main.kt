package com.petrukhnov.konstantin.games.kotlearn

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.badlogic.gdx.math.Rectangle


class Main : ApplicationAdapter() {

    //train
    val train = Rectangle(100f, 500f, 100f, 100f)
    var trainVerticalVelocity = 0f
    val gravity = 0.1f

    override fun create() {
        super.create()
    }

    override fun render() {

        Gdx.gl.glClearColor(0.5f, 1f, 0.5f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        val shapeRenderer: ShapeRenderer = ShapeRenderer()
        shapeRenderer.begin(ShapeType.Filled)
        //shapeRenderer.rect(100f,100f,100f,100f)

        //gravity
        trainVerticalVelocity += gravity
        train.y -= trainVerticalVelocity

        if (train.y < 10) {
            train.y = 10f
            trainVerticalVelocity = 0f
        }

        if (trainVerticalVelocity == 0f && true) {
            trainVerticalVelocity = -5f
        }

        shapeRenderer.rect(train.x, train.y, train.height, train.width)
        shapeRenderer.end()
    }
}
