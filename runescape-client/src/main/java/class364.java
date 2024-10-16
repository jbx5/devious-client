import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oh")
public class class364 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("huffman")
	static Huffman huffman;
	@ObfuscatedName("up")
	@ObfuscatedGetter(
		intValue = -688398997
	)
	static int field4043;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;I)V",
		garbageValue = "-33460072"
	)
	public static void method7473(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0;
		ModelData0.field2933 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvv;IIII)V",
		garbageValue = "-1643317504"
	)
	static void method7476(SpritePixels var0, int var1, int var2, int var3) {
		WorldMapRegion.WorldMapRegion_cachedSprites.put(var0, Clock.method4667(var1, var2, var3), var0.pixels.length * 4);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lct;Lct;IZI)I",
		garbageValue = "1987327554"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1961() ? (var1.method1961() ? 0 : 1) : (var1.method1961() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1959() ? (var1.method1959() ? 0 : 1) : (var1.method1959() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lng;II)V",
		garbageValue = "1792784380"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3958 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field4030 == null) {
				var0.field4030 = new int[var0.field3958.length];
			}

			var0.field4030[var1] = Integer.MAX_VALUE;
		}
	}
}
