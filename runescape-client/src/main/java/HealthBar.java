import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("HealthBar")
public class HealthBar extends Node {
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("SequenceDefinition_archive")
   public static AbstractArchive SequenceDefinition_archive;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1613794431
   )
   @Export("Interpreter_stringStackSize")
   static int Interpreter_stringStackSize;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lhn;"
   )
   @Export("definition")
   HealthBarDefinition definition;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lni;"
   )
   @Export("updates")
   IterableNodeDeque updates = new IterableNodeDeque();

   @ObfuscatedSignature(
      descriptor = "(Lhn;)V"
   )
   HealthBar(HealthBarDefinition var1) {
      this.definition = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "443468111"
   )
   @Export("put")
   void put(int var1, int var2, int var3, int var4) {
      HealthBarUpdate var5 = null;
      int var6 = 0;

      for(HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) {
         ++var6;
         if (var7.cycle == var1) {
            var7.set(var1, var2, var3, var4);
            return;
         }

         if (var7.cycle <= var1) {
            var5 = var7;
         }
      }

      if (var5 == null) {
         if (var6 < 4) {
            this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
         }

      } else {
         IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
         if (var6 >= 4) {
            this.updates.last().remove();
         }

      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)Ldw;",
      garbageValue = "53530946"
   )
   @Export("get")
   HealthBarUpdate get(int var1) {
      HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last();
      if (var2 != null && var2.cycle <= var1) {
         for(HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) {
            var2.remove();
            var2 = var3;
         }

         if (this.definition.int5 + var2.cycleOffset + var2.cycle > var1) {
            return var2;
         } else {
            var2.remove();
            return null;
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "4"
   )
   @Export("isEmpty")
   boolean isEmpty() {
      return this.updates.method6738();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)Lhn;",
      garbageValue = "-1719654213"
   )
   public static HealthBarDefinition method2538(int var0) {
      HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0);
         var1 = new HealthBarDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I[BLpv;B)V",
      garbageValue = "-48"
   )
   static void method2550(int var0, byte[] var1, ArchiveDisk var2) {
      ArchiveDiskAction var3 = new ArchiveDiskAction();
      var3.type = 0;
      var3.key = (long)var0;
      var3.data = var1;
      var3.archiveDisk = var2;
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
         ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
      }

      Skills.method6322();
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/String;[IIII)V",
      garbageValue = "-329447192"
   )
   static void method2542(String[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               int var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         method2542(var0, var1, var2, var5 - 1);
         method2542(var0, var1, var5 + 1, var3);
      }

   }
}
