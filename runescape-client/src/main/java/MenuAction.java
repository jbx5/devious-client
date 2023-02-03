import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("MenuAction")
public class MenuAction {
   @ObfuscatedName("hu")
   @ObfuscatedSignature(
      descriptor = "Lnv;"
   )
   @Export("fontPlain12")
   static Font fontPlain12;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1800513627
   )
   @Export("param0")
   int param0;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1545642217
   )
   @Export("param1")
   int param1;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 612439209
   )
   @Export("opcode")
   int opcode;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -123568167
   )
   @Export("identifier")
   int identifier;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 280536773
   )
   @Export("itemId")
   int itemId;
   @ObfuscatedName("j")
   @Export("action")
   String action;
   @ObfuscatedName("i")
   @Export("target")
   String target;

   MenuAction() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-1320413975"
   )
   public static final boolean method2084(char var0) {
      return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "42"
   )
   @Export("Widget_unpackTargetMask")
   public static int Widget_unpackTargetMask(int var0) {
      return var0 >> 11 & 63;
   }

   @ObfuscatedName("gn")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-358398577"
   )
   static final void method2082() {
      int var0 = Players.Players_count;
      int[] var1 = Players.Players_indices;

      for(int var2 = 0; var2 < var0; ++var2) {
         Player var3 = Client.players[var1[var2]];
         if (var3 != null) {
            PcmPlayer.updateActorSequence(var3, 1);
         }
      }

   }
}
