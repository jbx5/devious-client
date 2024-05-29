import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("ak")
	boolean field1824;
	@ObfuscatedName("al")
	boolean field1823;
	@ObfuscatedName("aj")
	@Export("members")
	public List members;
	@ObfuscatedName("az")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -7562717592565374625L
	)
	public long field1826;
	@ObfuscatedName("aa")
	@Export("name")
	public String name;
	@ObfuscatedName("at")
	public byte field1828;
	@ObfuscatedName("ab")
	public byte field1829;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lua;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1823 = true;
		this.name = null;
		this.method3454(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1696830137"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method10265();
			}

			Script.method2209(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfj;B)V",
		garbageValue = "98"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "103"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-53"
	)
	public int method3453() {
		return this.members.size();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "65"
	)
	public int method3456(String var1) {
		if (!this.field1823) {
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "1665807316"
	)
	void method3454(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1824 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1823 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1826 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1829 = var1.readByte();
		this.field1828 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1824) {
					var1.readLong();
				}

				if (this.field1823) {
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
}
