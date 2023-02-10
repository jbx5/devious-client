import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
   @ObfuscatedName("sg")
   static boolean field2116;
   @ObfuscatedName("vi")
   @Export("foundItemIds")
   static short[] foundItemIds;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("VarbitDefinition_cached")
   static EvictingDualNodeHashTable VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("j")
   static final int[] field2114 = new int[32];
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -849337785
   )
   @Export("baseVar")
   public int baseVar;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -926382043
   )
   @Export("startBit")
   public int startBit;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1686633587
   )
   @Export("endBit")
   public int endBit;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field2114[var1] = var0 - 1;
         var0 += var0;
      }

   }

   VarbitComposition() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "-2142044850"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lrd;IB)V",
      garbageValue = "8"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.baseVar = var1.readUnsignedShort();
         this.startBit = var1.readUnsignedByte();
         this.endBit = var1.readUnsignedByte();
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lbw;B)V",
      garbageValue = "-31"
   )
   @Export("changeWorld")
   static void changeWorld(World var0) {
      if (var0.isMembersOnly() != Client.isMembersWorld) {
         Client.isMembersWorld = var0.isMembersOnly();
         StructComposition.method3868(var0.isMembersOnly());
      }

      if (var0.properties != Client.worldProperties) {
         ObjectComposition.method3948(WorldMapEvent.archive8, var0.properties);
      }

      NetCache.worldHost = var0.host;
      Client.worldId = var0.id;
      Client.worldProperties = var0.properties;
      class1.worldPort = Client.gameBuild == 0 ? 'ꩊ' : var0.id + '鱀';
      class10.js5Port = Client.gameBuild == 0 ? 443 : var0.id + '썐';
      Calendar.currentPort = class1.worldPort;
   }

   @ObfuscatedName("gb")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-119"
   )
   static final void method3812() {
      for(int var0 = 0; var0 < Client.npcCount; ++var0) {
         int var1 = Client.npcIndices[var0];
         NPC var2 = Client.npcs[var1];
         if (var2 != null) {
            PcmPlayer.updateActorSequence(var2, var2.definition.size);
         }
      }

   }
}
