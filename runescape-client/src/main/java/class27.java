import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
public class class27 {
	@ObfuscatedName("as")
	int[] field109;
	@ObfuscatedName("ae")
	int[] field110;

	public class27() {
		this.field109 = new int[112];
		this.field110 = new int[192];
		Arrays.fill(this.field109, 3);
		Arrays.fill(this.field110, 3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "29"
	)
	public void method393(int var1, int var2) {
		if (this.method400(var1) && this.method402(var2)) {
			this.field109[var1] = var2;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CIS)V",
		garbageValue = "12201"
	)
	public void method398(char var1, int var2) {
		if (this.method401(var1) && this.method402(var2)) {
			this.field110[var1] = var2;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "61"
	)
	public int method395(int var1) {
		return this.method400(var1) ? this.field109[var1] : 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "-611571839"
	)
	public int method433(char var1) {
		return this.method401(var1) ? this.field110[var1] : 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "3"
	)
	public boolean method397(int var1) {
		return this.method400(var1) && (this.field109[var1] == 1 || this.field109[var1] == 3);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "127"
	)
	public boolean method394(char var1) {
		return this.method401(var1) && (this.field110[var1] == 1 || this.field110[var1] == 3);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1127760018"
	)
	public boolean method427(int var1) {
		return this.method400(var1) && (this.field109[var1] == 2 || this.field109[var1] == 3);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "67"
	)
	public boolean method399(char var1) {
		return this.method401(var1) && (this.field110[var1] == 2 || this.field110[var1] == 3);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "2494"
	)
	boolean method400(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1147560933"
	)
	boolean method401(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-693952680"
	)
	boolean method402(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-1481777132"
	)
	public static int method437(CharSequence var0) {
		return AbstractWorldMapIcon.method6363(var0, 10, true);
	}
}
