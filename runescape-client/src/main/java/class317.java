import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
public enum class317 implements MouseWheel {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   field3736(0),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   field3737(1),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   field3735(2),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   field3738(3),
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   field3739(4);

   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -619743377
   )
   final int field3740;

   class317(int var3) {
      this.field3740 = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "3"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field3740;
   }

   @ObfuscatedName("ld")
   @ObfuscatedSignature(
      descriptor = "(Lkz;B)Ljava/lang/String;",
      garbageValue = "-20"
   )
   @Export("Widget_getSpellActionName")
   static String Widget_getSpellActionName(Widget var0) {
      if (MenuAction.Widget_unpackTargetMask(class173.getWidgetFlags(var0)) == 0) {
         return null;
      } else {
         return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
      }
   }
}
