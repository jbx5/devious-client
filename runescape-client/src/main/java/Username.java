import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("qa")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("c")
	@Export("name")
	String name;

	@ObfuscatedName("v")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lpe;)V")
	public Username(String var1, LoginType var2) {
		this.name = var1;
		this.cleanName = UserComparator5.method2580(var1, var2);
	}

	public Username(String var1) {
		this.name = var1;
		this.cleanName = UserComparator5.method2580(var1, LoginType.oldscape);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "1398829508")
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "1713644314")
	public String method8320() {
		return this.cleanName;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-54")
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqa;I)I", garbageValue = "113609215")
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) {
			return var1.cleanName == null ? 0 : 1;
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName);
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) {
			Username var2 = ((Username) (var1));
			if (this.cleanName == null) {
				return var2.cleanName == null;
			} else if (var2.cleanName == null) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName);
			}
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode();
	}

	public String toString() {
		return this.getName();
	}

	public int compareTo(Object var1) {
		return this.compareToTyped(((Username) (var1)));
	}
}