import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
public class class301 {
	@ObfuscatedName("br")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	static GameBuild field3545;
	static 
	{
		Math.sqrt(8192.0);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", garbageValue = 
	"1793224392")

	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = ((ChatChannel) (Messages.Messages_channels.get(var0)));
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, ((long) (var5.count)));
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}
}