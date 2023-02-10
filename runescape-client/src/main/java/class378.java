import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("na")
public class class378 {
   @ObfuscatedName("vf")
   @ObfuscatedGetter(
      intValue = 1549309693
   )
   @Export("foundItemIdCount")
   static int foundItemIdCount;
   @ObfuscatedName("la")
   @ObfuscatedSignature(
      descriptor = "Lkz;"
   )
   static Widget field4437;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -880447267
   )
   int field4442;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1086284991
   )
   int field4438;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1922297331
   )
   int field4439;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1946808189
   )
   int field4441;

   public String toString() {
      boolean var1 = true;
      int var2 = 10 - Integer.toString(this.field4442).length();
      int var3 = 10 - Integer.toString(this.field4439).length();
      int var4 = 10 - Integer.toString(this.field4438).length();
      String var5 = "          ".substring(10 - var2);
      String var6 = "          ".substring(10 - var3);
      String var7 = "          ".substring(10 - var4);
      return "    Size: " + this.field4442 + var5 + "Created: " + this.field4438 + var7 + "Total used: " + this.field4439 + var6 + "Max-In-Use: " + this.field4441;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "-1374612729"
   )
   static int method7358(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class290.loadWorlds() ? 1 : 0;
         return 1;
      } else {
         World var9;
         if (var0 == ScriptOpcodes.WORLDLIST_START) {
            var9 = class108.worldListStart();
            if (var9 != null) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var9.id;
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var9.properties;
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var9.activity;
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var9.location;
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var9.population;
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var9.host;
            } else {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
            var9 = TileItem.getNextWorldListWorld();
            if (var9 != null) {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var9.id;
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var9.properties;
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var9.activity;
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var9.location;
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var9.population;
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var9.host;
            } else {
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else {
            int var3;
            World var7;
            int var8;
            if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
               var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
               var7 = null;

               for(var8 = 0; var8 < World.World_count; ++var8) {
                  if (var3 == class88.World_worlds[var8].id) {
                     var7 = class88.World_worlds[var8];
                     break;
                  }
               }

               if (var7 != null) {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7.id;
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7.properties;
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7.activity;
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7.location;
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7.population;
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7.host;
               } else {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
               class302.Interpreter_intStackSize -= 4;
               var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
               boolean var10 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1] == 1;
               var8 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2];
               boolean var6 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 3] == 1;
               SecureRandomCallable.sortWorldList(var3, var10, var8, var6);
               return 1;
            } else if (var0 != 6511) {
               if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
                  Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1;
                  return 1;
               } else {
                  int var4;
                  ParamComposition var5;
                  if (var0 == ScriptOpcodes.NC_PARAM) {
                     class302.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
                     var5 = ClanChannelMember.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = class137.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class137.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.LC_PARAM) {
                     class302.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
                     var5 = ClanChannelMember.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = class463.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class463.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.OC_PARAM) {
                     class302.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
                     var5 = ClanChannelMember.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = TileItem.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = TileItem.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
                     class302.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
                     var5 = ClanChannelMember.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = Actor.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Actor.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.ON_MOBILE) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CLIENTTYPE) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.clientType;
                     return 1;
                  } else if (var0 == 6520) {
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
                     return 1;
                  } else if (var0 == 6522) {
                     --class20.Interpreter_stringStackSize;
                     --class302.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == 6523) {
                     --class20.Interpreter_stringStackSize;
                     --class302.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1;
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1;
                     return 1;
                  } else if (var0 == 6527) {
                     Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.field503;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
               if (var3 >= 0 && var3 < World.World_count) {
                  var7 = class88.World_worlds[var3];
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7.id;
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7.properties;
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7.activity;
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7.location;
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7.population;
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7.host;
               } else {
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            }
         }
      }
   }
}
