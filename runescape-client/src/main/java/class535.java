import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ux")
public class class535 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 697297497
	)
	public final int field5204;
	@ObfuscatedName("ah")
	public Object field5205;

	public class535(int var1) {
		this.field5204 = var1;
	}

	public class535(int var1, Object var2) {
		this.field5204 = var1;
		this.field5205 = var2;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class535)) {
			return false;
		} else {
			class535 var2 = (class535)var1;
			if (var2.field5205 == null && this.field5205 != null) {
				return false;
			} else if (this.field5205 == null && var2.field5205 != null) {
				return false;
			} else {
				return this.field5204 == var2.field5204 && var2.field5205.equals(this.field5205);
			}
		}
	}

	public int hashCode() {
		return super.hashCode();
	}
}
