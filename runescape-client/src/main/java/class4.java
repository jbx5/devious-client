import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
public final class class4 {
	@ObfuscatedName("ax")
	static byte[][][] field6;

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIS)Lci;",
		garbageValue = "24757"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Lcf;",
		garbageValue = "-41"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return class92.getNextWorldListWorld();
	}
}
