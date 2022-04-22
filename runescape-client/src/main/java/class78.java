import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
public class class78 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lfs;", garbageValue = 
	"124")

	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = ((EnumComposition) (EnumComposition.EnumDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-39348286")

	static void method2081(int var0) {
		ItemContainer var1 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"(IZIB)V", garbageValue = 
	"2")

	public static final void method2082(int var0, boolean var1, int var2) {
		if ((var0 >= 8000) && (var0 <= 48000)) {
			PcmPlayer.field268 = var0;
			PcmPlayer.PcmPlayer_stereo = var1;
			PcmPlayer.field295 = var2;
		} else {
			throw new IllegalArgumentException();
		}
	}
}