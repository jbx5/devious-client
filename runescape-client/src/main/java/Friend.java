import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
@Implements("Friend")
public class Friend extends Buddy {
   @ObfuscatedName("kx")
   @ObfuscatedSignature(
      descriptor = "[Lsn;"
   )
   @Export("crossSprites")
   static SpritePixels[] crossSprites;
   @ObfuscatedName("aj")
   boolean field4509;
   @ObfuscatedName("al")
   boolean field4508;

   Friend() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lpk;I)I",
      garbageValue = "438227424"
   )
   @Export("compareToFriend")
   int compareToFriend(Friend var1) {
      if (super.world == Client.worldId && Client.worldId != var1.world) {
         return -1;
      } else if (Client.worldId == var1.world && super.world != Client.worldId) {
         return 1;
      } else if (super.world != 0 && var1.world == 0) {
         return -1;
      } else if (var1.world != 0 && super.world == 0) {
         return 1;
      } else if (this.field4509 && !var1.field4509) {
         return -1;
      } else if (!this.field4509 && var1.field4509) {
         return 1;
      } else if (this.field4508 && !var1.field4508) {
         return -1;
      } else if (!this.field4508 && var1.field4508) {
         return 1;
      } else {
         return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lpb;I)I",
      garbageValue = "-691594669"
   )
   @Export("compareTo_user")
   public int compareTo_user(User var1) {
      return this.compareToFriend((Friend)var1);
   }

   public int compareTo(Object var1) {
      return this.compareToFriend((Friend)var1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)J",
      garbageValue = "-1720464024"
   )
   static long method7512() {
      try {
         URL var0 = new URL(class154.method3285("services", false) + "m=accountappeal/login.ws");
         URLConnection var1 = var0.openConnection();
         var1.setRequestProperty("connection", "close");
         var1.setDoInput(true);
         var1.setDoOutput(true);
         var1.setConnectTimeout(5000);
         OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
         var2.write("data1=req");
         var2.flush();
         InputStream var3 = var1.getInputStream();
         Buffer var4 = new Buffer(new byte[1000]);

         do {
            int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset);
            if (var5 == -1) {
               var4.offset = 0;
               long var7 = var4.readLong();
               return var7;
            }

            var4.offset += var5;
         } while(var4.offset < 1000);

         return 0L;
      } catch (Exception var9) {
         return 0L;
      }
   }
}
