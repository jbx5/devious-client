import java.applet.Applet;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(1, (byte)0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(0, (byte)1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(3, (byte)2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(2, (byte)3);

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	@Export("soundSystem")
	public static SoundSystem soundSystem;
	@ObfuscatedName("ax")
	public static short[][] field2980;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = -1406263901
	)
	static int field2979;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = 1155170751
	)
	static int field2978;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1104376933
	)
	@Export("type")
	final int type;
	@ObfuscatedName("aj")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V",
		garbageValue = "1774560987"
	)
	public static void method5461(Applet var0, String var1) {
		class31.field179 = var0;
		if (var1 != null) {
			class31.field176 = var1;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "-1332701631"
	)
	public static void method5469(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var3) {
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-218910900"
	)
	static final void method5466(String var0) {
		Tile.method4399(var0 + " is already on your friend list");
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1940153519"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) {
			RouteStrategy.method4227(0, 0);
		} else if (var0 != -1) {
			boolean var1;
			if (class306.field3398.isEmpty()) {
				var1 = false;
			} else {
				MusicSong var2 = (MusicSong)class306.field3398.get(0);
				var1 = var2 != null && var0 == var2.musicTrackGroupId;
			}

			if (!var1 && class150.clientPreferences.method2478() != 0) {
				ArrayList var3 = new ArrayList();
				var3.add(new MusicSong(class13.archive6, var0, 0, class150.clientPreferences.method2478(), false));
				if (Client.playingJingle) {
					class306.field3398.clear();
					class306.field3398.addAll(var3);
					ArchiveLoader.method2259(0, 100, 100, 0);
				} else {
					UserComparator4.method2858(var3, 0, 100, 100, 0, false);
				}
			}
		}

	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Ldf;IIB)V",
		garbageValue = "108"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = class135.SequenceDefinition_get(var1).field2274;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1199 = 0;
			}

			if (var3 == 2) {
				var0.field1199 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || class135.SequenceDefinition_get(var1).field2258 >= class135.SequenceDefinition_get(var0.sequence).field2258) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1199 = 0;
			var0.field1257 = var0.pathLength;
		}

	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "94"
	)
	static void method5467() {
		if (UserComparator7.field1455 != null) {
			Client.field792 = Client.cycle;
			UserComparator7.field1455.method6966();

			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					UserComparator7.field1455.method6965(AbstractArchive.baseX * 64 + (Client.players[var0].x >> 7), class148.baseY * 64 + (Client.players[var0].y >> 7));
				}
			}
		}

	}
}
