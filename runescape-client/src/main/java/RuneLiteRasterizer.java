import net.runelite.api.Rasterizer;

public class RuneLiteRasterizer implements Rasterizer
{
	@Override
	public int[] getPixels()
	{
		return Rasterizer2D.Rasterizer2D_pixels;
	}

	@Override
	public int getWidth()
	{
		return Rasterizer2D.Rasterizer2D_width;
	}

	@Override
	public int getHeight()
	{
		return Rasterizer2D.Rasterizer2D_height;
	}

	@Override
	public void fillRectangle(int x, int y, int w, int h, int rgb)
	{
		Rasterizer2D.Rasterizer2D_fillRectangle(x, y, w, h, rgb);
	}

	@Override
	public void rasterFlat(int y0, int y1, int y2, int x0, int x1, int x2, int rgb)
	{
		Rasterizer3D.rasterFlat(y0, y1, y2, x0, x1, x2, 0.0F, 0.0F, 0.0F, rgb);
	}

	@Override
	public void setRasterGouraudLowRes(boolean lowRes)
	{
		Rasterizer3D.clips.rasterGouraudLowRes = lowRes;
	}

	@Override
	public void rasterGouraud(int y0, int y1, int y2, int x0, int x1, int x2, int hsl0, int hsl1, int hsl2)
	{
		Rasterizer3D.rasterGouraud(y0, y1, y2, x0, x1, x2, 0.0F, 0.0F, 0.0F, hsl0, hsl1, hsl2);
	}
}
