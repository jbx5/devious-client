import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
   @ObfuscatedName("aj")
   @Export("ObjectDefinition_isLowDetail")
   public static boolean ObjectDefinition_isLowDetail = false;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("ObjectDefinition_archive")
   public static AbstractArchive ObjectDefinition_archive;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("ObjectDefinition_modelsArchive")
   public static AbstractArchive ObjectDefinition_modelsArchive;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("ObjectDefinition_cached")
   static EvictingDualNodeHashTable ObjectDefinition_cached = new EvictingDualNodeHashTable(4096);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("ObjectDefinition_cachedModelData")
   public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("ObjectDefinition_cachedEntities")
   static EvictingDualNodeHashTable ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("ObjectDefinition_cachedModels")
   static EvictingDualNodeHashTable ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "[Liu;"
   )
   static ModelData[] field2130 = new ModelData[4];
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1612099371
   )
   @Export("id")
   public int id;
   @ObfuscatedName("ar")
   @Export("modelIds")
   int[] modelIds;
   @ObfuscatedName("ak")
   @Export("models")
   int[] models;
   @ObfuscatedName("ax")
   @Export("name")
   public String name = "null";
   @ObfuscatedName("as")
   @Export("recolorFrom")
   short[] recolorFrom;
   @ObfuscatedName("ay")
   @Export("recolorTo")
   short[] recolorTo;
   @ObfuscatedName("am")
   @Export("retextureFrom")
   short[] retextureFrom;
   @ObfuscatedName("az")
   @Export("retextureTo")
   short[] retextureTo;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 550215195
   )
   @Export("sizeX")
   public int sizeX = 1;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1978565619
   )
   @Export("sizeY")
   public int sizeY = 1;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1147802019
   )
   @Export("interactType")
   public int interactType = 2;
   @ObfuscatedName("at")
   @Export("boolean1")
   public boolean boolean1 = true;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 964370453
   )
   @Export("int1")
   public int int1 = -1;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 67134427
   )
   @Export("clipType")
   int clipType = -256;
   @ObfuscatedName("aw")
   @Export("nonFlatShading")
   boolean nonFlatShading = false;
   @ObfuscatedName("aa")
   @Export("modelClipped")
   public boolean modelClipped = false;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 16408437
   )
   @Export("animationId")
   public int animationId = -1;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1748548831
   )
   @Export("int2")
   public int int2 = 16;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = 1494562931
   )
   @Export("ambient")
   int ambient = 0;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -1526509789
   )
   @Export("contrast")
   int contrast = 0;
   @ObfuscatedName("bo")
   @Export("actions")
   public String[] actions = new String[5];
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 1572828851
   )
   @Export("mapIconId")
   public int mapIconId = -1;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 1622151041
   )
   @Export("mapSceneId")
   public int mapSceneId = -1;
   @ObfuscatedName("bh")
   @Export("isRotated")
   boolean isRotated = false;
   @ObfuscatedName("bl")
   @Export("clipped")
   public boolean clipped = true;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -44448767
   )
   @Export("modelSizeX")
   int modelSizeX = 128;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = -1019591955
   )
   @Export("modelHeight")
   int modelHeight = 128;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = 805870735
   )
   @Export("modelSizeY")
   int modelSizeY = 128;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 408971527
   )
   @Export("offsetX")
   int offsetX = 0;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 1456012281
   )
   @Export("offsetHeight")
   int offsetHeight = 0;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = -1250417011
   )
   @Export("offsetY")
   int offsetY = 0;
   @ObfuscatedName("bt")
   @Export("boolean2")
   public boolean boolean2 = false;
   @ObfuscatedName("be")
   @Export("isSolid")
   boolean isSolid = false;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = 1682396723
   )
   @Export("int3")
   public int int3 = -1;
   @ObfuscatedName("bd")
   @Export("transforms")
   public int[] transforms;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = 1376571365
   )
   @Export("transformVarbit")
   int transformVarbit = -1;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = -1650222463
   )
   @Export("transformVarp")
   int transformVarp = -1;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = 264155229
   )
   @Export("ambientSoundId")
   public int ambientSoundId = -1;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = -818542125
   )
   @Export("int7")
   public int int7 = 0;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = -1679104365
   )
   @Export("int5")
   public int int5 = 0;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = -530985245
   )
   @Export("int6")
   public int int6 = 0;
   @ObfuscatedName("bf")
   @Export("soundEffectIds")
   public int[] soundEffectIds;
   @ObfuscatedName("bw")
   @Export("boolean3")
   public boolean boolean3 = true;
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "Lrz;"
   )
   @Export("params")
   IterableNodeHashTable params;

   ObjectComposition() {
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "4"
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

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "765567634"
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

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lsy;II)V",
      garbageValue = "-864589782"
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
               var1.offset += var3 * 2;
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
         this.contrast = var1.readByte() * 25;
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
            this.clipType = var1.readUnsignedByte() * 65536;
         } else if (var2 == 82) {
            this.mapIconId = var1.readUnsignedShort();
         } else if (var2 == 89) {
            this.boolean3 = false;
         } else if (var2 == 249) {
            this.params = AABB.readStringIntParameters(var1, this.params);
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

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1977143990"
   )
   public final boolean method3868(int var1) {
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

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1334940900"
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

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(II[[IIIII)Liq;",
      garbageValue = "-198352701"
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
            var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
         } else {
            var10.ambient = (short)(this.ambient + 64);
            var10.contrast = (short)(this.contrast + 768);
            var10.calculateVertexNormals();
            var9 = var10;
         }

         ObjectDefinition_cachedEntities.put((DualNode)var9, var7);
      }

      if (this.nonFlatShading) {
         var9 = ((ModelData)var9).copyModelData();
      }

      if (this.clipType * 256 >= 0) {
         if (var9 instanceof Model) {
            var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType * 256);
         } else if (var9 instanceof ModelData) {
            var9 = ((ModelData)var9).method4172(var3, var4, var5, var6, true, this.clipType * 256);
         }
      }

      return (Renderable)var9;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(II[[IIIIB)Lix;",
      garbageValue = "47"
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

         var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
         ObjectDefinition_cachedModels.put(var9, var7);
      }

      if (this.clipType * 256 >= 0) {
         var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType * 256);
      }

      return var9;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II[[IIIILhx;IB)Lix;",
      garbageValue = "92"
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

         var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
         ObjectDefinition_cachedModels.put(var11, var9);
      }

      if (var7 == null && this.clipType * 256 == -1) {
         return var11;
      } else {
         if (var7 != null) {
            var11 = var7.transformObjectModel(var11, var8, var2);
         } else {
            var11 = var11.toSharedSequenceModel(true);
         }

         if (this.clipType * 256 >= 0) {
            var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType * 256);
         }

         return var11;
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(III)Liu;",
      garbageValue = "-348568946"
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
                  var3.method4221();
               }

               ObjectDefinition_cachedModelData.put(var3, (long)var7);
            }

            if (var5 > 1) {
               field2130[var6] = var3;
            }
         }

         if (var5 > 1) {
            var3 = new ModelData(field2130, var5);
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
               var3.method4221();
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

      ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, this.recolorFrom == null, this.retextureFrom == null, true);
      if (var1 == 4 && var2 > 3) {
         var8.method4176(256);
         var8.changeOffset(45, 0, -45);
      }

      var2 &= 3;
      if (var2 == 1) {
         var8.method4177();
      } else if (var2 == 2) {
         var8.method4175();
      } else if (var2 == 3) {
         var8.method4205();
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

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(B)Lhu;",
      garbageValue = "5"
   )
   @Export("transform")
   public final ObjectComposition transform() {
      int var1 = -1;
      if (this.transformVarbit != -1) {
         var1 = class17.getVarbit(this.transformVarbit);
      } else if (this.transformVarp != -1) {
         var1 = Varps.Varps_main[this.transformVarp];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? WallDecoration.getObjectDefinition(var2) : null;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-729233850"
   )
   @Export("getIntParam")
   public int getIntParam(int var1, int var2) {
      return class139.method3104(this.params, var1, var2);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-1016497085"
   )
   @Export("getStringParam")
   public String getStringParam(int var1, String var2) {
      return class428.method7964(this.params, var1, var2);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2145489450"
   )
   @Export("hasSound")
   public boolean hasSound() {
      if (this.transforms == null) {
         return this.ambientSoundId != -1 || this.soundEffectIds != null;
      } else {
         for(int var1 = 0; var1 < this.transforms.length; ++var1) {
            if (this.transforms[var1] != -1) {
               ObjectComposition var2 = WallDecoration.getObjectDefinition(this.transforms[var1]);
               if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedName("fd")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2006068559"
   )
   static void method3878() {
      class308.field3460 = System.getenv("JX_ACCESS_TOKEN");
      class12.field63 = System.getenv("JX_REFRESH_TOKEN");
      class90.field1120 = System.getenv("JX_SESSION_ID");
      class433.field4642 = System.getenv("JX_CHARACTER_ID");
      String var0 = System.getenv("JX_DISPLAY_NAME");
      Login.field911 = class88.method2287(var0);
   }
}
