import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enum
{
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	field1970(2, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	field1972(1, 2);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1916743455
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1795857937
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnt;",
		garbageValue = "1599103276"
	)
	public static StudioGame[] method3755() {
		return new StudioGame[]{StudioGame.game5, StudioGame.stellardawn, StudioGame.oldscape, StudioGame.game3, StudioGame.runescape, StudioGame.game4};
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IS)Lhw;",
		garbageValue = "4625"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-2145020206"
	)
	static int method3753(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-52"
	)
	@Export("setAuthenticationScheme")
	static final void setAuthenticationScheme(boolean otp) {
		if (otp) {
			Client.authenticationScheme = Login.rememberUsername ? AuthenticationScheme.TOKEN_REMEMBER : AuthenticationScheme.TOKEN;
		} else {
			Client.authenticationScheme = WorldMapIcon_1.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
		}

	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-66"
	)
	static void method3756() {
		if (Client.oculusOrbState == 1) {
			Client.field585 = true;
		}

	}
}
