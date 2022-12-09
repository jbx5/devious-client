import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("ClanChannelMember")
public class ClanChannelMember {
   @ObfuscatedName("ef")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("archive10")
   static Archive archive10;
   @ObfuscatedName("h")
   @Export("rank")
   public byte rank;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1561957153
   )
   @Export("world")
   public int world;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lrp;"
   )
   @Export("username")
   public Username username;

   ClanChannelMember() {
   }

   @ObfuscatedName("e")
   public static int method3084(long var0) {
      return (int)(var0 >>> 0 & 127L);
   }
}
