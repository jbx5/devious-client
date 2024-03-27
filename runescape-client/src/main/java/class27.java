import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
public class class27 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("cq")
	@Export("otp")
	static String otp;
	@ObfuscatedName("ab")
	int[] field121;
	@ObfuscatedName("aw")
	int[] field118;

	public class27() {
		this.field121 = new int[112];
		this.field118 = new int[192];
		Arrays.fill(this.field121, 3);
		Arrays.fill(this.field118, 3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "5000268"
	)
	public void method396(int var1, int var2) {
		if (this.method372(var1) && this.method361(var2)) {
			this.field121[var1] = var2;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "-1060120672"
	)
	public void method402(char var1, int var2) {
		if (this.method371(var1) && this.method361(var2)) {
			this.field118[var1] = var2;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "3"
	)
	public int method364(int var1) {
		return this.method372(var1) ? this.field121[var1] : 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CB)I",
		garbageValue = "-90"
	)
	public int method379(char var1) {
		return this.method371(var1) ? this.field118[var1] : 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1831477201"
	)
	public boolean method366(int var1) {
		return this.method372(var1) && (this.field121[var1] == 1 || this.field121[var1] == 3);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "907464497"
	)
	public boolean method367(char var1) {
		return this.method371(var1) && (this.field118[var1] == 1 || this.field118[var1] == 3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "46"
	)
	public boolean method368(int var1) {
		return this.method372(var1) && (this.field121[var1] == 2 || this.field121[var1] == 3);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1220370851"
	)
	public boolean method365(char var1) {
		return this.method371(var1) && (this.field118[var1] == 2 || this.field118[var1] == 3);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "32"
	)
	boolean method372(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "67"
	)
	boolean method371(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1181765278"
	)
	boolean method361(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "670557189"
	)
	public static byte[] method401(CharSequence var0) {
		int var1 = var0.length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		return var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lto;ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "0"
	)
	static String method400(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "21"
	)
	public static void method362() {
		DbRowType.DBRowType_cache.clear();
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "596339197"
	)
	@Export("setAuthenticationScheme")
	static final void setAuthenticationScheme(boolean var0) {
		if (var0) {
			Client.authenticationScheme = Login.rememberUsername ? AuthenticationScheme.TOKEN_REMEMBER : AuthenticationScheme.TOKEN;
		} else {
			Client.authenticationScheme = NPC.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
		}

	}
}
