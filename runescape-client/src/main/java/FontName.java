import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("us")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1679610619
	)
	static int field5315;
	@ObfuscatedName("as")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lda;",
		garbageValue = "1570207647"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = class318.method6509(var1, var0);
		Script var4 = class228.getScript(var3, var0);
		if (var4 != null) {
			return var4;
		} else {
			var3 = class544.method9936(var2, var0);
			var4 = class228.getScript(var3, var0);
			if (var4 != null) {
				return var4;
			} else {
				var3 = Tiles.method2520(var0);
				var4 = class228.getScript(var3, var0);
				return var4 != null ? var4 : null;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIZI)Ljava/lang/String;",
		garbageValue = "26331887"
	)
	static String method9733(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			if (var2 && var0 >= 0) {
				int var3 = 2;

				for (int var4 = var0 / var1; var4 != 0; ++var3) {
					var4 /= var1;
				}

				char[] var5 = new char[var3];
				var5[0] = '+';

				for (int var6 = var3 - 1; var6 > 0; --var6) {
					int var7 = var0;
					var0 /= var1;
					int var8 = var7 - var0 * var1;
					if (var8 >= 10) {
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48);
					}
				}

				return new String(var5);
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-7998461"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!Projectile.client.containsAccessAndRefreshToken() && !Projectile.client.otlTokenRequesterInitialized() && !Projectile.client.containsSessionAndCharacterId()) {
			Login.Login_response1 = "";
			Login.Login_response2 = "Enter your username/email & password.";
			Login.Login_response3 = "";
			class6.method43(2);
			if (var0) {
				Login.Login_password = "";
			}

			class362.method7457();
			class96.focusPasswordWhenUsernameFilled();
		} else {
			class6.method43(10);
		}
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "19607"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (PendingSpawn.friendsChat != null) {
			PacketBufferNode var1 = class113.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(World.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
