import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
@ObfuscatedName("be")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	SecureRandomCallable() {
	}

	public Object call() {
		return Script.method1936();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)[Lfo;", garbageValue = "-1858925619")
	static HorizontalAlignment[] method2032() {
		return new HorizontalAlignment[]{ HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1898, HorizontalAlignment.field1895 };
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(descriptor = "(ILbz;ZB)I", garbageValue = "1")
	static int method2026(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (class4.loadWorlds()) ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = GraphicsObject.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
				}
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = FriendSystem.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
				}
				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					var7 = null;
					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == World.World_worlds[var8].id) {
							var7 = World.World_worlds[var8];
							break;
						}
					}
					if (var7 != null) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
					}
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					User.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 3] == 1;
					InterfaceParent.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							User.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
							var5 = DesktopPlatformInfoProvider.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = class119.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class119.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}
							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							User.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
							var5 = DesktopPlatformInfoProvider.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = FileSystem.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = FileSystem.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}
							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							User.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
							var5 = DesktopPlatformInfoProvider.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = AttackOption.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = AttackOption.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}
							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							User.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
							var5 = DesktopPlatformInfoProvider.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = class388.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class388.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}
							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (Client.onMobile) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--UserComparator8.Interpreter_stringStackSize;
							--User.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--UserComparator8.Interpreter_stringStackSize;
							--User.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.field482;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = World.World_worlds[var3];
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
					}
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(descriptor = "(IIIILqn;Lkl;B)V", garbageValue = "-2")
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method8091(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}
			}
		}
	}
}