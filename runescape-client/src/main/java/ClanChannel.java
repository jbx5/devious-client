import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("ab")
	boolean field1805;
	@ObfuscatedName("ay")
	boolean field1800;
	@ObfuscatedName("an")
	@Export("members")
	public List members;
	@ObfuscatedName("au")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = -1089954146771115783L
	)
	public long field1803;
	@ObfuscatedName("ao")
	@Export("name")
	public String name;
	@ObfuscatedName("am")
	public byte field1804;
	@ObfuscatedName("ac")
	public byte field1806;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lvg;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1800 = true;
		this.name = null;
		this.method3579(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "331745613"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method10300();
			}

			class36.method671(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfl;I)V",
		garbageValue = "518046475"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-774852629"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1472558959"
	)
	public int method3577() {
		return this.members.size();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-422738218"
	)
	public int method3578(String var1) {
		if (!this.field1800) {
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "1352060343"
	)
	void method3579(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1805 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1800 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1803 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1806 = var1.readByte();
		this.field1804 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1805) {
					var1.readLong();
				}

				if (this.field1800) {
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

	@ObfuscatedName("ab")
	public static final void method3595(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				KeyHandler.method356(var0 - 1L);
				KeyHandler.method356(1L);
			} else {
				KeyHandler.method356(var0);
			}

		}
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "983747067"
	)
	static final void method3594(int var0, int var1, int var2, boolean var3) {
		if (FloorUnderlayDefinition.widgetDefinition.loadInterface(var0)) {
			class134.resizeInterface(FloorUnderlayDefinition.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3);
		}
	}
}
