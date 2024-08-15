import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("us")
final class class534 implements class531 {
	@ObfuscatedName("ax")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvg;I)V",
		garbageValue = "-663284636"
	)
	public void vmethod9472(Object var1, Buffer var2) {
		this.method9439((Long)var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)Ljava/lang/Object;",
		garbageValue = "1930105909"
	)
	public Object vmethod9476(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lvg;I)V",
		garbageValue = "-65183261"
	)
	void method9439(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
