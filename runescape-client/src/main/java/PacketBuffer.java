import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ru")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
   @ObfuscatedName("w")
   static final int[] field4933 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lrt;"
   )
   @Export("isaacCipher")
   IsaacCipher isaacCipher;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -570585115
   )
   @Export("bitIndex")
   int bitIndex;

   public PacketBuffer(int var1) {
      super(var1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "([II)V",
      garbageValue = "1474539656"
   )
   @Export("newIsaacCipher")
   public void newIsaacCipher(int[] var1) {
      this.isaacCipher = new IsaacCipher(var1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lrt;I)V",
      garbageValue = "-1369009398"
   )
   @Export("setIsaacCipher")
   public void setIsaacCipher(IsaacCipher var1) {
      this.isaacCipher = var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1754187133"
   )
   @Export("writeByteIsaac")
   public void writeByteIsaac(int var1) {
      super.array[++super.offset - 1] = (byte)(var1 + this.isaacCipher.nextInt());
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-86"
   )
   @Export("readByteIsaac")
   public int readByteIsaac() {
      return super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-50"
   )
   public boolean method8624() {
      int var1 = super.array[super.offset] - this.isaacCipher.method9218() & 255;
      return var1 >= 128;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-33"
   )
   @Export("readSmartByteShortIsaac")
   public int readSmartByteShortIsaac() {
      int var1 = super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
      return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "-726696255"
   )
   public void method8595(byte[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var4 + var2] = (byte)(super.array[++super.offset - 1] - this.isaacCipher.nextInt());
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1116056157"
   )
   @Export("importIndex")
   public void importIndex() {
      this.bitIndex = super.offset * 8;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1915482226"
   )
   @Export("readBits")
   public int readBits(int var1) {
      int var2 = this.bitIndex >> 3;
      int var3 = 8 - (this.bitIndex & 7);
      int var4 = 0;

      for(this.bitIndex += var1; var1 > var3; var3 = 8) {
         var4 += (super.array[var2++] & field4933[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var3 == var1) {
         var4 += super.array[var2] & field4933[var3];
      } else {
         var4 += super.array[var2] >> var3 - var1 & field4933[var1];
      }

      return var4;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "31"
   )
   @Export("exportIndex")
   public void exportIndex() {
      super.offset = (this.bitIndex + 7) / 8;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1039020975"
   )
   @Export("bitsRemaining")
   public int bitsRemaining(int var1) {
      return var1 * 8 - this.bitIndex;
   }
}
