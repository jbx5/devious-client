import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   static AbstractArchive field1985;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("HealthBarDefinition_cached")
   static EvictingDualNodeHashTable HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("HealthBarDefinition_cachedSprites")
   static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 340088571
   )
   public int field1982;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 610863041
   )
   @Export("int1")
   public int int1 = 255;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 485061889
   )
   @Export("int2")
   public int int2 = 255;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1538861117
   )
   @Export("int3")
   public int int3 = -1;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1759495171
   )
   public int field1984 = 1;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -496661429
   )
   @Export("int5")
   public int int5 = 70;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -515352613
   )
   @Export("frontSpriteID")
   int frontSpriteID = -1;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -697159111
   )
   @Export("backSpriteID")
   int backSpriteID = -1;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 742840403
   )
   @Export("width")
   public int width = 30;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 2118917585
   )
   @Export("widthPadding")
   public int widthPadding = 0;

   HealthBarDefinition() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "-2019372676"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lrd;II)V",
      garbageValue = "655885225"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         var1.readUnsignedShort();
      } else if (var2 == 2) {
         this.int1 = var1.readUnsignedByte();
      } else if (var2 == 3) {
         this.int2 = var1.readUnsignedByte();
      } else if (var2 == 4) {
         this.int3 = 0;
      } else if (var2 == 5) {
         this.int5 = var1.readUnsignedShort();
      } else if (var2 == 6) {
         var1.readUnsignedByte();
      } else if (var2 == 7) {
         this.frontSpriteID = var1.readNullableLargeSmart();
      } else if (var2 == 8) {
         this.backSpriteID = var1.readNullableLargeSmart();
      } else if (var2 == 11) {
         this.int3 = var1.readUnsignedShort();
      } else if (var2 == 14) {
         this.width = var1.readUnsignedByte();
      } else if (var2 == 15) {
         this.widthPadding = var1.readUnsignedByte();
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)Lrs;",
      garbageValue = "-350000117"
   )
   @Export("getFrontSprite")
   public SpritePixels getFrontSprite() {
      if (this.frontSpriteID < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
         if (var1 != null) {
            return var1;
         } else {
            var1 = BZip2State.SpriteBuffer_getSprite(field1985, this.frontSpriteID, 0);
            if (var1 != null) {
               HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)Lrs;",
      garbageValue = "-1607255134"
   )
   @Export("getBackSprite")
   public SpritePixels getBackSprite() {
      if (this.backSpriteID < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
         if (var1 != null) {
            return var1;
         } else {
            var1 = BZip2State.SpriteBuffer_getSprite(field1985, this.backSpriteID, 0);
            if (var1 != null) {
               HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("ff")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "75"
   )
   @Export("logOut")
   static final void logOut() {
      Client.packetWriter.close();
      WorldMapElement.method3612();
      FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
      class134.method3124();
      ObjectComposition.ObjectDefinition_cached.clear();
      ObjectComposition.ObjectDefinition_cachedModelData.clear();
      ObjectComposition.ObjectDefinition_cachedEntities.clear();
      ObjectComposition.ObjectDefinition_cachedModels.clear();
      class168.method3488();
      TaskHandler.method3475();
      ObjectSound.method1920();
      SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
      SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
      WorldMapDecorationType.method6425();
      FaceNormal.method4641();
      class491.HitSplatDefinition_cachedSprites.method8463();
      class208.HitSplatDefinition_cached.method8463();
      HitSplatDefinition.HitSplatDefinition_cached.clear();
      HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
      HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
      class31.method460();
      UrlRequest.method2891();
      ParamComposition.ParamDefinition_cached.clear();
      class85.method2339();
      DbTableType.DBTableType_cache.clear();
      DbRowType.DBRowType_cache.clear();
      Client.DBTableIndex_cache.clear();
      Client.DBTableMasterIndex_cache.clear();
      VertexNormal.method4843();
      Widget.Widget_cachedSprites.clear();
      Widget.Widget_cachedModels.clear();
      Widget.Widget_cachedFonts.clear();
      Widget.Widget_cachedSpriteMasks.clear();
      ((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear();
      Script.Script_cached.clear();
      Client.archive5.method7487();
      class13.field70.clearFiles();
      FriendsChat.archive7.clearFiles();
      class144.archive4.clearFiles();
      DynamicObject.field1001.clearFiles();
      NetCache.archive9.clearFiles();
      class153.archive6.clearFiles();
      class151.archive11.clearFiles();
      WorldMapEvent.archive8.clearFiles();
      class148.field1704.clearFiles();
      ApproximateRouteStrategy.archive10.clearFiles();
      MusicPatchNode.field3448.clearFiles();
      class12.archive12.clearFiles();
      Canvas.field132.clearFiles();
      WorldMapAreaData.scene.clear();

      for(int var0 = 0; var0 < 4; ++var0) {
         Client.collisionMaps[var0].clear();
      }

      Client.field752.method4097();
      System.gc();
      class28.method430(2);
      Client.currentTrackGroupId = -1;
      Client.playingJingle = false;
      UserComparator4.method2902();
      class246.updateGameState(10);
   }
}
