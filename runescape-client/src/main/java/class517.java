import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tu")
public class class517 {
	@ObfuscatedName("aq")
	public final Object field5225;
	@ObfuscatedName("ad")
	public final Object field5222;

	public class517(Object var1, Object var2) {
		this.field5225 = var1;
		this.field5222 = var2;
	}

	public String toString() {
		return this.field5225 + ", " + this.field5222;
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field5225 != null) {
			var1 += this.field5225.hashCode();
		}

		if (this.field5222 != null) {
			var1 += 31 * this.field5222.hashCode();
		}

		return var1;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class517) {
			class517 var2 = (class517)var1;
			if (this.field5225 == null) {
				if (var2.field5225 != null) {
					return false;
				}
			} else if (!this.field5225.equals(var2.field5225)) {
				return false;
			}

			if (this.field5222 == null) {
				if (var2.field5222 != null) {
					return false;
				}
			} else if (!this.field5222.equals(var2.field5222)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}
}
