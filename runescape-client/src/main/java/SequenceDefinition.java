import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gg")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
   @ObfuscatedName("a")
   static boolean field2230 = false;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("SequenceDefinition_archive")
   public static AbstractArchive SequenceDefinition_archive;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("SequenceDefinition_skeletonsArchive")
   public static AbstractArchive SequenceDefinition_skeletonsArchive;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("SequenceDefinition_cached")
   static EvictingDualNodeHashTable SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("SequenceDefinition_cachedFrames")
   static EvictingDualNodeHashTable SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("SequenceDefinition_cachedModel")
   static EvictingDualNodeHashTable SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 676867587
   )
   @Export("SequenceDefinition_cachedModelId")
   public int SequenceDefinition_cachedModelId = -1;
   @ObfuscatedName("n")
   public Map field2214;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -660948097
   )
   int field2207 = 0;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1915837811
   )
   int field2216 = 0;
   @ObfuscatedName("s")
   @Export("frameIds")
   public int[] frameIds;
   @ObfuscatedName("p")
   @Export("chatFrameIds")
   int[] chatFrameIds;
   @ObfuscatedName("b")
   @Export("frameLengths")
   public int[] frameLengths;
   @ObfuscatedName("o")
   @Export("soundEffects")
   public int[] soundEffects;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -544051619
   )
   @Export("frameCount")
   public int frameCount = -1;
   @ObfuscatedName("z")
   int[] field2222;
   @ObfuscatedName("t")
   boolean[] field2223;
   @ObfuscatedName("w")
   public boolean field2224 = false;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1913234535
   )
   public int field2225 = 5;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1522102509
   )
   @Export("shield")
   public int shield = -1;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1707428897
   )
   @Export("weapon")
   public int weapon = -1;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 127455917
   )
   public int field2228 = 99;
   @ObfuscatedName("g")
   public boolean field2227 = false;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1958786829
   )
   public int field2221 = -1;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1804859823
   )
   public int field2211 = -1;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1921469993
   )
   public int field2232 = 2;

   SequenceDefinition() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-78830429"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lqr;II)V",
      garbageValue = "454545126"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.readUnsignedShort();
         this.frameLengths = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.frameLengths[var4] = var1.readUnsignedShort();
         }

         this.frameIds = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.frameIds[var4] = var1.readUnsignedShort();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.frameIds[var4] += var1.readUnsignedShort() << 16;
         }
      } else if (var2 == 2) {
         this.frameCount = var1.readUnsignedShort();
      } else if (var2 == 3) {
         var3 = var1.readUnsignedByte();
         this.field2222 = new int[var3 + 1];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2222[var4] = var1.readUnsignedByte();
         }

         this.field2222[var3] = 9999999;
      } else if (var2 == 4) {
         this.field2224 = true;
      } else if (var2 == 5) {
         this.field2225 = var1.readUnsignedByte();
      } else if (var2 == 6) {
         this.shield = var1.readUnsignedShort();
      } else if (var2 == 7) {
         this.weapon = var1.readUnsignedShort();
      } else if (var2 == 8) {
         this.field2228 = var1.readUnsignedByte();
         this.field2227 = true;
      } else if (var2 == 9) {
         this.field2221 = var1.readUnsignedByte();
      } else if (var2 == 10) {
         this.field2211 = var1.readUnsignedByte();
      } else if (var2 == 11) {
         this.field2232 = var1.readUnsignedByte();
      } else if (var2 == 12) {
         var3 = var1.readUnsignedByte();
         this.chatFrameIds = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.chatFrameIds[var4] = var1.readUnsignedShort();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
         }
      } else if (var2 == 13) {
         var3 = var1.readUnsignedByte();
         this.soundEffects = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.soundEffects[var4] = var1.readMedium();
         }
      } else if (var2 == 14) {
         this.SequenceDefinition_cachedModelId = var1.readInt();
      } else if (var2 == 15) {
         var3 = var1.readUnsignedShort();
         this.field2214 = new HashMap();

         for(var4 = 0; var4 < var3; ++var4) {
            int var5 = var1.readUnsignedShort();
            int var6 = var1.readMedium();
            this.field2214.put(var5, var6);
         }
      } else if (var2 == 16) {
         this.field2207 = var1.readUnsignedShort();
         this.field2216 = var1.readUnsignedShort();
      } else if (var2 == 17) {
         this.field2223 = new boolean[256];

         for(var3 = 0; var3 < this.field2223.length; ++var3) {
            this.field2223[var3] = false;
         }

         var3 = var1.readUnsignedByte();

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2223[var1.readUnsignedByte()] = true;
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-852175246"
   )
   @Export("postDecode")
   void postDecode() {
      if (this.field2221 == -1) {
         if (this.field2222 == null && this.field2223 == null) {
            this.field2221 = 0;
         } else {
            this.field2221 = 2;
         }
      }

      if (this.field2211 == -1) {
         if (this.field2222 == null && this.field2223 == null) {
            this.field2211 = 0;
         } else {
            this.field2211 = 2;
         }
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lha;IB)Lha;",
      garbageValue = "-9"
   )
   @Export("transformActorModel")
   public Model transformActorModel(Model var1, int var2) {
      Model var4;
      if (!this.isCachedModelIdSet()) {
         var2 = this.frameIds[var2];
         Frames var5 = LoginScreenAnimation.getFrames(var2 >> 16);
         var2 &= 65535;
         if (var5 == null) {
            return var1.toSharedSequenceModel(true);
         } else {
            var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
            var4.animate(var5, var2);
            return var4;
         }
      } else {
         class129 var3 = ObjectComposition.method3734(this.SequenceDefinition_cachedModelId);
         if (var3 == null) {
            return var1.toSharedSequenceModel(true);
         } else {
            var4 = var1.toSharedSequenceModel(!var3.method2928());
            var4.method4573(var3, var2);
            return var4;
         }
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lha;IIB)Lha;",
      garbageValue = "70"
   )
   @Export("transformObjectModel")
   Model transformObjectModel(Model var1, int var2, int var3) {
      Model var5;
      if (!this.isCachedModelIdSet()) {
         var2 = this.frameIds[var2];
         Frames var6 = LoginScreenAnimation.getFrames(var2 >> 16);
         var2 &= 65535;
         if (var6 == null) {
            return var1.toSharedSequenceModel(true);
         } else {
            var5 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2));
            var3 &= 3;
            if (var3 == 1) {
               var5.rotateY270Ccw();
            } else if (var3 == 2) {
               var5.rotateY180();
            } else if (var3 == 3) {
               var5.rotateY90Ccw();
            }

            var5.animate(var6, var2);
            if (var3 == 1) {
               var5.rotateY90Ccw();
            } else if (var3 == 2) {
               var5.rotateY180();
            } else if (var3 == 3) {
               var5.rotateY270Ccw();
            }

            return var5;
         }
      } else {
         class129 var4 = ObjectComposition.method3734(this.SequenceDefinition_cachedModelId);
         if (var4 == null) {
            return var1.toSharedSequenceModel(true);
         } else {
            var5 = var1.toSharedSequenceModel(!var4.method2928());
            var3 &= 3;
            if (var3 == 1) {
               var5.rotateY270Ccw();
            } else if (var3 == 2) {
               var5.rotateY180();
            } else if (var3 == 3) {
               var5.rotateY90Ccw();
            }

            var5.method4573(var4, var2);
            if (var3 == 1) {
               var5.rotateY90Ccw();
            } else if (var3 == 2) {
               var5.rotateY180();
            } else if (var3 == 3) {
               var5.rotateY270Ccw();
            }

            return var5;
         }
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Lha;II)Lha;",
      garbageValue = "308821069"
   )
   @Export("transformSpotAnimationModel")
   Model transformSpotAnimationModel(Model var1, int var2) {
      Model var4;
      if (!this.isCachedModelIdSet()) {
         var2 = this.frameIds[var2];
         Frames var5 = LoginScreenAnimation.getFrames(var2 >> 16);
         var2 &= 65535;
         if (var5 == null) {
            return var1.toSharedSpotAnimationModel(true);
         } else {
            var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
            var4.animate(var5, var2);
            return var4;
         }
      } else {
         class129 var3 = ObjectComposition.method3734(this.SequenceDefinition_cachedModelId);
         if (var3 == null) {
            return var1.toSharedSpotAnimationModel(true);
         } else {
            var4 = var1.toSharedSpotAnimationModel(!var3.method2928());
            var4.method4573(var3, var2);
            return var4;
         }
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lha;ILgg;II)Lha;",
      garbageValue = "-928359800"
   )
   @Export("applyTransformations")
   public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
      if (field2230 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
         return this.method3896(var1, var2, var3, var4);
      } else {
         Model var5 = var1.toSharedSequenceModel(false);
         boolean var6 = false;
         Frames var7 = null;
         Skeleton var8 = null;
         class129 var9;
         if (this.isCachedModelIdSet()) {
            var9 = this.method3877();
            if (var9 == null) {
               return var5;
            }

            if (var3.isCachedModelIdSet() && this.field2223 == null) {
               var5.method4573(var9, var2);
               return var5;
            }

            var8 = var9.field1541;
            var5.method4571(var8, var9, var2, this.field2223, false, !var3.isCachedModelIdSet());
         } else {
            var2 = this.frameIds[var2];
            var7 = LoginScreenAnimation.getFrames(var2 >> 16);
            var2 &= 65535;
            if (var7 == null) {
               return var3.transformActorModel(var1, var4);
            }

            if (!var3.isCachedModelIdSet() && (this.field2222 == null || var4 == -1)) {
               var5.animate(var7, var2);
               return var5;
            }

            if (this.field2222 == null || var4 == -1) {
               var5.animate(var7, var2);
               return var5;
            }

            var6 = var3.isCachedModelIdSet();
            if (!var6) {
               var5.method4518(var7, var2, this.field2222, false);
            }
         }

         if (var3.isCachedModelIdSet()) {
            var9 = var3.method3877();
            if (var9 == null) {
               return var5;
            }

            if (var8 == null) {
               var8 = var9.field1541;
            }

            var5.method4571(var8, var9, var4, this.field2223, true, true);
         } else {
            var4 = var3.frameIds[var4];
            Frames var10 = LoginScreenAnimation.getFrames(var4 >> 16);
            var4 &= 65535;
            if (var10 == null) {
               return this.transformActorModel(var1, var2);
            }

            var5.method4518(var10, var4, this.field2222, true);
         }

         if (var6 && var7 != null) {
            var5.method4518(var7, var2, this.field2222, false);
         }

         var5.resetBounds();
         return var5;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lha;ILgg;II)Lha;",
      garbageValue = "-862806047"
   )
   Model method3896(Model var1, int var2, SequenceDefinition var3, int var4) {
      var2 = this.frameIds[var2];
      Frames var5 = LoginScreenAnimation.getFrames(var2 >> 16);
      var2 &= 65535;
      if (var5 == null) {
         return var3.transformActorModel(var1, var4);
      } else {
         var4 = var3.frameIds[var4];
         Frames var6 = LoginScreenAnimation.getFrames(var4 >> 16);
         var4 &= 65535;
         Model var7;
         if (var6 == null) {
            var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
            var7.animate(var5, var2);
            return var7;
         } else {
            var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
            var7.animate2(var5, var2, var6, var4, this.field2222);
            return var7;
         }
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(Lha;II)Lha;",
      garbageValue = "-744796911"
   )
   @Export("transformWidgetModel")
   public Model transformWidgetModel(Model var1, int var2) {
      if (!this.isCachedModelIdSet()) {
         int var3 = this.frameIds[var2];
         Frames var4 = LoginScreenAnimation.getFrames(var3 >> 16);
         var3 &= 65535;
         if (var4 == null) {
            return var1.toSharedSequenceModel(true);
         } else {
            Frames var5 = null;
            int var6 = 0;
            if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
               var6 = this.chatFrameIds[var2];
               var5 = LoginScreenAnimation.getFrames(var6 >> 16);
               var6 &= 65535;
            }

            Model var7;
            if (var5 != null && var6 != 65535) {
               var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6));
               var7.animate(var4, var3);
               var7.animate(var5, var6);
               return var7;
            } else {
               var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3));
               var7.animate(var4, var3);
               return var7;
            }
         }
      } else {
         return this.transformActorModel(var1, var2);
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2109703319"
   )
   @Export("isCachedModelIdSet")
   public boolean isCachedModelIdSet() {
      return this.SequenceDefinition_cachedModelId >= 0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1791836412"
   )
   public int method3876() {
      return this.field2216 - this.field2207;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(B)Ldh;",
      garbageValue = "-35"
   )
   class129 method3877() {
      return this.isCachedModelIdSet() ? ObjectComposition.method3734(this.SequenceDefinition_cachedModelId) : null;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "-461262132"
   )
   public static int method3898(int var0, int var1, int var2) {
      var2 &= 3;
      if (var2 == 0) {
         return var1;
      } else if (var2 == 1) {
         return 7 - var0;
      } else {
         return var2 == 2 ? 7 - var1 : var0;
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "-98319081"
   )
   static int method3890(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.SOUND_SYNTH) {
         class379.Interpreter_intStackSize -= 3;
         class273.queueSoundEffect(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]);
         return 1;
      } else if (var0 == ScriptOpcodes.SOUND_SONG) {
         class37.playSong(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
         return 1;
      } else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
         class379.Interpreter_intStackSize -= 2;
         FloorDecoration.method4135(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]);
         return 1;
      } else {
         class87 var3;
         class86 var4;
         int var5;
         int var6;
         String var7;
         if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
            if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
               return var0 == 3211 ? 1 : 2;
            } else {
               var3 = class87.field1084;
               var4 = class86.field1068;
               boolean var8 = false;
               if (var0 == 3214) {
                  var6 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var3 = (class87)WallDecoration.findEnumerated(class157.method3236(), var6);
                  if (var3 == null) {
                     throw new RuntimeException(String.format("Unrecognized device option %d", var6));
                  }
               }

               if (var0 == 3215) {
                  var6 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var4 = (class86)WallDecoration.findEnumerated(SecureRandomFuture.method2104(), var6);
                  if (var4 == null) {
                     throw new RuntimeException(String.format("Unrecognized game option %d", var6));
                  }
               }

               if (var0 == 3210) {
                  var6 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  var3 = (class87)WallDecoration.findEnumerated(class157.method3236(), var6);
                  if (var3 == null) {
                     var4 = (class86)WallDecoration.findEnumerated(SecureRandomFuture.method2104(), var6);
                     if (var4 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var6));
                     }
                  }
               } else if (var0 == 3182) {
                  var3 = class87.field1077;
               } else if (var0 == 3204) {
                  var4 = class86.field1075;
               } else if (var0 == 3206) {
                  var4 = class86.field1069;
               } else if (var0 == 3208) {
                  var4 = class86.field1070;
               }

               if (var4 == class86.field1068) {
                  switch (var3.field1079) {
                     case 1:
                        var5 = BufferedSink.clientPreferences.method2381() ? 1 : 0;
                        break;
                     case 2:
                        var5 = BufferedSink.clientPreferences.method2383() ? 1 : 0;
                        break;
                     case 3:
                        var5 = BufferedSink.clientPreferences.method2386() ? 1 : 0;
                        break;
                     case 4:
                        var5 = BufferedSink.clientPreferences.method2441();
                        break;
                     case 5:
                        var5 = class356.method6783();
                        break;
                     default:
                        var7 = String.format("Unkown device option: %s.", var3.toString());
                        throw new RuntimeException(var7);
                  }
               } else {
                  switch (var4.field1071) {
                     case 1:
                        var5 = BufferedSink.clientPreferences.method2452() ? 1 : 0;
                        break;
                     case 2:
                        var6 = BufferedSink.clientPreferences.method2391();
                        var5 = Math.round((float)(var6 * 100) / 255.0F);
                        break;
                     case 3:
                        var6 = BufferedSink.clientPreferences.method2427();
                        var5 = Math.round((float)(var6 * 100) / 127.0F);
                        break;
                     case 4:
                        var6 = BufferedSink.clientPreferences.method2411();
                        var5 = Math.round((float)(var6 * 100) / 127.0F);
                        break;
                     default:
                        var7 = String.format("Unkown game option: %s.", var4.toString());
                        throw new RuntimeException(var7);
                  }
               }

               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var5;
               return 1;
            }
         } else {
            var3 = class87.field1084;
            var4 = class86.field1068;
            var5 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            if (var0 == 3212) {
               var6 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               var3 = (class87)WallDecoration.findEnumerated(class157.method3236(), var6);
               if (var3 == null) {
                  throw new RuntimeException(String.format("Unrecognized device option %d", var6));
               }
            }

            if (var0 == 3213) {
               var6 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               var4 = (class86)WallDecoration.findEnumerated(SecureRandomFuture.method2104(), var6);
               if (var4 == null) {
                  throw new RuntimeException(String.format("Unrecognized game option %d", var6));
               }
            }

            if (var0 == 3209) {
               var6 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               var3 = (class87)WallDecoration.findEnumerated(class157.method3236(), var6);
               if (var3 == null) {
                  var4 = (class86)WallDecoration.findEnumerated(SecureRandomFuture.method2104(), var6);
                  if (var4 == null) {
                     throw new RuntimeException(String.format("Unrecognized client option %d", var6));
                  }
               }
            } else if (var0 == 3181) {
               var3 = class87.field1077;
            } else if (var0 == 3203) {
               var4 = class86.field1075;
            } else if (var0 == 3205) {
               var4 = class86.field1069;
            } else if (var0 == 3207) {
               var4 = class86.field1070;
            }

            if (var4 == class86.field1068) {
               switch (var3.field1079) {
                  case 1:
                     BufferedSink.clientPreferences.method2430(var5 == 1);
                     break;
                  case 2:
                     BufferedSink.clientPreferences.method2382(var5 == 1);
                     break;
                  case 3:
                     BufferedSink.clientPreferences.method2384(var5 == 1);
                     break;
                  case 4:
                     if (var5 < 0) {
                        var5 = 0;
                     }

                     BufferedSink.clientPreferences.method2387(var5);
                     break;
                  case 5:
                     WorldMapData_0.method4676(var5);
                     break;
                  default:
                     var7 = String.format("Unkown device option: %s.", var3.toString());
                     throw new RuntimeException(var7);
               }
            } else {
               switch (var4.field1071) {
                  case 1:
                     BufferedSink.clientPreferences.method2378(var5 == 1);
                     break;
                  case 2:
                     var5 = Math.min(Math.max(var5, 0), 100);
                     var6 = Math.round((float)(var5 * 255) / 100.0F);
                     class20.method288(var6);
                     break;
                  case 3:
                     var5 = Math.min(Math.max(var5, 0), 100);
                     var6 = Math.round((float)(var5 * 127) / 100.0F);
                     Message.method1150(var6);
                     break;
                  case 4:
                     var5 = Math.min(Math.max(var5, 0), 100);
                     var6 = Math.round((float)(var5 * 127) / 100.0F);
                     Calendar.method6226(var6);
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

   @ObfuscatedName("ha")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1465679823"
   )
   static void method3881() {
      for(class198 var0 = (class198)Client.field713.last(); var0 != null; var0 = (class198)Client.field713.previous()) {
         var0.remove();
      }

   }
}
