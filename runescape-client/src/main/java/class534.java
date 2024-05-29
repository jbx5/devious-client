import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uc")
final class class534 implements class529 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2084016401
	)
	@Export("RunException_revision")
	public static int RunException_revision;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lua;S)V",
		garbageValue = "220"
	)
	public void vmethod9521(Object var1, Buffer var2) {
		this.method9518((String)var1, var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lua;B)Ljava/lang/Object;",
		garbageValue = "-12"
	)
	public Object vmethod9520(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lua;I)V",
		garbageValue = "-2126870226"
	)
	void method9518(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1646590208"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}
}
