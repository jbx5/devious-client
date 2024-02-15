import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "[Lvd;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("ui")
	@ObfuscatedGetter(
		intValue = 330495129
	)
	static int field1045;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lcy;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1578030201
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcy;",
		garbageValue = "-677760097"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lcy;",
		garbageValue = "-48"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	@Export("size")
	int size() {
		return this.count;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lun;II)V",
		garbageValue = "1624657620"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		class198.method3835(var0);

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) {
			int var4 = Players.Players_pendingUpdateIndices[var3];
			Player var5 = Client.players[var4];
			int var6 = var0.readUnsignedByte();
			if ((var6 & 16) != 0) {
				var6 += var0.readUnsignedByte() << 8;
			}

			if ((var6 & 2048) != 0) {
				var6 += var0.readUnsignedByte() << 16;
			}

			GameBuild.method6999(var0, var4, var5, var6);
		}

		if (var0.offset - var2 != var1) {
			throw new RuntimeException(var0.offset - var2 + " " + var1);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-361858122"
	)
	static void method2249() {
		MenuAction.otp.trim();
		if (MenuAction.otp.length() != 6) {
			SecureUrlRequester.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
		} else {
			class36.otpMedium = Integer.parseInt(MenuAction.otp);
			MenuAction.otp = "";
			ScriptEvent.setAuthenticationScheme(true);
			SecureUrlRequester.setLoginResponseString("", "Connecting to server...", "");
			Interpreter.updateGameState(20);
		}
	}
}
