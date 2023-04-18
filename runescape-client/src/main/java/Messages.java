import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("Messages")
public class Messages {
   @ObfuscatedName("af")
   @Export("Messages_channels")
   static final Map Messages_channels = new HashMap();
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lro;"
   )
   @Export("Messages_hashTable")
   static final IterableNodeHashTable Messages_hashTable = new IterableNodeHashTable(1024);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lox;"
   )
   @Export("Messages_queue")
   static final IterableDualNodeQueue Messages_queue = new IterableDualNodeQueue();
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1810202571
   )
   @Export("Messages_count")
   static int Messages_count = 0;
   @ObfuscatedName("cp")
   @Export("otp")
   static String otp;

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)[Lex;",
      garbageValue = "-1633313603"
   )
   static class123[] method2757() {
      return new class123[]{class123.field1496, class123.field1487, class123.field1489, class123.field1490, class123.field1491};
   }

   @ObfuscatedName("kc")
   @ObfuscatedSignature(
      descriptor = "(Ldg;I)V",
      garbageValue = "-1336825850"
   )
   static final void method2763(PendingSpawn var0) {
      long var1 = 0L;
      int var3 = -1;
      int var4 = 0;
      int var5 = 0;
      if (var0.type == 0) {
         var1 = class31.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
      }

      if (var0.type == 1) {
         var1 = class31.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
      }

      if (var0.type == 2) {
         var1 = class31.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
      }

      if (var0.type == 3) {
         var1 = class31.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
      }

      if (var1 != 0L) {
         int var6 = class31.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
         var3 = InterfaceParent.Entity_unpackID(var1);
         var4 = var6 & 31;
         var5 = var6 >> 6 & 3;
      }

      var0.objectId = var3;
      var0.field1123 = var4;
      var0.field1128 = var5;
   }
}
