import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("ItemDefinition_modelArchive")
   public static AbstractArchive ItemDefinition_modelArchive;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("ItemDefinition_cached")
   static EvictingDualNodeHashTable ItemDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("ItemDefinition_cachedModels")
   static EvictingDualNodeHashTable ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("ItemDefinition_cachedSprites")
   static EvictingDualNodeHashTable ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200);
   @ObfuscatedName("sq")
   @ObfuscatedSignature(
      descriptor = "Lfj;"
   )
   @Export("guestClanSettings")
   static ClanSettings guestClanSettings;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -264956633
   )
   @Export("id")
   int id;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 2000117511
   )
   @Export("model")
   int model;
   @ObfuscatedName("ah")
   @Export("name")
   public String name = "null";
   @ObfuscatedName("av")
   @Export("recolorFrom")
   public short[] recolorFrom;
   @ObfuscatedName("ar")
   @Export("recolorTo")
   public short[] recolorTo;
   @ObfuscatedName("am")
   @Export("retextureFrom")
   public short[] retextureFrom;
   @ObfuscatedName("as")
   @Export("retextureTo")
   public short[] retextureTo;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 1014971553
   )
   @Export("zoom2d")
   public int zoom2d = 2000;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 415331477
   )
   @Export("xan2d")
   public int xan2d = 0;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -2044433177
   )
   @Export("yan2d")
   public int yan2d = 0;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 450595207
   )
   @Export("zan2d")
   public int zan2d = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 151912273
   )
   @Export("offsetX2d")
   public int offsetX2d = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -271411709
   )
   @Export("offsetY2d")
   public int offsetY2d = 0;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = 1552863327
   )
   @Export("isStackable")
   public int isStackable = 0;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -1706039181
   )
   @Export("price")
   public int price = 1;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -1935812527
   )
   @Export("maleModel")
   public int maleModel = -1;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = -1719338253
   )
   @Export("maleModel1")
   public int maleModel1 = -1;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = 723093341
   )
   @Export("maleModel2")
   public int maleModel2 = -1;
   @ObfuscatedName("bz")
   @Export("isMembersOnly")
   public boolean isMembersOnly = false;
   @ObfuscatedName("bm")
   @Export("groundActions")
   public String[] groundActions = new String[]{null, null, "Take", null, null};
   @ObfuscatedName("bd")
   @Export("inventoryActions")
   public String[] inventoryActions = new String[]{null, null, null, null, "Drop"};
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = -377028789
   )
   @Export("shiftClickIndex")
   int shiftClickIndex = -2;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = 1259737505
   )
   @Export("femaleModel")
   int femaleModel = -1;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = -1975240801
   )
   @Export("femaleModel1")
   int femaleModel1 = -1;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = 1328855603
   )
   @Export("femaleOffset")
   int femaleOffset = 0;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = -1355512081
   )
   @Export("maleHeadModel")
   int maleHeadModel = -1;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -1937321521
   )
   @Export("maleHeadModel2")
   int maleHeadModel2 = -1;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = -846717499
   )
   int field2243 = 0;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = -1550321451
   )
   @Export("femaleModel2")
   int femaleModel2 = -1;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = 1169668803
   )
   @Export("femaleHeadModel")
   int femaleHeadModel = -1;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = 2144570273
   )
   @Export("femaleHeadModel2")
   int femaleHeadModel2 = -1;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = 1570928533
   )
   int field2242 = -1;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = -560329405
   )
   int field2208 = -1;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = 1869912693
   )
   int field2249 = -1;
   @ObfuscatedName("bh")
   @Export("countobj")
   int[] countobj;
   @ObfuscatedName("bw")
   @Export("countco")
   int[] countco;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = 1399852547
   )
   @Export("note")
   public int note = -1;
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = -1375068187
   )
   @Export("noteTemplate")
   public int noteTemplate = -1;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = 614283261
   )
   @Export("resizeX")
   int resizeX = 128;
   @ObfuscatedName("cc")
   @ObfuscatedGetter(
      intValue = 1552043943
   )
   @Export("resizeY")
   int resizeY = 128;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = -302979231
   )
   @Export("resizeZ")
   int resizeZ = 128;
   @ObfuscatedName("ca")
   @ObfuscatedGetter(
      intValue = 2093614773
   )
   public int field2257 = 0;
   @ObfuscatedName("cu")
   @ObfuscatedGetter(
      intValue = 1794294545
   )
   public int field2258 = 0;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = -919846075
   )
   @Export("team")
   public int team = 0;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = -1162544887
   )
   public int field2251 = 0;
   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "Lro;"
   )
   @Export("params")
   IterableNodeHashTable params;
   @ObfuscatedName("cf")
   @Export("isTradable")
   public boolean isTradable = false;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = -1273418661
   )
   @Export("unnotedId")
   int unnotedId = -1;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = -1276549997
   )
   @Export("notedId")
   int notedId = -1;
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = -172219939
   )
   @Export("placeholder")
   public int placeholder = -1;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      intValue = 119859889
   )
   @Export("placeholderTemplate")
   public int placeholderTemplate = -1;

   ItemComposition() {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2125749046"
   )
   @Export("post")
   void post() {
      if (this.isStackable == 1) {
         this.field2251 = 0;
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lsg;B)V",
      garbageValue = "-17"
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
      garbageValue = "-19"
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
         this.field2243 = var1.readUnsignedByte();
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
            this.field2251 = var1.readShort();
         } else if (var2 == 78) {
            this.femaleModel2 = var1.readUnsignedShort();
         } else if (var2 == 79) {
            this.femaleHeadModel = var1.readUnsignedShort();
         } else if (var2 == 90) {
            this.femaleHeadModel2 = var1.readUnsignedShort();
         } else if (var2 == 91) {
            this.field2208 = var1.readUnsignedShort();
         } else if (var2 == 92) {
            this.field2242 = var1.readUnsignedShort();
         } else if (var2 == 93) {
            this.field2249 = var1.readUnsignedShort();
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
            this.field2257 = var1.readByte();
         } else if (var2 == 114) {
            this.field2258 = var1.readByte() * 5;
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
            this.params = ChatChannel.readStringIntParameters(var1, this.params);
         }
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lhz;Lhz;I)V",
      garbageValue = "-1546193991"
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

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lhz;Lhz;I)V",
      garbageValue = "797932055"
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
      this.field2242 = var2.field2242;
      this.field2208 = var2.field2208;
      this.field2249 = var2.field2249;
      this.team = var2.team;
      this.groundActions = var2.groundActions;
      this.field2251 = var2.field2251;
      this.inventoryActions = new String[5];
      if (var2.inventoryActions != null) {
         for(int var3 = 0; var3 < 4; ++var3) {
            this.inventoryActions[var3] = var2.inventoryActions[var3];
         }
      }

      this.inventoryActions[4] = "Discard";
      this.price = 0;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lhz;Lhz;I)V",
      garbageValue = "-670361185"
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

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)Liz;",
      garbageValue = "-305031719"
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
            return HealthBarUpdate.ItemDefinition_get(var2).getModelData(1);
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

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)Lit;",
      garbageValue = "-891415962"
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
            return HealthBarUpdate.ItemDefinition_get(var2).getModel(1);
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

            var5 = var6.toModel(this.field2257 + 64, this.field2258 + 768, -50, -10, -50);
            var5.isSingleTile = true;
            ItemDefinition_cachedModels.put(var5, (long)this.id);
            return var5;
         }
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(II)Lhz;",
      garbageValue = "-1245507934"
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
            return HealthBarUpdate.ItemDefinition_get(var2);
         }
      }

      return this;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1487793992"
   )
   public final boolean method4039(int var1) {
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

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(II)Liz;",
      garbageValue = "1938506301"
   )
   public final ModelData method4052(int var1) {
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

         if (var1 == 1 && this.field2243 != 0) {
            var5.changeOffset(0, this.field2243, 0);
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

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1902431331"
   )
   public final boolean method4041(int var1) {
      int var2 = this.femaleHeadModel2;
      int var3 = this.field2242;
      if (var1 == 1) {
         var2 = this.field2208;
         var3 = this.field2249;
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

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(II)Liz;",
      garbageValue = "-1738550121"
   )
   public final ModelData method4042(int var1) {
      int var2 = this.femaleHeadModel2;
      int var3 = this.field2242;
      if (var1 == 1) {
         var2 = this.field2208;
         var3 = this.field2249;
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

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "119"
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

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
      garbageValue = "0"
   )
   @Export("getStringParam")
   public String getStringParam(int var1, String var2) {
      return EnumComposition.method3750(this.params, var1, var2);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "42"
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

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(S)Z",
      garbageValue = "467"
   )
   boolean method4030() {
      return this.recolorTo != null;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1913004166"
   )
   boolean method4046() {
      return this.retextureTo != null;
   }
}
