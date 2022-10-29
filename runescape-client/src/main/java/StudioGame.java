import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   @Export("runescape")
   runescape("runescape", "RuneScape", 0),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   @Export("stellardawn")
   stellardawn("stellardawn", "Stellar Dawn", 1),
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   @Export("game3")
   game3("game3", "Game 3", 2),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   @Export("game4")
   game4("game4", "Game 4", 3),
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   @Export("game5")
   game5("game5", "Game 5", 4),
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   @Export("oldscape")
   oldscape("oldscape", "RuneScape 2007", 5);

   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1621958157
   )
   static int field3743;
   @ObfuscatedName("y")
   @Export("name")
   public final String name;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 669900011
   )
   @Export("id")
   final int id;

   StudioGame(String var3, String var4, int var5) {
      this.name = var3;
      this.id = var5;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;ZI)[B",
      garbageValue = "-853698900"
   )
   public static byte[] method6260(Object var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var6 = (byte[])((byte[])var0);
         if (var1) {
            int var4 = var6.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(var6, 0, var5, 0, var4);
            return var5;
         } else {
            return var6;
         }
      } else if (var0 instanceof AbstractByteArrayCopier) {
         AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
         return var2.get();
      } else {
         throw new IllegalArgumentException();
      }
   }
}
