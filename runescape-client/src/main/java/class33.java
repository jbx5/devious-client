import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bz")
public class class33 {
   @ObfuscatedName("lg")
   @ObfuscatedGetter(
      intValue = -1958669353
   )
   @Export("oculusOrbFocalPointX")
   static int oculusOrbFocalPointX;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1162709731
   )
   int field191;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 234892017
   )
   int field192;

   class33(int var1, int var2) {
      this.field191 = var1;
      this.field192 = var2;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lbe;I)Z",
      garbageValue = "2098097689"
   )
   boolean method499(class29 var1) {
      if (var1 == null) {
         return false;
      } else {
         switch (this.field191) {
            case 1:
               return var1.vmethod4207(this.field192);
            case 2:
               return var1.vmethod4217(this.field192);
            case 3:
               return var1.vmethod4234((char)this.field192);
            case 4:
               return var1.vmethod4224(this.field192 == 1);
            default:
               return false;
         }
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)[Llf;",
      garbageValue = "0"
   )
   static LoginPacket[] method504() {
      return new LoginPacket[]{LoginPacket.field3341, LoginPacket.field3343, LoginPacket.field3339, LoginPacket.field3342, LoginPacket.field3344, LoginPacket.field3338};
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lnm;Lnm;I)Z",
      garbageValue = "2112098628"
   )
   public static boolean method509(AbstractArchive var0, AbstractArchive var1) {
      WorldMapElement.WorldMapElement_archive = var1;
      if (!var0.isFullyLoaded()) {
         return false;
      } else {
         class328.WorldMapElement_count = var0.getGroupFileCount(35);
         WorldMapElement.WorldMapElement_cached = new WorldMapElement[class328.WorldMapElement_count];

         for(int var2 = 0; var2 < class328.WorldMapElement_count; ++var2) {
            byte[] var3 = var0.takeFile(35, var2);
            WorldMapElement.WorldMapElement_cached[var2] = new WorldMapElement(var2);
            if (var3 != null) {
               WorldMapElement.WorldMapElement_cached[var2].decode(new Buffer(var3));
               WorldMapElement.WorldMapElement_cached[var2].method3659();
            }
         }

         return true;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Lho;",
      garbageValue = "367699395"
   )
   @Export("getParamDefinition")
   public static ParamComposition getParamDefinition(int var0) {
      ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
         var1 = new ParamComposition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZB)I",
      garbageValue = "-101"
   )
   static int method511(int var0, Script var1, boolean var2) {
      if (var0 < 1000) {
         return LoginScreenAnimation.method2440(var0, var1, var2);
      } else if (var0 < 1100) {
         return class131.method3129(var0, var1, var2);
      } else if (var0 < 1200) {
         return class31.method474(var0, var1, var2);
      } else if (var0 < 1300) {
         return Varcs.method2755(var0, var1, var2);
      } else if (var0 < 1400) {
         return StructComposition.method3939(var0, var1, var2);
      } else if (var0 < 1500) {
         return class121.method2977(var0, var1, var2);
      } else if (var0 < 1600) {
         return class244.method5043(var0, var1, var2);
      } else if (var0 < 1700) {
         return AbstractUserComparator.method7860(var0, var1, var2);
      } else if (var0 < 1800) {
         return DefaultsGroup.method8080(var0, var1, var2);
      } else if (var0 < 1900) {
         return Rasterizer3D.method4451(var0, var1, var2);
      } else if (var0 < 2000) {
         return class13.method175(var0, var1, var2);
      } else if (var0 < 2100) {
         return class131.method3129(var0, var1, var2);
      } else if (var0 < 2200) {
         return class31.method474(var0, var1, var2);
      } else if (var0 < 2300) {
         return Varcs.method2755(var0, var1, var2);
      } else if (var0 < 2400) {
         return StructComposition.method3939(var0, var1, var2);
      } else if (var0 < 2500) {
         return class121.method2977(var0, var1, var2);
      } else if (var0 < 2600) {
         return class31.method471(var0, var1, var2);
      } else if (var0 < 2700) {
         return MouseHandler.method713(var0, var1, var2);
      } else if (var0 < 2800) {
         return SceneTilePaint.method4910(var0, var1, var2);
      } else if (var0 < 2900) {
         return method506(var0, var1, var2);
      } else if (var0 < 3000) {
         return class13.method175(var0, var1, var2);
      } else if (var0 < 3200) {
         return NetFileRequest.method6685(var0, var1, var2);
      } else if (var0 < 3300) {
         return ObjectComposition.method3999(var0, var1, var2);
      } else if (var0 < 3400) {
         return class130.method3127(var0, var1, var2);
      } else if (var0 < 3500) {
         return class380.method7398(var0, var1, var2);
      } else if (var0 < 3600) {
         return HitSplatDefinition.method3977(var0, var1, var2);
      } else if (var0 < 3700) {
         return WorldMapAreaData.method5566(var0, var1, var2);
      } else if (var0 < 3800) {
         return FloorOverlayDefinition.method4123(var0, var1, var2);
      } else if (var0 < 3900) {
         return class478.method8902(var0, var1, var2);
      } else if (var0 < 4000) {
         return class18.method272(var0, var1, var2);
      } else if (var0 < 4100) {
         return UserComparator3.method2930(var0, var1, var2);
      } else if (var0 < 4200) {
         return ApproximateRouteStrategy.method1212(var0, var1, var2);
      } else if (var0 < 4300) {
         return MusicPatchPcmStream.method5944(var0, var1, var2);
      } else if (var0 < 5100) {
         return UserComparator6.method2963(var0, var1, var2);
      } else if (var0 < 5400) {
         return UserComparator4.method2878(var0, var1, var2);
      } else if (var0 < 5600) {
         return TaskHandler.method3561(var0, var1, var2);
      } else if (var0 < 5700) {
         return Client.method1233(var0, var1, var2);
      } else if (var0 < 6300) {
         return class327.method6575(var0, var1, var2);
      } else if (var0 < 6600) {
         return WorldMapArea.method5161(var0, var1, var2);
      } else if (var0 < 6700) {
         return MouseRecorder.method2268(var0, var1, var2);
      } else if (var0 < 6800) {
         return class282.method5682(var0, var1, var2);
      } else if (var0 < 6900) {
         return NetFileRequest.method6686(var0, var1, var2);
      } else if (var0 < 7000) {
         return UserComparator7.method2911(var0, var1, var2);
      } else if (var0 < 7100) {
         return SoundSystem.method879(var0, var1, var2);
      } else if (var0 < 7200) {
         return class163.method3463(var0, var1, var2);
      } else if (var0 < 7300) {
         return class16.method215(var0, var1, var2);
      } else if (var0 < 7500) {
         return class126.method3099(var0, var1, var2);
      } else if (var0 < 7600) {
         return class144.method3251(var0, var1, var2);
      } else {
         return var0 < 7700 ? FriendSystem.method1890(var0, var1, var2) : 2;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
      garbageValue = "1290821012"
   )
   @Export("loadClassFromDescriptor")
   static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
      if (var0.equals("B")) {
         return Byte.TYPE;
      } else if (var0.equals("I")) {
         return Integer.TYPE;
      } else if (var0.equals("S")) {
         return Short.TYPE;
      } else if (var0.equals("J")) {
         return Long.TYPE;
      } else if (var0.equals("Z")) {
         return Boolean.TYPE;
      } else if (var0.equals("F")) {
         return Float.TYPE;
      } else if (var0.equals("D")) {
         return Double.TYPE;
      } else if (var0.equals("C")) {
         return Character.TYPE;
      } else {
         return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "([BB)Lch;",
      garbageValue = "1"
   )
   @Export("newScript")
   static Script newScript(byte[] var0) {
      Script var1 = new Script();
      Buffer var2 = new Buffer(var0);
      var2.offset = var2.array.length - 2;
      int var3 = var2.readUnsignedShort();
      int var4 = var2.array.length - 2 - var3 - 12;
      var2.offset = var4;
      int var5 = var2.readInt();
      var1.localIntCount = var2.readUnsignedShort();
      var1.localStringCount = var2.readUnsignedShort();
      var1.intArgumentCount = var2.readUnsignedShort();
      var1.stringArgumentCount = var2.readUnsignedShort();
      int var6 = var2.readUnsignedByte();
      int var7;
      int var8;
      if (var6 > 0) {
         var1.switches = var1.newIterableNodeHashTable(var6);

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var2.readUnsignedShort();
            IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? class70.method2044(var8) : 1);
            var1.switches[var7] = var9;

            while(var8-- > 0) {
               int var10 = var2.readInt();
               int var11 = var2.readInt();
               var9.put(new IntegerNode(var11), (long)var10);
            }
         }
      }

      var2.offset = 0;
      var1.field961 = var2.readStringCp1252NullTerminatedOrNull();
      var1.opcodes = new int[var5];
      var1.intOperands = new int[var5];
      var1.stringOperands = new String[var5];

      for(var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
         var8 = var2.readUnsignedShort();
         if (var8 == 3) {
            var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
         } else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
            var1.intOperands[var7] = var2.readInt();
         } else {
            var1.intOperands[var7] = var2.readUnsignedByte();
         }
      }

      return var1;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2064360869"
   )
   static final void method502() {
      VerticalAlignment.method3825("You can't add yourself to your own friend list");
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(Lbm;I)V",
      garbageValue = "626811319"
   )
   static void method510(GameEngine var0) {
      class207 var1 = Client.field721;
      class207 var2 = var1;

      while(var2.method4215()) {
         if (var2.field2362 == 13) {
            class138.method3210();
            return;
         }

         if (var2.field2362 == 96) {
            if (Login.worldSelectPage > 0 && PlayerType.worldSelectLeftSprite != null) {
               --Login.worldSelectPage;
            }
         } else if (var2.field2362 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class13.worldSelectRightSprite != null) {
            ++Login.worldSelectPage;
         }
      }

      if (MouseHandler.MouseHandler_lastButton == 1 || !class473.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
         int var3 = Login.xPadding + 280;
         if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            FillMode.changeWorldSelectSorting(0, 0);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            FillMode.changeWorldSelectSorting(0, 1);
            return;
         }

         int var4 = Login.xPadding + 390;
         if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            FillMode.changeWorldSelectSorting(1, 0);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            FillMode.changeWorldSelectSorting(1, 1);
            return;
         }

         int var5 = Login.xPadding + 500;
         if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            FillMode.changeWorldSelectSorting(2, 0);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            FillMode.changeWorldSelectSorting(2, 1);
            return;
         }

         int var6 = Login.xPadding + 610;
         if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            FillMode.changeWorldSelectSorting(3, 0);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX >= var6 + 15 && MouseHandler.MouseHandler_lastPressedX <= var6 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
            FillMode.changeWorldSelectSorting(3, 1);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
            class138.method3210();
            return;
         }

         if (Login.hoveredWorldIndex != -1) {
            World var7 = class31.World_worlds[Login.hoveredWorldIndex];
            FloorOverlayDefinition.changeWorld(var7);
            class138.method3210();
            return;
         }

         if (Login.worldSelectPage > 0 && PlayerType.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= PlayerType.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class262.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class262.canvasHeight / 2 + 50) {
            --Login.worldSelectPage;
         }

         if (Login.worldSelectPage < Login.worldSelectPagesCount && class13.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GameEngine.canvasWidth - class13.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GameEngine.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class262.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class262.canvasHeight / 2 + 50) {
            ++Login.worldSelectPage;
         }
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZI)I",
      garbageValue = "-328074717"
   )
   static int method506(int var0, Script var1, boolean var2) {
      Widget var3 = class165.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
      if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class195.Widget_unpackTargetMask(KeyHandler.getWidgetFlags(var3));
         return 1;
      } else if (var0 != ScriptOpcodes.IF_GETOP) {
         if (var0 == ScriptOpcodes.IF_GETOPBASE) {
            if (var3.dataText == null) {
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
            } else {
               Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3.dataText;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         --var4;
         if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
            Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3.actions[var4];
         } else {
            Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
         }

         return 1;
      }
   }

   @ObfuscatedName("jm")
   @ObfuscatedSignature(
      descriptor = "(Lde;IIIIII)V",
      garbageValue = "1538298261"
   )
   @Export("drawActor2d")
   static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 != null && var0.isVisible()) {
         if (var0 instanceof NPC) {
            NPCComposition var6 = ((NPC)var0).definition;
            if (var6.transforms != null) {
               var6 = var6.transform();
            }

            if (var6 == null) {
               return;
            }
         }

         int var75 = Players.Players_count;
         int[] var7 = Players.Players_indices;
         boolean var8 = var1 < var75;
         int var9 = -2;
         int var10;
         if (var0.overheadText != null && (!var8 || !var0.field1144 && (Client.publicChatMode == 4 || !var0.field1176 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) {
            var10 = var0.defaultHeight;
            class374.worldToScreen(var0.x, var0.y, var10);
            if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
               Client.overheadTextXOffsets[Client.overheadTextCount] = class137.fontBold12.stringWidth(var0.overheadText) / 2;
               Client.overheadTextAscents[Client.overheadTextCount] = class137.fontBold12.ascent;
               Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
               Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY - var9;
               Client.overheadTextColors[Client.overheadTextCount] = var0.field1161;
               Client.overheadTextEffects[Client.overheadTextCount] = var0.field1206;
               Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
               Client.overheadText[Client.overheadTextCount] = var0.overheadText;
               ++Client.overheadTextCount;
               var9 += 12;
            }
         }

         int var15;
         int var22;
         int var23;
         if (!var0.healthBars.method7012()) {
            UserComparator6.method2972(var0, var0.defaultHeight + 15);

            for(HealthBar var76 = (HealthBar)var0.healthBars.last(); var76 != null; var76 = (HealthBar)var0.healthBars.previous()) {
               HealthBarUpdate var77 = var76.get(Client.cycle);
               if (var77 == null) {
                  if (var76.isEmpty()) {
                     var76.remove();
                  }
               } else {
                  HealthBarDefinition var12 = var76.definition;
                  SpritePixels var79 = var12.getBackSprite();
                  SpritePixels var83 = var12.getFrontSprite();
                  int var84 = 0;
                  if (var79 != null && var83 != null) {
                     if (var12.widthPadding * 2 < var83.subWidth) {
                        var84 = var12.widthPadding;
                     }

                     var15 = var83.subWidth - var84 * 2;
                  } else {
                     var15 = var12.width;
                  }

                  int var81 = 255;
                  boolean var85 = true;
                  int var86 = Client.cycle - var77.cycle;
                  int var87 = var15 * var77.health2 / var12.width;
                  int var88;
                  int var98;
                  if (var77.cycleOffset > var86) {
                     var88 = var12.field1971 == 0 ? 0 : var12.field1971 * (var86 / var12.field1971);
                     var22 = var15 * var77.health / var12.width;
                     var98 = var88 * (var87 - var22) / var77.cycleOffset + var22;
                  } else {
                     var98 = var87;
                     var88 = var12.int5 + var77.cycleOffset - var86;
                     if (var12.int3 >= 0) {
                        var81 = (var88 << 8) / (var12.int5 - var12.int3);
                     }
                  }

                  if (var77.health2 > 0 && var98 < 1) {
                     var98 = 1;
                  }

                  if (var79 != null && var83 != null) {
                     if (var15 == var98) {
                        var98 += var84 * 2;
                     } else {
                        var98 += var84;
                     }

                     var88 = var79.subHeight;
                     var9 += var88;
                     var22 = var2 + Client.viewportTempX - (var15 >> 1);
                     var23 = var3 + Client.viewportTempY - var9;
                     var22 -= var84;
                     if (var81 >= 0 && var81 < 255) {
                        var79.drawTransAt(var22, var23, var81);
                        Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var98, var23 + var88);
                        var83.drawTransAt(var22, var23, var81);
                     } else {
                        var79.drawTransBgAt(var22, var23);
                        Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var98 + var22, var23 + var88);
                        var83.drawTransBgAt(var22, var23);
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
                     var9 += 2;
                  } else {
                     var9 += 5;
                     if (Client.viewportTempX > -1) {
                        var88 = var2 + Client.viewportTempX - (var15 >> 1);
                        var22 = var3 + Client.viewportTempY - var9;
                        Rasterizer2D.Rasterizer2D_fillRectangle(var88, var22, var98, 5, 65280);
                        Rasterizer2D.Rasterizer2D_fillRectangle(var88 + var98, var22, var15 - var98, 5, 16711680);
                     }

                     var9 += 2;
                  }
               }
            }
         }

         if (var9 == -2) {
            var9 += 7;
         }

         int var11;
         Player var93;
         if (var8 && var0.playerCycle == Client.cycle && class13.method172((Player)var0)) {
            var93 = (Player)var0;
            if (var8) {
               var11 = var0.defaultHeight + 15;
               class374.worldToScreen(var0.x, var0.y, var11);
               AbstractFont var89 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
               var9 += 4;
               var89.drawCentered(var93.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0);
               var9 += 18;
            }
         }

         if (var8) {
            var93 = (Player)var0;
            if (var93.isHidden) {
               return;
            }

            if (var93.headIconPk != -1 || var93.headIconPrayer != -1) {
               var11 = var0.defaultHeight + 15;
               class374.worldToScreen(var0.x, var0.y, var11);
               if (Client.viewportTempX > -1) {
                  if (var93.headIconPk != -1) {
                     var9 += 25;
                     class36.headIconPkSprites[var93.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
                  }

                  if (var93.headIconPrayer != -1) {
                     var9 += 25;
                     class425.headIconPrayerSprites[var93.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
                  }
               }
            }

            if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) {
               var11 = var0.defaultHeight + 15;
               class374.worldToScreen(var0.x, var0.y, var11);
               if (Client.viewportTempX > -1) {
                  var9 += KitDefinition.headIconHintSprites[1].subHeight;
                  KitDefinition.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
               }
            }
         } else {
            NPC var94 = (NPC)var0;
            int[] var95 = var94.method2566();
            short[] var90 = var94.method2578();
            int var13;
            if (var90 != null && var95 != null) {
               for(var13 = 0; var13 < var90.length; ++var13) {
                  if (var90[var13] >= 0 && var95[var13] >= 0) {
                     long var14 = (long)var95[var13] << 8 | (long)var90[var13];
                     SpritePixels var16 = (SpritePixels)Client.archive5.method7718(var14);
                     if (var16 == null) {
                        SpritePixels[] var17 = UserComparator3.method2923(class452.archive8, var95[var13], 0);
                        if (var17 != null && var90[var13] < var17.length) {
                           var16 = var17[var90[var13]];
                           Client.archive5.method7699(var14, var16);
                        }
                     }

                     if (var16 != null) {
                        UserComparator6.method2972(var0, var0.defaultHeight + 15);
                        if (Client.viewportTempX > -1) {
                           var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), Client.viewportTempY + (var3 - var16.subHeight) - 4);
                        }
                     }
                  }
               }
            }

            if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
               var13 = var0.defaultHeight + 15;
               class374.worldToScreen(var0.x, var0.y, var13);
               if (Client.viewportTempX > -1) {
                  KitDefinition.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
               }
            }
         }

         for(var10 = 0; var10 < 4; ++var10) {
            var11 = var0.hitSplatCycles[var10];
            int var78 = var0.hitSplatTypes[var10];
            HitSplatDefinition var96 = null;
            int var80 = 0;
            if (var78 >= 0) {
               if (var11 <= Client.cycle) {
                  continue;
               }

               var96 = class122.method3046(var0.hitSplatTypes[var10]);
               var80 = var96.field2142;
               if (var96 != null && var96.transforms != null) {
                  var96 = var96.transform();
                  if (var96 == null) {
                     var0.hitSplatCycles[var10] = -1;
                     continue;
                  }
               }
            } else if (var11 < 0) {
               continue;
            }

            var15 = var0.hitSplatTypes2[var10];
            HitSplatDefinition var91 = null;
            if (var15 >= 0) {
               var91 = class122.method3046(var15);
               if (var91 != null && var91.transforms != null) {
                  var91 = var91.transform();
               }
            }

            if (var11 - var80 <= Client.cycle) {
               if (var96 == null) {
                  var0.hitSplatCycles[var10] = -1;
               } else {
                  UserComparator6.method2972(var0, var0.defaultHeight / 2);
                  if (Client.viewportTempX > -1) {
                     boolean var97 = true;
                     if (var10 == 1) {
                        Client.viewportTempY -= 20;
                     }

                     if (var10 == 2) {
                        Client.viewportTempX -= 15;
                        Client.viewportTempY -= 10;
                     }

                     if (var10 == 3) {
                        Client.viewportTempX += 15;
                        Client.viewportTempY -= 10;
                     }

                     SpritePixels var18 = null;
                     SpritePixels var19 = null;
                     SpritePixels var20 = null;
                     SpritePixels var21 = null;
                     var22 = 0;
                     var23 = 0;
                     int var24 = 0;
                     int var25 = 0;
                     int var26 = 0;
                     int var27 = 0;
                     int var28 = 0;
                     int var29 = 0;
                     SpritePixels var30 = null;
                     SpritePixels var31 = null;
                     SpritePixels var32 = null;
                     SpritePixels var33 = null;
                     int var34 = 0;
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     int var38 = 0;
                     int var39 = 0;
                     int var40 = 0;
                     int var41 = 0;
                     int var42 = 0;
                     var18 = var96.method3948();
                     int var43;
                     if (var18 != null) {
                        var22 = var18.subWidth;
                        var43 = var18.subHeight;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var26 = var18.xOffset;
                     }

                     var19 = var96.method3949();
                     if (var19 != null) {
                        var23 = var19.subWidth;
                        var43 = var19.subHeight;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var27 = var19.xOffset;
                     }

                     var20 = var96.method3943();
                     if (var20 != null) {
                        var24 = var20.subWidth;
                        var43 = var20.subHeight;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var28 = var20.xOffset;
                     }

                     var21 = var96.method3951();
                     if (var21 != null) {
                        var25 = var21.subWidth;
                        var43 = var21.subHeight;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var29 = var21.xOffset;
                     }

                     if (var91 != null) {
                        var30 = var91.method3948();
                        if (var30 != null) {
                           var34 = var30.subWidth;
                           var43 = var30.subHeight;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var38 = var30.xOffset;
                        }

                        var31 = var91.method3949();
                        if (var31 != null) {
                           var35 = var31.subWidth;
                           var43 = var31.subHeight;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var39 = var31.xOffset;
                        }

                        var32 = var91.method3943();
                        if (var32 != null) {
                           var36 = var32.subWidth;
                           var43 = var32.subHeight;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var40 = var32.xOffset;
                        }

                        var33 = var91.method3951();
                        if (var33 != null) {
                           var37 = var33.subWidth;
                           var43 = var33.subHeight;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var41 = var33.xOffset;
                        }
                     }

                     Font var82 = var96.getFont();
                     if (var82 == null) {
                        var82 = Language.fontPlain11;
                     }

                     Font var44;
                     if (var91 != null) {
                        var44 = var91.getFont();
                        if (var44 == null) {
                           var44 = Language.fontPlain11;
                        }
                     } else {
                        var44 = Language.fontPlain11;
                     }

                     String var45 = null;
                     String var46 = null;
                     boolean var47 = false;
                     int var48 = 0;
                     var45 = var96.getString(var0.hitSplatValues[var10]);
                     int var92 = var82.stringWidth(var45);
                     if (var91 != null) {
                        var46 = var91.getString(var0.hitSplatValues2[var10]);
                        var48 = var44.stringWidth(var46);
                     }

                     int var49 = 0;
                     int var50 = 0;
                     if (var23 > 0) {
                        if (var20 == null && var21 == null) {
                           var49 = 1;
                        } else {
                           var49 = var92 / var23 + 1;
                        }
                     }

                     if (var91 != null && var35 > 0) {
                        if (var32 == null && var33 == null) {
                           var50 = 1;
                        } else {
                           var50 = var48 / var35 + 1;
                        }
                     }

                     int var51 = 0;
                     int var52 = var51;
                     if (var22 > 0) {
                        var51 += var22;
                     }

                     var51 += 2;
                     int var53 = var51;
                     if (var24 > 0) {
                        var51 += var24;
                     }

                     int var54 = var51;
                     int var55 = var51;
                     int var56;
                     if (var23 > 0) {
                        var56 = var49 * var23;
                        var51 += var56;
                        var55 += (var56 - var92) / 2;
                     } else {
                        var51 += var92;
                     }

                     var56 = var51;
                     if (var25 > 0) {
                        var51 += var25;
                     }

                     int var57 = 0;
                     int var58 = 0;
                     int var59 = 0;
                     int var60 = 0;
                     int var61 = 0;
                     int var62;
                     if (var91 != null) {
                        var51 += 2;
                        var57 = var51;
                        if (var34 > 0) {
                           var51 += var34;
                        }

                        var51 += 2;
                        var58 = var51;
                        if (var36 > 0) {
                           var51 += var36;
                        }

                        var59 = var51;
                        var61 = var51;
                        if (var35 > 0) {
                           var62 = var35 * var50;
                           var51 += var62;
                           var61 += (var62 - var48) / 2;
                        } else {
                           var51 += var48;
                        }

                        var60 = var51;
                        if (var37 > 0) {
                           var51 += var37;
                        }
                     }

                     var62 = var0.hitSplatCycles[var10] - Client.cycle;
                     int var63 = var96.field2130 - var62 * var96.field2130 / var96.field2142;
                     int var64 = var62 * var96.field2147 / var96.field2142 + -var96.field2147;
                     int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1));
                     int var66 = var64 + (var3 + Client.viewportTempY - 12);
                     int var67 = var66;
                     int var68 = var66 + var42;
                     int var69 = var66 + var96.field2151 + 15;
                     int var70 = var69 - var82.maxAscent;
                     int var71 = var69 + var82.maxDescent;
                     if (var70 < var66) {
                        var67 = var70;
                     }

                     if (var71 > var68) {
                        var68 = var71;
                     }

                     int var72 = 0;
                     int var73;
                     int var74;
                     if (var91 != null) {
                        var72 = var66 + var91.field2151 + 15;
                        var73 = var72 - var44.maxAscent;
                        var74 = var72 + var44.maxDescent;
                        if (var73 < var67) {
                           ;
                        }

                        if (var74 > var68) {
                           ;
                        }
                     }

                     var73 = 255;
                     if (var96.field2154 >= 0) {
                        var73 = (var62 << 8) / (var96.field2142 - var96.field2154);
                     }

                     if (var73 >= 0 && var73 < 255) {
                        if (var18 != null) {
                           var18.drawTransAt(var65 + var52 - var26, var66, var73);
                        }

                        if (var20 != null) {
                           var20.drawTransAt(var53 + var65 - var28, var66, var73);
                        }

                        if (var19 != null) {
                           for(var74 = 0; var74 < var49; ++var74) {
                              var19.drawTransAt(var74 * var23 + (var54 + var65 - var27), var66, var73);
                           }
                        }

                        if (var21 != null) {
                           var21.drawTransAt(var65 + var56 - var29, var66, var73);
                        }

                        var82.drawAlpha(var45, var55 + var65, var69, var96.textColor, 0, var73);
                        if (var91 != null) {
                           if (var30 != null) {
                              var30.drawTransAt(var57 + var65 - var38, var66, var73);
                           }

                           if (var32 != null) {
                              var32.drawTransAt(var58 + var65 - var40, var66, var73);
                           }

                           if (var31 != null) {
                              for(var74 = 0; var74 < var50; ++var74) {
                                 var31.drawTransAt(var35 * var74 + (var65 + var59 - var39), var66, var73);
                              }
                           }

                           if (var33 != null) {
                              var33.drawTransAt(var60 + var65 - var41, var66, var73);
                           }

                           var44.drawAlpha(var46, var65 + var61, var72, var91.textColor, 0, var73);
                        }
                     } else {
                        if (var18 != null) {
                           var18.drawTransBgAt(var52 + var65 - var26, var66);
                        }

                        if (var20 != null) {
                           var20.drawTransBgAt(var53 + var65 - var28, var66);
                        }

                        if (var19 != null) {
                           for(var74 = 0; var74 < var49; ++var74) {
                              var19.drawTransBgAt(var23 * var74 + (var54 + var65 - var27), var66);
                           }
                        }

                        if (var21 != null) {
                           var21.drawTransBgAt(var65 + var56 - var29, var66);
                        }

                        var82.draw(var45, var65 + var55, var69, var96.textColor | -16777216, 0);
                        if (var91 != null) {
                           if (var30 != null) {
                              var30.drawTransBgAt(var57 + var65 - var38, var66);
                           }

                           if (var32 != null) {
                              var32.drawTransBgAt(var58 + var65 - var40, var66);
                           }

                           if (var31 != null) {
                              for(var74 = 0; var74 < var50; ++var74) {
                                 var31.drawTransBgAt(var74 * var35 + (var65 + var59 - var39), var66);
                              }
                           }

                           if (var33 != null) {
                              var33.drawTransBgAt(var65 + var60 - var41, var66);
                           }

                           var44.draw(var46, var65 + var61, var72, var91.textColor | -16777216, 0);
                        }
                     }
                  }
               }
            }
         }

      }
   }

   @ObfuscatedName("jz")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIIIII)V",
      garbageValue = "87894197"
   )
   static final void method508(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      PendingSpawn var10 = null;

      for(PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) {
         if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) {
            var10 = var11;
            break;
         }
      }

      if (var10 == null) {
         var10 = new PendingSpawn();
         var10.plane = var0;
         var10.type = var3;
         var10.x = var1;
         var10.y = var2;
         var10.field1135 = -1;
         Messages.method2763(var10);
         Client.pendingSpawns.addFirst(var10);
      }

      var10.field1127 = var4;
      var10.field1124 = var5;
      var10.field1126 = var6;
      var10.delay = var8;
      var10.hitpoints = var9;
      var10.method2361(var7);
   }
}
