import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
public final class class285 {
   @ObfuscatedName("v")
   static final HashMap field3324 = new HashMap();
   @ObfuscatedName("ji")
   @ObfuscatedGetter(
      intValue = -826527577
   )
   @Export("cameraYaw")
   static int cameraYaw;

   static {
      java.util.Calendar.getInstance(method5567("Europe/London"));
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;",
      garbageValue = "-1482815227"
   )
   static TimeZone method5567(String var0) {
      synchronized(field3324) {
         TimeZone var2 = (TimeZone)field3324.get(var0);
         if (var2 == null) {
            var2 = TimeZone.getTimeZone(var0);
            field3324.put(var0, var2);
         }

         return var2;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "([BIIB)Ljava/lang/String;",
      garbageValue = "-72"
   )
   public static String method5572(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;
      int var5 = var1;

      int var8;
      for(int var6 = var2 + var1; var5 < var6; var3[var4++] = (char)var8) {
         int var7 = var0[var5++] & 255;
         if (var7 < 128) {
            if (var7 == 0) {
               var8 = 65533;
            } else {
               var8 = var7;
            }
         } else if (var7 < 192) {
            var8 = 65533;
         } else if (var7 < 224) {
            if (var5 < var6 && (var0[var5] & 192) == 128) {
               var8 = (var7 & 31) << 6 | var0[var5++] & 63;
               if (var8 < 128) {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else if (var7 < 240) {
            if (var5 + 1 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128) {
               var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
               if (var8 < 2048) {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else if (var7 < 248) {
            if (var5 + 2 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128 && (var0[var5 + 2] & 192) == 128) {
               var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
               if (var8 >= 65536 && var8 <= 1114111) {
                  var8 = 65533;
               } else {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else {
            var8 = 65533;
         }
      }

      return new String(var3, 0, var4);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;II[BIB)I",
      garbageValue = "93"
   )
   @Export("encodeStringCp1252")
   public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for(int var6 = 0; var6 < var5; ++var6) {
         char var7 = var0.charAt(var6 + var1);
         if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
            var3[var6 + var4] = (byte)var7;
         } else if (var7 == 8364) {
            var3[var6 + var4] = -128;
         } else if (var7 == 8218) {
            var3[var6 + var4] = -126;
         } else if (var7 == 402) {
            var3[var6 + var4] = -125;
         } else if (var7 == 8222) {
            var3[var6 + var4] = -124;
         } else if (var7 == 8230) {
            var3[var6 + var4] = -123;
         } else if (var7 == 8224) {
            var3[var6 + var4] = -122;
         } else if (var7 == 8225) {
            var3[var6 + var4] = -121;
         } else if (var7 == 710) {
            var3[var6 + var4] = -120;
         } else if (var7 == 8240) {
            var3[var6 + var4] = -119;
         } else if (var7 == 352) {
            var3[var6 + var4] = -118;
         } else if (var7 == 8249) {
            var3[var6 + var4] = -117;
         } else if (var7 == 338) {
            var3[var6 + var4] = -116;
         } else if (var7 == 381) {
            var3[var6 + var4] = -114;
         } else if (var7 == 8216) {
            var3[var6 + var4] = -111;
         } else if (var7 == 8217) {
            var3[var6 + var4] = -110;
         } else if (var7 == 8220) {
            var3[var6 + var4] = -109;
         } else if (var7 == 8221) {
            var3[var6 + var4] = -108;
         } else if (var7 == 8226) {
            var3[var6 + var4] = -107;
         } else if (var7 == 8211) {
            var3[var6 + var4] = -106;
         } else if (var7 == 8212) {
            var3[var6 + var4] = -105;
         } else if (var7 == 732) {
            var3[var6 + var4] = -104;
         } else if (var7 == 8482) {
            var3[var6 + var4] = -103;
         } else if (var7 == 353) {
            var3[var6 + var4] = -102;
         } else if (var7 == 8250) {
            var3[var6 + var4] = -101;
         } else if (var7 == 339) {
            var3[var6 + var4] = -100;
         } else if (var7 == 382) {
            var3[var6 + var4] = -98;
         } else if (var7 == 376) {
            var3[var6 + var4] = -97;
         } else {
            var3[var6 + var4] = 63;
         }
      }

      return var5;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lru;II)Z",
      garbageValue = "-1054314314"
   )
   @Export("updateExternalPlayer")
   static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
      int var2 = var0.readBits(2);
      int var3;
      int var4;
      int var7;
      int var8;
      int var9;
      int var10;
      if (var2 == 0) {
         if (var0.readBits(1) != 0) {
            updateExternalPlayer(var0, var1);
         }

         var3 = var0.readBits(13);
         var4 = var0.readBits(13);
         boolean var12 = var0.readBits(1) == 1;
         if (var12) {
            Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
         }

         if (Client.players[var1] != null) {
            throw new RuntimeException();
         } else {
            Player var11 = Client.players[var1] = new Player();
            var11.index = var1;
            if (Players.field1341[var1] != null) {
               var11.read(Players.field1341[var1]);
            }

            var11.orientation = Players.Players_orientations[var1];
            var11.targetIndex = Players.Players_targetIndices[var1];
            var7 = Players.Players_regions[var1];
            var8 = var7 >> 28;
            var9 = var7 >> 14 & 255;
            var10 = var7 & 255;
            var11.pathTraversed[0] = Players.field1340[var1];
            var11.plane = (byte)var8;
            var11.resetPath((var9 << 13) + var3 - ParamComposition.baseX * 64, (var10 << 13) + var4 - Client.baseY * 64);
            var11.field1132 = false;
            return true;
         }
      } else if (var2 == 1) {
         var3 = var0.readBits(2);
         var4 = Players.Players_regions[var1];
         Players.Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28);
         return false;
      } else {
         int var5;
         int var6;
         if (var2 == 2) {
            var3 = var0.readBits(5);
            var4 = var3 >> 3;
            var5 = var3 & 7;
            var6 = Players.Players_regions[var1];
            var7 = (var6 >> 28) + var4 & 3;
            var8 = var6 >> 14 & 255;
            var9 = var6 & 255;
            if (var5 == 0) {
               --var8;
               --var9;
            }

            if (var5 == 1) {
               --var9;
            }

            if (var5 == 2) {
               ++var8;
               --var9;
            }

            if (var5 == 3) {
               --var8;
            }

            if (var5 == 4) {
               ++var8;
            }

            if (var5 == 5) {
               --var8;
               ++var9;
            }

            if (var5 == 6) {
               ++var9;
            }

            if (var5 == 7) {
               ++var8;
               ++var9;
            }

            Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28);
            return false;
         } else {
            var3 = var0.readBits(18);
            var4 = var3 >> 16;
            var5 = var3 >> 8 & 255;
            var6 = var3 & 255;
            var7 = Players.Players_regions[var1];
            var8 = (var7 >> 28) + var4 & 3;
            var9 = var5 + (var7 >> 14) & 255;
            var10 = var7 + var6 & 255;
            Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28);
            return false;
         }
      }
   }

   @ObfuscatedName("jz")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIS)V",
      garbageValue = "20930"
   )
   static final void method5570(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      class290.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, false);
   }
}
