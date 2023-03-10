import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
public final class class395 implements Comparable {
   @ObfuscatedName("aj")
   Object field4491;
   @ObfuscatedName("al")
   Object field4489;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      longValue = -1933173505781394141L
   )
   long field4488;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      longValue = 5893522670368200607L
   )
   long field4490;

   class395(Object var1, Object var2) {
      this.field4491 = var1;
      this.field4489 = var2;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lpn;B)I",
      garbageValue = "119"
   )
   int method7431(class395 var1) {
      if (this.field4490 < var1.field4490) {
         return -1;
      } else {
         return this.field4490 > var1.field4490 ? 1 : 0;
      }
   }

   public int compareTo(Object var1) {
      return this.method7431((class395)var1);
   }

   public int hashCode() {
      return this.field4489.hashCode();
   }

   public boolean equals(Object var1) {
      if (var1 instanceof class395) {
         return this.field4489.equals(((class395)var1).field4489);
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IB)Lhv;",
      garbageValue = "120"
   )
   @Export("KitDefinition_get")
   public static KitDefinition KitDefinition_get(int var0) {
      KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = GrandExchangeOfferTotalQuantityComparator.KitDefinition_archive.takeFile(3, var0);
         var1 = new KitDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         KitDefinition.KitDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("gx")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "35"
   )
   static void method7439() {
      Client.mouseLastLastPressedTimeMillis = 1L;
      class212.mouseRecorder.index = 0;
      Varps.hasFocus = true;
      Client.hadFocus = true;
      Client.field622 = -1L;
      class36.reflectionChecks = new IterableNodeDeque();
      Client.packetWriter.clearBuffer();
      Client.packetWriter.packetBuffer.offset = 0;
      Client.packetWriter.serverPacket = null;
      Client.packetWriter.field1388 = null;
      Client.packetWriter.field1389 = null;
      Client.packetWriter.field1390 = null;
      Client.packetWriter.serverPacketLength = 0;
      Client.packetWriter.field1383 = 0;
      Client.rebootTimer = 0;
      Client.logoutTimer = 0;
      Client.hintArrowType = 0;
      class60.method1159();
      MouseHandler.MouseHandler_idleCycles = 0;
      class133.method3039();
      Client.isItemSelected = 0;
      Client.isSpellSelected = false;
      Client.soundEffectCount = 0;
      Client.camAngleY = 0;
      Client.oculusOrbState = 0;
      Language.field4294 = null;
      Client.minimapState = 0;
      Client.field720 = -1;
      Client.destinationX = 0;
      Client.destinationY = 0;
      Client.playerAttackOption = AttackOption.AttackOption_hidden;
      Client.npcAttackOption = AttackOption.AttackOption_hidden;
      Client.npcCount = 0;
      DefaultsGroup.method7760();

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
      class6.friendSystem.clear();

      for(var0 = 0; var0 < VarpDefinition.field1890; ++var0) {
         VarpDefinition var1 = GameEngine.VarpDefinition_get(var0);
         if (var1 != null) {
            Varps.Varps_temp[var0] = 0;
            Varps.Varps_main[var0] = 0;
         }
      }

      class248.varcs.clearTransient();
      Client.followerIndex = -1;
      if (Client.rootInterface != -1) {
         class289.method5486(Client.rootInterface);
      }

      for(InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) {
         class17.closeInterface(var3, true);
      }

      Client.rootInterface = -1;
      Client.interfaceParents = new NodeHashTable(8);
      Client.meslayerContinueWidget = null;
      class60.method1159();
      Client.playerAppearance.method5784((int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

      for(var0 = 0; var0 < 8; ++var0) {
         Client.playerMenuActions[var0] = null;
         Client.playerOptionsPriorities[var0] = false;
      }

      class206.method4067();
      Client.isLoading = true;

      for(var0 = 0; var0 < 100; ++var0) {
         Client.field722[var0] = true;
      }

      PacketBufferNode var5 = UserComparator9.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
      var5.packetBuffer.writeByte(class7.getWindowedMode());
      var5.packetBuffer.writeShort(GameEngine.canvasWidth);
      var5.packetBuffer.writeShort(class143.canvasHeight);
      Client.packetWriter.addNode(var5);
      ReflectionCheck.friendsChat = null;
      WorldMapCacheName.guestClanSettings = null;
      Arrays.fill(Client.currentClanSettings, (Object)null);
      class19.guestClanChannel = null;
      Arrays.fill(Client.currentClanChannels, (Object)null);

      for(var0 = 0; var0 < 8; ++var0) {
         Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
      }

      Projectile.grandExchangeEvents = null;
   }
}
