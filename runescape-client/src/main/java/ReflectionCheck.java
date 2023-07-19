import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field273;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -519320301
	)
	@Export("id")
	int id;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -355719819
	)
	@Export("size")
	int size;
	@ObfuscatedName("ar")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("am")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("as")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("aj")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("ag")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("az")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)V",
		garbageValue = "-7"
	)
	public static void method697(AbstractArchive var0) {
		VarbitComposition.VarbitDefinition_archive = var0;
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "6"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var3 = class306.getTileHeight(var0, var1, class36.Client_plane) - var2;
			var0 -= class157.cameraX;
			var3 -= class384.cameraY;
			var1 -= SoundSystem.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[class19.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[class19.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[class456.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class456.cameraYaw];
			int var8 = var6 * var1 + var0 * var7 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var5 * var3 - var4 * var1 >> 16;
			var1 = var5 * var1 + var3 * var4 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
