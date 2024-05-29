import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vf")
public class class554 {
	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1978856885
	)
	public final int field5408;
	@ObfuscatedName("al")
	public Object field5410;

	public class554(int var1) {
		this.field5408 = var1;
	}

	public class554(int var1, Object var2) {
		this.field5408 = var1;
		this.field5410 = var2;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class554)) {
			return false;
		} else {
			class554 var2 = (class554)var1;
			if (var2.field5410 == null && this.field5410 != null) {
				return false;
			} else if (this.field5410 == null && var2.field5410 != null) {
				return false;
			} else {
				return this.field5408 == var2.field5408 && var2.field5410.equals(this.field5410);
			}
		}
	}
}
