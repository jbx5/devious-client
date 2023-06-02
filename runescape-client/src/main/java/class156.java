import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gw")
public class class156 extends class142 {
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = -249560307
   )
   static int field1726;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 888431855
   )
   int field1725;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfh;"
   )
   final class145 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfh;)V"
   )
   class156(class145 var1) {
      this.this$0 = var1;
      this.field1725 = -1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)V",
      garbageValue = "59"
   )
   void vmethod3381(Buffer var1) {
      this.field1725 = var1.readUnsignedShort();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfs;B)V",
      garbageValue = "-72"
   )
   void vmethod3382(ClanSettings var1) {
      var1.method3211(this.field1725);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZB)I",
      garbageValue = "123"
   )
   static int method3294(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.SOUND_SYNTH) {
         Interpreter.Interpreter_intStackSize -= 3;
         SpriteMask.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]);
         return 1;
      } else if (var0 == ScriptOpcodes.SOUND_SONG) {
         MusicPatch.playSong(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         return 1;
      } else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
         Interpreter.Interpreter_intStackSize -= 2;
         HealthBarUpdate.method2400(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
         return 1;
      } else {
         class90 var3;
         class89 var4;
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
                     class90 var16 = (class90)GameObject.findEnumerated(SoundSystem.method817(), var9);
                     if (var16 != null) {
                        var10 = var16 != class90.field1091 ? 1 : 0;
                     }

                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var10;
                     return 1;
                  } else if (var0 == 3218) {
                     var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                     var10 = 0;
                     class89 var11 = (class89)GameObject.findEnumerated(WorldMapDecorationType.method6590(), var9);
                     if (var11 != null) {
                        var10 = var11 != class89.field1082 ? 1 : 0;
                     }

                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var10;
                     return 1;
                  } else if (var0 != 3217 && var0 != 3219) {
                     return 2;
                  } else {
                     var3 = class90.field1091;
                     var4 = class89.field1082;
                     var13 = true;
                     boolean var14 = true;
                     int var7;
                     if (var0 == 3217) {
                        var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        var3 = (class90)GameObject.findEnumerated(SoundSystem.method817(), var7);
                        if (var3 == null) {
                           throw new RuntimeException(String.format("Unrecognized device option %d", var7));
                        }
                     }

                     if (var0 == 3219) {
                        var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        var4 = (class89)GameObject.findEnumerated(WorldMapDecorationType.method6590(), var7);
                        if (var4 == null) {
                           throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                        }
                     }

                     String var8;
                     byte var15;
                     if (var4 == class89.field1082) {
                        switch (var3.field1095) {
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
                        switch (var4.field1086) {
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
               var3 = class90.field1091;
               var4 = class89.field1082;
               var13 = false;
               if (var0 == 3214) {
                  var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var3 = (class90)GameObject.findEnumerated(SoundSystem.method817(), var6);
                  if (var3 == null) {
                     throw new RuntimeException(String.format("Unrecognized device option %d", var6));
                  }
               }

               if (var0 == 3215) {
                  var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = (class89)GameObject.findEnumerated(WorldMapDecorationType.method6590(), var6);
                  if (var4 == null) {
                     throw new RuntimeException(String.format("Unrecognized game option %d", var6));
                  }
               }

               if (var0 == 3210) {
                  var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var3 = (class90)GameObject.findEnumerated(SoundSystem.method817(), var6);
                  if (var3 == null) {
                     var4 = (class89)GameObject.findEnumerated(WorldMapDecorationType.method6590(), var6);
                     if (var4 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var6));
                     }
                  }
               } else if (var0 == 3182) {
                  var3 = class90.field1094;
               } else if (var0 == 3204) {
                  var4 = class89.field1083;
               } else if (var0 == 3206) {
                  var4 = class89.field1084;
               } else if (var0 == 3208) {
                  var4 = class89.field1085;
               }

               if (var4 == class89.field1082) {
                  switch (var3.field1095) {
                     case 1:
                        var5 = class10.clientPreferences.method2472() ? 1 : 0;
                        break;
                     case 2:
                        var5 = class10.clientPreferences.method2437() ? 1 : 0;
                        break;
                     case 3:
                        var5 = class10.clientPreferences.method2448() ? 1 : 0;
                        break;
                     case 4:
                        var5 = class10.clientPreferences.method2442();
                        break;
                     case 5:
                        var5 = class60.method1119();
                        break;
                     default:
                        var12 = String.format("Unkown device option: %s.", var3.toString());
                        throw new RuntimeException(var12);
                  }
               } else {
                  switch (var4.field1086) {
                     case 1:
                        var5 = class10.clientPreferences.method2434() ? 1 : 0;
                        break;
                     case 2:
                        var6 = class10.clientPreferences.method2488();
                        var5 = Math.round((float)(var6 * 100) / 255.0F);
                        break;
                     case 3:
                        var6 = class10.clientPreferences.method2445();
                        var5 = Math.round((float)(var6 * 100) / 127.0F);
                        break;
                     case 4:
                        var6 = class10.clientPreferences.method2450();
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
            var3 = class90.field1091;
            var4 = class89.field1082;
            var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (var0 == 3212) {
               var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               var3 = (class90)GameObject.findEnumerated(SoundSystem.method817(), var6);
               if (var3 == null) {
                  throw new RuntimeException(String.format("Unrecognized device option %d", var6));
               }
            }

            if (var0 == 3213) {
               var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               var4 = (class89)GameObject.findEnumerated(WorldMapDecorationType.method6590(), var6);
               if (var4 == null) {
                  throw new RuntimeException(String.format("Unrecognized game option %d", var6));
               }
            }

            if (var0 == 3209) {
               var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               var3 = (class90)GameObject.findEnumerated(SoundSystem.method817(), var6);
               if (var3 == null) {
                  var4 = (class89)GameObject.findEnumerated(WorldMapDecorationType.method6590(), var6);
                  if (var4 == null) {
                     throw new RuntimeException(String.format("Unrecognized client option %d", var6));
                  }
               }
            } else if (var0 == 3181) {
               var3 = class90.field1094;
            } else if (var0 == 3203) {
               var4 = class89.field1083;
            } else if (var0 == 3205) {
               var4 = class89.field1084;
            } else if (var0 == 3207) {
               var4 = class89.field1085;
            }

            if (var4 == class89.field1082) {
               switch (var3.field1095) {
                  case 1:
                     class10.clientPreferences.method2524(var5 == 1);
                     break;
                  case 2:
                     class10.clientPreferences.method2436(var5 == 1);
                     break;
                  case 3:
                     class10.clientPreferences.method2438(var5 == 1);
                     break;
                  case 4:
                     if (var5 < 0) {
                        var5 = 0;
                     }

                     class10.clientPreferences.method2452(var5);
                     break;
                  case 5:
                     class164.method3366(var5);
                     break;
                  default:
                     var12 = String.format("Unkown device option: %s.", var3.toString());
                     throw new RuntimeException(var12);
               }
            } else {
               switch (var4.field1086) {
                  case 1:
                     class10.clientPreferences.method2489(var5 == 1);
                     break;
                  case 2:
                     var5 = Math.min(Math.max(var5, 0), 100);
                     var6 = Math.round((float)(var5 * 255) / 100.0F);
                     class209.method4117(var6);
                     break;
                  case 3:
                     var5 = Math.min(Math.max(var5, 0), 100);
                     var6 = Math.round((float)(var5 * 127) / 100.0F);
                     ClanChannelMember.method3136(var6);
                     break;
                  case 4:
                     var5 = Math.min(Math.max(var5, 0), 100);
                     var6 = Math.round((float)(var5 * 127) / 100.0F);
                     class134.method3041(var6);
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
