import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
public class class411 {
	@ObfuscatedName("wf")
	@ObfuscatedGetter(
		longValue = -3139176952693499925L
	)
	static long field4526;
	@ObfuscatedName("ac")
	public char field4523;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2110307635
	)
	public int field4524;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 402832077
	)
	public int field4525;

	class411() {
		this.field4524 = 0;
		this.field4525 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "56"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class164.addChatMessage(var0, var1, var2, (String)null);
	}
}
