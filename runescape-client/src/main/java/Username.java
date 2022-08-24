import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("qy")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Lja;")
	@Export("musicTrack")
	public static MusicTrack musicTrack;

	@ObfuscatedName("s")
	@Export("name")
	String name;

	@ObfuscatedName("h")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lpl;)V")
	public Username(String var1, LoginType var2) {
		this.name = var1;
		String var4;
		if (var1 == null) {
			var4 = null;
		} else {
			label86 : {
				int var5 = 0;
				int var6;
				for (var6 = var1.length(); var5 < var6 && SceneTilePaint.method4416(var1.charAt(var5)); ++var5) {
				}
				while (var6 > var5 && SceneTilePaint.method4416(var1.charAt(var6 - 1))) {
					--var6;
				} 
				int var7 = var6 - var5;
				if (var7 >= 1) {
					byte var9;
					if (var2 == null) {
						var9 = 12;
					} else {
						switch (var2.field4616) {
							case 1 :
								var9 = 20;
								break;
							default :
								var9 = 12;
						}
					}
					if (var7 <= var9) {
						StringBuilder var13 = new StringBuilder(var7);
						for (int var14 = var5; var14 < var6; ++var14) {
							char var10 = var1.charAt(var14);
							if (class400.method7055(var10)) {
								char var11;
								switch (var10) {
									case ' ' :
									case '-' :
									case '_' :
									case ' ' :
										var11 = '_';
										break;
									case '#' :
									case '[' :
									case ']' :
										var11 = var10;
										break;
									case 'À' :
									case 'Á' :
									case 'Â' :
									case 'Ã' :
									case 'Ä' :
									case 'à' :
									case 'á' :
									case 'â' :
									case 'ã' :
									case 'ä' :
										var11 = 'a';
										break;
									case 'Ç' :
									case 'ç' :
										var11 = 'c';
										break;
									case 'È' :
									case 'É' :
									case 'Ê' :
									case 'Ë' :
									case 'è' :
									case 'é' :
									case 'ê' :
									case 'ë' :
										var11 = 'e';
										break;
									case 'Í' :
									case 'Î' :
									case 'Ï' :
									case 'í' :
									case 'î' :
									case 'ï' :
										var11 = 'i';
										break;
									case 'Ñ' :
									case 'ñ' :
										var11 = 'n';
										break;
									case 'Ò' :
									case 'Ó' :
									case 'Ô' :
									case 'Õ' :
									case 'Ö' :
									case 'ò' :
									case 'ó' :
									case 'ô' :
									case 'õ' :
									case 'ö' :
										var11 = 'o';
										break;
									case 'Ù' :
									case 'Ú' :
									case 'Û' :
									case 'Ü' :
									case 'ù' :
									case 'ú' :
									case 'û' :
									case 'ü' :
										var11 = 'u';
										break;
									case 'ß' :
										var11 = 'b';
										break;
									case 'ÿ' :
									case 'Ÿ' :
										var11 = 'y';
										break;
									default :
										var11 = Character.toLowerCase(var10);
								}
								if (var11 != 0) {
									var13.append(var11);
								}
							}
						}
						if (var13.length() == 0) {
							var4 = null;
						} else {
							var4 = var13.toString();
						}
						break label86;
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
			label86 : {
				int var5 = 0;
				int var6;
				for (var6 = var1.length(); var5 < var6 && SceneTilePaint.method4416(var1.charAt(var5)); ++var5) {
				}
				while (var6 > var5 && SceneTilePaint.method4416(var1.charAt(var6 - 1))) {
					--var6;
				} 
				int var7 = var6 - var5;
				if (var7 >= 1) {
					byte var9;
					if (var4 == null) {
						var9 = 12;
					} else {
						switch (var4.field4616) {
							case 1 :
								var9 = 20;
								break;
							default :
								var9 = 12;
						}
					}
					if (var7 <= var9) {
						StringBuilder var13 = new StringBuilder(var7);
						for (int var14 = var5; var14 < var6; ++var14) {
							char var10 = var1.charAt(var14);
							if (class400.method7055(var10)) {
								char var11;
								switch (var10) {
									case ' ' :
									case '-' :
									case '_' :
									case ' ' :
										var11 = '_';
										break;
									case '#' :
									case '[' :
									case ']' :
										var11 = var10;
										break;
									case 'À' :
									case 'Á' :
									case 'Â' :
									case 'Ã' :
									case 'Ä' :
									case 'à' :
									case 'á' :
									case 'â' :
									case 'ã' :
									case 'ä' :
										var11 = 'a';
										break;
									case 'Ç' :
									case 'ç' :
										var11 = 'c';
										break;
									case 'È' :
									case 'É' :
									case 'Ê' :
									case 'Ë' :
									case 'è' :
									case 'é' :
									case 'ê' :
									case 'ë' :
										var11 = 'e';
										break;
									case 'Í' :
									case 'Î' :
									case 'Ï' :
									case 'í' :
									case 'î' :
									case 'ï' :
										var11 = 'i';
										break;
									case 'Ñ' :
									case 'ñ' :
										var11 = 'n';
										break;
									case 'Ò' :
									case 'Ó' :
									case 'Ô' :
									case 'Õ' :
									case 'Ö' :
									case 'ò' :
									case 'ó' :
									case 'ô' :
									case 'õ' :
									case 'ö' :
										var11 = 'o';
										break;
									case 'Ù' :
									case 'Ú' :
									case 'Û' :
									case 'Ü' :
									case 'ù' :
									case 'ú' :
									case 'û' :
									case 'ü' :
										var11 = 'u';
										break;
									case 'ß' :
										var11 = 'b';
										break;
									case 'ÿ' :
									case 'Ÿ' :
										var11 = 'y';
										break;
									default :
										var11 = Character.toLowerCase(var10);
								}
								if (var11 != 0) {
									var13.append(var11);
								}
							}
						}
						if (var13.length() == 0) {
							var3 = null;
						} else {
							var3 = var13.toString();
						}
						break label86;
					}
				}
				var3 = null;
			}
		}
		this.cleanName = var3;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "0")
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "557448197")
	public String method8215() {
		return this.cleanName;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "21")
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Lqy;I)I", garbageValue = "392159043")
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

	public int compareTo(Object var1) {
		return this.compareToTyped(((Username) (var1)));
	}

	public String toString() {
		return this.getName();
	}
}