import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class152 extends class148 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1930113479
	)
	int field1699;
	@ObfuscatedName("ay")
	byte field1697;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfy;)V"
	)
	class152(class151 var1) {
		this.this$0 = var1;
		this.field1699 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-1070155477"
	)
	void vmethod3619(Buffer var1) {
		this.field1699 = var1.readUnsignedShort();
		this.field1697 = var1.readByte();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "1070728869"
	)
	void vmethod3621(ClanSettings var1) {
		var1.method3486(this.field1699, this.field1697);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-28"
	)
	static String method3376(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lvc;",
		garbageValue = "1754526402"
	)
	static SpritePixels method3383(int var0, int var1, int var2) {
		return (SpritePixels)WorldMapRegion.WorldMapRegion_cachedSprites.get(MenuAction.method2179(var0, var1, var2));
	}
}
