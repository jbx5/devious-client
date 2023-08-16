import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tz")
final class class503 implements class498 {
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 724816653
	)
	static int field5039;

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ltm;I)V",
		garbageValue = "465506048"
	)
	public void vmethod8928(Object var1, Buffer var2) {
		this.method8927((String)var1, var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)Ljava/lang/Object;",
		garbageValue = "-295239457"
	)
	public Object vmethod8926(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ltm;I)V",
		garbageValue = "-1097671055"
	)
	void method8927(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2008641376"
	)
	static final void method8932() {
		UserComparator8.method2870("You can't add yourself to your own ignore list");
	}
}
