import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lct;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1477295507
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lct;",
		garbageValue = "1356260064"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lct;",
		garbageValue = "-1993736604"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-356178290"
	)
	@Export("size")
	int size() {
		return this.count;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Lve;",
		garbageValue = "19"
	)
	public static PrivateChatMode method2411(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field5566, PrivateChatMode.field5568, PrivateChatMode.field5569};
		PrivateChatMode[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			PrivateChatMode var4 = var2[var3];
			if (var0 == var4.field5567) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lfr;FI)F",
		garbageValue = "1227919828"
	)
	static float method2420(class137 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2 = var1 - var0.field1609;
			return var0.field1614 + var2 * ((var0.field1612 + var2 * var0.field1623) * var2 + var0.field1613);
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1554749265"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) {
			AbstractWorldMapIcon.method6257(0, 0);
		} else if (var0 != -1 && !FloorUnderlayDefinition.method4054(var0) && class461.clientPreferences.getMusicVolume() != 0) {
			ArrayList var1 = new ArrayList();
			var1.add(new MusicSong(HorizontalAlignment.archive6, var0, 0, class461.clientPreferences.getMusicVolume(), false));
			if (Client.playingJingle) {
				WorldMapIcon_1.method5778(var1, 0, 100, 100, 0);
			} else {
				class180.method3804(var1, 0, 100, 100, 0, false);
			}
		}

	}

	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method2418() {
		class461.clientPreferences.updateEULA(Client.field520);
	}
}
