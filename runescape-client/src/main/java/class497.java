import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ti")
public class class497 {
	@ObfuscatedName("at")
	public final Object field4996;
	@ObfuscatedName("ah")
	public final Object field4997;

	public class497(Object var1, Object var2) {
		this.field4996 = var1;
		this.field4997 = var2;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class497) {
			class497 var2 = (class497)var1;
			if (this.field4996 == null) {
				if (var2.field4996 != null) {
					return false;
				}
			} else if (!this.field4996.equals(var2.field4996)) {
				return false;
			}

			if (this.field4997 == null) {
				if (var2.field4997 != null) {
					return false;
				}
			} else if (!this.field4997.equals(var2.field4997)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return this.field4996 + ", " + this.field4997;
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field4996 != null) {
			var1 += this.field4996.hashCode();
		}

		if (this.field4997 != null) {
			var1 += 31 * this.field4997.hashCode();
		}

		return var1;
	}
}
