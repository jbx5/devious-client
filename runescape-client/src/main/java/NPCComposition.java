import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("NpcDefinition_archive")
   public static AbstractArchive NpcDefinition_archive;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   public static AbstractArchive field1988;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("NpcDefinition_cached")
   public static EvictingDualNodeHashTable NpcDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("NpcDefinition_cachedModels")
   public static EvictingDualNodeHashTable NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50);
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -243384875
   )
   @Export("id")
   public int id;
   @ObfuscatedName("av")
   @Export("name")
   public String name = "null";
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1662677605
   )
   @Export("size")
   public int size = 1;
   @ObfuscatedName("ap")
   @Export("models")
   int[] models;
   @ObfuscatedName("ar")
   int[] field1995;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1877440965
   )
   @Export("idleSequence")
   public int idleSequence = -1;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1406295179
   )
   @Export("turnLeftSequence")
   public int turnLeftSequence = -1;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -397750535
   )
   @Export("turnRightSequence")
   public int turnRightSequence = -1;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 1152348467
   )
   @Export("walkSequence")
   public int walkSequence = -1;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -274981045
   )
   @Export("walkBackSequence")
   public int walkBackSequence = -1;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -530199757
   )
   @Export("walkLeftSequence")
   public int walkLeftSequence = -1;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -379647223
   )
   @Export("walkRightSequence")
   public int walkRightSequence = -1;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1285996051
   )
   public int field2003 = -1;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -586131591
   )
   public int field2004 = -1;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1601228497
   )
   public int field2005 = -1;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1419952353
   )
   public int field2006 = -1;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1194052623
   )
   public int field2007 = -1;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -943021763
   )
   public int field2008 = -1;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -166464761
   )
   public int field2009 = -1;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 1277541461
   )
   public int field1989 = -1;
   @ObfuscatedName("ad")
   @Export("recolorFrom")
   short[] recolorFrom;
   @ObfuscatedName("bm")
   @Export("recolorTo")
   public short[] recolorTo;
   @ObfuscatedName("bv")
   @Export("retextureFrom")
   short[] retextureFrom;
   @ObfuscatedName("bo")
   @Export("retextureTo")
   public short[] retextureTo;
   @ObfuscatedName("bs")
   @Export("actions")
   public String[] actions = new String[5];
   @ObfuscatedName("bg")
   @Export("drawMapDot")
   public boolean drawMapDot = true;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = 283378457
   )
   @Export("combatLevel")
   public int combatLevel = -1;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = 1320658215
   )
   @Export("widthScale")
   int widthScale = 128;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -1225349301
   )
   @Export("heightScale")
   int heightScale = 128;
   @ObfuscatedName("br")
   @Export("isVisible")
   public boolean isVisible = false;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = 311215161
   )
   @Export("ambient")
   int ambient = 0;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = -839430699
   )
   @Export("contrast")
   int contrast = 0;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 996428613
   )
   @Export("rotation")
   public int rotation = 32;
   @ObfuscatedName("bc")
   @Export("transforms")
   public int[] transforms;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 73546139
   )
   @Export("transformVarbit")
   int transformVarbit = -1;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -1313172187
   )
   @Export("transformVarp")
   int transformVarp = -1;
   @ObfuscatedName("bu")
   @Export("isInteractable")
   public boolean isInteractable = true;
   @ObfuscatedName("bd")
   @Export("isClickable")
   public boolean isClickable = true;
   @ObfuscatedName("by")
   @Export("isFollower")
   public boolean isFollower = false;
   @ObfuscatedName("bp")
   @Export("headIconArchiveIds")
   int[] headIconArchiveIds = null;
   @ObfuscatedName("bb")
   @Export("headIconSpriteIndex")
   short[] headIconSpriteIndex = null;
   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "Lrz;"
   )
   @Export("params")
   IterableNodeHashTable params;

   NPCComposition() {
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1346369690"
   )
   @Export("postDecode")
   void postDecode() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "-208240743"
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
      descriptor = "(Lsy;IS)V",
      garbageValue = "8039"
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
         this.field1995 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field1995[var4] = var1.readUnsignedShort();
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
               this.field2003 = var1.readUnsignedShort();
            } else if (var2 == 115) {
               this.field2003 = var1.readUnsignedShort();
               this.field2004 = var1.readUnsignedShort();
               this.field2005 = var1.readUnsignedShort();
               this.field2006 = var1.readUnsignedShort();
            } else if (var2 == 116) {
               this.field2007 = var1.readUnsignedShort();
            } else if (var2 == 117) {
               this.field2007 = var1.readUnsignedShort();
               this.field2008 = var1.readUnsignedShort();
               this.field2009 = var1.readUnsignedShort();
               this.field1989 = var1.readUnsignedShort();
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

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lhx;ILhx;ILhj;B)Lix;",
      garbageValue = "61"
   )
   @Export("getModel")
   public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NewStuff var5) {
      if (this.transforms != null) {
         NPCComposition var10 = this.transform();
         return var10 == null ? null : var10.getModel(var1, var2, var3, var4, var5);
      } else {
         long var6 = (long)this.id;
         if (var5 != null) {
            var6 |= var5.field1985 << 16;
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

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lhj;B)Liu;",
      garbageValue = "48"
   )
   public final ModelData method3670(NewStuff var1) {
      if (this.transforms != null) {
         NPCComposition var2 = this.transform();
         return var2 == null ? null : var2.method3670(var1);
      } else {
         return this.getModelData(this.field1995, var1);
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "([ILhj;I)Liu;",
      garbageValue = "1908228242"
   )
   @Export("getModelData")
   ModelData getModelData(int[] var1, NewStuff var2) {
      int[] var3 = var1;
      if (var2 != null && var2.field1982 != null) {
         var3 = var2.field1982;
      }

      if (var3 == null) {
         return null;
      } else {
         boolean var4 = false;

         for(int var5 = 0; var5 < var3.length; ++var5) {
            if (var3[var5] != -1 && !field1988.tryLoadFile(var3[var5], 0)) {
               var4 = true;
            }
         }

         if (var4) {
            return null;
         } else {
            ModelData[] var9 = new ModelData[var3.length];

            for(int var6 = 0; var6 < var3.length; ++var6) {
               var9[var6] = ModelData.ModelData_get(field1988, var3[var6], 0);
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
               if (var2 != null && var2.field1983 != null) {
                  var7 = var2.field1983;
               }

               for(var8 = 0; var8 < this.recolorFrom.length; ++var8) {
                  var10.recolor(this.recolorFrom[var8], var7[var8]);
               }
            }

            if (this.retextureFrom != null) {
               var7 = this.retextureTo;
               if (var2 != null && var2.field1984 != null) {
                  var7 = var2.field1984;
               }

               for(var8 = 0; var8 < this.retextureFrom.length; ++var8) {
                  var10.retexture(this.retextureFrom[var8], var7[var8]);
               }
            }

            return var10;
         }
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(B)Lhl;",
      garbageValue = "99"
   )
   @Export("transform")
   public final NPCComposition transform() {
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

      return var2 != -1 ? class188.getNpcDefinition(var2) : null;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1446160465"
   )
   @Export("transformIsVisible")
   public boolean transformIsVisible() {
      if (this.transforms == null) {
         return true;
      } else {
         int var1 = -1;
         if (this.transformVarbit != -1) {
            var1 = class17.getVarbit(this.transformVarbit);
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

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-2100920118"
   )
   @Export("getIntParam")
   public int getIntParam(int var1, int var2) {
      return class139.method3104(this.params, var1, var2);
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-2002434175"
   )
   @Export("getStringParam")
   public String getStringParam(int var1, String var2) {
      return class428.method7964(this.params, var1, var2);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(S)Z",
      garbageValue = "29155"
   )
   public boolean method3676() {
      return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)[I",
      garbageValue = "111"
   )
   public int[] method3677() {
      return this.headIconArchiveIds;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-829102278"
   )
   public int method3678(int var1) {
      return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)[S",
      garbageValue = "483392453"
   )
   public short[] method3673() {
      return this.headIconSpriteIndex;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(II)S",
      garbageValue = "1369177294"
   )
   public short method3700(int var1) {
      return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZI)I",
      garbageValue = "-1030053698"
   )
   static int method3713(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ObfuscatedName("ld")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-64"
   )
   @Export("runIntfCloseListeners")
   static final void runIntfCloseListeners(int var0, int var1) {
      if (GrandExchangeEvent.loadInterface(var0)) {
         class6.runComponentCloseListeners(class155.Widget_interfaceComponents[var0], var1);
      }
   }
}
