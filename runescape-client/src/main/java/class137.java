import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public class class137 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1622;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1621;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1614;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1634;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1616;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1617;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1618;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1619;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1613;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1631;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1615;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1623;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1624;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1625;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1626;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1627;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static final class137 field1628;
	@ObfuscatedName("ui")
	@ObfuscatedGetter(
		intValue = 459245751
	)
	static int field1630;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1514933645
	)
	final int field1629;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2043571075
	)
	final int field1633;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 270551211
	)
	final int field1620;

	static {
		field1622 = new class137(0, 0, (String)null, -1, -1);
		field1621 = new class137(1, 1, (String)null, 0, 2);
		field1614 = new class137(2, 2, (String)null, 1, 2);
		field1634 = new class137(3, 3, (String)null, 2, 2);
		field1616 = new class137(4, 4, (String)null, 3, 1);
		field1617 = new class137(5, 5, (String)null, 4, 1);
		field1618 = new class137(6, 6, (String)null, 5, 1);
		field1619 = new class137(7, 7, (String)null, 6, 3);
		field1613 = new class137(8, 8, (String)null, 7, 3);
		field1631 = new class137(9, 9, (String)null, 8, 3);
		field1615 = new class137(10, 10, (String)null, 0, 7);
		field1623 = new class137(11, 11, (String)null, 1, 7);
		field1624 = new class137(12, 12, (String)null, 2, 7);
		field1625 = new class137(13, 13, (String)null, 3, 7);
		field1626 = new class137(14, 14, (String)null, 4, 7);
		field1627 = new class137(15, 15, (String)null, 5, 7);
		field1628 = new class137(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class137(int var1, int var2, String var3, int var4, int var5) {
		this.field1629 = var1;
		this.field1633 = var2;
		this.field1620 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1633;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "632601697"
	)
	int method3178() {
		return this.field1620;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "479463461"
	)
	public static void method3187(int var0, int var1) {
		class33.method476(var0, var1, 0, 0);
		class330.field3585.clear();
		class330.field3581.clear();
		if (!class330.musicSongs.isEmpty() && (var0 != 0 || var1 != 0)) {
			class330.field3581.add(new DelayFadeTask((SongTask)null, class330.musicPlayerStatus));
			class330.field3581.add(new FadeOutTask((SongTask)null, 0, false, class330.field3589));
			ArrayList var10 = new ArrayList();
			Iterator var4 = class330.musicSongs.iterator();

			while (var4.hasNext()) {
				MusicSong var5 = (MusicSong)var4.next();
				var10.add(var5);
			}

			class330.field3581.add(new class439((SongTask)null, var10));
		} else {
			Iterator var2 = class330.musicSongs.iterator();

			while (true) {
				MusicSong var3;
				do {
					if (!var2.hasNext()) {
						class330.musicSongs.clear();
						return;
					}

					var3 = (MusicSong)var2.next();
				} while(var3 == null);

				var3.midiPcmStream.clear();
				var3.midiPcmStream.method6190();
				var3.midiPcmStream.setPcmStreamVolume(0);
				var3.midiPcmStream.field3627 = 0;
				int var8 = var3.musicTrackGroupId;
				int var9 = var3.musicTrackFileId;
				Iterator var6 = class330.field3588.iterator();

				while (var6.hasNext()) {
					class336 var7 = (class336)var6.next();
					var7.vmethod6382(var8, var9);
				}
			}
		}
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Lde;Ldy;I)V",
		garbageValue = "361069908"
	)
	static final void method3189(WorldView var0, PendingSpawn var1) {
		Scene var2 = var0.scene;
		long var3 = 0L;
		int var5 = -1;
		int var6 = 0;
		int var7 = 0;
		if (var1.type == 0) {
			var3 = var2.getBoundaryObjectTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 1) {
			var3 = var2.getWallDecorationTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 2) {
			var3 = var2.getGameObjectTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 3) {
			var3 = var2.getFloorDecorationTag(var1.plane, var1.x, var1.y);
		}

		if (var3 != 0L) {
			int var8 = var2.getObjectFlags(var1.plane, var1.x, var1.y, var3);
			var5 = class229.Entity_unpackID(var3);
			var6 = var8 & 31;
			var7 = var8 >> 6 & 3;
		}

		var1.objectId = var5;
		var1.field1185 = var6;
		var1.field1176 = var7;
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1432699417"
	)
	@Export("invalidateWidgetsUnder")
	static final void invalidateWidgetsUnder(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.validRootWidgets[var4] = true;
			}
		}

	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1957525906"
	)
	static final void method3176(int var0) {
		if (ModeWhere.widgetDefinition.loadInterface(var0)) {
			Widget[] var1 = ModeWhere.widgetDefinition.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
