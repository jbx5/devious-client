import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tg")
public class class501 {
	@ObfuscatedName("am")
	public final Object field5041;
	@ObfuscatedName("ap")
	public final Object field5042;

	public class501(Object var1, Object var2) {
		this.field5041 = var1;
		this.field5042 = var2;
	}

	public String toString() {
		return this.field5041 + ", " + this.field5042;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class501) {
			class501 var2 = (class501)var1;
			if (this.field5041 == null) {
				if (var2.field5041 != null) {
					return false;
				}
			} else if (!this.field5041.equals(var2.field5041)) {
				return false;
			}

			if (this.field5042 == null) {
				if (var2.field5042 != null) {
					return false;
				}
			} else if (!this.field5042.equals(var2.field5042)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field5041 != null) {
			var1 += this.field5041.hashCode();
		}

		if (this.field5042 != null) {
			var1 += 31 * this.field5042.hashCode();
		}

		return var1;
	}
}
