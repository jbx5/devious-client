import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("dy")
	static boolean field1169;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = -1716253551
	)
	static int field1167;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -338943587
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 241275811
	)
	@Export("type")
	int type;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -473377439
	)
	@Export("x")
	int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -295377785
	)
	@Export("y")
	int y;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 950457513
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 467323589
	)
	int field1157;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1843576419
	)
	int field1158;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1617415071
	)
	int field1162;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1507666767
	)
	int field1160;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -164763093
	)
	int field1161;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1169742593
	)
	int field1152;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1397855747
	)
	int field1159;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -657774781
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2020838527
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1159 = 31;
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1592817450"
	)
	void method2453(int var1) {
		this.field1159 = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "7928"
	)
	boolean method2455(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1159 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "1949440150"
	)
	public static void method2459(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class316.field3416.clear();
			class316.field3413.clear();
			PacketBufferNode.method5917(var5);
			class30.method463(var0, var5);
			if (!class316.field3416.isEmpty()) {
				EnumComposition.method3678(var1, var2, var3, var4);
				class316.field3413.add(new AddRequestTask((SongTask)null));
				class316.field3413.add(new class420((SongTask)null, class316.field3423, class316.field3414, class168.field1789));
				ArrayList var6 = new ArrayList();
				var6.add(new class415(new FadeInTask((SongTask)null, 0, true, class316.field3417)));
				if (!class316.musicSongs.isEmpty()) {
					ArrayList var7 = new ArrayList();
					var7.add(new DelayFadeTask(new ConcurrentMidiTask((SongTask)null, var6), class316.field3419));
					ArrayList var9 = new ArrayList();
					Iterator var10 = class316.musicSongs.iterator();

					while (var10.hasNext()) {
						MusicSong var11 = (MusicSong)var10.next();
						var9.add(var11);
					}

					var7.add(new DelayFadeTask(new FadeOutTask(new class413((SongTask)null, var9), 0, false, class316.field3418), class316.musicPlayerStatus));
					class316.field3413.add(new ConcurrentMidiTask((SongTask)null, var7));
				} else {
					class316.field3413.add(new DelayFadeTask((SongTask)null, class316.field3419));
					class316.field3413.add(new ConcurrentMidiTask((SongTask)null, var6));
				}

			}
		}
	}
}
