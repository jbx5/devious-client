import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
public class class226 implements class29 {
	@ObfuscatedName("ac")
	char[] field2374;
	@ObfuscatedName("al")
	int[] field2379;
	@ObfuscatedName("ak")
	public int[] field2373;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1388234181
	)
	public int field2376;
	@ObfuscatedName("ao")
	int[] field2377;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2109755151
	)
	int field2378;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1767369861
	)
	int field2385;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1418302057
	)
	int field2380;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1713082771
	)
	int field2381;
	@ObfuscatedName("av")
	boolean[] field2382;
	@ObfuscatedName("ag")
	boolean[] field2383;
	@ObfuscatedName("aa")
	boolean[] field2384;
	@ObfuscatedName("ap")
	public char field2375;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 372049411
	)
	public int field2386;

	public class226() {
		this.field2374 = new char[128];
		this.field2379 = new int[128];
		this.field2373 = new int[128];
		this.field2376 = 0;
		this.field2377 = new int[128];
		this.field2378 = 0;
		this.field2385 = 0;
		this.field2380 = 0;
		this.field2381 = 0;
		this.field2382 = new boolean[112];
		this.field2383 = new boolean[112];
		this.field2384 = new boolean[112];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1448724719"
	)
	public boolean vmethod4264(int var1) {
		this.method4253(var1);
		this.field2382[var1] = true;
		this.field2383[var1] = true;
		this.field2384[var1] = false;
		this.field2373[++this.field2376 - 1] = var1;
		return true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-974805318"
	)
	public boolean vmethod4251(int var1) {
		this.field2382[var1] = false;
		this.field2383[var1] = false;
		this.field2384[var1] = true;
		this.field2377[++this.field2378 - 1] = var1;
		return true;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "19"
	)
	public boolean vmethod4275(char var1) {
		int var2 = this.field2380 + 1 & 127;
		if (var2 != this.field2385) {
			this.field2379[this.field2380] = -1;
			this.field2374[this.field2380] = var1;
			this.field2380 = var2;
		}

		return false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-672025946"
	)
	public boolean vmethod4254(boolean var1) {
		return false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1769728274"
	)
	void method4253(int var1) {
		int var2 = this.field2380 + 1 & 127;
		if (var2 != this.field2385) {
			this.field2379[this.field2380] = var1;
			this.field2374[this.field2380] = 0;
			this.field2380 = var2;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method4250() {
		this.field2385 = this.field2381;
		this.field2381 = this.field2380;
		this.field2376 = 0;
		this.field2378 = 0;
		Arrays.fill(this.field2383, false);
		Arrays.fill(this.field2384, false);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-192433797"
	)
	public final boolean method4256() {
		if (this.field2385 == this.field2381) {
			return false;
		} else {
			this.field2386 = this.field2379[this.field2385];
			this.field2375 = this.field2374[this.field2385];
			this.field2385 = this.field2385 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1443777028"
	)
	public boolean method4272(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2383[var1] : false;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-978109184"
	)
	public boolean method4280(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2382[var1] : false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1065204501"
	)
	public boolean method4259(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2384[var1] : false;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "118"
	)
	public int[] method4298() {
		int[] var1 = new int[this.field2376];

		for (int var2 = 0; var2 < this.field2376; ++var2) {
			var1[var2] = this.field2373[var2];
		}

		return var1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-31"
	)
	public int[] method4292() {
		int[] var1 = new int[this.field2378];

		for (int var2 = 0; var2 < this.field2378; ++var2) {
			var1[var2] = this.field2377[var2];
		}

		return var1;
	}
}
