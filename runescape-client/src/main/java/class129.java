import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("dn")
public class class129 extends class128 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -84974435)
	int field1545;

	@ObfuscatedName("q")
	boolean field1546;

	@ObfuscatedSignature(descriptor = "Lec;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lec;)V")
	class129(class131 var1) {
		this.this$0 = var1;
		this.field1545 = -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-423569520")
	void vmethod3155(Buffer var1) {
		this.field1545 = var1.readUnsignedShort();
		this.field1546 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lez;I)V", garbageValue = "-1755436064")
	void vmethod3154(ClanSettings var1) {
		var1.method2974(this.field1545, this.field1546);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "1")
	static void method2905() {
		Players.Players_count = 0;
		for (int var0 = 0; var0 < 2048; ++var0) {
			Players.field1295[var0] = null;
			Players.field1294[var0] = class192.field2194;
		}
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "67")
	static final void method2904() {
		for (PendingSpawn var0 = ((PendingSpawn) (Client.pendingSpawns.last())); var0 != null; var0 = ((PendingSpawn) (Client.pendingSpawns.previous()))) {
			if (var0.hitpoints == -1) {
				var0.delay = 0;
				UrlRequester.method2621(var0);
			} else {
				var0.remove();
			}
		}
	}
}