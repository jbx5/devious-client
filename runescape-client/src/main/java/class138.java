import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public class class138 extends class139 {
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Lnv;"
   )
   @Export("ItemDefinition_fontPlain11")
   public static Font ItemDefinition_fontPlain11;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 362693273
   )
   int field1645;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   final class142 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lex;)V"
   )
   class138(class142 var1) {
      this.this$0 = var1;
      this.field1645 = -1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;S)V",
      garbageValue = "-5782"
   )
   void vmethod3394(Buffer var1) {
      this.field1645 = var1.readUnsignedShort();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Leb;B)V",
      garbageValue = "-26"
   )
   void vmethod3393(ClanSettings var1) {
      var1.method3231(this.field1645);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(S)Lcy;",
      garbageValue = "190"
   )
   static ClientPreferences method3150() {
      AccessFile var0 = null;
      ClientPreferences var1 = new ClientPreferences();

      try {
         var0 = UrlRequester.getPreferencesFile("", class134.field1606.name, false);
         byte[] var2 = new byte[(int)var0.length()];

         int var4;
         for(int var3 = 0; var3 < var2.length; var3 += var4) {
            var4 = var0.read(var2, var3, var2.length - var3);
            if (var4 == -1) {
               throw new IOException();
            }
         }

         var1 = new ClientPreferences(new Buffer(var2));
      } catch (Exception var6) {
      }

      try {
         if (var0 != null) {
            var0.close();
         }
      } catch (Exception var5) {
      }

      return var1;
   }

   @ObfuscatedName("lp")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1273374954"
   )
   static final void method3149() {
      Client.field637 = Client.cycleCntr;
      WorldMapSectionType.ClanChat_inClanChat = true;
   }
}
