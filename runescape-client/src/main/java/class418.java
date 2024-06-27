import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
public class class418 {
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	public class423 field4681;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lqo;"
	)
	public class422 field4682;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqo;"
	)
	public class422 field4684;

	public class418() {
		this.field4681 = new class423();
		this.field4682 = new class422();
		this.field4684 = new class422(1.0F, 1.0F, 1.0F);
	}

	public String toString() {
		return "[" + this.field4681.toString() + "|" + this.field4682.toString() + "|" + this.field4684.toString() + "]";
	}

	public boolean equals(Object var1) {
		if (var1 == null) {
			return false;
		} else if (this == var1) {
			return true;
		} else if (!(var1 instanceof class418)) {
			return false;
		} else {
			class418 var2 = (class418)var1;
			return this.field4681.equals(var2.field4681) && this.field4682.method7724(var2.field4682) && this.field4684.method7724(var2.field4684);
		}
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + this.field4681.hashCode();
		var3 = 31 * var3 + this.field4682.hashCode();
		var3 = 31 * var3 + this.field4684.hashCode();
		return var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1680130408"
	)
	public static int method7673(int var0, int var1) {
		return (int)(Math.atan2((double)var0, (double)var1) * 325.94932345220167D) & 2047;
	}
}
