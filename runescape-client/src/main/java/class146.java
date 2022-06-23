import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("ep")
public class class146 extends class128 {
	@ObfuscatedName("sg")
	@ObfuscatedGetter(intValue = -1417840077)
	static int field1682;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1388421223)
	int field1683;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 132668311)
	int field1679;

	@ObfuscatedSignature(descriptor = "Lej;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lej;)V")
	class146(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;B)V", garbageValue = "5")
	void vmethod3150(Buffer var1) {
		this.field1683 = var1.readInt();
		this.field1679 = var1.readInt();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Len;I)V", garbageValue = "-1718344311")
	void vmethod3149(ClanSettings var1) {
		var1.method2965(this.field1683, this.field1679);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Llh;I)V", garbageValue = "-1659219140")
	public static void method3082(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0;
	}
}