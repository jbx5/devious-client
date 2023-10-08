import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	static IndexedSprite field1779;
	@ObfuscatedName("ac")
	boolean field1773;
	@ObfuscatedName("al")
	boolean field1772;
	@ObfuscatedName("ak")
	@Export("members")
	public List members;
	@ObfuscatedName("ax")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -2657131668155479195L
	)
	public long field1775;
	@ObfuscatedName("ah")
	@Export("name")
	public String name;
	@ObfuscatedName("ar")
	public byte field1777;
	@ObfuscatedName("ab")
	public byte field1778;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lul;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1772 = true;
		this.name = null;
		this.method3388(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-35"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method9844();
			}

			int[] var3 = this.sortedMembers;
			class161.method3349(var1, var3, 0, var1.length - 1);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfv;B)V",
		garbageValue = "0"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-32"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1630727140"
	)
	public int method3382() {
		return this.members.size();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1421976889"
	)
	public int method3383(String var1) {
		if (!this.field1772) {
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "446907071"
	)
	void method3388(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1773 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1772 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1775 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1778 = var1.readByte();
		this.field1777 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1773) {
					var1.readLong();
				}

				if (this.field1772) {
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhm;",
		garbageValue = "77"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lde;",
		garbageValue = "203333818"
	)
	@Export("openInterface")
	static final InterfaceParent openInterface(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		class357.method6796(var1);
		Widget var4 = class33.widgetDefinition.method6240(var0);
		ClanChannelMember.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			ClanChannelMember.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		PendingSpawn.revalidateWidgetScroll(class33.widgetDefinition.Widget_interfaceComponents[var0 >> 16], var4, false);
		VerticalAlignment.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			Interpreter.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
