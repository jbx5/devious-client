import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public class class149 extends class139 {
   @ObfuscatedName("ha")
   @ObfuscatedGetter(
      longValue = -8606153842002377145L
   )
   static long field1709;
   @ObfuscatedName("og")
   @ObfuscatedGetter(
      intValue = 1194823683
   )
   @Export("selectedSpellFlags")
   static int selectedSpellFlags;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1462145335
   )
   int field1708;
   @ObfuscatedName("w")
   String field1710;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   final class142 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lex;)V"
   )
   class149(class142 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;S)V",
      garbageValue = "-5782"
   )
   void vmethod3394(Buffer var1) {
      this.field1708 = var1.readInt();
      this.field1710 = var1.readStringCp1252NullTerminated();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Leb;B)V",
      garbageValue = "-26"
   )
   void vmethod3393(ClanSettings var1) {
      var1.method3242(this.field1708, this.field1710);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "1768978340"
   )
   @Export("colorStartTag")
   static String colorStartTag(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }
}
