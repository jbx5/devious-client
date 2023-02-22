import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("VarbitDefinition_archive")
   public static AbstractArchive VarbitDefinition_archive;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("VarbitDefinition_cached")
   public static EvictingDualNodeHashTable VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ao")
   static final int[] field2078 = new int[32];
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1552333755
   )
   @Export("baseVar")
   public int baseVar;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -227639777
   )
   @Export("startBit")
   public int startBit;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -476919085
   )
   @Export("endBit")
   public int endBit;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field2078[var1] = var0 - 1;
         var0 += var0;
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lsy;B)V",
      garbageValue = "1"
   )
   @Export("decode")
   public void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsy;II)V",
      garbageValue = "1007737801"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.baseVar = var1.readUnsignedShort();
         this.startBit = var1.readUnsignedByte();
         this.endBit = var1.readUnsignedByte();
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(CB)Z",
      garbageValue = "20"
   )
   static final boolean method3770(char var0) {
      if (Character.isISOControl(var0)) {
         return false;
      } else if (PlayerComposition.isAlphaNumeric(var0)) {
         return true;
      } else {
         char[] var1 = class458.field4828;

         int var2;
         char var3;
         for(var2 = 0; var2 < var1.length; ++var2) {
            var3 = var1[var2];
            if (var0 == var3) {
               return true;
            }
         }

         var1 = class458.field4831;

         for(var2 = 0; var2 < var1.length; ++var2) {
            var3 = var1[var2];
            if (var0 == var3) {
               return true;
            }
         }

         return false;
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(II)Liw;",
      garbageValue = "1738184089"
   )
   @Export("getFrames")
   static Frames getFrames(int var0) {
      Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         var1 = class125.method2956(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false);
         if (var1 != null) {
            SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
         }

         return var1;
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lcz;I)V",
      garbageValue = "833776818"
   )
   @Export("changeWorld")
   static void changeWorld(World var0) {
      if (var0.isMembersOnly() != Client.isMembersWorld) {
         Client.isMembersWorld = var0.isMembersOnly();
         boolean var1 = var0.isMembersOnly();
         if (var1 != VarcInt.ItemDefinition_inMembersWorld) {
            ItemComposition.ItemDefinition_cached.clear();
            ItemComposition.ItemDefinition_cachedModels.clear();
            ItemComposition.ItemDefinition_cachedSprites.clear();
            VarcInt.ItemDefinition_inMembersWorld = var1;
         }
      }

      if (var0.properties != Client.worldProperties) {
         class269.method5378(class143.archive8, var0.properties);
      }

      class188.worldHost = var0.host;
      Client.worldId = var0.id;
      Client.worldProperties = var0.properties;
      class290.worldPort = Client.gameBuild == 0 ? 'ꩊ' : var0.id + '鱀';
      Calendar.js5Port = Client.gameBuild == 0 ? 443 : var0.id + '썐';
      ClanSettings.currentPort = class290.worldPort;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;II)V",
      garbageValue = "-1339711381"
   )
   static final void method3766(String var0, int var1) {
      PacketBufferNode var2 = UserComparator9.getPacketBufferNode(ClientPacket.field3108, Client.packetWriter.isaacCipher);
      var2.packetBuffer.writeByte(WorldMapLabel.stringCp1252NullTerminatedByteSize(var0) + 1);
      var2.packetBuffer.writeByteSub(var1);
      var2.packetBuffer.writeStringCp1252NullTerminated(var0);
      Client.packetWriter.addNode(var2);
   }

   @ObfuscatedName("jl")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "93"
   )
   static final void method3769(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
         if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
            Client.field697[var4] = true;
         }
      }

   }
}
