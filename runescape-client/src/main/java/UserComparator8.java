import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("ab")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsc;Lsc;I)I",
		garbageValue = "-1084832970"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) {
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Ljm;",
		garbageValue = "-1939442594"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([I[IB)V",
		garbageValue = "-42"
	)
	public static void method3049(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			KitDefinition.ByteArrayPool_alternativeSizes = var0;
			ByteArrayPool.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			MoveSpeed.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < KitDefinition.ByteArrayPool_alternativeSizes.length; ++var2) {
				MoveSpeed.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
				ByteArrayPool.field4832.add(var0[var2]);
			}

			Collections.sort(ByteArrayPool.field4832);
		} else {
			KitDefinition.ByteArrayPool_alternativeSizes = null;
			ByteArrayPool.ByteArrayPool_altSizeArrayCounts = null;
			MoveSpeed.ByteArrayPool_arrays = null;
			ByteArrayPool.field4832.clear();
			ByteArrayPool.field4832.add(100);
			ByteArrayPool.field4832.add(5000);
			ByteArrayPool.field4832.add(10000);
			ByteArrayPool.field4832.add(30000);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lob;IB)V",
		garbageValue = "30"
	)
	public static void method3052(AbstractArchive var0, int var1) {
		if (!class332.field3565.isEmpty()) {
			ArrayList var2 = new ArrayList();
			Iterator var3 = class332.field3565.iterator();

			while (var3.hasNext()) {
				MusicSong var4 = (MusicSong)var3.next();
				var4.field3679 = false;
				var4.field3678 = false;
				var4.field3680 = false;
				var4.field3681 = false;
				var4.musicTrackArchive = var0;
				var4.musicTrackVolume = var1;
				var4.field3676 = 0.0F;
				var2.add(var4);
			}

			class53.method1051(var2, class332.musicPlayerStatus, class332.field3568, class332.field3570, class332.field3567, false);
		}
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1738622705"
	)
	static final boolean method3046() {
		return Client.isMenuOpen;
	}
}
