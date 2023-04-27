import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   static AbstractArchive field985;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 618580957
   )
   @Export("id")
   int id;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -373027479
   )
   @Export("type")
   int type;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1904322241
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1674675955
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1815829493
   )
   @Export("x")
   int x;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1893774471
   )
   @Export("y")
   int y;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lha;"
   )
   @Export("sequenceDefinition")
   SequenceDefinition sequenceDefinition;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1017637335
   )
   @Export("frame")
   int frame;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -287053661
   )
   @Export("cycleStart")
   int cycleStart;

   @ObfuscatedSignature(
      descriptor = "(IIIIIIIZLiv;)V"
   )
   DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
      this.id = var1;
      this.type = var2;
      this.orientation = var3;
      this.plane = var4;
      this.x = var5;
      this.y = var6;
      if (var7 != -1) {
         this.sequenceDefinition = ItemContainer.SequenceDefinition_get(var7);
         this.frame = 0;
         this.cycleStart = Client.cycle - 1;
         if (this.sequenceDefinition.field2314 == 0 && var9 != null && var9 instanceof DynamicObject) {
            DynamicObject var10 = (DynamicObject)var9;
            if (var10.sequenceDefinition == this.sequenceDefinition) {
               this.frame = var10.frame;
               this.cycleStart = var10.cycleStart;
               return;
            }
         }

         if (var8 && this.sequenceDefinition.frameCount != -1) {
            if (!this.sequenceDefinition.isCachedModelIdSet()) {
               this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
               this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
            } else {
               this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4135());
            }
         }
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)Lit;",
      garbageValue = "-112"
   )
   @Export("getModel")
   protected final Model getModel() {
      int var2;
      if (this.sequenceDefinition != null) {
         int var1 = Client.cycle - this.cycleStart;
         if (var1 > 100 && this.sequenceDefinition.frameCount > 0) {
            var1 = 100;
         }

         if (this.sequenceDefinition.isCachedModelIdSet()) {
            var2 = this.sequenceDefinition.method4135();
            this.frame += var1;
            var1 = 0;
            if (this.frame >= var2) {
               this.frame = var2 - this.sequenceDefinition.frameCount;
               if (this.frame < 0 || this.frame > var2) {
                  this.sequenceDefinition = null;
               }
            }
         } else {
            label82: {
               do {
                  do {
                     if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
                        break label82;
                     }

                     var1 -= this.sequenceDefinition.frameLengths[this.frame];
                     ++this.frame;
                  } while(this.frame < this.sequenceDefinition.frameIds.length);

                  this.frame -= this.sequenceDefinition.frameCount;
               } while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

               this.sequenceDefinition = null;
            }
         }

         this.cycleStart = Client.cycle - var1;
      }

      ObjectComposition var12 = class144.getObjectDefinition(this.id);
      if (var12.transforms != null) {
         var12 = var12.transform();
      }

      if (var12 == null) {
         return null;
      } else {
         int var3;
         if (this.orientation != 1 && this.orientation != 3) {
            var2 = var12.sizeX;
            var3 = var12.sizeY;
         } else {
            var2 = var12.sizeY;
            var3 = var12.sizeX;
         }

         int var4 = (var2 >> 1) + this.x;
         int var5 = (var2 + 1 >> 1) + this.x;
         int var6 = (var3 >> 1) + this.y;
         int var7 = (var3 + 1 >> 1) + this.y;
         int[][] var8 = Tiles.Tiles_heights[this.plane];
         int var9 = var8[var4][var7] + var8[var4][var6] + var8[var5][var6] + var8[var5][var7] >> 2;
         int var10 = (this.x << 7) + (var2 << 6);
         int var11 = (this.y << 7) + (var3 << 6);
         return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)J",
      garbageValue = "1855948571"
   )
   public static long method2151(int var0) {
      if (var0 > 63) {
         throw new class374("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
      } else {
         return (long)Math.pow(2.0, (double)var0) - 1L;
      }
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)I",
      garbageValue = "-115"
   )
   @Export("stringCp1252NullTerminatedByteSize")
   public static int stringCp1252NullTerminatedByteSize(String var0) {
      return var0.length() + 1;
   }

   @ObfuscatedName("iy")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-2085867489"
   )
   @Export("doCheat")
   static final void doCheat(String var0) {
      if (var0.equalsIgnoreCase("toggleroof")) {
         class20.clientPreferences.method2448(!class20.clientPreferences.method2513());
         if (class20.clientPreferences.method2513()) {
            UserComparator5.addGameMessage(99, "", "Roofs are now all hidden");
         } else {
            UserComparator5.addGameMessage(99, "", "Roofs will only be removed selectively");
         }
      }

      if (var0.startsWith("zbuf")) {
         boolean var1 = PacketBufferNode.method5709(var0.substring(5).trim()) == 1;
         ScriptFrame.client.method531(var1);
         class314.method6147(var1);
      }

      if (var0.equalsIgnoreCase("z")) {
         Client.renderSelf = !Client.renderSelf;
      }

      if (var0.equalsIgnoreCase("displayfps")) {
         class20.clientPreferences.method2443();
      }

      if (var0.equalsIgnoreCase("renderself")) {
         Client.field614 = !Client.field614;
      }

      if (var0.equalsIgnoreCase("mouseovertext")) {
         Client.showMouseOverText = !Client.showMouseOverText;
      }

      if (Client.staffModLevel >= 2) {
         if (var0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
         }

         if (var0.equalsIgnoreCase("showcoord")) {
            class126.worldMap.showCoord = !class126.worldMap.showCoord;
         }

         if (var0.equalsIgnoreCase("fpson")) {
            class20.clientPreferences.method2483(true);
         }

         if (var0.equalsIgnoreCase("fpsoff")) {
            class20.clientPreferences.method2483(false);
         }

         if (var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if (var0.equalsIgnoreCase("clientdrop")) {
            class349.method6839();
         }
      }

      PacketBufferNode var2 = class330.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher);
      var2.packetBuffer.writeByte(var0.length() + 1);
      var2.packetBuffer.writeStringCp1252NullTerminated(var0);
      Client.packetWriter.addNode(var2);
   }

   @ObfuscatedName("lm")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "-16046"
   )
   static final int method2142() {
      return Client.menuOptionsCount - 1;
   }

   @ObfuscatedName("li")
   @ObfuscatedSignature(
      descriptor = "(Ldv;IIII)V",
      garbageValue = "1402248095"
   )
   @Export("addPlayerToMenu")
   static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
      if (MusicPatchNode.localPlayer != var0) {
         if (Client.menuOptionsCount < 400) {
            String var4;
            if (var0.skillLevel == 0) {
               var4 = var0.actions[0] + var0.username + var0.actions[1] + ItemContainer.method2243(var0.combatLevel, MusicPatchNode.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
            } else {
               var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
            }

            int var5;
            if (Client.isItemSelected == 1) {
               MenuAction.insertMenuItemNoShift("Use", Client.field496 + " " + "->" + " " + class383.colorStartTag(16777215) + var4, 14, var1, var2, var3);
            } else if (Client.isSpellSelected) {
               if ((SecureRandomFuture.selectedSpellFlags & 8) == 8) {
                  MenuAction.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class383.colorStartTag(16777215) + var4, 15, var1, var2, var3);
               }
            } else {
               for(var5 = 7; var5 >= 0; --var5) {
                  if (Client.playerMenuActions[var5] != null) {
                     short var6 = 0;
                     if (Client.playerMenuActions[var5].equalsIgnoreCase("Attack")) {
                        if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
                           continue;
                        }

                        if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > MusicPatchNode.localPlayer.combatLevel) {
                           var6 = 2000;
                        }

                        if (MusicPatchNode.localPlayer.team != 0 && var0.team != 0) {
                           if (var0.team == MusicPatchNode.localPlayer.team) {
                              var6 = 2000;
                           } else {
                              var6 = 0;
                           }
                        } else if (Client.playerAttackOption == AttackOption.field1307 && var0.isClanMember()) {
                           var6 = 2000;
                        }
                     } else if (Client.playerOptionsPriorities[var5]) {
                        var6 = 2000;
                     }

                     boolean var7 = false;
                     int var8 = Client.playerMenuOpcodes[var5] + var6;
                     MenuAction.insertMenuItemNoShift(Client.playerMenuActions[var5], class383.colorStartTag(16777215) + var4, var8, var1, var2, var3);
                  }
               }
            }

            for(var5 = 0; var5 < Client.menuOptionsCount; ++var5) {
               if (Client.menuOpcodes[var5] == 23) {
                  Client.menuTargets[var5] = class383.colorStartTag(16777215) + var4;
                  break;
               }
            }

         }
      }
   }

   @ObfuscatedName("nz")
   @ObfuscatedSignature(
      descriptor = "(Lmq;IIII)V",
      garbageValue = "759225225"
   )
   @Export("drawCompass")
   static final void drawCompass(Widget var0, int var1, int var2, int var3) {
      SpriteMask var4 = var0.getSpriteMask(false);
      if (var4 != null) {
         if (Client.minimapState < 3) {
            ChatChannel.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
         } else {
            Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
         }

      }
   }
}
