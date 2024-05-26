import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rg")
public class class447 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2079157027
	)
	int field4807;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1351754127
	)
	int field4806;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 424096415
	)
	int field4805;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -791721597
	)
	int field4808;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4807).length();
		int var3 = 10 - Integer.toString(this.field4805).length();
		int var4 = 10 - Integer.toString(this.field4806).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4807 + var5 + "Created: " + this.field4806 + var7 + "Total used: " + this.field4805 + var6 + "Max-In-Use: " + this.field4808;
	}
}
