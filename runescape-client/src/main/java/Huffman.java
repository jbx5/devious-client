import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ji")
@Implements("Huffman")
public class Huffman {
	@ObfuscatedName("ro")
	@ObfuscatedSignature(descriptor = "Lno;")
	@Export("friendsChat")
	static FriendsChat friendsChat;

	@ObfuscatedName("c")
	@Export("masks")
	int[] masks;

	@ObfuscatedName("v")
	@Export("bits")
	byte[] bits;

	@ObfuscatedName("q")
	@Export("keys")
	int[] keys;

	public Huffman(byte[] var1) {
		int var2 = var1.length;
		this.masks = new int[var2];
		this.bits = var1;
		int[] var3 = new int[33];
		this.keys = new int[8];
		int var4 = 0;
		for (int var5 = 0; var5 < var2; ++var5) {
			byte var6 = var1[var5];
			if (var6 != 0) {
				int var7 = 1 << 32 - var6;
				int var8 = var3[var6];
				this.masks[var5] = var8;
				int var9;
				int var10;
				int var11;
				int var12;
				if ((var8 & var7) != 0) {
					var9 = var3[var6 - 1];
				} else {
					var9 = var8 | var7;
					for (var10 = var6 - 1; var10 >= 1; --var10) {
						var11 = var3[var10];
						if (var8 != var11) {
							break;
						}
						var12 = 1 << 32 - var10;
						if ((var11 & var12) != 0) {
							var3[var10] = var3[var10 - 1];
							break;
						}
						var3[var10] = var11 | var12;
					}
				}
				var3[var6] = var9;
				for (var10 = var6 + 1; var10 <= 32; ++var10) {
					if (var8 == var3[var10]) {
						var3[var10] = var9;
					}
				}
				var10 = 0;
				for (var11 = 0; var11 < var6; ++var11) {
					var12 = Integer.MIN_VALUE >>> var11;
					if ((var8 & var12) != 0) {
						if (this.keys[var10] == 0) {
							this.keys[var10] = var4;
						}
						var10 = this.keys[var10];
					} else {
						++var10;
					}
					if (var10 >= this.keys.length) {
						int[] var13 = new int[this.keys.length * 2];
						for (int var14 = 0; var14 < this.keys.length; ++var14) {
							var13[var14] = this.keys[var14];
						}
						this.keys = var13;
					}
					var12 >>>= 1;
				}
				this.keys[var10] = ~var5;
				if (var10 >= var4) {
					var4 = var10 + 1;
				}
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "([BII[BIB)I", garbageValue = "-98")
	@Export("compress")
	int compress(byte[] var1, int var2, int var3, byte[] var4, int var5) {
		int var6 = 0;
		int var7 = var5 << 3;
		for (var3 += var2; var2 < var3; ++var2) {
			int var8 = var1[var2] & 255;
			int var9 = this.masks[var8];
			byte var10 = this.bits[var8];
			if (var10 == 0) {
				throw new RuntimeException("" + var8);
			}
			int var11 = var7 >> 3;
			int var12 = var7 & 7;
			var6 &= -var12 >> 31;
			int var13 = (var12 + var10 - 1 >> 3) + var11;
			var12 += 24;
			var4[var11] = ((byte) (var6 |= var9 >>> var12));
			if (var11 < var13) {
				++var11;
				var12 -= 8;
				var4[var11] = ((byte) (var6 = var9 >>> var12));
				if (var11 < var13) {
					++var11;
					var12 -= 8;
					var4[var11] = ((byte) (var6 = var9 >>> var12));
					if (var11 < var13) {
						++var11;
						var12 -= 8;
						var4[var11] = ((byte) (var6 = var9 >>> var12));
						if (var11 < var13) {
							++var11;
							var12 -= 8;
							var4[var11] = ((byte) (var6 = var9 << -var12));
						}
					}
				}
			}
			var7 += var10;
		}
		return (var7 + 7 >> 3) - var5;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "([BI[BIII)I", garbageValue = "669033826")
	@Export("decompress")
	int decompress(byte[] var1, int var2, byte[] var3, int var4, int var5) {
		if (var5 == 0) {
			return 0;
		} else {
			int var6 = 0;
			var5 += var4;
			int var7 = var2;
			while (true) {
				byte var8 = var1[var7];
				if (var8 < 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}
				int var9;
				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = ((byte) (~var9));
					if (var4 >= var5) {
						break;
					}
					var6 = 0;
				}
				if ((var8 & 64) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}
				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = ((byte) (~var9));
					if (var4 >= var5) {
						break;
					}
					var6 = 0;
				}
				if ((var8 & 32) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}
				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = ((byte) (~var9));
					if (var4 >= var5) {
						break;
					}
					var6 = 0;
				}
				if ((var8 & 16) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}
				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = ((byte) (~var9));
					if (var4 >= var5) {
						break;
					}
					var6 = 0;
				}
				if ((var8 & 8) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}
				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = ((byte) (~var9));
					if (var4 >= var5) {
						break;
					}
					var6 = 0;
				}
				if ((var8 & 4) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}
				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = ((byte) (~var9));
					if (var4 >= var5) {
						break;
					}
					var6 = 0;
				}
				if ((var8 & 2) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}
				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = ((byte) (~var9));
					if (var4 >= var5) {
						break;
					}
					var6 = 0;
				}
				if ((var8 & 1) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}
				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = ((byte) (~var9));
					if (var4 >= var5) {
						break;
					}
					var6 = 0;
				}
				++var7;
			} 
			return var7 + 1 - var2;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(III)Lbi;", garbageValue = "2027632889")
	static Script method5480(int var0, int var1) {
		Script var2 = ((Script) (Script.Script_cached.get(((long) (var0 << 16)))));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = class267.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = class267.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}
					var2 = class344.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, ((long) (var0 << 16)));
						return var2;
					}
				}
				return null;
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(IIII)I", garbageValue = "-1058305132")
	static int method5474(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) {
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
		}
	}
}