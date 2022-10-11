import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("FaceNormal")
public class FaceNormal {
   @ObfuscatedName("tw")
   @ObfuscatedSignature(
      descriptor = "Lbl;"
   )
   @Export("decimator")
   static Decimator decimator;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1544406627
   )
   @Export("x")
   int x;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1494037397
   )
   @Export("y")
   int y;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 685925029
   )
   @Export("z")
   int z;

   FaceNormal() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;Lpe;B)Lpe;",
      garbageValue = "47"
   )
   @Export("readStringIntParameters")
   static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
      int var2 = var0.readUnsignedByte();
      int var3;
      if (var1 == null) {
         var3 = class37.method712(var2);
         var1 = new IterableNodeHashTable(var3);
      }

      for(var3 = 0; var3 < var2; ++var3) {
         boolean var4 = var0.readUnsignedByte() == 1;
         int var5 = var0.readMedium();
         Object var6;
         if (var4) {
            var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
         } else {
            var6 = new IntegerNode(var0.readInt());
         }

         var1.put((Node)var6, (long)var5);
      }

      return var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "-103"
   )
   @Export("itemContainerSetItem")
   static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
      ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var4 == null) {
         var4 = new ItemContainer();
         ItemContainer.itemContainers.put(var4, (long)var0);
      }

      if (var4.ids.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.ids.length; ++var7) {
            var5[var7] = var4.ids[var7];
            var6[var7] = var4.quantities[var7];
         }

         for(var7 = var4.ids.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.ids = var5;
         var4.quantities = var6;
      }

      var4.ids[var1] = var2;
      var4.quantities[var1] = var3;
   }

   @ObfuscatedName("jb")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "320486626"
   )
   static String method4461(int var0) {
      if (var0 < 0) {
         return "";
      } else {
         return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0];
      }
   }
}
