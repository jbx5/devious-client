import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sf")
public class class486 {
	@ObfuscatedName("aw")
	public final Object field4964;
	@ObfuscatedName("ay")
	public final Object field4962;

	public class486(Object var1, Object var2) {
		this.field4964 = var1;
		this.field4962 = var2;
	}

	public String toString() {
		return this.field4964 + ", " + this.field4962;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class486) {
			class486 var2 = (class486)var1;
			if (this.field4964 == null) {
				if (var2.field4964 != null) {
					return false;
				}
			} else if (!this.field4964.equals(var2.field4964)) {
				return false;
			}

			if (this.field4962 == null) {
				if (var2.field4962 != null) {
					return false;
				}
			} else if (!this.field4962.equals(var2.field4962)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field4964 != null) {
			var1 += this.field4964.hashCode();
		}

		if (this.field4962 != null) {
			var1 += 31 * this.field4962.hashCode();
		}

		return var1;
	}
}
