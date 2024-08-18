import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vy")
public class class557 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 765144573
	)
	public final int field5444;
	@ObfuscatedName("ay")
	public Object field5445;

	public class557(int var1) {
		this.field5444 = var1;
	}

	public class557(int var1, Object var2) {
		this.field5444 = var1;
		this.field5445 = var2;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class557)) {
			return false;
		} else {
			class557 var2 = (class557)var1;
			if (var2.field5445 == null && this.field5445 != null) {
				return false;
			} else if (this.field5445 == null && var2.field5445 != null) {
				return false;
			} else {
				return this.field5444 == var2.field5444 && var2.field5445.equals(this.field5445);
			}
		}
	}

	public int hashCode() {
		return super.hashCode();
	}
}
