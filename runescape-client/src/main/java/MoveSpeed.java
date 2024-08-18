import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("MoveSpeed")
public enum MoveSpeed implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field2982((byte)-1, 0.0F),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field2987((byte)0, 0.5F),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field2983((byte)1, 1.0F),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field2984((byte)2, 2.0F),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field2985((byte)3, 1.5F),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field2986((byte)4, 2.5F),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field2991((byte)5, 3.0F),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field2981((byte)6, 3.5F),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	field2988((byte)7, 4.0F);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lko;"
	)
	public static MoveSpeed[] field2992;
	@ObfuscatedName("av")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("ad")
	@Export("id")
	public final byte id;
	@ObfuscatedName("aq")
	@Export("moveSpeed")
	public final float moveSpeed;

	static {
		MoveSpeed[] var0 = new MoveSpeed[]{field2986, field2988, field2991, field2982, field2983, field2987, field2984, field2985, field2981};
		field2992 = var0;
		StringBuilder var4 = new StringBuilder();
		MoveSpeed[] var1 = field2992;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			MoveSpeed var3 = var1[var2];
			var4.append(var3.id);
			var4.append(", ");
		}

		String var5 = var4.toString();
		var5.substring(0, var5.length() - 2);
	}

	MoveSpeed(byte var3, float var4) {
		this.id = var3;
		this.moveSpeed = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Ldy;I)V",
		garbageValue = "1394066603"
	)
	static void method5484(WorldView var0) {
		for (int var1 = 0; var1 < var0.worldEntityCount; ++var1) {
			int var2 = var0.worldEntityIndices[var1];
			WorldEntity var3 = var0.worldEntities[var2];
			if (var3 != null) {
				var3.updateMovement();
			}
		}

	}
}
