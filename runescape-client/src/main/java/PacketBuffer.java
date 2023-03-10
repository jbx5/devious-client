import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
   @ObfuscatedName("al")
   static final int[] field4900 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   @ObfuscatedName("jd")
   @Export("regionMapArchiveIds")
   static int[] regionMapArchiveIds;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Ltk;"
   )
   @Export("isaacCipher")
   IsaacCipher isaacCipher;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1869193379
   )
   @Export("bitIndex")
   int bitIndex;

   public PacketBuffer(int var1) {
      super(var1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "([II)V",
      garbageValue = "-750496198"
   )
   @Export("newIsaacCipher")
   public void newIsaacCipher(int[] var1) {
      this.isaacCipher = new IsaacCipher(var1);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Ltk;I)V",
      garbageValue = "-1684392825"
   )
   @Export("setIsaacCipher")
   public void setIsaacCipher(IsaacCipher var1) {
      this.isaacCipher = var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-729254230"
   )
   @Export("writeByteIsaac")
   public void writeByteIsaac(int var1) {
      super.array[++super.offset - 1] = (byte)(var1 + this.isaacCipher.nextInt());
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "1"
   )
   @Export("readByteIsaac")
   public int readByteIsaac() {
      return super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1833529225"
   )
   public boolean method8565() {
      int var1 = super.array[super.offset] - this.isaacCipher.method9192() & 255;
      return var1 >= 128;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "888042879"
   )
   @Export("readSmartByteShortIsaac")
   public int readSmartByteShortIsaac() {
      int var1 = super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
      return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "([BIIB)V",
      garbageValue = "-96"
   )
   public void method8567(byte[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var4 + var2] = (byte)(super.array[++super.offset - 1] - this.isaacCipher.nextInt());
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1617890374"
   )
   @Export("importIndex")
   public void importIndex() {
      this.bitIndex = super.offset * 8;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-392449086"
   )
   @Export("readBits")
   public int readBits(int var1) {
      int var2 = this.bitIndex >> 3;
      int var3 = 8 - (this.bitIndex & 7);
      int var4 = 0;

      for(this.bitIndex += var1; var1 > var3; var3 = 8) {
         var4 += (super.array[var2++] & field4900[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var3 == var1) {
         var4 += super.array[var2] & field4900[var3];
      } else {
         var4 += super.array[var2] >> var3 - var1 & field4900[var1];
      }

      return var4;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-291375239"
   )
   @Export("exportIndex")
   public void exportIndex() {
      super.offset = (this.bitIndex + 7) / 8;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "70"
   )
   @Export("bitsRemaining")
   public int bitsRemaining(int var1) {
      return var1 * 8 - this.bitIndex;
   }
}
