import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public class class168 {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Ldm;"
   )
   public UrlRequest field1867;
   @ObfuscatedName("e")
   public float[] field1868;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfk;"
   )
   final class163 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfk;)V"
   )
   class168(class163 var1) {
      this.this$0 = var1;
      this.field1868 = new float[4];
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(CLmb;I)C",
      garbageValue = "2057420121"
   )
   @Export("standardizeChar")
   static char standardizeChar(char var0, Language var1) {
      if (var0 >= 192 && var0 <= 255) {
         if (var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if (var0 == 199) {
            return 'C';
         }

         if (var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if (var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if (var0 == 209 && var1 != Language.Language_ES) {
            return 'N';
         }

         if (var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if (var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if (var0 == 221) {
            return 'Y';
         }

         if (var0 == 223) {
            return 's';
         }

         if (var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if (var0 == 231) {
            return 'c';
         }

         if (var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if (var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if (var0 == 241 && var1 != Language.Language_ES) {
            return 'n';
         }

         if (var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if (var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if (var0 == 253 || var0 == 255) {
            return 'y';
         }
      }

      if (var0 == 338) {
         return 'O';
      } else if (var0 == 339) {
         return 'o';
      } else if (var0 == 376) {
         return 'Y';
      } else {
         return var0;
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "-2191"
   )
   protected static final int method3482() {
      return GameEngine.keyHandler.method354();
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "-601866686"
   )
   static int method3481(int var0, Script var1, boolean var2) {
      return 2;
   }
}
