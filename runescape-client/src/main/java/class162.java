import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class162 extends class166 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	@Export("worldView")
	static WorldView worldView;
	@ObfuscatedName("ac")
	String field1795;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 904218063
	)
	int field1794;
	@ObfuscatedName("ag")
	byte field1793;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgj;)V"
	)
	class162(class167 var1) {
		this.this$0 = var1;
		this.field1795 = null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "0"
	)
	void vmethod3761(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1795 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1794 = var1.readUnsignedShort();
		this.field1793 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgm;I)V",
		garbageValue = "-1593238865"
	)
	void vmethod3762(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1795);
		var2.world = this.field1794;
		var2.rank = this.field1793;
		var1.addMember(var2);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "2058281313"
	)
	public static String method3641(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; ++var4) {
			char var5 = var0.charAt(var4);
			if (var3 == 0) {
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) {
				var5 = ModelData0.method5515(var5);
			}

			if (Character.isLetter(var5)) {
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') {
				if (Character.isSpaceChar(var5)) {
					if (var3 != 2) {
						var3 = 1;
					}
				} else {
					var3 = 1;
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5;
		}

		return new String(var2);
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	@Export("setAuthenticationScheme")
	static final void setAuthenticationScheme(boolean var0) {
		if (var0) {
			Client.authenticationScheme = Login.rememberUsername ? AuthenticationScheme.TOKEN_REMEMBER : AuthenticationScheme.TOKEN;
		} else {
			Client.authenticationScheme = class461.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
		}

	}
}
