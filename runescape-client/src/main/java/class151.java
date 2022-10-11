import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class class151 extends class129 {
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 223691319
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -999585671673813037L
	)
	long field1718;
	@ObfuscatedName("p")
	String field1717;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	final class132 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leo;)V"
	)
	class151(class132 var1) {
		this.this$0 = var1;
		this.field1718 = -1L; // L: 194
		this.field1717 = null; // L: 195
	} // L: 197

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "-41"
	)
	void vmethod3320(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1718 = var1.readLong(); // L: 202
		}

		this.field1717 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Led;I)V",
		garbageValue = "-538131930"
	)
	void vmethod3313(ClanSettings var1) {
		var1.method3110(this.field1718, this.field1717); // L: 208
	} // L: 209

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "1535323936"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return TaskHandler.method3422(var0, 10, true); // L: 35
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lkw;I[B[BI)V",
		garbageValue = "-1521993920"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3464 == null) { // L: 979
			if (var2 == null) { // L: 980
				return; // L: 986
			}

			var0.field3464 = new byte[11][]; // L: 981
			var0.field3475 = new byte[11][]; // L: 982
			var0.field3417 = new int[11]; // L: 983
			var0.field3477 = new int[11]; // L: 984
		}

		var0.field3464[var1] = var2; // L: 988
		if (var2 != null) {
			var0.field3395 = true; // L: 989
		} else {
			var0.field3395 = false; // L: 991

			for (int var4 = 0; var4 < var0.field3464.length; ++var4) { // L: 992
				if (var0.field3464[var4] != null) { // L: 993
					var0.field3395 = true; // L: 994
					break;
				}
			}
		}

		var0.field3475[var1] = var3; // L: 999
	} // L: 1000
}
