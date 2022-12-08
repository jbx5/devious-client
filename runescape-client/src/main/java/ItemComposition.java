import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("ItemDefinition_archive")
   static AbstractArchive ItemDefinition_archive;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 76789185
   )
   @Export("ItemDefinition_fileCount")
   public static int ItemDefinition_fileCount;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("ItemDefinition_cached")
   public static EvictingDualNodeHashTable ItemDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("ItemDefinition_cachedModels")
   public static EvictingDualNodeHashTable ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50);
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("ItemDefinition_cachedSprites")
   public static EvictingDualNodeHashTable ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200);
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1037666267
   )
   @Export("id")
   public int id;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -79179159
   )
   @Export("model")
   int model;
   @ObfuscatedName("k")
   @Export("name")
   public String name = "null";
   @ObfuscatedName("a")
   @Export("recolorFrom")
   public short[] recolorFrom;
   @ObfuscatedName("s")
   @Export("recolorTo")
   public short[] recolorTo;
   @ObfuscatedName("l")
   @Export("retextureFrom")
   public short[] retextureFrom;
   @ObfuscatedName("t")
   @Export("retextureTo")
   public short[] retextureTo;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -2078238987
   )
   @Export("zoom2d")
   public int zoom2d = 2000;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -809487997
   )
   @Export("xan2d")
   public int xan2d = 0;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1148033667
   )
   @Export("yan2d")
   public int yan2d = 0;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -897636777
   )
   @Export("zan2d")
   public int zan2d = 0;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1913553153
   )
   @Export("offsetX2d")
   public int offsetX2d = 0;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1827536133
   )
   @Export("offsetY2d")
   public int offsetY2d = 0;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1304719979
   )
   @Export("isStackable")
   public int isStackable = 0;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1868181119
   )
   @Export("price")
   public int price = 1;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -712207729
   )
   @Export("maleModel")
   public int maleModel = -1;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1461262497
   )
   @Export("maleModel1")
   public int maleModel1 = -1;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1198196015
   )
   @Export("maleModel2")
   public int maleModel2 = -1;
   @ObfuscatedName("au")
   @Export("isMembersOnly")
   public boolean isMembersOnly = false;
   @ObfuscatedName("ar")
   @Export("groundActions")
   public String[] groundActions = new String[]{null, null, "Take", null, null};
   @ObfuscatedName("at")
   @Export("inventoryActions")
   public String[] inventoryActions = new String[]{null, null, null, null, "Drop"};
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -573326147
   )
   @Export("shiftClickIndex")
   int shiftClickIndex = -2;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1310935043
   )
   @Export("femaleModel")
   int femaleModel = -1;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -136305627
   )
   @Export("femaleModel1")
   int femaleModel1 = -1;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -840315209
   )
   @Export("femaleOffset")
   int femaleOffset = 0;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -381342235
   )
   @Export("maleHeadModel")
   int maleHeadModel = -1;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -954860879
   )
   @Export("maleHeadModel2")
   int maleHeadModel2 = -1;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 482374965
   )
   int field2204 = 0;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -428507273
   )
   @Export("femaleModel2")
   int femaleModel2 = -1;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 740482477
   )
   @Export("femaleHeadModel")
   int femaleHeadModel = -1;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1566002253
   )
   @Export("femaleHeadModel2")
   int femaleHeadModel2 = -1;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1042908255
   )
   int field2243 = -1;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1329405317
   )
   int field2244 = -1;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1923047899
   )
   int field2245 = -1;
   @ObfuscatedName("ap")
   @Export("countobj")
   int[] countobj;
   @ObfuscatedName("aa")
   @Export("countco")
   int[] countco;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -590505645
   )
   @Export("note")
   public int note = -1;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1058213631
   )
   @Export("noteTemplate")
   public int noteTemplate = -1;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = 594389235
   )
   @Export("resizeX")
   int resizeX = 128;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 1646343287
   )
   @Export("resizeY")
   int resizeY = 128;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = -99918107
   )
   @Export("resizeZ")
   int resizeZ = 128;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = -1743952543
   )
   public int field2209 = 0;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = 298604473
   )
   public int field2222 = 0;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -1347495133
   )
   @Export("team")
   public int team = 0;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = 64152289
   )
   public int field2224 = 0;
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "Lql;"
   )
   @Export("params")
   IterableNodeHashTable params;
   @ObfuscatedName("bl")
   @Export("isTradable")
   public boolean isTradable = false;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -111748635
   )
   @Export("unnotedId")
   int unnotedId = -1;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = 15600059
   )
   @Export("notedId")
   int notedId = -1;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 420233559
   )
   @Export("placeholder")
   public int placeholder = -1;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 628149203
   )
   @Export("placeholderTemplate")
   public int placeholderTemplate = -1;

   ItemComposition() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "564451612"
   )
   @Export("post")
   void post() {
      if (this.isStackable == 1) {
         this.field2224 = 0;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "-843301513"
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
      descriptor = "(Lqy;II)V",
      garbageValue = "-538153010"
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
         this.field2204 = var1.readUnsignedByte();
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
            this.field2224 = var1.readShort();
         } else if (var2 == 78) {
            this.femaleModel2 = var1.readUnsignedShort();
         } else if (var2 == 79) {
            this.femaleHeadModel = var1.readUnsignedShort();
         } else if (var2 == 90) {
            this.femaleHeadModel2 = var1.readUnsignedShort();
         } else if (var2 == 91) {
            this.field2244 = var1.readUnsignedShort();
         } else if (var2 == 92) {
            this.field2243 = var1.readUnsignedShort();
         } else if (var2 == 93) {
            this.field2245 = var1.readUnsignedShort();
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
            this.field2209 = var1.readByte();
         } else if (var2 == 114) {
            this.field2222 = var1.readByte() * 5;
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
            this.params = DynamicObject.readStringIntParameters(var1, this.params);
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lgr;Lgr;B)V",
      garbageValue = "4"
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

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lgr;Lgr;I)V",
      garbageValue = "-177814985"
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
      this.field2243 = var2.field2243;
      this.field2244 = var2.field2244;
      this.field2245 = var2.field2245;
      this.team = var2.team;
      this.groundActions = var2.groundActions;
      this.field2224 = var2.field2224;
      this.inventoryActions = new String[5];
      if (var2.inventoryActions != null) {
         for(int var3 = 0; var3 < 4; ++var3) {
            this.inventoryActions[var3] = var2.inventoryActions[var3];
         }
      }

      this.inventoryActions[4] = "Discard";
      this.price = 0;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(Lgr;Lgr;B)V",
      garbageValue = "39"
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

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(IB)Lgi;",
      garbageValue = "41"
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
            return NPCComposition.ItemDefinition_get(var2).getModelData(1);
         }
      }

      ModelData var4 = ModelData.ModelData_get(class306.ItemDefinition_modelArchive, this.model, 0);
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

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(II)Lhh;",
      garbageValue = "-1531762399"
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
            return NPCComposition.ItemDefinition_get(var2).getModel(1);
         }
      }

      Model var5 = (Model)ItemDefinition_cachedModels.get((long)this.id);
      if (var5 != null) {
         return var5;
      } else {
         ModelData var6 = ModelData.ModelData_get(class306.ItemDefinition_modelArchive, this.model, 0);
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

            var5 = var6.toModel(this.field2209 + 64, this.field2222 + 768, -50, -10, -50);
            var5.isSingleTile = true;
            ItemDefinition_cachedModels.put(var5, (long)this.id);
            return var5;
         }
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(II)Lgr;",
      garbageValue = "-542069787"
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
            return NPCComposition.ItemDefinition_get(var2);
         }
      }

      return this;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "187316858"
   )
   public final boolean method3933(int var1) {
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
         if (!class306.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
            var5 = false;
         }

         if (var3 != -1 && !class306.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
            var5 = false;
         }

         if (var4 != -1 && !class306.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
            var5 = false;
         }

         return var5;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(II)Lgi;",
      garbageValue = "-1234528867"
   )
   public final ModelData method3934(int var1) {
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
         ModelData var5 = ModelData.ModelData_get(class306.ItemDefinition_modelArchive, var2, 0);
         if (var3 != -1) {
            ModelData var6 = ModelData.ModelData_get(class306.ItemDefinition_modelArchive, var3, 0);
            if (var4 != -1) {
               ModelData var7 = ModelData.ModelData_get(class306.ItemDefinition_modelArchive, var4, 0);
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

         if (var1 == 1 && this.field2204 != 0) {
            var5.changeOffset(0, this.field2204, 0);
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

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "9"
   )
   public final boolean method3935(int var1) {
      int var2 = this.femaleHeadModel2;
      int var3 = this.field2243;
      if (var1 == 1) {
         var2 = this.field2244;
         var3 = this.field2245;
      }

      if (var2 == -1) {
         return true;
      } else {
         boolean var4 = true;
         if (!class306.ItemDefinition_modelArchive.tryLoadFile(var2, 0)) {
            var4 = false;
         }

         if (var3 != -1 && !class306.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
            var4 = false;
         }

         return var4;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IB)Lgi;",
      garbageValue = "9"
   )
   public final ModelData method3936(int var1) {
      int var2 = this.femaleHeadModel2;
      int var3 = this.field2243;
      if (var1 == 1) {
         var2 = this.field2244;
         var3 = this.field2245;
      }

      if (var2 == -1) {
         return null;
      } else {
         ModelData var4 = ModelData.ModelData_get(class306.ItemDefinition_modelArchive, var2, 0);
         if (var3 != -1) {
            ModelData var5 = ModelData.ModelData_get(class306.ItemDefinition_modelArchive, var3, 0);
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

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "38849497"
   )
   @Export("getIntParam")
   public int getIntParam(int var1, int var2) {
      return UserComparator8.method2819(this.params, var1, var2);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-1588376559"
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

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
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

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "20"
   )
   boolean method3963() {
      return this.recolorTo != null;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1445987628"
   )
   boolean method3941() {
      return this.retextureTo != null;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIB)I",
      garbageValue = "-25"
   )
   public static int method3994(int var0, int var1, int var2, int var3, int var4, int var5) {
      if ((var5 & 1) == 1) {
         int var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      var2 &= 3;
      if (var2 == 0) {
         return var0;
      } else if (var2 == 1) {
         return var1;
      } else {
         return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
      }
   }
}
