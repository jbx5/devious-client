import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ue")
public class class520 {
	@ObfuscatedName("ac")
	public final Object field5264;
	@ObfuscatedName("ae")
	public final Object field5265;

	public class520(Object var1, Object var2) {
		this.field5264 = var1;
		this.field5265 = var2;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class520) {
			class520 var2 = (class520)var1;
			if (this.field5264 == null) {
				if (var2.field5264 != null) {
					return false;
				}
			} else if (!this.field5264.equals(var2.field5264)) {
				return false;
			}

			if (this.field5265 == null) {
				if (var2.field5265 != null) {
					return false;
				}
			} else if (!this.field5265.equals(var2.field5265)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return this.field5264 + ", " + this.field5265;
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field5264 != null) {
			var1 += this.field5264.hashCode();
		}

		if (this.field5265 != null) {
			var1 += 31 * this.field5265.hashCode();
		}

		return var1;
	}
}
