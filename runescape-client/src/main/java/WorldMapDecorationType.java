import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements MouseWheel {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3751(0, 0),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3749(1, 0),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3750(2, 0),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3754(3, 0),
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3752(9, 2),
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3748(4, 1),
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3765(5, 1),
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3755(6, 1),
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3756(7, 1),
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3757(8, 1),
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3758(12, 2),
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3759(13, 2),
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3753(14, 2),
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3761(15, 2),
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3762(16, 2),
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3767(17, 2),
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3764(18, 2),
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3766(19, 2),
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3760(20, 2),
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3763(21, 2),
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3768(10, 2),
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3769(11, 2),
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Lmc;"
   )
   field3770(22, 3);

   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1344801027
   )
   @Export("id")
   public final int id;

   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "0"
   )
   WorldMapDecorationType(int var3, int var4) {
      this.id = var3;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "741942848"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
      garbageValue = "1"
   )
   public static String method6573(CharSequence var0) {
      return class14.method190('*', var0.length());
   }
}
