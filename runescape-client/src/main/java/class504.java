import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("th")
public class class504 {
	@ObfuscatedName("aq")
	public final Object field5063;
	@ObfuscatedName("aw")
	public final Object field5064;

	public class504(Object var1, Object var2) {
		this.field5063 = var1;
		this.field5064 = var2;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class504) {
			class504 var2 = (class504)var1;
			if (this.field5063 == null) {
				if (var2.field5063 != null) {
					return false;
				}
			} else if (!this.field5063.equals(var2.field5063)) {
				return false;
			}

			if (this.field5064 == null) {
				if (var2.field5064 != null) {
					return false;
				}
			} else if (!this.field5064.equals(var2.field5064)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field5063 != null) {
			var1 += this.field5063.hashCode();
		}

		if (this.field5064 != null) {
			var1 += 31 * this.field5064.hashCode();
		}

		return var1;
	}

	public String toString() {
		return this.field5063 + ", " + this.field5064;
	}
}
