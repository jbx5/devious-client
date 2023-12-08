import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vj")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("at")
	@Export("name")
	String name;
	@ObfuscatedName("ah")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ltt;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1;
		this.cleanName = AsyncRestClient.sanitizeUsername(var1, var2);
	}

	public Username(String var1) {
		this.name = var1;
		LoginType var4 = LoginType.oldscape;
		String var3;
		if (var1 == null) {
			var3 = null;
		} else {
			label109: {
				int var5 = 0;

				int var6;
				for (var6 = var1.length(); var5 < var6 && class489.method8666(var1.charAt(var5)); ++var5) {
				}

				while (var6 > var5 && class489.method8666(var1.charAt(var6 - 1))) {
					--var6;
				}

				int var7 = var6 - var5;
				if (var7 >= 1) {
					byte var9;
					if (var4 == null) {
						var9 = 12;
					} else {
						switch(var4.field5022) {
						case 1:
							var9 = 20;
							break;
						default:
							var9 = 12;
						}
					}

					if (var7 <= var9) {
						StringBuilder var15 = new StringBuilder(var7);

						for (int var17 = var5; var17 < var6; ++var17) {
							char var10 = var1.charAt(var17);
							boolean var11;
							if (Character.isISOControl(var10)) {
								var11 = false;
							} else if (KeyHandler.isAlphaNumeric(var10)) {
								var11 = true;
							} else {
								char[] var12 = class505.field5030;
								int var13 = 0;

								label76:
								while (true) {
									char var14;
									if (var13 >= var12.length) {
										var12 = class505.field5031;

										for (var13 = 0; var13 < var12.length; ++var13) {
											var14 = var12[var13];
											if (var14 == var10) {
												var11 = true;
												break label76;
											}
										}

										var11 = false;
										break;
									}

									var14 = var12[var13];
									if (var10 == var14) {
										var11 = true;
										break;
									}

									++var13;
								}
							}

							if (var11) {
								char var16 = FriendsChat.method8113(var10);
								if (var16 != 0) {
									var15.append(var16);
								}
							}
						}

						if (var15.length() == 0) {
							var3 = null;
						} else {
							var3 = var15.toString();
						}
						break label109;
					}
				}

				var3 = null;
			}
		}

		this.cleanName = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "8"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1344600615"
	)
	public String method9937() {
		return this.cleanName;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "19"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)I",
		garbageValue = "1848187995"
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
