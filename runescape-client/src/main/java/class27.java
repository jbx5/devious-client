import java.applet.Applet;
import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
public class class27 {
	@ObfuscatedName("aa")
	int[] field128;
	@ObfuscatedName("ac")
	int[] field135;

	public class27() {
		this.field128 = new int[112];
		this.field135 = new int[192];
		Arrays.fill(this.field128, 3);
		Arrays.fill(this.field135, 3);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1639161786"
	)
	public void method404(int var1, int var2) {
		if (this.method413(var1) && this.method415(var2)) {
			this.field128[var1] = var2;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "-87016088"
	)
	public void method406(char var1, int var2) {
		if (this.method411(var1) && this.method415(var2)) {
			this.field135[var1] = var2;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1141320535"
	)
	public int method407(int var1) {
		return this.method413(var1) ? this.field128[var1] : 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "832183208"
	)
	public int method414(char var1) {
		return this.method411(var1) ? this.field135[var1] : 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1834915572"
	)
	public boolean method409(int var1) {
		return this.method413(var1) && (this.field128[var1] == 1 || this.field128[var1] == 3);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1013987055"
	)
	public boolean method410(char var1) {
		return this.method411(var1) && (this.field135[var1] == 1 || this.field135[var1] == 3);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1584083272"
	)
	public boolean method422(int var1) {
		return this.method413(var1) && (this.field128[var1] == 2 || this.field128[var1] == 3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-769837729"
	)
	public boolean method412(char var1) {
		return this.method411(var1) && (this.field135[var1] == 2 || this.field135[var1] == 3);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2115531423"
	)
	boolean method413(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "494262388"
	)
	boolean method411(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "9461"
	)
	boolean method415(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V",
		garbageValue = "-1746840644"
	)
	public static void method445(Applet var0, String var1) {
		class31.field158 = var0;
		if (var1 != null) {
			class31.field157 = var1;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnh;I)V",
		garbageValue = "-1843378433"
	)
	public static void method444(Huffman var0) {
		class350.huffman = var0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "70"
	)
	static int method446(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}
}
