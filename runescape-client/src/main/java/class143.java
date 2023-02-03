import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class143 extends class139 {
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -312550919
   )
   @Export("loginBoxCenter")
   static int loginBoxCenter;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1159970201
   )
   int field1668;
   @ObfuscatedName("w")
   byte field1671;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   final class142 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lex;)V"
   )
   class143(class142 var1) {
      this.this$0 = var1;
      this.field1668 = -1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;S)V",
      garbageValue = "-5782"
   )
   void vmethod3394(Buffer var1) {
      this.field1668 = var1.readUnsignedShort();
      this.field1671 = var1.readByte();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Leb;B)V",
      garbageValue = "-26"
   )
   void vmethod3393(ClanSettings var1) {
      var1.method3261(this.field1668, this.field1671);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/security/SecureRandom;",
      garbageValue = "-1336695793"
   )
   static SecureRandom method3179() {
      SecureRandom var0 = new SecureRandom();
      var0.nextInt();
      return var0;
   }
}
