import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
public class class449 {
	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	static Task field4813;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1604594795
	)
	int field4811;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -809858579
	)
	int field4808;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1328228873
	)
	int field4807;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 804225255
	)
	int field4809;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4811).length();
		int var3 = 10 - Integer.toString(this.field4807).length();
		int var4 = 10 - Integer.toString(this.field4808).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4811 + var5 + "Created: " + this.field4808 + var7 + "Total used: " + this.field4807 + var6 + "Max-In-Use: " + this.field4809;
	}
}
