import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.json.JSONObject;

@ObfuscatedName("im")
public class class208 {
	@ObfuscatedName("ag")
	static byte[][][] field2278;
	@ObfuscatedName("ak")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field2281;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	class217 field2271;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	class219 field2272;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1301667135
	)
	int field2279;
	@ObfuscatedName("ad")
	String field2266;
	@ObfuscatedName("ax")
	String field2275;
	@ObfuscatedName("aw")
	String field2276;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	UrlRequest field2268;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 228744253
	)
	int field2273;

	public class208() {
		this.field2279 = -1;
		this.field2273 = 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lia;",
		garbageValue = "2034915381"
	)
	public class217 method4142() {
		return this.field2271;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Leg;I)Z",
		garbageValue = "622964867"
	)
	public boolean method4143(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) {
				return false;
			} else {
				this.method4203();

				try {
					this.field2266 = var1;
					this.field2268 = var3.request(new URL(this.field2266));
					this.field2279 = 0;
				} catch (MalformedURLException var5) {
					this.method4203();
					this.field2279 = 4;
					return false;
				}

				if (!var2.isEmpty()) {
					this.field2276 = var2;
				}

				return true;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1783507288"
	)
	public void method4144(String var1, String var2, String var3) {
		this.field2271 = KitDefinition.method3664();
		this.field2275 = var1;
		this.field2271.method4282(this.field2275, var2, var3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Leg;I)V",
		garbageValue = "-1129453669"
	)
	public void method4145(UrlRequester var1) {
		switch(this.field2279) {
		case 0:
			this.method4163(var1);
			break;
		case 1:
			this.method4177();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method4146() {
		return this.field2279;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1491243664"
	)
	public int method4147(String var1) {
		return this.field2272.field2355.containsKey(var1) ? (Integer)this.field2272.field2355.get(var1) : -1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-56"
	)
	public String method4184(String var1) {
		return (String)((String)(this.field2272.field2359.containsKey(var1) ? this.field2272.field2359.get(var1) : null));
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/util/ArrayList;",
		garbageValue = "-23919"
	)
	public ArrayList method4149() {
		return this.field2272.field2354;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "-40"
	)
	public ArrayList method4150() {
		return this.field2272.field2357;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-2005371580"
	)
	public ArrayList method4151() {
		return this.field2272.field2353;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1062462142"
	)
	public String method4141() {
		return this.field2272.field2356;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "0"
	)
	public float[] method4153() {
		return this.field2272.field2358;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-8577"
	)
	public String method4154() {
		return this.field2272.method4316();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-334030953"
	)
	void method4203() {
		this.field2268 = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Leg;I)V",
		garbageValue = "-200766024"
	)
	void method4163(UrlRequester var1) {
		if (this.field2268 != null && this.field2268.isDone()) {
			byte[] var2 = this.field2268.getResponse();
			if (var2 == null) {
				this.method4203();
				this.field2279 = 4;
			} else {
				try {
					HttpJsonRequestBody var3 = new HttpJsonRequestBody(var2);
					JSONObject var4 = var3.getBody();
					if (var4 == null) {
						return;
					}

					try {
						this.field2273 = var4.getInt("version");
					} catch (Exception var6) {
						this.method4203();
						this.field2279 = 6;
						return;
					}

					if (this.field2273 < 2) {
						if (!this.field2272.method4319(var4, this.field2273, var1)) {
							this.field2279 = 6;
						}
					} else if (this.field2273 == 2) {
						class221 var5 = Bounds.method8500();
						var5.method4351(var4, this.field2273, var1);
						this.field2272 = var5.method4354(this.field2276);
						if (this.field2272 != null) {
							this.method4177();
							this.field2279 = 1;
						} else {
							this.field2279 = 7;
						}
					}
				} catch (UnsupportedEncodingException var7) {
					this.method4203();
					this.field2279 = 6;
					return;
				}

				if (this.field2272 != null) {
					this.field2279 = this.field2272.field2354.size() > 0 ? 1 : 2;
				}

				this.field2268 = null;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "468386678"
	)
	void method4177() {
		Iterator var1 = this.field2272.field2354.iterator();

		class209 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field2272.field2354.iterator();

				while (var1.hasNext()) {
					var2 = (class209)var1.next();
					if (var2.field2284 != null) {
						byte[] var3 = var2.field2284.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field2279 = 2;
							return;
						}
					}
				}

				this.method4203();
				this.field2279 = 5;
				return;
			}

			var2 = (class209)var1.next();
		} while(var2.field2284 == null || var2.field2284.isDone());

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Leg;I)Z",
		garbageValue = "-2143084268"
	)
	public boolean method4191(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new HttpJsonRequestBody(var1.getBytes())).getBody();

			try {
				this.field2273 = var3.getInt("version");
			} catch (Exception var5) {
				this.method4203();
				this.field2279 = 6;
				return false;
			}

			if (!this.field2272.method4319(var3, this.field2273, var2)) {
				this.field2279 = 6;
			}

			this.field2279 = this.field2272.field2354.size() > 0 ? 1 : 2;
		} catch (UnsupportedEncodingException var6) {
			this.field2279 = 6;
		}

		return this.field2279 < 3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-103"
	)
	public static void method4205() {
		synchronized(MouseHandler.MouseHandler_instance) {
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
			MouseHandler.MouseHandler_lastButtonVolatile = 0;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-110"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-33"
	)
	static int method4155(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class281.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = class304.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = GameEngine.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == World.World_worlds[var8].id) {
							var7 = World.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					UserComparator6.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3] == 1;
					HttpResponse.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							UserComparator6.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
							var5 = class6.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = Script.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Script.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							UserComparator6.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
							var5 = class6.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = class137.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class137.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							UserComparator6.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
							var5 = class6.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = class341.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class341.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							UserComparator6.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
							var5 = class6.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = Script.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Script.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--class211.Interpreter_stringStackSize;
							--UserComparator6.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--class211.Interpreter_stringStackSize;
							--UserComparator6.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.field667;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = World.World_worlds[var3];
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}
