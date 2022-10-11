import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("c")
	boolean field1708;
	@ObfuscatedName("p")
	boolean field1702;
	@ObfuscatedName("f")
	@Export("members")
	public List members;
	@ObfuscatedName("n")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = -7239400334726069377L
	)
	long field1706;
	@ObfuscatedName("w")
	@Export("name")
	public String name;
	@ObfuscatedName("s")
	public byte field1711;
	@ObfuscatedName("q")
	public byte field1709;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Lqq;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1702 = true; // L: 13
		this.name = null; // L: 17
		this.method3267(var1); // L: 26
	} // L: 27

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-408809324"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 30
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()]; // L: 32

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 33 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method8530(); // L: 34
			}

			HealthBar.method2495(var1, this.sortedMembers); // L: 37
		}

		return this.sortedMembers; // L: 39
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "-1932886672"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 43
		this.sortedMembers = null; // L: 44
	} // L: 45

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1510627183"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 48
		this.sortedMembers = null; // L: 49
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1652642274"
	)
	public int method3265() {
		return this.members.size();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "73241154"
	)
	public int method3266(String var1) {
		if (!this.field1702) { // L: 57
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) { // L: 58
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2; // L: 59
				}
			}

			return -1; // L: 61
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "585349238"
	)
	void method3267(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 65
		if ((var2 & 1) != 0) { // L: 66
			this.field1708 = true;
		}

		if ((var2 & 2) != 0) { // L: 67
			this.field1702 = true;
		}

		int var3 = 2; // L: 68
		if ((var2 & 4) != 0) { // L: 69
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 70
		this.field1706 = var1.readLong(); // L: 71
		this.name = var1.readStringCp1252NullTerminated(); // L: 72
		var1.readBoolean(); // L: 73
		this.field1709 = var1.readByte(); // L: 74
		this.field1711 = var1.readByte(); // L: 75
		int var4 = var1.readUnsignedShort(); // L: 76
		if (var4 > 0) { // L: 77
			this.members = new ArrayList(var4); // L: 78

			for (int var5 = 0; var5 < var4; ++var5) { // L: 79
				ClanChannelMember var6 = new ClanChannelMember(); // L: 80
				if (this.field1708) { // L: 81
					var1.readLong(); // L: 82
				}

				if (this.field1702) { // L: 84
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte(); // L: 85
				var6.world = var1.readUnsignedShort(); // L: 86
				if (var3 >= 3) { // L: 87
					var1.readBoolean(); // L: 88
				}

				this.members.add(var5, var6); // L: 91
			}
		}

	} // L: 94

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1325677289"
	)
	public static int method3285(int var0) {
		--var0; // L: 50
		var0 |= var0 >>> 1; // L: 51
		var0 |= var0 >>> 2; // L: 52
		var0 |= var0 >>> 4; // L: 53
		var0 |= var0 >>> 8; // L: 54
		var0 |= var0 >>> 16; // L: 55
		return var0 + 1; // L: 56
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "-1098586481"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = World.World_worlds[var6]; // L: 180
			World.World_worlds[var6] = World.World_worlds[var1]; // L: 181
			World.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				if (KitDefinition.method3577(World.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) { // L: 184
					World var10 = World.World_worlds[var9]; // L: 185
					World.World_worlds[var9] = World.World_worlds[var7]; // L: 186
					World.World_worlds[var7++] = var10; // L: 187
				}
			}

			World.World_worlds[var1] = World.World_worlds[var7]; // L: 191
			World.World_worlds[var7] = var8; // L: 192
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 193
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 194
		}

	} // L: 196
}
