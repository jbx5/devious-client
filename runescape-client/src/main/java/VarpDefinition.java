import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("VarpDefinition_archive")
   public static AbstractArchive VarpDefinition_archive;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1477143825
   )
   public static int field1866;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("VarpDefinition_cached")
   static EvictingDualNodeHashTable VarpDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("jq")
   @ObfuscatedGetter(
      intValue = -1108590841
   )
   static int field1869;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -741594441
   )
   @Export("type")
   public int type = 0;

   VarpDefinition() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lqr;B)V",
      garbageValue = "67"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lqr;II)V",
      garbageValue = "-1006408276"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 5) {
         this.type = var1.readUnsignedShort();
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/String;[SIII)V",
      garbageValue = "369606324"
   )
   @Export("sortItemsByName")
   static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         sortItemsByName(var0, var1, var2, var5 - 1);
         sortItemsByName(var0, var1, var5 + 1, var3);
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "0"
   )
   public static int method3429(int var0) {
      return class421.field4611[var0 & 16383];
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-25376561"
   )
   static boolean method3415(char var0) {
      for(int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) {
         if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) {
            return true;
         }
      }

      return false;
   }
}
