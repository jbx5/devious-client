import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("em")
public class class152 {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      longValue = 4468933996326418919L
   )
   long field1714;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      longValue = -5363108246206814043L
   )
   long field1717 = -1L;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lml;"
   )
   IterableNodeDeque field1716 = new IterableNodeDeque();

   @ObfuscatedSignature(
      descriptor = "(Lqr;)V"
   )
   public class152(Buffer var1) {
      this.method3187(var1);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "1930306578"
   )
   void method3187(Buffer var1) {
      this.field1714 = var1.readLong();
      this.field1717 = var1.readLong();

      for(int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
         Object var3;
         if (var2 == 1) {
            var3 = new class147(this);
         } else if (var2 == 4) {
            var3 = new class158(this);
         } else if (var2 == 3) {
            var3 = new class143(this);
         } else if (var2 == 2) {
            var3 = new class141(this);
         } else {
            if (var2 != 5) {
               throw new RuntimeException("");
            }

            var3 = new class148(this);
         }

         ((class151)var3).vmethod3238(var1);
         this.field1716.addFirst((Node)var3);
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Leq;I)V",
      garbageValue = "1696123227"
   )
   public void method3182(ClanChannel var1) {
      if (this.field1714 == var1.key && var1.field1729 == this.field1717) {
         for(class151 var2 = (class151)this.field1716.last(); var2 != null; var2 = (class151)this.field1716.previous()) {
            var2.vmethod3239(var1);
         }

         ++var1.field1729;
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(Lgm;I)Z",
      garbageValue = "-1888501189"
   )
   static boolean method3186(ObjectComposition var0) {
      if (var0.transforms != null) {
         int[] var1 = var0.transforms;

         for(int var2 = 0; var2 < var1.length; ++var2) {
            int var3 = var1[var2];
            ObjectComposition var4 = InterfaceParent.getObjectDefinition(var3);
            if (var4.mapIconId != -1) {
               return true;
            }
         }
      } else if (var0.mapIconId != -1) {
         return true;
      }

      return false;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "-1894804374"
   )
   static int method3188(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.GETWINDOWMODE) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class13.getWindowedMode();
         return 1;
      } else {
         int var3;
         if (var0 == ScriptOpcodes.SETWINDOWMODE) {
            var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            if (var3 == 1 || var3 == 2) {
               class167.setWindowedMode(var3);
            }

            return 1;
         } else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = BufferedSink.clientPreferences.method2401();
            return 1;
         } else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
            if (var0 == 5310) {
               --class379.Interpreter_intStackSize;
               return 1;
            } else {
               return 2;
            }
         } else {
            var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            if (var3 == 1 || var3 == 2) {
               BufferedSink.clientPreferences.method2453(var3);
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("gp")
   @ObfuscatedSignature(
      descriptor = "(Lkn;III)V",
      garbageValue = "-1599773392"
   )
   @Export("checkIfMinimapClicked")
   static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
      if (Client.minimapState == 0 || Client.minimapState == 3) {
         if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class82.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
            SpriteMask var3 = var0.getSpriteMask(true);
            if (var3 == null) {
               return;
            }

            int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
            int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
            if (var3.contains(var4, var5)) {
               var4 -= var3.width / 2;
               var5 -= var3.height / 2;
               int var6 = Client.camAngleY & 2047;
               int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
               int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
               int var9 = var4 * var8 + var7 * var5 >> 11;
               int var10 = var8 * var5 - var4 * var7 >> 11;
               int var11 = var9 + class296.localPlayer.x >> 7;
               int var12 = class296.localPlayer.y - var10 >> 7;
               PacketBufferNode var13 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3009, Client.packetWriter.isaacCipher);
               var13.packetBuffer.writeByte(18);
               var13.packetBuffer.writeShortAddLE(class158.baseY * 64 + var12);
               var13.packetBuffer.writeByteNeg(Client.field733.method3956(82) ? (Client.field733.method3956(81) ? 2 : 1) : 0);
               var13.packetBuffer.writeShortAdd(KeyHandler.baseX * 64 + var11);
               var13.packetBuffer.writeByte(var4);
               var13.packetBuffer.writeByte(var5);
               var13.packetBuffer.writeShort(Client.camAngleY);
               var13.packetBuffer.writeByte(57);
               var13.packetBuffer.writeByte(0);
               var13.packetBuffer.writeByte(0);
               var13.packetBuffer.writeByte(89);
               var13.packetBuffer.writeShort(class296.localPlayer.x);
               var13.packetBuffer.writeShort(class296.localPlayer.y);
               var13.packetBuffer.writeByte(63);
               Client.packetWriter.addNode(var13);
               Client.destinationX = var11;
               Client.destinationY = var12;
            }
         }

      }
   }
}
