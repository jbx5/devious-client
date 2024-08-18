import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("AABB")
public class AABB {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 442049133
	)
	@Export("xMid")
	int xMid;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -611126407
	)
	@Export("yMid")
	int yMid;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -516130487
	)
	@Export("zMid")
	int zMid;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 801736685
	)
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -896658503
	)
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1361964651
	)
	@Export("zMidOffset")
	int zMidOffset;

	AABB(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.xMid = var1;
		this.yMid = var2;
		this.zMid = var3;
		this.xMidOffset = var4;
		this.yMidOffset = var5;
		this.zMidOffset = var6;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lob;Lob;I)Z",
		garbageValue = "501818057"
	)
	public static boolean method4126(AbstractArchive var0, AbstractArchive var1) {
		WorldMapElement.WorldMapElement_archive = var1;
		if (!var0.isFullyLoaded()) {
			return false;
		} else {
			WorldMapElement.WorldMapElement_count = var0.getGroupFileCount(35);
			class442.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

			for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
				byte[] var3 = var0.takeFile(35, var2);
				class442.WorldMapElement_cached[var2] = new WorldMapElement(var2);
				if (var3 != null) {
					class442.WorldMapElement_cached[var2].decode(new Buffer(var3));
					class442.WorldMapElement_cached[var2].method4791();
				}
			}

			return true;
		}
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "961631308"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		if (var1.length() > 9) {
			return " " + TransformationMatrix.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + TransformationMatrix.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + TransformationMatrix.colorStartTag(16776960) + var1 + "</col>";
		}
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1667309603"
	)
	static final void method4125() {
		for (int var0 = 0; var0 < ConcurrentMidiTask.topLevelWorldView.playerUpdateManager.playerCount; ++var0) {
			Player var1 = ConcurrentMidiTask.topLevelWorldView.players[ConcurrentMidiTask.topLevelWorldView.playerUpdateManager.playerIndices[var0]];
			var1.method2446();
		}

	}
}
