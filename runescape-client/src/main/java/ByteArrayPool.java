import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("aq")
	static final Object field4614;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 908982729
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1385844103
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -553275423
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1422472291
	)
	static int field4618;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 779633507
	)
	static int field4611;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -893269233
	)
	static int field4620;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1646640921
	)
	static int field4621;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 750906493
	)
	static int field4622;
	@ObfuscatedName("ax")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("aw")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("az")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("av")
	static byte[][] field4626;
	@ObfuscatedName("ab")
	static ArrayList field4627;

	static {
		field4614 = new Object();
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field4618 = 0;
		field4611 = 1000;
		field4620 = 250;
		field4621 = 100;
		field4622 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field4626 = new byte[50][];
		field4627 = new ArrayList();
		class326.method6257();
		new HashMap();
	}

	@ObfuscatedName("ap")
	public static boolean method8033(long var0) {
		boolean var2 = 0L != var0;
		if (var2) {
			boolean var3 = (int)(var0 >>> 16 & 1L) == 1;
			var2 = !var3;
		}

		return var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;ZI)V",
		garbageValue = "-919555443"
	)
	static void method8035(ArrayList var0, boolean var1) {
		if (!var1) {
			class319.field3466.clear();
		}

		Iterator var2 = var0.iterator();

		while (var2.hasNext()) {
			MusicSong var3 = (MusicSong)var2.next();
			if (var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
				if (!var1) {
					class319.field3466.add(var3);
				}

				class319.field3461.add(var3);
			}
		}

	}
}
