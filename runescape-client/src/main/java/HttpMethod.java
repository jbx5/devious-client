import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ad")
@Implements("HttpMethod")
public class HttpMethod implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("POST")
	public static final HttpMethod POST;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("GET")
	public static final HttpMethod GET;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("PUT")
	static final HttpMethod PUT;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("PATCH")
	static final HttpMethod PATCH;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("DELETE")
	static final HttpMethod DELETE;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = 1347018305
	)
	static int field33;
	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	static WorldView field36;
	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 329758105
	)
	int field30;
	@ObfuscatedName("am")
	@Export("name")
	String name;
	@ObfuscatedName("ac")
	boolean field32;
	@ObfuscatedName("ae")
	boolean field38;

	static {
		POST = new HttpMethod(0, "POST", true, true);
		GET = new HttpMethod(1, "GET", true, false);
		PUT = new HttpMethod(2, "PUT", false, true);
		PATCH = new HttpMethod(3, "PATCH", false, true);
		DELETE = new HttpMethod(4, "DELETE", false, true);
	}

	HttpMethod(int var1, String var2, boolean var3, boolean var4) {
		this.field30 = var1;
		this.name = var2;
		this.field32 = var3;
		this.field38 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field30;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-16334"
	)
	boolean method65() {
		return this.field32;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "22947"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1054424632"
	)
	boolean method73() {
		return this.field38;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method78() {
		class135.otp.trim();
		if (class135.otp.length() != 6) {
			class130.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
		} else {
			FadeOutTask.otpMedium = Integer.parseInt(class135.otp);
			class135.otp = "";
			Client.authenticationScheme = Login.rememberUsername ? AuthenticationScheme.TOKEN_REMEMBER : AuthenticationScheme.TOKEN;
			class130.setLoginResponseString("", "Connecting to server...", "");
			UserComparator3.updateGameState(20);
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZB)I",
		garbageValue = "-70"
	)
	static int method67(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) {
			Interpreter.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			Interpreter.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			Interpreter.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 * var9;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			Interpreter.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				Interpreter.Interpreter_intStackSize -= 5;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + (var7 - var5) * (var4 - var9) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + var4 * var9 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
						break;
					default:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4;
				return 1;
			} else if (var0 == 4016) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4;
				return 1;
			} else if (var0 == 4017) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				Interpreter.Interpreter_intStackSize -= 3;
				long var10 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				long var12 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				long var14 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(var10 * var14 / var12);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var9 = TaskHandler.method4570(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				Interpreter.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class248.method4976(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				Interpreter.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarConfig.method2744(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				Interpreter.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 << var6 >>> var4 + var6;
				return 1;
			} else if (var0 == 4030) {
				Interpreter.Interpreter_intStackSize -= 4;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
				var9 = HealthBarConfig.method2744(var9, var5, var6);
				var7 = GameObject.method4490(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = FaceNormal.method4141(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Decimator.method1099(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.method2162(var9, var4);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var3 = Interpreter.Interpreter_stringStack[--class230.Interpreter_stringStackSize];
				var4 = -1;
				if (class136.isNumber(var3)) {
					var4 = ApproximateRouteStrategy.method1193(var3);
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4;
				return 1;
			} else {
				return 2;
			}
		}
	}
}
