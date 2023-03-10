import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
public class class72 {
   @ObfuscatedName("aj")
   static final BigInteger field883 = new BigInteger("10001", 16);
   @ObfuscatedName("al")
   static final BigInteger field881 = new BigInteger("e4b69726685ccfa5c5415c9e497295e78a02e17b2f3a30396eab65139af40b3f6513f5c2655479f120ba15625934bfd84bc3b5ce181ded4133a7c8b752309b113cbba2fec6cfa44a318ec4496531f2cfef334025f67ce1161bf85ea98973b1f5bdc33bf97a62b10536f30776646dd4aa199b9c51aaa08126b3678518b0215bbf", 16);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lsp;"
   )
   static IndexedSprite field882;

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lne;IIB)Lsp;",
      garbageValue = "120"
   )
   static IndexedSprite method2059(AbstractArchive var0, int var1, int var2) {
      byte[] var4 = var0.takeFile(var1, var2);
      boolean var3;
      if (var4 == null) {
         var3 = false;
      } else {
         class212.SpriteBuffer_decode(var4);
         var3 = true;
      }

      return !var3 ? null : class353.method6646();
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "0"
   )
   static final int method2057(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   @ObfuscatedName("gc")
   @ObfuscatedSignature(
      descriptor = "(IZZZZI)Lmx;",
      garbageValue = "-1462614176"
   )
   @Export("newArchive")
   static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
      ArchiveDisk var5 = null;
      if (JagexCache.JagexCache_dat2File != null) {
         var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var0], 1000000);
      }

      return new Archive(var5, MidiPcmStream.masterDisk, var0, var1, var2, var3, var4);
   }

   @ObfuscatedName("ml")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "11"
   )
   @Export("Clan_joinChat")
   static final void Clan_joinChat(String var0) {
      if (!var0.equals("")) {
         PacketBufferNode var1 = UserComparator9.getPacketBufferNode(ClientPacket.field3103, Client.packetWriter.isaacCipher);
         var1.packetBuffer.writeByte(WorldMapLabel.stringCp1252NullTerminatedByteSize(var0));
         var1.packetBuffer.writeStringCp1252NullTerminated(var0);
         Client.packetWriter.addNode(var1);
      }
   }

   @ObfuscatedName("na")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-102"
   )
   public static boolean method2055() {
      return Client.staffModLevel >= 2;
   }
}
