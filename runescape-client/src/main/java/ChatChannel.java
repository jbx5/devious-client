import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("vw")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static JagNetThread field1023;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = 1843303509
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lcn;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2014772997
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)Lcn;",
		garbageValue = "236"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lcn;",
		garbageValue = "1879054956"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "10766"
	)
	@Export("size")
	int size() {
		return this.count;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-3938"
	)
	public static void method2216() {
		class214.field2136.clear();
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lnt;Lnq;ZB)V",
		garbageValue = "-111"
	)
	public static void method2212(Widget var0, PlayerComposition var1, boolean var2) {
		var0.modelType = 7;
		var0.field3801 = new PlayerComposition(var1);
		if (!var2) {
			var0.field3801.equipment = Arrays.copyOf(var0.field3801.field3695, var0.field3801.field3695.length);
			var0.field3801.method6332();
		}

	}
}
