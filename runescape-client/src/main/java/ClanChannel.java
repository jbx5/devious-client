import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("aw")
	public static String field1764;
	@ObfuscatedName("at")
	boolean field1770;
	@ObfuscatedName("ah")
	boolean field1765;
	@ObfuscatedName("ar")
	@Export("members")
	public List members;
	@ObfuscatedName("ao")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -4051346480643886815L
	)
	public long field1772;
	@ObfuscatedName("au")
	@Export("name")
	public String name;
	@ObfuscatedName("aa")
	public byte field1766;
	@ObfuscatedName("ac")
	public byte field1771;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Luj;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1765 = true;
		this.name = null;
		this.method3481(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "85"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method9937();
			}

			int[] var3 = this.sortedMembers;
			class475.method8597(var1, var3, 0, var1.length - 1);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lft;I)V",
		garbageValue = "1476937216"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "93"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method3479() {
		return this.members.size();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-62"
	)
	public int method3484(String var1) {
		if (!this.field1765) {
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)V",
		garbageValue = "92"
	)
	void method3481(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1770 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1765 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1772 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1771 = var1.readByte();
		this.field1766 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1770) {
					var1.readLong();
				}

				if (this.field1765) {
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-18"
	)
	public static boolean method3483(int var0) {
		return (var0 >> 22 & 1) != 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-73"
	)
	static final int method3482(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1458009071"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1117566535"
	)
	static final void method3471(int var0) {
		if (HealthBarDefinition.widgetDefinition.loadInterface(var0)) {
			SoundCache.drawModelComponents(HealthBarDefinition.widgetDefinition.Widget_interfaceComponents[var0], -1);
		}
	}
}
