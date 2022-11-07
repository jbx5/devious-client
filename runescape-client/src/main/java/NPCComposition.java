import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("NpcDefinition_archive")
   public static AbstractArchive NpcDefinition_archive;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("NpcDefinition_modelArchive")
   public static AbstractArchive NpcDefinition_modelArchive;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("NpcDefinition_cached")
   static EvictingDualNodeHashTable NpcDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("NpcDefinition_cachedModels")
   static EvictingDualNodeHashTable NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50);
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -457250409
   )
   @Export("id")
   public int id;
   @ObfuscatedName("j")
   @Export("name")
   public String name = "null";
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1154124837
   )
   @Export("size")
   public int size = 1;
   @ObfuscatedName("d")
   @Export("models")
   int[] models;
   @ObfuscatedName("n")
   int[] field1973;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1763077165
   )
   @Export("idleSequence")
   public int idleSequence = -1;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1072963517
   )
   @Export("turnLeftSequence")
   public int turnLeftSequence = -1;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -130540285
   )
   @Export("turnRightSequence")
   public int turnRightSequence = -1;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -343227457
   )
   @Export("walkSequence")
   public int walkSequence = -1;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -139751315
   )
   @Export("walkBackSequence")
   public int walkBackSequence = -1;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -312575181
   )
   @Export("walkLeftSequence")
   public int walkLeftSequence = -1;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -895920503
   )
   @Export("walkRightSequence")
   public int walkRightSequence = -1;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 224467851
   )
   public int field1970 = -1;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1716932325
   )
   public int field1984 = -1;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -329074603
   )
   public int field1972 = -1;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 463853273
   )
   public int field1954 = -1;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -768576303
   )
   public int field1971 = -1;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -346064683
   )
   public int field1975 = -1;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1093105561
   )
   public int field1995 = -1;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -526192223
   )
   public int field1992 = -1;
   @ObfuscatedName("k")
   @Export("recolorFrom")
   short[] recolorFrom;
   @ObfuscatedName("v")
   @Export("recolorTo")
   short[] recolorTo;
   @ObfuscatedName("aj")
   @Export("retextureFrom")
   short[] retextureFrom;
   @ObfuscatedName("an")
   @Export("retextureTo")
   short[] retextureTo;
   @ObfuscatedName("ah")
   @Export("actions")
   public String[] actions = new String[5];
   @ObfuscatedName("ao")
   @Export("drawMapDot")
   public boolean drawMapDot = true;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1102775659
   )
   @Export("combatLevel")
   public int combatLevel = -1;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1636489607
   )
   @Export("widthScale")
   int widthScale = 128;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1437848387
   )
   @Export("heightScale")
   int heightScale = 128;
   @ObfuscatedName("av")
   @Export("isVisible")
   public boolean isVisible = false;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 309792449
   )
   @Export("ambient")
   int ambient = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 447617037
   )
   @Export("contrast")
   int contrast = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1925484585
   )
   @Export("headIconPrayer")
   public int headIconPrayer = -1;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1745872909
   )
   @Export("rotation")
   public int rotation = 32;
   @ObfuscatedName("aq")
   @Export("transforms")
   public int[] transforms;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -298338937
   )
   @Export("transformVarbit")
   int transformVarbit = -1;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -388950709
   )
   @Export("transformVarp")
   int transformVarp = -1;
   @ObfuscatedName("am")
   @Export("isInteractable")
   public boolean isInteractable = true;
   @ObfuscatedName("az")
   @Export("isClickable")
   public boolean isClickable = true;
   @ObfuscatedName("ab")
   @Export("isFollower")
   public boolean isFollower = false;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lpe;"
   )
   @Export("params")
   IterableNodeHashTable params;

   NPCComposition() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1682962666"
   )
   @Export("postDecode")
   void postDecode() {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lqr;B)V",
      garbageValue = "-70"
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
      descriptor = "(Lqr;IB)V",
      garbageValue = "17"
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
         this.field1973 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field1973[var4] = var1.readUnsignedShort();
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
         this.contrast = var1.readByte() * 5;
      } else if (var2 == 102) {
         this.headIconPrayer = var1.readUnsignedShort();
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
            this.field1970 = var1.readUnsignedShort();
         } else if (var2 == 115) {
            this.field1970 = var1.readUnsignedShort();
            this.field1984 = var1.readUnsignedShort();
            this.field1972 = var1.readUnsignedShort();
            this.field1954 = var1.readUnsignedShort();
         } else if (var2 == 116) {
            this.field1971 = var1.readUnsignedShort();
         } else if (var2 == 117) {
            this.field1971 = var1.readUnsignedShort();
            this.field1975 = var1.readUnsignedShort();
            this.field1995 = var1.readUnsignedShort();
            this.field1992 = var1.readUnsignedShort();
         } else if (var2 == 249) {
            this.params = FaceNormal.readStringIntParameters(var1, this.params);
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

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.transforms[var5] = var1.readUnsignedShort();
            if (this.transforms[var5] == 65535) {
               this.transforms[var5] = -1;
            }
         }

         this.transforms[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lgg;ILgg;II)Lha;",
      garbageValue = "1704630654"
   )
   @Export("getModel")
   public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
      if (this.transforms != null) {
         NPCComposition var12 = this.transform();
         return var12 == null ? null : var12.getModel(var1, var2, var3, var4);
      } else {
         Model var5 = (Model)NpcDefinition_cachedModels.get((long)this.id);
         if (var5 == null) {
            boolean var6 = false;

            for(int var7 = 0; var7 < this.models.length; ++var7) {
               if (!NpcDefinition_modelArchive.tryLoadFile(this.models[var7], 0)) {
                  var6 = true;
               }
            }

            if (var6) {
               return null;
            }

            ModelData[] var8 = new ModelData[this.models.length];

            int var9;
            for(var9 = 0; var9 < this.models.length; ++var9) {
               var8[var9] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.models[var9], 0);
            }

            ModelData var10;
            if (var8.length == 1) {
               var10 = var8[0];
            } else {
               var10 = new ModelData(var8, var8.length);
            }

            if (this.recolorFrom != null) {
               for(var9 = 0; var9 < this.recolorFrom.length; ++var9) {
                  var10.recolor(this.recolorFrom[var9], this.recolorTo[var9]);
               }
            }

            if (this.retextureFrom != null) {
               for(var9 = 0; var9 < this.retextureFrom.length; ++var9) {
                  var10.retexture(this.retextureFrom[var9], this.retextureTo[var9]);
               }
            }

            var5 = var10.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
            NpcDefinition_cachedModels.put(var5, (long)this.id);
         }

         Model var11;
         if (var1 != null && var3 != null) {
            var11 = var1.applyTransformations(var5, var2, var3, var4);
         } else if (var1 != null) {
            var11 = var1.transformActorModel(var5, var2);
         } else if (var3 != null) {
            var11 = var3.transformActorModel(var5, var4);
         } else {
            var11 = var5.toSharedSequenceModel(true);
         }

         if (this.widthScale != 128 || this.heightScale != 128) {
            var11.scale(this.widthScale, this.heightScale, this.widthScale);
         }

         return var11;
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(B)Lgs;",
      garbageValue = "0"
   )
   @Export("getModelData")
   public final ModelData getModelData() {
      if (this.transforms != null) {
         NPCComposition var7 = this.transform();
         return var7 == null ? null : var7.getModelData();
      } else if (this.field1973 == null) {
         return null;
      } else {
         boolean var1 = false;

         for(int var2 = 0; var2 < this.field1973.length; ++var2) {
            if (!NpcDefinition_modelArchive.tryLoadFile(this.field1973[var2], 0)) {
               var1 = true;
            }
         }

         if (var1) {
            return null;
         } else {
            ModelData[] var5 = new ModelData[this.field1973.length];

            for(int var3 = 0; var3 < this.field1973.length; ++var3) {
               var5[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field1973[var3], 0);
            }

            ModelData var6;
            if (var5.length == 1) {
               var6 = var5[0];
            } else {
               var6 = new ModelData(var5, var5.length);
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

            return var6;
         }
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(B)Lgu;",
      garbageValue = "125"
   )
   @Export("transform")
   public final NPCComposition transform() {
      int var1 = -1;
      if (this.transformVarbit != -1) {
         var1 = Login.getVarbit(this.transformVarbit);
      } else if (this.transformVarp != -1) {
         var1 = Varps.Varps_main[this.transformVarp];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? HealthBarDefinition.getNpcDefinition(var2) : null;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-34"
   )
   @Export("transformIsVisible")
   public boolean transformIsVisible() {
      if (this.transforms == null) {
         return true;
      } else {
         int var1 = -1;
         if (this.transformVarbit != -1) {
            var1 = Login.getVarbit(this.transformVarbit);
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

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "179886295"
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

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1518498264"
   )
   @Export("getStringParam")
   public String getStringParam(int var1, String var2) {
      return FriendLoginUpdate.method7304(this.params, var1, var2);
   }

   @ObfuscatedName("hj")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "17"
   )
   @Export("drawGraphicsObjectEntity")
   static final void drawGraphicsObjectEntity() {
      for(GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) {
         if (var0.plane == ApproximateRouteStrategy.Client_plane && !var0.isFinished) {
            if (Client.cycle >= var0.cycleStart) {
               var0.advance(Client.graphicsCycle);
               if (var0.isFinished) {
                  var0.remove();
               } else {
                  class139.scene.drawEntity(var0.plane, var0.x, var0.y, var0.z, 60, var0, 0, -1L, false);
               }
            }
         } else {
            var0.remove();
         }
      }

   }
}
