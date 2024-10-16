import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
@Implements("IndexCheck")
public class IndexCheck implements class29 {
	@ObfuscatedName("aw")
	char[] field2985;
	@ObfuscatedName("ak")
	int[] field2983;
	@ObfuscatedName("aj")
	public int[] field2986;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1180857575
	)
	public int field2990;
	@ObfuscatedName("ay")
	int[] field2984;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2128229175
	)
	int field2993;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 928475053
	)
	int field2989;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 224355877
	)
	int field2991;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1200987177
	)
	int field2987;
	@ObfuscatedName("au")
	boolean[] field2997;
	@ObfuscatedName("an")
	boolean[] field2994;
	@ObfuscatedName("ao")
	boolean[] field2995;
	@ObfuscatedName("af")
	public char field2996;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1413118539
	)
	public int field2988;

	public IndexCheck() {
		this.field2985 = new char[128];
		this.field2983 = new int[128];
		this.field2986 = new int[128];
		this.field2990 = 0;
		this.field2984 = new int[128];
		this.field2993 = 0;
		this.field2989 = 0;
		this.field2991 = 0;
		this.field2987 = 0;
		this.field2997 = new boolean[112];
		this.field2994 = new boolean[112];
		this.field2995 = new boolean[112];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "3"
	)
	public boolean vmethod5644(int var1) {
		this.method5647(var1);
		this.field2997[var1] = true;
		this.field2994[var1] = true;
		this.field2995[var1] = false;
		if (this.field2990 < 128) {
			this.field2986[++this.field2990 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "19"
	)
	public boolean vmethod5668(int var1) {
		this.field2997[var1] = false;
		this.field2994[var1] = false;
		this.field2995[var1] = true;
		if (this.field2993 < 128) {
			this.field2984[++this.field2993 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-243955335"
	)
	public boolean vmethod5646(char var1) {
		int var2 = this.field2991 + 1 & 127;
		if (var2 != this.field2989) {
			this.field2983[this.field2991] = -1;
			this.field2985[this.field2991] = var1;
			this.field2991 = var2;
		}

		return false;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-22"
	)
	public boolean vmethod5681(boolean var1) {
		return false;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method5647(int var1) {
		int var2 = this.field2991 + 1 & 127;
		if (var2 != this.field2989) {
			this.field2983[this.field2991] = var1;
			this.field2985[this.field2991] = 0;
			this.field2991 = var2;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-178237825"
	)
	public void method5649() {
		this.field2989 = this.field2987;
		this.field2987 = this.field2991;
		this.field2990 = 0;
		this.field2993 = 0;
		Arrays.fill(this.field2994, false);
		Arrays.fill(this.field2995, false);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1956271740"
	)
	public final boolean method5650() {
		if (this.field2987 == this.field2989) {
			return false;
		} else {
			this.field2988 = this.field2983[this.field2989];
			this.field2996 = this.field2985[this.field2989];
			this.field2989 = this.field2989 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "26"
	)
	public boolean method5651(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2994[var1] : false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1028934053"
	)
	@Export("isValidIndexInRange")
	public boolean isValidIndexInRange(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2997[var1] : false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1137813711"
	)
	public boolean method5653(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2995[var1] : false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "9"
	)
	public int[] method5654() {
		int[] var1 = new int[this.field2990];

		for (int var2 = 0; var2 < this.field2990; ++var2) {
			var1[var2] = this.field2986[var2];
		}

		return var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1639434192"
	)
	public int[] method5655() {
		int[] var1 = new int[this.field2993];

		for (int var2 = 0; var2 < this.field2993; ++var2) {
			var1[var2] = this.field2984[var2];
		}

		return var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-4407"
	)
	public static int method5659(int var0, int var1) {
		int var2 = var1 - var0 & 2047;
		return var2 > 1024 ? -(2048 - var2) : var2;
	}
}
