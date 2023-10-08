import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
public class class27 {
	@ObfuscatedName("au")
	static String[] field147;
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("ar")
	int[] field148;
	@ObfuscatedName("ab")
	int[] field143;

	public class27() {
		this.field148 = new int[112];
		this.field143 = new int[192];
		Arrays.fill(this.field148, 3);
		Arrays.fill(this.field143, 3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1970517025"
	)
	public void method372(int var1, int var2) {
		if (this.method380(var1) && this.method382(var2)) {
			this.field148[var1] = var2;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "-1891863343"
	)
	public void method373(char var1, int var2) {
		if (this.method415(var1) && this.method382(var2)) {
			this.field143[var1] = var2;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "24"
	)
	public int method374(int var1) {
		return this.method380(var1) ? this.field148[var1] : 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "-535571819"
	)
	public int method411(char var1) {
		return this.method415(var1) ? this.field143[var1] : 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-101"
	)
	public boolean method376(int var1) {
		return this.method380(var1) && (this.field148[var1] == 1 || this.field148[var1] == 3);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "9"
	)
	public boolean method377(char var1) {
		return this.method415(var1) && (this.field143[var1] == 1 || this.field143[var1] == 3);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1930578634"
	)
	public boolean method387(int var1) {
		return this.method380(var1) && (this.field148[var1] == 2 || this.field148[var1] == 3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "37"
	)
	public boolean method379(char var1) {
		return this.method415(var1) && (this.field143[var1] == 2 || this.field143[var1] == 3);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	boolean method380(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1032091509"
	)
	boolean method415(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1780470681"
	)
	boolean method382(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "534503383"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-376109619"
	)
	static void method393(int var0) {
		GameEngine.method647(14);
		Login.Login_banType = var0;
	}
}
