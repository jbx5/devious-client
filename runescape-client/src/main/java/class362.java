import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
public class class362 implements Iterator {
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lry;"
   )
   static IndexedSprite field4314;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Lfs;"
   )
   @Export("clock")
   static Clock clock;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lmd;"
   )
   class363 field4317;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 2094821203
   )
   int field4312 = 0;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1109029639
   )
   int field4313;

   @ObfuscatedSignature(
      descriptor = "(Lmd;)V"
   )
   class362(class363 var1) {
      this.field4313 = this.field4317.field4324;
      this.field4317 = var1;
   }

   public Object next() {
      if (this.field4317.field4324 != this.field4313) {
         throw new ConcurrentModificationException();
      } else if (this.field4312 < this.field4317.field4322) {
         Object var1 = this.field4317.field4325[this.field4312].field4310;
         ++this.field4312;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   public boolean hasNext() {
      return this.field4312 < this.field4317.field4322;
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1160860137"
   )
   static void method6840() {
      Login.Login_username = Login.Login_username.trim();
      if (Login.Login_username.length() == 0) {
         MusicPatchNode2.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
      } else {
         long var1;
         try {
            URL var3 = new URL(class135.method2990("services", false) + "m=accountappeal/login.ws");
            URLConnection var4 = var3.openConnection();
            var4.setRequestProperty("connection", "close");
            var4.setDoInput(true);
            var4.setDoOutput(true);
            var4.setConnectTimeout(5000);
            OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream());
            var5.write("data1=req");
            var5.flush();
            InputStream var6 = var4.getInputStream();
            Buffer var7 = new Buffer(new byte[1000]);

            while(true) {
               int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset);
               if (var8 == -1) {
                  var7.offset = 0;
                  long var10 = var7.readLong();
                  var1 = var10;
                  break;
               }

               var7.offset += var8;
               if (var7.offset >= 1000) {
                  var1 = 0L;
                  break;
               }
            }
         } catch (Exception var14) {
            var1 = 0L;
         }

         int var0;
         if (var1 == 0L) {
            var0 = 5;
         } else {
            var0 = class357.method6825(var1, Login.Login_username);
         }

         switch (var0) {
            case 2:
               MusicPatchNode2.setLoginResponseString(Strings.field3924, Strings.field4045, Strings.field4057);
               GrandExchangeOfferOwnWorldComparator.method1171(6);
               break;
            case 3:
               MusicPatchNode2.setLoginResponseString("", "Error connecting to server.", "");
               break;
            case 4:
               MusicPatchNode2.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
               break;
            case 5:
               MusicPatchNode2.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
               break;
            case 6:
               MusicPatchNode2.setLoginResponseString("", "Error connecting to server.", "");
               break;
            case 7:
               MusicPatchNode2.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
         }

      }
   }
}
