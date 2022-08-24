import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("pj")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("spritesArchive")
	AbstractArchive spritesArchive;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("fontsArchive")
	AbstractArchive fontsArchive;

	@ObfuscatedName("w")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(descriptor = "(Lls;Lls;)V")
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1;
		this.fontsArchive = var2;
		this.map = new HashMap();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "([Lps;I)Ljava/util/HashMap;", garbageValue = "726163233")
	@Export("createMap")
	public HashMap createMap(FontName[] var1) {
		HashMap var2 = new HashMap();
		FontName[] var3 = var1;
		for (int var4 = 0; var4 < var3.length; ++var4) {
			FontName var5 = var3[var4];
			if (this.map.containsKey(var5)) {
				var2.put(var5, this.map.get(var5));
			} else {
				Font var6 = class20.method289(this.spritesArchive, this.fontsArchive, var5.name, "");
				if (var6 != null) {
					this.map.put(var5, var6);
					var2.put(var5, var6);
				}
			}
		}
		return var2;
	}
}