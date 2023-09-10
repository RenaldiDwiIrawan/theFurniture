package com.example.thefurniture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isGone
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import io.github.sceneview.ar.ArSceneView
import io.github.sceneview.ar.node.ArModelNode
import io.github.sceneview.ar.node.PlacementMode
import io.github.sceneview.math.Position

class ActivityARSofa1 : AppCompatActivity() {

    private lateinit var sceneView: ArSceneView
    lateinit var placeButton: ExtendedFloatingActionButton
    private lateinit var modelNode: ArModelNode

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ar_sofa1)

        sceneView = findViewById(R.id.sceneViewSofa)
        placeButton = findViewById(R.id.placeSofa)

        placeButton.setOnClickListener {
            placeModel()
        }

        modelNode = ArModelNode(placementMode = PlacementMode.INSTANT).apply{
            loadModelGlbAsync(
                glbFileLocation = "models/sofa.glb",
                scaleToUnits = 1f,
                centerOrigin = Position(0f)
            ){
                sceneView.planeRenderer.isVisible = true
                val materialInstace =it.materialInstances[0]
            }
            onAnchorChanged = {
                placeButton.isGone = it != null
            }
        }
        sceneView.addChild(modelNode)
      }

    private fun placeModel(){
        modelNode?.anchor()
        sceneView.planeRenderer.isVisible = false
    }
}