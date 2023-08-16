import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
public class class485 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("au")
	public final Object field4966;
	@ObfuscatedName("ae")
	public final Object field4965;

	public class485(Object var1, Object var2) {
		this.field4966 = var1;
		this.field4965 = var2;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class485) {
			class485 var2 = (class485)var1;
			if (this.field4966 == null) {
				if (var2.field4966 != null) {
					return false;
				}
			} else if (!this.field4966.equals(var2.field4966)) {
				return false;
			}

			if (this.field4965 == null) {
				if (var2.field4965 != null) {
					return false;
				}
			} else if (!this.field4965.equals(var2.field4965)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field4966 != null) {
			var1 += this.field4966.hashCode();
		}

		if (this.field4965 != null) {
			var1 += 31 * this.field4965.hashCode();
		}

		return var1;
	}

	public String toString() {
		return this.field4966 + ", " + this.field4965;
	}
}
