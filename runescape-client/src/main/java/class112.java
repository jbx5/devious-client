import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("en")
public class class112 extends UrlRequester {
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -455411853
   )
   static int field1400;
   @ObfuscatedName("ds")
   static boolean field1401;
   @ObfuscatedName("ax")
   final boolean field1402;

   public class112(boolean var1, int var2) {
      super(var2);
      this.field1402 = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Let;I)V",
      garbageValue = "2051535253"
   )
   void vmethod2824(UrlRequest var1) throws IOException {
      URLConnection var2 = null;
      boolean var9 = false;

      HttpURLConnection var12;
      label139: {
         label131: {
            try {
               label134: {
                  var9 = true;
                  String var3 = var1.field1407.getProtocol();
                  if (var3.equals("http")) {
                     var2 = this.method2825(var1);
                  } else {
                     if (!var3.equals("https")) {
                        var1.field1403 = UrlRequest.field1405;
                        var9 = false;
                        break label134;
                     }

                     var2 = this.method2823(var1);
                  }

                  this.method2803(var2, var1);
                  var9 = false;
                  break label139;
               }
            } catch (IOException var10) {
               var1.field1403 = UrlRequest.field1405;
               var9 = false;
               break label131;
            } finally {
               if (var9) {
                  if (var2 != null && var2 instanceof HttpURLConnection) {
                     HttpURLConnection var6 = (HttpURLConnection)var2;
                     var6.disconnect();
                  }

               }
            }

            if (var2 != null && var2 instanceof HttpURLConnection) {
               HttpURLConnection var4 = (HttpURLConnection)var2;
               var4.disconnect();
            }

            return;
         }

         if (var2 != null && var2 instanceof HttpURLConnection) {
            var12 = (HttpURLConnection)var2;
            var12.disconnect();
         }

         return;
      }

      if (var2 != null && var2 instanceof HttpURLConnection) {
         var12 = (HttpURLConnection)var2;
         var12.disconnect();
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Let;B)Ljava/net/URLConnection;",
      garbageValue = "-96"
   )
   URLConnection method2825(UrlRequest var1) throws IOException {
      URLConnection var2 = var1.field1407.openConnection();
      this.method2802(var2);
      return var2;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Let;I)Ljava/net/URLConnection;",
      garbageValue = "-988635270"
   )
   URLConnection method2823(UrlRequest var1) throws IOException {
      HttpsURLConnection var2 = (HttpsURLConnection)var1.field1407.openConnection();
      if (!this.field1402) {
         var2.setSSLSocketFactory(class15.method206());
      }

      this.method2802(var2);
      return var2;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZB)I",
      garbageValue = "69"
   )
   static int method2828(int var0, Script var1, boolean var2) {
      Widget var7;
      if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
         int var4;
         if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
            var7 = var2 ? class53.scriptDotWidget : Interpreter.scriptActiveWidget;
            var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (var4 >= 1 && var4 <= 10) {
               class101 var8 = new class101(var4, var7.id, var7.childIndex, var7.itemId);
               Interpreter.field873.add(var8);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
            Interpreter.Interpreter_intStackSize -= 3;
            int var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            if (var5 >= 1 && var5 <= 10) {
               class101 var6 = new class101(var5, var3, var4, FriendSystem.getWidget(var3).itemId);
               Interpreter.field873.add(var6);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else {
            return 2;
         }
      } else if (Interpreter.field871 >= 10) {
         throw new RuntimeException();
      } else {
         if (var0 >= 2000) {
            var7 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         } else {
            var7 = var2 ? class53.scriptDotWidget : Interpreter.scriptActiveWidget;
         }

         if (var7.onResize == null) {
            return 0;
         } else {
            ScriptEvent var9 = new ScriptEvent();
            var9.widget = var7;
            var9.args = var7.onResize;
            var9.field1068 = Interpreter.field871 + 1;
            Client.scriptEvents.addFirst(var9);
            return 1;
         }
      }
   }
}
