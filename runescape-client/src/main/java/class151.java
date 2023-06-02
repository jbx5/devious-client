import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class151 extends class142 {
   @ObfuscatedName("at")
   String field1676;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfh;"
   )
   final class145 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfh;)V"
   )
   class151(class145 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)V",
      garbageValue = "59"
   )
   void vmethod3381(Buffer var1) {
      this.field1676 = var1.readStringCp1252NullTerminated();
      var1.readInt();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfs;B)V",
      garbageValue = "-72"
   )
   void vmethod3382(ClanSettings var1) {
      var1.name = this.field1676;
   }
}
