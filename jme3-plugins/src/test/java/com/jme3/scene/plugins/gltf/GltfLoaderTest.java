package com.jme3.scene.plugins.gltf;

import com.jme3.asset.AssetLoadException;
import com.jme3.asset.AssetManager;
import com.jme3.light.Light;
import com.jme3.material.plugin.TestMaterialWrite;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.system.JmeSystem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by Nehon on 07/08/2017.
 */
public class GltfLoaderTest {

    private final static String indentString = "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";

    private AssetManager assetManager;

    @Before
    public void init() {
        assetManager = JmeSystem.newAssetManager(
                TestMaterialWrite.class.getResource("/com/jme3/asset/Desktop.cfg"));

    }

    @Test
    public void testLoad() {
        Spatial scene = assetManager.loadModel("gltf/box/box.gltf");
        dumpScene(scene, 0);
//        scene = assetManager.loadModel("gltf/hornet/scene.gltf");
//        dumpScene(scene, 0);
    }

    @Test
    public void testLoadEmptyScene() {
        try {
            Spatial scene = assetManager.loadModel("gltf/box/boxWithEmptyScene.gltf");
            dumpScene(scene, 0);
        } catch (AssetLoadException ex) {
            ex.printStackTrace();
            Assert.fail("Failed to import gltf model with empty scene");
        }
    }

    @Test
    public void testLightsPunctualExtension() {
        try {
            Spatial scene = assetManager.loadModel("gltf/lights/lights.gltf");
            dumpScene(scene, 0);
        } catch (AssetLoadException ex) {
            ex.printStackTrace();
            Assert.fail("Failed to import gltf model with lights punctual extension");
        }
    }

    private void dumpScene(Spatial s, int indent) {
        System.err.println(indentString.substring(0, indent) + s.getName() + " (" + s.getClass().getSimpleName() + ") / " +
                s.getLocalTransform().getTranslation().toString() + ", " +
                s.getLocalTransform().getRotation().toString() + ", " +
                s.getLocalTransform().getScale().toString());
        for (Light light : s.getLocalLightList()) {
            System.err.println(indentString.substring(0, indent + 1) + " (" + light.getClass().getSimpleName() + ")" );
        }
        if (s instanceof Node) {
            Node n = (Node) s;
            for (Spatial spatial : n.getChildren()) {
                dumpScene(spatial, indent + 1);
            }
        }
    }
}