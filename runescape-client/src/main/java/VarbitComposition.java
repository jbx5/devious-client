import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("VarbitDefinition_archive")
   public static AbstractArchive VarbitDefinition_archive;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("VarbitDefinition_cached")
   public static EvictingDualNodeHashTable VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("q")
   static final int[] field2112 = new int[32];
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1633221379
   )
   @Export("baseVar")
   public int baseVar;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -270804781
   )
   @Export("startBit")
   public int startBit;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1549035405
   )
   @Export("endBit")
   public int endBit;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field2112[var1] = var0 - 1;
         var0 += var0;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "2093010759"
   )
   @Export("decode")
   public void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lqy;II)V",
      garbageValue = "1158300194"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.baseVar = var1.readUnsignedShort();
         this.startBit = var1.readUnsignedByte();
         this.endBit = var1.readUnsignedByte();
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IB)Lbm;",
      garbageValue = "-42"
   )
   @Export("getScript")
   static Script getScript(int var0) {
      Script var1 = (Script)Script.Script_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class71.archive12.takeFile(var0, 0);
         if (var2 == null) {
            return null;
         } else {
            var1 = FriendSystem.newScript(var2);
            Script.Script_cached.put(var1, (long)var0);
            return var1;
         }
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "235490030"
   )
   public static String method3779(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if (var3 == 0) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            char var6;
            if (var5 != 181 && var5 != 402) {
               var6 = Character.toTitleCase(var5);
            } else {
               var6 = var5;
            }

            var5 = var6;
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if (var5 != '.' && var5 != '?' && var5 != '!') {
            if (Character.isSpaceChar(var5)) {
               if (var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }
}
