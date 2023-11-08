import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public class class223 implements class29 {
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -60348737
	)
	static int field2351;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = -1311681143
	)
	static int field2367;
	@ObfuscatedName("at")
	char[] field2366;
	@ObfuscatedName("ah")
	int[] field2352;
	@ObfuscatedName("ar")
	public int[] field2353;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 855313001
	)
	public int field2354;
	@ObfuscatedName("ab")
	int[] field2355;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1867836669
	)
	int field2356;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -879893607
	)
	int field2359;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 266395581
	)
	int field2358;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1341174997
	)
	int field2365;
	@ObfuscatedName("az")
	boolean[] field2357;
	@ObfuscatedName("ap")
	boolean[] field2361;
	@ObfuscatedName("av")
	boolean[] field2362;
	@ObfuscatedName("ax")
	public char field2363;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 2118557339
	)
	public int field2360;

	public class223() {
		this.field2366 = new char[128];
		this.field2352 = new int[128];
		this.field2353 = new int[128];
		this.field2354 = 0;
		this.field2355 = new int[128];
		this.field2356 = 0;
		this.field2359 = 0;
		this.field2358 = 0;
		this.field2365 = 0;
		this.field2357 = new boolean[112];
		this.field2361 = new boolean[112];
		this.field2362 = new boolean[112];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "512"
	)
	public boolean vmethod4310(int var1) {
		this.method4311(var1);
		this.field2357[var1] = true;
		this.field2361[var1] = true;
		this.field2362[var1] = false;
		this.field2353[++this.field2354 - 1] = var1;
		return true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1146773117"
	)
	public boolean vmethod4320(int var1) {
		this.field2357[var1] = false;
		this.field2361[var1] = false;
		this.field2362[var1] = true;
		this.field2355[++this.field2356 - 1] = var1;
		return true;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "984376689"
	)
	public boolean vmethod4321(char var1) {
		int var2 = this.field2358 + 1 & 127;
		if (var2 != this.field2359) {
			this.field2352[this.field2358] = -1;
			this.field2366[this.field2358] = var1;
			this.field2358 = var2;
		}

		return false;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-49"
	)
	public boolean vmethod4312(boolean var1) {
		return false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "19704"
	)
	void method4311(int var1) {
		int var2 = this.field2358 + 1 & 127;
		if (var2 != this.field2359) {
			this.field2352[this.field2358] = var1;
			this.field2366[this.field2358] = 0;
			this.field2358 = var2;
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1513942573"
	)
	public void method4313() {
		this.field2359 = this.field2365;
		this.field2365 = this.field2358;
		this.field2354 = 0;
		this.field2356 = 0;
		Arrays.fill(this.field2361, false);
		Arrays.fill(this.field2362, false);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1159556377"
	)
	public final boolean method4324() {
		if (this.field2365 == this.field2359) {
			return false;
		} else {
			this.field2360 = this.field2352[this.field2359];
			this.field2363 = this.field2366[this.field2359];
			this.field2359 = this.field2359 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "21"
	)
	public boolean method4315(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2361[var1] : false;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1604984140"
	)
	public boolean method4316(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2357[var1] : false;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1100003987"
	)
	public boolean method4317(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2362[var1] : false;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1519174440"
	)
	public int[] method4318() {
		int[] var1 = new int[this.field2354];

		for (int var2 = 0; var2 < this.field2354; ++var2) {
			var1[var2] = this.field2353[var2];
		}

		return var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "353218827"
	)
	public int[] method4319() {
		int[] var1 = new int[this.field2356];

		for (int var2 = 0; var2 < this.field2356; ++var2) {
			var1[var2] = this.field2355[var2];
		}

		return var1;
	}
}
