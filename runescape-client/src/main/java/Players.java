import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("Players")
public class Players {
	@ObfuscatedName("ao")
	static byte[] field1387;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lin;"
	)
	static class217[] field1377;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Ltm;"
	)
	static Buffer[] field1388;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2110833449
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("az")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1198904791
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("aa")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("af")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("ad")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("aq")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 310707883
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("an")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	static Buffer field1376;
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("uq")
	@ObfuscatedGetter(
		intValue = 1094034048
	)
	static int field1374;

	static {
		field1387 = new byte[2048];
		field1377 = new class217[2048];
		field1388 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1376 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lhc;",
		garbageValue = "-1692851000"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-831991142"
	)
	public static final void method2706() {
		ViewportMouse.ViewportMouse_isInViewport = false;
		ViewportMouse.ViewportMouse_entityCount = 0;
	}
}
