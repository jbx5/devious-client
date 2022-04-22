import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("q")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	900847361)

	public int field4246;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lqb;")

	@Export("username")
	public Username username;
	@ObfuscatedName("i")
	@Export("world")
	public short world;

	@ObfuscatedSignature(descriptor = 
	"(Lqb;I)V")

	FriendLoginUpdate(Username var1, int var2) {
		this.field4246 = ((int) (class136.method2931() / 1000L));
		this.username = var1;
		this.world = ((short) (var2));
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-635847249")

	public static void method6685() {
		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var0 = 0; var0 < JagexCache.idxCount; ++var0) {
				class115.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(descriptor = 
	"(Lky;I)Lky;", garbageValue = 
	"177537571")

	static Widget method6686(Widget var0) {
		Widget var2 = var0;
		int var3 = Players.method2420(class326.getWidgetFlags(var0));
		Widget var1;
		if (var3 == 0) {
			var1 = null;
		} else {
			int var4 = 0;

			while (true) {
				if (var4 >= var3) {
					var1 = var2;
					break;
				}

				var2 = class127.getWidget(var2.parentId);
				if (var2 == null) {
					var1 = null;
					break;
				}

				++var4;
			} 
		}

		Widget var5 = var1;
		if (var1 == null) {
			var5 = var0.parent;
		}

		return var5;
	}
}