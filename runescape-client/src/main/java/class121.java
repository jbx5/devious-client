import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("em")
public class class121 {
   @ObfuscatedName("ac")
   public static final float field1462 = Math.ulp(1.0F);
   @ObfuscatedName("au")
   public static final float field1463;
   @ObfuscatedName("ab")
   static float[] field1468;
   @ObfuscatedName("aq")
   static float[] field1465;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Ldp;"
   )
   @Export("loginScreenRunesAnimation")
   static LoginScreenAnimation loginScreenRunesAnimation;
   @ObfuscatedName("gv")
   static String field1471;

   static {
      field1463 = field1462 * 2.0F;
      field1468 = new float[4];
      field1465 = new float[5];
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(B)[Lec;",
      garbageValue = "127"
   )
   static class127[] method2989() {
      return new class127[]{class127.field1545, class127.field1547, class127.field1546, class127.field1544, class127.field1566, class127.field1560, class127.field1550, class127.field1551, class127.field1552, class127.field1553, class127.field1554, class127.field1548, class127.field1556, class127.field1549, class127.field1555, class127.field1559, class127.field1558};
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)[Ldk;",
      garbageValue = "1978895221"
   )
   static class85[] method2991() {
      return new class85[]{class85.field1064, class85.field1072, class85.field1067, class85.field1070, class85.field1065};
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZB)I",
      garbageValue = "-1"
   )
   static int method2977(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = class165.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
      } else {
         var3 = var2 ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
      }

      String var4 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
      int[] var5 = null;
      if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
         int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         if (var6 > 0) {
            for(var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]) {
            }
         }

         var4 = var4.substring(0, var4.length() - 1);
      }

      Object[] var9 = new Object[var4.length() + 1];

      int var7;
      for(var7 = var9.length - 1; var7 >= 1; --var7) {
         if (var4.charAt(var7 - 1) == 's') {
            var9[var7] = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
         } else {
            var9[var7] = new Integer(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         }
      }

      var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
      if (var7 != -1) {
         var9[0] = new Integer(var7);
      } else {
         var9 = null;
      }

      if (var0 == ScriptOpcodes.CC_SETONCLICK) {
         var3.onClick = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
         var3.onHold = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
         var3.onRelease = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
         var3.onMouseOver = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
         var3.onMouseLeave = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
         var3.onDrag = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
         var3.onTargetLeave = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
         var3.onVarTransmit = var9;
         var3.varTransmitTriggers = var5;
      } else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
         var3.onTimer = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONOP) {
         var3.onOp = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
         var3.onDragComplete = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
         var3.onClickRepeat = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
         var3.onMouseRepeat = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
         var3.onInvTransmit = var9;
         var3.invTransmitTriggers = var5;
      } else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
         var3.onStatTransmit = var9;
         var3.statTransmitTriggers = var5;
      } else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
         var3.onTargetEnter = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
         var3.onScroll = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
         var3.onChatTransmit = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONKEY) {
         var3.onKey = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
         var3.onFriendTransmit = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
         var3.onClanTransmit = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
         var3.onMiscTransmit = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
         var3.onDialogAbort = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
         var3.onSubChange = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
         var3.onStockTransmit = var9;
      } else if (var0 == 1426) {
         var3.field3692 = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
         var3.onResize = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
         var3.field3637 = var9;
      } else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
         var3.field3566 = var9;
      } else if (var0 == 1430) {
         var3.field3681 = var9;
      } else if (var0 == 1431) {
         var3.field3582 = var9;
      } else if (var0 == 1434) {
         var3.field3653 = var9;
      } else if (var0 == 1435) {
         var3.field3677 = var9;
      } else {
         if (var0 < 1436 || var0 > 1439) {
            return 2;
         }

         class312 var8 = var3.method6395();
         if (var8 != null) {
            if (var0 == 1436) {
               var8.field3500 = var9;
            } else if (var0 == 1437) {
               var8.field3505 = var9;
            } else if (var0 == 1438) {
               var8.field3504 = var9;
            } else if (var0 == 1439) {
               var8.field3503 = var9;
            }
         }
      }

      var3.hasListener = true;
      return 1;
   }

   @ObfuscatedName("hh")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "15"
   )
   static void method2993() {
      Client.packetWriter.clearBuffer();
      Client.packetWriter.packetBuffer.offset = 0;
      Client.packetWriter.serverPacket = null;
      Client.packetWriter.field1391 = null;
      Client.packetWriter.field1392 = null;
      Client.packetWriter.field1386 = null;
      Client.packetWriter.serverPacketLength = 0;
      Client.packetWriter.field1389 = 0;
      Client.rebootTimer = 0;
      Client.menuOptionsCount = 0;
      Client.isMenuOpen = false;
      Client.minimapState = 0;
      Client.destinationX = 0;

      int var0;
      for(var0 = 0; var0 < 2048; ++var0) {
         Client.players[var0] = null;
      }

      MusicPatchNode.localPlayer = null;

      for(var0 = 0; var0 < Client.npcs.length; ++var0) {
         NPC var1 = Client.npcs[var0];
         if (var1 != null) {
            var1.targetIndex = -1;
            var1.false0 = false;
         }
      }

      ItemContainer.itemContainers = new NodeHashTable(32);
      class138.updateGameState(30);

      for(var0 = 0; var0 < 100; ++var0) {
         Client.field705[var0] = true;
      }

      class1.method11();
   }

   @ObfuscatedName("kd")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1957371418"
   )
   @Export("updateItemPile")
   static final void updateItemPile(int var0, int var1) {
      NodeDeque var2 = Client.groundItems[GameEngine.Client_plane][var0][var1];
      if (var2 == null) {
         class31.scene.removeGroundItemPile(GameEngine.Client_plane, var0, var1);
      } else {
         long var3 = -99999999L;
         TileItem var5 = null;

         TileItem var6;
         for(var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
            ItemComposition var7 = HealthBarUpdate.ItemDefinition_get(var6.id);
            long var11 = (long)var7.price;
            if (var7.isStackable == 1) {
               var11 *= var6.quantity < Integer.MAX_VALUE ? (long)(var6.quantity + 1) : (long)var6.quantity;
            }

            if (var11 > var3) {
               var3 = var11;
               var5 = var6;
            }
         }

         if (var5 == null) {
            class31.scene.removeGroundItemPile(GameEngine.Client_plane, var0, var1);
         } else {
            var2.addLast(var5);
            TileItem var13 = null;
            TileItem var8 = null;

            for(var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
               if (var5.id != var6.id) {
                  if (var13 == null) {
                     var13 = var6;
                  }

                  if (var13.id != var6.id && var8 == null) {
                     var8 = var6;
                  }
               }
            }

            long var9 = FaceNormal.calculateTag(var0, var1, 3, false, 0);
            class31.scene.newGroundItemPile(GameEngine.Client_plane, var0, var1, class147.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, GameEngine.Client_plane), var5, var9, var13, var8);
         }
      }
   }

   @ObfuscatedName("lp")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lmq;S)Ljava/lang/String;",
      garbageValue = "-1115"
   )
   static String method2979(String var0, Widget var1) {
      if (var0.indexOf("%") != -1) {
         for(int var2 = 1; var2 <= 5; ++var2) {
            while(true) {
               int var3 = var0.indexOf("%" + var2);
               if (var3 == -1) {
                  break;
               }

               String var4 = var0.substring(0, var3);
               int var6 = ArchiveLoader.method2230(var1, var2 - 1);
               String var5;
               if (var6 < 999999999) {
                  var5 = Integer.toString(var6);
               } else {
                  var5 = "*";
               }

               var0 = var4 + var5 + var0.substring(var3 + 2);
            }
         }
      }

      return var0;
   }
}
