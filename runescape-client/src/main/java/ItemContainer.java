import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("ItemContainer")
public class ItemContainer extends Node {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lrh;"
   )
   @Export("itemContainers")
   static NodeHashTable itemContainers = new NodeHashTable(32);
   @ObfuscatedName("al")
   @Export("ids")
   int[] ids = new int[]{-1};
   @ObfuscatedName("ac")
   @Export("quantities")
   int[] quantities = new int[]{0};

   ItemContainer() {
   }
}
