import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cq")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Loy;"
   )
   @Export("objectSounds")
   static NodeDeque objectSounds = new NodeDeque();
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 958334097
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -884169787
   )
   @Export("x")
   int x;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 242121143
   )
   @Export("y")
   int y;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 2037147520
   )
   @Export("maxX")
   int maxX;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1485390208
   )
   @Export("maxY")
   int maxY;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 170081973
   )
   int field843;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1112977525
   )
   @Export("soundEffectId")
   int soundEffectId;
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Lbu;"
   )
   @Export("stream1")
   RawPcmStream stream1;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -305868053
   )
   int field845;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 301142655
   )
   int field836;
   @ObfuscatedName("aa")
   @Export("soundEffectIds")
   int[] soundEffectIds;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1490558417
   )
   int field848;
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Lbu;"
   )
   @Export("stream2")
   RawPcmStream stream2;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lhx;"
   )
   @Export("obj")
   ObjectComposition obj;

   ObjectSound() {
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "2"
   )
   @Export("set")
   void set() {
      int var1 = this.soundEffectId;
      ObjectComposition var2 = this.obj.transform();
      if (var2 != null) {
         this.soundEffectId = var2.ambientSoundId;
         this.field843 = var2.int7 * 128;
         this.field845 = var2.int5;
         this.field836 = var2.int6;
         this.soundEffectIds = var2.soundEffectIds;
      } else {
         this.soundEffectId = -1;
         this.field843 = 0;
         this.field845 = 0;
         this.field836 = 0;
         this.soundEffectIds = null;
      }

      if (var1 != this.soundEffectId && this.stream1 != null) {
         KitDefinition.pcmStreamMixer.removeSubStream(this.stream1);
         this.stream1 = null;
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lnq;Lnq;I)V",
      garbageValue = "1503120743"
   )
   public static void method1883(AbstractArchive var0, AbstractArchive var1) {
      SpotAnimationDefinition.SpotAnimationDefinition_archive = var0;
      SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)[Ley;",
      garbageValue = "1661675157"
   )
   static class127[] method1875() {
      return new class127[]{class127.field1494, class127.field1486, class127.field1487, class127.field1488, class127.field1491};
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZI)I",
      garbageValue = "145020276"
   )
   static int method1881(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class497.loadWorlds() ? 1 : 0;
         return 1;
      } else {
         World var9;
         if (var0 == ScriptOpcodes.WORLDLIST_START) {
            var9 = class17.worldListStart();
            if (var9 != null) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties;
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var9.activity;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population;
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var9.host;
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
            var9 = class171.getNextWorldListWorld();
            if (var9 != null) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties;
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var9.activity;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population;
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var9.host;
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else {
            int var3;
            World var7;
            int var8;
            if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               var7 = null;

               for(var8 = 0; var8 < World.World_count; ++var8) {
                  if (var3 == World.World_worlds[var8].id) {
                     var7 = World.World_worlds[var8];
                     break;
                  }
               }

               if (var7 != null) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties;
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7.activity;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population;
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7.host;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
               Interpreter.Interpreter_intStackSize -= 4;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
               var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
               boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1;
               class309.sortWorldList(var3, var10, var8, var6);
               return 1;
            } else if (var0 != 6511) {
               if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
                  Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                  return 1;
               } else {
                  int var4;
                  ParamComposition var5;
                  if (var0 == ScriptOpcodes.NC_PARAM) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var5 = ModeWhere.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = Bounds.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Bounds.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.LC_PARAM) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var5 = ModeWhere.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class175.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class175.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.OC_PARAM) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var5 = ModeWhere.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class300.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class300.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var5 = ModeWhere.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class139.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class139.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.ON_MOBILE) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CLIENTTYPE) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.clientType;
                     return 1;
                  } else if (var0 == 6520) {
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
                     return 1;
                  } else if (var0 == 6522) {
                     --class149.Interpreter_stringStackSize;
                     --Interpreter.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == 6523) {
                     --class149.Interpreter_stringStackSize;
                     --Interpreter.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
                     return 1;
                  } else if (var0 == 6527) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field510;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (var3 >= 0 && var3 < World.World_count) {
                  var7 = World.World_worlds[var3];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties;
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7.activity;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population;
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7.host;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            }
         }
      }
   }
}
