import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.json.JSONObject;

@ObfuscatedName("hi")
public class class183 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	static final class183 field1911;
	@ObfuscatedName("ak")
	String field1919;
	@ObfuscatedName("al")
	String field1912;
	@ObfuscatedName("aj")
	String field1920;
	@ObfuscatedName("az")
	String field1914;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 1590826231487001329L
	)
	long field1915;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	AsyncRestClient field1926;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	AsyncHttpResponse field1913;
	@ObfuscatedName("ab")
	final int field1918;
	@ObfuscatedName("ac")
	final int field1923;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -188287101
	)
	int field1917;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1776795307
	)
	int field1921;
	@ObfuscatedName("ax")
	String field1922;
	@ObfuscatedName("au")
	boolean field1924;

	static {
		field1911 = new class183();
	}

	class183() {
		this.field1919 = "";
		this.field1912 = "";
		this.field1920 = "";
		this.field1914 = "";
		this.field1915 = -1L;
		this.field1918 = 1;
		this.field1923 = 2;
		this.field1917 = 1;
		this.field1921 = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-841520631"
	)
	public void method3657(int var1, String var2) {
		this.field1921 = var1;
		this.field1922 = var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "27"
	)
	public void method3658(boolean var1) {
		this.field1924 = var1;
		this.field1926 = new AsyncRestClient("crmsession", 1, 1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "863389078"
	)
	void method3689(String var1, String var2, String var3) {
		if (this.field1917 != 2) {
			this.field1919 = var1;
			this.field1912 = var2;
			this.field1920 = var3;
			if (!this.field1919.endsWith("/")) {
				this.field1919 = this.field1919 + "/";
			}

			if (!this.field1912.equals("")) {
				String var4 = this.field1919;
				var4 = var4 + "session/open/" + this.field1912;
				if (this.field1920.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.field1920;

				try {
					this.field1913 = this.method3666(var4);
					this.field1915 = class129.method3033();
				} catch (IOException var6) {
					this.field1913 = null;
					this.field1912 = "";
					this.field1920 = "";
				}

			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-124"
	)
	public void method3660() {
		if (this.field1913 == null) {
			if (!this.field1914.isEmpty() && this.field1917 == 1) {
				long var1 = class129.method3033();
				long var3 = var1 - this.field1915;
				String var5 = this.field1919;
				var5 = var5 + "session/close/" + this.field1912 + "/" + this.field1914;
				if (this.field1920.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.field1920 + "&sessionDuration=" + var3;
				}

				try {
					this.field1913 = this.method3666(var5);
				} catch (IOException var7) {
					this.field1917 = 1;
				}
			}

		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	public void method3663() {
		if (this.field1926 != null) {
			this.field1926.shutdown();
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1381260647"
	)
	void method3662() {
		if (!this.field1914.isEmpty()) {
			String var1 = "";
			switch(this.field1921) {
			case 1:
				var1 = "events/click";
				break;
			case 2:
				var1 = "events/dismissed";
				break;
			case 3:
				var1 = "events/impression";
			}

			if (!this.field1922.isEmpty()) {
				String var2 = this.field1919;
				var2 = var2 + var1 + "/" + this.field1912 + "/" + this.field1914 + "/" + this.field1922 + "?userHash=" + this.field1920;

				try {
					this.field1913 = this.method3666(var2);
				} catch (IOException var4) {
					this.field1917 = 1;
				}

				this.field1917 = 1;
				this.field1921 = 0;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1847546740"
	)
	public void method3669() {
		if (this.field1913 != null && this.field1913.hasFinished()) {
			if (this.field1913.hasFinished() && this.field1913.await().getResponseCode() == 200 && this.field1914.isEmpty()) {
				String var1 = this.field1913.await().getResponseBody();
				if (var1.isEmpty()) {
					return;
				}

				this.field1914 = var1;
			}

			if (this.field1921 != 0) {
				this.method3662();
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "0"
	)
	public boolean method3681(String var1) {
		this.method3657(2, var1);
		return true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Las;",
		garbageValue = "2139871169"
	)
	AsyncHttpResponse method3666(String var1) throws IOException {
		URL var2 = new URL(var1);
		HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST, this.field1924);

		try {
			JSONObject var4 = new JSONObject();
			var3.setPayload(new HttpJsonRequestBody(var4));
		} catch (Exception var5) {
		}

		return this.field1926.submitRequest(var3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lux;I)Ljava/lang/String;",
		garbageValue = "-607802431"
	)
	public static String method3692(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			boolean var4;
			char var5;
			for (var3 = var0.length(); var2 < var3; ++var2) {
				var5 = var0.charAt(var2);
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-';
				if (!var4) {
					break;
				}
			}

			while (var3 > var2) {
				var5 = var0.charAt(var3 - 1);
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-';
				if (!var4) {
					break;
				}

				--var3;
			}

			int var14 = var3 - var2;
			if (var14 >= 1) {
				byte var6;
				if (var1 == null) {
					var6 = 12;
				} else {
					switch(var1.field5220) {
					case 5:
						var6 = 20;
						break;
					default:
						var6 = 12;
					}
				}

				if (var14 <= var6) {
					StringBuilder var12 = new StringBuilder(var14);

					for (int var15 = var2; var15 < var3; ++var15) {
						char var7 = var0.charAt(var15);
						boolean var8;
						if (Character.isISOControl(var7)) {
							var8 = false;
						} else if (ScriptEvent.isAlphaNumeric(var7)) {
							var8 = true;
						} else {
							char[] var9 = class524.field5232;
							int var10 = 0;

							label117:
							while (true) {
								char var11;
								if (var10 >= var9.length) {
									var9 = class524.field5234;

									for (var10 = 0; var10 < var9.length; ++var10) {
										var11 = var9[var10];
										if (var11 == var7) {
											var8 = true;
											break label117;
										}
									}

									var8 = false;
									break;
								}

								var11 = var9[var10];
								if (var7 == var11) {
									var8 = true;
									break;
								}

								++var10;
							}
						}

						if (var8) {
							char var13;
							switch(var7) {
							case ' ':
							case '-':
							case '_':
							case ' ':
								var13 = '_';
								break;
							case '#':
							case '[':
							case ']':
								var13 = var7;
								break;
							case 'À':
							case 'Á':
							case 'Â':
							case 'Ã':
							case 'Ä':
							case 'à':
							case 'á':
							case 'â':
							case 'ã':
							case 'ä':
								var13 = 'a';
								break;
							case 'Ç':
							case 'ç':
								var13 = 'c';
								break;
							case 'È':
							case 'É':
							case 'Ê':
							case 'Ë':
							case 'è':
							case 'é':
							case 'ê':
							case 'ë':
								var13 = 'e';
								break;
							case 'Í':
							case 'Î':
							case 'Ï':
							case 'í':
							case 'î':
							case 'ï':
								var13 = 'i';
								break;
							case 'Ñ':
							case 'ñ':
								var13 = 'n';
								break;
							case 'Ò':
							case 'Ó':
							case 'Ô':
							case 'Õ':
							case 'Ö':
							case 'ò':
							case 'ó':
							case 'ô':
							case 'õ':
							case 'ö':
								var13 = 'o';
								break;
							case 'Ù':
							case 'Ú':
							case 'Û':
							case 'Ü':
							case 'ù':
							case 'ú':
							case 'û':
							case 'ü':
								var13 = 'u';
								break;
							case 'ß':
								var13 = 'b';
								break;
							case 'ÿ':
							case 'Ÿ':
								var13 = 'y';
								break;
							default:
								var13 = Character.toLowerCase(var7);
							}

							if (var13 != 0) {
								var12.append(var13);
							}
						}
					}

					if (var12.length() == 0) {
						return null;
					}

					return var12.toString();
				}
			}

			return null;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lut;",
		garbageValue = "-1736002696"
	)
	@Export("getDbTableType")
	public static DbTableType getDbTableType(int var0) {
		DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbTableType.field5279.takeFile(39, var0);
			var1 = new DbTableType();
			if (var2 != null) {
				var1.method9532(new Buffer(var2));
			}

			var1.method9534();
			DbTableType.DBTableType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-624427900"
	)
	static int method3691(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class392.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = class216.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = class137.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == class415.World_worlds[var8].id) {
							var7 = class415.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					class13.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 3] == 1;
					HttpContentType.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							class13.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
							var5 = WorldMapData_1.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = class134.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class134.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							class13.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
							var5 = WorldMapData_1.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = HitSplatDefinition.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = HitSplatDefinition.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							class13.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
							var5 = WorldMapData_1.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = KeyHandler.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = KeyHandler.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							class13.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
							var5 = WorldMapData_1.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = ScriptEvent.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = ScriptEvent.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--class166.Interpreter_stringStackSize;
							--class13.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--class166.Interpreter_stringStackSize;
							--class13.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.field533;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = class415.World_worlds[var3];
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}
