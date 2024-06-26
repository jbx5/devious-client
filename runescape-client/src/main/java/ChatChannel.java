import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("dk")
	static boolean field1030;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("rk")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lck;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -89644527
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)Lck;",
		garbageValue = "-11369"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99];

		for (int var6 = this.count; var6 > 0; --var6) {
			if (var6 != 100) {
				this.messages[var6] = this.messages[var6 - 1];
			}
		}

		if (var5 == null) {
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove();
			var5.removeDual();
			var5.set(var1, var2, var4, var3);
		}

		this.messages[0] = var5;
		if (this.count < 100) {
			++this.count;
		}

		return var5;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lck;",
		garbageValue = "650895180"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "85"
	)
	@Export("size")
	int size() {
		return this.count;
	}
}
