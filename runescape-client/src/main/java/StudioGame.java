import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lml;"
   )
   @Export("runescape")
   runescape("runescape", "RuneScape", 0),
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lml;"
   )
   @Export("stellardawn")
   stellardawn("stellardawn", "Stellar Dawn", 1),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lml;"
   )
   @Export("game3")
   game3("game3", "Game 3", 2),
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lml;"
   )
   @Export("game4")
   game4("game4", "Game 4", 3),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lml;"
   )
   @Export("game5")
   game5("game5", "Game 5", 4),
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lml;"
   )
   @Export("oldscape")
   oldscape("oldscape", "RuneScape 2007", 5);

   @ObfuscatedName("au")
   @Export("cacheSubPaths")
   static String[] cacheSubPaths;
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "Lsm;"
   )
   @Export("rasterProvider")
   public static AbstractRasterProvider rasterProvider;
   @ObfuscatedName("av")
   @Export("name")
   public final String name;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1753159705
   )
   @Export("id")
   final int id;

   StudioGame(String var3, String var4, int var5) {
      this.name = var3;
      this.id = var5;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1409646049"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("gg")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1154729139"
   )
   static void method6344() {
      Client.packetWriter.clearBuffer();
      Client.packetWriter.packetBuffer.offset = 0;
      Client.packetWriter.serverPacket = null;
      Client.packetWriter.field1388 = null;
      Client.packetWriter.field1389 = null;
      Client.packetWriter.field1390 = null;
      Client.packetWriter.serverPacketLength = 0;
      Client.packetWriter.field1383 = 0;
      Client.rebootTimer = 0;
      class60.method1159();
      Client.minimapState = 0;
      Client.destinationX = 0;

      int var0;
      for(var0 = 0; var0 < 2048; ++var0) {
         Client.players[var0] = null;
      }

      BuddyRankComparator.localPlayer = null;

      for(var0 = 0; var0 < Client.npcs.length; ++var0) {
         NPC var1 = Client.npcs[var0];
         if (var1 != null) {
            var1.targetIndex = -1;
            var1.false0 = false;
         }
      }

      class206.method4067();
      class19.updateGameState(30);

      for(var0 = 0; var0 < 100; ++var0) {
         Client.field722[var0] = true;
      }

      PacketBufferNode var2 = UserComparator9.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
      var2.packetBuffer.writeByte(class7.getWindowedMode());
      var2.packetBuffer.writeShort(GameEngine.canvasWidth);
      var2.packetBuffer.writeShort(class143.canvasHeight);
      Client.packetWriter.addNode(var2);
   }
}
