import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
   @ObfuscatedName("h")
   static boolean field2302 = false;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("SequenceDefinition_archive")
   static AbstractArchive SequenceDefinition_archive;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("SequenceDefinition_animationsArchive")
   static AbstractArchive SequenceDefinition_animationsArchive;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("SequenceDefinition_cached")
   public static EvictingDualNodeHashTable SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("SequenceDefinition_cachedFrames")
   public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("SequenceDefinition_cachedModel")
   public static EvictingDualNodeHashTable SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -407314397
   )
   @Export("SequenceDefinition_cachedModelId")
   public int SequenceDefinition_cachedModelId = -1;
   @ObfuscatedName("u")
   public Map field2283;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1363129383
   )
   int field2299 = 0;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 882940487
   )
   int field2285 = 0;
   @ObfuscatedName("g")
   @Export("frameIds")
   public int[] frameIds;
   @ObfuscatedName("i")
   @Export("chatFrameIds")
   int[] chatFrameIds;
   @ObfuscatedName("o")
   @Export("frameLengths")
   public int[] frameLengths;
   @ObfuscatedName("n")
   @Export("soundEffects")
   public int[] soundEffects;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 2135707529
   )
   @Export("frameCount")
   public int frameCount = -1;
   @ObfuscatedName("a")
   int[] field2291;
   @ObfuscatedName("s")
   boolean[] field2292;
   @ObfuscatedName("l")
   public boolean field2281 = false;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1831885199
   )
   public int field2300 = 5;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1340317649
   )
   @Export("shield")
   public int shield = -1;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1154134933
   )
   @Export("weapon")
   public int weapon = -1;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1794667521
   )
   public int field2301 = 99;
   @ObfuscatedName("y")
   public boolean field2298 = false;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1085888001
   )
   public int field2290 = -1;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -746157259
   )
   public int field2284 = -1;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1460955579
   )
   public int field2276 = 2;

   SequenceDefinition() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "-2110484685"
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

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqy;II)V",
      garbageValue = "80993823"
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
         this.field2291 = new int[var3 + 1];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2291[var4] = var1.readUnsignedByte();
         }

         this.field2291[var3] = 9999999;
      } else if (var2 == 4) {
         this.field2281 = true;
      } else if (var2 == 5) {
         this.field2300 = var1.readUnsignedByte();
      } else if (var2 == 6) {
         this.shield = var1.readUnsignedShort();
      } else if (var2 == 7) {
         this.weapon = var1.readUnsignedShort();
      } else if (var2 == 8) {
         this.field2301 = var1.readUnsignedByte();
         this.field2298 = true;
      } else if (var2 == 9) {
         this.field2290 = var1.readUnsignedByte();
      } else if (var2 == 10) {
         this.field2284 = var1.readUnsignedByte();
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
         this.field2283 = new HashMap();

         for(var4 = 0; var4 < var3; ++var4) {
            int var5 = var1.readUnsignedShort();
            int var6 = var1.readMedium();
            this.field2283.put(var5, var6);
         }
      } else if (var2 == 16) {
         this.field2299 = var1.readUnsignedShort();
         this.field2285 = var1.readUnsignedShort();
      } else if (var2 == 17) {
         this.field2292 = new boolean[256];

         for(var3 = 0; var3 < this.field2292.length; ++var3) {
            this.field2292[var3] = false;
         }

         var3 = var1.readUnsignedByte();

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2292[var1.readUnsignedByte()] = true;
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "746372140"
   )
   @Export("postDecode")
   void postDecode() {
      if (this.field2290 == -1) {
         if (this.field2291 == null && this.field2292 == null) {
            this.field2290 = 0;
         } else {
            this.field2290 = 2;
         }
      }

      if (this.field2284 == -1) {
         if (this.field2291 == null && this.field2292 == null) {
            this.field2284 = 0;
         } else {
            this.field2284 = 2;
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lhh;II)Lhh;",
      garbageValue = "-292484261"
   )
   @Export("transformActorModel")
   public Model transformActorModel(Model var1, int var2) {
      Model var4;
      if (!this.isCachedModelIdSet()) {
         var2 = this.frameIds[var2];
         Frames var5 = SecureRandomCallable.getFrames(var2 >> 16);
         var2 &= 65535;
         if (var5 == null) {
            return var1.toSharedSequenceModel(true);
         } else {
            var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
            var4.animate(var5, var2);
            return var4;
         }
      } else {
         class130 var3 = Login.method2096(this.SequenceDefinition_cachedModelId);
         if (var3 == null) {
            return var1.toSharedSequenceModel(true);
         } else {
            var4 = var1.toSharedSequenceModel(!var3.method3005());
            var4.method4713(var3, var2);
            return var4;
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lhh;III)Lhh;",
      garbageValue = "1558211812"
   )
   @Export("transformObjectModel")
   Model transformObjectModel(Model var1, int var2, int var3) {
      Model var5;
      if (!this.isCachedModelIdSet()) {
         var2 = this.frameIds[var2];
         Frames var6 = SecureRandomCallable.getFrames(var2 >> 16);
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
         class130 var4 = Login.method2096(this.SequenceDefinition_cachedModelId);
         if (var4 == null) {
            return var1.toSharedSequenceModel(true);
         } else {
            var5 = var1.toSharedSequenceModel(!var4.method3005());
            var3 &= 3;
            if (var3 == 1) {
               var5.rotateY270Ccw();
            } else if (var3 == 2) {
               var5.rotateY180();
            } else if (var3 == 3) {
               var5.rotateY90Ccw();
            }

            var5.method4713(var4, var2);
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

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(Lhh;II)Lhh;",
      garbageValue = "-168718404"
   )
   @Export("transformSpotAnimationModel")
   Model transformSpotAnimationModel(Model var1, int var2) {
      Model var4;
      if (!this.isCachedModelIdSet()) {
         var2 = this.frameIds[var2];
         Frames var5 = SecureRandomCallable.getFrames(var2 >> 16);
         var2 &= 65535;
         if (var5 == null) {
            return var1.toSharedSpotAnimationModel(true);
         } else {
            var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
            var4.animate(var5, var2);
            return var4;
         }
      } else {
         class130 var3 = Login.method2096(this.SequenceDefinition_cachedModelId);
         if (var3 == null) {
            return var1.toSharedSpotAnimationModel(true);
         } else {
            var4 = var1.toSharedSpotAnimationModel(!var3.method3005());
            var4.method4713(var3, var2);
            return var4;
         }
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(Lhh;ILga;IB)Lhh;",
      garbageValue = "28"
   )
   @Export("applyTransformations")
   public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
      if (field2302 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
         return this.method4030(var1, var2, var3, var4);
      } else {
         Model var5 = var1.toSharedSequenceModel(false);
         boolean var6 = false;
         Frames var7 = null;
         Skeleton var8 = null;
         class130 var9;
         if (this.isCachedModelIdSet()) {
            var9 = this.method4025();
            if (var9 == null) {
               return var5;
            }

            if (var3.isCachedModelIdSet() && this.field2292 == null) {
               var5.method4713(var9, var2);
               return var5;
            }

            var8 = var9.field1603;
            var5.method4738(var8, var9, var2, this.field2292, false, !var3.isCachedModelIdSet());
         } else {
            var2 = this.frameIds[var2];
            var7 = SecureRandomCallable.getFrames(var2 >> 16);
            var2 &= 65535;
            if (var7 == null) {
               return var3.transformActorModel(var1, var4);
            }

            if (!var3.isCachedModelIdSet() && (this.field2291 == null || var4 == -1)) {
               var5.animate(var7, var2);
               return var5;
            }

            if (this.field2291 == null || var4 == -1) {
               var5.animate(var7, var2);
               return var5;
            }

            var6 = var3.isCachedModelIdSet();
            if (!var6) {
               var5.method4674(var7, var2, this.field2291, false);
            }
         }

         if (var3.isCachedModelIdSet()) {
            var9 = var3.method4025();
            if (var9 == null) {
               return var5;
            }

            if (var8 == null) {
               var8 = var9.field1603;
            }

            var5.method4738(var8, var9, var4, this.field2292, true, true);
         } else {
            var4 = var3.frameIds[var4];
            Frames var10 = SecureRandomCallable.getFrames(var4 >> 16);
            var4 &= 65535;
            if (var10 == null) {
               return this.transformActorModel(var1, var2);
            }

            var5.method4674(var10, var4, this.field2291, true);
         }

         if (var6 && var7 != null) {
            var5.method4674(var7, var2, this.field2291, false);
         }

         var5.resetBounds();
         return var5;
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Lhh;ILga;II)Lhh;",
      garbageValue = "1307679838"
   )
   Model method4030(Model var1, int var2, SequenceDefinition var3, int var4) {
      var2 = this.frameIds[var2];
      Frames var5 = SecureRandomCallable.getFrames(var2 >> 16);
      var2 &= 65535;
      if (var5 == null) {
         return var3.transformActorModel(var1, var4);
      } else {
         var4 = var3.frameIds[var4];
         Frames var6 = SecureRandomCallable.getFrames(var4 >> 16);
         var4 &= 65535;
         Model var7;
         if (var6 == null) {
            var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
            var7.animate(var5, var2);
            return var7;
         } else {
            var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
            var7.animate2(var5, var2, var6, var4, this.field2291);
            return var7;
         }
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lhh;II)Lhh;",
      garbageValue = "128420513"
   )
   @Export("transformWidgetModel")
   public Model transformWidgetModel(Model var1, int var2) {
      if (!this.isCachedModelIdSet()) {
         int var3 = this.frameIds[var2];
         Frames var4 = SecureRandomCallable.getFrames(var3 >> 16);
         var3 &= 65535;
         if (var4 == null) {
            return var1.toSharedSequenceModel(true);
         } else {
            Frames var5 = null;
            int var6 = 0;
            if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
               var6 = this.chatFrameIds[var2];
               var5 = SecureRandomCallable.getFrames(var6 >> 16);
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

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2096381759"
   )
   @Export("isCachedModelIdSet")
   public boolean isCachedModelIdSet() {
      return this.SequenceDefinition_cachedModelId >= 0;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-72"
   )
   public int method4024() {
      return this.field2285 - this.field2299;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)Lew;",
      garbageValue = "-1717186294"
   )
   class130 method4025() {
      return this.isCachedModelIdSet() ? Login.method2096(this.SequenceDefinition_cachedModelId) : null;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lly;Lly;Lly;Lly;I)V",
      garbageValue = "-1993472449"
   )
   public static void method4063(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
      class422.Widget_archive = var0;
      Widget.field3531 = var1;
      Widget.Widget_spritesArchive = var2;
      PacketBufferNode.Widget_fontsArchive = var3;
      class71.Widget_interfaceComponents = new Widget[class422.Widget_archive.getGroupCount()][];
      Language.Widget_loadedInterfaces = new boolean[class422.Widget_archive.getGroupCount()];
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lly;III)[Lrx;",
      garbageValue = "1693404332"
   )
   public static SpritePixels[] method4064(AbstractArchive var0, int var1, int var2) {
      byte[] var4 = var0.takeFile(var1, var2);
      boolean var3;
      if (var4 == null) {
         var3 = false;
      } else {
         VarpDefinition.SpriteBuffer_decode(var4);
         var3 = true;
      }

      return !var3 ? null : class374.method7318();
   }
}
