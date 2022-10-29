import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("ItemDefinition_modelArchive")
   public static AbstractArchive ItemDefinition_modelArchive;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("ItemDefinition_cached")
   static EvictingDualNodeHashTable ItemDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("ItemDefinition_cachedModels")
   static EvictingDualNodeHashTable ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("ItemDefinition_cachedSprites")
   static EvictingDualNodeHashTable ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200);
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 381730175
   )
   @Export("id")
   public int id;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1188919195
   )
   @Export("model")
   int model;
   @ObfuscatedName("u")
   @Export("name")
   public String name = "null";
   @ObfuscatedName("z")
   @Export("recolorFrom")
   public short[] recolorFrom;
   @ObfuscatedName("t")
   @Export("recolorTo")
   public short[] recolorTo;
   @ObfuscatedName("w")
   @Export("retextureFrom")
   public short[] retextureFrom;
   @ObfuscatedName("m")
   @Export("retextureTo")
   public short[] retextureTo;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -2004867373
   )
   @Export("zoom2d")
   public int zoom2d = 2000;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -564400895
   )
   @Export("xan2d")
   public int xan2d = 0;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -2128917587
   )
   @Export("yan2d")
   public int yan2d = 0;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -995800025
   )
   @Export("zan2d")
   public int zan2d = 0;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -456223811
   )
   @Export("offsetX2d")
   public int offsetX2d = 0;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1793293383
   )
   @Export("offsetY2d")
   public int offsetY2d = 0;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 428914865
   )
   @Export("isStackable")
   public int isStackable = 0;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1320342185
   )
   @Export("price")
   public int price = 1;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -773000153
   )
   @Export("maleModel")
   public int maleModel = -1;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 194955029
   )
   @Export("maleModel1")
   public int maleModel1 = -1;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -266815461
   )
   @Export("maleModel2")
   public int maleModel2 = -1;
   @ObfuscatedName("af")
   @Export("isMembersOnly")
   public boolean isMembersOnly = false;
   @ObfuscatedName("ad")
   @Export("groundActions")
   public String[] groundActions = new String[]{null, null, "Take", null, null};
   @ObfuscatedName("av")
   @Export("inventoryActions")
   public String[] inventoryActions = new String[]{null, null, null, null, "Drop"};
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -70088537
   )
   @Export("shiftClickIndex")
   int shiftClickIndex = -2;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -2038600421
   )
   @Export("femaleModel")
   int femaleModel = -1;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 823298551
   )
   @Export("femaleModel1")
   int femaleModel1 = -1;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1120978515
   )
   @Export("femaleOffset")
   int femaleOffset = 0;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 112283885
   )
   @Export("maleHeadModel")
   int maleHeadModel = -1;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 649793769
   )
   @Export("maleHeadModel2")
   int maleHeadModel2 = -1;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -390425433
   )
   int field2168 = 0;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -1338550989
   )
   @Export("femaleModel2")
   int femaleModel2 = -1;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 144005275
   )
   @Export("femaleHeadModel")
   int femaleHeadModel = -1;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -622951905
   )
   @Export("femaleHeadModel2")
   int femaleHeadModel2 = -1;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1939630815
   )
   int field2153 = -1;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -602955611
   )
   int field2192 = -1;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1691397067
   )
   int field2139 = -1;
   @ObfuscatedName("ar")
   @Export("countobj")
   int[] countobj;
   @ObfuscatedName("ay")
   @Export("countco")
   int[] countco;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1929572159
   )
   @Export("note")
   public int note = -1;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -397288151
   )
   @Export("noteTemplate")
   public int noteTemplate = -1;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = -1290906973
   )
   @Export("resizeX")
   int resizeX = 128;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = -2118741535
   )
   @Export("resizeY")
   int resizeY = 128;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = -1588043511
   )
   @Export("resizeZ")
   int resizeZ = 128;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = -1118646827
   )
   public int field2171 = 0;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = 1091219515
   )
   public int field2183 = 0;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = -1393165911
   )
   @Export("team")
   public int team = 0;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 84908239
   )
   public int field2182 = 0;
   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "Lpe;"
   )
   @Export("params")
   IterableNodeHashTable params;
   @ObfuscatedName("bq")
   @Export("isTradable")
   public boolean isTradable = false;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = 1339342755
   )
   @Export("unnotedId")
   int unnotedId = -1;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = -1854658659
   )
   @Export("notedId")
   int notedId = -1;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -2092854765
   )
   @Export("placeholder")
   public int placeholder = -1;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 93497133
   )
   @Export("placeholderTemplate")
   public int placeholderTemplate = -1;

   ItemComposition() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "104"
   )
   @Export("post")
   void post() {
      if (this.isStackable == 1) {
         this.field2182 = 0;
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-715052679"
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
      descriptor = "(Lqr;II)V",
      garbageValue = "-238124530"
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
         this.field2168 = var1.readUnsignedByte();
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
            this.field2182 = var1.readShort();
         } else if (var2 == 78) {
            this.femaleModel2 = var1.readUnsignedShort();
         } else if (var2 == 79) {
            this.femaleHeadModel = var1.readUnsignedShort();
         } else if (var2 == 90) {
            this.femaleHeadModel2 = var1.readUnsignedShort();
         } else if (var2 == 91) {
            this.field2192 = var1.readUnsignedShort();
         } else if (var2 == 92) {
            this.field2153 = var1.readUnsignedShort();
         } else if (var2 == 93) {
            this.field2139 = var1.readUnsignedShort();
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
            this.field2171 = var1.readByte();
         } else if (var2 == 114) {
            this.field2183 = var1.readByte();
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
            this.params = FaceNormal.readStringIntParameters(var1, this.params);
         }
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lgp;Lgp;I)V",
      garbageValue = "127293411"
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
      descriptor = "(Lgp;Lgp;I)V",
      garbageValue = "-62096237"
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
      this.field2153 = var2.field2153;
      this.field2192 = var2.field2192;
      this.field2139 = var2.field2139;
      this.team = var2.team;
      this.groundActions = var2.groundActions;
      this.field2182 = var2.field2182;
      this.inventoryActions = new String[5];
      if (var2.inventoryActions != null) {
         for(int var3 = 0; var3 < 4; ++var3) {
            this.inventoryActions[var3] = var2.inventoryActions[var3];
         }
      }

      this.inventoryActions[4] = "Discard";
      this.price = 0;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Lgp;Lgp;B)V",
      garbageValue = "2"
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

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(II)Lgs;",
      garbageValue = "1620686713"
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
            return MidiPcmStream.ItemDefinition_get(var2).getModelData(1);
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

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IB)Lha;",
      garbageValue = "76"
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
            return MidiPcmStream.ItemDefinition_get(var2).getModel(1);
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

            var5 = var6.toModel(this.field2171 + 64, this.field2183 * 5 + 768, -50, -10, -50);
            var5.isSingleTile = true;
            ItemDefinition_cachedModels.put(var5, (long)this.id);
            return var5;
         }
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(II)Lgp;",
      garbageValue = "-179106479"
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
            return MidiPcmStream.ItemDefinition_get(var2);
         }
      }

      return this;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1180805546"
   )
   public final boolean method3826(int var1) {
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

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(II)Lgs;",
      garbageValue = "-2057126376"
   )
   public final ModelData method3779(int var1) {
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

         if (var1 == 1 && this.field2168 != 0) {
            var5.changeOffset(0, this.field2168, 0);
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

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "693449098"
   )
   public final boolean method3824(int var1) {
      int var2 = this.femaleHeadModel2;
      int var3 = this.field2153;
      if (var1 == 1) {
         var2 = this.field2192;
         var3 = this.field2139;
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

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(IB)Lgs;",
      garbageValue = "58"
   )
   public final ModelData method3787(int var1) {
      int var2 = this.femaleHeadModel2;
      int var3 = this.field2153;
      if (var1 == 1) {
         var2 = this.field2192;
         var3 = this.field2139;
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

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-213462779"
   )
   @Export("getIntParam")
   public int getIntParam(int var1, int var2) {
      return Language.method6584(this.params, var1, var2);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1778906702"
   )
   @Export("getStringParam")
   public String getStringParam(int var1, String var2) {
      return FriendLoginUpdate.method7304(this.params, var1, var2);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2011527799"
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

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1847249504"
   )
   boolean method3785() {
      return this.recolorTo != null;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(S)Z",
      garbageValue = "-8699"
   )
   boolean method3821() {
      return this.retextureTo != null;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(ILkn;IIIII[FB)Lkn;",
      garbageValue = "45"
   )
   static Widget method3845(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      Widget var8 = new Widget();
      var8.type = var0;
      var8.parentId = var1.id;
      var8.childIndex = var2;
      var8.isIf3 = true;
      var8.xAlignment = var3;
      var8.yAlignment = var4;
      var8.widthAlignment = var5;
      var8.heightAlignment = var6;
      var8.rawX = (int)(var7[0] * (float)var1.width);
      var8.rawY = (int)((float)var1.height * var7[1]);
      var8.rawWidth = (int)((float)var1.width * var7[2]);
      var8.rawHeight = (int)((float)var1.height * var7[3]);
      return var8;
   }

   @ObfuscatedName("kn")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "47"
   )
   static void method3786() {
      for(InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
         int var1 = var0.group;
         if (WorldMapManager.loadInterface(var1)) {
            boolean var2 = true;
            Widget[] var3 = Widget.Widget_interfaceComponents[var1];

            int var4;
            for(var4 = 0; var4 < var3.length; ++var4) {
               if (var3[var4] != null) {
                  var2 = var3[var4].isIf3;
                  break;
               }
            }

            if (!var2) {
               var4 = (int)var0.key;
               Widget var5 = class281.getWidget(var4);
               if (var5 != null) {
                  class143.invalidateWidget(var5);
               }
            }
         }
      }

   }
}
