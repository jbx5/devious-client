import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vx")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("az")
	@Export("name")
	String name;
	@ObfuscatedName("ah")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ltr;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1;
		String var4;
		if (var1 == null) {
			var4 = null;
		} else {
			label108: {
				int var5 = 0;

				int var6;
				for (var6 = var1.length(); var5 < var6 && class226.method4307(var1.charAt(var5)); ++var5) {
				}

				while (var6 > var5 && class226.method4307(var1.charAt(var6 - 1))) {
					--var6;
				}

				int var7 = var6 - var5;
				if (var7 >= 1) {
					byte var9;
					if (var2 == null) {
						var9 = 12;
					} else {
						switch(var2.field5114) {
						case 4:
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
							} else if (class210.isAlphaNumeric(var10)) {
								var11 = true;
							} else {
								char[] var12 = class513.field5125;
								int var13 = 0;

								label75:
								while (true) {
									char var14;
									if (var13 >= var12.length) {
										var12 = class513.field5122;

										for (var13 = 0; var13 < var12.length; ++var13) {
											var14 = var12[var13];
											if (var14 == var10) {
												var11 = true;
												break label75;
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
								char var16 = LoginType.method8998(var10);
								if (var16 != 0) {
									var15.append(var16);
								}
							}
						}

						if (var15.length() == 0) {
							var4 = null;
						} else {
							var4 = var15.toString();
						}
						break label108;
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
			label108: {
				int var5 = 0;

				int var6;
				for (var6 = var1.length(); var5 < var6 && class226.method4307(var1.charAt(var5)); ++var5) {
				}

				while (var6 > var5 && class226.method4307(var1.charAt(var6 - 1))) {
					--var6;
				}

				int var7 = var6 - var5;
				if (var7 >= 1) {
					byte var9;
					if (var4 == null) {
						var9 = 12;
					} else {
						switch(var4.field5114) {
						case 4:
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
							} else if (class210.isAlphaNumeric(var10)) {
								var11 = true;
							} else {
								char[] var12 = class513.field5125;
								int var13 = 0;

								label75:
								while (true) {
									char var14;
									if (var13 >= var12.length) {
										var12 = class513.field5122;

										for (var13 = 0; var13 < var12.length; ++var13) {
											var14 = var12[var13];
											if (var14 == var10) {
												var11 = true;
												break label75;
											}
										}

										var11 = false;
										break;
									}

									var14 = var12[var13];
									if (var14 == var10) {
										var11 = true;
										break;
									}

									++var13;
								}
							}

							if (var11) {
								char var16 = LoginType.method8998(var10);
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
						break label108;
					}
				}

				var3 = null;
			}
		}

		this.cleanName = var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "847884069"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2010003749"
	)
	public String method9893() {
		return this.cleanName;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1523802503"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvx;I)I",
		garbageValue = "-734248268"
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
