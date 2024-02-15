import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public class class151 extends class161 {
	@ObfuscatedName("az")
	@Export("Tiles_underlays2")
	static byte[][][] Tiles_underlays2;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1026077785
	)
	int field1710;
	@ObfuscatedName("aw")
	byte field1709;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 350317843
	)
	int field1712;
	@ObfuscatedName("ai")
	String field1711;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	final class162 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lga;)V"
	)
	class151(class162 var1) {
		this.this$0 = var1;
		this.field1710 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1174207862"
	)
	void vmethod3504(Buffer var1) {
		this.field1710 = var1.readUnsignedShort();
		this.field1709 = var1.readByte();
		this.field1712 = var1.readUnsignedShort();
		var1.readLong();
		this.field1711 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "378355771"
	)
	void vmethod3509(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1710);
		var2.rank = this.field1709;
		var2.world = this.field1712;
		var2.username = new Username(this.field1711);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2016936296"
	)
	public static void method3279() {
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZI)V",
		garbageValue = "-2002148097"
	)
	static void method3280(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		TileItem var10 = new TileItem();
		var10.id = var3;
		var10.quantity = var4;
		var10.method2758(var5);
		if (Client.groundItems[var0][var1][var2] == null) {
			Client.groundItems[var0][var1][var2] = new NodeDeque();
		}

		Client.groundItems[var0][var1][var2].addFirst(var10);
		class73.updateItemPile(var0, var1, var2);
	}
}
