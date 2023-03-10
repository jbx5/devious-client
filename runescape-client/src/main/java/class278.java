import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
public class class278 {
   @ObfuscatedName("gq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1680827583"
   )
   @Export("logOut")
   static final void logOut() {
      Client.packetWriter.close();
      FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
      FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
      class27.method419();
      MusicPatchNode.method5741();
      NPCComposition.NpcDefinition_cached.clear();
      NPCComposition.NpcDefinition_cachedModels.clear();
      ItemComposition.ItemDefinition_cached.clear();
      ItemComposition.ItemDefinition_cachedModels.clear();
      ItemComposition.ItemDefinition_cachedSprites.clear();
      SequenceDefinition.SequenceDefinition_cached.clear();
      SequenceDefinition.SequenceDefinition_cachedFrames.clear();
      SequenceDefinition.SequenceDefinition_cachedModel.clear();
      class155.method3293();
      class162.method3349();
      VarpDefinition.VarpDefinition_cached.clear();
      KitDefinition.HitSplatDefinition_cachedSprites.method8423();
      Messages.HitSplatDefinition_cached.method8423();
      HitSplatDefinition.HitSplatDefinition_cached.clear();
      HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
      HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
      HealthBarDefinition.HealthBarDefinition_cached.clear();
      HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
      UserComparator4.method2841();
      UrlRequest.method2834();
      WorldMapElement.WorldMapElement_cachedSprites.clear();
      DbTableType.DBTableType_cache.clear();
      DbRowType.DBRowType_cache.clear();
      Client.DBTableIndex_cache.clear();
      Client.DBTableMasterIndex_cache.clear();
      PlayerComposition.PlayerAppearance_cachedModels.clear();
      Widget.Widget_cachedSprites.clear();
      Widget.Widget_cachedModels.clear();
      Widget.Widget_cachedFonts.clear();
      Widget.Widget_cachedSpriteMasks.clear();
      ((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear();
      Script.Script_cached.clear();
      Client.archive5.method7417();
      UserComparator5.field1419.clearFiles();
      class290.archive7.clearFiles();
      class135.archive4.clearFiles();
      class175.field1841.clearFiles();
      ClientPreferences.archive9.clearFiles();
      class308.archive6.clearFiles();
      Clock.archive11.clearFiles();
      class143.archive8.clearFiles();
      class20.field113.clearFiles();
      AABB.archive10.clearFiles();
      class36.field239.clearFiles();
      class167.archive12.clearFiles();
      class320.field3708.clearFiles();
      class1.scene.clear();

      for(int var0 = 0; var0 < 4; ++var0) {
         Client.collisionMaps[var0].clear();
      }

      Client.field713.method4070();
      System.gc();
      class293.musicPlayerStatus = 1;
      class364.musicTrackArchive = null;
      IntHashTable.musicTrackGroupId = -1;
      class293.musicTrackFileId = -1;
      class368.musicTrackVolume = 0;
      class293.musicTrackBoolean = false;
      AbstractRasterProvider.pcmSampleLength = 2;
      Client.currentTrackGroupId = -1;
      Client.playingJingle = false;
      class389.method7353();
      class19.updateGameState(10);
   }

   @ObfuscatedName("hw")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-2107824411"
   )
   static final void method5449(int var0, int var1) {
      if (var0 < 128) {
         var0 = 128;
      }

      if (var0 > 383) {
         var0 = 383;
      }

      if (class311.cameraPitch < var0) {
         class311.cameraPitch = (var0 - class311.cameraPitch) * Skeleton.field2505 / 1000 + class311.cameraPitch + GrandExchangeOfferUnitPriceComparator.field4269;
         if (class311.cameraPitch > var0) {
            class311.cameraPitch = var0;
         }
      }

      if (class311.cameraPitch > var0) {
         class311.cameraPitch -= (class311.cameraPitch - var0) * Skeleton.field2505 / 1000 + GrandExchangeOfferUnitPriceComparator.field4269;
         if (class311.cameraPitch < var0) {
            class311.cameraPitch = var0;
         }
      }

      int var2 = var1 - class110.cameraYaw;
      if (var2 > 1024) {
         var2 -= 2048;
      }

      if (var2 < -1024) {
         var2 += 2048;
      }

      if (var2 > 0) {
         class110.cameraYaw = class110.cameraYaw + GrandExchangeOfferUnitPriceComparator.field4269 + var2 * Skeleton.field2505 / 1000;
         class110.cameraYaw &= 2047;
      }

      if (var2 < 0) {
         class110.cameraYaw -= -var2 * Skeleton.field2505 / 1000 + GrandExchangeOfferUnitPriceComparator.field4269;
         class110.cameraYaw &= 2047;
      }

      int var3 = var1 - class110.cameraYaw;
      if (var3 > 1024) {
         var3 -= 2048;
      }

      if (var3 < -1024) {
         var3 += 2048;
      }

      if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
         class110.cameraYaw = var1;
      }

   }

   @ObfuscatedName("kz")
   @ObfuscatedSignature(
      descriptor = "([Lmy;Lmy;ZB)V",
      garbageValue = "17"
   )
   @Export("revalidateWidgetScroll")
   static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
      int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width;
      int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height;
      Script.resizeInterface(var0, var1.id, var3, var4, var2);
      if (var1.children != null) {
         Script.resizeInterface(var1.children, var1.id, var3, var4, var2);
      }

      InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
      if (var5 != null) {
         int var6 = var5.group;
         if (GrandExchangeEvent.loadInterface(var6)) {
            Script.resizeInterface(class155.Widget_interfaceComponents[var6], -1, var3, var4, var2);
         }
      }

      if (var1.contentType == 1337) {
      }

   }
}
