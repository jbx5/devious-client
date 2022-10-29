import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
public class class408 {
   @ObfuscatedName("jc")
   @ObfuscatedGetter(
      intValue = 1266786605
   )
   @Export("cameraPitch")
   static int cameraPitch;
   @ObfuscatedName("a")
   float field4576;
   @ObfuscatedName("f")
   float field4570;
   @ObfuscatedName("c")
   float field4571;
   @ObfuscatedName("x")
   float field4569;
   @ObfuscatedName("h")
   float field4573;
   @ObfuscatedName("j")
   float field4574;
   @ObfuscatedName("y")
   float field4575;
   @ObfuscatedName("d")
   float field4572;
   @ObfuscatedName("n")
   float field4577;
   @ObfuscatedName("r")
   float field4578;
   @ObfuscatedName("l")
   float field4579;
   @ObfuscatedName("s")
   float field4580;

   static {
      new class408();
   }

   class408() {
      this.method7713();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1824130977"
   )
   void method7713() {
      this.field4580 = 0.0F;
      this.field4579 = 0.0F;
      this.field4578 = 0.0F;
      this.field4572 = 0.0F;
      this.field4575 = 0.0F;
      this.field4574 = 0.0F;
      this.field4569 = 0.0F;
      this.field4571 = 0.0F;
      this.field4570 = 0.0F;
      this.field4577 = 1.0F;
      this.field4573 = 1.0F;
      this.field4576 = 1.0F;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(FB)V",
      garbageValue = "12"
   )
   void method7712(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.field4570;
      float var5 = this.field4573;
      float var6 = this.field4572;
      float var7 = this.field4579;
      this.field4570 = var2 * var4 - this.field4571 * var3;
      this.field4571 = var3 * var4 + var2 * this.field4571;
      this.field4573 = var2 * var5 - var3 * this.field4574;
      this.field4574 = var3 * var5 + this.field4574 * var2;
      this.field4572 = var2 * var6 - this.field4577 * var3;
      this.field4577 = this.field4577 * var2 + var3 * var6;
      this.field4579 = var7 * var2 - var3 * this.field4580;
      this.field4580 = var3 * var7 + var2 * this.field4580;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(FI)V",
      garbageValue = "-84882550"
   )
   void method7730(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.field4576;
      float var5 = this.field4569;
      float var6 = this.field4575;
      float var7 = this.field4578;
      this.field4576 = var2 * var4 + this.field4571 * var3;
      this.field4571 = this.field4571 * var2 - var3 * var4;
      this.field4569 = var5 * var2 + this.field4574 * var3;
      this.field4574 = this.field4574 * var2 - var3 * var5;
      this.field4575 = this.field4577 * var3 + var6 * var2;
      this.field4577 = this.field4577 * var2 - var6 * var3;
      this.field4578 = var3 * this.field4580 + var7 * var2;
      this.field4580 = var2 * this.field4580 - var3 * var7;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(FB)V",
      garbageValue = "-71"
   )
   void method7731(float var1) {
      float var2 = (float)Math.cos((double)var1);
      float var3 = (float)Math.sin((double)var1);
      float var4 = this.field4576;
      float var5 = this.field4569;
      float var6 = this.field4575;
      float var7 = this.field4578;
      this.field4576 = var2 * var4 - var3 * this.field4570;
      this.field4570 = var3 * var4 + this.field4570 * var2;
      this.field4569 = var2 * var5 - this.field4573 * var3;
      this.field4573 = var5 * var3 + var2 * this.field4573;
      this.field4575 = var2 * var6 - this.field4572 * var3;
      this.field4572 = this.field4572 * var2 + var6 * var3;
      this.field4578 = var7 * var2 - var3 * this.field4579;
      this.field4579 = var7 * var3 + this.field4579 * var2;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(FFFI)V",
      garbageValue = "-682979851"
   )
   void method7714(float var1, float var2, float var3) {
      this.field4578 += var1;
      this.field4579 += var2;
      this.field4580 += var3;
   }

   public String toString() {
      return this.field4576 + "," + this.field4569 + "," + this.field4575 + "," + this.field4578 + "\n" + this.field4570 + "," + this.field4573 + "," + this.field4572 + "," + this.field4579 + "\n" + this.field4571 + "," + this.field4574 + "," + this.field4577 + "," + this.field4580;
   }

   @ObfuscatedName("ll")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "946251139"
   )
   static final void method7728(int var0, int var1) {
      ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class198.guestClanChannel;
      if (var2 != null && var1 >= 0 && var1 < var2.method3215()) {
         ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
         if (var3.rank == -1) {
            String var4 = var3.username.getName();
            PacketBufferNode var5 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3039, Client.packetWriter.isaacCipher);
            var5.packetBuffer.writeByte(3 + Actor.stringCp1252NullTerminatedByteSize(var4));
            var5.packetBuffer.writeByte(var0);
            var5.packetBuffer.writeShort(var1);
            var5.packetBuffer.writeStringCp1252NullTerminated(var4);
            Client.packetWriter.addNode(var5);
         }
      }
   }
}
