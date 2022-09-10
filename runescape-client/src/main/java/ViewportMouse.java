import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("c")
	@Export("ViewportMouse_isInViewport")
	static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -973123173
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1369976021
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("n")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -728610077
	)
	static int field2619;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1418631879
	)
	static int field2630;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1148392007
	)
	static int field2625;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -151668581
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("u")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1708907196"
	)
	static String method4628() {
		StringBuilder var0 = new StringBuilder(); // L: 73

		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0.append(var2.text).append('\n')) { // L: 74 80
			var2 = (Message)var1.next(); // L: 75
			if (var2.sender != null && !var2.sender.isEmpty()) { // L: 77
				var0.append(var2.sender).append(':'); // L: 78
			}
		}

		return var0.toString(); // L: 83
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lgt;",
		garbageValue = "595836808"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 336
		if (var1 != null) { // L: 337
			return var1;
		} else {
			AbstractArchive var3 = JagexCache.SequenceDefinition_animationsArchive; // L: 339
			AbstractArchive var4 = SequenceDefinition.SequenceDefinition_skeletonsArchive; // L: 340
			boolean var5 = true; // L: 342
			int[] var6 = var3.getGroupFileIds(var0); // L: 343

			for (int var7 = 0; var7 < var6.length; ++var7) { // L: 344
				byte[] var8 = var3.getFile(var0, var6[var7]); // L: 345
				if (var8 == null) { // L: 346
					var5 = false; // L: 347
				} else {
					int var9 = (var8[0] & 255) << 8 | var8[1] & 255; // L: 350
					byte[] var10 = var4.getFile(var9, 0); // L: 353
					if (var10 == null) { // L: 354
						var5 = false;
					}
				}
			}

			Frames var2;
			if (!var5) { // L: 356
				var2 = null; // L: 357
			} else {
				try {
					var2 = new Frames(var3, var4, var0, false); // L: 361
				} catch (Exception var12) { // L: 363
					var2 = null; // L: 364
				}
			}

			if (var2 != null) { // L: 368
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2; // L: 369
		}
	}
}
