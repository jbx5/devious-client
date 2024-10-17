import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("va")
public class class566 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1593675307
	)
	public final int field5528;
	@ObfuscatedName("aw")
	public Object field5529;

	public class566(int var1) {
		this.field5528 = var1;
	}

	public class566(int var1, Object var2) {
		this.field5528 = var1;
		this.field5529 = var2;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class566)) {
			return false;
		} else {
			class566 var2 = (class566)var1;
			if (var2.field5529 == null && this.field5529 != null) {
				return false;
			} else if (this.field5529 == null && var2.field5529 != null) {
				return false;
			} else {
				return this.field5528 == var2.field5528 && var2.field5529.equals(this.field5529);
			}
		}
	}
}
