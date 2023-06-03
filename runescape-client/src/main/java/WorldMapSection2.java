import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ju")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 809563467
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 744336695
   )
   @Export("planes")
   int planes;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 833331983
   )
   @Export("regionStartX")
   int regionStartX;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1574091565
   )
   @Export("regionStartY")
   int regionStartY;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -532479
   )
   @Export("regionEndX")
   int regionEndX;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1006280493
   )
   @Export("regionEndY")
   int regionEndY;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 405597805
   )
   int field2882;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -236470873
   )
   int field2883;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 644744617
   )
   int field2884;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -317224805
   )
   int field2880;

   WorldMapSection2() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lji;I)V",
      garbageValue = "941109568"
   )
   @Export("expandBounds")
   public void expandBounds(WorldMapArea var1) {
      if (var1.regionLowX > this.field2882) {
         var1.regionLowX = this.field2882;
      }

      if (var1.regionHighX < this.field2884) {
         var1.regionHighX = this.field2884;
      }

      if (var1.regionLowY > this.field2883) {
         var1.regionLowY = this.field2883;
      }

      if (var1.regionHighY < this.field2880) {
         var1.regionHighY = this.field2880;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Z",
      garbageValue = "4"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
         return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
      } else {
         return false;
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-1852131731"
   )
   @Export("containsPosition")
   public boolean containsPosition(int var1, int var2) {
      return var1 >> 6 >= this.field2882 && var1 >> 6 <= this.field2884 && var2 >> 6 >= this.field2883 && var2 >> 6 <= this.field2880;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IIII)[I",
      garbageValue = "1844199592"
   )
   @Export("getBorderTileLengths")
   public int[] getBorderTileLengths(int var1, int var2, int var3) {
      if (!this.containsCoord(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field2882 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2883 * 64 - this.regionStartY * 64)};
         return var4;
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(III)Lmg;",
      garbageValue = "1427373477"
   )
   @Export("coord")
   public Coord coord(int var1, int var2) {
      if (!this.containsPosition(var1, var2)) {
         return null;
      } else {
         int var3 = this.regionStartX * 64 - this.field2882 * 64 + var1;
         int var4 = this.regionStartY * 64 - this.field2883 * 64 + var2;
         return new Coord(this.minPlane, var3, var4);
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "52437899"
   )
   @Export("read")
   public void read(Buffer var1) {
      this.minPlane = var1.readUnsignedByte();
      this.planes = var1.readUnsignedByte();
      this.regionStartX = var1.readUnsignedShort();
      this.regionStartY = var1.readUnsignedShort();
      this.regionEndX = var1.readUnsignedShort();
      this.regionEndY = var1.readUnsignedShort();
      this.field2882 = var1.readUnsignedShort();
      this.field2883 = var1.readUnsignedShort();
      this.field2884 = var1.readUnsignedShort();
      this.field2880 = var1.readUnsignedShort();
      this.postRead();
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "73950959"
   )
   @Export("postRead")
   void postRead() {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(JLjava/lang/String;I)I",
      garbageValue = "1554636312"
   )
   static final int method5087(long var0, String var2) {
      Random var3 = new Random();
      Buffer var4 = new Buffer(128);
      Buffer var5 = new Buffer(128);
      int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0};
      var4.writeByte(10);

      int var7;
      for(var7 = 0; var7 < 4; ++var7) {
         var4.writeInt(var3.nextInt());
      }

      var4.writeInt(var6[0]);
      var4.writeInt(var6[1]);
      var4.writeLong(var0);
      var4.writeLong(0L);

      for(var7 = 0; var7 < 4; ++var7) {
         var4.writeInt(var3.nextInt());
      }

      var4.encryptRsa(class72.field890, class72.field891);
      var5.writeByte(10);

      for(var7 = 0; var7 < 3; ++var7) {
         var5.writeInt(var3.nextInt());
      }

      var5.writeLong(var3.nextLong());
      var5.writeLongMedium(var3.nextLong());
      if (Client.randomDatData != null) {
         var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
      } else {
         byte[] var18 = WorldMapCacheName.method5532();
         var5.writeBytes(var18, 0, var18.length);
      }

      var5.writeLong(var3.nextLong());
      var5.encryptRsa(class72.field890, class72.field891);
      var7 = Widget.stringCp1252NullTerminatedByteSize(var2);
      if (var7 % 8 != 0) {
         var7 += 8 - var7 % 8;
      }

      Buffer var8 = new Buffer(var7);
      var8.writeStringCp1252NullTerminated(var2);
      var8.offset = var7;
      var8.xteaEncryptAll(var6);
      Buffer var9 = new Buffer(var8.offset + var5.offset + var4.offset + 5);
      var9.writeByte(2);
      var9.writeByte(var4.offset);
      var9.writeBytes(var4.array, 0, var4.offset);
      var9.writeByte(var5.offset);
      var9.writeBytes(var5.array, 0, var5.offset);
      var9.writeShort(var8.offset);
      var9.writeBytes(var8.array, 0, var8.offset);
      byte[] var11 = var9.array;
      String var10 = Archive.method6690(var11, 0, var11.length);
      String var12 = var10;

      try {
         URL var13 = new URL(Widget.method6509("services", false) + "m=accountappeal/login.ws");
         URLConnection var14 = var13.openConnection();
         var14.setDoInput(true);
         var14.setDoOutput(true);
         var14.setConnectTimeout(5000);
         OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream());
         var15.write("data2=" + class347.method6610(var12) + "&dest=" + class347.method6610("passwordchoice.ws"));
         var15.flush();
         InputStream var16 = var14.getInputStream();
         var9 = new Buffer(new byte[1000]);

         do {
            int var17 = var16.read(var9.array, var9.offset, 1000 - var9.offset);
            if (var17 == -1) {
               var15.close();
               var16.close();
               String var19 = new String(var9.array);
               if (var19.startsWith("OFFLINE")) {
                  return 4;
               } else if (var19.startsWith("WRONG")) {
                  return 7;
               } else if (var19.startsWith("RELOAD")) {
                  return 3;
               } else if (var19.startsWith("Not permitted for social network accounts.")) {
                  return 6;
               } else {
                  var9.xteaDecryptAll(var6);

                  while(var9.offset > 0 && var9.array[var9.offset - 1] == 0) {
                     --var9.offset;
                  }

                  var19 = new String(var9.array, 0, var9.offset);
                  if (ItemComposition.method4020(var19)) {
                     class27.openURL(var19, true, false);
                     return 2;
                  } else {
                     return 5;
                  }
               }
            }

            var9.offset += var17;
         } while(var9.offset < 1000);

         return 5;
      } catch (Throwable var20) {
         var20.printStackTrace();
         return 5;
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1442198375"
   )
   public static boolean method5104() {
      try {
         if (class304.musicPlayerStatus == 2) {
            if (class237.musicTrack == null) {
               class237.musicTrack = MusicTrack.readTrack(UserComparator9.musicTrackArchive, VarbitComposition.musicTrackGroupId, class304.musicTrackFileId);
               if (class237.musicTrack == null) {
                  return false;
               }
            }

            if (class304.soundCache == null) {
               class304.soundCache = new SoundCache(class304.soundEffectsArchive, class304.musicSamplesArchive);
            }

            if (class304.midiPcmStream.method5806(class237.musicTrack, class304.field3396, class304.soundCache)) {
               class304.midiPcmStream.method5739();
               class304.midiPcmStream.setPcmStreamVolume(class304.musicTrackVolume);
               class304.midiPcmStream.setMusicTrack(class237.musicTrack, class132.musicTrackBoolean);
               PriorityQueue var0 = class304.midiPcmStream.field3419;
               if (var0 != null) {
                  if (class304.field3392 != null) {
                     class304.field3392.set(true);
                  }

                  class304.field3392 = new AtomicBoolean(false);
                  AtomicBoolean var1 = class304.field3392;
                  if (class304.field3393 == null) {
                     int var2 = Runtime.getRuntime().availableProcessors();
                     class304.field3393 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class305());
                  }

                  class304.field3393.submit(new class309(var0, var1));
               }

               class304.field3385 = VarbitComposition.musicTrackGroupId;
               class304.field3395 = class304.musicTrackFileId;
               class304.musicPlayerStatus = 0;
               class237.musicTrack = null;
               class304.soundCache = null;
               UserComparator9.musicTrackArchive = null;
               return true;
            }
         }
      } catch (Exception var3) {
         var3.printStackTrace();
         class304.midiPcmStream.clear();
         class304.musicPlayerStatus = 0;
         class237.musicTrack = null;
         class304.soundCache = null;
         UserComparator9.musicTrackArchive = null;
      }

      return false;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZI)I",
      garbageValue = "1770138530"
   )
   static int method5101(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? class53.scriptDotWidget : Interpreter.scriptActiveWidget;
      if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
         if (var3.itemId != -1) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
         } else {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETID) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.childIndex;
         return 1;
      } else if (var0 == 1707) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6359() ? 1 : 0;
         return 1;
      } else if (var0 == 1708) {
         return MenuAction.method2056(var3);
      } else {
         return var0 == 1709 ? class10.method103(var3) : 2;
      }
   }

   @ObfuscatedName("ha")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-367166125"
   )
   @Export("forceDisconnect")
   static final void forceDisconnect(int var0) {
      FriendSystem.logOut();
      switch (var0) {
         case 1:
            class104.method2672();
            break;
         case 2:
            class47.method844();
      }

   }
}
