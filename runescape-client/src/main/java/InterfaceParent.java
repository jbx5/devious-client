import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 675621627
   )
   @Export("group")
   int group;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -2067999467
   )
   @Export("type")
   int type;
   @ObfuscatedName("c")
   boolean field1037 = false;

   InterfaceParent() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IB)Lgm;",
      garbageValue = "-104"
   )
   @Export("getObjectDefinition")
   public static ObjectComposition getObjectDefinition(int var0) {
      ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
         var1 = new ObjectComposition();
         var1.id = var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         if (var1.isSolid) {
            var1.interactType = 0;
            var1.boolean1 = false;
         }

         ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }
}
