import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dc")
public class class122 {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1091024745
   )
   public final int field1491;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Ldc;"
   )
   public class122 field1500;
   @ObfuscatedName("v")
   float[][] field1488;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "[Lpb;"
   )
   final class417[] field1489;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "[Lpb;"
   )
   class417[] field1490;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "[Lpb;"
   )
   class417[] field1495;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lpb;"
   )
   class417 field1496 = new class417();
   @ObfuscatedName("n")
   boolean field1493 = true;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lpb;"
   )
   class417 field1494 = new class417();
   @ObfuscatedName("k")
   boolean field1486 = true;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lpb;"
   )
   class417 field1487 = new class417();
   @ObfuscatedName("r")
   float[][] field1497;
   @ObfuscatedName("b")
   float[][] field1498;
   @ObfuscatedName("m")
   float[][] field1492;

   @ObfuscatedSignature(
      descriptor = "(ILrd;Z)V"
   )
   public class122(int var1, Buffer var2, boolean var3) {
      this.field1491 = var2.readShort();
      this.field1489 = new class417[var1];
      this.field1490 = new class417[this.field1489.length];
      this.field1495 = new class417[this.field1489.length];
      this.field1488 = new float[this.field1489.length][3];

      for(int var4 = 0; var4 < this.field1489.length; ++var4) {
         this.field1489[var4] = new class417(var2, var3);
         this.field1488[var4][0] = var2.method8764();
         this.field1488[var4][1] = var2.method8764();
         this.field1488[var4][2] = var2.method8764();
      }

      this.method3013();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1603384529"
   )
   void method3013() {
      this.field1497 = new float[this.field1489.length][3];
      this.field1498 = new float[this.field1489.length][3];
      this.field1492 = new float[this.field1489.length][3];
      class417 var1;
      synchronized(class417.field4641) {
         if (class417.field4643 == 0) {
            var1 = new class417();
         } else {
            class417.field4641[--class417.field4643].method7964();
            var1 = class417.field4641[class417.field4643];
         }
      }

      class417 var2 = var1;

      for(int var5 = 0; var5 < this.field1489.length; ++var5) {
         class417 var4 = this.method2998(var5);
         var2.method7915(var4);
         var2.method7922();
         this.field1497[var5] = var2.method7912();
         this.field1498[var5][0] = var4.field4644[12];
         this.field1498[var5][1] = var4.field4644[13];
         this.field1498[var5][2] = var4.field4644[14];
         this.field1492[var5] = var4.method7924();
      }

      var2.method7908();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)Lpb;",
      garbageValue = "1996728703"
   )
   class417 method2998(int var1) {
      return this.field1489[var1];
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)Lpb;",
      garbageValue = "714615016"
   )
   class417 method3015(int var1) {
      if (this.field1490[var1] == null) {
         this.field1490[var1] = new class417(this.method2998(var1));
         if (this.field1500 != null) {
            this.field1490[var1].method7914(this.field1500.method3015(var1));
         } else {
            this.field1490[var1].method7914(class417.field4646);
         }
      }

      return this.field1490[var1];
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IB)Lpb;",
      garbageValue = "-28"
   )
   class417 method3017(int var1) {
      if (this.field1495[var1] == null) {
         this.field1495[var1] = new class417(this.method3015(var1));
         this.field1495[var1].method7922();
      }

      return this.field1495[var1];
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Lpb;I)V",
      garbageValue = "832632914"
   )
   void method3000(class417 var1) {
      this.field1496.method7915(var1);
      this.field1493 = true;
      this.field1486 = true;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)Lpb;",
      garbageValue = "1963000555"
   )
   class417 method3001() {
      return this.field1496;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)Lpb;",
      garbageValue = "1304604327"
   )
   class417 method3005() {
      if (this.field1493) {
         this.field1494.method7915(this.method3001());
         if (this.field1500 != null) {
            this.field1494.method7914(this.field1500.method3005());
         }

         this.field1493 = false;
      }

      return this.field1494;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IB)Lpb;",
      garbageValue = "20"
   )
   public class417 method3003(int var1) {
      if (this.field1486) {
         this.field1487.method7915(this.method3017(var1));
         this.field1487.method7914(this.method3005());
         this.field1486 = false;
      }

      return this.field1487;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(II)[F",
      garbageValue = "-1657522001"
   )
   float[] method3004(int var1) {
      return this.field1497[var1];
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(II)[F",
      garbageValue = "1874306129"
   )
   float[] method3012(int var1) {
      return this.field1498[var1];
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IB)[F",
      garbageValue = "38"
   )
   float[] method3006(int var1) {
      return this.field1492[var1];
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)Lgi;",
      garbageValue = "-1237924055"
   )
   public static HealthBarDefinition method3028(int var0) {
      HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class303.HealthBarDefinition_archive.takeFile(33, var0);
         var1 = new HealthBarDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)[Ldx;",
      garbageValue = "-13"
   )
   static class127[] method3029() {
      return new class127[]{class127.field1566, class127.field1559, class127.field1568, class127.field1560, class127.field1562, class127.field1578, class127.field1564, class127.field1565, class127.field1561, class127.field1567, class127.field1563, class127.field1569, class127.field1570, class127.field1571, class127.field1572, class127.field1573, class127.field1574};
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-955503656"
   )
   static void method3030(int var0, int var1) {
      long var2 = (long)((var0 << 16) + var1);
      NetFileRequest var4 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var2);
      if (var4 != null) {
         NetCache.NetCache_pendingWritesQueue.addLast(var4);
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "593870439"
   )
   static int method3027(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.SOUND_SYNTH) {
         class302.Interpreter_intStackSize -= 3;
         class275.queueSoundEffect(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]);
         return 1;
      } else if (var0 == ScriptOpcodes.SOUND_SONG) {
         SpriteMask.playSong(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
         return 1;
      } else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
         class302.Interpreter_intStackSize -= 2;
         ScriptEvent.method2321(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]);
         return 1;
      } else {
         class86 var3;
         class85 var4;
         int var5;
         int var6;
         String var7;
         if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
            if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
               return var0 == 3211 ? 1 : 2;
            } else {
               var3 = class86.field1095;
               var4 = class85.field1089;
               boolean var8 = false;
               if (var0 == 3214) {
                  var6 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  var3 = (class86)class4.findEnumerated(PacketBufferNode.method5551(), var6);
                  if (var3 == null) {
                     throw new RuntimeException(String.format("Unrecognized device option %d", var6));
                  }
               }

               if (var0 == 3215) {
                  var6 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  var4 = (class85)class4.findEnumerated(class135.method3131(), var6);
                  if (var4 == null) {
                     throw new RuntimeException(String.format("Unrecognized game option %d", var6));
                  }
               }

               if (var0 == 3210) {
                  var6 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
                  var3 = (class86)class4.findEnumerated(PacketBufferNode.method5551(), var6);
                  if (var3 == null) {
                     var4 = (class85)class4.findEnumerated(class135.method3131(), var6);
                     if (var4 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var6));
                     }
                  }
               } else if (var0 == 3182) {
                  var3 = class86.field1102;
               } else if (var0 == 3204) {
                  var4 = class85.field1084;
               } else if (var0 == 3206) {
                  var4 = class85.field1092;
               } else if (var0 == 3208) {
                  var4 = class85.field1086;
               }

               if (var4 == class85.field1089) {
                  switch (var3.field1103) {
                     case 1:
                        var5 = PacketWriter.clientPreferences.method2484() ? 1 : 0;
                        break;
                     case 2:
                        var5 = PacketWriter.clientPreferences.method2570() ? 1 : 0;
                        break;
                     case 3:
                        var5 = PacketWriter.clientPreferences.method2489() ? 1 : 0;
                        break;
                     case 4:
                        var5 = PacketWriter.clientPreferences.method2491();
                        break;
                     case 5:
                        var5 = class463.method8510();
                        break;
                     default:
                        var7 = String.format("Unkown device option: %s.", var3.toString());
                        throw new RuntimeException(var7);
                  }
               } else {
                  switch (var4.field1087) {
                     case 1:
                        var5 = PacketWriter.clientPreferences.method2572() ? 1 : 0;
                        break;
                     case 2:
                        var6 = PacketWriter.clientPreferences.method2495();
                        var5 = Math.round((float)(var6 * 100) / 255.0F);
                        break;
                     case 3:
                        var6 = PacketWriter.clientPreferences.method2497();
                        var5 = Math.round((float)(var6 * 100) / 127.0F);
                        break;
                     case 4:
                        var6 = PacketWriter.clientPreferences.method2499();
                        var5 = Math.round((float)(var6 * 100) / 127.0F);
                        break;
                     default:
                        var7 = String.format("Unkown game option: %s.", var4.toString());
                        throw new RuntimeException(var7);
                  }
               }

               Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5;
               return 1;
            }
         } else {
            var3 = class86.field1095;
            var4 = class85.field1089;
            var5 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            if (var0 == 3212) {
               var6 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
               var3 = (class86)class4.findEnumerated(PacketBufferNode.method5551(), var6);
               if (var3 == null) {
                  throw new RuntimeException(String.format("Unrecognized device option %d", var6));
               }
            }

            if (var0 == 3213) {
               var6 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
               var4 = (class85)class4.findEnumerated(class135.method3131(), var6);
               if (var4 == null) {
                  throw new RuntimeException(String.format("Unrecognized game option %d", var6));
               }
            }

            if (var0 == 3209) {
               var6 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
               var3 = (class86)class4.findEnumerated(PacketBufferNode.method5551(), var6);
               if (var3 == null) {
                  var4 = (class85)class4.findEnumerated(class135.method3131(), var6);
                  if (var4 == null) {
                     throw new RuntimeException(String.format("Unrecognized client option %d", var6));
                  }
               }
            } else if (var0 == 3181) {
               var3 = class86.field1102;
            } else if (var0 == 3203) {
               var4 = class85.field1084;
            } else if (var0 == 3205) {
               var4 = class85.field1092;
            } else if (var0 == 3207) {
               var4 = class85.field1086;
            }

            if (var4 == class85.field1089) {
               switch (var3.field1103) {
                  case 1:
                     PacketWriter.clientPreferences.method2483(var5 == 1);
                     break;
                  case 2:
                     PacketWriter.clientPreferences.method2563(var5 == 1);
                     break;
                  case 3:
                     PacketWriter.clientPreferences.method2485(var5 == 1);
                     break;
                  case 4:
                     if (var5 < 0) {
                        var5 = 0;
                     }

                     PacketWriter.clientPreferences.method2490(var5);
                     break;
                  case 5:
                     LoginScreenAnimation.method2463(var5);
                     break;
                  default:
                     var7 = String.format("Unkown device option: %s.", var3.toString());
                     throw new RuntimeException(var7);
               }
            } else {
               switch (var4.field1087) {
                  case 1:
                     PacketWriter.clientPreferences.method2551(var5 == 1);
                     break;
                  case 2:
                     var5 = Math.min(Math.max(var5, 0), 100);
                     var6 = Math.round((float)(var5 * 255) / 100.0F);
                     Player.method2369(var6);
                     break;
                  case 3:
                     var5 = Math.min(Math.max(var5, 0), 100);
                     var6 = Math.round((float)(var5 * 127) / 100.0F);
                     class203.method4128(var6);
                     break;
                  case 4:
                     var5 = Math.min(Math.max(var5, 0), 100);
                     var6 = Math.round((float)(var5 * 127) / 100.0F);
                     NPC.method2678(var6);
                     break;
                  default:
                     var7 = String.format("Unkown game option: %s.", var4.toString());
                     throw new RuntimeException(var7);
               }
            }

            return 1;
         }
      }
   }
}
