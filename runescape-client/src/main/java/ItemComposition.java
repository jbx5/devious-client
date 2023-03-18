import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("ItemDefinition_modelArchive")
   public static AbstractArchive ItemDefinition_modelArchive;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("ItemDefinition_cached")
   public static EvictingDualNodeHashTable ItemDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("ItemDefinition_cachedModels")
   public static EvictingDualNodeHashTable ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("ItemDefinition_cachedSprites")
   public static EvictingDualNodeHashTable ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Loe;"
   )
   @Export("ItemDefinition_fontPlain11")
   public static Font ItemDefinition_fontPlain11;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 1947056821
   )
   @Export("id")
   int id;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 272743929
   )
   @Export("model")
   int model;
   @ObfuscatedName("az")
   @Export("name")
   public String name = "null";
   @ObfuscatedName("ae")
   @Export("recolorFrom")
   public short[] recolorFrom;
   @ObfuscatedName("au")
   @Export("recolorTo")
   public short[] recolorTo;
   @ObfuscatedName("ag")
   @Export("retextureFrom")
   public short[] retextureFrom;
   @ObfuscatedName("at")
   @Export("retextureTo")
   public short[] retextureTo;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1952873425
   )
   @Export("zoom2d")
   public int zoom2d = 2000;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 546058337
   )
   @Export("xan2d")
   public int xan2d = 0;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1094079037
   )
   @Export("yan2d")
   public int yan2d = 0;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1517957745
   )
   @Export("zan2d")
   public int zan2d = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1994009139
   )
   @Export("offsetX2d")
   public int offsetX2d = 0;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -228623487
   )
   @Export("offsetY2d")
   public int offsetY2d = 0;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = 2053436617
   )
   @Export("isStackable")
   public int isStackable = 0;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -820380841
   )
   @Export("price")
   public int price = 1;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = 1872439657
   )
   @Export("maleModel")
   public int maleModel = -1;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 1449974603
   )
   @Export("maleModel1")
   public int maleModel1 = -1;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 1392896979
   )
   @Export("maleModel2")
   public int maleModel2 = -1;
   @ObfuscatedName("bh")
   @Export("isMembersOnly")
   public boolean isMembersOnly = false;
   @ObfuscatedName("bl")
   @Export("groundActions")
   public String[] groundActions = new String[]{null, null, "Take", null, null};
   @ObfuscatedName("bk")
   @Export("inventoryActions")
   public String[] inventoryActions = new String[]{null, null, null, null, "Drop"};
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = 316293785
   )
   @Export("shiftClickIndex")
   int shiftClickIndex = -2;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = -917859193
   )
   @Export("femaleModel")
   int femaleModel = -1;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 1424316281
   )
   @Export("femaleModel1")
   int femaleModel1 = -1;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = 1984593181
   )
   @Export("femaleOffset")
   int femaleOffset = 0;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = -156937363
   )
   @Export("maleHeadModel")
   int maleHeadModel = -1;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -773121151
   )
   @Export("maleHeadModel2")
   int maleHeadModel2 = -1;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = 856445827
   )
   int field2188 = 0;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -84535487
   )
   @Export("femaleModel2")
   int femaleModel2 = -1;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = 1816351317
   )
   @Export("femaleHeadModel")
   int femaleHeadModel = -1;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = 1878264025
   )
   @Export("femaleHeadModel2")
   int femaleHeadModel2 = -1;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = 720137437
   )
   int field2214 = -1;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = 153526149
   )
   int field2215 = -1;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = 514553379
   )
   int field2216 = -1;
   @ObfuscatedName("bj")
   @Export("countobj")
   int[] countobj;
   @ObfuscatedName("bf")
   @Export("countco")
   int[] countco;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = 845984327
   )
   @Export("note")
   public int note = -1;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -1739570397
   )
   @Export("noteTemplate")
   public int noteTemplate = -1;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = 164085001
   )
   @Export("resizeX")
   int resizeX = 128;
   @ObfuscatedName("ca")
   @ObfuscatedGetter(
      intValue = -551231235
   )
   @Export("resizeY")
   int resizeY = 128;
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      intValue = -2068425161
   )
   @Export("resizeZ")
   int resizeZ = 128;
   @ObfuscatedName("co")
   @ObfuscatedGetter(
      intValue = -1870497473
   )
   public int field2224 = 0;
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = -2094956621
   )
   public int field2225 = 0;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = -1752729645
   )
   @Export("team")
   public int team = 0;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = -568214665
   )
   public int field2227 = 0;
   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "Lrz;"
   )
   @Export("params")
   IterableNodeHashTable params;
   @ObfuscatedName("cc")
   @Export("isTradable")
   public boolean isTradable = false;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = -2037040173
   )
   @Export("unnotedId")
   int unnotedId = -1;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      intValue = -354396277
   )
   @Export("notedId")
   int notedId = -1;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = -802107087
   )
   @Export("placeholder")
   public int placeholder = -1;
   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      intValue = -71881067
   )
   @Export("placeholderTemplate")
   public int placeholderTemplate = -1;

   ItemComposition() {
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "2"
   )
   @Export("post")
   void post() {
      if (this.isStackable == 1) {
         this.field2227 = 0;
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsy;S)V",
      garbageValue = "256"
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
      garbageValue = "-1883519211"
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
         this.field2188 = var1.readUnsignedByte();
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
            this.field2227 = var1.readShort();
         } else if (var2 == 78) {
            this.femaleModel2 = var1.readUnsignedShort();
         } else if (var2 == 79) {
            this.femaleHeadModel = var1.readUnsignedShort();
         } else if (var2 == 90) {
            this.femaleHeadModel2 = var1.readUnsignedShort();
         } else if (var2 == 91) {
            this.field2215 = var1.readUnsignedShort();
         } else if (var2 == 92) {
            this.field2214 = var1.readUnsignedShort();
         } else if (var2 == 93) {
            this.field2216 = var1.readUnsignedShort();
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
            this.field2224 = var1.readByte();
         } else if (var2 == 114) {
            this.field2225 = var1.readByte() * 5;
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
            this.params = AABB.readStringIntParameters(var1, this.params);
         }
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lhh;Lhh;I)V",
      garbageValue = "2092702539"
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

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lhh;Lhh;B)V",
      garbageValue = "1"
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
      this.field2214 = var2.field2214;
      this.field2215 = var2.field2215;
      this.field2216 = var2.field2216;
      this.team = var2.team;
      this.groundActions = var2.groundActions;
      this.field2227 = var2.field2227;
      this.inventoryActions = new String[5];
      if (var2.inventoryActions != null) {
         for(int var3 = 0; var3 < 4; ++var3) {
            this.inventoryActions[var3] = var2.inventoryActions[var3];
         }
      }

      this.inventoryActions[4] = "Discard";
      this.price = 0;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lhh;Lhh;I)V",
      garbageValue = "791558981"
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

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IB)Liu;",
      garbageValue = "-28"
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
            return ParamComposition.ItemDefinition_get(var2).getModelData(1);
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

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)Lix;",
      garbageValue = "-1942163938"
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
            return ParamComposition.ItemDefinition_get(var2).getModel(1);
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

            var5 = var6.toModel(this.field2224 + 64, this.field2225 + 768, -50, -10, -50);
            var5.isSingleTile = true;
            ItemDefinition_cachedModels.put(var5, (long)this.id);
            return var5;
         }
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(II)Lhh;",
      garbageValue = "-1484327710"
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
            return ParamComposition.ItemDefinition_get(var2);
         }
      }

      return this;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "-55"
   )
   public final boolean method3918(int var1) {
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

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(II)Liu;",
      garbageValue = "1560498088"
   )
   public final ModelData method3919(int var1) {
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

         if (var1 == 1 && this.field2188 != 0) {
            var5.changeOffset(0, this.field2188, 0);
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

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1893952947"
   )
   public final boolean method3920(int var1) {
      int var2 = this.femaleHeadModel2;
      int var3 = this.field2214;
      if (var1 == 1) {
         var2 = this.field2215;
         var3 = this.field2216;
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

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(IB)Liu;",
      garbageValue = "73"
   )
   public final ModelData method3921(int var1) {
      int var2 = this.femaleHeadModel2;
      int var3 = this.field2214;
      if (var1 == 1) {
         var2 = this.field2215;
         var3 = this.field2216;
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

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "3"
   )
   @Export("getIntParam")
   public int getIntParam(int var1, int var2) {
      return class139.method3104(this.params, var1, var2);
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1083179233"
   )
   @Export("getStringParam")
   public String getStringParam(int var1, String var2) {
      return class428.method7964(this.params, var1, var2);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-94"
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

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1111077860"
   )
   boolean method3983() {
      return this.recolorTo != null;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "1"
   )
   boolean method3926() {
      return this.retextureTo != null;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1310906812"
   )
   public static int method3970(int var0) {
      return var0 != 0 && var0 != 1 ? -1 : 0;
   }

   @ObfuscatedName("no")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "961747259"
   )
   static String method3982(String var0) {
      PlayerType[] var1 = class211.PlayerType_values();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         PlayerType var3 = var1[var2];
         if (var3.modIcon != -1 && var0.startsWith(class7.method53(var3.modIcon))) {
            var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
            break;
         }
      }

      return var0;
   }
}
