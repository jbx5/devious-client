import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
@Implements("IndexCheck")
public class IndexCheck implements class29 {
	@ObfuscatedName("ak")
	char[] field2466;
	@ObfuscatedName("al")
	int[] field2465;
	@ObfuscatedName("aj")
	public int[] field2473;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 127227895
	)
	public int field2467;
	@ObfuscatedName("af")
	int[] field2468;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 397936417
	)
	int field2469;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1257217165
	)
	int field2475;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -137072547
	)
	int field2471;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1100015875
	)
	int field2472;
	@ObfuscatedName("ao")
	boolean[] field2477;
	@ObfuscatedName("ah")
	boolean[] field2474;
	@ObfuscatedName("av")
	boolean[] field2470;
	@ObfuscatedName("aq")
	public char field2464;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1450055511
	)
	public int field2476;

	public IndexCheck() {
		this.field2466 = new char[128];
		this.field2465 = new int[128];
		this.field2473 = new int[128];
		this.field2467 = 0;
		this.field2468 = new int[128];
		this.field2469 = 0;
		this.field2475 = 0;
		this.field2471 = 0;
		this.field2472 = 0;
		this.field2477 = new boolean[112];
		this.field2474 = new boolean[112];
		this.field2470 = new boolean[112];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1374510228"
	)
	public boolean vmethod4410(int var1) {
		this.method4413(var1);
		this.field2477[var1] = true;
		this.field2474[var1] = true;
		this.field2470[var1] = false;
		this.field2473[++this.field2467 - 1] = var1;
		return true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2020665722"
	)
	public boolean vmethod4411(int var1) {
		this.field2477[var1] = false;
		this.field2474[var1] = false;
		this.field2470[var1] = true;
		this.field2468[++this.field2469 - 1] = var1;
		return true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1931852798"
	)
	public boolean vmethod4412(char var1) {
		int var2 = this.field2471 + 1 & 127;
		if (var2 != this.field2475) {
			this.field2465[this.field2471] = -1;
			this.field2466[this.field2471] = var1;
			this.field2471 = var2;
		}

		return false;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZS)Z",
		garbageValue = "25450"
	)
	public boolean vmethod4414(boolean var1) {
		return false;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "11"
	)
	void method4413(int var1) {
		int var2 = this.field2471 + 1 & 127;
		if (var2 != this.field2475) {
			this.field2465[this.field2471] = var1;
			this.field2466[this.field2471] = 0;
			this.field2471 = var2;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1392625048"
	)
	public void method4415() {
		this.field2475 = this.field2472;
		this.field2472 = this.field2471;
		this.field2467 = 0;
		this.field2469 = 0;
		Arrays.fill(this.field2474, false);
		Arrays.fill(this.field2470, false);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1661190134"
	)
	public final boolean method4439() {
		if (this.field2472 == this.field2475) {
			return false;
		} else {
			this.field2476 = this.field2465[this.field2475];
			this.field2464 = this.field2466[this.field2475];
			this.field2475 = this.field2475 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "270086768"
	)
	public boolean method4450(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2474[var1] : false;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1454200806"
	)
	@Export("isValidIndexInRange")
	public boolean isValidIndexInRange(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2477[var1] : false;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1949899525"
	)
	public boolean method4419(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2470[var1] : false;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1194566833"
	)
	public int[] method4423() {
		int[] var1 = new int[this.field2467];

		for (int var2 = 0; var2 < this.field2467; ++var2) {
			var1[var2] = this.field2473[var2];
		}

		return var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "157440532"
	)
	public int[] method4446() {
		int[] var1 = new int[this.field2469];

		for (int var2 = 0; var2 < this.field2469; ++var2) {
			var1[var2] = this.field2468[var2];
		}

		return var1;
	}
}
