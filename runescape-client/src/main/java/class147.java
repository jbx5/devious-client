import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class147 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 8225525561408272315L
	)
	long field1650;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -926071349
	)
	public int field1655;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	IterableNodeDeque field1651;

	@ObfuscatedSignature(
		descriptor = "(Luj;)V"
	)
	public class147(Buffer var1) {
		this.field1655 = -1;
		this.field1651 = new IterableNodeDeque();
		this.method3250(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "867669029"
	)
	void method3250(Buffer var1) {
		this.field1650 = var1.readLong();
		this.field1655 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class166(this);
			} else if (var2 == 1) {
				var3 = new class142(this);
			} else if (var2 == 13) {
				var3 = new class159(this);
			} else if (var2 == 4) {
				var3 = new class151(this);
			} else if (var2 == 6) {
				var3 = new class158(this);
			} else if (var2 == 5) {
				var3 = new class143(this);
			} else if (var2 == 2) {
				var3 = new class148(this);
			} else if (var2 == 7) {
				var3 = new class141(this);
			} else if (var2 == 14) {
				var3 = new class145(this);
			} else if (var2 == 8) {
				var3 = new class162(this);
			} else if (var2 == 9) {
				var3 = new class168(this);
			} else if (var2 == 10) {
				var3 = new class154(this);
			} else if (var2 == 11) {
				var3 = new class149(this);
			} else if (var2 == 12) {
				var3 = new class153(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class163(this);
			}

			((class144)var3).vmethod3510(var1);
			this.field1651.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfc;B)V",
		garbageValue = "-115"
	)
	public void method3252(ClanSettings var1) {
		if (var1.field1722 == this.field1650 && this.field1655 == var1.field1701) {
			for (class144 var2 = (class144)this.field1651.last(); var2 != null; var2 = (class144)this.field1651.previous()) {
				var2.vmethod3506(var1);
			}

			++var1.field1701;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "193145278"
	)
	static int method3256(int var0, Script var1, boolean var2) {
		if (var0 == 7463) {
			boolean var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
			class165.method3486(var3);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(IIIILuz;Lme;I)V",
		garbageValue = "2144355739"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var3 * var8 + var9 * var2 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method9764(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}
}
