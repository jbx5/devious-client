import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
public class class155 extends class136 {
   @ObfuscatedName("tg")
   @ObfuscatedGetter(
      intValue = 29638656
   )
   static int field1787;
   @ObfuscatedName("dh")
   static boolean field1785;
   @ObfuscatedName("fq")
   @ObfuscatedGetter(
      intValue = 1288182377
   )
   static int field1788;
   @ObfuscatedName("lo")
   @ObfuscatedSignature(
      descriptor = "Lcj;"
   )
   @Export("localPlayer")
   static Player localPlayer;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 479857135
   )
   int field1786;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   final class139 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lem;)V"
   )
   class155(class139 var1) {
      this.this$0 = var1;
      this.field1786 = -1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1101327225"
   )
   void vmethod3349(Buffer var1) {
      this.field1786 = var1.readUnsignedShort();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lep;I)V",
      garbageValue = "839088249"
   )
   void vmethod3350(ClanSettings var1) {
      var1.method3176(this.field1786);
   }
}
