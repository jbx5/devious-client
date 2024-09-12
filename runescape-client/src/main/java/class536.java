import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uo")
final class class536 implements class533 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvf;B)V",
		garbageValue = "51"
	)
	public void vmethod9785(Object var1, Buffer var2) {
		this.method9745((Long)var1, var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)Ljava/lang/Object;",
		garbageValue = "173380129"
	)
	public Object vmethod9784(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lvf;I)V",
		garbageValue = "1503634418"
	)
	void method9745(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "377774510"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}
}
