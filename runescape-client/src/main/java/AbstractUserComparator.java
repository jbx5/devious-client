import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
   @ObfuscatedName("f")
   @Export("nextComparator")
   Comparator nextComparator;

   protected AbstractUserComparator() {
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Comparator;I)V",
      garbageValue = "1217818029"
   )
   @Export("addComparator")
   final void addComparator(Comparator var1) {
      if (this.nextComparator == null) {
         this.nextComparator = var1;
      } else if (this.nextComparator instanceof AbstractUserComparator) {
         ((AbstractUserComparator)this.nextComparator).addComparator(var1);
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Loj;Loj;I)I",
      garbageValue = "-234814145"
   )
   @Export("compareUser")
   protected final int compareUser(User var1, User var2) {
      return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZB)I",
      garbageValue = "-32"
   )
   static int method7354(int var0, Script var1, boolean var2) {
      if (var0 < 1000) {
         return Canvas.method327(var0, var1, var2);
      } else if (var0 < 1100) {
         return class313.method6248(var0, var1, var2);
      } else if (var0 < 1200) {
         return class467.method8672(var0, var1, var2);
      } else if (var0 < 1300) {
         return class101.method2560(var0, var1, var2);
      } else if (var0 < 1400) {
         return ItemContainer.method2219(var0, var1, var2);
      } else if (var0 < 1500) {
         return class305.method6209(var0, var1, var2);
      } else if (var0 < 1600) {
         return GameObject.method4663(var0, var1, var2);
      } else if (var0 < 1700) {
         return class131.method2955(var0, var1, var2);
      } else if (var0 < 1800) {
         return class203.method4052(var0, var1, var2);
      } else if (var0 < 1900) {
         return class9.method76(var0, var1, var2);
      } else if (var0 < 2000) {
         return RouteStrategy.method4044(var0, var1, var2);
      } else if (var0 < 2100) {
         return class313.method6248(var0, var1, var2);
      } else if (var0 < 2200) {
         return class467.method8672(var0, var1, var2);
      } else if (var0 < 2300) {
         return class101.method2560(var0, var1, var2);
      } else if (var0 < 2400) {
         return ItemContainer.method2219(var0, var1, var2);
      } else if (var0 < 2500) {
         return class305.method6209(var0, var1, var2);
      } else if (var0 < 2600) {
         return Buddy.method7457(var0, var1, var2);
      } else if (var0 < 2700) {
         return ClientPreferences.method2471(var0, var1, var2);
      } else if (var0 < 2800) {
         return class13.method172(var0, var1, var2);
      } else if (var0 < 2900) {
         return ClanSettings.method3078(var0, var1, var2);
      } else if (var0 < 3000) {
         return RouteStrategy.method4044(var0, var1, var2);
      } else if (var0 < 3200) {
         return class273.method5374(var0, var1, var2);
      } else if (var0 < 3300) {
         return SequenceDefinition.method3890(var0, var1, var2);
      } else if (var0 < 3400) {
         return Frames.method4469(var0, var1, var2);
      } else if (var0 < 3500) {
         return class136.method2991(var0, var1, var2);
      } else if (var0 < 3600) {
         return WorldMapDecorationType.method6237(var0, var1, var2);
      } else if (var0 < 3700) {
         return class28.method412(var0, var1, var2);
      } else if (var0 < 3800) {
         return class7.method49(var0, var1, var2);
      } else if (var0 < 3900) {
         return class37.method711(var0, var1, var2);
      } else if (var0 < 4000) {
         return DirectByteArrayCopier.method6228(var0, var1, var2);
      } else if (var0 < 4100) {
         return Actor.method2332(var0, var1, var2);
      } else if (var0 < 4200) {
         return Actor.method2334(var0, var1, var2);
      } else if (var0 < 4300) {
         return class321.method6264(var0, var1, var2);
      } else if (var0 < 5100) {
         return PlayerCompositionColorTextureOverride.method3400(var0, var1, var2);
      } else if (var0 < 5400) {
         return class152.method3188(var0, var1, var2);
      } else if (var0 < 5600) {
         return UserComparator3.method2774(var0, var1, var2);
      } else if (var0 < 5700) {
         return class32.method477(var0, var1, var2);
      } else if (var0 < 6300) {
         return class273.method5380(var0, var1, var2);
      } else if (var0 < 6600) {
         return class86.method2250(var0, var1, var2);
      } else if (var0 < 6700) {
         return ModeWhere.method6595(var0, var1, var2);
      } else if (var0 < 6800) {
         return Message.method1161(var0, var1, var2);
      } else if (var0 < 6900) {
         return class121.method2823(var0, var1, var2);
      } else if (var0 < 7000) {
         return Client.method1243(var0, var1, var2);
      } else if (var0 < 7100) {
         return class9.method66(var0, var1, var2);
      } else if (var0 < 7200) {
         return GameBuild.method6255(var0, var1, var2);
      } else if (var0 < 7300) {
         return WorldMapData_1.method5020(var0, var1, var2);
      } else if (var0 < 7500) {
         return class131.method2956(var0, var1, var2);
      } else if (var0 < 7600) {
         return KeyHandler.method393(var0, var1, var2);
      } else {
         return var0 < 7700 ? WorldMapSprite.method5155(var0, var1, var2) : 2;
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Llg;Ljava/lang/String;Ljava/lang/String;I)Lry;",
      garbageValue = "76179728"
   )
   @Export("SpriteBuffer_getIndexedSpriteByName")
   public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
      int var3 = var0.getGroupId(var1);
      int var4 = var0.getFileId(var3, var2);
      byte[] var7 = var0.takeFile(var3, var4);
      boolean var6;
      if (var7 == null) {
         var6 = false;
      } else {
         class335.SpriteBuffer_decode(var7);
         var6 = true;
      }

      IndexedSprite var5;
      if (!var6) {
         var5 = null;
      } else {
         IndexedSprite var8 = new IndexedSprite();
         var8.width = class477.SpriteBuffer_spriteWidth;
         var8.height = class477.SpriteBuffer_spriteHeight;
         var8.xOffset = class451.SpriteBuffer_xOffsets[0];
         var8.yOffset = class319.SpriteBuffer_yOffsets[0];
         var8.subWidth = class450.SpriteBuffer_spriteWidths[0];
         var8.subHeight = class477.SpriteBuffer_spriteHeights[0];
         var8.palette = class477.SpriteBuffer_spritePalette;
         var8.pixels = class453.SpriteBuffer_pixels[0];
         class451.SpriteBuffer_xOffsets = null;
         class319.SpriteBuffer_yOffsets = null;
         class450.SpriteBuffer_spriteWidths = null;
         class477.SpriteBuffer_spriteHeights = null;
         class477.SpriteBuffer_spritePalette = null;
         class453.SpriteBuffer_pixels = null;
         var5 = var8;
      }

      return var5;
   }
}
