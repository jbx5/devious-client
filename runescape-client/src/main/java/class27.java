import java.util.Arrays;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
public class class27 {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("vz")
	static List field117;
	@ObfuscatedName("am")
	int[] field115;
	@ObfuscatedName("ac")
	int[] field116;

	public class27() {
		this.field115 = new int[112];
		this.field116 = new int[192];
		Arrays.fill(this.field115, 3);
		Arrays.fill(this.field116, 3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "332847941"
	)
	public void method362(int var1, int var2) {
		if (this.method370(var1) && this.method380(var2)) {
			this.field115[var1] = var2;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CIB)V",
		garbageValue = "0"
	)
	public void method363(char var1, int var2) {
		if (this.method371(var1) && this.method380(var2)) {
			this.field116[var1] = var2;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "60"
	)
	public int method364(int var1) {
		return this.method370(var1) ? this.field115[var1] : 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "77876090"
	)
	public int method372(char var1) {
		return this.method371(var1) ? this.field116[var1] : 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1857350139"
	)
	public boolean method366(int var1) {
		return this.method370(var1) && (this.field115[var1] == 1 || this.field115[var1] == 3);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "388560674"
	)
	public boolean method399(char var1) {
		return this.method371(var1) && (this.field116[var1] == 1 || this.field116[var1] == 3);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1767471360"
	)
	public boolean method368(int var1) {
		return this.method370(var1) && (this.field115[var1] == 2 || this.field115[var1] == 3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "734281980"
	)
	public boolean method365(char var1) {
		return this.method371(var1) && (this.field116[var1] == 2 || this.field116[var1] == 3);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-772578260"
	)
	boolean method370(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "32"
	)
	boolean method371(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1838394907"
	)
	boolean method380(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lfk;",
		garbageValue = "-1931879128"
	)
	static class132 method397(int var0) {
		class132[] var1 = new class132[]{class132.field1540, class132.field1545, class132.field1542, class132.field1543, class132.field1544};
		class132 var2 = (class132)class134.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class132.field1540;
		}

		return var2;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfb;B)V",
		garbageValue = "-103"
	)
	static void method387(float var0, float var1, float var2, float var3, class134 var4) {
		float var5 = var1 - var0;
		float var6 = var2 - var1;
		float var7 = var3 - var2;
		float var8 = var6 - var5;
		var4.field1572 = var7 - var6 - var8;
		var4.field1564 = var8 + var8 + var8;
		var4.field1570 = var5 + var5 + var5;
		var4.field1574 = var0;
	}
}
