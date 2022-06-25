import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fc")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -698923257)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	InvDefinition() {
		this.size = 0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqt;B)V", garbageValue = "23")
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.decodeNext(var1, var2);
		} 
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqt;II)V", garbageValue = "-706548236")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ldo;FZI)F", garbageValue = "21178512")
	static float method3349(class117 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method2709() != 0) {
			float var4 = ((float) (var0.field1462[0].field1420));
			float var5 = ((float) (var0.field1462[var0.method2709() - 1].field1420));
			float var6 = var5 - var4;
			if (((double) (var6)) == 0.0) {
				return var0.field1462[0].field1423;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}
				double var8 = ((double) ((int) (var7)));
				float var10 = Math.abs(((float) (((double) (var7)) - var8)));
				float var11 = var10 * var6;
				var8 = Math.abs(var8 + 1.0);
				double var12 = var8 / 2.0;
				double var14 = ((double) ((int) (var12)));
				var10 = ((float) (var12 - var14));
				float var16;
				float var17;
				if (var2) {
					if (var0.field1468 == class116.field1454) {
						if (0.0 != ((double) (var10))) {
							var11 += var4;
						} else {
							var11 = var5 - var11;
						}
					} else if (var0.field1468 != class116.field1450 && var0.field1468 != class116.field1453) {
						if (var0.field1468 == class116.field1451) {
							var11 = var4 - var1;
							var16 = var0.field1462[0].field1421;
							var17 = var0.field1462[0].field1422;
							var3 = var0.field1462[0].field1423;
							if (0.0 != ((double) (var16))) {
								var3 -= var17 * var11 / var16;
							}
							return var3;
						}
					} else {
						var11 = var5 - var11;
					}
				} else if (var0.field1461 == class116.field1454) {
					if (0.0 != ((double) (var10))) {
						var11 = var5 - var11;
					} else {
						var11 += var4;
					}
				} else if (var0.field1461 != class116.field1450 && var0.field1461 != class116.field1453) {
					if (var0.field1461 == class116.field1451) {
						var11 = var1 - var5;
						var16 = var0.field1462[var0.method2709() - 1].field1419;
						var17 = var0.field1462[var0.method2709() - 1].field1425;
						var3 = var0.field1462[var0.method2709() - 1].field1423;
						if (0.0 != ((double) (var16))) {
							var3 += var11 * var17 / var16;
						}
						return var3;
					}
				} else {
					var11 += var4;
				}
				var3 = WorldMapSection0.method4918(var0, var11);
				float var18;
				if (var2 && var0.field1468 == class116.field1453) {
					var18 = var0.field1462[var0.method2709() - 1].field1423 - var0.field1462[0].field1423;
					var3 = ((float) (((double) (var3)) - var8 * ((double) (var18))));
				} else if (!var2 && var0.field1461 == class116.field1453) {
					var18 = var0.field1462[var0.method2709() - 1].field1423 - var0.field1462[0].field1423;
					var3 = ((float) (((double) (var3)) + ((double) (var18)) * var8));
				}
				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = "(Lpv;I)Ljava/lang/Object;", garbageValue = "558019675")
	static Object method3360(class432 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch (var0.field4660) {
				case 0 :
					return Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				case 2 :
					return Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				default :
					throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(descriptor = "(IIIB)V", garbageValue = "2")
	static final void method3358(int var0, int var1, int var2) {
		if (class18.cameraX < var0) {
			class18.cameraX = (var0 - class18.cameraX) * UserComparator3.field1391 / 1000 + class18.cameraX + PlayerComposition.field3346;
			if (class18.cameraX > var0) {
				class18.cameraX = var0;
			}
		}
		if (class18.cameraX > var0) {
			class18.cameraX -= (class18.cameraX - var0) * UserComparator3.field1391 / 1000 + PlayerComposition.field3346;
			if (class18.cameraX < var0) {
				class18.cameraX = var0;
			}
		}
		if (class16.cameraY < var1) {
			class16.cameraY = (var1 - class16.cameraY) * UserComparator3.field1391 / 1000 + class16.cameraY + PlayerComposition.field3346;
			if (class16.cameraY > var1) {
				class16.cameraY = var1;
			}
		}
		if (class16.cameraY > var1) {
			class16.cameraY -= (class16.cameraY - var1) * UserComparator3.field1391 / 1000 + PlayerComposition.field3346;
			if (class16.cameraY < var1) {
				class16.cameraY = var1;
			}
		}
		if (class228.cameraZ < var2) {
			class228.cameraZ = (var2 - class228.cameraZ) * UserComparator3.field1391 / 1000 + class228.cameraZ + PlayerComposition.field3346;
			if (class228.cameraZ > var2) {
				class228.cameraZ = var2;
			}
		}
		if (class228.cameraZ > var2) {
			class228.cameraZ -= (class228.cameraZ - var2) * UserComparator3.field1391 / 1000 + PlayerComposition.field3346;
			if (class228.cameraZ < var2) {
				class228.cameraZ = var2;
			}
		}
	}
}