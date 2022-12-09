import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
public class class467 {
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1047217151
   )
   @Export("musicTrackVolume")
   public static int musicTrackVolume;
   @ObfuscatedName("h")
   int[] field4920 = new int[8];
   @ObfuscatedName("e")
   short[] field4918 = new short[8];

   @ObfuscatedSignature(
      descriptor = "(Lgz;)V"
   )
   public class467(NPCComposition var1) {
      int var2 = 0;
      if (var1.method3672()) {
         var2 = var1.method3678().length;
         System.arraycopy(var1.method3678(), 0, this.field4920, 0, var2);
         System.arraycopy(var1.method3715(), 0, this.field4918, 0, var2);
      }

      for(int var3 = var2; var3 < 8; ++var3) {
         this.field4920[var3] = -1;
         this.field4918[var3] = -1;
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "2005193688"
   )
   public int[] method8797() {
      return this.field4920;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)[S",
      garbageValue = "1232945994"
   )
   public short[] method8799() {
      return this.field4918;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IISI)V",
      garbageValue = "727886744"
   )
   public void method8800(int var1, int var2, short var3) {
      this.field4920[var1] = var2;
      this.field4918[var1] = var3;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "([I[SI)V",
      garbageValue = "-371112886"
   )
   public void method8801(int[] var1, short[] var2) {
      this.field4920 = var1;
      this.field4918 = var2;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Lmb;II)Ljx;",
      garbageValue = "79142033"
   )
   public static PacketBufferNode method8803(int var0, String var1, Language var2, int var3) {
      PacketBufferNode var4 = class136.getPacketBufferNode(ClientPacket.field3065, Client.packetWriter.isaacCipher);
      var4.packetBuffer.writeByte(0);
      int var5 = var4.packetBuffer.offset;
      var4.packetBuffer.writeByte(var0);
      String var6 = var1.toLowerCase();
      byte var7 = 0;
      if (var6.startsWith("yellow:")) {
         var7 = 0;
         var1 = var1.substring("yellow:".length());
      } else if (var6.startsWith("red:")) {
         var7 = 1;
         var1 = var1.substring("red:".length());
      } else if (var6.startsWith("green:")) {
         var7 = 2;
         var1 = var1.substring("green:".length());
      } else if (var6.startsWith("cyan:")) {
         var7 = 3;
         var1 = var1.substring("cyan:".length());
      } else if (var6.startsWith("purple:")) {
         var7 = 4;
         var1 = var1.substring("purple:".length());
      } else if (var6.startsWith("white:")) {
         var7 = 5;
         var1 = var1.substring("white:".length());
      } else if (var6.startsWith("flash1:")) {
         var7 = 6;
         var1 = var1.substring("flash1:".length());
      } else if (var6.startsWith("flash2:")) {
         var7 = 7;
         var1 = var1.substring("flash2:".length());
      } else if (var6.startsWith("flash3:")) {
         var7 = 8;
         var1 = var1.substring("flash3:".length());
      } else if (var6.startsWith("glow1:")) {
         var7 = 9;
         var1 = var1.substring("glow1:".length());
      } else if (var6.startsWith("glow2:")) {
         var7 = 10;
         var1 = var1.substring("glow2:".length());
      } else if (var6.startsWith("glow3:")) {
         var7 = 11;
         var1 = var1.substring("glow3:".length());
      } else if (var2 != Language.Language_EN) {
         if (var6.startsWith("yellow:")) {
            var7 = 0;
            var1 = var1.substring("yellow:".length());
         } else if (var6.startsWith("red:")) {
            var7 = 1;
            var1 = var1.substring("red:".length());
         } else if (var6.startsWith("green:")) {
            var7 = 2;
            var1 = var1.substring("green:".length());
         } else if (var6.startsWith("cyan:")) {
            var7 = 3;
            var1 = var1.substring("cyan:".length());
         } else if (var6.startsWith("purple:")) {
            var7 = 4;
            var1 = var1.substring("purple:".length());
         } else if (var6.startsWith("white:")) {
            var7 = 5;
            var1 = var1.substring("white:".length());
         } else if (var6.startsWith("flash1:")) {
            var7 = 6;
            var1 = var1.substring("flash1:".length());
         } else if (var6.startsWith("flash2:")) {
            var7 = 7;
            var1 = var1.substring("flash2:".length());
         } else if (var6.startsWith("flash3:")) {
            var7 = 8;
            var1 = var1.substring("flash3:".length());
         } else if (var6.startsWith("glow1:")) {
            var7 = 9;
            var1 = var1.substring("glow1:".length());
         } else if (var6.startsWith("glow2:")) {
            var7 = 10;
            var1 = var1.substring("glow2:".length());
         } else if (var6.startsWith("glow3:")) {
            var7 = 11;
            var1 = var1.substring("glow3:".length());
         }
      }

      var6 = var1.toLowerCase();
      byte var8 = 0;
      if (var6.startsWith("wave:")) {
         var8 = 1;
         var1 = var1.substring("wave:".length());
      } else if (var6.startsWith("wave2:")) {
         var8 = 2;
         var1 = var1.substring("wave2:".length());
      } else if (var6.startsWith("shake:")) {
         var8 = 3;
         var1 = var1.substring("shake:".length());
      } else if (var6.startsWith("scroll:")) {
         var8 = 4;
         var1 = var1.substring("scroll:".length());
      } else if (var6.startsWith("slide:")) {
         var8 = 5;
         var1 = var1.substring("slide:".length());
      } else if (var2 != Language.Language_EN) {
         if (var6.startsWith("wave:")) {
            var8 = 1;
            var1 = var1.substring("wave:".length());
         } else if (var6.startsWith("wave2:")) {
            var8 = 2;
            var1 = var1.substring("wave2:".length());
         } else if (var6.startsWith("shake:")) {
            var8 = 3;
            var1 = var1.substring("shake:".length());
         } else if (var6.startsWith("scroll:")) {
            var8 = 4;
            var1 = var1.substring("scroll:".length());
         } else if (var6.startsWith("slide:")) {
            var8 = 5;
            var1 = var1.substring("slide:".length());
         }
      }

      var4.packetBuffer.writeByte(var7);
      var4.packetBuffer.writeByte(var8);
      BufferedSource.method7683(var4.packetBuffer, var1);
      if (var0 == class313.field3722.rsOrdinal()) {
         var4.packetBuffer.writeByte(var3);
      }

      var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5);
      return var4;
   }
}
