import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tl")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
   @ObfuscatedName("an")
   static final int[] field5013 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Ltq;"
   )
   @Export("isaacCipher")
   IsaacCipher isaacCipher;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -733415299
   )
   @Export("bitIndex")
   int bitIndex;

   public PacketBuffer(int var1) {
      super(var1);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "([II)V",
      garbageValue = "1061846008"
   )
   @Export("newIsaacCipher")
   public void newIsaacCipher(int[] var1) {
      this.isaacCipher = new IsaacCipher(var1);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ltq;I)V",
      garbageValue = "-1941366690"
   )
   @Export("setIsaacCipher")
   public void setIsaacCipher(IsaacCipher var1) {
      this.isaacCipher = var1;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-680381205"
   )
   @Export("writeByteIsaac")
   public void writeByteIsaac(int var1) {
      super.array[++super.offset - 1] = (byte)(var1 + this.isaacCipher.nextInt());
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1389710579"
   )
   @Export("readByteIsaac")
   public int readByteIsaac() {
      return super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-52"
   )
   public boolean method8881() {
      int var1 = super.array[super.offset] - this.isaacCipher.method9522() & 255;
      return var1 >= 128;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "124"
   )
   @Export("readSmartByteShortIsaac")
   public int readSmartByteShortIsaac() {
      int var1 = super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
      return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "-630525326"
   )
   public void method8876(byte[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var4 + var2] = (byte)(super.array[++super.offset - 1] - this.isaacCipher.nextInt());
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1703567761"
   )
   @Export("importIndex")
   public void importIndex() {
      this.bitIndex = super.offset * 8;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "46"
   )
   @Export("readBits")
   public int readBits(int var1) {
      int var2 = this.bitIndex >> 3;
      int var3 = 8 - (this.bitIndex & 7);
      int var4 = 0;

      for(this.bitIndex += var1; var1 > var3; var3 = 8) {
         var4 += (super.array[var2++] & field5013[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var3 == var1) {
         var4 += super.array[var2] & field5013[var3];
      } else {
         var4 += super.array[var2] >> var3 - var1 & field5013[var1];
      }

      return var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1761710862"
   )
   @Export("exportIndex")
   public void exportIndex() {
      super.offset = (this.bitIndex + 7) / 8;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-619052134"
   )
   @Export("bitsRemaining")
   public int bitsRemaining(int var1) {
      return var1 * 8 - this.bitIndex;
   }
}
