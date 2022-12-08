import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public class class145 extends class136 {
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1959574939
   )
   @Export("idxCount")
   public static int idxCount;
   @ObfuscatedName("j")
   @Export("musicTrackBoolean")
   public static boolean musicTrackBoolean;
   @ObfuscatedName("jz")
   @ObfuscatedGetter(
      intValue = 402004555
   )
   @Export("cameraX")
   static int cameraX;
   @ObfuscatedName("h")
   String field1708;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   final class139 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lem;)V"
   )
   class145(class139 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1101327225"
   )
   void vmethod3349(Buffer var1) {
      this.field1708 = var1.readStringCp1252NullTerminated();
      var1.readInt();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lep;I)V",
      garbageValue = "839088249"
   )
   void vmethod3350(ClanSettings var1) {
      var1.name = this.field1708;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1769477023"
   )
   public static int method3149(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }
}
