import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("ParamDefinition_archive")
   public static AbstractArchive ParamDefinition_archive;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("ParamDefinition_cached")
   public static EvictingDualNodeHashTable ParamDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("hh")
   @ObfuscatedGetter(
      intValue = -1984383565
   )
   @Export("baseX")
   static int baseX;
   @ObfuscatedName("v")
   @Export("type")
   char type;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1399796535
   )
   @Export("defaultInt")
   public int defaultInt;
   @ObfuscatedName("z")
   @Export("defaultStr")
   public String defaultStr;
   @ObfuscatedName("j")
   @Export("autoDisable")
   boolean autoDisable = true;

   ParamComposition() {
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-406747783"
   )
   @Export("postDecode")
   void postDecode() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "-540226117"
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
      descriptor = "(Lrd;IB)V",
      garbageValue = "76"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         byte var4 = var1.readByte();
         int var5 = var4 & 255;
         if (var5 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var5, 16));
         }

         if (var5 >= 128 && var5 < 160) {
            char var6 = class362.cp1252AsciiExtension[var5 - 128];
            if (var6 == 0) {
               var6 = '?';
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.type = var3;
      } else if (var2 == 2) {
         this.defaultInt = var1.readInt();
      } else if (var2 == 4) {
         this.autoDisable = false;
      } else if (var2 == 5) {
         this.defaultStr = var1.readStringCp1252NullTerminated();
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "1"
   )
   @Export("isString")
   public boolean isString() {
      return this.type == 's';
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIII)J",
      garbageValue = "2043821642"
   )
   static long method3840(int var0, int var1, int var2) {
      return (long)(var2 << 16 | var0 << 8 | var1);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(IZI)Ljava/lang/String;",
      garbageValue = "836612090"
   )
   @Export("intToString")
   public static String intToString(int var0, boolean var1) {
      return var1 && var0 >= 0 ? BuddyRankComparator.method2965(var0, 10, var1) : Integer.toString(var0);
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1155689918"
   )
   public static String method3842(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if (var3 == 0) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            var5 = class302.method5863(var5);
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if (var5 != '.' && var5 != '?' && var5 != '!') {
            if (Character.isSpaceChar(var5)) {
               if (var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }

   @ObfuscatedName("jx")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)V",
      garbageValue = "-366230260"
   )
   @Export("drawScrollBar")
   static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
      InvDefinition.scrollBarSprites[0].drawAt(var0, var1);
      InvDefinition.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field575);
      int var5 = var3 * (var3 - 32) / var4;
      if (var5 < 8) {
         var5 = 8;
      }

      int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field576);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field636);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field636);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field636);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field636);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field656);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field656);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var5 + var1 + 15, 16, Client.field656);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field656);
   }
}
