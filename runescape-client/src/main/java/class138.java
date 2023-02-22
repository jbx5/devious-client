import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fb")
public class class138 extends class140 {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      longValue = 5970519739755097027L
   )
   long field1610;
   @ObfuscatedName("al")
   String field1608;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfo;"
   )
   final class143 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfo;)V"
   )
   class138(class143 var1) {
      this.this$0 = var1;
      this.field1610 = -1L;
      this.field1608 = null;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "-1979280996"
   )
   void vmethod3361(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         this.field1610 = var1.readLong();
      }

      this.field1608 = var1.readStringCp1252NullTerminatedOrNull();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lfi;B)V",
      garbageValue = "29"
   )
   void vmethod3362(ClanSettings var1) {
      var1.method3199(this.field1610, this.field1608, 0);
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZI)I",
      garbageValue = "1640153201"
   )
   static int method3096(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.LOGOUT) {
         Client.logoutTimer = 250;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("gp")
   @ObfuscatedSignature(
      descriptor = "(I)J",
      garbageValue = "-959228999"
   )
   static long method3095() {
      return Client.field671;
   }
}
