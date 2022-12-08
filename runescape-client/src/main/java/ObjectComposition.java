import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
   @ObfuscatedName("h")
   @Export("ObjectDefinition_isLowDetail")
   static boolean ObjectDefinition_isLowDetail = false;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("ObjectDefinition_archive")
   static AbstractArchive ObjectDefinition_archive;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("ObjectDefinition_cached")
   public static EvictingDualNodeHashTable ObjectDefinition_cached = new EvictingDualNodeHashTable(4096);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("ObjectDefinition_cachedModelData")
   public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("ObjectDefinition_cachedEntities")
   public static EvictingDualNodeHashTable ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("ObjectDefinition_cachedModels")
   public static EvictingDualNodeHashTable ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30);
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "[Lgi;"
   )
   static ModelData[] field2158 = new ModelData[4];
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 169329993
   )
   @Export("id")
   public int id;
   @ObfuscatedName("b")
   @Export("modelIds")
   int[] modelIds;
   @ObfuscatedName("j")
   @Export("models")
   int[] models;
   @ObfuscatedName("g")
   @Export("name")
   public String name = "null";
   @ObfuscatedName("i")
   @Export("recolorFrom")
   short[] recolorFrom;
   @ObfuscatedName("o")
   @Export("recolorTo")
   short[] recolorTo;
   @ObfuscatedName("n")
   @Export("retextureFrom")
   short[] retextureFrom;
   @ObfuscatedName("k")
   @Export("retextureTo")
   short[] retextureTo;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -729722715
   )
   @Export("sizeX")
   public int sizeX = 1;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1817261831
   )
   @Export("sizeY")
   public int sizeY = 1;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 2042865249
   )
   @Export("interactType")
   public int interactType = 2;
   @ObfuscatedName("t")
   @Export("boolean1")
   public boolean boolean1 = true;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1335218033
   )
   @Export("int1")
   public int int1 = -1;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -127791057
   )
   @Export("clipType")
   int clipType = -1;
   @ObfuscatedName("d")
   @Export("nonFlatShading")
   boolean nonFlatShading = false;
   @ObfuscatedName("y")
   @Export("modelClipped")
   public boolean modelClipped = false;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1255396169
   )
   @Export("animationId")
   public int animationId = -1;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1196023809
   )
   @Export("int2")
   public int int2 = 16;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -424668761
   )
   @Export("ambient")
   int ambient = 0;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -614815821
   )
   @Export("contrast")
   int contrast = 0;
   @ObfuscatedName("ao")
   @Export("actions")
   public String[] actions = new String[5];
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1128084973
   )
   @Export("mapIconId")
   public int mapIconId = -1;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -528274721
   )
   @Export("mapSceneId")
   public int mapSceneId = -1;
   @ObfuscatedName("au")
   @Export("isRotated")
   boolean isRotated = false;
   @ObfuscatedName("ar")
   @Export("clipped")
   public boolean clipped = true;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 588658835
   )
   @Export("modelSizeX")
   int modelSizeX = 128;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 1425199157
   )
   @Export("modelHeight")
   int modelHeight = 128;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1670589841
   )
   @Export("modelSizeY")
   int modelSizeY = 128;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1220901585
   )
   @Export("offsetX")
   int offsetX = 0;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1445641697
   )
   @Export("offsetHeight")
   int offsetHeight = 0;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1646929951
   )
   @Export("offsetY")
   int offsetY = 0;
   @ObfuscatedName("az")
   @Export("boolean2")
   public boolean boolean2 = false;
   @ObfuscatedName("ak")
   @Export("isSolid")
   boolean isSolid = false;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 188018083
   )
   @Export("int3")
   public int int3 = -1;
   @ObfuscatedName("ai")
   @Export("transforms")
   public int[] transforms;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -95041479
   )
   @Export("transformVarbit")
   int transformVarbit = -1;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -152229453
   )
   @Export("transformVarp")
   int transformVarp = -1;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 318837113
   )
   @Export("ambientSoundId")
   public int ambientSoundId = -1;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -69936869
   )
   @Export("int7")
   public int int7 = 0;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 918792525
   )
   @Export("int5")
   public int int5 = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -460573197
   )
   @Export("int6")
   public int int6 = 0;
   @ObfuscatedName("aa")
   @Export("soundEffectIds")
   public int[] soundEffectIds;
   @ObfuscatedName("ae")
   @Export("boolean3")
   public boolean boolean3 = true;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lql;"
   )
   @Export("params")
   IterableNodeHashTable params;

   ObjectComposition() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "183626496"
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

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "-64144267"
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

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Lqy;IB)V",
      garbageValue = "0"
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
            this.clipType = var1.readUnsignedByte() * 256;
         } else if (var2 == 82) {
            this.mapIconId = var1.readUnsignedShort();
         } else if (var2 == 89) {
            this.boolean3 = false;
         } else if (var2 == 249) {
            this.params = DynamicObject.readStringIntParameters(var1, this.params);
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

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "627475922"
   )
   public final boolean method3867(int var1) {
      if (this.models != null) {
         for(int var4 = 0; var4 < this.models.length; ++var4) {
            if (this.models[var4] == var1) {
               return SoundSystem.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & '\uffff', 0);
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
            var2 &= SoundSystem.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & '\uffff', 0);
         }

         return var2;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1396100760"
   )
   @Export("needsModelFiles")
   public final boolean needsModelFiles() {
      if (this.modelIds == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.modelIds.length; ++var2) {
            var1 &= SoundSystem.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & '\uffff', 0);
         }

         return var1;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(II[[IIIIS)Lhr;",
      garbageValue = "25456"
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

      if (this.clipType * 65536 >= 0) {
         if (var9 instanceof Model) {
            var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType * 65536);
         } else if (var9 instanceof ModelData) {
            var9 = ((ModelData)var9).method4208(var3, var4, var5, var6, true, this.clipType * 65536);
         }
      }

      return (Renderable)var9;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(II[[IIIII)Lhh;",
      garbageValue = "-488057678"
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

      if (this.clipType * 65536 >= 0) {
         var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType * 65536);
      }

      return var9;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(II[[IIIILga;II)Lhh;",
      garbageValue = "-2043624414"
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

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(III)Lgi;",
      garbageValue = "-386616443"
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
               var3 = ModelData.ModelData_get(SoundSystem.ObjectDefinition_modelsArchive, var7 & '\uffff', 0);
               if (var3 == null) {
                  return null;
               }

               if (var4) {
                  var3.method4217();
               }

               ObjectDefinition_cachedModelData.put(var3, (long)var7);
            }

            if (var5 > 1) {
               field2158[var6] = var3;
            }
         }

         if (var5 > 1) {
            var3 = new ModelData(field2158, var5);
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
            var3 = ModelData.ModelData_get(SoundSystem.ObjectDefinition_modelsArchive, var5 & '\uffff', 0);
            if (var3 == null) {
               return null;
            }

            if (var10) {
               var3.method4217();
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

      ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, null == this.recolorFrom, null == this.retextureFrom, true);
      if (var1 == 4 && var2 > 3) {
         var8.method4213(256);
         var8.changeOffset(45, 0, -45);
      }

      var2 &= 3;
      if (var2 == 1) {
         var8.method4210();
      } else if (var2 == 2) {
         var8.method4249();
      } else if (var2 == 3) {
         var8.method4212();
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

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(B)Lgn;",
      garbageValue = "0"
   )
   @Export("transform")
   public final ObjectComposition transform() {
      int var1 = -1;
      if (this.transformVarbit != -1) {
         var1 = PlayerCompositionColorTextureOverride.getVarbit(this.transformVarbit);
      } else if (this.transformVarp != -1) {
         var1 = Varps.Varps_main[this.transformVarp];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? VarpDefinition.getObjectDefinition(var2) : null;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-2059778542"
   )
   @Export("getIntParam")
   public int getIntParam(int var1, int var2) {
      return UserComparator8.method2819(this.params, var1, var2);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1880854720"
   )
   @Export("getStringParam")
   public String getStringParam(int var1, String var2) {
      IterableNodeHashTable var4 = this.params;
      String var3;
      if (var4 == null) {
         var3 = var2;
      } else {
         ObjectNode var5 = (ObjectNode)var4.get((long)var1);
         if (var5 == null) {
            var3 = var2;
         } else {
            var3 = (String)var5.obj;
         }
      }

      return var3;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "113"
   )
   @Export("hasSound")
   public boolean hasSound() {
      if (this.transforms == null) {
         return this.ambientSoundId != -1 || this.soundEffectIds != null;
      } else {
         for(int var1 = 0; var1 < this.transforms.length; ++var1) {
            if (this.transforms[var1] != -1) {
               ObjectComposition var2 = VarpDefinition.getObjectDefinition(this.transforms[var1]);
               if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "31130866"
   )
   @Export("isAlphaNumeric")
   public static boolean isAlphaNumeric(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }
}
