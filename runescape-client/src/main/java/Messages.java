import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ex")
@Implements("Messages")
public class Messages {
   @ObfuscatedName("aj")
   @Export("Messages_channels")
   static final Map Messages_channels = new HashMap();
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lrz;"
   )
   @Export("Messages_hashTable")
   static final IterableNodeHashTable Messages_hashTable = new IterableNodeHashTable(1024);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lnh;"
   )
   @Export("Messages_queue")
   static final IterableDualNodeQueue Messages_queue = new IterableDualNodeQueue();
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -2117975007
   )
   @Export("Messages_count")
   static int Messages_count = 0;
   @ObfuscatedName("gl")
   @ObfuscatedGetter(
      intValue = -943031545
   )
   static int field1375;
   @ObfuscatedName("qp")
   @ObfuscatedSignature(
      descriptor = "Lrw;"
   )
   @Export("HitSplatDefinition_cached")
   static class462 HitSplatDefinition_cached;

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZI)I",
      garbageValue = "577265757"
   )
   static int method2762(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.SOUND_SYNTH) {
         Interpreter.Interpreter_intStackSize -= 3;
         Skills.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]);
         return 1;
      } else if (var0 == ScriptOpcodes.SOUND_SONG) {
         Language.playSong(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         return 1;
      } else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
         Interpreter.Interpreter_intStackSize -= 2;
         class19.method278(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
         return 1;
      } else {
         class88 var3;
         class87 var4;
         int var5;
         int var6;
         String var12;
         if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
            boolean var13;
            if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
               if (var0 == 3211) {
                  return 1;
               } else {
                  int var9;
                  int var10;
                  if (var0 == 3216) {
                     var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     var10 = 0;
                     class88 var16 = (class88)SpriteMask.findEnumerated(ParamComposition.method3791(), var9);
                     if (var16 != null) {
                        var10 = var16 != class88.field1083 ? 1 : 0;
                     }

                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var10;
                     return 1;
                  } else if (var0 == 3218) {
                     var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     var10 = 0;
                     class87 var11 = (class87)SpriteMask.findEnumerated(class122.method2896(), var9);
                     if (var11 != null) {
                        var10 = var11 != class87.field1069 ? 1 : 0;
                     }

                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var10;
                     return 1;
                  } else if (var0 != 3217 && var0 != 3219) {
                     return 2;
                  } else {
                     var3 = class88.field1083;
                     var4 = class87.field1069;
                     var13 = true;
                     boolean var14 = true;
                     int var7;
                     if (var0 == 3217) {
                        var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        var3 = (class88)SpriteMask.findEnumerated(ParamComposition.method3791(), var7);
                        if (var3 == null) {
                           throw new RuntimeException(String.format("Unrecognized device option %d", var7));
                        }
                     }

                     if (var0 == 3219) {
                        var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        var4 = (class87)SpriteMask.findEnumerated(class122.method2896(), var7);
                        if (var4 == null) {
                           throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                        }
                     }

                     String var8;
                     byte var15;
                     if (var4 == class87.field1069) {
                        switch (var3.field1079) {
                           case 1:
                           case 2:
                           case 3:
                              var15 = 0;
                              var6 = 1;
                              break;
                           case 4:
                              var15 = 0;
                              var6 = Integer.MAX_VALUE;
                              break;
                           case 5:
                              var15 = 0;
                              var6 = 100;
                              break;
                           default:
                              var8 = String.format("Unkown device option: %s.", var3.toString());
                              throw new RuntimeException(var8);
                        }
                     } else {
                        switch (var4.field1073) {
                           case 1:
                              var15 = 0;
                              var6 = 1;
                              break;
                           case 2:
                           case 3:
                           case 4:
                              var15 = 0;
                              var6 = 100;
                              break;
                           default:
                              var8 = String.format("Unkown game option: %s.", var4.toString());
                              throw new RuntimeException(var8);
                        }
                     }

                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var15;
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6;
                     return 1;
                  }
               }
            } else {
               var3 = class88.field1083;
               var4 = class87.field1069;
               var13 = false;
               if (var0 == 3214) {
                  var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var3 = (class88)SpriteMask.findEnumerated(ParamComposition.method3791(), var6);
                  if (var3 == null) {
                     throw new RuntimeException(String.format("Unrecognized device option %d", var6));
                  }
               }

               if (var0 == 3215) {
                  var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (class87)SpriteMask.findEnumerated(class122.method2896(), var6);
                  if (var4 == null) {
                     throw new RuntimeException(String.format("Unrecognized game option %d", var6));
                  }
               }

               if (var0 == 3210) {
                  var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var3 = (class88)SpriteMask.findEnumerated(ParamComposition.method3791(), var6);
                  if (var3 == null) {
                     var4 = (class87)SpriteMask.findEnumerated(class122.method2896(), var6);
                     if (var4 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var6));
                     }
                  }
               } else if (var0 == 3182) {
                  var3 = class88.field1082;
               } else if (var0 == 3204) {
                  var4 = class87.field1070;
               } else if (var0 == 3206) {
                  var4 = class87.field1076;
               } else if (var0 == 3208) {
                  var4 = class87.field1072;
               }

               if (var4 == class87.field1069) {
                  switch (var3.field1079) {
                     case 1:
                        var5 = WorldMapSectionType.clientPreferences.method2429() ? 1 : 0;
                        break;
                     case 2:
                        var5 = WorldMapSectionType.clientPreferences.method2445() ? 1 : 0;
                        break;
                     case 3:
                        var5 = WorldMapSectionType.clientPreferences.method2426() ? 1 : 0;
                        break;
                     case 4:
                        var5 = WorldMapSectionType.clientPreferences.method2529();
                        break;
                     case 5:
                        var5 = NetCache.method6534();
                        break;
                     default:
                        var12 = String.format("Unkown device option: %s.", var3.toString());
                        throw new RuntimeException(var12);
                  }
               } else {
                  switch (var4.field1073) {
                     case 1:
                        var5 = WorldMapSectionType.clientPreferences.method2458() ? 1 : 0;
                        break;
                     case 2:
                        var6 = WorldMapSectionType.clientPreferences.method2440();
                        var5 = Math.round((float)(var6 * 100) / 255.0F);
                        break;
                     case 3:
                        var6 = WorldMapSectionType.clientPreferences.method2442();
                        var5 = Math.round((float)(var6 * 100) / 127.0F);
                        break;
                     case 4:
                        var6 = WorldMapSectionType.clientPreferences.method2463();
                        var5 = Math.round((float)(var6 * 100) / 127.0F);
                        break;
                     default:
                        var12 = String.format("Unkown game option: %s.", var4.toString());
                        throw new RuntimeException(var12);
                  }
               }

               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
               return 1;
            }
         } else {
            var3 = class88.field1083;
            var4 = class87.field1069;
            var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (var0 == 3212) {
               var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               var3 = (class88)SpriteMask.findEnumerated(ParamComposition.method3791(), var6);
               if (var3 == null) {
                  throw new RuntimeException(String.format("Unrecognized device option %d", var6));
               }
            }

            if (var0 == 3213) {
               var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               var4 = (class87)SpriteMask.findEnumerated(class122.method2896(), var6);
               if (var4 == null) {
                  throw new RuntimeException(String.format("Unrecognized game option %d", var6));
               }
            }

            if (var0 == 3209) {
               var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               var3 = (class88)SpriteMask.findEnumerated(ParamComposition.method3791(), var6);
               if (var3 == null) {
                  var4 = (class87)SpriteMask.findEnumerated(class122.method2896(), var6);
                  if (var4 == null) {
                     throw new RuntimeException(String.format("Unrecognized client option %d", var6));
                  }
               }
            } else if (var0 == 3181) {
               var3 = class88.field1082;
            } else if (var0 == 3203) {
               var4 = class87.field1070;
            } else if (var0 == 3205) {
               var4 = class87.field1076;
            } else if (var0 == 3207) {
               var4 = class87.field1072;
            }

            if (var4 == class87.field1069) {
               switch (var3.field1079) {
                  case 1:
                     WorldMapSectionType.clientPreferences.method2459(var5 == 1);
                     break;
                  case 2:
                     WorldMapSectionType.clientPreferences.method2500(var5 == 1);
                     break;
                  case 3:
                     WorldMapSectionType.clientPreferences.method2523(var5 == 1);
                     break;
                  case 4:
                     if (var5 < 0) {
                        var5 = 0;
                     }

                     WorldMapSectionType.clientPreferences.method2435(var5);
                     break;
                  case 5:
                     Skeleton.method4384(var5);
                     break;
                  default:
                     var12 = String.format("Unkown device option: %s.", var3.toString());
                     throw new RuntimeException(var12);
               }
            } else {
               switch (var4.field1073) {
                  case 1:
                     WorldMapSectionType.clientPreferences.method2432(var5 == 1);
                     break;
                  case 2:
                     var5 = Math.min(Math.max(var5, 0), 100);
                     var6 = Math.round((float)(var5 * 255) / 100.0F);
                     class70.method2047(var6);
                     break;
                  case 3:
                     var5 = Math.min(Math.max(var5, 0), 100);
                     var6 = Math.round((float)(var5 * 127) / 100.0F);
                     ApproximateRouteStrategy.method1201(var6);
                     break;
                  case 4:
                     var5 = Math.min(Math.max(var5, 0), 100);
                     var6 = Math.round((float)(var5 * 127) / 100.0F);
                     class12.method151(var6);
                     break;
                  default:
                     var12 = String.format("Unkown game option: %s.", var4.toString());
                     throw new RuntimeException(var12);
               }
            }

            return 1;
         }
      }
   }
}
