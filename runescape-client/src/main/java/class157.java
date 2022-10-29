import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class157 extends class135 {
   @ObfuscatedName("j")
   @Export("PcmPlayer_stereo")
   protected static boolean PcmPlayer_stereo;
   @ObfuscatedName("ef")
   @ObfuscatedSignature(
      descriptor = "Llx;"
   )
   @Export("archive2")
   static Archive archive2;
   @ObfuscatedName("qh")
   @ObfuscatedSignature(
      descriptor = "Lou;"
   )
   static class411 field1745;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      longValue = -982145775231130805L
   )
   long field1746;
   @ObfuscatedName("f")
   String field1743;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lel;"
   )
   final class138 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lel;)V"
   )
   class157(class138 var1) {
      this.this$0 = var1;
      this.field1746 = -1L;
      this.field1743 = null;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-1428026624"
   )
   void vmethod3254(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         this.field1746 = var1.readLong();
      }

      this.field1743 = var1.readStringCp1252NullTerminatedOrNull();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ler;B)V",
      garbageValue = "-110"
   )
   void vmethod3248(ClanSettings var1) {
      var1.method3122(this.field1746, this.field1743);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)[Lcy;",
      garbageValue = "1313385775"
   )
   static class87[] method3236() {
      return new class87[]{class87.field1080, class87.field1078, class87.field1081, class87.field1082, class87.field1084, class87.field1077};
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IZII)V",
      garbageValue = "582610046"
   )
   public static final void method3235(int var0, boolean var1, int var2) {
      if (var0 >= 8000 && var0 <= 48000) {
         SoundCache.field337 = var0;
         PcmPlayer_stereo = var1;
         class281.field3276 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }
}
