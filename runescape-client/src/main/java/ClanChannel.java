import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("gd")
	@Export("sessionId")
	static String sessionId;
	@ObfuscatedName("un")
	@ObfuscatedGetter(
		intValue = -1954646921
	)
	static int field1766;
	@ObfuscatedName("am")
	boolean field1769;
	@ObfuscatedName("ap")
	boolean field1759;
	@ObfuscatedName("af")
	@Export("members")
	public List members;
	@ObfuscatedName("aj")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -815507630431894567L
	)
	public long field1764;
	@ObfuscatedName("ar")
	@Export("name")
	public String name;
	@ObfuscatedName("ag")
	public byte field1758;
	@ObfuscatedName("ao")
	public byte field1767;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Luk;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1759 = true;
		this.name = null;
		this.method3493(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1506851312"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method10004();
			}

			int[] var3 = this.sortedMembers;
			Player.quicksortStringsWithCorrespondingIntegers(var1, var3, 0, var1.length - 1);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfk;I)V",
		garbageValue = "545474341"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-365947513"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "347397534"
	)
	public int method3492() {
		return this.members.size();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "117"
	)
	public int method3495(String var1) {
		if (!this.field1759) {
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "1944473885"
	)
	void method3493(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1769 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1759 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1764 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1767 = var1.readByte();
		this.field1758 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1769) {
					var1.readLong();
				}

				if (this.field1759) {
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
