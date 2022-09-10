import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("StructDefinition_archive")
	static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -23709415
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64); // L: 13
	}

	StructComposition() {
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1559019875"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 33

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "1"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 37
			if (var2 == 0) { // L: 38
				return; // L: 41
			}

			this.decodeNext(var1, var2); // L: 39
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lqq;II)V",
		garbageValue = "-389649601"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = ReflectionCheck.readStringIntParameters(var1, this.params); // L: 44
		}

	} // L: 46

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "24"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return PlayerCompositionColorTextureOverride.method3508(this.params, var1, var2); // L: 49
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1994988484"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 54
		String var3;
		if (var4 == null) { // L: 56
			var3 = var2; // L: 57
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 60
			if (var5 == null) { // L: 61
				var3 = var2; // L: 62
			} else {
				var3 = (String)var5.obj; // L: 65
			}
		}

		return var3; // L: 67
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "1634698290"
	)
	static float method3747(float[] var0, int var1, float var2) {
		float var3 = var0[var1]; // L: 108

		for (int var4 = var1 - 1; var4 >= 0; --var4) { // L: 109
			var3 = var0[var4] + var3 * var2; // L: 110
		}

		return var3; // L: 112
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "([Lkw;Lkw;ZI)V",
		garbageValue = "-22794471"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width; // L: 10339
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height; // L: 10340
		resizeInterface(var0, var1.id, var3, var4, var2); // L: 10341
		if (var1.children != null) {
			resizeInterface(var1.children, var1.id, var3, var4, var2); // L: 10342
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 10343
		if (var5 != null) { // L: 10344
			int var6 = var5.group; // L: 10345
			if (FloorOverlayDefinition.loadInterface(var6)) { // L: 10347
				resizeInterface(Calendar.Widget_interfaceComponents[var6], -1, var3, var4, var2); // L: 10348
			}
		}

		if (var1.contentType == 1337) { // L: 10351
		}

	} // L: 10352

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "([Lkw;IIIZI)V",
		garbageValue = "-1535731953"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 10355
			Widget var6 = var0[var5]; // L: 10356
			if (var6 != null && var6.parentId == var1) { // L: 10357 10358
				class93.alignWidgetSize(var6, var2, var3, var4); // L: 10359
				HealthBarDefinition.alignWidgetPosition(var6, var2, var3); // L: 10360
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 10361
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 10362
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) { // L: 10363
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) { // L: 10364
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 10365
					revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 10367
}
