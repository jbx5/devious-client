import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("ParamDefinition_cached")
   static EvictingDualNodeHashTable ParamDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("c")
   @Export("type")
   char type;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -503416777
   )
   @Export("defaultInt")
   public int defaultInt;
   @ObfuscatedName("h")
   @Export("defaultStr")
   public String defaultStr;
   @ObfuscatedName("j")
   @Export("autoDisable")
   boolean autoDisable = true;

   ParamComposition() {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "71"
   )
   @Export("postDecode")
   void postDecode() {
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-1983869930"
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

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqr;II)V",
      garbageValue = "388328081"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         byte var4 = var1.readByte();
         int var5 = var4 & 255;
         if (var5 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var5, 16));
         }

         if (var5 >= 128 && var5 < 160) {
            char var6 = class355.cp1252AsciiExtension[var5 - 128];
            if (var6 == 0) {
               var6 = '?';
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.type = var3;
      } else if (var2 == 2) {
         this.defaultInt = var1.readInt();
      } else if (var2 == 4) {
         this.autoDisable = false;
      } else if (var2 == 5) {
         this.defaultStr = var1.readStringCp1252NullTerminated();
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "798396996"
   )
   @Export("isString")
   public boolean isString() {
      return this.type == 's';
   }
}
