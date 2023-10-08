/*
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.mixins;

import net.runelite.api.Model;
import net.runelite.api.ModelData;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.model.Triangle;
import net.runelite.api.model.Vertex;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSModelData;
import net.runelite.rs.api.RSVertexNormal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Mixin(RSModelData.class)
public abstract class RSModelDataMixin implements RSModelData
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private int[] vertexNormalsX;

	@Inject
	private int[] vertexNormalsY;

	@Inject
	private int[] vertexNormalsZ;

	@Copy("toModel")
	@Replace("toModel")
	@SuppressWarnings("InfiniteRecursion")
	public Model copy$light(int ambient, int contrast, int var3, int var4, int var5)
	{
		client.getLogger().trace("Lighting model {}", this);

		RSModel rsModel = (RSModel) copy$light(ambient, contrast, var3, var4, var5);

		if (rsModel == null)
		{
			return null;
		}

		if ((client.getGpuFlags() & 4) == 4)
		{
			vertexNormals();
			rsModel.setVertexNormalsX(vertexNormalsX);
			rsModel.setVertexNormalsY(vertexNormalsY);
			rsModel.setVertexNormalsZ(vertexNormalsZ);
		}
		return rsModel;
	}

	@Inject
	public void vertexNormals()
	{
		RSVertexNormal[] vertexNormals = getVertexNormals();
		RSVertexNormal[] vertexVertices = getVertexVertices();

		if (vertexNormals != null && vertexNormalsX == null)
		{
			int verticesCount = getVerticesCount();

			vertexNormalsX = new int[verticesCount];
			vertexNormalsY = new int[verticesCount];
			vertexNormalsZ = new int[verticesCount];

			for (int i = 0; i < verticesCount; ++i)
			{
				RSVertexNormal vertexNormal;

				if (vertexVertices != null && (vertexNormal = vertexVertices[i]) != null)
				{
					vertexNormalsX[i] = vertexNormal.getX();
					vertexNormalsY[i] = vertexNormal.getY();
					vertexNormalsZ[i] = vertexNormal.getZ();
				}
				else if ((vertexNormal = vertexNormals[i]) != null)
				{
					vertexNormalsX[i] = vertexNormal.getX();
					vertexNormalsY[i] = vertexNormal.getY();
					vertexNormalsZ[i] = vertexNormal.getZ();
				}
			}
		}
	}

	@Override
	@Inject
	public List<Vertex> getVertices()
	{
		int[] verticesX = getVerticesX();
		int[] verticesY = getVerticesY();
		int[] verticesZ = getVerticesZ();

		List<Vertex> vertices = new ArrayList<Vertex>(getVerticesCount());

		for (int i = 0; i < getVerticesCount(); ++i)
		{
			Vertex v = new Vertex(
				verticesX[i],
				verticesY[i],
				verticesZ[i]
			);
			vertices.add(v);
		}

		return vertices;
	}

	@Override
	@Inject
	public List<Triangle> getTriangles()
	{
		int[] trianglesX = getFaceIndices1();
		int[] trianglesY = getFaceIndices2();
		int[] trianglesZ = getFaceIndices3();

		List<Vertex> vertices = getVertices();
		List<Triangle> triangles = new ArrayList<>(getFaceCount());

		for (int i = 0; i < getFaceCount(); ++i)
		{
			int triangleX = trianglesX[i];
			int triangleY = trianglesY[i];
			int triangleZ = trianglesZ[i];

			Triangle triangle = new Triangle(
				vertices.get(triangleX),
				vertices.get(triangleY),
				vertices.get(triangleZ)
			);
			triangles.add(triangle);
		}

		return triangles;
	}

	@Inject
	@Override
	public RSModel light()
	{
		return this.toModel(ModelData.DEFAULT_AMBIENT, ModelData.DEFAULT_CONTRAST, ModelData.DEFAULT_X, ModelData.DEFAULT_Y, ModelData.DEFAULT_Z);
	}

	@Inject
	@Override
	public RSModel light(int var1, int var2, int var3, int var4, int var5)
	{
		return this.toModel(var1, var2, var3, var4, var5);
	}

	@Inject
	@Override
	public RSModelData recolor(short colorToReplace, short colorToReplaceWith)
	{
		this.rs$recolor(colorToReplace, colorToReplaceWith);

		return this;
	}

	@Inject
	@Override
	public RSModelData retexture(short find, short replace)
	{
		this.rs$retexture(find, replace);

		return this;
	}

	@Inject
	@Override
	public RSModelData cloneVertices()
	{
		int[] newVericesX = Arrays.copyOf(this.getVerticesX(), this.getVerticesX().length);
		int[] newVericesY = Arrays.copyOf(this.getVerticesY(), this.getVerticesX().length);
		int[] newVericesZ = Arrays.copyOf(this.getVerticesZ(), this.getVerticesX().length);

		this.setVerticesX(newVericesX);
		this.setVerticesY(newVericesY);
		this.setVerticesZ(newVericesZ);

		return this;
	}

	@Inject
	@Override
	public RSModelData cloneColors()
	{
		short[] newFaceColor = Arrays.copyOf(this.getFaceColors(), this.getFaceColors().length);
		this.setFaceColors(newFaceColor);

		return this;
	}

	@Inject
	@Override
	public RSModelData cloneTextures()
	{
		short[] newFaceColor = Arrays.copyOf(this.getFaceTextures(), this.getFaceTextures().length);
		this.setFaceTextures(newFaceColor);

		return this;
	}

	@Inject
	@Override
	public RSModelData cloneTransparencies()
	{
		byte[] newFaceColor = Arrays.copyOf(this.getFaceTransparencies(), this.getFaceTransparencies().length);
		this.setFaceTransparencies(newFaceColor);

		return this;
	}

	@Inject
	@Override
	public RSModelData rotateY90Ccw()
	{
		for (int var1 = 0; var1 < this.getVerticesCount(); ++var1)
		{
			int var2 = this.getVerticesX()[var1];
			this.getVerticesX()[var1] = this.getVerticesZ()[var1];
			this.getVerticesZ()[var1] = -var2;
		}

		this.invalidate();

		return this;
	}

	@Inject
	@Override
	public RSModelData rotateY180Ccw()
	{
		for (int var1 = 0; var1 < this.getVerticesCount(); ++var1)
		{
			this.getVerticesX()[var1] = -this.getVerticesX()[var1];
			this.getVerticesZ()[var1] = -this.getVerticesZ()[var1];
		}

		this.invalidate();

		return this;
	}

	@Inject
	@Override
	public RSModelData rotateY270Ccw()
	{
		for (int var1 = 0; var1 < this.getVerticesCount(); ++var1)
		{
			int var2 = this.getVerticesZ()[var1];
			this.getVerticesZ()[var1] = this.getVerticesX()[var1];
			this.getVerticesX()[var1] = -var2;
		}

		this.invalidate();

		return this;
	}

	@Inject
	@Override
	public RSModelData scale(int var1, int var2, int var3)
	{
		for (int i = 0; i < this.getVerticesCount(); ++i)
		{
			this.getVerticesX()[i] = this.getVerticesX()[i] * var1 / 128;
			this.getVerticesY()[i] = this.getVerticesY()[i] * var2 / 128;
			this.getVerticesZ()[i] = this.getVerticesZ()[i] * var3 / 128;
		}

		this.invalidate();

		return this;
	}

	@Inject
	@Override
	public RSModelData translate(int var1, int var2, int var3)
	{
		for (int i = 0; i < this.getVerticesCount(); ++i)
		{
			int[] vertexX = this.getVerticesX();
			int[] vertexY = this.getVerticesY();
			int[] vertexZ = this.getVerticesZ();

			vertexX[i] += var1;
			vertexY[i] += var2;
			vertexZ[i] += var3;
		}

		this.invalidate();

		return this;
	}
}