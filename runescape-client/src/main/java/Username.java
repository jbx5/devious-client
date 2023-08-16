import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uc")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("au")
	@Export("name")
	String name;
	@ObfuscatedName("ae")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lsl;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1;
		String var4;
		if (var1 == null) {
			var4 = null;
		} else {
			label71: {
				int var5 = 0;

				int var6;
				for (var6 = var1.length(); var5 < var6 && ArchiveDiskActionHandler.method6640(var1.charAt(var5)); ++var5) {
				}

				while (var6 > var5 && ArchiveDiskActionHandler.method6640(var1.charAt(var6 - 1))) {
					--var6;
				}

				int var7 = var6 - var5;
				if (var7 >= 1) {
					byte var9;
					if (var2 == null) {
						var9 = 12;
					} else {
						switch(var2.field4988) {
						case 0:
							var9 = 20;
							break;
						default:
							var9 = 12;
						}
					}

					if (var7 <= var9) {
						StringBuilder var12 = new StringBuilder(var7);

						for (int var13 = var5; var13 < var6; ++var13) {
							char var10 = var1.charAt(var13);
							if (ClientPreferences.method2555(var10)) {
								char var11 = KeyHandler.method378(var10);
								if (var11 != 0) {
									var12.append(var11);
								}
							}
						}

						if (var12.length() == 0) {
							var4 = null;
						} else {
							var4 = var12.toString();
						}
						break label71;
					}
				}

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
			label71: {
				int var5 = 0;

				int var6;
				for (var6 = var1.length(); var5 < var6 && ArchiveDiskActionHandler.method6640(var1.charAt(var5)); ++var5) {
				}

				while (var6 > var5 && ArchiveDiskActionHandler.method6640(var1.charAt(var6 - 1))) {
					--var6;
				}

				int var7 = var6 - var5;
				if (var7 >= 1) {
					byte var9;
					if (var4 == null) {
						var9 = 12;
					} else {
						switch(var4.field4988) {
						case 0:
							var9 = 20;
							break;
						default:
							var9 = 12;
						}
					}

					if (var7 <= var9) {
						StringBuilder var12 = new StringBuilder(var7);

						for (int var13 = var5; var13 < var6; ++var13) {
							char var10 = var1.charAt(var13);
							if (ClientPreferences.method2555(var10)) {
								char var11 = KeyHandler.method378(var10);
								if (var11 != 0) {
									var12.append(var11);
								}
							}
						}

						if (var12.length() == 0) {
							var3 = null;
						} else {
							var3 = var12.toString();
						}
						break label71;
					}
				}

				var3 = null;
			}
		}

		this.cleanName = var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1021488493"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "28"
	)
	public String method9688() {
		return this.cleanName;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-911492900"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luc;I)I",
		garbageValue = "-2077400310"
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
