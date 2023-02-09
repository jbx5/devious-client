import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public class class275 {
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Lrs;"
   )
   @Export("rightTitleSprite")
   static SpritePixels rightTitleSprite;

   @ObfuscatedName("gq")
   @ObfuscatedSignature(
      descriptor = "(IIIB)V",
      garbageValue = "124"
   )
   @Export("queueSoundEffect")
   static void queueSoundEffect(int var0, int var1, int var2) {
      if (PacketWriter.clientPreferences.method2497() != 0 && var1 != 0 && Client.soundEffectCount < 50) {
         Client.soundEffectIds[Client.soundEffectCount] = var0;
         Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
         Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
         Client.soundEffects[Client.soundEffectCount] = null;
         Client.soundLocations[Client.soundEffectCount] = 0;
         ++Client.soundEffectCount;
      }

   }

   @ObfuscatedName("gh")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "1888348445"
   )
   static final void method5532(int var0, int var1, int var2) {
      if (ClanSettings.cameraX < var0) {
         ClanSettings.cameraX = (var0 - ClanSettings.cameraX) * UserComparator7.field1444 / 1000 + ClanSettings.cameraX + ModeWhere.field4340;
         if (ClanSettings.cameraX > var0) {
            ClanSettings.cameraX = var0;
         }
      }

      if (ClanSettings.cameraX > var0) {
         ClanSettings.cameraX -= (ClanSettings.cameraX - var0) * UserComparator7.field1444 / 1000 + ModeWhere.field4340;
         if (ClanSettings.cameraX < var0) {
            ClanSettings.cameraX = var0;
         }
      }

      if (UserComparator10.cameraY < var1) {
         UserComparator10.cameraY = (var1 - UserComparator10.cameraY) * UserComparator7.field1444 / 1000 + UserComparator10.cameraY + ModeWhere.field4340;
         if (UserComparator10.cameraY > var1) {
            UserComparator10.cameraY = var1;
         }
      }

      if (UserComparator10.cameraY > var1) {
         UserComparator10.cameraY -= (UserComparator10.cameraY - var1) * UserComparator7.field1444 / 1000 + ModeWhere.field4340;
         if (UserComparator10.cameraY < var1) {
            UserComparator10.cameraY = var1;
         }
      }

      if (class366.cameraZ < var2) {
         class366.cameraZ = (var2 - class366.cameraZ) * UserComparator7.field1444 / 1000 + class366.cameraZ + ModeWhere.field4340;
         if (class366.cameraZ > var2) {
            class366.cameraZ = var2;
         }
      }

      if (class366.cameraZ > var2) {
         class366.cameraZ -= (class366.cameraZ - var2) * UserComparator7.field1444 / 1000 + ModeWhere.field4340;
         if (class366.cameraZ < var2) {
            class366.cameraZ = var2;
         }
      }

   }

   @ObfuscatedName("in")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "117"
   )
   static void method5531(int var0, int var1) {
      int var2 = class19.fontBold12.stringWidth("Choose Option");

      int var3;
      int var4;
      for(var3 = 0; var3 < Client.menuOptionsCount; ++var3) {
         var4 = class19.fontBold12.stringWidth(TriBool.method7753(var3));
         if (var4 > var2) {
            var2 = var4;
         }
      }

      var2 += 8;
      var3 = Client.menuOptionsCount * 15 + 22;
      var4 = var0 - var2 / 2;
      if (var4 + var2 > GameEngine.canvasWidth) {
         var4 = GameEngine.canvasWidth - var2;
      }

      if (var4 < 0) {
         var4 = 0;
      }

      int var5 = var1;
      if (var1 + var3 > class127.canvasHeight) {
         var5 = class127.canvasHeight - var3;
      }

      if (var5 < 0) {
         var5 = 0;
      }

      class130.menuX = var4;
      ModeWhere.menuY = var5;
      class7.menuWidth = var2;
      PlayerType.menuHeight = Client.menuOptionsCount * 15 + 22;
   }
}
