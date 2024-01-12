import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vs")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("am")
	@Export("name")
	String name;
	@ObfuscatedName("ap")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lth;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1;
		String var4;
		if (var1 == null) {
			var4 = null;
		} else {
			int var5 = 0;

			int var6;
			for (var6 = var1.length(); var5 < var6 && MilliClock.method4262(var1.charAt(var5)); ++var5) {
			}

			while (var6 > var5 && MilliClock.method4262(var1.charAt(var6 - 1))) {
				--var6;
			}

			int var7 = var6 - var5;
			if (var7 >= 1 && var7 <= class332.method6308(var2)) {
				StringBuilder var8 = new StringBuilder(var7);

				for (int var9 = var5; var9 < var6; ++var9) {
					char var10 = var1.charAt(var9);
					if (Messages.method2837(var10)) {
						char var11 = class385.method7273(var10);
						if (var11 != 0) {
							var8.append(var11);
						}
					}
				}

				if (var8.length() == 0) {
					var4 = null;
				} else {
					var4 = var8.toString();
				}
			} else {
				var4 = null;
			}
		}

		this.cleanName = var4;
	}

	public Username(String var1) {
		this.name = var1;
		LoginType var4 = LoginType.oldscape;
		String var3;
		if (var1 == null) {
			var3 = null;
		} else {
			int var5 = 0;

			int var6;
			for (var6 = var1.length(); var5 < var6 && MilliClock.method4262(var1.charAt(var5)); ++var5) {
			}

			while (var6 > var5 && MilliClock.method4262(var1.charAt(var6 - 1))) {
				--var6;
			}

			int var7 = var6 - var5;
			if (var7 >= 1 && var7 <= class332.method6308(var4)) {
				StringBuilder var8 = new StringBuilder(var7);

				for (int var9 = var5; var9 < var6; ++var9) {
					char var10 = var1.charAt(var9);
					if (Messages.method2837(var10)) {
						char var11 = class385.method7273(var10);
						if (var11 != 0) {
							var8.append(var11);
						}
					}
				}

				if (var8.length() == 0) {
					var3 = null;
				} else {
					var3 = var8.toString();
				}
			} else {
				var3 = null;
			}
		}

		this.cleanName = var3;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1794179494"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1874735961"
	)
	public String method10004() {
		return this.cleanName;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "63"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvs;I)I",
		garbageValue = "162874778"
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

	public String toString() {
		return this.getName();
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1);
	}
}
