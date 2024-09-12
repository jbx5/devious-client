import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rx")
public class class451 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -264827793
	)
	int field4853;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 969059965
	)
	int field4852;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2125443585
	)
	int field4854;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1066660767
	)
	int field4855;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4853).length();
		int var3 = 10 - Integer.toString(this.field4854).length();
		int var4 = 10 - Integer.toString(this.field4852).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4853 + var5 + "Created: " + this.field4852 + var7 + "Total used: " + this.field4854 + var6 + "Max-In-Use: " + this.field4855;
	}
}
