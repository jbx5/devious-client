import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bm")
public class class31 {
	@ObfuscatedName("ab")
	static Applet field138;
	@ObfuscatedName("ay")
	static String field143;
	@ObfuscatedName("hh")
	@Export("gameSessionServiceBaseUrl")
	static String gameSessionServiceBaseUrl;

	static {
		field138 = null;
		field143 = "";
	}

	@ObfuscatedName("nz")
	static final void method427(double var0) {
		Rasterizer3D.buildPalette(var0);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(var0);
		if (class219.worldMap != null) {
			class219.worldMap.method9118();
		}

		ItemComposition.ItemDefinition_cachedSprites.clear();
		TileItem.clientPreferences.updateBrightness(var0);
	}
}
