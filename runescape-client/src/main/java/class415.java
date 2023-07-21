import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
public class class415 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1913054619"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class213.addChatMessage(var0, var1, var2, (String)null);
	}
}
