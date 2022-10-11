import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lhb;"
   )
   @Export("WorldMapLabelSize_small")
   public static final WorldMapLabelSize WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lhb;"
   )
   @Export("WorldMapLabelSize_medium")
   public static final WorldMapLabelSize WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lhb;"
   )
   @Export("WorldMapLabelSize_large")
   public static final WorldMapLabelSize WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0);
   @ObfuscatedName("id")
   @ObfuscatedSignature(
      descriptor = "[Lri;"
   )
   @Export("mapMarkerSprites")
   static SpritePixels[] mapMarkerSprites;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1882289025
   )
   final int field2753;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1885400359
   )
   final int field2755;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -2018479119
   )
   final int field2756;

   WorldMapLabelSize(int var1, int var2, int var3) {
      this.field2753 = var1;
      this.field2755 = var2;
      this.field2756 = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(FI)Z",
      garbageValue = "-803182216"
   )
   boolean method4685(float var1) {
      return var1 >= (float)this.field2756;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)[Lhb;",
      garbageValue = "1767891912"
   )
   static WorldMapLabelSize[] method4694() {
      return new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_medium, WorldMapLabelSize_small};
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)Ljc;",
      garbageValue = "58"
   )
   static PacketBufferNode method4683() {
      return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IS)Lhb;",
      garbageValue = "4994"
   )
   static WorldMapLabelSize method4686(int var0) {
      WorldMapLabelSize[] var1 = method4694();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         WorldMapLabelSize var3 = var1[var2];
         if (var0 == var3.field2755) {
            return var3;
         }
      }

      return null;
   }
}
