import java.util.Comparator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
class class391 implements Comparator {
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 935004533
   )
   static int field4473;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lpu;"
   )
   final class390 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lpu;)V"
   )
   class391(class390 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I",
      garbageValue = "71"
   )
   int method7401(Map.Entry var1, Map.Entry var2) {
      return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
   }

   public int compare(Object var1, Object var2) {
      return this.method7401((Map.Entry)var1, (Map.Entry)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
