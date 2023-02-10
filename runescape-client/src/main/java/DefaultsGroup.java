import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
@Implements("DefaultsGroup")
public class DefaultsGroup {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lof;"
   )
   static final DefaultsGroup field4610 = new DefaultsGroup(3);
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -101445755
   )
   @Export("group")
   final int group;

   DefaultsGroup(int var1) {
      this.group = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)Lgc;",
      garbageValue = "7"
   )
   public static FloorUnderlayDefinition method7840(int var0) {
      FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0);
         var1 = new FloorUnderlayDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2), var0);
         }

         var1.postDecode();
         FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1039832513"
   )
   @Export("ItemContainer_getCount")
   static int ItemContainer_getCount(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var2 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
      }
   }
}
