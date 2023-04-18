import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
   @ObfuscatedName("af")
   static boolean field2297 = false;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("SequenceDefinition_archive")
   static AbstractArchive SequenceDefinition_archive;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("SequenceDefinition_animationsArchive")
   static AbstractArchive SequenceDefinition_animationsArchive;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("SequenceDefinition_skeletonsArchive")
   static AbstractArchive SequenceDefinition_skeletonsArchive;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("SequenceDefinition_cached")
   public static EvictingDualNodeHashTable SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("SequenceDefinition_cachedFrames")
   public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("SequenceDefinition_cachedModel")
   public static EvictingDualNodeHashTable SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 1238147375
   )
   @Export("SequenceDefinition_cachedModelId")
   public int SequenceDefinition_cachedModelId = -1;
   @ObfuscatedName("ao")
   public Map field2311;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -968724615
   )
   int field2285 = 0;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1833069719
   )
   int field2298 = 0;
   @ObfuscatedName("ag")
   @Export("frameIds")
   public int[] frameIds;
   @ObfuscatedName("ah")
   @Export("chatFrameIds")
   int[] chatFrameIds;
   @ObfuscatedName("av")
   @Export("frameLengths")
   public int[] frameLengths;
   @ObfuscatedName("ar")
   @Export("soundEffects")
   public int[] soundEffects;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1363943497
   )
   @Export("frameCount")
   public int frameCount = -1;
   @ObfuscatedName("as")
   int[] field2304;
   @ObfuscatedName("aj")
   boolean[] field2289;
   @ObfuscatedName("ak")
   public boolean field2306 = false;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -1932560049
   )
   public int field2293 = 5;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -932726919
   )
   @Export("shield")
   public int shield = -1;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -170018527
   )
   @Export("weapon")
   public int weapon = -1;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1786137655
   )
   public int field2287 = 99;
   @ObfuscatedName("by")
   public boolean field2307 = false;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = 1069382699
   )
   public int field2312 = -1;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = 1957040329
   )
   public int field2313 = -1;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 789159225
   )
   public int field2314 = 2;

   SequenceDefinition() {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "1877633819"
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
      descriptor = "(Lsg;IB)V",
      garbageValue = "14"
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
         this.field2304 = new int[var3 + 1];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2304[var4] = var1.readUnsignedByte();
         }

         this.field2304[var3] = 9999999;
      } else if (var2 == 4) {
         this.field2306 = true;
      } else if (var2 == 5) {
         this.field2293 = var1.readUnsignedByte();
      } else if (var2 == 6) {
         this.shield = var1.readUnsignedShort();
      } else if (var2 == 7) {
         this.weapon = var1.readUnsignedShort();
      } else if (var2 == 8) {
         this.field2287 = var1.readUnsignedByte();
         this.field2307 = true;
      } else if (var2 == 9) {
         this.field2312 = var1.readUnsignedByte();
      } else if (var2 == 10) {
         this.field2313 = var1.readUnsignedByte();
      } else if (var2 == 11) {
         this.field2314 = var1.readUnsignedByte();
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
         this.field2311 = new HashMap();

         for(var4 = 0; var4 < var3; ++var4) {
            int var5 = var1.readUnsignedShort();
            int var6 = var1.readMedium();
            this.field2311.put(var5, var6);
         }
      } else if (var2 == 16) {
         this.field2285 = var1.readUnsignedShort();
         this.field2298 = var1.readUnsignedShort();
      } else if (var2 == 17) {
         this.field2289 = new boolean[256];

         for(var3 = 0; var3 < this.field2289.length; ++var3) {
            this.field2289[var3] = false;
         }

         var3 = var1.readUnsignedByte();

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2289[var1.readUnsignedByte()] = true;
         }
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1974157576"
   )
   @Export("postDecode")
   void postDecode() {
      if (this.field2312 == -1) {
         if (this.field2304 == null && this.field2289 == null) {
            this.field2312 = 0;
         } else {
            this.field2312 = 2;
         }
      }

      if (this.field2313 == -1) {
         if (this.field2304 == null && this.field2289 == null) {
            this.field2313 = 0;
         } else {
            this.field2313 = 2;
         }
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lit;IB)Lit;",
      garbageValue = "-114"
   )
   @Export("transformActorModel")
   public Model transformActorModel(Model var1, int var2) {
      Model var4;
      if (!this.isCachedModelIdSet()) {
         var2 = this.frameIds[var2];
         Frames var5 = WorldMapID.getFrames(var2 >> 16);
         var2 &= 65535;
         if (var5 == null) {
            return var1.toSharedSequenceModel(true);
         } else {
            var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
            var4.animate(var5, var2);
            return var4;
         }
      } else {
         class133 var3 = TileItem.method2675(this.SequenceDefinition_cachedModelId);
         if (var3 == null) {
            return var1.toSharedSequenceModel(true);
         } else {
            var4 = var1.toSharedSequenceModel(!var3.method3136());
            var4.method4761(var3, var2);
            return var4;
         }
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lit;III)Lit;",
      garbageValue = "16711935"
   )
   @Export("transformObjectModel")
   Model transformObjectModel(Model var1, int var2, int var3) {
      Model var5;
      if (!this.isCachedModelIdSet()) {
         var2 = this.frameIds[var2];
         Frames var6 = WorldMapID.getFrames(var2 >> 16);
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
         class133 var4 = TileItem.method2675(this.SequenceDefinition_cachedModelId);
         if (var4 == null) {
            return var1.toSharedSequenceModel(true);
         } else {
            var5 = var1.toSharedSequenceModel(!var4.method3136());
            var3 &= 3;
            if (var3 == 1) {
               var5.rotateY270Ccw();
            } else if (var3 == 2) {
               var5.rotateY180();
            } else if (var3 == 3) {
               var5.rotateY90Ccw();
            }

            var5.method4761(var4, var2);
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

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lit;II)Lit;",
      garbageValue = "-1926546328"
   )
   @Export("transformSpotAnimationModel")
   Model transformSpotAnimationModel(Model var1, int var2) {
      Model var4;
      if (!this.isCachedModelIdSet()) {
         var2 = this.frameIds[var2];
         Frames var5 = WorldMapID.getFrames(var2 >> 16);
         var2 &= 65535;
         if (var5 == null) {
            return var1.toSharedSpotAnimationModel(true);
         } else {
            var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
            var4.animate(var5, var2);
            return var4;
         }
      } else {
         class133 var3 = TileItem.method2675(this.SequenceDefinition_cachedModelId);
         if (var3 == null) {
            return var1.toSharedSpotAnimationModel(true);
         } else {
            var4 = var1.toSharedSpotAnimationModel(!var3.method3136());
            var4.method4761(var3, var2);
            return var4;
         }
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lit;ILha;II)Lit;",
      garbageValue = "1451879882"
   )
   @Export("applyTransformations")
   public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
      if (field2297 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
         return this.method4132(var1, var2, var3, var4);
      } else {
         Model var5 = var1.toSharedSequenceModel(false);
         boolean var6 = false;
         Frames var7 = null;
         Skeleton var8 = null;
         class133 var9;
         if (this.isCachedModelIdSet()) {
            var9 = this.method4154();
            if (var9 == null) {
               return var5;
            }

            if (var3.isCachedModelIdSet() && this.field2289 == null) {
               var5.method4761(var9, var2);
               return var5;
            }

            var8 = var9.field1590;
            var5.method4804(var8, var9, var2, this.field2289, false, !var3.isCachedModelIdSet());
         } else {
            var2 = this.frameIds[var2];
            var7 = WorldMapID.getFrames(var2 >> 16);
            var2 &= 65535;
            if (var7 == null) {
               return var3.transformActorModel(var1, var4);
            }

            if (!var3.isCachedModelIdSet() && (this.field2304 == null || var4 == -1)) {
               var5.animate(var7, var2);
               return var5;
            }

            if (this.field2304 == null || var4 == -1) {
               var5.animate(var7, var2);
               return var5;
            }

            var6 = var3.isCachedModelIdSet();
            if (!var6) {
               var5.method4766(var7, var2, this.field2304, false);
            }
         }

         if (var3.isCachedModelIdSet()) {
            var9 = var3.method4154();
            if (var9 == null) {
               return var5;
            }

            if (var8 == null) {
               var8 = var9.field1590;
            }

            var5.method4804(var8, var9, var4, this.field2289, true, true);
         } else {
            var4 = var3.frameIds[var4];
            Frames var10 = WorldMapID.getFrames(var4 >> 16);
            var4 &= 65535;
            if (var10 == null) {
               return this.transformActorModel(var1, var2);
            }

            var5.method4766(var10, var4, this.field2304, true);
         }

         if (var6 && var7 != null) {
            var5.method4766(var7, var2, this.field2304, false);
         }

         var5.resetBounds();
         return var5;
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Lit;ILha;IB)Lit;",
      garbageValue = "52"
   )
   Model method4132(Model var1, int var2, SequenceDefinition var3, int var4) {
      var2 = this.frameIds[var2];
      Frames var5 = WorldMapID.getFrames(var2 >> 16);
      var2 &= 65535;
      if (var5 == null) {
         return var3.transformActorModel(var1, var4);
      } else {
         var4 = var3.frameIds[var4];
         Frames var6 = WorldMapID.getFrames(var4 >> 16);
         var4 &= 65535;
         Model var7;
         if (var6 == null) {
            var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
            var7.animate(var5, var2);
            return var7;
         } else {
            var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
            var7.animate2(var5, var2, var6, var4, this.field2304);
            return var7;
         }
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Lit;IB)Lit;",
      garbageValue = "-59"
   )
   @Export("transformWidgetModel")
   public Model transformWidgetModel(Model var1, int var2) {
      if (!this.isCachedModelIdSet()) {
         int var3 = this.frameIds[var2];
         Frames var4 = WorldMapID.getFrames(var3 >> 16);
         var3 &= 65535;
         if (var4 == null) {
            return var1.toSharedSequenceModel(true);
         } else {
            Frames var5 = null;
            int var6 = 0;
            if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
               var6 = this.chatFrameIds[var2];
               var5 = WorldMapID.getFrames(var6 >> 16);
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

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1471844378"
   )
   @Export("isCachedModelIdSet")
   public boolean isCachedModelIdSet() {
      return this.SequenceDefinition_cachedModelId >= 0;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1838545993"
   )
   public int method4135() {
      return this.field2298 - this.field2285;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(B)Lfh;",
      garbageValue = "4"
   )
   class133 method4154() {
      return this.isCachedModelIdSet() ? TileItem.method2675(this.SequenceDefinition_cachedModelId) : null;
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "([BIII)I",
      garbageValue = "645656657"
   )
   static int method4176(byte[] var0, int var1, int var2) {
      int var3 = -1;

      for(int var4 = var1; var4 < var2; ++var4) {
         var3 = var3 >>> 8 ^ Buffer.field4992[(var3 ^ var0[var4]) & 255];
      }

      var3 = ~var3;
      return var3;
   }

   @ObfuscatedName("lc")
   @ObfuscatedSignature(
      descriptor = "(IIIZI)V",
      garbageValue = "-726165376"
   )
   static final void method4149(int var0, int var1, int var2, boolean var3) {
      if (SoundSystem.loadInterface(var0)) {
         class135.resizeInterface(VerticalAlignment.Widget_interfaceComponents[var0], -1, var1, var2, var3);
      }
   }
}
