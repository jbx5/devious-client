package net.runelite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSAbstractFont;

@Mixin(RSAbstractFont.class)
public abstract class RSAbstractFontMixin implements RSAbstractFont
{
	@Inject
	@Override
	public void drawWidgetText(String text, int x, int y, int width, int height, int rgb, int shadowRGB, int alpha, int xTextAlignment, int yTextAlignment, int lineHeight)
	{
		this.drawRSWidgetText(text, x, y, width, height, rgb, shadowRGB, alpha, xTextAlignment, yTextAlignment, lineHeight);
	}
}
