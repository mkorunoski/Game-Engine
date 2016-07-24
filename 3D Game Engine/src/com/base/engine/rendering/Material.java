package com.base.engine.rendering;

import com.base.engine.core.Vector3f;

public class Material
{
    private Texture texture;
    private Vector3f color;
    private float specularIntensity;
    private float specularExponent;

    public Material(Texture texture)
    {
        this(texture, new Vector3f(1, 1, 1));
    }

    public Material(Texture texture, Vector3f color)
    {
        this(texture, color, 2, 32);
    }

    public Material(Texture texture, Vector3f color, float specularIntensity, float specularExponent)
    {
        this.texture = texture;
        this.color = color;
        this.specularIntensity = specularIntensity;
        this.specularExponent = specularExponent;
    }

    public Texture getTexture()
    {
        return texture;
    }

    public void setTexture(Texture texture)
    {
        this.texture = texture;
    }

    public Vector3f getColor()
    {
        return color;
    }

    public void setColor(Vector3f color)
    {
        this.color = color;
    }

    public float getSpecularIntensity()
    {
        return specularIntensity;
    }

    public void setSpecularIntensity(float specularIntensity)
    {
        this.specularIntensity = specularIntensity;
    }

    public float getSpecularExponent()
    {
        return specularExponent;
    }

    public void setSpecularExponent(float specularExponent)
    {
        this.specularExponent = specularExponent;
    }
}
