import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("ma")
public class class351 {
	@ObfuscatedName("z")
	public static boolean field4198;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 951623757)
	int field4197;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -658455091)
	int field4193;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1299809865)
	int field4195;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 156042527)
	int field4196;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4197).length();
		int var3 = 10 - Integer.toString(this.field4195).length();
		int var4 = 10 - Integer.toString(this.field4193).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4197 + var5 + "Created: " + this.field4193 + var7 + "Total used: " + this.field4195 + var6 + "Max-In-Use: " + this.field4196;
	}
}