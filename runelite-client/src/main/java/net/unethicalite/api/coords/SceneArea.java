package net.unethicalite.api.coords;


import lombok.Value;

@Value
public class SceneArea
{
	int x;
	int y;
	int width;
	int height;
	int plane;

	public boolean contains(ScenePoint point)
	{
		if (point.getPlane() != plane)
		{
			return false;
		}

		return point.getX() >= x && point.getX() <= x + width && point.getY() >= y && point.getY() <= y + height;
	}
}
