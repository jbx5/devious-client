import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ph")
public class class410 {
	@ObfuscatedName("ax")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 488939871
	)
	int field4538;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 408775955
	)
	int field4534;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1744400735
	)
	int field4535;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 880720889
	)
	int field4537;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4538).length();
		int var3 = 10 - Integer.toString(this.field4535).length();
		int var4 = 10 - Integer.toString(this.field4534).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4538 + var5 + "Created: " + this.field4534 + var7 + "Total used: " + this.field4535 + var6 + "Max-In-Use: " + this.field4537;
	}
}
