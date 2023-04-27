import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("py")
public class class396 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lpy;"
   )
   public static final class396 field4532 = new class396(1);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lpy;"
   )
   static final class396 field4530 = new class396(0);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "[Ltc;"
   )
   @Export("runesSprite")
   static IndexedSprite[] runesSprite;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1101065145
   )
   final int field4531;

   class396(int var1) {
      this.field4531 = var1;
   }
}
