import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("el")
public class class133 extends class128 {
	@ObfuscatedName("ln")
	@ObfuscatedSignature(descriptor = "Lkn;")
	@Export("hoveredItemContainer")
	static Widget hoveredItemContainer;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -862254627)
	int field1568;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 188559991)
	int field1572;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 662856033)
	int field1567;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 566440441)
	int field1569;

	@ObfuscatedSignature(descriptor = "Lei;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lei;)V")
	class133(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "-885940784")
	void vmethod3087(Buffer var1) {
		this.field1568 = var1.readInt();
		this.field1569 = var1.readInt();
		this.field1572 = var1.readUnsignedByte();
		this.field1567 = var1.readUnsignedByte();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Leh;B)V", garbageValue = "0")
	void vmethod3084(ClanSettings var1) {
		var1.method2960(this.field1568, this.field1569, this.field1572, this.field1567);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "514873374")
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = class118.method2721(var0);
		int var2 = var1.baseVar;
		int var3 = var1.startBit;
		int var4 = var1.endBit;
		int var5 = Varps.Varps_masks[var4 - var3];
		return Varps.Varps_main[var2] >> var3 & var5;
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1167990931")
	static final int method2846() {
		if (ClanMate.clientPreferences.method2209()) {
			return class268.Client_plane;
		} else {
			int var0 = ObjectComposition.getTileHeight(class16.cameraX, class269.cameraZ, class268.Client_plane);
			return var0 - WorldMapLabel.cameraY < 800 && (Tiles.Tiles_renderFlags[class268.Client_plane][class16.cameraX >> 7][class269.cameraZ >> 7] & 4) != 0 ? class268.Client_plane : 3;
		}
	}
}