import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class137 extends DualNode {
	@ObfuscatedName("ap")
	public static ThreadPoolExecutor field1625;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 296985237
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1090891029
	)
	int field1628;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[[Lfh;"
	)
	public class130[][] field1627;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[[Lfh;"
	)
	class130[][] field1621;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	public Skeleton field1622;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -354796061
	)
	int field1623;
	@ObfuscatedName("ai")
	boolean field1631;
	@ObfuscatedName("aa")
	Future field1626;
	@ObfuscatedName("af")
	List field1620;

	@ObfuscatedSignature(
		descriptor = "(Lnu;Lnu;IZ)V",
		garbageValue = "0"
	)
	public class137(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1627 = null;
		this.field1621 = null;
		this.field1623 = 0;
		this.field1628 = var3;
		byte[] var5 = var1.takeFile(this.field1628 >> 16 & 65535, this.field1628 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9 = var2.getFile(var8, 0);
		this.field1622 = new Skeleton(var8, var9);
		this.field1620 = new ArrayList();
		this.field1626 = field1625.submit(new class134(this, var6, var7));
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;IB)V",
		garbageValue = "100"
	)
	void method3057(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1623 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1621 = new class130[this.field1622.method4517().method4461()][];
		this.field1627 = new class130[this.field1622.method4520()][];
		class129[] var4 = new class129[var3];

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) {
			var7 = var1.readUnsignedByte();
			class131 var16 = (class131)KeyHandler.findEnumerated(WorldMapSprite.method5482(), var7);
			if (var16 == null) {
				var16 = class131.field1578;
			}

			var9 = var1.readShortSmart();
			int var11 = var1.readUnsignedByte();
			class132[] var12 = new class132[]{class132.field1588, class132.field1584, class132.field1585, class132.field1586, class132.field1592, class132.field1604, class132.field1589, class132.field1590, class132.field1601, class132.field1594, class132.field1593, class132.field1591, class132.field1595, class132.field1587, class132.field1597, class132.field1598, class132.field1599};
			class132 var13 = (class132)KeyHandler.findEnumerated(var12, var11);
			if (var13 == null) {
				var13 = class132.field1588;
			}

			class130 var20 = new class130();
			var20.method2992(var1, var2);
			var4[var5] = new class129(this, var20, var16, var13, var9);
			int var14 = var16.method3025();
			class130[][] var15;
			if (var16 == class131.field1581) {
				var15 = this.field1621;
			} else {
				var15 = this.field1627;
			}

			if (var15[var9] == null) {
				var15[var9] = new class130[var14];
			}

			if (var16 == class131.field1577) {
				this.field1631 = true;
			}
		}

		var5 = var3 / class291.field3100;
		int var6 = var3 % class291.field3100;
		int var8 = 0;

		for (var9 = 0; var9 < class291.field3100; ++var9) {
			var7 = var8;
			var8 += var5;
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var8 == var7) {
				break;
			}

			this.field1620.add(field1625.submit(new class136(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1948814782"
	)
	public boolean method3068() {
		if (this.field1626 == null && this.field1620 == null) {
			return true;
		} else {
			if (this.field1626 != null) {
				if (!this.field1626.isDone()) {
					return false;
				}

				this.field1626 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1620.size(); ++var2) {
				if (!((Future)this.field1620.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1620.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1620 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1976853081"
	)
	public int method3059() {
		return this.field1623;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1397730419"
	)
	public boolean method3060() {
		return this.field1631;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILeo;IIB)V",
		garbageValue = "-98"
	)
	public void method3061(int var1, class127 var2, int var3, int var4) {
		class450 var5;
		synchronized(class450.field4737) {
			if (class462.field4778 == 0) {
				var5 = new class450();
			} else {
				class450.field4737[--class462.field4778].method8194();
				var5 = class450.field4737[class462.field4778];
			}
		}

		this.method3056(var5, var3, var2, var1);
		this.method3066(var5, var3, var2, var1);
		this.method3063(var5, var3, var2, var1);
		var2.method2947(var5);
		var5.method8235();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lrz;ILeo;II)V",
		garbageValue = "1937438486"
	)
	void method3056(class450 var1, int var2, class127 var3, int var4) {
		float[] var5 = var3.method2952(this.field1623);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1621[var2] != null) {
			class130 var9 = this.field1621[var2][0];
			class130 var10 = this.field1621[var2][1];
			class130 var11 = this.field1621[var2][2];
			if (var9 != null) {
				var6 = var9.method2994(var4);
			}

			if (var10 != null) {
				var7 = var10.method2994(var4);
			}

			if (var11 != null) {
				var8 = var11.method2994(var4);
			}
		}

		class449 var17 = Login.method2085();
		var17.method8163(1.0F, 0.0F, 0.0F, var6);
		class449 var18 = Login.method2085();
		var18.method8163(0.0F, 1.0F, 0.0F, var7);
		class449 var19 = Login.method2085();
		var19.method8163(0.0F, 0.0F, 1.0F, var8);
		class449 var12 = Login.method2085();
		var12.method8165(var19);
		var12.method8165(var17);
		var12.method8165(var18);
		class450 var13;
		synchronized(class450.field4737) {
			if (class462.field4778 == 0) {
				var13 = new class450();
			} else {
				class450.field4737[--class462.field4778].method8194();
				var13 = class450.field4737[class462.field4778];
			}
		}

		var13.method8240(var12);
		var1.method8237(var13);
		var17.method8180();
		var18.method8180();
		var19.method8180();
		var12.method8180();
		var13.method8235();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrz;ILeo;II)V",
		garbageValue = "1689339528"
	)
	void method3063(class450 var1, int var2, class127 var3, int var4) {
		float[] var5 = var3.method2953(this.field1623);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1621[var2] != null) {
			class130 var9 = this.field1621[var2][3];
			class130 var10 = this.field1621[var2][4];
			class130 var11 = this.field1621[var2][5];
			if (var9 != null) {
				var6 = var9.method2994(var4);
			}

			if (var10 != null) {
				var7 = var10.method2994(var4);
			}

			if (var11 != null) {
				var8 = var11.method2994(var4);
			}
		}

		var1.field4739[12] = var6;
		var1.field4739[13] = var7;
		var1.field4739[14] = var8;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrz;ILeo;II)V",
		garbageValue = "-2003285459"
	)
	void method3066(class450 var1, int var2, class127 var3, int var4) {
		float[] var5 = var3.method2954(this.field1623);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1621[var2] != null) {
			class130 var9 = this.field1621[var2][6];
			class130 var10 = this.field1621[var2][7];
			class130 var11 = this.field1621[var2][8];
			if (var9 != null) {
				var6 = var9.method2994(var4);
			}

			if (var10 != null) {
				var7 = var10.method2994(var4);
			}

			if (var11 != null) {
				var8 = var11.method2994(var4);
			}
		}

		class450 var14;
		synchronized(class450.field4737) {
			if (class462.field4778 == 0) {
				var14 = new class450();
			} else {
				class450.field4737[--class462.field4778].method8194();
				var14 = class450.field4737[class462.field4778];
			}
		}

		var14.method8198(var6, var7, var8);
		var1.method8237(var14);
		var14.method8235();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-7280279"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class529.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class529.SpriteBuffer_xOffsets = new int[class529.SpriteBuffer_spriteCount];
		class152.SpriteBuffer_yOffsets = new int[class529.SpriteBuffer_spriteCount];
		HealthBarUpdate.SpriteBuffer_spriteWidths = new int[class529.SpriteBuffer_spriteCount];
		SpriteMask.SpriteBuffer_spriteHeights = new int[class529.SpriteBuffer_spriteCount];
		Coord.SpriteBuffer_pixels = new byte[class529.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class529.SpriteBuffer_spriteCount * 8;
		class529.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class420.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class529.SpriteBuffer_spriteCount; ++var3) {
			class529.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class529.SpriteBuffer_spriteCount; ++var3) {
			class152.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class529.SpriteBuffer_spriteCount; ++var3) {
			HealthBarUpdate.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class529.SpriteBuffer_spriteCount; ++var3) {
			SpriteMask.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class529.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		DbTableType.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			DbTableType.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (DbTableType.SpriteBuffer_spritePalette[var3] == 0) {
				DbTableType.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class529.SpriteBuffer_spriteCount; ++var3) {
			int var4 = HealthBarUpdate.SpriteBuffer_spriteWidths[var3];
			int var5 = SpriteMask.SpriteBuffer_spriteHeights[var3];
			int var6 = var4 * var5;
			byte[] var7 = new byte[var6];
			Coord.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var4 * var10] = var1.readByte();
					}
				}
			}
		}

	}
}
