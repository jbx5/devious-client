import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("Sound")
public class Sound {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1546624377
	)
	public int field2272;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -264194065
	)
	public int field2269;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 556845087
	)
	public int field2271;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1449503097
	)
	public int field2273;

	Sound(int var1, int var2, int var3, int var4) {
		this.field2272 = 0;
		this.field2269 = 0;
		this.field2271 = 0;
		this.field2273 = 0;
		this.field2272 = var1;
		this.field2269 = var2;
		this.field2271 = var3;
		this.field2273 = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lip;",
		garbageValue = "1554592530"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class202.SpotAnimationDefinition_archive.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lia;",
		garbageValue = "-1899271353"
	)
	public static FloorUnderlayDefinition method4179(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0);
			var1 = new FloorUnderlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
