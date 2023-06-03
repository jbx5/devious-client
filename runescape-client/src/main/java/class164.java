import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
public class class164 extends class142 {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      longValue = -4056701840650155267L
   )
   long field1774;
   @ObfuscatedName("an")
   String field1775;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfh;"
   )
   final class145 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfh;)V"
   )
   class164(class145 var1) {
      this.this$0 = var1;
      this.field1774 = -1L;
      this.field1775 = null;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)V",
      garbageValue = "59"
   )
   void vmethod3381(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         this.field1774 = var1.readLong();
      }

      this.field1775 = var1.readStringCp1252NullTerminatedOrNull();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfs;B)V",
      garbageValue = "-72"
   )
   void vmethod3382(ClanSettings var1) {
      var1.method3210(this.field1774, this.field1775);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lnq;I)V",
      garbageValue = "-2001205388"
   )
   public static void method3365(AbstractArchive var0) {
      FloorOverlayDefinition.FloorOverlayDefinition_archive = var0;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)I",
      garbageValue = "20"
   )
   static final int method3368(int var0, int var1, int var2, int var3) {
      return var0 * var2 - var3 * var1 >> 16;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1509455427"
   )
   static void method3362(boolean var0) {
      byte var1 = 0;
      boolean var2 = class10.clientPreferences.method2454() >= Client.field508;
      if (!var2) {
         var1 = 12;
      } else if (class347.client.method1201() || class347.client.method1509() || class347.client.method1202()) {
         var1 = 10;
      }

      class390.method7249(var1);
      if (var0) {
         Login.Login_username = "";
         Login.Login_password = "";
         class322.field3521 = 0;
         SoundSystem.otp = "";
      }

      Messages.method2771();
      WorldMapSectionType.method5418();
   }

   @ObfuscatedName("mr")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "11"
   )
   static final void method3366(int var0) {
      var0 = Math.max(Math.min(var0, 100), 0);
      var0 = 100 - var0;
      float var1 = 0.5F + (float)var0 / 200.0F;
      class392.method7411((double)var1);
   }
}
