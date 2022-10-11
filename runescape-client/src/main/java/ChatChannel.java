import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("uo")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("u")
	static int[][][] field996;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "[Lqu;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lbj;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 561519127
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 88
	} // L: 91

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbj;",
		garbageValue = "14"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 94

		for (int var6 = this.count; var6 > 0; --var6) { // L: 95
			if (var6 != 100) { // L: 96
				this.messages[var6] = this.messages[var6 - 1]; // L: 97
			}
		}

		if (var5 == null) { // L: 99
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 101
			var5.removeDual(); // L: 102
			var5.set(var1, var2, var4, var3); // L: 103
		}

		this.messages[0] = var5; // L: 105
		if (this.count < 100) { // L: 106
			++this.count;
		}

		return var5; // L: 107
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Lbj;",
		garbageValue = "-2032102999"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 111 112
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("size")
	int size() {
		return this.count; // L: 116
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqr;",
		garbageValue = "0"
	)
	public static PrivateChatMode method2146(int var0) {
		PrivateChatMode[] var1 = class10.method106(); // L: 20

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 21
			PrivateChatMode var3 = var1[var2]; // L: 22
			if (var0 == var3.field4853) { // L: 24
				return var3;
			}
		}

		return null; // L: 28
	}
}
