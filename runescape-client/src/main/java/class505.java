import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("td")
public class class505 {
	@ObfuscatedName("az")
	public final Object field5090;
	@ObfuscatedName("ah")
	public final Object field5089;

	public class505(Object var1, Object var2) {
		this.field5090 = var1;
		this.field5089 = var2;
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field5090 != null) {
			var1 += this.field5090.hashCode();
		}

		if (this.field5089 != null) {
			var1 += 31 * this.field5089.hashCode();
		}

		return var1;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class505) {
			class505 var2 = (class505)var1;
			if (this.field5090 == null) {
				if (var2.field5090 != null) {
					return false;
				}
			} else if (!this.field5090.equals(var2.field5090)) {
				return false;
			}

			if (this.field5089 == null) {
				if (var2.field5089 != null) {
					return false;
				}
			} else if (!this.field5089.equals(var2.field5089)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return this.field5090 + ", " + this.field5089;
	}
}
