import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("ub")
	@ObfuscatedSignature(descriptor = 
	"Lll;")

	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("tx")
	@ObfuscatedGetter(intValue = 
	-1200671157)

	static int field250;
	@ObfuscatedName("y")
	@Export("operatingSystemName")
	public static String operatingSystemName;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(descriptor = 
	"Llu;")

	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	408894777)

	@Export("id")
	int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-416838537)

	@Export("size")
	int size;
	@ObfuscatedName("h")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("g")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("l")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("n")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("d")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("f")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;Ljava/lang/String;ZB)Lpr;", garbageValue = 
	"-28")

	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(VertexNormal.cacheDir, ("preferences" + var0) + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (SecureRandomFuture.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (SecureRandomFuture.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(class230.userHomeDirectory, (((("jagex_" + var1) + "_preferences") + var0) + var4) + ".dat");
		AccessFile var6;
		if ((!var2) && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1964601703")

	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(descriptor = 
	"(II)Ljava/lang/String;", garbageValue = 
	"16916013")

	static String method637(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? (Client.menuActions[var0] + " ") + Client.menuTargets[var0] : Client.menuActions[var0];
		}
	}
}