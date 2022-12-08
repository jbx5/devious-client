import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class135 extends class136 {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -240984025
   )
   int field1645;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   final class139 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lem;)V"
   )
   class135(class139 var1) {
      this.this$0 = var1;
      this.field1645 = -1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1101327225"
   )
   void vmethod3349(Buffer var1) {
      this.field1645 = var1.readUnsignedShort();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lep;I)V",
      garbageValue = "839088249"
   )
   void vmethod3350(ClanSettings var1) {
      var1.method3171(this.field1645);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)[Llz;",
      garbageValue = "-1508281250"
   )
   static GameBuild[] method3065() {
      return new GameBuild[]{GameBuild.RC, GameBuild.WIP, GameBuild.BUILDLIVE, GameBuild.LIVE};
   }
}
