import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1101640601
	)
	@Export("SpriteBuffer_spriteWidth")
	public static int SpriteBuffer_spriteWidth;

	SecureRandomCallable() {
	} // L: 36

	public Object call() {
		return class271.method5377(); // L: 46
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Lpl;",
		garbageValue = "1045421766"
	)
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0); // L: 24
		if (var1 != null) { // L: 25
			return var1;
		} else {
			byte[] var2 = DbRowType.field4718.takeFile(38, var0); // L: 26
			var1 = new DbRowType(); // L: 27
			if (var2 != null) { // L: 28
				var1.method7830(new Buffer(var2));
			}

			var1.method7829(); // L: 29
			DbRowType.DBRowType_cache.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1277193517"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1892
		Login.Login_response2 = var1; // L: 1893
		Login.Login_response3 = var2; // L: 1894
	} // L: 1895

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "1555404404"
	)
	static int method2206(int var0, Script var1, boolean var2) {
		if (var0 == 7463) { // L: 4463
			boolean var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4464
			class12.method164(var3); // L: 4465
			return 1; // L: 4466
		} else {
			return 2; // L: 4468
		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "699416183"
	)
	static String method2205(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 12052
		if (Client.gameBuild == 1) { // L: 12053
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 12054
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 12055
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 12056
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 12057
			var0 = "local";
		}

		String var3 = ""; // L: 12058
		if (AttackOption.field1279 != null) { // L: 12059
			var3 = "/p=" + AttackOption.field1279;
		}

		String var4 = "runescape.com"; // L: 12060
		return var2 + var0 + "." + var4 + "/l=" + class271.clientLanguage + "/a=" + UserComparator10.field1393 + var3 + "/"; // L: 12061
	}
}
