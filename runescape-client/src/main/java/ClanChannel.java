import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("aq")
	boolean field1826;
	@ObfuscatedName("ad")
	boolean field1818;
	@ObfuscatedName("ag")
	@Export("members")
	public List members;
	@ObfuscatedName("ak")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -2959055586149088951L
	)
	public long field1821;
	@ObfuscatedName("an")
	@Export("name")
	public String name;
	@ObfuscatedName("aj")
	public byte field1823;
	@ObfuscatedName("av")
	public byte field1817;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lvp;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1818 = true;
		this.name = null;
		this.method3485(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-105"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method10189();
			}

			VarcInt.method3622(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lfa;I)V",
		garbageValue = "780541394"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2055617677"
	)
	public int method3501() {
		return this.members.size();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-58662709"
	)
	public int method3484(String var1) {
		if (!this.field1818) {
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-15655574"
	)
	void method3485(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1826 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1818 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1821 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1817 = var1.readByte();
		this.field1823 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1826) {
					var1.readLong();
				}

				if (this.field1818) {
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	public static boolean method3506() {
		if (!class330.field3581.isEmpty()) {
			return true;
		} else {
			return !class330.musicSongs.isEmpty() && class330.musicSongs.get(0) != null && ((MusicSong)class330.musicSongs.get(0)).midiPcmStream != null ? ((MusicSong)class330.musicSongs.get(0)).midiPcmStream.isReady() : false;
		}
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Lde;I)V",
		garbageValue = "938117130"
	)
	static void method3505(WorldView var0) {
		if (Client.renderSelf) {
			class341.addPlayerToScene(var0, Client.localPlayerIndex, false);
		}

	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "10"
	)
	static final void method3488(int var0, int var1, int var2, boolean var3) {
		if (ModeWhere.widgetDefinition.loadInterface(var0)) {
			ArchiveLoader.resizeInterface(ModeWhere.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3);
		}
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)I",
		garbageValue = "-1815013130"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32));
		return var1 != null ? var1.integer : var0.flags;
	}
}
