import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vf")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("ab")
	@Export("name")
	String name;
	@ObfuscatedName("ay")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Luk;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1;
		String var4;
		if (var1 == null) {
			var4 = null;
		} else {
			label99: {
				int var5 = 0;

				int var6;
				boolean var7;
				char var8;
				for (var6 = var1.length(); var5 < var6; ++var5) {
					var8 = var1.charAt(var5);
					var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
					if (!var7) {
						break;
					}
				}

				while (var6 > var5) {
					var8 = var1.charAt(var6 - 1);
					var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
					if (!var7) {
						break;
					}

					--var6;
				}

				int var13 = var6 - var5;
				if (var13 >= 1) {
					byte var9;
					if (var2 == null) {
						var9 = 12;
					} else {
						switch(var2.field5249) {
						case 4:
							var9 = 20;
							break;
						default:
							var9 = 12;
						}
					}

					if (var13 <= var9) {
						StringBuilder var12 = new StringBuilder(var13);

						for (int var14 = var5; var14 < var6; ++var14) {
							char var10 = var1.charAt(var14);
							if (ArchiveDiskAction.method7186(var10)) {
								char var11 = UrlRequester.method3004(var10);
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
						break label99;
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
			label99: {
				int var5 = 0;

				int var6;
				boolean var7;
				char var8;
				for (var6 = var1.length(); var5 < var6; ++var5) {
					var8 = var1.charAt(var5);
					var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
					if (!var7) {
						break;
					}
				}

				while (var6 > var5) {
					var8 = var1.charAt(var6 - 1);
					var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
					if (!var7) {
						break;
					}

					--var6;
				}

				int var13 = var6 - var5;
				if (var13 >= 1) {
					byte var9;
					if (var4 == null) {
						var9 = 12;
					} else {
						switch(var4.field5249) {
						case 4:
							var9 = 20;
							break;
						default:
							var9 = 12;
						}
					}

					if (var13 <= var9) {
						StringBuilder var12 = new StringBuilder(var13);

						for (int var14 = var5; var14 < var6; ++var14) {
							char var10 = var1.charAt(var14);
							if (ArchiveDiskAction.method7186(var10)) {
								char var11 = UrlRequester.method3004(var10);
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
						break label99;
					}
				}

				var3 = null;
			}
		}

		this.cleanName = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-85"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1328321582"
	)
	public String method10300() {
		return this.cleanName;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-42"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvf;S)I",
		garbageValue = "132"
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
