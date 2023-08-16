import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class178 extends class181 {
	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "[Lui;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -207822203
	)
	int field1893;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	final class170 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgf;Ljava/lang/String;I)V"
	)
	class178(class170 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1893 = var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "38"
	)
	public int vmethod3528() {
		return 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1630105394"
	)
	public int vmethod3527() {
		return this.field1893;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "65280"
	)
	static int method3504(int var0, Script var1, boolean var2) {
		return 2;
	}
}
