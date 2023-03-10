import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
   @ObfuscatedName("aj")
   static boolean field2270 = false;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("SequenceDefinition_animationsArchive")
   public static AbstractArchive SequenceDefinition_animationsArchive;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("SequenceDefinition_skeletonsArchive")
   public static AbstractArchive SequenceDefinition_skeletonsArchive;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("SequenceDefinition_cached")
   public static EvictingDualNodeHashTable SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("SequenceDefinition_cachedFrames")
   public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("SequenceDefinition_cachedModel")
   public static EvictingDualNodeHashTable SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
   @ObfuscatedName("fr")
   @ObfuscatedSignature(
      descriptor = "Lgf;"
   )
   @Export("js5SocketTask")
   static Task js5SocketTask;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -116697075
   )
   @Export("SequenceDefinition_cachedModelId")
   public int SequenceDefinition_cachedModelId = -1;
   @ObfuscatedName("ax")
   public Map field2273;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1611094419
   )
   int field2259 = 0;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -399381697
   )
   int field2260 = 0;
   @ObfuscatedName("am")
   @Export("frameIds")
   public int[] frameIds;
   @ObfuscatedName("az")
   @Export("chatFrameIds")
   int[] chatFrameIds;
   @ObfuscatedName("ae")
   @Export("frameLengths")
   public int[] frameLengths;
   @ObfuscatedName("au")
   @Export("soundEffects")
   public int[] soundEffects;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1094970191
   )
   @Export("frameCount")
   public int frameCount = -1;
   @ObfuscatedName("at")
   int[] field2266;
   @ObfuscatedName("af")
   boolean[] field2267;
   @ObfuscatedName("ai")
   public boolean field2268 = false;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -949116119
   )
   public int field2269 = 5;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -638480153
   )
   @Export("shield")
   public int shield = -1;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 762216371
   )
   @Export("weapon")
   public int weapon = -1;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1388097267
   )
   public int field2261 = 99;
   @ObfuscatedName("bm")
   public boolean field2272 = false;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -1681358687
   )
   public int field2277 = -1;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = 1977046449
   )
   public int field2255 = -1;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = -93498907
   )
   public int field2276 = 2;

   SequenceDefinition() {
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lsy;B)V",
      garbageValue = "-94"
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

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsy;II)V",
      garbageValue = "-1653065285"
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
         this.field2266 = new int[var3 + 1];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2266[var4] = var1.readUnsignedByte();
         }

         this.field2266[var3] = 9999999;
      } else if (var2 == 4) {
         this.field2268 = true;
      } else if (var2 == 5) {
         this.field2269 = var1.readUnsignedByte();
      } else if (var2 == 6) {
         this.shield = var1.readUnsignedShort();
      } else if (var2 == 7) {
         this.weapon = var1.readUnsignedShort();
      } else if (var2 == 8) {
         this.field2261 = var1.readUnsignedByte();
         this.field2272 = true;
      } else if (var2 == 9) {
         this.field2277 = var1.readUnsignedByte();
      } else if (var2 == 10) {
         this.field2255 = var1.readUnsignedByte();
      } else if (var2 == 11) {
         this.field2276 = var1.readUnsignedByte();
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
         this.field2273 = new HashMap();

         for(var4 = 0; var4 < var3; ++var4) {
            int var5 = var1.readUnsignedShort();
            int var6 = var1.readMedium();
            this.field2273.put(var5, var6);
         }
      } else if (var2 == 16) {
         this.field2259 = var1.readUnsignedShort();
         this.field2260 = var1.readUnsignedShort();
      } else if (var2 == 17) {
         this.field2267 = new boolean[256];

         for(var3 = 0; var3 < this.field2267.length; ++var3) {
            this.field2267[var3] = false;
         }

         var3 = var1.readUnsignedByte();

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2267[var1.readUnsignedByte()] = true;
         }
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "122"
   )
   @Export("postDecode")
   void postDecode() {
      if (this.field2277 == -1) {
         if (this.field2266 == null && this.field2267 == null) {
            this.field2277 = 0;
         } else {
            this.field2277 = 2;
         }
      }

      if (this.field2255 == -1) {
         if (this.field2266 == null && this.field2267 == null) {
            this.field2255 = 0;
         } else {
            this.field2255 = 2;
         }
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lix;II)Lix;",
      garbageValue = "-1277891900"
   )
   @Export("transformActorModel")
   public Model transformActorModel(Model var1, int var2) {
      Model var4;
      if (!this.isCachedModelIdSet()) {
         var2 = this.frameIds[var2];
         Frames var5 = VarbitComposition.getFrames(var2 >> 16);
         var2 &= 65535;
         if (var5 == null) {
            return var1.toSharedSequenceModel(true);
         } else {
            var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
            var4.animate(var5, var2);
            return var4;
         }
      } else {
         class134 var3 = TaskHandler.method3458(this.SequenceDefinition_cachedModelId);
         if (var3 == null) {
            return var1.toSharedSequenceModel(true);
         } else {
            var4 = var1.toSharedSequenceModel(!var3.method3043());
            var4.method4603(var3, var2);
            return var4;
         }
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lix;IIB)Lix;",
      garbageValue = "5"
   )
   @Export("transformObjectModel")
   Model transformObjectModel(Model var1, int var2, int var3) {
      Model var5;
      if (!this.isCachedModelIdSet()) {
         var2 = this.frameIds[var2];
         Frames var6 = VarbitComposition.getFrames(var2 >> 16);
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
         class134 var4 = TaskHandler.method3458(this.SequenceDefinition_cachedModelId);
         if (var4 == null) {
            return var1.toSharedSequenceModel(true);
         } else {
            var5 = var1.toSharedSequenceModel(!var4.method3043());
            var3 &= 3;
            if (var3 == 1) {
               var5.rotateY270Ccw();
            } else if (var3 == 2) {
               var5.rotateY180();
            } else if (var3 == 3) {
               var5.rotateY90Ccw();
            }

            var5.method4603(var4, var2);
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

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lix;II)Lix;",
      garbageValue = "484101201"
   )
   @Export("transformSpotAnimationModel")
   Model transformSpotAnimationModel(Model var1, int var2) {
      Model var4;
      if (!this.isCachedModelIdSet()) {
         var2 = this.frameIds[var2];
         Frames var5 = VarbitComposition.getFrames(var2 >> 16);
         var2 &= 65535;
         if (var5 == null) {
            return var1.toSharedSpotAnimationModel(true);
         } else {
            var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
            var4.animate(var5, var2);
            return var4;
         }
      } else {
         class134 var3 = TaskHandler.method3458(this.SequenceDefinition_cachedModelId);
         if (var3 == null) {
            return var1.toSharedSpotAnimationModel(true);
         } else {
            var4 = var1.toSharedSpotAnimationModel(!var3.method3043());
            var4.method4603(var3, var2);
            return var4;
         }
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lix;ILhx;IS)Lix;",
      garbageValue = "223"
   )
   @Export("applyTransformations")
   public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
      if (field2270 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
         return this.method4006(var1, var2, var3, var4);
      } else {
         Model var5 = var1.toSharedSequenceModel(false);
         boolean var6 = false;
         Frames var7 = null;
         Skeleton var8 = null;
         class134 var9;
         if (this.isCachedModelIdSet()) {
            var9 = this.method4016();
            if (var9 == null) {
               return var5;
            }

            if (var3.isCachedModelIdSet() && this.field2267 == null) {
               var5.method4603(var9, var2);
               return var5;
            }

            var8 = var9.field1570;
            var5.method4639(var8, var9, var2, this.field2267, false, !var3.isCachedModelIdSet());
         } else {
            var2 = this.frameIds[var2];
            var7 = VarbitComposition.getFrames(var2 >> 16);
            var2 &= 65535;
            if (var7 == null) {
               return var3.transformActorModel(var1, var4);
            }

            if (!var3.isCachedModelIdSet() && (this.field2266 == null || var4 == -1)) {
               var5.animate(var7, var2);
               return var5;
            }

            if (this.field2266 == null || var4 == -1) {
               var5.animate(var7, var2);
               return var5;
            }

            var6 = var3.isCachedModelIdSet();
            if (!var6) {
               var5.method4617(var7, var2, this.field2266, false);
            }
         }

         if (var3.isCachedModelIdSet()) {
            var9 = var3.method4016();
            if (var9 == null) {
               return var5;
            }

            if (var8 == null) {
               var8 = var9.field1570;
            }

            var5.method4639(var8, var9, var4, this.field2267, true, true);
         } else {
            var4 = var3.frameIds[var4];
            Frames var10 = VarbitComposition.getFrames(var4 >> 16);
            var4 &= 65535;
            if (var10 == null) {
               return this.transformActorModel(var1, var2);
            }

            var5.method4617(var10, var4, this.field2266, true);
         }

         if (var6 && var7 != null) {
            var5.method4617(var7, var2, this.field2266, false);
         }

         var5.resetBounds();
         return var5;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lix;ILhx;II)Lix;",
      garbageValue = "-1108712217"
   )
   Model method4006(Model var1, int var2, SequenceDefinition var3, int var4) {
      var2 = this.frameIds[var2];
      Frames var5 = VarbitComposition.getFrames(var2 >> 16);
      var2 &= 65535;
      if (var5 == null) {
         return var3.transformActorModel(var1, var4);
      } else {
         var4 = var3.frameIds[var4];
         Frames var6 = VarbitComposition.getFrames(var4 >> 16);
         var4 &= 65535;
         Model var7;
         if (var6 == null) {
            var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
            var7.animate(var5, var2);
            return var7;
         } else {
            var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
            var7.animate2(var5, var2, var6, var4, this.field2266);
            return var7;
         }
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Lix;II)Lix;",
      garbageValue = "193586456"
   )
   @Export("transformWidgetModel")
   public Model transformWidgetModel(Model var1, int var2) {
      if (!this.isCachedModelIdSet()) {
         int var3 = this.frameIds[var2];
         Frames var4 = VarbitComposition.getFrames(var3 >> 16);
         var3 &= 65535;
         if (var4 == null) {
            return var1.toSharedSequenceModel(true);
         } else {
            Frames var5 = null;
            int var6 = 0;
            if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
               var6 = this.chatFrameIds[var2];
               var5 = VarbitComposition.getFrames(var6 >> 16);
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

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-343581928"
   )
   @Export("isCachedModelIdSet")
   public boolean isCachedModelIdSet() {
      return this.SequenceDefinition_cachedModelId >= 0;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1289109169"
   )
   public int method4015() {
      return this.field2260 - this.field2259;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)Lfl;",
      garbageValue = "1383539197"
   )
   class134 method4016() {
      return this.isCachedModelIdSet() ? TaskHandler.method3458(this.SequenceDefinition_cachedModelId) : null;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "0"
   )
   public static int method4012(int var0) {
      return class435.field4650[var0 & 16383];
   }
}
