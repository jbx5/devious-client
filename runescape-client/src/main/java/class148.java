import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class class148 extends class139 {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -448895225
   )
   static int field1702;
   @ObfuscatedName("eb")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   static Archive field1704;
   @ObfuscatedName("nl")
   @ObfuscatedSignature(
      descriptor = "Lbs;"
   )
   @Export("tempMenuAction")
   static MenuAction tempMenuAction;
   @ObfuscatedName("f")
   String field1706;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   final class142 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lex;)V"
   )
   class148(class142 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;S)V",
      garbageValue = "-5782"
   )
   void vmethod3394(Buffer var1) {
      this.field1706 = var1.readStringCp1252NullTerminated();
      var1.readInt();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Leb;B)V",
      garbageValue = "-26"
   )
   void vmethod3393(ClanSettings var1) {
      var1.name = this.field1706;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lln;IIIZI)V",
      garbageValue = "1410945003"
   )
   public static void method3216(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
      class290.musicPlayerStatus = 1;
      class6.musicTrackArchive = var0;
      class20.musicTrackGroupId = var1;
      class161.musicTrackFileId = var2;
      class290.musicTrackVolume = var3;
      class423.musicTrackBoolean = var4;
      class203.pcmSampleLength = 10000;
   }
}
