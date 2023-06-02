import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
   @ObfuscatedName("at")
   @Export("ObjectDefinition_isLowDetail")
   static boolean ObjectDefinition_isLowDetail = false;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("ObjectDefinition_archive")
   static AbstractArchive ObjectDefinition_archive;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("ObjectDefinition_modelsArchive")
   static AbstractArchive ObjectDefinition_modelsArchive;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("ObjectDefinition_cached")
   public static EvictingDualNodeHashTable ObjectDefinition_cached = new EvictingDualNodeHashTable(4096);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("ObjectDefinition_cachedModelData")
   public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("ObjectDefinition_cachedEntities")
   public static EvictingDualNodeHashTable ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("ObjectDefinition_cachedModels")
   public static EvictingDualNodeHashTable ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30);
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "[Lit;"
   )
   static ModelData[] field2152 = new ModelData[4];
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -489335251
   )
   @Export("id")
   public int id;
   @ObfuscatedName("af")
   @Export("modelIds")
   int[] modelIds;
   @ObfuscatedName("ao")
   @Export("models")
   int[] models;
   @ObfuscatedName("aa")
   @Export("name")
   public String name = "null";
   @ObfuscatedName("aj")
   @Export("recolorFrom")
   short[] recolorFrom;
   @ObfuscatedName("ad")
   @Export("recolorTo")
   short[] recolorTo;
   @ObfuscatedName("ac")
   @Export("retextureFrom")
   short[] retextureFrom;
   @ObfuscatedName("ag")
   @Export("retextureTo")
   short[] retextureTo;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -204720503
   )
   @Export("sizeX")
   public int sizeX = 1;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -576034075
   )
   @Export("sizeY")
   public int sizeY = 1;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1160024281
   )
   @Export("interactType")
   public int interactType = 2;
   @ObfuscatedName("au")
   @Export("boolean1")
   public boolean boolean1 = true;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 543078095
   )
   @Export("int1")
   public int int1 = -1;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1118581351
   )
   @Export("clipType")
   int clipType = -1;
   @ObfuscatedName("aw")
   @Export("nonFlatShading")
   boolean nonFlatShading = false;
   @ObfuscatedName("ay")
   @Export("modelClipped")
   public boolean modelClipped = false;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1100220731
   )
   @Export("animationId")
   public int animationId = -1;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1393871517
   )
   @Export("int2")
   public int int2 = 16;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 2108292893
   )
   @Export("ambient")
   int ambient = 0;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = 155318909
   )
   @Export("contrast")
   int contrast = 0;
   @ObfuscatedName("bj")
   @Export("actions")
   public String[] actions = new String[5];
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = -457162567
   )
   @Export("mapIconId")
   public int mapIconId = -1;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = -251846687
   )
   @Export("mapSceneId")
   public int mapSceneId = -1;
   @ObfuscatedName("bg")
   @Export("isRotated")
   boolean isRotated = false;
   @ObfuscatedName("bf")
   @Export("clipped")
   public boolean clipped = true;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = 1308755211
   )
   @Export("modelSizeX")
   int modelSizeX = 128;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = -959795897
   )
   @Export("modelHeight")
   int modelHeight = 128;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = 1304447411
   )
   @Export("modelSizeY")
   int modelSizeY = 128;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = 474281211
   )
   @Export("offsetX")
   int offsetX = 0;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = -65476363
   )
   @Export("offsetHeight")
   int offsetHeight = 0;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 697510297
   )
   @Export("offsetY")
   int offsetY = 0;
   @ObfuscatedName("bh")
   @Export("boolean2")
   public boolean boolean2 = false;
   @ObfuscatedName("bp")
   @Export("isSolid")
   boolean isSolid = false;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -1658086887
   )
   @Export("int3")
   public int int3 = -1;
   @ObfuscatedName("bi")
   @Export("transforms")
   public int[] transforms;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -869452553
   )
   @Export("transformVarbit")
   int transformVarbit = -1;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -70536035
   )
   @Export("transformVarp")
   int transformVarp = -1;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 1908136785
   )
   @Export("ambientSoundId")
   public int ambientSoundId = -1;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = 1194059163
   )
   @Export("int7")
   public int int7 = 0;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = 68803653
   )
   @Export("int5")
   public int int5 = 0;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = 546433117
   )
   @Export("int6")
   public int int6 = 0;
   @ObfuscatedName("by")
   @Export("soundEffectIds")
   public int[] soundEffectIds;
   @ObfuscatedName("bt")
   @Export("boolean3")
   public boolean boolean3 = true;
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "Lsv;"
   )
   @Export("params")
   IterableNodeHashTable params;

   ObjectComposition() {
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   @Export("postDecode")
   void postDecode() {
      if (this.int1 == -1) {
         this.int1 = 0;
         if (this.modelIds != null && (this.models == null || this.models[0] == 10)) {
            this.int1 = 1;
         }

         for(int var1 = 0; var1 < 5; ++var1) {
            if (this.actions[var1] != null) {
               this.int1 = 1;
            }
         }
      }

      if (this.int3 == -1) {
         this.int3 = this.interactType != 0 ? 1 : 0;
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "1428580968"
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

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Ltz;II)V",
      garbageValue = "-341895746"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.readUnsignedByte();
         if (var3 > 0) {
            if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
               var1.offset += 3 * var3;
            } else {
               this.models = new int[var3];
               this.modelIds = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.modelIds[var4] = var1.readUnsignedShort();
                  this.models[var4] = var1.readUnsignedByte();
               }
            }
         }
      } else if (var2 == 2) {
         this.name = var1.readStringCp1252NullTerminated();
      } else if (var2 == 5) {
         var3 = var1.readUnsignedByte();
         if (var3 > 0) {
            if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
               var1.offset += 2 * var3;
            } else {
               this.models = null;
               this.modelIds = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.modelIds[var4] = var1.readUnsignedShort();
               }
            }
         }
      } else if (var2 == 14) {
         this.sizeX = var1.readUnsignedByte();
      } else if (var2 == 15) {
         this.sizeY = var1.readUnsignedByte();
      } else if (var2 == 17) {
         this.interactType = 0;
         this.boolean1 = false;
      } else if (var2 == 18) {
         this.boolean1 = false;
      } else if (var2 == 19) {
         this.int1 = var1.readUnsignedByte();
      } else if (var2 == 21) {
         this.clipType = 0;
      } else if (var2 == 22) {
         this.nonFlatShading = true;
      } else if (var2 == 23) {
         this.modelClipped = true;
      } else if (var2 == 24) {
         this.animationId = var1.readUnsignedShort();
         if (this.animationId == 65535) {
            this.animationId = -1;
         }
      } else if (var2 == 27) {
         this.interactType = 1;
      } else if (var2 == 28) {
         this.int2 = var1.readUnsignedByte();
      } else if (var2 == 29) {
         this.ambient = var1.readByte();
      } else if (var2 == 39) {
         this.contrast = var1.readByte();
      } else if (var2 >= 30 && var2 < 35) {
         this.actions[var2 - 30] = var1.readStringCp1252NullTerminated();
         if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.actions[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var3 = var1.readUnsignedByte();
         this.recolorFrom = new short[var3];
         this.recolorTo = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.recolorFrom[var4] = (short)var1.readUnsignedShort();
            this.recolorTo[var4] = (short)var1.readUnsignedShort();
         }
      } else if (var2 == 41) {
         var3 = var1.readUnsignedByte();
         this.retextureFrom = new short[var3];
         this.retextureTo = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.retextureFrom[var4] = (short)var1.readUnsignedShort();
            this.retextureTo[var4] = (short)var1.readUnsignedShort();
         }
      } else if (var2 == 61) {
         var1.readUnsignedShort();
      } else if (var2 == 62) {
         this.isRotated = true;
      } else if (var2 == 64) {
         this.clipped = false;
      } else if (var2 == 65) {
         this.modelSizeX = var1.readUnsignedShort();
      } else if (var2 == 66) {
         this.modelHeight = var1.readUnsignedShort();
      } else if (var2 == 67) {
         this.modelSizeY = var1.readUnsignedShort();
      } else if (var2 == 68) {
         this.mapSceneId = var1.readUnsignedShort();
      } else if (var2 == 69) {
         var1.readUnsignedByte();
      } else if (var2 == 70) {
         this.offsetX = var1.readShort();
      } else if (var2 == 71) {
         this.offsetHeight = var1.readShort();
      } else if (var2 == 72) {
         this.offsetY = var1.readShort();
      } else if (var2 == 73) {
         this.boolean2 = true;
      } else if (var2 == 74) {
         this.isSolid = true;
      } else if (var2 == 75) {
         this.int3 = var1.readUnsignedByte();
      } else if (var2 != 77 && var2 != 92) {
         if (var2 == 78) {
            this.ambientSoundId = var1.readUnsignedShort();
            this.int7 = var1.readUnsignedByte();
         } else if (var2 == 79) {
            this.int5 = var1.readUnsignedShort();
            this.int6 = var1.readUnsignedShort();
            this.int7 = var1.readUnsignedByte();
            var3 = var1.readUnsignedByte();
            this.soundEffectIds = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.soundEffectIds[var4] = var1.readUnsignedShort();
            }
         } else if (var2 == 81) {
            this.clipType = var1.readUnsignedByte() * 256;
         } else if (var2 == 82) {
            this.mapIconId = var1.readUnsignedShort();
         } else if (var2 == 89) {
            this.boolean3 = false;
         } else if (var2 == 249) {
            this.params = ReflectionCheck.readStringIntParameters(var1, this.params);
         }
      } else {
         this.transformVarbit = var1.readUnsignedShort();
         if (this.transformVarbit == 65535) {
            this.transformVarbit = -1;
         }

         this.transformVarp = var1.readUnsignedShort();
         if (this.transformVarp == 65535) {
            this.transformVarp = -1;
         }

         var3 = -1;
         if (var2 == 92) {
            var3 = var1.readUnsignedShort();
            if (var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.readUnsignedByte();
         this.transforms = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.transforms[var5] = var1.readUnsignedShort();
            if (this.transforms[var5] == 65535) {
               this.transforms[var5] = -1;
            }
         }

         this.transforms[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "-49"
   )
   public final boolean method3908(int var1) {
      if (this.models != null) {
         for(int var4 = 0; var4 < this.models.length; ++var4) {
            if (this.models[var4] == var1) {
               return ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & '\uffff', 0);
            }
         }

         return true;
      } else if (this.modelIds == null) {
         return true;
      } else if (var1 != 10) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.modelIds.length; ++var3) {
            var2 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & '\uffff', 0);
         }

         return var2;
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "119"
   )
   @Export("needsModelFiles")
   public final boolean needsModelFiles() {
      if (this.modelIds == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.modelIds.length; ++var2) {
            var1 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & '\uffff', 0);
         }

         return var1;
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(II[[IIIII)Lim;",
      garbageValue = "1775636691"
   )
   @Export("getEntity")
   public final Renderable getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (this.models == null) {
         var7 = (long)(var2 + (this.id << 10));
      } else {
         var7 = (long)(var2 + (var1 << 3) + (this.id << 10));
      }

      Object var9 = (Renderable)ObjectDefinition_cachedEntities.get(var7);
      if (var9 == null) {
         ModelData var10 = this.getModelData(var1, var2);
         if (var10 == null) {
            return null;
         }

         if (!this.nonFlatShading) {
            var9 = var10.toModel(this.ambient + 64, this.contrast * 25 + 768, -50, -10, -50);
         } else {
            var10.ambient = (short)(this.ambient + 64);
            var10.contrast = (short)(this.contrast * 25 + 768);
            var10.calculateVertexNormals();
            var9 = var10;
         }

         ObjectDefinition_cachedEntities.put((DualNode)var9, var7);
      }

      if (this.nonFlatShading) {
         var9 = ((ModelData)var9).copyModelData();
      }

      if (this.clipType * 65536 >= 0) {
         if (var9 instanceof Model) {
            var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType * 65536);
         } else if (var9 instanceof ModelData) {
            var9 = ((ModelData)var9).method4280(var3, var4, var5, var6, true, this.clipType * 65536);
         }
      }

      return (Renderable)var9;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(II[[IIIII)Ljd;",
      garbageValue = "1744989838"
   )
   @Export("getModel")
   public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (this.models == null) {
         var7 = (long)(var2 + (this.id << 10));
      } else {
         var7 = (long)(var2 + (var1 << 3) + (this.id << 10));
      }

      Model var9 = (Model)ObjectDefinition_cachedModels.get(var7);
      if (var9 == null) {
         ModelData var10 = this.getModelData(var1, var2);
         if (var10 == null) {
            return null;
         }

         var9 = var10.toModel(this.ambient + 64, this.contrast * 25 + 768, -50, -10, -50);
         ObjectDefinition_cachedModels.put(var9, var7);
      }

      if (this.clipType * 65536 >= 0) {
         var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType * 65536);
      }

      return var9;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II[[IIIILhy;IB)Ljd;",
      garbageValue = "-10"
   )
   @Export("getModelDynamic")
   public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
      long var9;
      if (this.models == null) {
         var9 = (long)(var2 + (this.id << 10));
      } else {
         var9 = (long)(var2 + (var1 << 3) + (this.id << 10));
      }

      Model var11 = (Model)ObjectDefinition_cachedModels.get(var9);
      if (var11 == null) {
         ModelData var12 = this.getModelData(var1, var2);
         if (var12 == null) {
            return null;
         }

         var11 = var12.toModel(this.ambient + 64, this.contrast * 25 + 768, -50, -10, -50);
         ObjectDefinition_cachedModels.put(var11, var9);
      }

      if (var7 == null && this.clipType * 65536 == -1) {
         return var11;
      } else {
         if (var7 != null) {
            var11 = var7.transformObjectModel(var11, var8, var2);
         } else {
            var11 = var11.toSharedSequenceModel(true);
         }

         if (this.clipType * 65536 >= 0) {
            var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType * 65536);
         }

         return var11;
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(III)Lit;",
      garbageValue = "-1913327230"
   )
   @Export("getModelData")
   final ModelData getModelData(int var1, int var2) {
      ModelData var3 = null;
      boolean var4;
      int var5;
      int var7;
      if (this.models == null) {
         if (var1 != 10) {
            return null;
         }

         if (this.modelIds == null) {
            return null;
         }

         var4 = this.isRotated;
         if (var1 == 2 && var2 > 3) {
            var4 = !var4;
         }

         var5 = this.modelIds.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            var7 = this.modelIds[var6];
            if (var4) {
               var7 += 65536;
            }

            var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var7);
            if (var3 == null) {
               var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var7 & '\uffff', 0);
               if (var3 == null) {
                  return null;
               }

               if (var4) {
                  var3.method4288();
               }

               ObjectDefinition_cachedModelData.put(var3, (long)var7);
            }

            if (var5 > 1) {
               field2152[var6] = var3;
            }
         }

         if (var5 > 1) {
            var3 = new ModelData(field2152, var5);
         }
      } else {
         int var9 = -1;

         for(var5 = 0; var5 < this.models.length; ++var5) {
            if (this.models[var5] == var1) {
               var9 = var5;
               break;
            }
         }

         if (var9 == -1) {
            return null;
         }

         var5 = this.modelIds[var9];
         boolean var10 = this.isRotated ^ var2 > 3;
         if (var10) {
            var5 += 65536;
         }

         var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var5);
         if (var3 == null) {
            var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var5 & '\uffff', 0);
            if (var3 == null) {
               return null;
            }

            if (var10) {
               var3.method4288();
            }

            ObjectDefinition_cachedModelData.put(var3, (long)var5);
         }
      }

      if (this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128) {
         var4 = false;
      } else {
         var4 = true;
      }

      boolean var11;
      if (this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) {
         var11 = false;
      } else {
         var11 = true;
      }

      ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, this.recolorFrom == null, null == this.retextureFrom, true);
      if (var1 == 4 && var2 > 3) {
         var8.method4308(256);
         var8.changeOffset(45, 0, -45);
      }

      var2 &= 3;
      if (var2 == 1) {
         var8.method4282();
      } else if (var2 == 2) {
         var8.method4283();
      } else if (var2 == 3) {
         var8.method4284();
      }

      if (this.recolorFrom != null) {
         for(var7 = 0; var7 < this.recolorFrom.length; ++var7) {
            var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]);
         }
      }

      if (this.retextureFrom != null) {
         for(var7 = 0; var7 < this.retextureFrom.length; ++var7) {
            var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]);
         }
      }

      if (var4) {
         var8.resize(this.modelSizeX, this.modelHeight, this.modelSizeY);
      }

      if (var11) {
         var8.changeOffset(this.offsetX, this.offsetHeight, this.offsetY);
      }

      return var8;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)Lhx;",
      garbageValue = "-892315242"
   )
   @Export("transform")
   public final ObjectComposition transform() {
      int var1 = -1;
      if (this.transformVarbit != -1) {
         var1 = class343.getVarbit(this.transformVarbit);
      } else if (this.transformVarp != -1) {
         var1 = Varps.Varps_main[this.transformVarp];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? class175.getObjectDefinition(var2) : null;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1117153245"
   )
   @Export("getIntParam")
   public int getIntParam(int var1, int var2) {
      IterableNodeHashTable var4 = this.params;
      int var3;
      if (var4 == null) {
         var3 = var2;
      } else {
         IntegerNode var5 = (IntegerNode)var4.get((long)var1);
         if (var5 == null) {
            var3 = var2;
         } else {
            var3 = var5.integer;
         }
      }

      return var3;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "153510909"
   )
   @Export("getStringParam")
   public String getStringParam(int var1, String var2) {
      return class165.method3374(this.params, var1, var2);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1773825529"
   )
   @Export("hasSound")
   public boolean hasSound() {
      if (this.transforms == null) {
         return this.ambientSoundId != -1 || this.soundEffectIds != null;
      } else {
         for(int var1 = 0; var1 < this.transforms.length; ++var1) {
            if (this.transforms[var1] != -1) {
               ObjectComposition var2 = class175.getObjectDefinition(this.transforms[var1]);
               if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lmr;S)V",
      garbageValue = "1351"
   )
   public static void method3947(class312 var0) {
      class304.field3388.remove(var0);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lli;Ltq;I)Llm;",
      garbageValue = "-2139754397"
   )
   @Export("getPacketBufferNode")
   public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
      PacketBufferNode var2;
      if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
         var2 = new PacketBufferNode();
      } else {
         var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
      }

      var2.clientPacket = var0;
      var2.clientPacketLength = var0.length;
      if (var2.clientPacketLength == -1) {
         var2.packetBuffer = new PacketBuffer(260);
      } else if (var2.clientPacketLength == -2) {
         var2.packetBuffer = new PacketBuffer(10000);
      } else if (var2.clientPacketLength <= 18) {
         var2.packetBuffer = new PacketBuffer(20);
      } else if (var2.clientPacketLength <= 98) {
         var2.packetBuffer = new PacketBuffer(100);
      } else {
         var2.packetBuffer = new PacketBuffer(260);
      }

      var2.packetBuffer.setIsaacCipher(var1);
      var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
      var2.index = 0;
      return var2;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lgr;IIS)Lbi;",
      garbageValue = "19542"
   )
   public static final PcmPlayer method3907(TaskHandler var0, int var1, int var2) {
      if (PcmPlayer.field291 == 0) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 256) {
            var2 = 256;
         }

         try {
            PcmPlayer var3 = AbstractUserComparator.pcmPlayerProvider.player();
            var3.samples = new int[(class347.PcmPlayer_stereo ? 2 : 1) * 256];
            var3.field289 = var2;
            var3.init();
            var3.capacity = (var2 & -1024) + 1024;
            if (var3.capacity > 16384) {
               var3.capacity = 16384;
            }

            var3.open(var3.capacity);
            if (class260.field2944 > 0 && class382.soundSystem == null) {
               class382.soundSystem = new SoundSystem();
               PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1);
               PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(class382.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (class382.soundSystem != null) {
               if (class382.soundSystem.players[var1] != null) {
                  throw new IllegalArgumentException();
               }

               class382.soundSystem.players[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            return new PcmPlayer();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
