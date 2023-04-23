import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("NpcDefinition_archive")
   static AbstractArchive NpcDefinition_archive;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   static AbstractArchive field2006;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("NpcDefinition_cached")
   static EvictingDualNodeHashTable NpcDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("NpcDefinition_cachedModels")
   static EvictingDualNodeHashTable NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50);
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1115372301
   )
   @Export("id")
   public int id;
   @ObfuscatedName("aq")
   @Export("name")
   public String name = "null";
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1458410691
   )
   @Export("size")
   public int size = 1;
   @ObfuscatedName("at")
   @Export("models")
   int[] models;
   @ObfuscatedName("aa")
   int[] field2052;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 1235033537
   )
   @Export("idleSequence")
   public int idleSequence = -1;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -2117504177
   )
   @Export("turnLeftSequence")
   public int turnLeftSequence = -1;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1635935495
   )
   @Export("turnRightSequence")
   public int turnRightSequence = -1;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 849832979
   )
   @Export("walkSequence")
   public int walkSequence = -1;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 606174455
   )
   @Export("walkBackSequence")
   public int walkBackSequence = -1;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 429445119
   )
   @Export("walkLeftSequence")
   public int walkLeftSequence = -1;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1237616413
   )
   @Export("walkRightSequence")
   public int walkRightSequence = -1;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1565402875
   )
   public int field2048 = -1;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1434909561
   )
   public int field2008 = -1;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1171795391
   )
   public int field2025 = -1;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 1924156607
   )
   public int field2037 = -1;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1186532489
   )
   public int field2023 = -1;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1456216629
   )
   public int field2028 = -1;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -750567499
   )
   public int field2029 = -1;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1520351037
   )
   public int field2030 = -1;
   @ObfuscatedName("ap")
   @Export("recolorFrom")
   short[] recolorFrom;
   @ObfuscatedName("by")
   @Export("recolorTo")
   public short[] recolorTo;
   @ObfuscatedName("bb")
   @Export("retextureFrom")
   short[] retextureFrom;
   @ObfuscatedName("bi")
   @Export("retextureTo")
   public short[] retextureTo;
   @ObfuscatedName("be")
   @Export("actions")
   public String[] actions = new String[5];
   @ObfuscatedName("bk")
   @Export("drawMapDot")
   public boolean drawMapDot = true;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = 2062903815
   )
   @Export("combatLevel")
   public int combatLevel = -1;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = 1661958697
   )
   @Export("widthScale")
   int widthScale = 128;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 521320011
   )
   @Export("heightScale")
   int heightScale = 128;
   @ObfuscatedName("bm")
   @Export("isVisible")
   public boolean isVisible = false;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -1500709613
   )
   @Export("ambient")
   int ambient = 0;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = -2057653211
   )
   @Export("contrast")
   int contrast = 0;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = 1982137875
   )
   @Export("rotation")
   public int rotation = 32;
   @ObfuscatedName("bn")
   @Export("transforms")
   public int[] transforms;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 1781845069
   )
   @Export("transformVarbit")
   int transformVarbit = -1;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = 2051988897
   )
   @Export("transformVarp")
   int transformVarp = -1;
   @ObfuscatedName("bg")
   @Export("isInteractable")
   public boolean isInteractable = true;
   @ObfuscatedName("bu")
   @Export("isClickable")
   public boolean isClickable = true;
   @ObfuscatedName("bf")
   @Export("isFollower")
   public boolean isFollower = false;
   @ObfuscatedName("bq")
   @Export("headIconArchiveIds")
   int[] headIconArchiveIds = null;
   @ObfuscatedName("ba")
   @Export("headIconSpriteIndex")
   short[] headIconSpriteIndex = null;
   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "Lro;"
   )
   @Export("params")
   IterableNodeHashTable params;

   NPCComposition() {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "835833293"
   )
   @Export("postDecode")
   void postDecode() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "-247932803"
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

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lsg;II)V",
      garbageValue = "1239995114"
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
         this.field2052 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2052[var4] = var1.readUnsignedShort();
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
               this.field2048 = var1.readUnsignedShort();
            } else if (var2 == 115) {
               this.field2048 = var1.readUnsignedShort();
               this.field2008 = var1.readUnsignedShort();
               this.field2025 = var1.readUnsignedShort();
               this.field2037 = var1.readUnsignedShort();
            } else if (var2 == 116) {
               this.field2023 = var1.readUnsignedShort();
            } else if (var2 == 117) {
               this.field2023 = var1.readUnsignedShort();
               this.field2028 = var1.readUnsignedShort();
               this.field2029 = var1.readUnsignedShort();
               this.field2030 = var1.readUnsignedShort();
            } else if (var2 == 249) {
               this.params = ChatChannel.readStringIntParameters(var1, this.params);
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

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lha;ILha;ILhv;B)Lit;",
      garbageValue = "49"
   )
   @Export("getModel")
   public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NewStuff var5) {
      if (this.transforms != null) {
         NPCComposition var10 = this.transform();
         return var10 == null ? null : var10.getModel(var1, var2, var3, var4, var5);
      } else {
         long var6 = (long)this.id;
         if (var5 != null) {
            var6 |= var5.field2002 << 16;
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

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lhv;B)Liz;",
      garbageValue = "64"
   )
   public final ModelData method3770(NewStuff var1) {
      if (this.transforms != null) {
         NPCComposition var2 = this.transform();
         return var2 == null ? null : var2.method3770(var1);
      } else {
         return this.getModelData(this.field2052, var1);
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "([ILhv;I)Liz;",
      garbageValue = "-417083855"
   )
   @Export("getModelData")
   ModelData getModelData(int[] var1, NewStuff var2) {
      int[] var3 = var1;
      if (var2 != null && var2.field2001 != null) {
         var3 = var2.field2001;
      }

      if (var3 == null) {
         return null;
      } else {
         boolean var4 = false;

         for(int var5 = 0; var5 < var3.length; ++var5) {
            if (var3[var5] != -1 && !field2006.tryLoadFile(var3[var5], 0)) {
               var4 = true;
            }
         }

         if (var4) {
            return null;
         } else {
            ModelData[] var9 = new ModelData[var3.length];

            for(int var6 = 0; var6 < var3.length; ++var6) {
               var9[var6] = ModelData.ModelData_get(field2006, var3[var6], 0);
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
               if (var2 != null && var2.field2000 != null) {
                  var7 = var2.field2000;
               }

               for(var8 = 0; var8 < this.recolorFrom.length; ++var8) {
                  var10.recolor(this.recolorFrom[var8], var7[var8]);
               }
            }

            if (this.retextureFrom != null) {
               var7 = this.retextureTo;
               if (var2 != null && var2.field2003 != null) {
                  var7 = var2.field2003;
               }

               for(var8 = 0; var8 < this.retextureFrom.length; ++var8) {
                  var10.retexture(this.retextureFrom[var8], var7[var8]);
               }
            }

            return var10;
         }
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Lhs;",
      garbageValue = "1271441583"
   )
   @Export("transform")
   public final NPCComposition transform() {
      int var1 = -1;
      if (this.transformVarbit != -1) {
         var1 = class252.getVarbit(this.transformVarbit);
      } else if (this.transformVarp != -1) {
         var1 = Varps.Varps_main[this.transformVarp];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? AbstractArchive.getNpcDefinition(var2) : null;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "41635170"
   )
   @Export("transformIsVisible")
   public boolean transformIsVisible() {
      if (this.transforms == null) {
         return true;
      } else {
         int var1 = -1;
         if (this.transformVarbit != -1) {
            var1 = class252.getVarbit(this.transformVarbit);
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

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "1858319582"
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

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1361992151"
   )
   @Export("getStringParam")
   public String getStringParam(int var1, String var2) {
      return EnumComposition.method3750(this.params, var1, var2);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "29"
   )
   public boolean method3776() {
      return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "-185133589"
   )
   public int[] method3777() {
      return this.headIconArchiveIds;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "123"
   )
   public int method3778(int var1) {
      return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)[S",
      garbageValue = "800844396"
   )
   public short[] method3779() {
      return this.headIconSpriteIndex;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(II)S",
      garbageValue = "439788995"
   )
   public short method3783(int var1) {
      return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
   }

   @ObfuscatedName("aq")
   public static int method3824(long var0) {
      return (int)(var0 >>> 7 & 127L);
   }
}
