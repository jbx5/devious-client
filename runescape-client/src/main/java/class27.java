import java.io.IOException;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
public class class27 {
	@ObfuscatedName("tw")
	@ObfuscatedGetter(
		intValue = 97065725
	)
	static int field117;
	@ObfuscatedName("af")
	int[] field119;
	@ObfuscatedName("at")
	int[] field115;

	public class27() {
		this.field119 = new int[112];
		this.field115 = new int[192];
		Arrays.fill(this.field119, 3);
		Arrays.fill(this.field115, 3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "6"
	)
	public void method379(int var1, int var2) {
		if (this.method416(var1) && this.method382(var2)) {
			this.field119[var1] = var2;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "-513476203"
	)
	public void method380(char var1, int var2) {
		if (this.method410(var1) && this.method382(var2)) {
			this.field115[var1] = var2;
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2138005081"
	)
	public int method381(int var1) {
		return this.method416(var1) ? this.field119[var1] : 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "922803565"
	)
	public int method392(char var1) {
		return this.method410(var1) ? this.field115[var1] : 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1672323676"
	)
	public boolean method383(int var1) {
		return this.method416(var1) && (this.field119[var1] == 1 || this.field119[var1] == 3);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1861969036"
	)
	public boolean method386(char var1) {
		return this.method410(var1) && (this.field115[var1] == 1 || this.field115[var1] == 3);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1669205803"
	)
	public boolean method385(int var1) {
		return this.method416(var1) && (this.field119[var1] == 2 || this.field119[var1] == 3);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "1"
	)
	public boolean method404(char var1) {
		return this.method410(var1) && (this.field115[var1] == 2 || this.field115[var1] == 3);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-29"
	)
	boolean method416(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1859923705"
	)
	boolean method410(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1723718049"
	)
	boolean method382(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lui;III)I",
		garbageValue = "-351654337"
	)
	static int method421(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1);
			return var3 == null ? var2 : var3.integer;
		}
	}

	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "15728880"
	)
	@Export("randomDatData2")
	static void randomDatData2(Buffer var0) {
		if (Client.randomDatData != null) {
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var2 = new byte[24];

			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.readFully(var2);

				int var3;
				for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
				}

				if (var3 >= 24) {
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var4 = 0; var4 < 24; ++var4) {
					var2[var4] = -1;
				}
			}

			var0.writeBytes(var2, 0, var2.length);
		}
	}
}
