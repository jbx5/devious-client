import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class159 extends class135 {
   @ObfuscatedName("fy")
   @ObfuscatedGetter(
      intValue = 2000109897
   )
   @Export("worldPort")
   static int worldPort;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1382188213
   )
   int field1756;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      longValue = 4508213619686821893L
   )
   long field1757;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lel;"
   )
   final class138 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lel;)V"
   )
   class159(class138 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-1428026624"
   )
   void vmethod3254(Buffer var1) {
      this.field1756 = var1.readInt();
      this.field1757 = var1.readLong();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ler;B)V",
      garbageValue = "-110"
   )
   void vmethod3248(ClanSettings var1) {
      var1.method3091(this.field1756, this.field1757);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IB)Lbz;",
      garbageValue = "68"
   )
   @Export("getScript")
   static Script getScript(int var0) {
      Script var1 = (Script)Script.Script_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class188.archive12.takeFile(var0, 0);
         if (var2 == null) {
            return null;
         } else {
            var1 = GameEngine.newScript(var2);
            Script.Script_cached.put(var1, (long)var0);
            return var1;
         }
      }
   }
}
