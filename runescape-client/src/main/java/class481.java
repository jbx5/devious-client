import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sm")
public class class481 {
   @ObfuscatedName("av")
   static final char[] field4937 = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
   @ObfuscatedName("as")
   static final char[] field4935 = new char[]{'[', ']', '#'};
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Ltj;"
   )
   @Export("titleboxSprite")
   static IndexedSprite titleboxSprite;

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "88"
   )
   public static int method8660(int var0) {
      return var0 >>> 4 & class496.field5000;
   }

   @ObfuscatedName("iq")
   @ObfuscatedSignature(
      descriptor = "(ZS)V",
      garbageValue = "-13162"
   )
   @Export("addNpcsToScene")
   static final void addNpcsToScene(boolean var0) {
      for(int var1 = 0; var1 < Client.npcCount; ++var1) {
         NPC var2 = Client.npcs[Client.npcIndices[var1]];
         if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
            int var3 = var2.x >> 7;
            int var4 = var2.y >> 7;
            if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
               if (var2.field1155 * -1321988096 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
                  if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
                     continue;
                  }

                  Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
               }

               long var5 = class394.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
               var2.playerCycle = Client.cycle;
               class36.scene.drawEntity(Clock.Client_plane, var2.x, var2.y, Renderable.getTileHeight(var2.field1155 * 1292107776 - 64 + var2.x, var2.field1155 * 1292107776 - 64 + var2.y, Clock.Client_plane), var2.field1155 * 1292107776 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
            }
         }
      }

   }
}
