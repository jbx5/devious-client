import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("em")
public class class154 extends class139 {
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Lah;"
   )
   @Export("soundCache")
   public static SoundCache soundCache;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      longValue = -561702384304559325L
   )
   long field1763;
   @ObfuscatedName("w")
   String field1765;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -369907185
   )
   int field1764;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   final class142 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lex;)V"
   )
   class154(class142 var1) {
      this.this$0 = var1;
      this.field1763 = -1L;
      this.field1765 = null;
      this.field1764 = 0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;S)V",
      garbageValue = "-5782"
   )
   void vmethod3394(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         this.field1763 = var1.readLong();
      }

      this.field1765 = var1.readStringCp1252NullTerminatedOrNull();
      this.field1764 = var1.readUnsignedShort();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Leb;B)V",
      garbageValue = "-26"
   )
   void vmethod3393(ClanSettings var1) {
      var1.method3230(this.field1763, this.field1765, this.field1764);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
      garbageValue = "1149827152"
   )
   static boolean method3319(String var0, int var1, String var2) {
      if (var1 == 0) {
         try {
            if (!class31.field186.startsWith("win")) {
               throw new Exception();
            } else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var14 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var4 = 0; var4 < var0.length(); ++var4) {
                  if (var14.indexOf(var0.charAt(var4)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var8) {
            return false;
         }
      } else if (var1 == 1) {
         try {
            Applet var7 = class31.field190;
            Object[] var5 = new Object[]{(new URL(class31.field190.getCodeBase(), var0)).toString()};
            Object var13 = JSObject.getWindow(var7).call(var2, var5);
            return var13 != null;
         } catch (Throwable var9) {
            return false;
         }
      } else if (var1 == 2) {
         try {
            class31.field190.getAppletContext().showDocument(new URL(class31.field190.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var10) {
            return false;
         }
      } else if (var1 == 3) {
         try {
            Applet var3 = class31.field190;
            JSObject.getWindow(var3).call("loggedout", (Object[])null);
         } catch (Throwable var12) {
         }

         try {
            class31.field190.getAppletContext().showDocument(new URL(class31.field190.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var11) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
