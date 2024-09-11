import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("ac")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("ae")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("ag")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;

	static {
		FileSystem_hasPermissions = false;
		FileSystem_cacheFiles = new Hashtable(16);
	}

	@ObfuscatedName("ac")
	public static final void method4499(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				class337.method6699(var0 - 1L);
				class337.method6699(1L);
			} else {
				class337.method6699(var0);
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljava/lang/String;",
		garbageValue = "2029419864"
	)
	@Export("base64Encode")
	public static String base64Encode(byte[] var0) {
		int var2 = var0.length;
		StringBuilder var3 = new StringBuilder();

		for (int var4 = 0; var4 < var2 + 0; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class417.field4695[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class417.field4695[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class417.field4695[(var6 & 15) << 2 | var7 >>> 6]).append(class417.field4695[var7 & 63]);
				} else {
					var3.append(class417.field4695[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class417.field4695[(var5 & 3) << 4]).append("==");
			}
		}

		String var1 = var3.toString();
		return var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	public static boolean method4494() {
		return !class334.field3619.isEmpty();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lny;I)I",
		garbageValue = "-904907491"
	)
	static int method4500(Widget var0) {
		if (var0.type != 11) {
			--class465.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var0.method7258(var1);
			return 1;
		}
	}
}
