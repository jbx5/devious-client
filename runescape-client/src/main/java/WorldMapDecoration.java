import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ik")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "Lez;")
	static ClanSettings field2816;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -831845423)
	@Export("objectDefinitionId")
	final int objectDefinitionId;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 2055574461)
	@Export("decoration")
	final int decoration;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1905026631)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("o")
	public static final void method4967(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				Frames.method4305(var0 - 1L);
				Frames.method4305(1L);
			} else {
				Frames.method4305(var0);
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)Lgx;", garbageValue = "2023361213")
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = ((ObjectComposition) (ObjectComposition.ObjectDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}
			ObjectComposition.ObjectDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-1086866361")
	public static int method4969(int var0) {
		return class402.field4458[var0 & 16383];
	}
}