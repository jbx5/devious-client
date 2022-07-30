import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("pb")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("spritesArchive")
	AbstractArchive spritesArchive;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("fontsArchive")
	AbstractArchive fontsArchive;

	@ObfuscatedName("f")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(descriptor = "(Llc;Llc;)V")
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1;
		this.fontsArchive = var2;
		this.map = new HashMap();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "([Lpz;I)Ljava/util/HashMap;", garbageValue = "1790173917")
	@Export("createMap")
	public HashMap createMap(FontName[] var1) {
		HashMap var2 = new HashMap();
		FontName[] var3 = var1;
		for (int var4 = 0; var4 < var3.length; ++var4) {
			FontName var5 = var3[var4];
			if (this.map.containsKey(var5)) {
				var2.put(var5, this.map.get(var5));
			} else {
				AbstractArchive var7 = this.spritesArchive;
				AbstractArchive var8 = this.fontsArchive;
				String var9 = var5.name;
				int var10 = var7.getGroupId(var9);
				int var11 = var7.getFileId(var10, "");
				byte[] var14 = var7.takeFile(var10, var11);
				boolean var13;
				if (var14 == null) {
					var13 = false;
				} else {
					class83.SpriteBuffer_decode(var14);
					var13 = true;
				}
				Font var12;
				if (!var13) {
					var12 = null;
				} else {
					var12 = class14.method182(var8.takeFile(var10, var11));
				}
				if (var12 != null) {
					this.map.put(var5, var12);
					var2.put(var5, var12);
				}
			}
		}
		return var2;
	}
}