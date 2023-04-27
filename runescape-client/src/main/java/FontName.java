import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ri")
@Implements("FontName")
public class FontName {
   @ObfuscatedName("um")
   @ObfuscatedGetter(
      intValue = -378880000
   )
   static int field4884;
   @ObfuscatedName("wj")
   @ObfuscatedGetter(
      intValue = -859067495
   )
   @Export("foundItemIndex")
   static int foundItemIndex;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lri;"
   )
   @Export("FontName_plain11")
   public static final FontName FontName_plain11 = new FontName("p11_full");
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lri;"
   )
   @Export("FontName_plain12")
   public static final FontName FontName_plain12 = new FontName("p12_full");
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lri;"
   )
   @Export("FontName_bold12")
   public static final FontName FontName_bold12 = new FontName("b12_full");
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lri;"
   )
   @Export("FontName_verdana11")
   public static final FontName FontName_verdana11 = new FontName("verdana_11pt_regular");
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lri;"
   )
   @Export("FontName_verdana13")
   public static final FontName FontName_verdana13 = new FontName("verdana_13pt_regular");
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lri;"
   )
   @Export("FontName_verdana15")
   public static final FontName FontName_verdana15 = new FontName("verdana_15pt_regular");
   @ObfuscatedName("jm")
   @Export("regionMapArchiveIds")
   static int[] regionMapArchiveIds;
   @ObfuscatedName("jt")
   @ObfuscatedGetter(
      intValue = -191732975
   )
   static int field4882;
   @ObfuscatedName("aq")
   @Export("name")
   String name;

   FontName(String var1) {
      this.name = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)[Lri;",
      garbageValue = "75"
   )
   public static FontName[] method8671() {
      return new FontName[]{FontName_verdana11, FontName_plain12, FontName_verdana15, FontName_plain11, FontName_verdana13, FontName_bold12};
   }
}
