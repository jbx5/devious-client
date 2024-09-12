import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("ac")
	boolean field1838;
	@ObfuscatedName("ae")
	boolean field1834;
	@ObfuscatedName("ag")
	@Export("members")
	public List members;
	@ObfuscatedName("am")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = 713846940201558631L
	)
	public long field1837;
	@ObfuscatedName("aq")
	@Export("name")
	public String name;
	@ObfuscatedName("af")
	public byte field1839;
	@ObfuscatedName("at")
	public byte field1833;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lvf;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1834 = true;
		this.name = null;
		this.method3736(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1750247817"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method10592();
			}

			class143.method3389(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfy;B)V",
		garbageValue = "9"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1598387098"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-366055431"
	)
	public int method3726() {
		return this.members.size();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "2008595423"
	)
	public int method3727(String var1) {
		if (!this.field1834) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) {
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "-571778818"
	)
	void method3736(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1838 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1834 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1837 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1833 = var1.readByte();
		this.field1839 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1838) {
					var1.readLong();
				}

				if (this.field1834) {
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte();
				var6.world = var1.readUnsignedShort();
				if (var3 >= 3) {
					var1.readBoolean();
				}

				this.members.add(var5, var6);
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "-2029916541"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		synchronized(ByteArrayPool.field4860) {
			byte[] var3;
			if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool.ByteArrayPool_smallCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_small[--ByteArrayPool.ByteArrayPool_smallCount];
				ByteArrayPool.ByteArrayPool_small[ByteArrayPool.ByteArrayPool_smallCount] = null;
				return var3;
			}

			if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool.ByteArrayPool_mediumCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_medium[--ByteArrayPool.ByteArrayPool_mediumCount];
				ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount] = null;
				return var3;
			}

			if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool.ByteArrayPool_largeCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_large[--ByteArrayPool.ByteArrayPool_largeCount];
				ByteArrayPool.ByteArrayPool_large[ByteArrayPool.ByteArrayPool_largeCount] = null;
				return var3;
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && ByteArrayPool.field4863 > 0) {
				var3 = ByteArrayPool.field4872[--ByteArrayPool.field4863];
				ByteArrayPool.field4872[ByteArrayPool.field4863] = null;
				return var3;
			}

			int var6;
			if (class416.ByteArrayPool_arrays != null) {
				for (var6 = 0; var6 < MusicSong.ByteArrayPool_alternativeSizes.length; ++var6) {
					if ((MusicSong.ByteArrayPool_alternativeSizes[var6] == var0 || var0 < MusicSong.ByteArrayPool_alternativeSizes[var6] && var1) && class159.ByteArrayPool_altSizeArrayCounts[var6] > 0) {
						byte[] var4 = class416.ByteArrayPool_arrays[var6][--class159.ByteArrayPool_altSizeArrayCounts[var6]];
						class416.ByteArrayPool_arrays[var6][class159.ByteArrayPool_altSizeArrayCounts[var6]] = null;
						return var4;
					}
				}
			}

			if (var1 && MusicSong.ByteArrayPool_alternativeSizes != null) {
				for (var6 = 0; var6 < MusicSong.ByteArrayPool_alternativeSizes.length; ++var6) {
					if (var0 <= MusicSong.ByteArrayPool_alternativeSizes[var6] && class159.ByteArrayPool_altSizeArrayCounts[var6] < class416.ByteArrayPool_arrays[var6].length) {
						return new byte[MusicSong.ByteArrayPool_alternativeSizes[var6]];
					}
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "1304036151"
	)
	static final int method3741(int var0, int var1, int var2, int var3) {
		return var3 * var0 + var2 * var1 >> 16;
	}
}
