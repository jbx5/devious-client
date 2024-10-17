import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("uy")
public class class527 {
	@ObfuscatedName("ap")
	public final Object field5316;
	@ObfuscatedName("aw")
	public final Object field5317;

	public class527(Object var1, Object var2) {
		this.field5316 = var1;
		this.field5317 = var2;
	}

	public String toString() {
		return this.field5316 + ", " + this.field5317;
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field5316 != null) {
			var1 += this.field5316.hashCode();
		}

		if (this.field5317 != null) {
			var1 += 31 * this.field5317.hashCode();
		}

		return var1;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class527) {
			class527 var2 = (class527)var1;
			if (this.field5316 == null) {
				if (var2.field5316 != null) {
					return false;
				}
			} else if (!this.field5316.equals(var2.field5316)) {
				return false;
			}

			if (this.field5317 == null) {
				if (var2.field5317 != null) {
					return false;
				}
			} else if (!this.field5317.equals(var2.field5317)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}
}
