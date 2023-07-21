import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ui")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("aw")
	@Export("name")
	String name;
	@ObfuscatedName("ay")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lsi;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1;
		this.cleanName = FriendsChat.method7912(var1, var2);
	}

	public Username(String var1) {
		this.name = var1;
		this.cleanName = FriendsChat.method7912(var1, LoginType.oldscape);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "880493347"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1828095462"
	)
	public String method9741() {
		return this.cleanName;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lui;I)I",
		garbageValue = "704664306"
	)
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
			Username var2 = (Username)var1;
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

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1);
	}

	public String toString() {
		return this.getName();
	}
}
