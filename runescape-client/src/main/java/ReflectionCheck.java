import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2051507171
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -50998507
	)
	@Export("size")
	int size;
	@ObfuscatedName("ak")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("aj")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("ai")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("ay")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("as")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("ae")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgk;",
		garbageValue = "115"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "820741693"
	)
	public static void method696() {
		VarbitComposition.VarbitDefinition_cached.clear();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1126256705"
	)
	static void method698() {
		class6.method43(24);
		class132.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1152739046"
	)
	static int method697() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field741;
		} else {
			return 10000;
		}
	}
}
