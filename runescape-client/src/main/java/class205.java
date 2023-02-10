import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class205 implements class29 {
   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "Lrg;"
   )
   @Export("worldSelectRightSprite")
   static IndexedSprite worldSelectRightSprite;
   @ObfuscatedName("f")
   char[] field2326 = new char[128];
   @ObfuscatedName("w")
   int[] field2327 = new int[128];
   @ObfuscatedName("v")
   public int[] field2328 = new int[128];
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 667075159
   )
   public int field2335 = 0;
   @ObfuscatedName("z")
   int[] field2337 = new int[128];
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -396683223
   )
   int field2329 = 0;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -181633771
   )
   int field2332 = 0;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1658572189
   )
   int field2331 = 0;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1598015947
   )
   int field2334 = 0;
   @ObfuscatedName("k")
   boolean[] field2338 = new boolean[112];
   @ObfuscatedName("c")
   boolean[] field2336 = new boolean[112];
   @ObfuscatedName("r")
   boolean[] field2330 = new boolean[112];
   @ObfuscatedName("b")
   public char field2333;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1124742409
   )
   public int field2339;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "110"
   )
   public boolean vmethod4135(int var1) {
      this.method4138(var1);
      this.field2338[var1] = true;
      this.field2336[var1] = true;
      this.field2330[var1] = false;
      this.field2328[++this.field2335 - 1] = var1;
      return true;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "11"
   )
   public boolean vmethod4136(int var1) {
      this.field2338[var1] = false;
      this.field2336[var1] = false;
      this.field2330[var1] = true;
      this.field2337[++this.field2329 - 1] = var1;
      return true;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "783044550"
   )
   public boolean vmethod4179(char var1) {
      int var2 = this.field2331 + 1 & 127;
      if (var2 != this.field2332) {
         this.field2327[this.field2331] = -1;
         this.field2326[this.field2331] = var1;
         this.field2331 = var2;
      }

      return false;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(ZI)Z",
      garbageValue = "653857297"
   )
   public boolean vmethod4139(boolean var1) {
      return false;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1103025753"
   )
   void method4138(int var1) {
      int var2 = this.field2331 + 1 & 127;
      if (var2 != this.field2332) {
         this.field2327[this.field2331] = var1;
         this.field2326[this.field2331] = 0;
         this.field2331 = var2;
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "8"
   )
   public void method4140() {
      this.field2332 = this.field2334;
      this.field2334 = this.field2331;
      this.field2335 = 0;
      this.field2329 = 0;
      Arrays.fill(this.field2336, false);
      Arrays.fill(this.field2330, false);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "51"
   )
   public final boolean method4141() {
      if (this.field2334 == this.field2332) {
         return false;
      } else {
         this.field2339 = this.field2327[this.field2332];
         this.field2333 = this.field2326[this.field2332];
         this.field2332 = this.field2332 + 1 & 127;
         return true;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "0"
   )
   public boolean method4142(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2336[var1] : false;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "44"
   )
   public boolean method4143(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2338[var1] : false;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "32514287"
   )
   public boolean method4157(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field2330[var1] : false;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(B)[I",
      garbageValue = "-100"
   )
   public int[] method4177() {
      int[] var1 = new int[this.field2335];

      for(int var2 = 0; var2 < this.field2335; ++var2) {
         var1[var2] = this.field2328[var2];
      }

      return var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "848909243"
   )
   public int[] method4145() {
      int[] var1 = new int[this.field2329];

      for(int var2 = 0; var2 < this.field2329; ++var2) {
         var1[var2] = this.field2337[var2];
      }

      return var1;
   }

   @ObfuscatedName("je")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-90"
   )
   @Export("resumePauseWidget")
   static void resumePauseWidget(int var0, int var1) {
      PacketBufferNode var2 = Renderable.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
      var2.packetBuffer.writeShort(var1);
      var2.packetBuffer.writeInt(var0);
      Client.packetWriter.addNode(var2);
   }
}
