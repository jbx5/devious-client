import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ex")
public class class141 extends class136 {
   @ObfuscatedName("bb")
   @Export("otp")
   static String otp;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -567167913
   )
   int field1683;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 923571903
   )
   int field1682;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -841112261
   )
   int field1681;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 2108363067
   )
   int field1680;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   final class139 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lem;)V"
   )
   class141(class139 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1101327225"
   )
   void vmethod3349(Buffer var1) {
      this.field1683 = var1.readInt();
      this.field1680 = var1.readInt();
      this.field1682 = var1.readUnsignedByte();
      this.field1681 = var1.readUnsignedByte();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lep;I)V",
      garbageValue = "839088249"
   )
   void vmethod3350(ClanSettings var1) {
      var1.method3180(this.field1683, this.field1680, this.field1682, this.field1681);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZB)I",
      garbageValue = "108"
   )
   static int method3107(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class29.loadWorlds() ? 1 : 0;
         return 1;
      } else {
         World var9;
         if (var0 == ScriptOpcodes.WORLDLIST_START) {
            var9 = PlayerComposition.worldListStart();
            if (var9 != null) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var9.id;
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var9.properties;
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity;
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var9.location;
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var9.population;
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host;
            } else {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
            var9 = UserComparator9.getNextWorldListWorld();
            if (var9 != null) {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var9.id;
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var9.properties;
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity;
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var9.location;
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var9.population;
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host;
            } else {
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else {
            int var3;
            World var7;
            int var8;
            if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               var7 = null;

               for(var8 = 0; var8 < World.World_count; ++var8) {
                  if (var3 == World.World_worlds[var8].id) {
                     var7 = World.World_worlds[var8];
                     break;
                  }
               }

               if (var7 != null) {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7.id;
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7.properties;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity;
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7.location;
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7.population;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host;
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
               class87.Interpreter_intStackSize -= 4;
               var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
               boolean var10 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1] == 1;
               var8 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2];
               boolean var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 3] == 1;
               class416.sortWorldList(var3, var10, var8, var6);
               return 1;
            } else if (var0 != 6511) {
               if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
                  Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1;
                  return 1;
               } else {
                  int var4;
                  ParamComposition var5;
                  if (var0 == ScriptOpcodes.NC_PARAM) {
                     class87.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
                     var5 = class149.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class129.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class129.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.LC_PARAM) {
                     class87.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
                     var5 = class149.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = VarpDefinition.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = VarpDefinition.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.OC_PARAM) {
                     class87.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
                     var5 = class149.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = NPCComposition.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = NPCComposition.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
                     class87.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
                     var5 = class149.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = UserComparator3.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = UserComparator3.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.ON_MOBILE) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CLIENTTYPE) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.clientType;
                     return 1;
                  } else if (var0 == 6520) {
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
                     return 1;
                  } else if (var0 == 6522) {
                     --Interpreter.Interpreter_stringStackSize;
                     --class87.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == 6523) {
                     --Interpreter.Interpreter_stringStackSize;
                     --class87.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1;
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1;
                     return 1;
                  } else if (var0 == 6527) {
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.field698;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               if (var3 >= 0 && var3 < World.World_count) {
                  var7 = World.World_worlds[var3];
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7.id;
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7.properties;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity;
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7.location;
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7.population;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host;
               } else {
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            }
         }
      }
   }
}
