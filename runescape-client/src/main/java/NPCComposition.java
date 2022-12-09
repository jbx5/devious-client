import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gz")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
   @ObfuscatedName("tq")
   @ObfuscatedGetter(
      intValue = 1158456013
   )
   static int field2067;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("NpcDefinition_archive")
   static AbstractArchive NpcDefinition_archive;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 646794717
   )
   static int field2022;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("NpcDefinition_cached")
   static EvictingDualNodeHashTable NpcDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("NpcDefinition_cachedModels")
   static EvictingDualNodeHashTable NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50);
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -109388973
   )
   @Export("id")
   public int id;
   @ObfuscatedName("u")
   @Export("name")
   public String name = "null";
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1021399127
   )
   @Export("size")
   public int size = 1;
   @ObfuscatedName("j")
   @Export("models")
   int[] models;
   @ObfuscatedName("g")
   int[] field2026;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -499537861
   )
   @Export("idleSequence")
   public int idleSequence = -1;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 274326889
   )
   @Export("turnLeftSequence")
   public int turnLeftSequence = -1;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -634834111
   )
   @Export("turnRightSequence")
   public int turnRightSequence = -1;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1587887915
   )
   @Export("walkSequence")
   public int walkSequence = -1;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1430199505
   )
   @Export("walkBackSequence")
   public int walkBackSequence = -1;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1601988001
   )
   @Export("walkLeftSequence")
   public int walkLeftSequence = -1;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1871825673
   )
   @Export("walkRightSequence")
   public int walkRightSequence = -1;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -2080788827
   )
   public int field2035 = -1;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 752796561
   )
   public int field2038 = -1;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1054411661
   )
   public int field2039 = -1;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 875795671
   )
   public int field2040 = -1;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 903143861
   )
   public int field2041 = -1;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1152150225
   )
   public int field2042 = -1;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1129939695
   )
   public int field2043 = -1;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -2023873033
   )
   public int field2044 = -1;
   @ObfuscatedName("ad")
   @Export("recolorFrom")
   short[] recolorFrom;
   @ObfuscatedName("ao")
   @Export("recolorTo")
   public short[] recolorTo;
   @ObfuscatedName("am")
   @Export("retextureFrom")
   short[] retextureFrom;
   @ObfuscatedName("av")
   @Export("retextureTo")
   public short[] retextureTo;
   @ObfuscatedName("au")
   @Export("actions")
   public String[] actions = new String[5];
   @ObfuscatedName("ar")
   @Export("drawMapDot")
   public boolean drawMapDot = true;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -917269397
   )
   @Export("combatLevel")
   public int combatLevel = -1;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -124469981
   )
   @Export("widthScale")
   int widthScale = 128;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1404076757
   )
   @Export("heightScale")
   int heightScale = 128;
   @ObfuscatedName("ab")
   @Export("isVisible")
   public boolean isVisible = false;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 408004249
   )
   @Export("ambient")
   int ambient = 0;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1754500827
   )
   @Export("contrast")
   int contrast = 0;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -478636009
   )
   @Export("rotation")
   public int rotation = 32;
   @ObfuscatedName("ak")
   @Export("transforms")
   public int[] transforms;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1750524771
   )
   @Export("transformVarbit")
   int transformVarbit = -1;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -2035410821
   )
   @Export("transformVarp")
   int transformVarp = -1;
   @ObfuscatedName("ax")
   @Export("isInteractable")
   public boolean isInteractable = true;
   @ObfuscatedName("ah")
   @Export("isClickable")
   public boolean isClickable = true;
   @ObfuscatedName("aw")
   @Export("isFollower")
   public boolean isFollower = false;
   @ObfuscatedName("aj")
   @Export("headIconArchiveIds")
   int[] headIconArchiveIds = null;
   @ObfuscatedName("aq")
   @Export("headIconSpriteIndex")
   short[] headIconSpriteIndex = null;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lql;"
   )
   @Export("params")
   IterableNodeHashTable params;

   NPCComposition() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-60"
   )
   @Export("postDecode")
   void postDecode() {
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqy;B)V",
      garbageValue = "0"
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
      garbageValue = "-1000073156"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.readUnsignedByte();
         this.models = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.models[var4] = var1.readUnsignedShort();
         }
      } else if (var2 == 2) {
         this.name = var1.readStringCp1252NullTerminated();
      } else if (var2 == 12) {
         this.size = var1.readUnsignedByte();
      } else if (var2 == 13) {
         this.idleSequence = var1.readUnsignedShort();
      } else if (var2 == 14) {
         this.walkSequence = var1.readUnsignedShort();
      } else if (var2 == 15) {
         this.turnLeftSequence = var1.readUnsignedShort();
      } else if (var2 == 16) {
         this.turnRightSequence = var1.readUnsignedShort();
      } else if (var2 == 17) {
         this.walkSequence = var1.readUnsignedShort();
         this.walkBackSequence = var1.readUnsignedShort();
         this.walkLeftSequence = var1.readUnsignedShort();
         this.walkRightSequence = var1.readUnsignedShort();
      } else if (var2 == 18) {
         var1.readUnsignedShort();
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
      } else if (var2 == 60) {
         var3 = var1.readUnsignedByte();
         this.field2026 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2026[var4] = var1.readUnsignedShort();
         }
      } else if (var2 == 93) {
         this.drawMapDot = false;
      } else if (var2 == 95) {
         this.combatLevel = var1.readUnsignedShort();
      } else if (var2 == 97) {
         this.widthScale = var1.readUnsignedShort();
      } else if (var2 == 98) {
         this.heightScale = var1.readUnsignedShort();
      } else if (var2 == 99) {
         this.isVisible = true;
      } else if (var2 == 100) {
         this.ambient = var1.readByte();
      } else if (var2 == 101) {
         this.contrast = var1.readByte();
      } else {
         int var5;
         if (var2 == 102) {
            if (GrandExchangeOfferUnitPriceComparator.field4275) {
               this.headIconArchiveIds = new int[1];
               this.headIconSpriteIndex = new short[1];
               this.headIconArchiveIds[0] = field2022;
               this.headIconSpriteIndex[0] = (short)var1.readUnsignedShort();
            } else {
               var3 = var1.readUnsignedByte();
               var4 = 0;

               for(var5 = var3; var5 != 0; var5 >>= 1) {
                  ++var4;
               }

               this.headIconArchiveIds = new int[var4];
               this.headIconSpriteIndex = new short[var4];

               for(int var6 = 0; var6 < var4; ++var6) {
                  if ((var3 & 1 << var6) == 0) {
                     this.headIconArchiveIds[var6] = -1;
                     this.headIconSpriteIndex[var6] = -1;
                  } else {
                     this.headIconArchiveIds[var6] = var1.readNullableLargeSmart();
                     this.headIconSpriteIndex[var6] = (short)var1.readShortSmartSub();
                  }
               }
            }
         } else if (var2 == 103) {
            this.rotation = var1.readUnsignedShort();
         } else if (var2 != 106 && var2 != 118) {
            if (var2 == 107) {
               this.isInteractable = false;
            } else if (var2 == 109) {
               this.isClickable = false;
            } else if (var2 == 111) {
               this.isFollower = true;
            } else if (var2 == 114) {
               this.field2035 = var1.readUnsignedShort();
            } else if (var2 == 115) {
               this.field2035 = var1.readUnsignedShort();
               this.field2038 = var1.readUnsignedShort();
               this.field2039 = var1.readUnsignedShort();
               this.field2040 = var1.readUnsignedShort();
            } else if (var2 == 116) {
               this.field2041 = var1.readUnsignedShort();
            } else if (var2 == 117) {
               this.field2041 = var1.readUnsignedShort();
               this.field2042 = var1.readUnsignedShort();
               this.field2043 = var1.readUnsignedShort();
               this.field2044 = var1.readUnsignedShort();
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
            if (var2 == 118) {
               var3 = var1.readUnsignedShort();
               if (var3 == 65535) {
                  var3 = -1;
               }
            }

            var4 = var1.readUnsignedByte();
            this.transforms = new int[var4 + 2];

            for(var5 = 0; var5 <= var4; ++var5) {
               this.transforms[var5] = var1.readUnsignedShort();
               if (this.transforms[var5] == 65535) {
                  this.transforms[var5] = -1;
               }
            }

            this.transforms[var4 + 1] = var3;
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lga;ILga;ILgp;B)Lhh;",
      garbageValue = "115"
   )
   @Export("getModel")
   public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NewStuff var5) {
      if (this.transforms != null) {
         NPCComposition var10 = this.transform();
         return var10 == null ? null : var10.getModel(var1, var2, var3, var4, var5);
      } else {
         long var6 = (long)this.id;
         if (var5 != null) {
            var6 |= var5.field2018 << 16;
         }

         Model var8 = (Model)NpcDefinition_cachedModels.get(var6);
         if (var8 == null) {
            ModelData var9 = this.getModelData(this.models, var5);
            if (var9 == null) {
               return null;
            }

            var8 = var9.toModel(this.ambient + 64, this.contrast * 5 + 850, -30, -50, -30);
            NpcDefinition_cachedModels.put(var8, var6);
         }

         Model var11;
         if (var1 != null && var3 != null) {
            var11 = var1.applyTransformations(var8, var2, var3, var4);
         } else if (var1 != null) {
            var11 = var1.transformActorModel(var8, var2);
         } else if (var3 != null) {
            var11 = var3.transformActorModel(var8, var4);
         } else {
            var11 = var8.toSharedSequenceModel(true);
         }

         if (this.widthScale != 128 || this.heightScale != 128) {
            var11.scale(this.widthScale, this.heightScale, this.widthScale);
         }

         return var11;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lgp;I)Lgi;",
      garbageValue = "1744013797"
   )
   public final ModelData method3666(NewStuff var1) {
      if (this.transforms != null) {
         NPCComposition var2 = this.transform();
         return var2 == null ? null : var2.method3666(var1);
      } else {
         return this.getModelData(this.field2026, var1);
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "([ILgp;I)Lgi;",
      garbageValue = "951395147"
   )
   @Export("getModelData")
   ModelData getModelData(int[] var1, NewStuff var2) {
      int[] var3 = var1;
      if (var2 != null && var2.field2013 != null) {
         var3 = var2.field2013;
      }

      if (var3 == null) {
         return null;
      } else {
         boolean var4 = false;

         for(int var5 = 0; var5 < var3.length; ++var5) {
            if (var3[var5] != -1 && !class363.field4361.tryLoadFile(var3[var5], 0)) {
               var4 = true;
            }
         }

         if (var4) {
            return null;
         } else {
            ModelData[] var9 = new ModelData[var3.length];

            for(int var6 = 0; var6 < var3.length; ++var6) {
               var9[var6] = ModelData.ModelData_get(class363.field4361, var3[var6], 0);
            }

            ModelData var10;
            if (var9.length == 1) {
               var10 = var9[0];
               if (var10 == null) {
                  var10 = new ModelData(var9, var9.length);
               }
            } else {
               var10 = new ModelData(var9, var9.length);
            }

            short[] var7;
            int var8;
            if (this.recolorFrom != null) {
               var7 = this.recolorTo;
               if (var2 != null && var2.field2015 != null) {
                  var7 = var2.field2015;
               }

               for(var8 = 0; var8 < this.recolorFrom.length; ++var8) {
                  var10.recolor(this.recolorFrom[var8], var7[var8]);
               }
            }

            if (this.retextureFrom != null) {
               var7 = this.retextureTo;
               if (var2 != null && var2.field2016 != null) {
                  var7 = var2.field2016;
               }

               for(var8 = 0; var8 < this.retextureFrom.length; ++var8) {
                  var10.retexture(this.retextureFrom[var8], var7[var8]);
               }
            }

            return var10;
         }
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(I)Lgz;",
      garbageValue = "-549841481"
   )
   @Export("transform")
   public final NPCComposition transform() {
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

      return var2 != -1 ? class129.getNpcDefinition(var2) : null;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2130957543"
   )
   @Export("transformIsVisible")
   public boolean transformIsVisible() {
      if (this.transforms == null) {
         return true;
      } else {
         int var1 = -1;
         if (this.transformVarbit != -1) {
            var1 = PlayerCompositionColorTextureOverride.getVarbit(this.transformVarbit);
         } else if (this.transformVarp != -1) {
            var1 = Varps.Varps_main[this.transformVarp];
         }

         if (var1 >= 0 && var1 < this.transforms.length) {
            return this.transforms[var1] != -1;
         } else {
            return this.transforms[this.transforms.length - 1] != -1;
         }
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1577076717"
   )
   @Export("getIntParam")
   public int getIntParam(int var1, int var2) {
      return UserComparator8.method2819(this.params, var1, var2);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
      garbageValue = "100"
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

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-700368633"
   )
   public boolean method3672() {
      return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "-1876307033"
   )
   public int[] method3678() {
      return this.headIconArchiveIds;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "803471346"
   )
   public int method3663(int var1) {
      return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)[S",
      garbageValue = "-44005875"
   )
   public short[] method3715() {
      return this.headIconSpriteIndex;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(II)S",
      garbageValue = "257867612"
   )
   public short method3673(int var1) {
      return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)Lgr;",
      garbageValue = "-664337463"
   )
   @Export("ItemDefinition_get")
   public static ItemComposition ItemDefinition_get(int var0) {
      ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = ItemComposition.ItemDefinition_archive.takeFile(10, var0);
         var1 = new ItemComposition();
         var1.id = var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.post();
         if (var1.noteTemplate != -1) {
            var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
         }

         if (var1.notedId != -1) {
            var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
         }

         if (var1.placeholderTemplate != -1) {
            var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
         }

         if (!Clock.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
            var1.name = "Members object";
            var1.isTradable = false;

            int var3;
            for(var3 = 0; var3 < var1.groundActions.length; ++var3) {
               var1.groundActions[var3] = null;
            }

            for(var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
               if (var3 != 4) {
                  var1.inventoryActions[var3] = null;
               }
            }

            var1.shiftClickIndex = -2;
            var1.team = 0;
            if (var1.params != null) {
               boolean var6 = false;

               for(Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
                  ParamComposition var5 = class149.getParamDefinition((int)var4.key);
                  if (var5.autoDisable) {
                     var4.remove();
                  } else {
                     var6 = true;
                  }
               }

               if (!var6) {
                  var1.params = null;
               }
            }
         }

         ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "-771473401"
   )
   static int method3725(int var0, Script var1, boolean var2) {
      String var3;
      int var10;
      if (var0 == ScriptOpcodes.APPEND_NUM) {
         var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
         var10 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
         Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var10;
         return 1;
      } else {
         String var4;
         if (var0 == ScriptOpcodes.APPEND) {
            Interpreter.Interpreter_stringStackSize -= 2;
            var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
            var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
            Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var4;
            return 1;
         } else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
            var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
            var10 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + Huffman.intToString(var10, true);
            return 1;
         } else if (var0 == ScriptOpcodes.LOWERCASE) {
            var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
            Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toLowerCase();
            return 1;
         } else {
            int var6;
            int var7;
            int var11;
            if (var0 == ScriptOpcodes.FROMDATE) {
               var11 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
               long var14 = ((long)var11 + 11745L) * 86400000L;
               Interpreter.Interpreter_calendar.setTime(new Date(var14));
               var6 = Interpreter.Interpreter_calendar.get(5);
               var7 = Interpreter.Interpreter_calendar.get(2);
               int var8 = Interpreter.Interpreter_calendar.get(1);
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var7] + "-" + var8;
               return 1;
            } else if (var0 != ScriptOpcodes.TEXT_GENDER) {
               if (var0 == ScriptOpcodes.TOSTRING) {
                  var11 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Integer.toString(var11);
                  return 1;
               } else if (var0 == ScriptOpcodes.COMPARE) {
                  Interpreter.Interpreter_stringStackSize -= 2;
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class145.method3149(WallDecoration.compareStrings(Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1], class173.clientLanguage));
                  return 1;
               } else {
                  int var9;
                  byte[] var12;
                  Font var13;
                  if (var0 == ScriptOpcodes.PARAHEIGHT) {
                     var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                     class87.Interpreter_intStackSize -= 2;
                     var10 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
                     var12 = class358.archive13.takeFile(var9, 0);
                     var13 = new Font(var12);
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.PARAWIDTH) {
                     var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                     class87.Interpreter_intStackSize -= 2;
                     var10 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
                     var12 = class358.archive13.takeFile(var9, 0);
                     var13 = new Font(var12);
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
                     Interpreter.Interpreter_stringStackSize -= 2;
                     var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
                     var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
                     if (Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1) {
                        Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
                     } else {
                        Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4;
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.ESCAPE) {
                     var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
                     return 1;
                  } else if (var0 == ScriptOpcodes.APPEND_CHAR) {
                     var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                     var10 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + (char)var10;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
                     var11 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class148.isCharPrintable((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
                     var11 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ObjectComposition.isAlphaNumeric((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
                     var11 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ViewportMouse.isCharAlphabetic((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
                     var11 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = WorldMapLabelSize.isDigit((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_LENGTH) {
                     var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                     if (var3 != null) {
                        Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.length();
                     } else {
                        Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.SUBSTRING) {
                     var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                     class87.Interpreter_intStackSize -= 2;
                     var10 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1];
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.substring(var10, var9);
                     return 1;
                  } else if (var0 == ScriptOpcodes.REMOVETAGS) {
                     var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                     StringBuilder var16 = new StringBuilder(var3.length());
                     boolean var17 = false;

                     for(var6 = 0; var6 < var3.length(); ++var6) {
                        var7 = var3.charAt(var6);
                        if (var7 == 60) {
                           var17 = true;
                        } else if (var7 == 62) {
                           var17 = false;
                        } else if (!var17) {
                           var16.append((char)var7);
                        }
                     }

                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16.toString();
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
                     var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                     var10 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.indexOf(var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
                     Interpreter.Interpreter_stringStackSize -= 2;
                     var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
                     var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
                     var9 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9);
                     return 1;
                  } else if (var0 == 4122) {
                     var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
                     Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toUpperCase();
                     return 1;
                  } else if (var0 == 4123) {
                     Interpreter.Interpreter_stringStackSize -= 3;
                     var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
                     var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
                     String var5 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 2];
                     if (class155.localPlayer.appearance == null) {
                        Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5;
                        return 1;
                     } else {
                        switch (class155.localPlayer.appearance.field3476) {
                           case 0:
                              Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
                              break;
                           case 1:
                              Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4;
                              break;
                           case 2:
                           default:
                              Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5;
                        }

                        return 1;
                     }
                  } else {
                     return 2;
                  }
               }
            } else {
               Interpreter.Interpreter_stringStackSize -= 2;
               var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
               var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
               if (class155.localPlayer.appearance != null && class155.localPlayer.appearance.gender != 0) {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4;
               } else {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
               }

               return 1;
            }
         }
      }
   }
}
