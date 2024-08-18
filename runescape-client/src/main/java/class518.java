import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tj")
public class class518 {
	@ObfuscatedName("ab")
	public final Object field5229;
	@ObfuscatedName("ay")
	public final Object field5227;

	public class518(Object var1, Object var2) {
		this.field5229 = var1;
		this.field5227 = var2;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class518) {
			class518 var2 = (class518)var1;
			if (this.field5229 == null) {
				if (var2.field5229 != null) {
					return false;
				}
			} else if (!this.field5229.equals(var2.field5229)) {
				return false;
			}

			if (this.field5227 == null) {
				if (var2.field5227 != null) {
					return false;
				}
			} else if (!this.field5227.equals(var2.field5227)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field5229 != null) {
			var1 += this.field5229.hashCode();
		}

		if (this.field5227 != null) {
			var1 += 31 * this.field5227.hashCode();
		}

		return var1;
	}

	public String toString() {
		return this.field5229 + ", " + this.field5227;
	}
}
