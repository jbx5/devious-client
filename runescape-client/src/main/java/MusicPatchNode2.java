import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("rs")
	@ObfuscatedSignature(descriptor = 
	"Lql;")

	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(intValue = 
	-631116799)

	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("v")
	byte[] field3165;
	@ObfuscatedName("o")
	byte[] field3162;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	1461465763)

	int field3164;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	-1955861837)

	int field3168;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	45595669)

	int field3163;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	1235565489)

	int field3173;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	-1278953517)

	int field3171;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	1566400781)

	int field3169;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	798353979)

	int field3170;

	MusicPatchNode2() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IS)Z", garbageValue = 
	"-26373")

	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return (((((((var0 == 10) || (var0 == 11)) || (var0 == 12)) || (var0 == 13)) || (var0 == 14)) || (var0 == 15)) || (var0 == 16)) || (var0 == 17);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(IS)Z", garbageValue = 
	"5194")

	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (Frames.Widget_loadedInterfaces[var0]) {
			return true;
		} else if (!class122.Widget_archive.tryLoadGroup(var0)) {
			return false;
		} else {
			int var1 = class122.Widget_archive.getGroupFileCount(var0);
			if (var1 == 0) {
				Frames.Widget_loadedInterfaces[var0] = true;
				return true;
			} else {
				if (EnumComposition.Widget_interfaceComponents[var0] == null) {
					EnumComposition.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) {
					if (EnumComposition.Widget_interfaceComponents[var0][var2] == null) {
						byte[] var3 = class122.Widget_archive.takeFile(var0, var2);
						if (var3 != null) {
							EnumComposition.Widget_interfaceComponents[var0][var2] = new Widget();
							EnumComposition.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
							if (var3[0] == (-1)) {
								EnumComposition.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								EnumComposition.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
							}
						}
					}
				}

				Frames.Widget_loadedInterfaces[var0] = true;
				return true;
			}
		}
	}
}