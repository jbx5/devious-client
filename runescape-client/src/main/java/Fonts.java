import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tv")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("al")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1;
		this.fontsArchive = var2;
		this.map = new HashMap();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([Ltu;I)Ljava/util/HashMap;",
		garbageValue = "-963615002"
	)
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
				Font var6;
				if (!var7.isValidFileName(var9, "")) {
					var6 = null;
				} else {
					int var10 = var7.getGroupId(var9);
					int var11 = var7.getFileId(var10, "");
					Font var12;
					if (!class130.method3074(var7, var10, var11)) {
						var12 = null;
					} else {
						var12 = class529.fontFromBytes(var8.takeFile(var10, var11));
					}

					var6 = var12;
				}

				if (var6 != null) {
					this.map.put(var5, var6);
					var2.put(var5, var6);
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Z",
		garbageValue = "-2107938255"
	)
	static final boolean method9105(int var0, int var1, int var2, int var3, int var4) {
		PendingSpawn var5 = null;

		for (PendingSpawn var6 = (PendingSpawn)Client.pendingSpawns.last(); var6 != null; var6 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0 == var6.plane && var6.x == var1 && var2 == var6.y && var3 == var6.type) {
				var5 = var6;
				break;
			}
		}

		if (var5 != null) {
			var5.field1203 = var4;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(I)Lot;",
		garbageValue = "-2108213446"
	)
	static JagNetThread method9109() {
		return class356.field3897;
	}
}
