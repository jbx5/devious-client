import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("Messages")
public class Messages {
   @ObfuscatedName("a")
   @Export("Messages_channels")
   static final Map Messages_channels = new HashMap();
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lpe;"
   )
   @Export("Messages_hashTable")
   static final IterableNodeHashTable Messages_hashTable = new IterableNodeHashTable(1024);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   @Export("Messages_queue")
   static final IterableDualNodeQueue Messages_queue = new IterableDualNodeQueue();
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 824043359
   )
   @Export("Messages_count")
   static int Messages_count = 0;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1135032351
   )
   @Export("musicTrackVolume")
   public static int musicTrackVolume;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Lqr;"
   )
   public static Buffer field1361;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "26"
   )
   static void method2645() {
      InvDefinition.field1862 = new int[2000];
      int var0 = 0;
      int var1 = 240;

      int var2;
      int var3;
      for(var2 = 12; var0 < 16; var1 -= var2) {
         var3 = class9.method72((double)((float)var1 / 360.0F), 0.9998999834060669, (double)((float)var0 * 0.425F / 16.0F + 0.075F));
         InvDefinition.field1862[var0] = var3;
         ++var0;
      }

      var1 = 48;

      for(var2 = var1 / 6; var0 < InvDefinition.field1862.length; var1 -= var2) {
         var3 = var0 * 2;

         for(int var4 = class9.method72((double)((float)var1 / 360.0F), 0.9998999834060669, 0.5); var0 < var3 && var0 < InvDefinition.field1862.length; ++var0) {
            InvDefinition.field1862[var0] = var4;
         }
      }

   }
}
