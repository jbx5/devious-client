import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class134 {
   @ObfuscatedName("dw")
   @ObfuscatedSignature(
      descriptor = "[Ltj;"
   )
   @Export("worldSelectFlagSprites")
   static IndexedSprite[] worldSelectFlagSprites;
   @ObfuscatedName("gy")
   @ObfuscatedGetter(
      intValue = 1598762527
   )
   static int field1570;
   @ObfuscatedName("qf")
   @ObfuscatedSignature(
      descriptor = "[Lmb;"
   )
   static Widget[] field1575;

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-50"
   )
   public static int method3040(int var0) {
      long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
      int var1 = (int)(var2 >>> 14 & 3L);
      return var1;
   }

   @ObfuscatedName("mn")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-35"
   )
   static final void method3041(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      class10.clientPreferences.method2449(var0);
   }
}
