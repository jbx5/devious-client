import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.ArrayList;
import net.runelite.mapping.Implements;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
@ObfuscatedName("ex")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("tj")
	@ObfuscatedGetter(intValue = 91794545)
	static int field1690;

	@ObfuscatedName("c")
	boolean field1689;

	@ObfuscatedName("v")
	boolean field1701;

	@ObfuscatedName("q")
	@Export("members")
	public List members;

	@ObfuscatedName("f")
	@Export("sortedMembers")
	int[] sortedMembers;

	@ObfuscatedName("j")
	@ObfuscatedGetter(longValue = 1434435831047347565L)
	long field1693;

	@ObfuscatedName("e")
	@Export("name")
	public String name;

	@ObfuscatedName("g")
	public byte field1695;

	@ObfuscatedName("w")
	public byte field1696;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(descriptor = "(Lqt;)V")
	public ClanChannel(Buffer var1) {
		this.field1701 = true;
		this.name = null;
		this.method3121(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)[I", garbageValue = "-17")
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];
			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember) (this.members.get(var2))).username.method8320();
			}
			class353.method6507(var1, this.sortedMembers);
		}
		return this.sortedMembers;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lew;I)V", garbageValue = "-619896679")
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "911390350")
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1458908732")
	public int method3113() {
		return this.members.size();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)I", garbageValue = "0")
	public int method3102(String var1) {
		if (!this.field1701) {
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(Lqt;I)V", garbageValue = "1615348983")
	void method3121(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1689 = true;
		}
		if ((var2 & 2) != 0) {
			this.field1701 = true;
		}
		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}
		super.key = var1.readLong();
		this.field1693 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1696 = var1.readByte();
		this.field1695 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);
			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1689) {
					var1.readLong();
				}
				if (this.field1701) {
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Llc;IIIBZB)V", garbageValue = "126")
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = ((long) ((var1 << 16) + var2));
		NetFileRequest var8 = ((NetFileRequest) (NetCache.NetCache_pendingPriorityWrites.get(var6)));
		if (var8 == null) {
			var8 = ((NetFileRequest) (NetCache.NetCache_pendingPriorityResponses.get(var6)));
			if (var8 == null) {
				var8 = ((NetFileRequest) (NetCache.NetCache_pendingWrites.get(var6)));
				if (var8 != null) {
					if (var5) {
						var8.removeDual();
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
						--NetCache.NetCache_pendingWritesCount;
						++NetCache.NetCache_pendingPriorityWritesCount;
					}
				} else {
					if (!var5) {
						var8 = ((NetFileRequest) (NetCache.NetCache_pendingResponses.get(var6)));
						if (var8 != null) {
							return;
						}
					}
					var8 = new NetFileRequest();
					var8.archive = var0;
					var8.crc = var3;
					var8.padding = var4;
					if (var5) {
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
						++NetCache.NetCache_pendingPriorityWritesCount;
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8);
						NetCache.NetCache_pendingWrites.put(var8, var6);
						++NetCache.NetCache_pendingWritesCount;
					}
				}
			}
		}
	}
}