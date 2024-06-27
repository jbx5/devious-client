import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class155 extends class163 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1796418191
	)
	int field1743;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	final class164 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgi;)V"
	)
	class155(class164 var1) {
		this.this$0 = var1;
		this.field1743 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-1435141567"
	)
	void vmethod3524(Buffer var1) {
		this.field1743 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgj;I)V",
		garbageValue = "902480534"
	)
	void vmethod3523(ClanChannel var1) {
		var1.removeMember(this.field1743);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1749388721"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!class415.client.containsAccessAndRefreshToken() && !class415.client.otlTokenRequesterInitialized() && !class415.client.containsSessionAndCharacterId()) {
			Login.Login_response1 = "";
			Login.Login_response2 = "Enter your username/email & password.";
			Login.Login_response3 = "";
			class163.updateLoginIndex(2);
			if (var0) {
				Login.Login_password = "";
			}

			if (Login.Login_username == null || Login.Login_username.length() <= 0) {
				if (class105.clientPreferences.getRememberedUsername() != null) {
					Login.Login_username = class105.clientPreferences.getRememberedUsername();
					Client.Login_isUsernameRemembered = true;
				} else {
					Client.Login_isUsernameRemembered = false;
				}
			}

			UserComparator4.focusPasswordWhenUsernameFilled();
		} else {
			class163.updateLoginIndex(10);
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-45"
	)
	static int method3324(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)Z",
		garbageValue = "-767698753"
	)
	static final boolean method3331(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method6558(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.method6544(0);
			}

			if (var1 == 325) {
				Client.playerAppearance.method6544(1);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = class170.getPacketBufferNode(ClientPacket.field3299, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
