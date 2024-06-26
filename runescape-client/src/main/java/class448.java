import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rh")
public class class448 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 41907731
	)
	static int field4826;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1046301915
	)
	int field4825;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1581170185
	)
	int field4823;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -994741757
	)
	int field4824;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1086262149
	)
	int field4822;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4825).length();
		int var3 = 10 - Integer.toString(this.field4824).length();
		int var4 = 10 - Integer.toString(this.field4823).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4825 + var5 + "Created: " + this.field4823 + var7 + "Total used: " + this.field4824 + var6 + "Max-In-Use: " + this.field4822;
	}
}
