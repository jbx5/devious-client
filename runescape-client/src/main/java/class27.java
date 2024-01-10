import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
public class class27 {
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = 1968580127
	)
	static int field135;
	@ObfuscatedName("ag")
	int[] field138;
	@ObfuscatedName("ao")
	int[] field140;

	public class27() {
		this.field138 = new int[112];
		this.field140 = new int[192];
		Arrays.fill(this.field138, 3);
		Arrays.fill(this.field140, 3);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "83"
	)
	public void method427(int var1, int var2) {
		if (this.method400(var1) && this.method422(var2)) {
			this.field138[var1] = var2;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CIB)V",
		garbageValue = "-120"
	)
	public void method393(char var1, int var2) {
		if (this.method397(var1) && this.method422(var2)) {
			this.field140[var1] = var2;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1889056683"
	)
	public int method394(int var1) {
		return this.method400(var1) ? this.field138[var1] : 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CB)I",
		garbageValue = "0"
	)
	public int method395(char var1) {
		return this.method397(var1) ? this.field140[var1] : 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1248469043"
	)
	public boolean method412(int var1) {
		return this.method400(var1) && (this.field138[var1] == 1 || this.field138[var1] == 3);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "1"
	)
	public boolean method418(char var1) {
		return this.method397(var1) && (this.field140[var1] == 1 || this.field140[var1] == 3);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "845483812"
	)
	public boolean method398(int var1) {
		return this.method400(var1) && (this.field138[var1] == 2 || this.field138[var1] == 3);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "392991290"
	)
	public boolean method399(char var1) {
		return this.method397(var1) && (this.field140[var1] == 2 || this.field140[var1] == 3);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "105"
	)
	boolean method400(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "105"
	)
	boolean method397(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "84"
	)
	boolean method422(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(I)Lpu;",
		garbageValue = "89017045"
	)
	public static NodeDeque method401() {
		return Client.scriptEvents;
	}
}
