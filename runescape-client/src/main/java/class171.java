import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class171 extends class147 {
	@ObfuscatedName("kv")
	@ObfuscatedGetter(
		intValue = 406002563
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -239094847
	)
	int field1845;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 8502200598084483025L
	)
	long field1844;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfu;)V"
	)
	class171(class150 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "1738227110"
	)
	void vmethod3486(Buffer var1) {
		this.field1845 = var1.readInt();
		this.field1844 = var1.readLong();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgc;B)V",
		garbageValue = "100"
	)
	void vmethod3490(ClanSettings var1) {
		var1.method3336(this.field1845, this.field1844);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "10"
	)
	static final void method3491() {
		Object var10000 = null;
		String var0 = "You can't add yourself to your own friend list";
		UrlRequest.addGameMessage(30, "", var0);
	}
}
