import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("ItemDefinition_modelArchive")
   public static AbstractArchive ItemDefinition_modelArchive;
   @ObfuscatedName("n")
   @Export("ItemDefinition_inMembersWorld")
   public static boolean ItemDefinition_inMembersWorld;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -263589167
   )
   @Export("ItemDefinition_fileCount")
   public static int ItemDefinition_fileCount;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("ItemDefinition_cached")
   static EvictingDualNodeHashTable ItemDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("ItemDefinition_cachedModels")
   static EvictingDualNodeHashTable ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50);
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("ItemDefinition_cachedSprites")
   public static EvictingDualNodeHashTable ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200);
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1337904835
   )
   @Export("id")
   public int id;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1268793919
   )
   @Export("model")
   int model;
   @ObfuscatedName("h")
   @Export("name")
   public String name = "null";
   @ObfuscatedName("p")
   @Export("recolorFrom")
   public short[] recolorFrom;
   @ObfuscatedName("o")
   @Export("recolorTo")
   public short[] recolorTo;
   @ObfuscatedName("u")
   @Export("retextureFrom")
   public short[] retextureFrom;
   @ObfuscatedName("x")
   @Export("retextureTo")
   public short[] retextureTo;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 573238063
   )
   @Export("zoom2d")
   public int zoom2d = 2000;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1887176163
   )
   @Export("xan2d")
   public int xan2d = 0;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -950089521
   )
   @Export("yan2d")
   public int yan2d = 0;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 176300183
   )
   @Export("zan2d")
   public int zan2d = 0;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1482961159
   )
   @Export("offsetX2d")
   public int offsetX2d = 0;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -689232791
   )
   @Export("offsetY2d")
   public int offsetY2d = 0;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -2128541311
   )
   @Export("isStackable")
   public int isStackable = 0;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -42628373
   )
   @Export("price")
   public int price = 1;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1073240539
   )
   @Export("maleModel")
   public int maleModel = -1;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1603357297
   )
   @Export("maleModel1")
   public int maleModel1 = -1;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1123230039
   )
   @Export("maleModel2")
   public int maleModel2 = -1;
   @ObfuscatedName("ar")
   @Export("isMembersOnly")
   public boolean isMembersOnly = false;
   @ObfuscatedName("al")
   @Export("groundActions")
   public String[] groundActions = new String[]{null, null, "Take", null, null};
   @ObfuscatedName("at")
   @Export("inventoryActions")
   public String[] inventoryActions = new String[]{null, null, null, null, "Drop"};
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1124407501
   )
   @Export("shiftClickIndex")
   int shiftClickIndex = -2;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -1747194031
   )
   @Export("femaleModel")
   int femaleModel = -1;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1558081567
   )
   @Export("femaleModel1")
   int femaleModel1 = -1;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 264552265
   )
   @Export("femaleOffset")
   int femaleOffset = 0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1396716739
   )
   @Export("maleHeadModel")
   int maleHeadModel = -1;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -50285121
   )
   @Export("maleHeadModel2")
   int maleHeadModel2 = -1;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1220984871
   )
   int field2255 = 0;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 2086029757
   )
   @Export("femaleModel2")
   int femaleModel2 = -1;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1914602257
   )
   @Export("femaleHeadModel")
   int femaleHeadModel = -1;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 229636295
   )
   @Export("femaleHeadModel2")
   int femaleHeadModel2 = -1;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -96585303
   )
   int field2228 = -1;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1179373093
   )
   int field2246 = -1;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1988503511
   )
   int field2206 = -1;
   @ObfuscatedName("an")
   @Export("countobj")
   int[] countobj;
   @ObfuscatedName("am")
   @Export("countco")
   int[] countco;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 2078571011
   )
   @Export("note")
   public int note = -1;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -654754895
   )
   @Export("noteTemplate")
   public int noteTemplate = -1;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = 648776893
   )
   @Export("resizeX")
   int resizeX = 128;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = 1649429389
   )
   @Export("resizeY")
   int resizeY = 128;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 341161419
   )
   @Export("resizeZ")
   int resizeZ = 128;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = -2130209885
   )
   public int field2263 = 0;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = 563234071
   )
   public int field2256 = 0;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 1072869101
   )
   @Export("team")
   public int team = 0;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = 449448039
   )
   public int field2258 = 0;
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "Lqu;"
   )
   @Export("params")
   IterableNodeHashTable params;
   @ObfuscatedName("bq")
   @Export("isTradable")
   public boolean isTradable = false;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = -230219621
   )
   @Export("unnotedId")
   int unnotedId = -1;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -332540241
   )
   @Export("notedId")
   int notedId = -1;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -1207318239
   )
   @Export("placeholder")
   public int placeholder = -1;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 1205821767
   )
   @Export("placeholderTemplate")
   public int placeholderTemplate = -1;

   ItemComposition() {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1800609345"
   )
   @Export("post")
   void post() {
      if (this.isStackable == 1) {
         this.field2258 = 0;
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "-27011015"
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

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lrd;IB)V",
      garbageValue = "66"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.model = var1.readUnsignedShort();
      } else if (var2 == 2) {
         this.name = var1.readStringCp1252NullTerminated();
      } else if (var2 == 4) {
         this.zoom2d = var1.readUnsignedShort();
      } else if (var2 == 5) {
         this.xan2d = var1.readUnsignedShort();
      } else if (var2 == 6) {
         this.yan2d = var1.readUnsignedShort();
      } else if (var2 == 7) {
         this.offsetX2d = var1.readUnsignedShort();
         if (this.offsetX2d > 32767) {
            this.offsetX2d -= 65536;
         }
      } else if (var2 == 8) {
         this.offsetY2d = var1.readUnsignedShort();
         if (this.offsetY2d > 32767) {
            this.offsetY2d -= 65536;
         }
      } else if (var2 == 9) {
         var1.readStringCp1252NullTerminated();
      } else if (var2 == 11) {
         this.isStackable = 1;
      } else if (var2 == 12) {
         this.price = var1.readInt();
      } else if (var2 == 13) {
         this.maleModel = var1.readUnsignedByte();
      } else if (var2 == 14) {
         this.maleModel1 = var1.readUnsignedByte();
      } else if (var2 == 16) {
         this.isMembersOnly = true;
      } else if (var2 == 23) {
         this.femaleModel = var1.readUnsignedShort();
         this.femaleOffset = var1.readUnsignedByte();
      } else if (var2 == 24) {
         this.femaleModel1 = var1.readUnsignedShort();
      } else if (var2 == 25) {
         this.maleHeadModel = var1.readUnsignedShort();
         this.field2255 = var1.readUnsignedByte();
      } else if (var2 == 26) {
         this.maleHeadModel2 = var1.readUnsignedShort();
      } else if (var2 == 27) {
         this.maleModel2 = var1.readUnsignedByte();
      } else if (var2 >= 30 && var2 < 35) {
         this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated();
         if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.groundActions[var2 - 30] = null;
         }
      } else if (var2 >= 35 && var2 < 40) {
         this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
      } else {
         int var3;
         int var4;
         if (var2 == 40) {
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
         } else if (var2 == 42) {
            this.shiftClickIndex = var1.readByte();
         } else if (var2 == 65) {
            this.isTradable = true;
         } else if (var2 == 75) {
            this.field2258 = var1.readShort();
         } else if (var2 == 78) {
            this.femaleModel2 = var1.readUnsignedShort();
         } else if (var2 == 79) {
            this.femaleHeadModel = var1.readUnsignedShort();
         } else if (var2 == 90) {
            this.femaleHeadModel2 = var1.readUnsignedShort();
         } else if (var2 == 91) {
            this.field2246 = var1.readUnsignedShort();
         } else if (var2 == 92) {
            this.field2228 = var1.readUnsignedShort();
         } else if (var2 == 93) {
            this.field2206 = var1.readUnsignedShort();
         } else if (var2 == 94) {
            var1.readUnsignedShort();
         } else if (var2 == 95) {
            this.zan2d = var1.readUnsignedShort();
         } else if (var2 == 97) {
            this.note = var1.readUnsignedShort();
         } else if (var2 == 98) {
            this.noteTemplate = var1.readUnsignedShort();
         } else if (var2 >= 100 && var2 < 110) {
            if (this.countobj == null) {
               this.countobj = new int[10];
               this.countco = new int[10];
            }

            this.countobj[var2 - 100] = var1.readUnsignedShort();
            this.countco[var2 - 100] = var1.readUnsignedShort();
         } else if (var2 == 110) {
            this.resizeX = var1.readUnsignedShort();
         } else if (var2 == 111) {
            this.resizeY = var1.readUnsignedShort();
         } else if (var2 == 112) {
            this.resizeZ = var1.readUnsignedShort();
         } else if (var2 == 113) {
            this.field2263 = var1.readByte();
         } else if (var2 == 114) {
            this.field2256 = var1.readByte() * 5;
         } else if (var2 == 115) {
            this.team = var1.readUnsignedByte();
         } else if (var2 == 139) {
            this.unnotedId = var1.readUnsignedShort();
         } else if (var2 == 140) {
            this.notedId = var1.readUnsignedShort();
         } else if (var2 == 148) {
            this.placeholder = var1.readUnsignedShort();
         } else if (var2 == 149) {
            this.placeholderTemplate = var1.readUnsignedShort();
         } else if (var2 == 249) {
            this.params = class127.readStringIntParameters(var1, this.params);
         }
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Lgr;Lgr;I)V",
      garbageValue = "1968405149"
   )
   @Export("genCert")
   void genCert(ItemComposition var1, ItemComposition var2) {
      this.model = var1.model;
      this.zoom2d = var1.zoom2d;
      this.xan2d = var1.xan2d;
      this.yan2d = var1.yan2d;
      this.zan2d = var1.zan2d;
      this.offsetX2d = var1.offsetX2d;
      this.offsetY2d = var1.offsetY2d;
      this.recolorFrom = var1.recolorFrom;
      this.recolorTo = var1.recolorTo;
      this.retextureFrom = var1.retextureFrom;
      this.retextureTo = var1.retextureTo;
      this.name = var2.name;
      this.isMembersOnly = var2.isMembersOnly;
      this.price = var2.price;
      this.isStackable = 1;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lgr;Lgr;B)V",
      garbageValue = "-54"
   )
   @Export("genBought")
   void genBought(ItemComposition var1, ItemComposition var2) {
      this.model = var1.model;
      this.zoom2d = var1.zoom2d;
      this.xan2d = var1.xan2d;
      this.yan2d = var1.yan2d;
      this.zan2d = var1.zan2d;
      this.offsetX2d = var1.offsetX2d;
      this.offsetY2d = var1.offsetY2d;
      this.recolorFrom = var2.recolorFrom;
      this.recolorTo = var2.recolorTo;
      this.retextureFrom = var2.retextureFrom;
      this.retextureTo = var2.retextureTo;
      this.name = var2.name;
      this.isMembersOnly = var2.isMembersOnly;
      this.isStackable = var2.isStackable;
      this.maleModel = var2.maleModel;
      this.maleModel1 = var2.maleModel1;
      this.maleModel2 = var2.maleModel2;
      this.femaleModel = var2.femaleModel;
      this.femaleModel1 = var2.femaleModel1;
      this.femaleModel2 = var2.femaleModel2;
      this.maleHeadModel = var2.maleHeadModel;
      this.maleHeadModel2 = var2.maleHeadModel2;
      this.femaleHeadModel = var2.femaleHeadModel;
      this.femaleHeadModel2 = var2.femaleHeadModel2;
      this.field2228 = var2.field2228;
      this.field2246 = var2.field2246;
      this.field2206 = var2.field2206;
      this.team = var2.team;
      this.groundActions = var2.groundActions;
      this.field2258 = var2.field2258;
      this.inventoryActions = new String[5];
      if (var2.inventoryActions != null) {
         for(int var3 = 0; var3 < 4; ++var3) {
            this.inventoryActions[var3] = var2.inventoryActions[var3];
         }
      }

      this.inventoryActions[4] = "Discard";
      this.price = 0;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Lgr;Lgr;I)V",
      garbageValue = "548513949"
   )
   @Export("genPlaceholder")
   void genPlaceholder(ItemComposition var1, ItemComposition var2) {
      this.model = var1.model;
      this.zoom2d = var1.zoom2d;
      this.xan2d = var1.xan2d;
      this.yan2d = var1.yan2d;
      this.zan2d = var1.zan2d;
      this.offsetX2d = var1.offsetX2d;
      this.offsetY2d = var1.offsetY2d;
      this.recolorFrom = var1.recolorFrom;
      this.recolorTo = var1.recolorTo;
      this.retextureFrom = var1.retextureFrom;
      this.retextureTo = var1.retextureTo;
      this.isStackable = var1.isStackable;
      this.name = var2.name;
      this.price = 0;
      this.isMembersOnly = false;
      this.isTradable = false;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(II)Lhe;",
      garbageValue = "-1487175558"
   )
   @Export("getModelData")
   public final ModelData getModelData(int var1) {
      int var3;
      if (this.countobj != null && var1 > 1) {
         int var2 = -1;

         for(var3 = 0; var3 < 10; ++var3) {
            if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
               var2 = this.countobj[var3];
            }
         }

         if (var2 != -1) {
            return TileItem.ItemDefinition_get(var2).getModelData(1);
         }
      }

      ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0);
      if (var4 == null) {
         return null;
      } else {
         if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
            var4.resize(this.resizeX, this.resizeY, this.resizeZ);
         }

         if (this.recolorFrom != null) {
            for(var3 = 0; var3 < this.recolorFrom.length; ++var3) {
               var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
            }
         }

         if (this.retextureFrom != null) {
            for(var3 = 0; var3 < this.retextureFrom.length; ++var3) {
               var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(IB)Lhs;",
      garbageValue = "48"
   )
   @Export("getModel")
   public final Model getModel(int var1) {
      if (this.countobj != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
               var2 = this.countobj[var3];
            }
         }

         if (var2 != -1) {
            return TileItem.ItemDefinition_get(var2).getModel(1);
         }
      }

      Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id);
      if (var5 != null) {
         return var5;
      } else {
         ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0);
         if (var6 == null) {
            return null;
         } else {
            if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
               var6.resize(this.resizeX, this.resizeY, this.resizeZ);
            }

            int var4;
            if (this.recolorFrom != null) {
               for(var4 = 0; var4 < this.recolorFrom.length; ++var4) {
                  var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
               }
            }

            if (this.retextureFrom != null) {
               for(var4 = 0; var4 < this.retextureFrom.length; ++var4) {
                  var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
               }
            }

            var5 = var6.toModel(this.field2263 + 64, this.field2256 + 768, -50, -10, -50);
            var5.isSingleTile = true;
            ItemDefinition_cachedModels.put(var5, (long)this.id);
            return var5;
         }
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(IB)Lgr;",
      garbageValue = "-35"
   )
   @Export("getCountObj")
   public ItemComposition getCountObj(int var1) {
      if (this.countobj != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
               var2 = this.countobj[var3];
            }
         }

         if (var2 != -1) {
            return TileItem.ItemDefinition_get(var2);
         }
      }

      return this;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "779286069"
   )
   public final boolean method3969(int var1) {
      int var2 = this.femaleModel;
      int var3 = this.femaleModel1;
      int var4 = this.femaleModel2;
      if (var1 == 1) {
         var2 = this.maleHeadModel;
         var3 = this.maleHeadModel2;
         var4 = this.femaleHeadModel;
      }

      if (var2 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
            var5 = false;
         }

         if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
            var5 = false;
         }

         if (var4 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
            var5 = false;
         }

         return var5;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(II)Lhe;",
      garbageValue = "-537222025"
   )
   public final ModelData method3959(int var1) {
      int var2 = this.femaleModel;
      int var3 = this.femaleModel1;
      int var4 = this.femaleModel2;
      if (var1 == 1) {
         var2 = this.maleHeadModel;
         var3 = this.maleHeadModel2;
         var4 = this.femaleHeadModel;
      }

      if (var2 == -1) {
         return null;
      } else {
         ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0);
         if (var3 != -1) {
            ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0);
            if (var4 != -1) {
               ModelData var7 = ModelData.ModelData_get(ItemDefinition_modelArchive, var4, 0);
               ModelData[] var8 = new ModelData[]{var5, var6, var7};
               var5 = new ModelData(var8, 3);
            } else {
               ModelData[] var10 = new ModelData[]{var5, var6};
               var5 = new ModelData(var10, 2);
            }
         }

         if (var1 == 0 && this.femaleOffset != 0) {
            var5.changeOffset(0, this.femaleOffset, 0);
         }

         if (var1 == 1 && this.field2255 != 0) {
            var5.changeOffset(0, this.field2255, 0);
         }

         int var9;
         if (this.recolorFrom != null) {
            for(var9 = 0; var9 < this.recolorFrom.length; ++var9) {
               var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]);
            }
         }

         if (this.retextureFrom != null) {
            for(var9 = 0; var9 < this.retextureFrom.length; ++var9) {
               var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]);
            }
         }

         return var5;
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "4"
   )
   public final boolean method3960(int var1) {
      int var2 = this.femaleHeadModel2;
      int var3 = this.field2228;
      if (var1 == 1) {
         var2 = this.field2246;
         var3 = this.field2206;
      }

      if (var2 == -1) {
         return true;
      } else {
         boolean var4 = true;
         if (!ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
            var4 = false;
         }

         if (var3 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
            var4 = false;
         }

         return var4;
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)Lhe;",
      garbageValue = "1488061103"
   )
   public final ModelData method3961(int var1) {
      int var2 = this.femaleHeadModel2;
      int var3 = this.field2228;
      if (var1 == 1) {
         var2 = this.field2246;
         var3 = this.field2206;
      }

      if (var2 == -1) {
         return null;
      } else {
         ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, var2, 0);
         if (var3 != -1) {
            ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0);
            ModelData[] var6 = new ModelData[]{var4, var5};
            var4 = new ModelData(var6, 2);
         }

         int var7;
         if (this.recolorFrom != null) {
            for(var7 = 0; var7 < this.recolorFrom.length; ++var7) {
               var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]);
            }
         }

         if (this.retextureFrom != null) {
            for(var7 = 0; var7 < this.retextureFrom.length; ++var7) {
               var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1350105147"
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

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1997211262"
   )
   @Export("getStringParam")
   public String getStringParam(int var1, String var2) {
      return class145.method3192(this.params, var1, var2);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "23"
   )
   @Export("getShiftClickIndex")
   public int getShiftClickIndex() {
      if (this.shiftClickIndex != -1 && this.inventoryActions != null) {
         if (this.shiftClickIndex >= 0) {
            return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
         } else {
            return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1;
         }
      } else {
         return -1;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "84614333"
   )
   boolean method4007() {
      return this.recolorTo != null;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1803133349"
   )
   boolean method4008() {
      return this.retextureTo != null;
   }
}
