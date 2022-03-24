import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("v")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-2033898479)

	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	1837760981)

	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("g")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	-601964039)

	static int field2577;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-914077727)

	static int field2581;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	-175114873)

	static int field2579;
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 
	755934233)

	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("p")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(descriptor = 
	"Llu;")

	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("go")
	@ObfuscatedSignature(descriptor = 
	"Lmr;")

	@Export("fontPlain12")
	static Font fontPlain12;
	static 
	{
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(CI)Z", garbageValue = 
	"2056272392")

	static final boolean method4463(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (NetFileRequest.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class422.field4564;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class422.field4562;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/io/File;Ljava/io/File;I)V", garbageValue = 
	"-1245654487")

	static void method4493(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(AccessFile.JagexCache_locationFile, "rw", 10000L);
			Buffer var3 = new Buffer(500);
			var3.writeByte(3);
			var3.writeByte(var1 != null ? 1 : 0);
			var3.writeCESU8(var0.getPath());
			if (var1 != null) {
				var3.writeCESU8("");
			}

			var2.write(var3.array, 0, var3.offset);
			var2.close();
		} catch (IOException var4) {
			var4.printStackTrace();
		}

	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"115")

	static final int method4492() {
		float var0 = 200.0F * (((float) (Interpreter.clientPreferences.method2266())) - 0.5F);
		return 100 - Math.round(var0);
	}
}