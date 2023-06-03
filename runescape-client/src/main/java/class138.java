import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public enum class138 implements MouseWheel {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lfw;"
   )
   field1607(1, 0),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lfw;"
   )
   field1606(0, 1),
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lfw;"
   )
   field1608(2, 2),
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lfw;"
   )
   field1609(4, 3),
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lfw;"
   )
   field1610(3, 4);

   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -2124771113
   )
   public final int field1611;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 516056089
   )
   @Export("id")
   final int id;

   class138(int var3, int var4) {
      this.field1611 = var3;
      this.id = var4;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-14"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("kb")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
      garbageValue = "-1617334204"
   )
   @Export("insertMenuItemNoShift")
   public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
      WorldMapID.insertMenuItem(var0, var1, var2, var3, var4, var5, -1, false);
   }
}
