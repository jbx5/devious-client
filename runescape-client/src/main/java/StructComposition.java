import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
@Implements("StructComposition")
public class StructComposition extends DualNode {
   @ObfuscatedName("vs")
   @ObfuscatedSignature(
      descriptor = "Lch;"
   )
   @Export("clientPreferences")
   static ClientPreferences clientPreferences;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("StructDefinition_archive")
   public static AbstractArchive StructDefinition_archive;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("StructDefinition_cached")
   static EvictingDualNodeHashTable StructDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("f")
   @Export("SpriteBuffer_spriteHeights")
   public static int[] SpriteBuffer_spriteHeights;
   @ObfuscatedName("u")
   static int[] field2122;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lql;"
   )
   @Export("params")
   IterableNodeHashTable params;

   StructComposition() {
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2106689877"
   )
   @Export("postDecode")
   void postDecode() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lqy;S)V",
      garbageValue = "192"
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

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqy;IB)V",
      garbageValue = "-42"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 249) {
         this.params = DynamicObject.readStringIntParameters(var1, this.params);
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "76"
   )
   @Export("getIntParam")
   public int getIntParam(int var1, int var2) {
      return UserComparator8.method2819(this.params, var1, var2);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-389894911"
   )
   @Export("getStringParam")
   public String getStringParam(int var1, String var2) {
      IterableNodeHashTable var4 = this.params;
      String var3;
      if (var4 == null) {
         var3 = var2;
      } else {
         ObjectNode var5 = (ObjectNode)var4.get((long)var1);
         if (var5 == null) {
            var3 = var2;
         } else {
            var3 = (String)var5.obj;
         }
      }

      return var3;
   }

   @ObfuscatedName("e")
   static final void method3820(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "([BILjava/lang/CharSequence;I)I",
      garbageValue = "1948411725"
   )
   public static int method3810(byte[] var0, int var1, CharSequence var2) {
      int var3 = var2.length();
      int var4 = var1;

      for(int var5 = 0; var5 < var3; ++var5) {
         char var6 = var2.charAt(var5);
         if (var6 <= 127) {
            var0[var4++] = (byte)var6;
         } else if (var6 <= 2047) {
            var0[var4++] = (byte)(192 | var6 >> 6);
            var0[var4++] = (byte)(128 | var6 & 63);
         } else {
            var0[var4++] = (byte)(224 | var6 >> 12);
            var0[var4++] = (byte)(128 | var6 >> 6 & 63);
            var0[var4++] = (byte)(128 | var6 & 63);
         }
      }

      return var4 - var1;
   }
}
