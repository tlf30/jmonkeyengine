package com.jme3.renderer.vulkan;

import com.jme3.material.RenderState;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.Caps;
import com.jme3.renderer.Limits;
import com.jme3.renderer.Renderer;
import com.jme3.renderer.Statistics;
import com.jme3.scene.Mesh;
import com.jme3.scene.VertexBuffer;
import com.jme3.shader.BufferObject;
import com.jme3.shader.Shader;
import com.jme3.texture.FrameBuffer;
import com.jme3.texture.Image;
import com.jme3.texture.Texture;

import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.EnumSet;

public class VulkanRenderer implements Renderer {
    @Override
    public void initialize() {

    }

    @Override
    public EnumSet<Caps> getCaps() {
        return null;
    }

    @Override
    public EnumMap<Limits, Integer> getLimits() {
        return null;
    }

    @Override
    public Statistics getStatistics() {
        return null;
    }

    @Override
    public void invalidateState() {

    }

    @Override
    public void clearBuffers(boolean color, boolean depth, boolean stencil) {

    }

    @Override
    public void setBackgroundColor(ColorRGBA color) {

    }

    @Override
    public void applyRenderState(RenderState state) {

    }

    @Override
    public void setDepthRange(float start, float end) {

    }

    @Override
    public void postFrame() {

    }

    @Override
    public void setViewPort(int x, int y, int width, int height) {

    }

    @Override
    public void setClipRect(int x, int y, int width, int height) {

    }

    @Override
    public void clearClipRect() {

    }

    @Override
    public void setShader(Shader shader) {

    }

    @Override
    public void deleteShader(Shader shader) {

    }

    @Override
    public void deleteShaderSource(Shader.ShaderSource source) {

    }

    @Override
    public void copyFrameBuffer(FrameBuffer src, FrameBuffer dst, boolean copyDepth) {

    }

    @Override
    public void setFrameBuffer(FrameBuffer fb) {

    }

    @Override
    public void setMainFrameBufferOverride(FrameBuffer fb) {

    }

    @Override
    public void readFrameBuffer(FrameBuffer fb, ByteBuffer byteBuf) {

    }

    @Override
    public void readFrameBufferWithFormat(FrameBuffer fb, ByteBuffer byteBuf, Image.Format format) {

    }

    @Override
    public void deleteFrameBuffer(FrameBuffer fb) {

    }

    @Override
    public void setTexture(int unit, Texture tex) {

    }

    @Override
    public void modifyTexture(Texture tex, Image pixels, int x, int y) {

    }

    @Override
    public void deleteImage(Image image) {

    }

    @Override
    public void updateBufferData(VertexBuffer vb) {

    }

    @Override
    public void updateBufferData(BufferObject bo) {

    }

    @Override
    public void deleteBuffer(VertexBuffer vb) {

    }

    @Override
    public void deleteBuffer(BufferObject bo) {

    }

    @Override
    public void renderMesh(Mesh mesh, int lod, int count, VertexBuffer[] instanceData) {

    }

    @Override
    public void resetGLObjects() {

    }

    @Override
    public void cleanup() {

    }

    @Override
    public void setDefaultAnisotropicFilter(int level) {

    }

    @Override
    public void setAlphaToCoverage(boolean value) {

    }

    @Override
    public void setMainFrameBufferSrgb(boolean srgb) {

    }

    @Override
    public void setLinearizeSrgbImages(boolean linearize) {

    }

    @Override
    public int[] generateProfilingTasks(int numTasks) {
        return new int[0];
    }

    @Override
    public void startProfiling(int taskId) {

    }

    @Override
    public void stopProfiling() {

    }

    @Override
    public long getProfilingTime(int taskId) {
        return 0;
    }

    @Override
    public boolean isTaskResultAvailable(int taskId) {
        return false;
    }

    @Override
    public boolean getAlphaToCoverage() {
        return false;
    }

    @Override
    public int getDefaultAnisotropicFilter() {
        return 0;
    }
}
