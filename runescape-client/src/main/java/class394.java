import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
public abstract class class394 implements class249 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lpc;")

	class431 field4378;

	class394(int var1) {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;IB)V", garbageValue = 
	"3")

	abstract void vmethod7204(Buffer var1, int var2);

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;I)V", garbageValue = 
	"1362633882")

	public void method7199(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class390[] var3 = new class390[]{ class390.field4370, class390.field4368, class390.field4369, class390.field4371 };
			class390 var4 = ((class390) (ChatChannel.findEnumerated(var3, var2)));
			if (var4 != null) {
				switch (var4.field4372) {
					case 0 :
						int var5 = var1.readUnsignedByte();
						int var8 = class429.field4592[var5];
						class431 var6;
						if (var8 == 1) {
							var6 = class431.field4598;
						} else if (var8 == 2) {
							var6 = class431.field4600;
						} else if (var8 == 3) {
							var6 = class431.field4595;
						} else {
							var6 = null;
						}

						this.field4378 = var6;
						if (this.field4378 != null) {
							break;
						}

						throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
					case 1 :
						var1.readStringCp1252NullCircumfixed();
						break;
					case 2 :
					default :
						throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
					case 3 :
						class309[] var7 = new class309[]{ class309.field3911, class309.field3910, class309.field3912, class309.field3918 };
						ChatChannel.findEnumerated(var7, var1.readUnsignedByte());}

			} else {
				this.vmethod7204(var1, var2);
			}
		} 
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-2144539286")

	boolean method7201() {
		return this.field4378 != null;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(B)Ljava/lang/Object;", garbageValue = 
	"0")

	Object method7200() {
		if (this.field4378 == class431.field4598) {
			return 0;
		} else if (this.field4378 == class431.field4595) {
			return -1L;
		} else {
			return this.field4378 == class431.field4600 ? "" : null;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/CharSequence;Lpa;I)Ljava/lang/String;", garbageValue = 
	"-1784818161")

	public static String method7212(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			for (var3 = var0.length(); (var2 < var3) && class291.method5588(var0.charAt(var2)); ++var2) {
			}

			while ((var3 > var2) && class291.method5588(var0.charAt(var3 - 1))) {
				--var3;
			} 

			int var4 = var3 - var2;
			if (var4 >= 1) {
				byte var6;
				if (var1 == null) {
					var6 = 12;
				} else {
					switch (var1.field4560) {
						case 3 :
							var6 = 20;
							break;
						default :
							var6 = 12;}

				}

				if (var4 <= var6) {
					StringBuilder var10 = new StringBuilder(var4);

					for (int var11 = var2; var11 < var3; ++var11) {
						char var7 = var0.charAt(var11);
						if (ViewportMouse.method4463(var7)) {
							char var8;
							switch (var7) {
								case ' ' :
								case '-' :
								case '_' :
								case ' ' :
									var8 = '_';
									break;
								case '#' :
								case '[' :
								case ']' :
									var8 = var7;
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
									var8 = 'a';
									break;
								case 'Ç' :
								case 'ç' :
									var8 = 'c';
									break;
								case 'È' :
								case 'É' :
								case 'Ê' :
								case 'Ë' :
								case 'è' :
								case 'é' :
								case 'ê' :
								case 'ë' :
									var8 = 'e';
									break;
								case 'Í' :
								case 'Î' :
								case 'Ï' :
								case 'í' :
								case 'î' :
								case 'ï' :
									var8 = 'i';
									break;
								case 'Ñ' :
								case 'ñ' :
									var8 = 'n';
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
									var8 = 'o';
									break;
								case 'Ù' :
								case 'Ú' :
								case 'Û' :
								case 'Ü' :
								case 'ù' :
								case 'ú' :
								case 'û' :
								case 'ü' :
									var8 = 'u';
									break;
								case 'ß' :
									var8 = 'b';
									break;
								case 'ÿ' :
								case 'Ÿ' :
									var8 = 'y';
									break;
								default :
									var8 = Character.toLowerCase(var7);}


							if (var8 != 0) {
								var10.append(var8);
							}
						}
					}

					if (var10.length() == 0) {
						return null;
					}

					return var10.toString();
				}
			}

			return null;
		}
	}
}