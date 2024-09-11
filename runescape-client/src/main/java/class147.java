import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class147 extends class150 {
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = 1943108661
	)
	@Export("oculusOrbFocalPointZ")
	static int oculusOrbFocalPointZ;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -996029239
	)
	int field1694;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1620946715
	)
	int field1696;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -842437995
	)
	int field1695;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1129292933
	)
	int field1693;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class147(class153 var1) {
		this.this$0 = var1;
		this.field1694 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "127"
	)
	void vmethod3778(Buffer var1) {
		this.field1694 = var1.readUnsignedShort();
		this.field1696 = var1.readInt();
		this.field1695 = var1.readUnsignedByte();
		this.field1693 = var1.readUnsignedByte();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;B)V",
		garbageValue = "32"
	)
	void vmethod3771(ClanSettings var1) {
		var1.method3622(this.field1694, this.field1696, this.field1695, this.field1693);
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(B)Ltu;",
		garbageValue = "122"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return UserComparator8.worldMap;
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1811137681"
	)
	static boolean method3438() {
		return (Client.drawPlayerNames & 1) != 0;
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1708350717"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (TaskHandler.widgetDefinition.loadInterface(var0)) {
			class324.runComponentCloseListeners(TaskHandler.widgetDefinition.Widget_interfaceComponents[var0], var1);
		}
	}
}
