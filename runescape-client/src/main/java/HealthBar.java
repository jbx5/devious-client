import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("cn")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("ri")
	@ObfuscatedSignature(descriptor = "Len;")
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;

	@ObfuscatedName("cn")
	public static char field1258;

	@ObfuscatedName("nf")
	@ObfuscatedGetter(intValue = 1249602607)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lfe;")
	@Export("definition")
	HealthBarDefinition definition;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Llk;")
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(descriptor = "(Lfe;)V")
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque();
		this.definition = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "1392818075")
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null;
		int var6 = 0;
		for (HealthBarUpdate var7 = ((HealthBarUpdate) (this.updates.last())); var7 != null; var7 = ((HealthBarUpdate) (this.updates.previous()))) {
			++var6;
			if (var7.cycle == var1) {
				var7.set(var1, var2, var3, var4);
				return;
			}
			if (var7.cycle <= var1) {
				var5 = var7;
			}
		}
		if (var5 == null) {
			if (var6 < 4) {
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}
		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
			if (var6 >= 4) {
				this.updates.last().remove();
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IB)Lcp;", garbageValue = "14")
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = ((HealthBarUpdate) (this.updates.last()));
		if (var2 != null && var2.cycle <= var1) {
			for (HealthBarUpdate var3 = ((HealthBarUpdate) (this.updates.previous())); var3 != null && var3.cycle <= var1; var3 = ((HealthBarUpdate) (this.updates.previous()))) {
				var2.remove();
				var2 = var3;
			}
			if (this.definition.int5 + var2.cycleOffset + var2.cycle > var1) {
				return var2;
			} else {
				var2.remove();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1385237709")
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method6147();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ldo;[F[FI)V", garbageValue = "-1662385101")
	static void method2355(class117 var0, float[] var1, float[] var2) {
		if (var0 != null) {
			var0.field1464 = var1[0];
			float var3 = var1[3] - var1[0];
			float var4 = var2[3] - var2[0];
			float var5 = var1[1] - var1[0];
			float var6 = 0.0F;
			float var7 = 0.0F;
			if (0.0 != ((double) (var5))) {
				var6 = (var2[1] - var2[0]) / var5;
			}
			var5 = var1[3] - var1[2];
			if (((double) (var5)) != 0.0) {
				var7 = (var2[3] - var2[2]) / var5;
			}
			float var8 = 1.0F / (var3 * var3);
			float var9 = var3 * var6;
			float var10 = var3 * var7;
			var0.field1465[0] = (var10 + var9 - var4 - var4) * var8 / var3;
			var0.field1465[1] = (var4 + var4 + var4 - var9 - var9 - var10) * var8;
			var0.field1465[2] = var6;
			var0.field1465[3] = var2[0];
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;IZB)I", garbageValue = "9")
	static int method2356(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();
			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}
					if (var8 == '+') {
						continue;
					}
				}
				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}
					var10 = var8 - 'W';
				}
				if (var10 >= var1) {
					throw new NumberFormatException();
				}
				if (var3) {
					var10 = -var10;
				}
				int var9 = var10 + var5 * var1;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}
				var5 = var9;
				var4 = true;
			}
			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "1947801286")
	static final void method2349(int var0, int var1, int var2, int var3) {
		WorldMap.method7376();
	}
}