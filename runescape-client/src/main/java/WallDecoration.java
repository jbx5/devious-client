import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("WallDecoration")
public final class WallDecoration {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -536654139
   )
   @Export("z")
   int z;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1292086545
   )
   @Export("x")
   int x;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1077329713
   )
   @Export("y")
   int y;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1453698973
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1019318381
   )
   @Export("xOffset")
   int xOffset;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1309751723
   )
   @Export("orientation2")
   int orientation2;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1052631263
   )
   @Export("yOffset")
   int yOffset;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Liq;"
   )
   @Export("renderable1")
   public Renderable renderable1;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Liq;"
   )
   @Export("renderable2")
   public Renderable renderable2;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      longValue = -1629454309586530347L
   )
   @Export("tag")
   public long tag = 0L;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1909429839
   )
   @Export("flags")
   int flags = 0;

   WallDecoration() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)Lhu;",
      garbageValue = "-1543381994"
   )
   @Export("getObjectDefinition")
   public static ObjectComposition getObjectDefinition(int var0) {
      ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
         var1 = new ObjectComposition();
         var1.id = var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         if (var1.isSolid) {
            var1.interactType = 0;
            var1.boolean1 = false;
         }

         ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "119525354"
   )
   static void method4776() {
      Login.Login_username = Login.Login_username.trim();
      if (Login.Login_username.length() == 0) {
         Tile.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
      } else {
         long var1 = Friend.method7512();
         byte var0;
         if (0L == var1) {
            var0 = 5;
         } else {
            String var4 = Login.Login_username;
            Random var5 = new Random();
            Buffer var6 = new Buffer(128);
            Buffer var7 = new Buffer(128);
            int[] var8 = new int[]{var5.nextInt(), var5.nextInt(), (int)(var1 >> 32), (int)var1};
            var6.writeByte(10);

            int var9;
            for(var9 = 0; var9 < 4; ++var9) {
               var6.writeInt(var5.nextInt());
            }

            var6.writeInt(var8[0]);
            var6.writeInt(var8[1]);
            var6.writeLong(var1);
            var6.writeLong(0L);

            for(var9 = 0; var9 < 4; ++var9) {
               var6.writeInt(var5.nextInt());
            }

            var6.encryptRsa(class70.field863, class70.field867);
            var7.writeByte(10);

            for(var9 = 0; var9 < 3; ++var9) {
               var7.writeInt(var5.nextInt());
            }

            var7.writeLong(var5.nextLong());
            var7.writeLongMedium(var5.nextLong());
            if (Client.randomDatData != null) {
               var7.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
            } else {
               byte[] var10 = new byte[24];

               try {
                  JagexCache.JagexCache_randomDat.seek(0L);
                  JagexCache.JagexCache_randomDat.readFully(var10);

                  int var11;
                  for(var11 = 0; var11 < 24 && var10[var11] == 0; ++var11) {
                  }

                  if (var11 >= 24) {
                     throw new IOException();
                  }
               } catch (Exception var23) {
                  for(int var12 = 0; var12 < 24; ++var12) {
                     var10[var12] = -1;
                  }
               }

               var7.writeBytes(var10, 0, var10.length);
            }

            var7.writeLong(var5.nextLong());
            var7.encryptRsa(class70.field863, class70.field867);
            var9 = WorldMapLabel.stringCp1252NullTerminatedByteSize(var4);
            if (var9 % 8 != 0) {
               var9 += 8 - var9 % 8;
            }

            Buffer var24 = new Buffer(var9);
            var24.writeStringCp1252NullTerminated(var4);
            var24.offset = var9;
            var24.xteaEncryptAll(var8);
            Buffer var18 = new Buffer(var6.offset + var7.offset + var24.offset + 5);
            var18.writeByte(2);
            var18.writeByte(var6.offset);
            var18.writeBytes(var6.array, 0, var6.offset);
            var18.writeByte(var7.offset);
            var18.writeBytes(var7.array, 0, var7.offset);
            var18.writeShort(var24.offset);
            var18.writeBytes(var24.array, 0, var24.offset);
            String var20 = GrandExchangeEvents.method6539(var18.array);

            byte var3;
            try {
               URL var13 = new URL(class154.method3285("services", false) + "m=accountappeal/login.ws");
               URLConnection var14 = var13.openConnection();
               var14.setDoInput(true);
               var14.setDoOutput(true);
               var14.setConnectTimeout(5000);
               OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream());
               var15.write("data2=" + class431.method7966(var20) + "&dest=" + class431.method7966("passwordchoice.ws"));
               var15.flush();
               InputStream var16 = var14.getInputStream();
               var18 = new Buffer(new byte[1000]);

               while(true) {
                  int var17 = var16.read(var18.array, var18.offset, 1000 - var18.offset);
                  if (var17 == -1) {
                     var15.close();
                     var16.close();
                     String var21 = new String(var18.array);
                     if (var21.startsWith("OFFLINE")) {
                        var3 = 4;
                     } else if (var21.startsWith("WRONG")) {
                        var3 = 7;
                     } else if (var21.startsWith("RELOAD")) {
                        var3 = 3;
                     } else if (var21.startsWith("Not permitted for social network accounts.")) {
                        var3 = 6;
                     } else {
                        var18.xteaDecryptAll(var8);

                        while(var18.offset > 0 && var18.array[var18.offset - 1] == 0) {
                           --var18.offset;
                        }

                        var21 = new String(var18.array, 0, var18.offset);
                        if (class13.method162(var21)) {
                           KeyHandler.openURL(var21, true, false);
                           var3 = 2;
                        } else {
                           var3 = 5;
                        }
                     }
                     break;
                  }

                  var18.offset += var17;
                  if (var18.offset >= 1000) {
                     var3 = 5;
                     break;
                  }
               }
            } catch (Throwable var22) {
               var22.printStackTrace();
               var3 = 5;
            }

            var0 = var3;
         }

         switch (var0) {
            case 2:
               Tile.setLoginResponseString(Strings.field3852, Strings.field4081, Strings.field4082);
               class14.method173(6);
               break;
            case 3:
               Tile.setLoginResponseString("", "Error connecting to server.", "");
               break;
            case 4:
               Tile.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
               break;
            case 5:
               Tile.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
               break;
            case 6:
               Tile.setLoginResponseString("", "Error connecting to server.", "");
               break;
            case 7:
               Tile.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
         }

      }
   }

   @ObfuscatedName("mp")
   @ObfuscatedSignature(
      descriptor = "(Lmy;I)Z",
      garbageValue = "2104914841"
   )
   @Export("isComponentHidden")
   static boolean isComponentHidden(Widget var0) {
      return var0.isHidden;
   }
}
