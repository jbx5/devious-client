import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rh")
public class class452 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 498716913
	)
	int field4895;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 798979565
	)
	int field4894;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 785608849
	)
	int field4893;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1396262397
	)
	int field4896;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4895).length();
		int var3 = 10 - Integer.toString(this.field4893).length();
		int var4 = 10 - Integer.toString(this.field4894).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4895 + var5 + "Created: " + this.field4894 + var7 + "Total used: " + this.field4893 + var6 + "Max-In-Use: " + this.field4896;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhm;",
		garbageValue = "-1890190480"
	)
	static VerticalAlignment[] method8781() {
		return new VerticalAlignment[]{VerticalAlignment.field2058, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2060};
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-13"
	)
	public static void method8782() {
		DbRowType.DBRowType_cache.clear();
	}
}
