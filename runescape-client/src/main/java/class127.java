import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
public class class127 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 300976639
	)
	int field1501;
	@ObfuscatedName("aw")
	float field1500;
	@ObfuscatedName("al")
	float field1503;
	@ObfuscatedName("ai")
	float field1502;
	@ObfuscatedName("ar")
	float field1499;
	@ObfuscatedName("as")
	float field1506;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	class127 field1505;

	class127() {
		this.field1503 = Float.MAX_VALUE;
		this.field1502 = Float.MAX_VALUE;
		this.field1499 = Float.MAX_VALUE;
		this.field1506 = Float.MAX_VALUE;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "-1382456271"
	)
	void method2994(Buffer var1, int var2) {
		this.field1501 = var1.readShort();
		this.field1500 = var1.method9481();
		this.field1503 = var1.method9481();
		this.field1502 = var1.method9481();
		this.field1499 = var1.method9481();
		this.field1506 = var1.method9481();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lhe;",
		garbageValue = "-1080781222"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
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

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Z",
		garbageValue = "72"
	)
	static final boolean method2999(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;

		label71:
		while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;

			while (true) {
				int var9;
				while (!var8) {
					var9 = var4.readUShortSmart();
					if (var9 == 0) {
						continue label71;
					}

					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = var7 >> 6 & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
						ObjectComposition var15 = getObjectDefinition(var5);
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field621;
								var3 = false;
							}

							var8 = true;
						}
					}
				}

				var9 = var4.readUShortSmart();
				if (var9 == 0) {
					break;
				}

				var4.readUnsignedByte();
			}
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1602956230"
	)
	static int method2998(int var0, int var1) {
		int var2 = var1 - 334;
		if (var2 < 0) {
			var2 = 0;
		} else if (var2 > 100) {
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight;
		return var0 * var3 / 256;
	}
}
