import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class147 extends class151 {
   @ObfuscatedName("a")
   String field1687;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1495650379
   )
   int field1688;
   @ObfuscatedName("c")
   byte field1693;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   final class152 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lem;)V"
   )
   class147(class152 var1) {
      this.this$0 = var1;
      this.field1687 = null;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;B)V",
      garbageValue = "85"
   )
   void vmethod3238(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         var1.readLong();
      }

      this.field1687 = var1.readStringCp1252NullTerminatedOrNull();
      this.field1688 = var1.readUnsignedShort();
      this.field1693 = var1.readByte();
      var1.readLong();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Leq;I)V",
      garbageValue = "-1303116736"
   )
   void vmethod3239(ClanChannel var1) {
      ClanChannelMember var2 = new ClanChannelMember();
      var2.username = new Username(this.field1687);
      var2.world = this.field1688;
      var2.rank = this.field1693;
      var1.addMember(var2);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Llg;IIB)[Lry;",
      garbageValue = "34"
   )
   public static IndexedSprite[] method3146(AbstractArchive var0, int var1, int var2) {
      byte[] var4 = var0.takeFile(var1, var2);
      boolean var3;
      if (var4 == null) {
         var3 = false;
      } else {
         class335.SpriteBuffer_decode(var4);
         var3 = true;
      }

      if (!var3) {
         return null;
      } else {
         IndexedSprite[] var5 = new IndexedSprite[class477.SpriteBuffer_spriteCount];

         for(int var6 = 0; var6 < class477.SpriteBuffer_spriteCount; ++var6) {
            IndexedSprite var7 = var5[var6] = new IndexedSprite();
            var7.width = class477.SpriteBuffer_spriteWidth;
            var7.height = class477.SpriteBuffer_spriteHeight;
            var7.xOffset = class451.SpriteBuffer_xOffsets[var6];
            var7.yOffset = class319.SpriteBuffer_yOffsets[var6];
            var7.subWidth = class450.SpriteBuffer_spriteWidths[var6];
            var7.subHeight = class477.SpriteBuffer_spriteHeights[var6];
            var7.palette = class477.SpriteBuffer_spritePalette;
            var7.pixels = class453.SpriteBuffer_pixels[var6];
         }

         class451.SpriteBuffer_xOffsets = null;
         class319.SpriteBuffer_yOffsets = null;
         class450.SpriteBuffer_spriteWidths = null;
         class477.SpriteBuffer_spriteHeights = null;
         class477.SpriteBuffer_spritePalette = null;
         class453.SpriteBuffer_pixels = null;
         return var5;
      }
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "403120926"
   )
   @Export("runWidgetOnLoadListener")
   static void runWidgetOnLoadListener(int var0) {
      if (var0 != -1) {
         if (WorldMapManager.loadInterface(var0)) {
            Widget[] var1 = Widget.Widget_interfaceComponents[var0];

            for(int var2 = 0; var2 < var1.length; ++var2) {
               Widget var3 = var1[var2];
               if (var3.onLoad != null) {
                  ScriptEvent var4 = new ScriptEvent();
                  var4.widget = var3;
                  var4.args = var3.onLoad;
                  class103.runScript(var4, 5000000, 0);
               }
            }

         }
      }
   }

   @ObfuscatedName("fj")
   @ObfuscatedSignature(
      descriptor = "(B)J",
      garbageValue = "84"
   )
   static long method3141() {
      return Client.field489;
   }
}
