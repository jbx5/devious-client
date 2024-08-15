import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("IndexCheck")
public class IndexCheck implements class29 {
	@ObfuscatedName("ab")
	char[] field2923;
	@ObfuscatedName("ay")
	int[] field2929;
	@ObfuscatedName("an")
	public int[] field2920;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 756319555
	)
	public int field2918;
	@ObfuscatedName("ax")
	int[] field2922;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 445544175
	)
	int field2919;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1461761705
	)
	int field2924;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 115267651
	)
	int field2925;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -899621997
	)
	int field2921;
	@ObfuscatedName("ad")
	boolean[] field2927;
	@ObfuscatedName("aq")
	boolean[] field2928;
	@ObfuscatedName("al")
	boolean[] field2926;
	@ObfuscatedName("aj")
	public char field2931;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1358943087
	)
	public int field2930;

	public IndexCheck() {
		this.field2923 = new char[128];
		this.field2929 = new int[128];
		this.field2920 = new int[128];
		this.field2918 = 0;
		this.field2922 = new int[128];
		this.field2919 = 0;
		this.field2924 = 0;
		this.field2925 = 0;
		this.field2921 = 0;
		this.field2927 = new boolean[112];
		this.field2928 = new boolean[112];
		this.field2926 = new boolean[112];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-80"
	)
	public boolean vmethod5350(int var1) {
		this.method5352(var1);
		this.field2927[var1] = true;
		this.field2928[var1] = true;
		this.field2926[var1] = false;
		this.field2920[++this.field2918 - 1] = var1;
		return true;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1050737787"
	)
	public boolean vmethod5351(int var1) {
		this.field2927[var1] = false;
		this.field2928[var1] = false;
		this.field2926[var1] = true;
		this.field2922[++this.field2919 - 1] = var1;
		return true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-772262998"
	)
	public boolean vmethod5378(char var1) {
		int var2 = this.field2925 + 1 & 127;
		if (var2 != this.field2924) {
			this.field2929[this.field2925] = -1;
			this.field2923[this.field2925] = var1;
			this.field2925 = var2;
		}

		return false;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1863708161"
	)
	public boolean vmethod5354(boolean var1) {
		return false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-74"
	)
	void method5352(int var1) {
		int var2 = this.field2925 + 1 & 127;
		if (var2 != this.field2924) {
			this.field2929[this.field2925] = var1;
			this.field2923[this.field2925] = 0;
			this.field2925 = var2;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-20"
	)
	public void method5371() {
		this.field2924 = this.field2921;
		this.field2921 = this.field2925;
		this.field2918 = 0;
		this.field2919 = 0;
		Arrays.fill(this.field2928, false);
		Arrays.fill(this.field2926, false);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-810494332"
	)
	public final boolean method5375() {
		if (this.field2924 == this.field2921) {
			return false;
		} else {
			this.field2930 = this.field2929[this.field2924];
			this.field2931 = this.field2923[this.field2924];
			this.field2924 = this.field2924 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "74"
	)
	public boolean method5357(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2928[var1] : false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "59"
	)
	@Export("isValidIndexInRange")
	public boolean isValidIndexInRange(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2927[var1] : false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "101"
	)
	public boolean method5373(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2926[var1] : false;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "18"
	)
	public int[] method5349() {
		int[] var1 = new int[this.field2918];

		for (int var2 = 0; var2 < this.field2918; ++var2) {
			var1[var2] = this.field2920[var2];
		}

		return var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1899947386"
	)
	public int[] method5367() {
		int[] var1 = new int[this.field2919];

		for (int var2 = 0; var2 < this.field2919; ++var2) {
			var1[var2] = this.field2922[var2];
		}

		return var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)[Lmy;",
		garbageValue = "31859"
	)
	public static class322[] method5385() {
		return new class322[]{class322.field3367, class322.field3364, class322.field3363, class322.field3361, class322.field3365, class322.field3362, class322.field3368, class322.field3371, class322.field3369, class322.field3370, class322.field3366};
	}
}
