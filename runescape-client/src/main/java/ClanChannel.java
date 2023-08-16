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
	@ObfuscatedName("au")
	boolean field1807;
	@ObfuscatedName("ae")
	boolean field1801;
	@ObfuscatedName("ao")
	@Export("members")
	public List members;
	@ObfuscatedName("at")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -1404514629729281795L
	)
	public long field1808;
	@ObfuscatedName("ai")
	@Export("name")
	public String name;
	@ObfuscatedName("az")
	public byte field1800;
	@ObfuscatedName("ap")
	public byte field1804;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Ltm;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1801 = true;
		this.name = null;
		this.method3315(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "74"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method9688();
			}

			int[] var3 = this.sortedMembers;
			VerticalAlignment.method3745(var1, var3, 0, var1.length - 1);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfu;I)V",
		garbageValue = "2089443829"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-753870503"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "65"
	)
	public int method3301() {
		return this.members.size();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)I",
		garbageValue = "179"
	)
	public int method3302(String var1) {
		if (!this.field1801) {
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "-1748777408"
	)
	void method3315(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1807 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1801 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1808 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1804 = var1.readByte();
		this.field1800 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1807) {
					var1.readLong();
				}

				if (this.field1801) {
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lhz;",
		garbageValue = "1042028592"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Lie;S)V",
		garbageValue = "12208"
	)
	static void method3321(class211 var0) {
		if (var0 != null && var0.field2355 != null) {
			if (var0.field2355.childIndex >= 0) {
				Widget var1 = class92.getWidget(var0.field2355.parentId);
				if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field2355.childIndex >= var1.children.length || var0.field2355 != var1.children[var0.field2355.childIndex]) {
					return;
				}
			}

			if (var0.field2355.type == 11 && var0.field2350 == 0) {
				if (var0.field2355.method6404(var0.field2352, var0.field2354, 0, 0)) {
					switch(var0.field2355.method6408()) {
					case 0:
						class30.openURL(var0.field2355.method6410(), true, false);
						break;
					case 1:
						int var2 = NpcOverrides.getWidgetFlags(var0.field2355);
						boolean var5 = (var2 >> 22 & 1) != 0;
						if (var5) {
							int[] var3 = var0.field2355.method6424();
							if (var3 != null) {
								PacketBufferNode var4 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3124, Client.packetWriter.isaacCipher);
								var4.packetBuffer.writeIntME(var3[1]);
								var4.packetBuffer.writeIntIME(var0.field2355.id);
								var4.packetBuffer.writeShortLE(var0.field2355.childIndex);
								var4.packetBuffer.writeInt(var0.field2355.method6409());
								var4.packetBuffer.writeIntIME(var3[2]);
								var4.packetBuffer.writeIntIME(var3[0]);
								Client.packetWriter.addNode(var4);
							}
						}
					}
				}
			} else if (var0.field2355.type == 12) {
				class329 var6 = var0.field2355.method6532();
				if (var6 != null && var6.method6158()) {
					switch(var0.field2350) {
					case 0:
						Client.field765.method4093(var0.field2355);
						var6.method6106(true);
						var6.method6347(var0.field2352, var0.field2354, Client.field674.method4120(82), Client.field674.method4120(81));
						break;
					case 1:
						var6.method6190(var0.field2352, var0.field2354);
					}
				}
			}

		}
	}
}
