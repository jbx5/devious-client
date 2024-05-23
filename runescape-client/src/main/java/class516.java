import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("to")
public class class516 {
	@ObfuscatedName("ak")
	public final Object field5199;
	@ObfuscatedName("al")
	public final Object field5198;

	public class516(Object var1, Object var2) {
		this.field5199 = var1;
		this.field5198 = var2;
	}

	public String toString() {
		return this.field5199 + ", " + this.field5198;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class516) {
			class516 var2 = (class516)var1;
			if (this.field5199 == null) {
				if (var2.field5199 != null) {
					return false;
				}
			} else if (!this.field5199.equals(var2.field5199)) {
				return false;
			}

			if (this.field5198 == null) {
				if (var2.field5198 != null) {
					return false;
				}
			} else if (!this.field5198.equals(var2.field5198)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field5199 != null) {
			var1 += this.field5199.hashCode();
		}

		if (this.field5198 != null) {
			var1 += 31 * this.field5198.hashCode();
		}

		return var1;
	}
}
