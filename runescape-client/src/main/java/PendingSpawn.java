import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 513675807
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1632112785
	)
	@Export("type")
	int type;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1681149729
	)
	@Export("x")
	int x;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1122616449
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1123586699
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1514165237
	)
	int field1197;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 448930155
	)
	int field1196;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1410243379
	)
	int field1198;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -650330621
	)
	int field1199;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -50867125
	)
	int field1191;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 739646929
	)
	int field1203;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1655104173
	)
	int field1202;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1161862785
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2100710063
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1202 = 31;
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "102"
	)
	void method2455(int var1) {
		this.field1202 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2006124018"
	)
	boolean method2460(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1202 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1061121183"
	)
	static void method2459() {
		ItemContainer.itemContainers = new NodeHashTable(32);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-204477510"
	)
	static void method2454() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromFriend();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "97"
	)
	static void method2458(boolean var0) {
		MusicSong var2;
		if (var0) {
			Iterator var7 = class321.musicSongs.iterator();

			while (true) {
				do {
					if (!var7.hasNext()) {
						class321.musicSongs.clear();
						return;
					}

					var2 = (MusicSong)var7.next();
				} while(var2 == null);

				var2.midiPcmStream.clear();
				var2.midiPcmStream.method6202();
				var2.midiPcmStream.setPcmStreamVolume(0);
				var2.midiPcmStream.field3518 = 0;
				int var3 = var2.musicTrackGroupId;
				int var4 = var2.musicTrackFileId;
				Iterator var5 = class321.field3482.iterator();

				while (var5.hasNext()) {
					class327 var6 = (class327)var5.next();
					var6.vmethod6339(var3, var4);
				}
			}
		} else {
			for (int var1 = 0; var1 < class321.musicSongs.size(); ++var1) {
				var2 = (MusicSong)class321.musicSongs.get(var1);
				if (var2 == null) {
					class321.musicSongs.remove(var1);
					--var1;
				} else if (var2.field3595) {
					if (var2.midiPcmStream.field3518 > 0) {
						--var2.midiPcmStream.field3518;
					}

					var2.midiPcmStream.clear();
					var2.midiPcmStream.method6202();
					var2.midiPcmStream.setPcmStreamVolume(0);
					class321.musicSongs.remove(var1);
					--var1;
				} else {
					var2.field3595 = true;
				}
			}

		}
	}
}
