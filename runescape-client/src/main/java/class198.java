import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public class class198 extends Node {
   @ObfuscatedName("sg")
   @ObfuscatedSignature(
      descriptor = "Leq;"
   )
   @Export("guestClanChannel")
   static ClanChannel guestClanChannel;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -581068761
   )
   public int field2243;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -298326709
   )
   public int field2236;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -326454613
   )
   public int field2239;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   public Widget field2240;

   @ObfuscatedSignature(
      descriptor = "(IIILkn;)V"
   )
   public class198(int var1, int var2, int var3, Widget var4) {
      this.field2239 = var1;
      this.field2243 = var2;
      this.field2236 = var3;
      this.field2240 = var4;
   }
}
