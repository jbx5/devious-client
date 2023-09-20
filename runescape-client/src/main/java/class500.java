import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tw")
public class class500 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2034293227
	)
	@Export("SpriteBuffer_spriteHeight")
	public static int SpriteBuffer_spriteHeight;
	@ObfuscatedName("ao")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("ac")
	public final Object field5003;
	@ObfuscatedName("al")
	public final Object field5004;

	public class500(Object var1, Object var2) {
		this.field5003 = var1;
		this.field5004 = var2;
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field5003 != null) {
			var1 += this.field5003.hashCode();
		}

		if (this.field5004 != null) {
			var1 += 31 * this.field5004.hashCode();
		}

		return var1;
	}

	public String toString() {
		return this.field5003 + ", " + this.field5004;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class500) {
			class500 var2 = (class500)var1;
			if (this.field5003 == null) {
				if (var2.field5003 != null) {
					return false;
				}
			} else if (!this.field5003.equals(var2.field5003)) {
				return false;
			}

			if (this.field5004 == null) {
				if (var2.field5004 != null) {
					return false;
				}
			} else if (!this.field5004.equals(var2.field5004)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}
}
