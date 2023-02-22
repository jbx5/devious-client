import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
public class class7 {
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -476501141
   )
   @Export("cacheGamebuild")
   static int cacheGamebuild;
   @ObfuscatedName("if")
   @ObfuscatedSignature(
      descriptor = "Loe;"
   )
   @Export("fontBold12")
   static Font fontBold12;
   @ObfuscatedName("qj")
   @ObfuscatedSignature(
      descriptor = "Lgc;"
   )
   @Export("mouseWheel")
   static class171 mouseWheel;
   @ObfuscatedName("aj")
   ExecutorService field24 = Executors.newSingleThreadExecutor();
   @ObfuscatedName("al")
   Future field19;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lsy;"
   )
   final Buffer field20;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lab;"
   )
   final class3 field21;

   @ObfuscatedSignature(
      descriptor = "(Lsy;Lab;)V"
   )
   public class7(Buffer var1, class3 var2) {
      this.field20 = var1;
      this.field21 = var2;
      this.method43();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-77"
   )
   public boolean method50() {
      return this.field19.isDone();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1656203797"
   )
   public void method48() {
      this.field24.shutdown();
      this.field24 = null;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)Lsy;",
      garbageValue = "2064289514"
   )
   public Buffer method39() {
      try {
         return (Buffer)this.field19.get();
      } catch (Exception var2) {
         return null;
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-493851559"
   )
   void method43() {
      this.field19 = this.field24.submit(new class1(this, this.field20, this.field21));
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "-724726161"
   )
   static String method53(int var0) {
      return "<img=" + var0 + ">";
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZB)I",
      garbageValue = "53"
   )
   static int method40(int var0, Script var1, boolean var2) {
      if (var0 < 1000) {
         return class199.method3795(var0, var1, var2);
      } else if (var0 < 1100) {
         return class422.method7922(var0, var1, var2);
      } else if (var0 < 1200) {
         return class325.method6326(var0, var1, var2);
      } else if (var0 < 1300) {
         return Tiles.method2194(var0, var1, var2);
      } else if (var0 < 1400) {
         return FriendsChat.method7509(var0, var1, var2);
      } else if (var0 < 1500) {
         return GrandExchangeOfferTotalQuantityComparator.method6546(var0, var1, var2);
      } else if (var0 < 1600) {
         return class319.method6301(var0, var1, var2);
      } else if (var0 < 1700) {
         return LoginPacket.method5473(var0, var1, var2);
      } else if (var0 < 1800) {
         return GrandExchangeOfferUnitPriceComparator.method6602(var0, var1, var2);
      } else if (var0 < 1900) {
         return SecureRandomCallable.method2229(var0, var1, var2);
      } else if (var0 < 2000) {
         return NetFileRequest.method6429(var0, var1, var2);
      } else if (var0 < 2100) {
         return class422.method7922(var0, var1, var2);
      } else if (var0 < 2200) {
         return class325.method6326(var0, var1, var2);
      } else if (var0 < 2300) {
         return Tiles.method2194(var0, var1, var2);
      } else if (var0 < 2400) {
         return FriendsChat.method7509(var0, var1, var2);
      } else if (var0 < 2500) {
         return GrandExchangeOfferTotalQuantityComparator.method6546(var0, var1, var2);
      } else if (var0 < 2600) {
         return class150.method3181(var0, var1, var2);
      } else if (var0 < 2700) {
         return class249.method5143(var0, var1, var2);
      } else if (var0 < 2800) {
         return SoundCache.method852(var0, var1, var2);
      } else if (var0 < 2900) {
         return FontName.method8261(var0, var1, var2);
      } else if (var0 < 3000) {
         return NetFileRequest.method6429(var0, var1, var2);
      } else if (var0 < 3200) {
         return ChatChannel.method2160(var0, var1, var2);
      } else if (var0 < 3300) {
         return Messages.method2762(var0, var1, var2);
      } else if (var0 < 3400) {
         return class103.method2670(var0, var1, var2);
      } else if (var0 < 3500) {
         return WorldMapScaleHandler.method5374(var0, var1, var2);
      } else if (var0 < 3600) {
         return MenuAction.method2053(var0, var1, var2);
      } else if (var0 < 3700) {
         return UserComparator9.method2876(var0, var1, var2);
      } else if (var0 < 3800) {
         return WorldMapEvent.method5376(var0, var1, var2);
      } else if (var0 < 3900) {
         return ReflectionCheck.method679(var0, var1, var2);
      } else if (var0 < 4000) {
         return Login.method2107(var0, var1, var2);
      } else if (var0 < 4100) {
         return ScriptFrame.method1152(var0, var1, var2);
      } else if (var0 < 4200) {
         return class351.method6636(var0, var1, var2);
      } else if (var0 < 4300) {
         return ItemLayer.method4161(var0, var1, var2);
      } else if (var0 < 5100) {
         return SoundSystem.method835(var0, var1, var2);
      } else if (var0 < 5400) {
         return class69.method2039(var0, var1, var2);
      } else if (var0 < 5600) {
         return class105.method2691(var0, var1, var2);
      } else if (var0 < 5700) {
         return class138.method3096(var0, var1, var2);
      } else if (var0 < 6300) {
         return WorldMapIcon_1.method4820(var0, var1, var2);
      } else if (var0 < 6600) {
         return Client.method1324(var0, var1, var2);
      } else if (var0 < 6700) {
         return FloorUnderlayDefinition.method3751(var0, var1, var2);
      } else if (var0 < 6800) {
         return NPC.method2597(var0, var1, var2);
      } else if (var0 < 6900) {
         return GrandExchangeOfferOwnWorldComparator.method1208(var0, var1, var2);
      } else if (var0 < 7000) {
         return ScriptFrame.method1154(var0, var1, var2);
      } else if (var0 < 7100) {
         return NPCComposition.method3713(var0, var1, var2);
      } else if (var0 < 7200) {
         return class388.method7348(var0, var1, var2);
      } else if (var0 < 7300) {
         return WorldMapIcon_0.method5159(var0, var1, var2);
      } else if (var0 < 7500) {
         return class14.method175(var0, var1, var2);
      } else if (var0 < 7600) {
         return class159.method3324(var0, var1, var2);
      } else {
         return var0 < 7700 ? class249.method5142(var0, var1, var2) : 2;
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "16"
   )
   static final void method52() {
      Tiles.method2216("You can't add yourself to your own friend list");
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)Lsn;",
      garbageValue = "-1526467553"
   )
   static SpritePixels method55() {
      SpritePixels var0 = new SpritePixels();
      var0.width = class492.SpriteBuffer_spriteWidth;
      var0.height = class492.SpriteBuffer_spriteHeight;
      var0.xOffset = class492.SpriteBuffer_xOffsets[0];
      var0.yOffset = Canvas.SpriteBuffer_yOffsets[0];
      var0.subWidth = InterfaceParent.SpriteBuffer_spriteWidths[0];
      var0.subHeight = class144.SpriteBuffer_spriteHeights[0];
      int var1 = var0.subHeight * var0.subWidth;
      byte[] var2 = class144.SpriteBuffer_pixels[0];
      var0.pixels = new int[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var0.pixels[var3] = class181.SpriteBuffer_spritePalette[var2[var3] & 255];
      }

      FriendsList.method7473();
      return var0;
   }

   @ObfuscatedName("hh")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-21"
   )
   @Export("getWindowedMode")
   static int getWindowedMode() {
      return Client.isResizable ? 2 : 1;
   }

   @ObfuscatedName("la")
   static final void method54(double var0) {
      Rasterizer3D.Rasterizer3D_setBrightness(var0);
      ((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0);
      TaskHandler.method3446();
      WorldMapSectionType.clientPreferences.method2522(var0);
   }
}
