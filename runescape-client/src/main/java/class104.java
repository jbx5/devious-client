import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
public class class104 {
   @ObfuscatedName("tb")
   @ObfuscatedGetter(
      intValue = 1403697419
   )
   static int field1398;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Ldh;"
   )
   static final class104 field1400 = new class104(0);
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ldh;"
   )
   static final class104 field1383 = new class104(1);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Ldh;"
   )
   static final class104 field1385 = new class104(2);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ldh;"
   )
   static final class104 field1386 = new class104(3);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Ldh;"
   )
   static final class104 field1391 = new class104(4);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Ldh;"
   )
   static final class104 field1388 = new class104(5);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ldh;"
   )
   static final class104 field1389 = new class104(6);
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Ldh;"
   )
   static final class104 field1390 = new class104(7);
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Ldh;"
   )
   static final class104 field1395 = new class104(8);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Ldh;"
   )
   static final class104 field1392 = new class104(9);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Ldh;"
   )
   static final class104 field1394 = new class104(10);
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "Ldh;"
   )
   static final class104 field1387 = new class104(11);
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Ldh;"
   )
   static final class104 field1393 = new class104(12);
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Ldh;"
   )
   static final class104 field1396 = new class104(13);
   @ObfuscatedName("ij")
   @Export("xteaKeys")
   static int[][] xteaKeys;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 2067595591
   )
   int field1397;

   class104(int var1) {
      this.field1397 = var1;
   }

   @ObfuscatedName("gn")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1882053186"
   )
   static void method2650() {
      Client.mouseLastLastPressedTimeMillis = 1L;
      class271.mouseRecorder.index = 0;
      PacketBuffer.hasFocus = true;
      Client.hadFocus = true;
      Client.field679 = -1L;
      class37.reflectionChecks = new IterableNodeDeque();
      Client.packetWriter.clearBuffer();
      Client.packetWriter.packetBuffer.offset = 0;
      Client.packetWriter.serverPacket = null;
      Client.packetWriter.field1431 = null;
      Client.packetWriter.field1432 = null;
      Client.packetWriter.field1433 = null;
      Client.packetWriter.serverPacketLength = 0;
      Client.packetWriter.field1420 = 0;
      Client.rebootTimer = 0;
      Client.logoutTimer = 0;
      Client.hintArrowType = 0;
      WorldMapSectionType.method5230();
      Player.method2333(0);
      class319.method6378();
      Client.isItemSelected = 0;
      Client.isSpellSelected = false;
      Client.soundEffectCount = 0;
      Client.camAngleY = 0;
      Client.oculusOrbState = 0;
      GameEngine.field241 = null;
      Client.minimapState = 0;
      Client.field619 = -1;
      Client.destinationX = 0;
      Client.destinationY = 0;
      Client.playerAttackOption = AttackOption.AttackOption_hidden;
      Client.npcAttackOption = AttackOption.AttackOption_hidden;
      Client.npcCount = 0;
      Language.method6695();

      int var0;
      for(var0 = 0; var0 < 2048; ++var0) {
         Client.players[var0] = null;
      }

      for(var0 = 0; var0 < 65536; ++var0) {
         Client.npcs[var0] = null;
      }

      Client.combatTargetPlayerIndex = -1;
      Client.projectiles.clear();
      Client.graphicsObjects.clear();

      for(var0 = 0; var0 < 4; ++var0) {
         for(int var4 = 0; var4 < 104; ++var4) {
            for(int var2 = 0; var2 < 104; ++var2) {
               Client.groundItems[var0][var4][var2] = null;
            }
         }
      }

      Client.pendingSpawns = new NodeDeque();
      DefaultsGroup.friendSystem.clear();

      for(var0 = 0; var0 < VarpDefinition.field1922; ++var0) {
         VarpDefinition var1 = class109.VarpDefinition_get(var0);
         if (var1 != null) {
            Varps.Varps_temp[var0] = 0;
            Varps.Varps_main[var0] = 0;
         }
      }

      WorldMapArea.varcs.clearTransient();
      Client.followerIndex = -1;
      if (Client.rootInterface != -1) {
         HitSplatDefinition.method3850(Client.rootInterface);
      }

      for(InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) {
         class9.closeInterface(var3, true);
      }

      Client.rootInterface = -1;
      Client.interfaceParents = new NodeHashTable(8);
      Client.meslayerContinueWidget = null;
      WorldMapSectionType.method5230();
      Client.playerAppearance.method5850((int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

      for(var0 = 0; var0 < 8; ++var0) {
         Client.playerMenuActions[var0] = null;
         Client.playerOptionsPriorities[var0] = false;
      }

      class32.method459();
      Client.isLoading = true;

      for(var0 = 0; var0 < 100; ++var0) {
         Client.field731[var0] = true;
      }

      PacketBufferNode var5 = class136.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
      var5.packetBuffer.writeByte(Message.getWindowedMode());
      var5.packetBuffer.writeShort(CollisionMap.canvasWidth);
      var5.packetBuffer.writeShort(Language.canvasHeight);
      Client.packetWriter.addNode(var5);
      class281.friendsChat = null;
      class20.guestClanSettings = null;
      Arrays.fill(Client.currentClanSettings, (Object)null);
      VarcInt.guestClanChannel = null;
      Arrays.fill(Client.currentClanChannels, (Object)null);

      for(var0 = 0; var0 < 8; ++var0) {
         Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
      }

      ItemContainer.grandExchangeEvents = null;
   }
}
