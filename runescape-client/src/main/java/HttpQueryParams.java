import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("te")
@Implements("HttpQueryParams")
public class HttpQueryParams implements HttpPayload {
	@ObfuscatedName("ap")
	@Export("queryParameters")
	final Map queryParameters;

	public HttpQueryParams(Map var1) {
		this.queryParameters = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ltz;",
		garbageValue = "1116588540"
	)
	@Export("getContentType")
	public HttpContentType getContentType() {
		return null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "60"
	)
	@Export("toBytes")
	public byte[] toBytes() throws UnsupportedEncodingException {
		return this.encode().getBytes("UTF-8");
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1915596610"
	)
	@Export("encode")
	public String encode() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder();
		Iterator var2 = this.queryParameters.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8");
			String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8");
			var1.append(var4).append("=").append(var5).append("&");
		}

		if (var1.length() == 0) {
			return "";
		} else {
			var1.deleteCharAt(var1.length() - 1);
			var1.insert(0, "?");
			return var1.toString();
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "1526142023"
	)
	static int method9406(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			class96.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
			EnumComposition var10 = ObjectComposition.getEnum(var3);
			if (var10.outputType != 's') {
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}

			if (var10 != null) {
				Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				EnumComposition var4 = ObjectComposition.getEnum(var3);
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			class96.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 3];
			EnumComposition var7 = ObjectComposition.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}
}
