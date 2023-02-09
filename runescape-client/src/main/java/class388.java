import java.util.Comparator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
class class388 implements Comparator {
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1393816003
   )
   public static int field4510;
   @ObfuscatedName("qb")
   @ObfuscatedSignature(
      descriptor = "Lpq;"
   )
   static class421 field4512;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lnx;"
   )
   final class387 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lnx;)V"
   )
   class388(class387 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
      garbageValue = "-731916106"
   )
   int method7459(Map.Entry var1, Map.Entry var2) {
      return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method7459((Map.Entry)var1, (Map.Entry)var2);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IS)I",
      garbageValue = "-22723"
   )
   public static int method7467(int var0) {
      return class431.field4690[var0 & 16383];
   }
}
