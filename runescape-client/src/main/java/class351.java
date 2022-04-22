import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mp")
public class class351 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	1823563099)

	int field4151;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	724631607)

	int field4146;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	159823091)

	int field4148;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-1148185313)

	int field4149;

	public String toString() {
		int var2 = 10 - Integer.toString(this.field4151).length();
		int var3 = 10 - Integer.toString(this.field4148).length();
		int var4 = 10 - Integer.toString(this.field4146).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return ((((((((("    Size: " + this.field4151) + var5) + "Created: ") + this.field4146) + var7) + "Total used: ") + this.field4148) + var6) + "Max-In-Use: ") + this.field4149;
	}
}