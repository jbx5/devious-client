import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Locale;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
@Implements("Language")
public class Language implements MouseWheel {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lmb;"
   )
   @Export("Language_EN")
   public static final Language Language_EN;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lmb;"
   )
   @Export("Language_DE")
   static final Language Language_DE;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lmb;"
   )
   @Export("Language_FR")
   public static final Language Language_FR;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lmb;"
   )
   @Export("Language_PT")
   static final Language Language_PT;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Lmb;"
   )
   @Export("Language_NL")
   static final Language Language_NL;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lmb;"
   )
   @Export("Language_ES")
   public static final Language Language_ES;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lmb;"
   )
   @Export("Language_ES_MX")
   static final Language Language_ES_MX;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "[Lmb;"
   )
   @Export("Language_valuesOrdered")
   public static final Language[] Language_valuesOrdered;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1226653913
   )
   @Export("canvasHeight")
   public static int canvasHeight;
   @ObfuscatedName("ad")
   @Export("Widget_loadedInterfaces")
   static boolean[] Widget_loadedInterfaces;
   @ObfuscatedName("r")
   final String field4300;
   @ObfuscatedName("u")
   @Export("language")
   final String language;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1679709169
   )
   @Export("id")
   final int id;

   static {
      Language_EN = new Language("EN", "en", "English", ModeWhere.field4327, 0, "GB");
      Language_DE = new Language("DE", "de", "German", ModeWhere.field4327, 1, "DE");
      Language_FR = new Language("FR", "fr", "French", ModeWhere.field4327, 2, "FR");
      Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4327, 3, "BR");
      Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4310, 4, "NL");
      Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4310, 5, "ES");
      Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4327, 6, "MX");
      Language[] var0 = new Language[]{Language_DE, Language_ES, Language_FR, Language_NL, Language_ES_MX, Language_PT, Language_EN};
      Language_valuesOrdered = new Language[var0.length];
      Language[] var2 = var0;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Language var4 = var2[var3];
         if (Language_valuesOrdered[var4.id] != null) {
            throw new IllegalStateException();
         }

         Language_valuesOrdered[var4.id] = var4;
      }

   }

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmr;ILjava/lang/String;)V"
   )
   Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
      this.field4300 = var1;
      this.language = var2;
      this.id = var5;
      if (var6 != null) {
         new Locale(var2.substring(0, 2), var6);
      } else {
         new Locale(var2.substring(0, 2));
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "0"
   )
   @Export("getLanguage")
   String getLanguage() {
      return this.language;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   public String toString() {
      return this.getLanguage().toLowerCase(Locale.ENGLISH);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "([BB)Lrx;",
      garbageValue = "0"
   )
   public static final SpritePixels method6693(byte[] var0) {
      BufferedImage var1 = null;

      try {
         Class var2 = ImageIO.class;
         synchronized(ImageIO.class) {
            var1 = ImageIO.read(new ByteArrayInputStream(var0));
         }

         int var6 = var1.getWidth();
         int var7 = var1.getHeight();
         int[] var4 = new int[var6 * var7];
         PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6);
         var5.grabPixels();
         return new SpritePixels(var4, var6, var7);
      } catch (IOException var9) {
      } catch (InterruptedException var10) {
      }

      return new SpritePixels(0, 0);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-669760622"
   )
   static void method6695() {
      Players.Players_count = 0;

      for(int var0 = 0; var0 < 2048; ++var0) {
         Players.field1372[var0] = null;
         Players.field1379[var0] = class204.field2355;
      }

   }
}
