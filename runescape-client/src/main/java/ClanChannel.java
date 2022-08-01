import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.ArrayList;
import net.runelite.mapping.Implements;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
@ObfuscatedName("ey")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Llz;")
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;

	@ObfuscatedName("o")
	boolean field1677;

	@ObfuscatedName("q")
	boolean field1670 = true;

	@ObfuscatedName("f")
	@Export("members")
	public List members;

	@ObfuscatedName("u")
	@Export("sortedMembers")
	int[] sortedMembers;

	@ObfuscatedName("c")
	@ObfuscatedGetter(longValue = 4338856291735042253L)
	long field1674;

	@ObfuscatedName("w")
	@Export("name")
	public String name = null;

	@ObfuscatedName("z")
	public byte field1676;

	@ObfuscatedName("j")
	public byte field1672;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(descriptor = "(Lqw;)V")
	public ClanChannel(Buffer var1) {
		this.method3116(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)[I", garbageValue = "208587347")
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];
			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember) (this.members.get(var2))).username.method8350();
			}
			class390.method7091(var1, this.sortedMembers);
		}
		return this.sortedMembers;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lem;I)V", garbageValue = "-1948458277")
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-188716261")
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2019373406")
	public int method3117() {
		return this.members.size();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I", garbageValue = "184146921")
	public int method3119(String var1) {
		if (!this.field1670) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) {
				if (((ClanChannelMember) (this.members.get(var2))).username.getName().equalsIgnoreCase(var1)) {
					return var2;
				}
			}
			return -1;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-1731906570")
	void method3116(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1677 = true;
		}
		if ((var2 & 2) != 0) {
			this.field1670 = true;
		}
		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}
		super.key = var1.readLong();
		this.field1674 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1672 = var1.readByte();
		this.field1676 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);
			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1677) {
					var1.readLong();
				}
				if (this.field1670) {
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