import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("at")
	int[] field1296;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -58568865
	)
	int field1293;
	@ObfuscatedName("ac")
	int[] field1298;
	@ObfuscatedName("ao")
	int[] field1299;
	@ObfuscatedName("ah")
	int[] field1300;
	@ObfuscatedName("av")
	int[] field1301;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -470519513
	)
	int field1302;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 431953485
	)
	int field1303;
	@ObfuscatedName("ae")
	int[] field1304;
	@ObfuscatedName("ax")
	int[] field1305;
	@ObfuscatedName("ay")
	int[] field1291;
	@ObfuscatedName("au")
	int[] field1297;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -592367857
	)
	int field1308;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1312326288
	)
	int field1292;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1997778039
	)
	int field1309;

	@ObfuscatedSignature(
		descriptor = "([Lvl;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1296 = new int[256];
		this.field1293 = 0;
		this.field1302 = 0;
		this.field1303 = 0;
		this.field1308 = 0;
		this.field1292 = 0;
		this.field1309 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-579665568"
	)
	@Export("initColors")
	void initColors() {
		this.field1299 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1299[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1299[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1299[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1299[var1 + 192] = 16777215;
		}

		this.field1300 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1300[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1300[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1300[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1300[var1 + 192] = 16777215;
		}

		this.field1301 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1301[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1301[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1301[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1301[var1 + 192] = 16777215;
		}

		this.field1298 = new int[256];
		this.field1308 = 0;
		this.field1291 = new int[32768];
		this.field1297 = new int[32768];
		this.method2484((IndexedSprite)null);
		this.field1304 = new int[32768];
		this.field1305 = new int[32768];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-13"
	)
	void method2473() {
		this.field1299 = null;
		this.field1300 = null;
		this.field1301 = null;
		this.field1298 = null;
		this.field1291 = null;
		this.field1297 = null;
		this.field1304 = null;
		this.field1305 = null;
		this.field1308 = 0;
		this.field1292 = 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "53"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1304 == null) {
			this.initColors();
		}

		if (this.field1309 == 0) {
			this.field1309 = var2;
		}

		int var3 = var2 - this.field1309;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1309 = var2;
		if (var3 > 0) {
			this.method2470(var3);
		}

		this.method2475(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "17895424"
	)
	final void method2470(int var1) {
		this.field1308 += 128 * var1;
		int var2;
		if (this.field1308 > this.field1291.length) {
			this.field1308 -= this.field1291.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2484(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1304[var3 + var2] - this.field1291[var2 + this.field1308 & this.field1291.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1304[var2++] = var6;
		}

		byte var15 = 10;
		var6 = 128 - var15;

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			int var8 = var7 * 128;

			for (int var9 = 0; var9 < 128; ++var9) {
				var10 = (int)(Math.random() * 100.0D);
				if (var10 < 50 && var9 > var15 && var9 < var6) {
					this.field1304[var9 + var8] = 255;
				} else {
					this.field1304[var8 + var9] = 0;
				}
			}
		}

		if (this.field1302 * 16 > 0) {
			this.field1302 = this.field1302 * 16 - var1 * 4;
		}

		if (this.field1303 * 16 > 0) {
			this.field1303 = this.field1303 * 16 - var1 * 4;
		}

		if (this.field1302 * 16 == 0 && this.field1303 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1302 = 1024;
			}

			if (var7 == 1) {
				this.field1303 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1296[var7] = this.field1296[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1296[var7] = (int)(Math.sin((double)this.field1293 / 14.0D) * 16.0D + Math.sin((double)this.field1293 / 15.0D) * 14.0D + Math.sin((double)this.field1293 / 16.0D) * 12.0D);
			++this.field1293;
		}

		this.field1292 = this.field1292 * 10000 + var1 * 10000;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1292 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1304[var12 + (var13 << 7)] = 192;
			}

			this.field1292 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var14 + var7 < 128) {
						var12 += this.field1304[var14 + var13 + var7];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1304[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1305[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var13 + var7 < 256) {
						var12 += this.field1305[var7 * 128 + var11 + var14];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1305[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1304[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "13"
	)
	final int method2474(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "5"
	)
	final void method2475(int var1) {
		int var2 = this.field1298.length;
		if (this.field1302 * 16 > 0) {
			this.method2482(this.field1302 * 16, this.field1300);
		} else if (this.field1303 * 16 > 0) {
			this.method2482(this.field1303 * 16, this.field1301);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1298[var3] = this.field1299[var3];
			}
		}

		this.method2477(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I[IB)V",
		garbageValue = "-53"
	)
	final void method2482(int var1, int[] var2) {
		int var3 = this.field1298.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1298[var4] = this.method2474(this.field1299[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1298[var4] = var2[var4];
			} else {
				this.field1298[var4] = this.method2474(var2[var4], this.field1299[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "27"
	)
	final void method2477(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1296[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= WorldMapSprite.rasterProvider.width) {
				var7 = WorldMapSprite.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * WorldMapSprite.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1304[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1298[var10];
					int var14 = WorldMapSprite.rasterProvider.pixels[var8];
					WorldMapSprite.rasterProvider.pixels[var8++] = -16777216 | ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "384780420"
	)
	final void method2484(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1291.length; ++var2) {
			this.field1291[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1291[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1297[var5] = (this.field1291[var5 - 128] + this.field1291[var5 + 1] + this.field1291[var5 + 128] + this.field1291[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1291;
			this.field1291 = this.field1297;
			this.field1297 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight * -1758859088; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1291[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)[Lej;",
		garbageValue = "-7"
	)
	static AttackOption[] method2502() {
		return new AttackOption[]{AttackOption.field1390, AttackOption.AttackOption_hidden, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1385};
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BI)Ldm;",
		garbageValue = "493582871"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script();
		Buffer var2 = new Buffer(var0);
		var2.offset = var2.array.length - 2;
		int var3 = var2.readUnsignedShort();
		int var4 = var2.array.length - 2 - var3 - 12;
		var2.offset = var4;
		int var5 = var2.readInt();
		var1.localIntCount = var2.readUnsignedShort();
		var1.localStringCount = var2.readUnsignedShort();
		var1.intArgumentCount = var2.readUnsignedShort();
		var1.stringArgumentCount = var2.readUnsignedShort();
		int var6 = var2.readUnsignedByte();
		int var7;
		int var8;
		if (var6 > 0) {
			var1.switches = var1.newIterableNodeHashTable(var6);

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var2.readUnsignedShort();
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? Skeleton.method4848(var8) : 1);
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.readInt();
					int var11 = var2.readInt();
					var9.put(new IntegerNode(var11), (long)var10);
				}
			}
		}

		var2.offset = 0;
		var1.field1019 = var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
			var8 = var2.readUnsignedShort();
			if (var8 == 3) {
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte();
			}
		}

		return var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "55"
	)
	public static void method2471() {
		Iterator var0 = class329.musicSongs.iterator();

		while (var0.hasNext()) {
			MusicSong var1 = (MusicSong)var0.next();
			if (var1 != null) {
				var1.midiPcmStream.clear();
				var1.midiPcmStream.method6256();
				var1.midiPcmStream.setPcmStreamVolume(0);
				var1.midiPcmStream.field3620 = 0;
				class234.method4497(var1.musicTrackGroupId, var1.musicTrackFileId);
			}
		}

		class329.musicSongs.clear();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1614622839"
	)
	static final String method2500(int var0) {
		if (var0 < 100000) {
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
		}
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1749406631"
	)
	static void method2501() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (AsyncRestClient.widgetDefinition.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = AsyncRestClient.widgetDefinition.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = AsyncRestClient.widgetDefinition.method6536(var4);
					if (var5 != null) {
						class324.invalidateWidget(var5);
					}
				}
			}
		}

	}
}
