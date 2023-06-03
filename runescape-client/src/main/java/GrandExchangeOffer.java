import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
   @ObfuscatedName("fi")
   @ObfuscatedSignature(
      descriptor = "Lny;"
   )
   @Export("archive14")
   static Archive archive14;
   @ObfuscatedName("at")
   @Export("state")
   byte state;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1426703425
   )
   @Export("id")
   public int id;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -433042635
   )
   @Export("unitPrice")
   public int unitPrice;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1612225517
   )
   @Export("totalQuantity")
   public int totalQuantity;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -813658531
   )
   @Export("currentQuantity")
   public int currentQuantity;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -946900241
   )
   @Export("currentPrice")
   public int currentPrice;

   public GrandExchangeOffer() {
   }

   @ObfuscatedSignature(
      descriptor = "(Ltz;Z)V",
      garbageValue = "0"
   )
   public GrandExchangeOffer(Buffer var1, boolean var2) {
      this.state = var1.readByte();
      this.id = var1.readUnsignedShort();
      this.unitPrice = var1.readInt();
      this.totalQuantity = var1.readInt();
      this.currentQuantity = var1.readInt();
      this.currentPrice = var1.readInt();
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "48362830"
   )
   @Export("status")
   public int status() {
      return this.state & 7;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "1"
   )
   @Export("type")
   public int type() {
      return (this.state & 8) == 8 ? 1 : 0;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1289606404"
   )
   void method6845(int var1) {
      this.state &= -8;
      this.state = (byte)(this.state | var1 & 7);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-882012274"
   )
   void method6855(int var1) {
      this.state &= -9;
      if (var1 == 1) {
         this.state = (byte)(this.state | 8);
      }

   }
}
